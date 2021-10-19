package com.benkkstudio.bsopenadsexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.benkkstudio.bsopenads.BSOpenAds

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        val blockedActivityList: ArrayList<Class<*>> = arrayListOf(MainActivity2::class.java) //masukan activity yang tidak ingin keluar open ads
        BSOpenAds(App.instance, "ca-app-pub-3940256099942544/3419835294", blockedActivityList){
            App.toast("openads showing")
        } // hapus callback jika tidak ingin langsung show ads
    }
}