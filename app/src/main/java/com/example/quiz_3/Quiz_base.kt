package com.example.quiz_3

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class Quiz_base : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder().allowWritesOnUiThread(true).build()
        Realm.setDefaultConfiguration(config)
    }
}