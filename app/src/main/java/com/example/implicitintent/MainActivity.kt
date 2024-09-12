package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton=findViewById<CardView>(R.id.web)
        val cameraButton=findViewById<CardView>(R.id.camera)

        webButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://github.com/TheAnikDhiman"))
            startActivity(intent)
        }
        cameraButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}