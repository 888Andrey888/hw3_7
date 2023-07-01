package com.example.hw3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw3_7.databinding.ItemPersBinding

class PersAdapter
        (
            val list: ArrayList<PersModel>,
            val onClickItem: (pers: PersModel) -> Unit
        ): Adapter<PersAdapter.ViewHolder>() {

    inner class ViewHolder(private var binding: ItemPersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() = with(binding) {
            val pers = list[adapterPosition]
            pers.apply {
                imgCharacter.loadImage(pers.imageUrl)
                tvName.text = pers.name
                tvState.text = pers.state
                itemView.setOnClickListener {
                    onClickItem(pers)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}