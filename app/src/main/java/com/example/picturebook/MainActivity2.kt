package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    lateinit var btnNextPage: Button
    lateinit var btnPage1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castViews()
        clickNext()
        clickPrevious()
    }
    fun castViews(){
        btnNextPage=findViewById<Button>(R.id.btnPage3)
        btnPage1=findViewById<Button>(R.id.btnPage1)
    }



    fun clickNext(){
        btnNextPage=findViewById(R.id.btnPage3 )
        btnNextPage.setOnClickListener{
            var intent=Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
        fun clickPrevious() {
            btnPage1=findViewById<Button>(R.id.btnPage1)
            btnPage1.setOnClickListener{
               var intent=Intent(baseContext,MainActivity::class.java)
               startActivity(intent)

           }
        }
    }
