package com.example.ciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate chamado")

        findViewById<Button>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() { super.onStart(); Log.i("MainActivity", "onStart chamado") }
    override fun onResume() { super.onResume(); Log.i("MainActivity", "onResume chamado") }
    override fun onPause() { super.onPause(); Log.i("MainActivity", "onPause chamado") }
    override fun onStop() { super.onStop(); Log.i("MainActivity", "onStop chamado") }
    override fun onRestart() { super.onRestart(); Log.i("MainActivity", "onRestart chamado") }
    override fun onDestroy() { super.onDestroy(); Log.i("MainActivity", "onDestroy chamado") }
}