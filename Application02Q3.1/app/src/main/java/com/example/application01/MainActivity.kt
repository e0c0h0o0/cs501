package com.example.application01


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var sayHelloButton: Button
    private lateinit var textMessage: TextView // Declare the textMessage variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayHelloButton = findViewById(R.id.true_button)
        textMessage = findViewById(R.id.textMessage) // Initialize the textMessage variable

        sayHelloButton.setOnClickListener { view: View ->
            Snackbar.make(view, "Hello World", Snackbar.LENGTH_LONG).show()
        }
    }
}
