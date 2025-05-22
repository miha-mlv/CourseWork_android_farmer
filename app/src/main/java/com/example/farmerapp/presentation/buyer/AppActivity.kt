package com.example.farmerapp.presentation.buyer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.farmerapp.R
import com.example.farmerapp.databinding.ActivityAppBinding

class AppActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityAppBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavView.setOnItemSelectedListener { item ->
            if(navController.currentDestination?.id != item.itemId){
                when(item.itemId){
                    R.id.main -> { navController.navigate(R.id.mainFragment)}
                }

            }
        }

    }


    companion object {

        fun getNewIntent(context: Context): Intent {
            return Intent(context, AppActivity::class.java)
        }
    }
}