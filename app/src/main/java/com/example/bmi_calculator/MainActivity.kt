package com.example.bmi_calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmi_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showBtn.setOnClickListener {

            val height = binding.heightET.text.toString().toDouble()/100
            val weight = binding.weightET.text.toString().toDouble()

            val bmi = weight/(height*height)

            binding.bmiTV.text = String.format("BMI is : %.2f",bmi)

            binding.bmiTypeTV.text =  when(bmi){

                in 1.00..18.4 ->"Underweight"
                in 18.5..25.5 ->"Perfect"
                in 25.6..30.50 ->"Over Weight"
                in 30.6..50.50 ->"obesity"

                else -> "He/she is no More"
            }



        }



    }
}