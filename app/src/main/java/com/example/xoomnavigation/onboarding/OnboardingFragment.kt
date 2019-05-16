package com.example.xoomnavigation.onboarding


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xoomnavigation.R


class OnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding, container, false)

        view.findViewById<Button>(R.id.onboarding_login_button).setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_to_login)
        }

        view.findViewById<Button>(R.id.onboarding_signup_button).setOnClickListener {
            //findNavController().navigate(R.id.action_chooseLoginFragment_to_payPalLoginFragment)
        }

        return view
    }


}
