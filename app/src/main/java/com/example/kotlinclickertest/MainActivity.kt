package com.example.kotlinclickertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var upIf = 0
    var upWhile = 0
    var upAuto = 0
    var ktls = 0
    var kps = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clicker.setOnClickListener {
            println("test")
            add()
            counter.text = ktls.toString()
        }

        upgrade1.setOnClickListener{
            multiplierTwo()
        }

        upgrade2.setOnClickListener{
            multiplierFour()
        }

    }

    public fun add() {
        ktls += kps
        println(ktls)
    }

    public fun multiplierTwo(){
        if(ktls >= 10){
            ktls -= 10
            kps = kps*2
            counter.text = ktls.toString()
            upIf += 1
            nbrIf.text = upIf.toString()
        }else{
            return
        }
    }

    public fun multiplierFour(){
        if(ktls >= 40){
            ktls -= 40
            kps = kps*4
            counter.text = ktls.toString()
            upWhile += 1
            nbrWhile.text = upWhile.toString()
        }else{
            return
        }
    }

    public fun kotlinPerSecondOne(){
        if(ktls >= 40){
            ktls -= 40
            kps = kps*4
            counter.text = ktls.toString()
        }else{
            return
        }
    }


}
