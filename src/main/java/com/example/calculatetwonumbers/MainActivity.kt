package com.example.calculatetwonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //References to all IDS
        val num1 = findViewById<EditText>(R.id.input_1)
        val num2 = findViewById<EditText>(R.id.input_2)
        val total = findViewById<EditText>(R.id.Total_input)
        val btn1 = findViewById<Button>(R.id.Ok_Btn)
        val btn2 = findViewById<Button>(R.id.btn_cancel)

        val num3 = findViewById<EditText>(R.id.input_3)
        val num4 = findViewById<EditText>(R.id.input_4)
        val total2 = findViewById<EditText>(R.id.Total_input2)
        val btn3 = findViewById<Button>(R.id.Ok_Btn2)
        val btn4 = findViewById<Button>(R.id.btn_cancel2)


        btn1.setOnClickListener{
            val val1 = num1.text.toString().toInt() //to convert text to integer
            val val2 = num2.text.toString().toInt()

            val result = val1 + val2

            total.setText(result.toString())
        }

        btn2.setOnClickListener{
            num1.setText("")
            num2.setText("")
            total.setText("")
        }

        btn3.setOnClickListener{
            val val3 = num3.text.toString().toInt() //to convert text to integer
            val val4 = num4.text.toString().toInt()

            val result = val3 + val4

            total2.setText(result.toString())
        }

        btn4.setOnClickListener{
            num3.setText("")
            num4.setText("")
            total2.setText("")
        }

    }
}