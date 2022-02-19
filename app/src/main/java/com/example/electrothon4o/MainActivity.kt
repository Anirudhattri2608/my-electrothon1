package com.example.electrothon4o

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.username)
        val submitButton = findViewById<Button>(R.id.submit)
        val dispMessage = findViewById<TextView>(R.id.response)
        submitButton.setOnClickListener{
            dispMessage.setText("Welcome"+Name.text+"!")
            val intent = Intent(this, SteadyActivity::class.java)
                startActivity(intent)
            }
        }
    }