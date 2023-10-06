package com.sample.html

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val plane = findViewById<AppCompatTextView>(R.id.plane)
        val rich = findViewById<AppCompatTextView>(R.id.rich)

        plane.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, PlaneFragment(), PlaneFragment::class.java.name)
                .addToBackStack(PlaneFragment::class.java.name)
                .commit()
        }

        rich.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, RichFragment(), RichFragment::class.java.name)
                .addToBackStack(RichFragment::class.java.name)
                .commit()
        }
    }
}