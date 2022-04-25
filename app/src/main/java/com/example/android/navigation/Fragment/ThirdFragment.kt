package com.example.android.navigation.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.android.navigation.R

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val btnNext: Button = view.findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val firstName: EditText = view.findViewById(R.id.edtFirstName)
            val firstUserName = firstName.text.toString()

            val lastName: EditText = view.findViewById(R.id.edtLastName)
            val userLastName = lastName.text.toString()

            val email: EditText = view.findViewById(R.id.edtMail)
            val emailId = email.text.toString()

            val phone: EditText = view.findViewById(R.id.edtPhone)
            val userPhone = phone.text.toString()

            val city: EditText = view.findViewById(R.id.edtPhone)
            val userCity = city.text.toString()
            val password: EditText = view.findViewById(R.id.edtPassword)
            val userPassword = password.text.toString()

            if (userPassword.length == 8 && userPhone.length == 10) {
                val fourthFragment = FourthFragment()
                fragmentManager?.beginTransaction()?.replace(R.id.container, fourthFragment)
                    ?.commit()
            }
        }
        return view
    }
}