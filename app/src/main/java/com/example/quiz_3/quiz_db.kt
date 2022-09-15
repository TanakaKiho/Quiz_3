package com.example.quiz_3

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


public class quiz_db(private val context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {
    var errMsg = ""

    companion object {
        //データベースファイル名の定数フィールド
        private const val DATABASE_NAME = "quiz_maindb.db"

        //バージョン情報abstract
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
       // val del="drop table quiz_list_table if exits;"
        val sb = StringBuilder()
        var sb2 =""
        val sb3 = StringBuilder()

        //Todoを登録するテーブル
        sb.append("CREATE TABLE quiz_list_table (")
        sb.append("id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , ")
        //sb.append("genre_type TEXT, ")
        //sb.append("genre_num INTEGER, ")
        sb.append("question_image BLOB, ")
        sb.append("answer INTEGER, ")
        sb.append("choice_1 TEXT, ")
        sb.append("choice_2 TEXT, ")
        sb.append("choice_3 TEXT, ")
        sb.append("choice_4 TEXT ")
        sb.append(");")

        //SQLの実行
        val sqlquiz = sb.toString()

        //SQLの実行
        db.execSQL(sqlquiz)

        sb.clear()
        //db.execSQL(del)

        //下の三行がひとつのかたまり

        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('an1', 1, '心臓麻痺','呼吸停止', '脳出血','衰弱死' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime2', 2, '神砂嵐','波紋', '気化冷凍法','赤い荒縄' );  "
        //sqlIns = sb2.toString()
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime3', 1, 'エイジャの赤石','エイダ赤石', 'アレキサンドライト','ダイヤモンド' );  "
        //var sqlIns = sb2.toString()
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime4', 2, 'ザ・ワールド','エンペラー', 'エンプレス','クィーン' );  "
        db.execSQL(sb2)
        sb2="INSERT INTO quiz_list_table (question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES ('anime5', 1, '卵','幼虫', '蛹','成虫' );  "
        db.execSQL(sb2)

        //sb2.append("INSERT INTO quiz_list_table ")
        //sb2.append("(_id, question_image, answer, choice_1, choice_2, choice_3, choice_4) values (")
        //sb2.append("(question_image, answer, choice_1, choice_2, choice_3, choice_4) VALUES (")
        //sb2.append("0, ")
        //sb.append("'スポーツ', ")
        //sb.append("1, ")
        //sb2.append("'sp_1', ")
        //sb2.append("4, ")
        //sb2.append("'1点', ")
        //sb2.append("'2点', ")
        //sb2.append("'3点', ")
        //sb2.append("'5点' ")
        //sb2.append(");")

        //val sqlIns = sb2.toString()

      // db.execSQL(sqlIns)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
    fun fileDelete(){
        context.deleteDatabase("quiz_maindb.db")
    }

    val listQuiz = mutableListOf("1")
    fun getQuizList(num:Int) :List<String> {

        //データベース接続オブジェクトを取得
        val db = this.writableDatabase

        //検索SQLを作成
        val sql = "SELECT * FROM quiz_list_table WHERE id='"+num+"';"
        //val sql = "SELECT * FROM quiz_list_table;"

        //SQLの実行
        val cursor = db.rawQuery(sql, null)

        //カテゴリーのリストを作成
        var todoTitle = ""

        var note=""
        while(cursor.moveToNext()) {
            //IDの列インデックスを取得
            val idxID = cursor.getColumnIndex("id")
            val idxima = cursor.getColumnIndex("question_image")
            val idxans = cursor.getColumnIndex("answer")
            val idxc1 = cursor.getColumnIndex("choice_1")
            val idxc2 = cursor.getColumnIndex("choice_2")
            val idxc3 = cursor.getColumnIndex("choice_3")
            val idxc4 = cursor.getColumnIndex("choice_4")

            //IDの値を取得
            note = cursor.getString(idxID)
            //IDを確保
            listQuiz.add(note);

            note = cursor.getString(idxima)
            listQuiz.add(note);
            note = cursor.getString(idxans)
            listQuiz.add(note);
            note = cursor.getString(idxc1)
            listQuiz.add(note);
            note = cursor.getString(idxc2)
            listQuiz.add(note);
            note = cursor.getString(idxc3)
            listQuiz.add(note);
            note = cursor.getString(idxc4)
            listQuiz.add(note);
            note = cursor.getString(idxima)
            listQuiz.add(note);

        }

        return listQuiz

    }
}

