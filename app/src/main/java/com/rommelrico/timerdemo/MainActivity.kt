package com.rommelrico.timerdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Using a Handler and a Runnable.
        /*
        val myHandler = Handler()
        val run = object: Runnable {

            override fun run() {
                Log.i("Hey it's us!", "A second passed by")
                myHandler.postDelayed(this, 1000)
            }

        }
        myHandler.post(run)
         */

        // Using a CountDown Timer.
        object: CountDownTimer(10000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                Log.i("Seconds Left!", (millisUntilFinished / 1000).toString())
            }

            override fun onFinish() {
                Log.i("We're done!", "No more countdown")
            }
        }.start()

    }
}
