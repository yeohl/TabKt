package com.example.myapplication02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication02.databinding.ActivityMainBinding
import com.example.myapplication02.databinding.ActivitySubBinding

//import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setIntent()
    }

    private fun setIntent() {
        binding.btnMoveBack.setOnClickListener{
            finish()
        }
    }
}