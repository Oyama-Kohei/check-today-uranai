package com.example.check_today

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val s = arrayOf("大凶", "凶", "吉", "大吉")
    fun onButton(v: View) {
        val r = Random().nextInt(4)
        tv.text = s[r]
    }

}