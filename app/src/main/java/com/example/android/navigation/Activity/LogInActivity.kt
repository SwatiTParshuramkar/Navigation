package com.example.android.navigation.Activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android.navigation.MainActivity
import com.example.android.navigation.Model.Constent
import com.example.android.navigation.R
import com.google.android.material.textfield.TextInputEditText

class LogInActivity : AppCompatActivity() {
    lateinit var  sharedPreferences: SharedPreferences

    lateinit var emailEdtText :TextInputEditText
    lateinit var passwordEdtText :TextInputEditText
    lateinit var btnLogIn : Button
    lateinit var userEmail :String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        initViews()
    }
    private fun initViews(){

        sharedPreferences = this.getSharedPreferences(Constent.sharedPrefName, Context.MODE_PRIVATE)
//
//        userEmail = sharedPreferences.getString("UserMial","").toString()
//
//        if(userEmail != null){
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
        emailEdtText = findViewById(R.id.emailInput)
        passwordEdtText = findViewById(R.id.passwordInput)
        btnLogIn = findViewById(R.id.btnLogIn)

        btnLogIn.setOnClickListener {
            val userEmail = emailEdtText.text.toString()
            val userPassword = passwordEdtText.text.toString()


            val editor = sharedPreferences.edit()

            editor.putString("UserMail",userEmail)
            editor.putString("UserPassword",userPassword)
            editor.apply()

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}