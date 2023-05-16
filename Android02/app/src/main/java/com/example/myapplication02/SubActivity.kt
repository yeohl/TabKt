package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val backBtn = findViewById<Button>(R.id.moveBack)
        //버튼 클릭시 액티비티 종료
        backBtn.setOnClickListener {
            finish()
        }
    }
}