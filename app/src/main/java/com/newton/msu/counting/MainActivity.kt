package com.newton.msu.counting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.jvm.internal.Intrinsics.Kotlin

class MainActivity : AppCompatActivity() {

    var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun counting(view: View) {
        count++

        val textview = findViewById<TextView>(R.id.textView)
        textview.text = "$count"

        /*This idea came from youtube video by Vlad Voytenko titled
                Tap Counter Demo (button clicks) using Kotlin
        Found at: https://www.youtube.com/watch?v=YOx5qAzTTgg*/
    }
}