package com.example.ciclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val LOG_TAG = "CICLO_VIDA"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(LOG_TAG, "--> OnCreate ${this.lifecycle.currentState}")

        val edtTxtNome = findViewById<EditText>(R.id.editNome)
        val btnOla = findViewById<Button>(R.id.btnOla)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnOla.setOnClickListener {
            txtResultado.text = validarNome(edtTxtNome)
        }

    }

    private fun validarNome(edtTxtNome: EditText) : String{
        return if (edtTxtNome.text.isEmpty()) {
            edtTxtNome.error = "Digite um nome"
            ""
        } else {
            "Olá ${edtTxtNome.text}"
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG, "--> OnStart ${this.lifecycle.currentState}")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "--> onResume ${this.lifecycle.currentState}")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "--> onPause ${this.lifecycle.currentState}")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "--> onStop ${this.lifecycle.currentState}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LOG_TAG, "--> onRestart ${this.lifecycle.currentState}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG, "--> onDestroy ${this.lifecycle.currentState}")
    }
}