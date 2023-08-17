package com.example.itensrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.itensrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding
    val iAdapter = ItensListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.recycleItens.adapter = iAdapter
        bind.recycleItens.layoutManager = LinearLayoutManager(this)

        val listaItes = mutableListOf(
            ItemModel(
                "primeiro Item",
                "detalhe mais detalhes sobre o primeiro item da lista",
                false
            ),
            ItemModel(
                "segundo Item",
                "detalhe outro detalhes sobre o segundo item da lista",
                false
            ),
            ItemModel(
                "outro Item",
                "detalhe mais mais detalhes sobre o outro item da lista",
                false
            )

        )

        iAdapter.setList(listaItes)

    }
}