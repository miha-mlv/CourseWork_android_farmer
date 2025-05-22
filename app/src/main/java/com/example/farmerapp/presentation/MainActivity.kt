package com.example.farmerapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.farmerapp.databinding.ActivityMainBinding
import com.example.farmerapp.presentation.buyer.AppActivity
import com.example.farmerapp.presentation.buyer.EntranceActivity

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setBtnClickListener()
    }


    private fun setBtnClickListener() {
        binding.btnForBuyer.setOnClickListener {
            startActivity(EntranceActivity.getNewIntent(this))
        }

        binding.btnForFarmer.setOnClickListener {
            TODO()
        }
    }

}