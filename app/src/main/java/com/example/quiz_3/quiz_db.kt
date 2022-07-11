package com.example.quiz_3

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper



public class quiz_db(context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION){
    var errMsg = ""
    companion object {
        //データベースファイル名の定数フィールド
        private const val DATABASE_NAME = "quiz_maindb.db"
        //バージョン情報abstract
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        val sb = StringBuilder()

        //Todoを登録するテーブル
        sb.append("CREATE TABLE quiz_list_table (")
        sb.append("id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , ")
        sb.append("genre_type TEXT, ")
        sb.append("genre_num INTEGER, ")
        sb.append("question_image BLOB, ")
        sb.append("answer INTEGER, ")
        sb.append("choice_1 TEXT, ")
        sb.append("choice_2 TEXT, ")
        sb.append("choice_3 TEXT, ")
        sb.append("choice_4 TEXT, ")
        sb.append(");")

        //SQLの実行
        val sqlquiz = sb.toString()

        //SQLの実行
        db.execSQL(sqlquiz)

        sb.clear()
        sb.append("INSERT INTO categories ")
        sb.append("(_id, genre_type, genre_num, question_image, answer, choice_1, choice_2, choice_3, choice_4) values (")
        sb.append("0, ")
        sb.append("'スポーツ', ")
        sb.append("1, ")
        sb.append("'sp_1.png', ")
        sb.append("4, ")
        sb.append("'1点', ")
        sb.append("'2点', ")
        sb.append("'3点', ")
        sb.append("'5点', ")
        sb.append(");")

        val sqlIns = sb.toString()

        db.execSQL(sqlIns)
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}
