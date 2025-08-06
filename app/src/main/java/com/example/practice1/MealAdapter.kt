package com.example.practice1

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.practice1.databinding.ItemMealBinding

class MealAdapter(private val meals : List<Meals>) :
    RecyclerView.Adapter<MealAdapter.MealViewHolder>(){

    inner class MealViewHolder(val binding: ItemMealBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val binding = ItemMealBinding.inflate(LayoutInflater.from(parent.context), parent , false)
        return MealViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MealAdapter.MealViewHolder, position: Int) {
        val meal = meals[position]
        holder.binding.apply {
            tvMealName.text = meal.name
            tvMealDesc.text = meal.description
            ivMeal.setImageResource(meal.image)

            root.setOnClickListener {
                Toast.makeText(root.context, "Clicked: ${meal.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount() = meals.size
}