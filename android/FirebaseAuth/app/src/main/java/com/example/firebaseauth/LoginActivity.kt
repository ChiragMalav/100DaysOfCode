package com.example.firebaseauth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebaseauth.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Fill Entries",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            auth.signInWithEmailAndPassword(email,password)
                .addOnSuccessListener {
                    Toast.makeText(this,"User Signed-in Successfully",Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                }
                .addOnFailureListener { e->
                    Toast.makeText(this,"Error : ${e.message}",Toast.LENGTH_SHORT).show()
                }
        }

        binding.dontHaveAnAccount.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
            finish()
        }
    }
}