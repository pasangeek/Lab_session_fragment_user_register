package com.example.userRegisterLabSession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.userregistersamplelabpracticle.R
import com.example.userregistersamplelabpracticle.databinding.ActivityMainBinding
import com.example.userregistersamplelabpracticle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivitySecondBinding =  DataBindingUtil.setContentView(this,R.layout.activity_second)

        val name = intent.extras?.getString("name")
        val email = intent.extras?.getString("email")

       // val strName = findViewById<TextView>(R.id.textView)


  binding.textView.text = "welcome$name ..!\n your e mail address is : $email"


    }
}