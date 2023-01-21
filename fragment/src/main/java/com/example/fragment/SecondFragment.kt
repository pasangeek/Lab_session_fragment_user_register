package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.fragment.databinding.FragmentFirstBinding
import com.example.fragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //val view =inflater.inflate(R.layout.fragment_second, container, false)

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)



       // val textView: TextView = view.findViewById(R.id.textView)
        val args =this.arguments
        val name = args?.get("data")
        val email = args?.get("data2")

        binding.textView.text = name.toString()
        binding.textView.text = email.toString()
        binding.textView.text = "welcome  $name ..!\n your e mail address is : $email"
        return binding.root


    }



}
