package com.example.m4shr0.todolist

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.m4shr0.todolist.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.completeBtn.setOnClickListener { _ ->
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.cancelBtn.setOnClickListener { _ ->
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}