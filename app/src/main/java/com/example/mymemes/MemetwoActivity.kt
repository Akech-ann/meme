package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemetwoActivity : AppCompatActivity() {
    lateinit var btnnext: TextView
    lateinit var btnPrev: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memetwo)
        btnnext = findViewById(R.id.btnNext)
        btnnext.setOnClickListener {
            val intent = Intent(this, MemethreeActivity::class.java)
            startActivity(intent)
        }
        btnPrev = findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent = Intent(this, MemeoneActivity::class.java)
            startActivity(intent)
        }
    }
}