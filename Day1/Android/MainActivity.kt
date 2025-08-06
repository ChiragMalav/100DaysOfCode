package com.example.practice1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.practice1.databinding.ActivityMainBinding

class gitMainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val meals = listOf(
            Meals("Paneer Butter Masala" , "Tasty Paneer dish" , R.drawable.ic_launcher_background),
            Meals("Pasta" , "Tasty Pasta dish" , R.drawable.ic_launcher_background),
            Meals("Maggie" , "Tasty Maggie dish" , R.drawable.ic_launcher_background)
        )

        val adapter = MealAdapter(meals)
        binding.rvMeals.layoutManager = LinearLayoutManager(this)
        binding.rvMeals.adapter = adapter
    }
}