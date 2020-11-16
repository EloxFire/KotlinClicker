package com.example.kotlinclickertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {

    var upIf = 0
    var upWhile = 0
    var upAuto = 0
    var ktls:Float = 0f
    var kpc = 1
    var kps:Float = 1f

    val mainHandler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clicker.setOnClickListener {
            println("test")
            add()
            counter.text = ktls.toString()
        }

        totalKPC.text = "[KPC] Kotlins par click : " + kpc
        totalKPS.text = "[KPS] Kotlins par secondes : " + kps

        upgrade1.setOnClickListener{
            multiplierTwo()
            totalKPC.text = "[KPC] Kotlins par click : " + kpc
        }

        upgrade2.setOnClickListener{
            multiplierFour()
            totalKPC.text = "[KPC] Kotlins par click : " + kpc
        }

        upgrade3.setOnClickListener{
            increaseKPS()
            totalKPS.text = "[KPS] Kotlins par seconde : " + kps
        }

        mainHandler.post(object : Runnable {
            override fun run() {
                ktls += kps
                counter.text = ktls.roundToInt().toString()
                mainHandler.postDelayed(this, 1000)
            }
        })

    }

    public fun add() {
        ktls += kpc
        println(ktls)
    }

    public fun multiplierTwo(){
        if(ktls >= 10){
            ktls -= 10
            kpc = kpc*2
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
            kpc = kpc*4
            counter.text = ktls.toString()
            upWhile += 1
            nbrWhile.text = upWhile.toString()
        }else{
            return
        }
    }

    public fun increaseKPS(){
        if(ktls >= 40){
            ktls -= 40
            kps += kps*0.5f
            upAuto += 1
            nbr_ai.text = upAuto.toString()
        }else{
            return
        }
    }


}
