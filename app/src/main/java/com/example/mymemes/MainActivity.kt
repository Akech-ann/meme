package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnnext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext = findViewById(R.id.btnNext)
        btnnext.setOnClickListener {
            val intent=Intent(this,MemeoneActivity::class.java)
            startActivity(intent)
        }
    }
}

