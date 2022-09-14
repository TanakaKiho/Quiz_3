package com.example.quiz_3

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val _helper = quiz_db(this)
        val imageView : ImageView = findViewById(com.example.quiz_3.R.id.imageView)
        val buttonFirst : Button = findViewById(com.example.quiz_3.R.id.button4)
        val buttonSecond : Button = findViewById(com.example.quiz_3.R.id.button8)
        val buttonThird : Button = findViewById(com.example.quiz_3.R.id.button9)
        val buttonFourth : Button = findViewById(com.example.quiz_3.R.id.button10)

        //データを取得する関数
        fun loadQuizList() {

            //Todoリストを取得する
            //val lvTodoList = findViewById<ListView>(R.id.lvTodoList)
            var ID=""
            //データベースよりTODOのリストを取得する
            val listQuiz = _helper.getQuizList(1)
            val ima=listQuiz[2]
            val ans=listQuiz[3]
            val cho1=listQuiz[4]
            val cho2=listQuiz[5]
            val cho3=listQuiz[6]
            val cho4=listQuiz[7]

            //R.drawable.sp_1
            val imag="sp_1"
            //アダプタオブジェクト
            // val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, listQuiz)
            val image="R.drawable."+imag
            imageView.setImageResource(resources.getIdentifier(imag,"drawable",packageName))
            buttonFirst.setText(cho1)
            buttonSecond.setText(cho2)
            buttonThird.setText(cho3)
            buttonFourth.setText(cho4)
        }

        //データをロードする
        loadQuizList()

        fun onDestroy() {
            //ヘルパーオブジェクトの開放
            _helper.close()

            super.onDestroy()
        }


        //val genreText : TextView = findViewById(com.example.quiz_3.R.id.genreText)

        //val genre = intent.getStringExtra("VALUE")
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