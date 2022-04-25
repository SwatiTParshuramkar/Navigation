package com.example.android.navigation.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.android.navigation.R

class FourthFragment : Fragment() {

//    lateinit var edtLaneOne: EditText
//    lateinit var edtLaneTwo: EditText
//    lateinit var edtLocality: EditText
//    lateinit var edtPinCode: EditText
//    lateinit var edtCity: EditText
//    lateinit var edtState: EditText
//    lateinit var edtCountry: EditText
//
//    lateinit var btnClick: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        val btnClick : Button = view.findViewById(R.id.btClick)
        btnClick.setOnClickListener {
            val fragment = FirstFragment()
            fragmentManager?.beginTransaction()?.replace(R.id.container, fragment)?.commit()

        }
        return view

    }
}