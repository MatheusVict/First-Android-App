package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get elementeViewByiD And do whatever
        val name = findViewById<TextView>(R.id.swCharchest)
        /*name.text = "mudou?"*/

        val inputChoose = findViewById<EditText>(R.id.inputText)
        val btnSubmit = findViewById<Button>(R.id.btn)

        // When button is clicked
        btnSubmit.setOnClickListener {
            if(inputChoose.text.toString().isEmpty()) {
               inputChoose.error = getString(R.string.app_name)
            } else {
                name.text = "olá ${inputChoose.text}"
            }
        }
    }
}