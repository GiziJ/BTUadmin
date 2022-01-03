package com.example.btuadmin

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btuadmin.databinding.ActivityAddNewStudentsBinding

class AddNewStudentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNewStudentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewStudentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.buttonSave.setOnClickListener{

        }
    }
}