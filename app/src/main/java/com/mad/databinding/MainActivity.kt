package com.mad.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.mad.databinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var aPerson = Person("Ali", "1233456", "ali@gmail.com", "123Jalan ali")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.person = aPerson
//        binding.Person = aPerson


        binding.btnUpdate.setOnClickListener() {
            aPerson.email = "abc@gmail.com"
        }

    }
}