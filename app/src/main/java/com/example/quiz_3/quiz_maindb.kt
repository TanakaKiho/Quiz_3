package com.example.quiz_3

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class quiz_maindb : RealmObject(){
    @PrimaryKey
    var id: Long = 0
    var genre_type: String = ""
    var genre_num: Int = 0
    var question_image: ByteArray? = null
    var answer: Int = 0
    var choice_1: String = ""
    var choice_2: String = ""
    var choice_3: String = ""
    var choice_4: String = ""
}
