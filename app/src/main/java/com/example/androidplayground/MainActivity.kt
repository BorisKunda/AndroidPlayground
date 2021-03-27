package com.example.androidplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bkCoroutineContext: CoroutineContext = Dispatchers.Default

        val bkCoroutineScope: CoroutineScope = CoroutineScope(context = bkCoroutineContext)



        val job: Job = bkCoroutineScope.launch(block = { -> })

    }
}