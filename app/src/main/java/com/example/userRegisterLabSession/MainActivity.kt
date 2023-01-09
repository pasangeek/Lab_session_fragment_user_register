package com.example.userRegisterLabSession

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.userregistersamplelabpracticle.R

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.EtPersonName)
        val etEmail = findViewById<EditText>(R.id.EtEmail)

        button = findViewById(R.id.BtnRegister)
        button.setOnClickListener {

            val strName = etName.text.toString()
            val strEmail = etEmail.text.toString()

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