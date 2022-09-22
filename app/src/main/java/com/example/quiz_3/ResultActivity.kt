package com.example.quiz_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Viewの取得
        val backbutton : Button = findViewById(R.id.backbutton)
        val clear :TextView=findViewById(R.id.Hit)

        var ok=intent.getStringExtra("ok")

        clear.text=ok

        //ボタンを押したら次の画面へ
        backbutton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}