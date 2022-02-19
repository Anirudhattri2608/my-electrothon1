package com.example.electrothon4o

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.jar.Attributes

class SteadyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steady)
        val fruit1 = findViewById<Button>(R.id.jf)
        val fruit2 = findViewById<Button>(R.id.aj)
        val fruit3 = findViewById<Button>(R.id.ap)
        val fruit4 = findViewById<Button>(R.id.dd)
        val fruit5 = findViewById<Button>(R.id.bh)
                fruit1.setOnClickListener{
                    val intent = Intent(this, Fruit_1::class.java)
                    startActivity(intent)

    }
}
}