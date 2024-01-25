package com.example.application01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var sayHelloButton: Button
    private lateinit var textMessage: TextView // Declare the textMessage variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayHelloButton = findViewById(R.id.true_button)
        textMessage = findViewById(R.id.textMessage) // Initialize the textMessage variable

        sayHelloButton.setOnClickListener { view: View ->
            textMessage.text = "Hello World"
        }
    }
}
