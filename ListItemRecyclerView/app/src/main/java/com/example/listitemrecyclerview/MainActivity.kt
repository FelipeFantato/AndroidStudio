package com.example.listitemrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listitemrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding
    val itensAdapter = ItemListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.itensRecycler.layoutManager = LinearLayoutManager(this)
        bind.itensRecycler.adapter = itensAdapter
        itensAdapter.setItens(
            mutableListOf(ItemModel("Item A"
                , "Detalhe AAAA Detalhe AAAA Detalhe AAAA"
                , false),
                ItemModel("Item B"
                    , "Detalhe BBBBB Detalhe BBBB Detalhe BBBB"
                    , false)

            )
        )

    }
}