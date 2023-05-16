package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import android.content.Intent
import android.widget.Button
import com.example.myapplication02.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setIntent()

    }

    private fun setIntent() {
        binding.btnOutside.setOnClickListener{
            startActivity(Intent(this, SubActivity::class.java))
        }
    }
}

/* 원래 있던 함수
fun onClick(v: View?) {

            //val textView = findViewById<TextView>(R.id.textView)

            if (v != null) {
                when (v.id) {
                    R.id.imageButton -> {
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("제목")
                        builder.setMessage("이미지버튼 클릭")
                        builder.show()

                        //textView.text ="이미지버튼 클릭"
                    }
                }
            }
        }
 */