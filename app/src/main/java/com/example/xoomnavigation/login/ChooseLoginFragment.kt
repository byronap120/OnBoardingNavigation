package com.example.xoomnavigation.login


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xoomnavigation.R

class ChooseLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_choose_login, container, false)

        view.findViewById<Button>(R.id.login_xoom_button).setOnClickListener {
            findNavController().navigate(R.id.action_chooseLoginFragment_to_xoomLoginFragment)
        }

        view.findViewById<Button>(R.id.login_paypal_button).setOnClickListener {
            findNavController().navigate(R.id.action_chooseLoginFragment_to_payPalLoginFragment)
        }

        return view
    }


}
