package com.example.quiz_3

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val _helper = quiz_db(this)
        _helper.fileDelete()
        val imageView : ImageView = findViewById(R.id.imageView)
        val buttonFirst : Button = findViewById(R.id.button4)
        val buttonSecond : Button = findViewById(R.id.button8)
        val buttonThird : Button = findViewById(R.id.button9)
        val buttonFourth : Button = findViewById(R.id.button10)
        val count : TextView = findViewById(R.id.countText)
        var ans=""

/*
        var Quiz: IntArray = intArrayOf(0,0,0,0,0,0,0,0,0,0)
        val range=(1..5)
        for(i in 0..9){
            var n=range.random()
            for(k in 0..i){
                if(Quiz[k]==n){
                    n=range.random()
                    k==0
                }else if(k==i){
                    Quiz[k]=n
                    break
                }else{

                }
            }
        }*/

        var num=intent.getStringExtra("num")
        //var n=intent.getIntExtra("num")
        var n:Int=Integer.parseInt(num)
        val Quiz=intent.getIntArrayExtra("quiz")
        var ok=intent.getStringExtra("ok")
        var OK=Integer.parseInt(ok)
        //データを取得する関数
        fun loadQuizList(ID:Int) {

            //Todoリストを取得する
            //val lvTodoList = findViewById<ListView>(R.id.lvTodoList)
            //val ID=num
            //データベースよりTODOのリストを取得する
            val listQuiz = _helper.getQuizList(ID)
            val ima=listQuiz[2]
            ans=listQuiz[3]
            val cho1=listQuiz[4]
            val cho2=listQuiz[5]
            val cho3=listQuiz[6]
            val cho4=listQuiz[7]

            //R.drawable.sp_1
            //val imag="sp_1"
            //アダプタオブジェクト
            // val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, listQuiz)
           // val image="R.drawable."+imag
            var Q=n+1
            imageView.setImageResource(resources.getIdentifier(ima,"drawable",packageName))
            buttonFirst.setText(cho1)
            buttonSecond.setText(cho2)
            buttonThird.setText(cho3)
            buttonFourth.setText(cho4)
            count.text=Q.toString()
        }

        //for (i in 0..9){
            //データをロードする
            //loadQuizList(Quiz[i])
            loadQuizList(Quiz!![n])
        n++
        num=n.toString()
        buttonFirst.setOnClickListener {
            if(ans=="1"){
                OK++
            }else{

            }
            if (n == 10) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            } else {
                //インテントの作成
                val intent = Intent(this, QuizActivity::class.java)
                intent.putExtra("quiz", Quiz)
                intent.putExtra("num", num)

                //遷移先の画面を起動
                startActivity(intent)
            }
        }
        buttonSecond.setOnClickListener {
            if(ans=="2"){
                OK++
            }
            if (n == 10) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            } else {
                //インテントの作成
                val intent = Intent(this, QuizActivity::class.java)
                intent.putExtra("quiz", Quiz)
                intent.putExtra("num", num)
                //遷移先の画面を起動
                startActivity(intent)
            }
        }
        buttonThird.setOnClickListener {
            if(ans=="3"){
                OK++
            }
            if (n == 10) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            } else {
                //インテントの作成
                val intent = Intent(this, QuizActivity::class.java)
                intent.putExtra("quiz", Quiz)
                intent.putExtra("num", num)
                //遷移先の画面を起動
                startActivity(intent)
            }
        }
        buttonFourth.setOnClickListener {
            if(ans=="4"){
                OK++
            }
            if (n == 10) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            } else {
                //インテントの作成
                val intent = Intent(this, QuizActivity::class.java)
                intent.putExtra("quiz", Quiz)
                intent.putExtra("num", num)
                //遷移先の画面を起動
                startActivity(intent)
            }
        }


                //loadQuizList(54)
                /*
                AlertDialog.Builder(this)
                       // .setTitle("")
                        .setMessage("正解")
                        .setPositiveButton("OK") { dialog, which ->
                            loadQuizList(54)
                        }
                        .show()*/
            /*
            if(i!=10) continue

            if(i==10) break
        }*/


        fun onDestroy() {
            //ヘルパーオブジェクトの開放
            _helper.close()

            super.onDestroy()
        }


        //val genreText : TextView = findViewById(com.example.quiz_3.R.id.genreText)

        //val genre = intent.getStringExtra("VALUE")
        //genreText.text = "${genre}"
        val modoruButton : Button = findViewById(R.id.modoruButton)
        modoruButton.setOnClickListener {
            //インテントの作成
            val intent = Intent(this, MainActivity::class.java)
            //遷移先の画面を起動
            startActivity(intent)
        }
    }


}