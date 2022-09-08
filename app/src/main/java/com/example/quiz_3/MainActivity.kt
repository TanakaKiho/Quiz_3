package com.example.quiz_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.quiz_3.R.layout.activity_main)

        //Viewの取得
        val genreEnter : Button = findViewById(com.example.quiz_3.R.id.GenreEnter)
        genreEnter.setOnClickListener {
            //インテントの作成
            val intent = Intent(this, QuizActivity::class.java)
            //遷移先の画面を起動
            startActivity(intent)
        }

       // val spinner: Spinner = findViewById(com.example.quiz_3.R.id.spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        /*
        ArrayAdapter.createFromResource(
                this,
                com.example.quiz_3.R.array.planets_array,
                R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
        genreEnter.setOnClickListener {
            //インテントの作成
            val intent = Intent(this, QuizActivity::class.java)
            //データをセット
            //val editText = findViewById<View>(R.id.editText) as EditText
            //intent.putExtra("sendText", editText.text.toString())

            // Spinnerオブジェクトを取得
            //val spinner = findViewById<View>(R.id.spinner) as Spinner

            // 選択されているアイテムのIndexを取得
            val idx = spinner.selectedItemPosition

            // 選択されているアイテムを取得
            val item = spinner.selectedItem as String

            intent.putExtra("VALUE", item.toString())
            //遷移先の画面を起動
            startActivity(intent)
        }*/
    }
}