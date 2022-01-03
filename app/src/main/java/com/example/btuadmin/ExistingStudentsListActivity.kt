package com.example.btuadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class ExistingStudentsListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_existing_students_list)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavView)
        val controller = findNavController(R.id.nav_host_fragment)

        val appBarConfig = AppBarConfiguration(setOf(
            R.id.studentsListFragment,
            R.id.infoFragment

        ))

        setupActionBarWithNavController(controller, appBarConfig)
        bottomNavView.setupWithNavController(controller)
    }
}