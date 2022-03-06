package com.example.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA:Button = findViewById(R.id.btnA);
        val btnB:Button = findViewById(R.id.btnB);

        btnA.setOnClickListener(){
            val intentA:Intent = Intent(this, LoginActivity::class.java)

            intentA.putExtra("name", "John")

            startActivity(intentA)
        }

        btnB.setOnClickListener(){
            val intentB:Intent = Intent(Intent.ACTION_SENDTO)

            intentB.data = Uri.parse("mailto:minghaoyo81@gmail.com")

            startActivity(intentB)
        }

    }
}