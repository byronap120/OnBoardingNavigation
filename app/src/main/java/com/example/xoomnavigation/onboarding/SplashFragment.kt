package com.example.xoomnavigation.onboarding


import android.os.Bundle
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
                findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
                //findNavController().navigate(R.id.action_splashFragment_to_my_recipients)
            }
        }


    }
}
