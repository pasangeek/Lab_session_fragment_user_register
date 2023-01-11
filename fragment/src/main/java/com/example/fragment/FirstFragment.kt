package com.example.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first,container,false)



        val etName = view.findViewById<EditText>(R.id.EtPersonName)
        val etEmail = view.findViewById<EditText>(R.id.EtEmail)


        val button = view.findViewById<Button>(R.id.BtnRegister)
        button.setOnClickListener {

            val strName = etName.text.toString()
            val strEmail = etEmail.text.toString()
val bundle = Bundle()
            bundle.putString("data",strName)
            bundle.putString("data2",strEmail)


            when{

                strName.isBlank() -> Toast.makeText(requireActivity(), "please enter a valid name", Toast.LENGTH_SHORT).show()
                strEmail.isBlank() -> Toast.makeText(requireActivity(), "please enter valid e mail", Toast.LENGTH_SHORT).show()

                else -> {


                    val fragment = SecondFragment()
                    fragment.arguments = bundle
                    fragmentManager?.beginTransaction()?.replace(R.id.nav_host,fragment)?.commit()

                }}



        }
        return view

    }


    }




