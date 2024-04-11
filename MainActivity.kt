package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            //Declaring the views
            val exitTextNumber = findViewById<EditText>(R.id.ageNumber)
            val btnGenerate = findViewById<Button>(R.id.btnGenerate)
            val btnCancel = findViewById<Button>(R.id.btnClear)
            val txtResult = findViewById<TextView>(R.id.txtResult)
            btnGenerate.setOnClickListener {
                val age = ageNumber.toString.to
                if (age != null) {
                    val result = when (age) {
                        in 0..12 -> "Child"
                        in 13..19 -> "Teenager"
                        in 20..35 -> "Young Adult"
                        in 36..40 -> "Adult"
                        in 41..50 -> "Adult at 40"
                        in 51..60 -> "Adult at 50"
                        else -> "Senior"
                    }
                    txtResult.text = "Age: $age\n${
                        when (result) {
                            "None" -> "No rap legend died in this age group"
                            "Lil Snupe" -> "You're in the same age group as Lil Snupe"
                            "Tupac Shukar" -> "You're in the same age group as Tupac Shukar"
                            "Nipsey Hussel" -> "You're in the same age group as Nipsey Hussel"
                            "DMX" -> "You're in the same age group as DMX"
                            "Nate Dogg" -> "You're in the same age group as Nate Dogg"
                            else -> "You not on any rap legends age group"
                        }
                    }"
                } else {
                    txtResult.text = "Please enter a valid age."
                }
            }

            btnCancel.setOnClickListener {
                ageNumber.text.clear()
                txtResult.text = ""
            }
        }
    }










