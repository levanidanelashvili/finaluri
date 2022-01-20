package com.example.myapplicationbottomnavigationmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)
        val navView = findViewById<BottomNavigationView>(R.id.bottomNavigationView1)

        val controller = findNavController(R.id.nav_host_fragment)

        val appBarConfig = AppBarConfiguration(
            setOf(
                R.id.cudifragmenti,
                R.id.fragmenti


            )

        )
        setupActionBarWithNavController(controller, appBarConfig)
        navView.setupWithNavController(controller)

    }
}