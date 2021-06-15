package com.saifi369.coroutinesexample

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.saifi369.coroutinesexample.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import java.math.BigInteger
import kotlin.random.Random

const val TAG = "MyTag"
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //set app theme
        setTheme(R.style.Theme_CoroutinesExample)
        setContentView(binding.root)

        binding.btnRunCode.setOnClickListener {

            CoroutineScope(Dispatchers.Main.immediate).launch {
                Log.d(TAG, "onCreate: ${Thread.currentThread().name}")
                delay(1000)
                Log.d(TAG, "onCreate: ${Thread.currentThread().name}")
                delay(1000)
                Log.d(TAG, "onCreate: ${Thread.currentThread().name}")
            }


        }
    }
}