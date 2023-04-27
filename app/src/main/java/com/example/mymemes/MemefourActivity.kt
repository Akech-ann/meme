package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemefourActivity : AppCompatActivity() {
    lateinit var btnPrev: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour2)
        btnPrev = findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent = Intent(this, MemethreeActivity::class.java)
            startActivity(intent)
        }
    }
}