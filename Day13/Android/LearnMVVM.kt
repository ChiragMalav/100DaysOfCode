//VIEW - Main Activity
package com.example.learnmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.learnmvvm.R
import com.example.learnmvvm.databinding.ActivityMainBinding
import com.example.learnmvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.btnCalculate.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.etNum2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calculateSum(num1,num2)
            binding.tvAns.text = "${result.sum}"
        }
    }
}



//MODEL - data
data class CalculatorData(
    val num1 : Int,
    val num2 : Int,
    val sum : Int
)



//VIEWMODEL
package com.example.learnmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.learnmvvm.model.CalculatorData

class CalculatorViewModel : ViewModel() {
    fun calculateSum(num1 : Int , num2 : Int) : CalculatorData{
        val sum = num1+num2
        return CalculatorData(num1,num2,sum)
    }
}
