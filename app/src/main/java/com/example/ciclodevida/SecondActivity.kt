package com.example.ciclodevida

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("SecondActivity", "onCreate chamado")

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish() // volta para a MainActivity
        }
    }

    override fun onStart() { super.onStart(); Log.i("SecondActivity", "onStart chamado") }
    override fun onResume() { super.onResume(); Log.i("SecondActivity", "onResume chamado") }
    override fun onPause() { super.onPause(); Log.i("SecondActivity", "onPause chamado") }
    override fun onStop() { super.onStop(); Log.i("SecondActivity", "onStop chamado") }
    override fun onRestart() { super.onRestart(); Log.i("SecondActivity", "onRestart chamado") }
    override fun onDestroy() { super.onDestroy(); Log.i("SecondActivity", "onDestroy chamado") }
}
