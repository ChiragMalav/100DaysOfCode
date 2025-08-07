package com.example.firebaseauth

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firebaseauth.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        val currentUser = auth.currentUser

        if(currentUser == null){
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }

        binding.welcomeText.text = "Welcome! Hurraahhhh!!"

        binding.btnLogOut.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }

    }
}