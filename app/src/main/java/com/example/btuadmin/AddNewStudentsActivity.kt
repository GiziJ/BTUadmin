package com.example.btuadmin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.btuadmin.databinding.ActivityAddNewStudentsBinding

class AddNewStudentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNewStudentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNewStudentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        saveInfo()

    }
    //ახალი სტუდენტსი დამატება
    private fun saveInfo(){
        binding.buttonSave.setOnClickListener{
            val studentID = binding.editTextID.text.toString()
            val studentName = binding.editTextStudentsName.text.toString()
            val studentsEmail = binding.editTextStudentsEmail.text.toString()
            val studentDate = binding.editTextDate.text.toString()
            val studentAddress = binding.editTextLegalAddress.text.toString()

            if (studentID.isEmpty() || studentName.isEmpty() || studentsEmail.isEmpty() || studentDate.isEmpty() || studentAddress.isEmpty()){
                Toast.makeText(this, "შეავსეთ მონაცემები", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                Toast.makeText(this, "ახალი სტუენტი დამატებულია", Toast.LENGTH_SHORT).show()
                binding.editTextID.text.clear()
                binding.editTextStudentsName.text.clear()
                binding.editTextStudentsEmail.text.clear()
                binding.editTextDate.text.clear()
                binding.editTextLegalAddress.text.clear()
                startActivity(Intent(this, ExistingStudentsListActivity::class.java))
                return@setOnClickListener
            }
        }
    }
}