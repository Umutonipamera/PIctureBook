package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btnNextPage:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        castViews()
        clickNext()
    }
//    fun castViews() {
//    }
    fun clickNext(){
        btnNextPage = findViewById(R.id.btnNextPage)
        btnNextPage.setOnClickListener{
          var intent= Intent(baseContext,MainActivity2::class.java)
          startActivity(intent)

       }
    }


}