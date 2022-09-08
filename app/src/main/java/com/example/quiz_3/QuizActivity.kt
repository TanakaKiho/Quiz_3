package com.example.quiz_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        //val genreText : TextView = findViewById(com.example.quiz_3.R.id.genreText)

        val genre = intent.getStringExtra("VALUE")
        //genreText.text = "${genre}"
        val modoruButton : Button = findViewById(com.example.quiz_3.R.id.modoruButton)
        modoruButton.setOnClickListener {
            //インテントの作成
            val intent = Intent(this, MainActivity::class.java)
            //遷移先の画面を起動
            startActivity(intent)
        }
    }
}