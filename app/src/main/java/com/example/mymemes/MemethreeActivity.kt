package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemethreeActivity : AppCompatActivity() {
    lateinit var btnnext: TextView
    lateinit var btnPrev: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        btnnext = findViewById(R.id.btnNext)
        btnnext.setOnClickListener {
            val intent = Intent(this, MemefourActivity::class.java)
            startActivity(intent)
        }
        btnPrev = findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent = Intent(this, MemetwoActivity::class.java)
            startActivity(intent)
        }
    }
}