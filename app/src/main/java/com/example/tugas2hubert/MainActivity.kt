package com.example.tugas2hubert

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2hubert.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonsignin.setOnClickListener {
            val intentMain = Intent(this, MiddleActivity::class.java)
            startActivity(intentMain)
        }
        binding.textsignup.setOnClickListener {
            val intentMain = Intent(this, MainActivity2::class.java)
            startActivity(intentMain)
        }
        binding.textforgetpw.setOnClickListener {
            val intentMain = Intent(this, MainActivity3::class.java)
            startActivity(intentMain)
        }
    }
}