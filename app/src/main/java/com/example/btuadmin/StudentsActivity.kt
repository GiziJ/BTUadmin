package com.example.btuadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.btuadmin.databinding.ActivityStudentsBinding

class StudentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStudentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.buttonAddNewStudents.setOnClickListener {
            val intent = Intent(this, AddNewStudentsActivity::class.java)
            startActivity(intent)
        }
        binding.buttonExistingStudents.setOnClickListener {
            val intent = Intent(this, ExistingStudentsListActivity::class.java)
            startActivity(intent)
        }
    }
}