package com.example.itensrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.itensrecyclerview.databinding.ListItemViewBinding

class ItensListAdapter : RecyclerView.Adapter<ItensListAdapter.ItensListHolder>() {

    private val listaItens: MutableList<ItemModel> = mutableListOf()

    class ItensListHolder(val itemListView: ListItemViewBinding) :
        RecyclerView.ViewHolder(itemListView.root) {
        fun bind(item: ItemModel){
            itemListView.txtTituloItem.text = item.titulo
            itemListView.txtDetalhe.text = item.detalhe
            if (item.detailVisibility){
                itemListView.detailView.visibility = View.VISIBLE
            }else{
                itemListView.detailView.visibility = View.GONE
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItensListHolder {
        return ItensListHolder(
            ListItemViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listaItens.size
    }

    override fun onBindViewHolder(holder: ItensListHolder, position: Int) {
        holder.bind(listaItens[position])
        holder.itemListView.CardViewItem.setOnClickListener {
            listaItens[position].detailVisibility = !listaItens[position].detailVisibility
            notifyItemChanged(position)
        }
    }

    fun setList(itens:MutableList<ItemModel>){
        listaItens.clear()
        listaItens.addAll(itens)
        notifyDataSetChanged()
    }
}