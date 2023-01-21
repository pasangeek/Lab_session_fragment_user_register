package com.example.userRegisterLabSession

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.userregistersamplelabpracticle.R
import com.example.userregistersamplelabpracticle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val binding : ActivityMainBinding =  DataBindingUtil.setContentView(this,R.layout.activity_main)

        //val etName = findViewById<EditText>(R.id.EtPersonName)
       // val etEmail = findViewById<EditText>(R.id.EtEmail)

       // button = findViewById(R.id.BtnRegister)
       binding.BtnRegister.setOnClickListener {

            val strName = binding.EtPersonName.text.toString()
            val strEmail = binding.EtEmail.text.toString()

            when{

                strName.isBlank() -> Toast.makeText(this, "please enter a valid name", Toast.LENGTH_SHORT).show()
                strEmail.isBlank() -> Toast.makeText(this, "please enter valid e mail", Toast.LENGTH_SHORT).show()

                else -> {

                    var intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("name",strName)
                    intent.putExtra("email",strEmail)
                    startActivity(intent)

                }}


        }
}}