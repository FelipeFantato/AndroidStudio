package com.example.calculara_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtVisor = findViewById<TextView>(R.id.textView2)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btnEq = findViewById<Button>(R.id.btnEquals)

        var valor = 0

        btn2.setOnClickListener {
            valor += 2
            txtVisor.text = valor.toString()
        }
    }
}