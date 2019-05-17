package com.example.xoomnavigation.onboarding


import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xoomnavigation.R
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onResume() {
        super.onResume()
        CoroutineScope(Dispatchers.IO).launch {
            delay(TimeUnit.SECONDS.toMillis(1))
            withContext(Dispatchers.Main) {
                decideWhereToGo()
            }
        }
    }

    private fun decideWhereToGo() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)
        val authenticatedUser = sharedPreferences.getBoolean(getString(R.string.authenticated_user), false)
        val loginWithXoom = sharedPreferences.getBoolean(getString(R.string.login_with_xoom), false)
        val loginWithPayPal = sharedPreferences.getBoolean(getString(R.string.login_with_paypal), false)

        if (authenticatedUser) {
            findNavController().navigate(R.id.homeActivity)
            requireActivity().finish()
        } else if (loginWithXoom || loginWithPayPal) {
            findNavController().navigate(R.id.action_splashFragment_to_login_nav)
        } else {
            findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
        }
    }
}
