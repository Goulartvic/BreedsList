package com.tanheta.breeds

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tanheta.breeds.databinding.BreedItemBinding

class BreedsAdapter(var items: List<Breed>) : RecyclerView.Adapter<BreedsAdapter.ViewHolder>(), AdapterItemContract {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: BreedItemBinding = BreedItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    companion object {
        fun newInstance(items: List<Breed>): BreedsAdapter {
            val adapter = BreedsAdapter(items)
            return adapter
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun replaceItems(list: List<*>) {
        this.items = items as List<Breed>
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: BreedItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(breed: Breed) {
            binding.breed = breed
            binding.executePendingBindings()
        }
    }
}