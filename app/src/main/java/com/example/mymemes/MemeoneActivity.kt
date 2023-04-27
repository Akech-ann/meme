package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MemeoneActivity : AppCompatActivity() {
    lateinit var btnnext:TextView
    lateinit var btnPrev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memeone)
        btnnext = findViewById(R.id.btnNext)
        btnnext.setOnClickListener {
            val intent=Intent(this,MemetwoActivity::class.java)
            startActivity(intent)
        }
        btnPrev=findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        }

}

// lateinit var tvlogin:TextView
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        tvlogin = findViewById(R.id.tvlogin)
//        tvlogin.setOnClickListener {
//            val intent = Intent(this,LoginActivity::class.java)
//            startActivity(intent)
//        }
//    }
//}