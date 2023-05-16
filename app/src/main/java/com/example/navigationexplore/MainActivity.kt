package com.example.navigationexplore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.navigationexplore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        navController = Navigation.findNavController(this, R.id.navFragment)

        NavigationUI.setupWithNavController(bind.navView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, bind.root)

    }

    override fun onSupportNavigateUp(): Boolean = NavigationUI.navigateUp(navController, bind.root)
}