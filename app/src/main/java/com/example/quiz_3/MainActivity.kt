package com.example.quiz_3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Viewの取得
        val GenreEnter : Button = findViewById(R.id.GenreEnter)
        val spinner: Spinner = findViewById(R.id.spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
                this,
                R.array.planets_array,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
        GenreEnter.setOnClickListener {
            //インテントの作成
            val intent = Intent(this, QuizActivity::class.java)
            //データをセット
            //val editText = findViewById<View>(R.id.editText) as EditText
            //intent.putExtra("sendText", editText.text.toString())
            //遷移先の画面を起動
            startActivity(intent)
        }
    }
}