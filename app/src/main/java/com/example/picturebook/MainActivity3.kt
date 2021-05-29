package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var btnNext: Button
    lateinit var btnPrevPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        castViews()
        clickNext()
        clickPrevious()
    }

    fun castViews() {
        btnNext = findViewById<Button>(R.id.btnNext)
        btnPrevPage = findViewById<Button>(R.id.btnPrevPage)
    }

    fun clickNext() {
        btnNext.setOnClickListener {
            var intent = Intent(baseContext, MainActivity4::class.java)
            startActivity(intent)
        }
    }
        fun clickPrevious() {
            btnPrevPage.setOnClickListener {
                var intent = Intent(baseContext, MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
