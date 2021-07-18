package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.editTextTextPersonName)
        name.hint = "Name: "
        val surname = findViewById<EditText>(R.id.editTextTextPersonName2)
        surname.hint = "Surname: "

        val button : Button = findViewById (R.id.button)
        button.setOnClickListener{
            Toast.makeText(
                applicationContext,
                name.text.toString() + " " + surname.text.toString() + " " + "Hoş geldiniz!",
                Toast.LENGTH_SHORT
            ).show()
    }
}
    }