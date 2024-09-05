package com.Emirkanmaz.superherodictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.Emirkanmaz.superherodictionary.databinding.ActivityMainBinding
import com.Emirkanmaz.superherodictionary.databinding.SuperheroRecyclerRowBinding

class SuperheroAdapter(val superheroList:List<Superhero>): RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>() {
    class SuperheroViewHolder(val binding: SuperheroRecyclerRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val binding = SuperheroRecyclerRowBinding.inflate(LayoutInflater.from(parent.context))

        return SuperheroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return superheroList.size
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.binding.textViewRecyclerView.text = superheroList[position].name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, SuperheroDetailActivity::class.java)
            intent.putExtra("hero", superheroList[position])
            holder.itemView.context.startActivity(intent)
        }
    }


}