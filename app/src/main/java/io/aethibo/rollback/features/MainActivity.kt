package io.aethibo.rollback.features

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.aethibo.rollback.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Rollback)
        setContentView(R.layout.activity_main)
    }
}