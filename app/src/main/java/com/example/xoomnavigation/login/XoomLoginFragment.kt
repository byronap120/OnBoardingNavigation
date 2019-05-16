package com.example.xoomnavigation.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.xoomnavigation.R


class XoomLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_xoom_login, container, false)

        view.findViewById<Button>(R.id.paypal_login_button).setOnClickListener {
            findNavController().navigate(
                R.id.action_xoomLoginFragment_to_my_recipients,
                null,
                NavOptions.Builder()
                    .setPopUpTo(
                        R.id.onboardingFragment,
                        true
                    ).build()
            )
        }

        return view
    }

}
