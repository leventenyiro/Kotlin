package com.leventenyiro.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btnNext.setOnClickListener {
            intent = Intent(this, Main2Activity::class.java)
            startActivity(intent);
            finish()
            //Toast.makeText(applicationContext, "Valami", Toast.LENGTH_SHORT).show()
        }

        val szoveg = text.text.toString()

        val valami = "A textview szövege: $szoveg"
    }

    fun init() {
        // VAL => variable final (read only)
        // VAR => variable
    }

    fun szoveg():String {
        return "szoveg";
    }
}
