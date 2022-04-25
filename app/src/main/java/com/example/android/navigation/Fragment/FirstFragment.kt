package com.example.android.navigation.Fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.navigation.Model.Constent
import com.example.android.navigation.R

class FirstFragment : Fragment() {
//    lateinit var userName: EditText
//    lateinit var password: EditText
//
//    lateinit var btnClick: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPreferences = requireActivity().getSharedPreferences(Constent.sharedPrefName, Context.MODE_PRIVATE)

        val tvResult = view.findViewById<TextView>(R.id.tvMessage)
        val userEmail = sharedPreferences.getString("UserMail","")
        tvResult.text = userEmail

        //Create variable for spinner.
        val spinner = view.findViewById<Spinner>(R.id.spinner)

        val city = resources.getStringArray(R.array.city)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, city)
        spinner.adapter = adapter

        spinner?.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                val cityName = city[position].toString()
                Log.e("FirstFragment",cityName )
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
    }
}






//        userName = view.findViewById(R.id.edtName)
//        password = view.findViewById(R.id.edtPassword)
//
//        btnClick = view.findViewById(R.id.btnclick)

//        btnClick.setOnClickListener {
//            val userName = userName.text.toString()
//            val password = password.text.toString()
//
//            val bundle = Bundle()
//            bundle.putString("userName", userName)
//            bundle.putString("password", password)
//
//            if (password.length == 10) {
//                val secondFragment = SecondFragment()
//                secondFragment.arguments = bundle
//                fragmentManager?.beginTransaction()?.replace(R.id.container, secondFragment)
//                    ?.commit()
//
//            }
//        }
//    }
//}

