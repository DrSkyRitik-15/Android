package com.example.myapplicationday1

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
       override fun onStart() {
            super.onStart()
            val toast=Toast.makeText(applicationContext,   "onStart Called",Toast.LENGTH_LONG)
            toast.show()
        }

        override fun onRestart() {
            super.onRestart()
            val toast=Toast.makeText(this,"onRestart Called",Toast.LENGTH_SHORT)
            toast.show()
        }
        override fun onPause() {
            super.onPause()
            val toast=Toast.makeText(applicationContext,"onPause Called",Toast.LENGTH_LONG)
            toast.show()
        }
        override fun onResume() {
            super.onResume()
            val toast=Toast.makeText(applicationContext,"onResume Called",Toast.LENGTH_LONG)
            toast.show()
        }
        override fun onStop() {
            super.onStop()
            val toast=Toast.makeText(applicationContext,"onStop Called",Toast.LENGTH_LONG)
            toast.show()
            Log.d("MainActivity","onStop Called")

        }


    }
