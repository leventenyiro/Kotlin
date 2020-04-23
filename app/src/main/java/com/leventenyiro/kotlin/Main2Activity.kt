package com.leventenyiro.kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnBack.setOnClickListener {
            val intent = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}