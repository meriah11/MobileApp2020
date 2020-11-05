package com.example.lab7_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addName(view: View) {
        val addingNameText = findViewById<TextView>(R.id.textMessage)
        val nameChange = findViewById<EditText>(R.id.editName)
        val name = nameChange.text

        addingNameText.setText("The name the CU Mascot should have is..." + name)

        val image = findViewById<ImageView>(R.id.imageView2)
        image.setImageResource(R.drawable.cuboulderlogo)
    }
}