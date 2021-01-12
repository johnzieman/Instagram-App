package com.example.instagramapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationViewExMenu.setTextVisibility(false)
        bottomNavigationViewExMenu.enableItemShiftingMode(false)
        bottomNavigationViewExMenu.enableItemShiftingMode(false)
        bottomNavigationViewExMenu.enableAnimation(false)
        for (i in 0 until bottomNavigationViewExMenu.menu.size()) {
            bottomNavigationViewExMenu.setIconTintList(i, null)
        }
    }
}