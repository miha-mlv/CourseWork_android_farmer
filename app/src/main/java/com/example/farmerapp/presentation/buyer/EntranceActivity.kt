package com.example.farmerapp.presentation.buyer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.farmerapp.R
import com.example.farmerapp.databinding.ActivityEntranceBinding

class EntranceActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityEntranceBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnEntrance.setOnClickListener {
            startActivity(AppActivity.getNewIntent(this))
        }
    }


    companion object{

        fun getNewIntent(context: Context): Intent {
            return Intent(context, EntranceActivity::class.java)
        }
    }
}