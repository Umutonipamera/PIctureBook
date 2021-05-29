package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    lateinit var btnNextP:Button
    lateinit var btnPrev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        castViews()
        clickNext()
        clickPrevious()
    }
    fun castViews() {

       btnNextP= findViewById<Button>(R.id.btnNextP)
        btnPrev=findViewById<Button>(R.id.btnPrev)
    }
    fun clickNext() {
        btnNextP.setOnClickListener {
            var intent = Intent(baseContext, MainActivity5::class.java)
            startActivity(intent)
        }
    }
        fun clickPrevious(){
            btnPrev.setOnClickListener {
                var intent=Intent(baseContext,MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }
