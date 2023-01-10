package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second, container, false)
//        val name = intent.extras?.getString("name")
//        val email = intent.extras?.getString("email")
val view =inflater.inflate(R.layout.fragment_second, container, false)
        val textView: TextView = view.findViewById(R.id.textView)
        val args =this.arguments
        val inputData = args?.get("data")
        val inputData2 = args?.get("data2")

            textView.text = inputData.toString()
        textView.text = inputData2.toString()

        return view


    }



}