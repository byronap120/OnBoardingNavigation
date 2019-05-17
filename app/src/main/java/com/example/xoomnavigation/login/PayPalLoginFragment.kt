package com.example.xoomnavigation.login


import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xoomnavigation.R

class PayPalLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pay_pal_login, container, false)

        view.findViewById<Button>(R.id.paypal_login_button).setOnClickListener {
            updateUserPreferences()
            findNavController().navigate(R.id.homeActivity2)
            requireActivity().finish()
        }

        return view
    }

    private fun updateUserPreferences() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)
        with(sharedPreferences.edit()) {
            putBoolean(getString(R.string.authenticated_user), true)
            putBoolean(getString(R.string.login_with_paypal), true)
            apply()
        }
    }

}
