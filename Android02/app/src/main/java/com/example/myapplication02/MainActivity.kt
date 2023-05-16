package com.example.myapplication02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import android.content.Intent
import android.widget.Button

//import kotlinx.android.synthetic.main.activity_main.*

abstract class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intent 를 활용해서 액티비티 이동하기
        val intent = Intent(this, MainActivity::class.java)
        //버튼 지정 약버튼
        val imageBtn = findViewById<ImageButton>(R.id.imageButton)
        imageBtn.setOnClickListener(this) //현재클래스의 instance를 넣어준다.
        //클릭리스너
        imageBtn.setOnClickListener {
            //액티비티 이동
            startActivity(intent)

            //버튼 지정 외출버튼
            val outButton = findViewById<Button>(R.id.button3)
            //클릭리스너
            imageBtn.setOnClickListener {
                //액티비티 이동
                startActivity(intent)
            }


        }


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

    }
}