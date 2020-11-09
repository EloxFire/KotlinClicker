package com.example.kotlinclickertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ktls = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clicker.setOnClickListener {
            println("test")
            add()
            counter.text = ktls.toString()
        }
    }

    public fun add() {
        ktls += 1
        println(ktls)
    }
}
