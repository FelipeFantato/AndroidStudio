package com.example.estilos_strings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(ThemeStorage.currentTheme)
        setContentView(R.layout.activity_main)

        val lyric2 = findViewById<TextView>(R.id.txtLyric2)

        lyric2.text = getText(R.string.lyric2)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            ThemeStorage.swichThema()
            recreate()
        }

        val switch = findViewById<Switch>(R.id.switch1)

        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            else
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        }

    }

}