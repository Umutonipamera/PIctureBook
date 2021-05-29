package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnPage:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        castViews()
        clickPrevious()
    }
    fun castViews(){
        btnPage=findViewById<Button>(R.id.btnPage)
    }
    fun clickPrevious(){
        btnPage.setOnClickListener{
            var intent=Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)
        }
    }
}