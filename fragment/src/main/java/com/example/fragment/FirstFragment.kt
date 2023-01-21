package com.example.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

   // private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // val view = inflater.inflate(R.layout.fragment_first,container,false)
       // val binding : ActivityMainBinding =  DataBindingUtil.setContentView(this,R.layout.activity_main)
val binding = FragmentFirstBinding.inflate(inflater,container,false)

       // val etName = view.findViewById<EditText>(R.id.EtPersonName)
       // val etEmail = view.findViewById<EditText>(R.id.EtEmail)


      //  val button = view.findViewById<Button>(R.id.BtnRegister)
       binding.BtnRegister.setOnClickListener {

            val strName = binding.EtPersonName.text.toString()
            val strEmail = binding.EtEmail.text.toString()
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
        return binding.root

    }


}




