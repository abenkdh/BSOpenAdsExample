package com.benkkstudio.bsopenadsexample;

import android.app.Application
import android.util.Log
import android.widget.Toast

class App : Application() {
    companion object {
        lateinit var instance: App

        fun log(any: Any) {
            Log.e("ABENK : ", " $any")
        }

        fun toast(any: Any) {
            Toast.makeText(instance.applicationContext, " $any", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}