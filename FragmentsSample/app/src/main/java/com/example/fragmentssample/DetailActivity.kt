package com.example.fragmentssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentssample.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var bind: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

        val fragToLoad = intent.getStringExtra("FragToLoad")

        when (fragToLoad) {
            "A" -> {
                val fragManager = supportFragmentManager
                val fragTransaction = fragManager.beginTransaction()
                fragTransaction.add(R.id.detail, DetailFragmentA())
                fragTransaction.commit()
            }
            "B" -> {
                val fragManager = supportFragmentManager
                val fragTransaction = fragManager.beginTransaction()
                fragTransaction.add(R.id.detail, DetailFragmentB())
                fragTransaction.commit()
            }
            "C" -> {
                val fragManager = supportFragmentManager
                val fragTransaction = fragManager.beginTransaction()
                fragTransaction.add(R.id.detail, DetailFragmentC())
                fragTransaction.commit()
            }
        }

    }
}