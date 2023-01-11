package com.example.userRegisterLabSession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.userregistersamplelabpracticle.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("name")
        val email = intent.extras?.getString("email")

        val strName = findViewById<TextView>(R.id.textView)


        strName.text = "welcome$name ..!\n your e mail address is : $email"


    }
}