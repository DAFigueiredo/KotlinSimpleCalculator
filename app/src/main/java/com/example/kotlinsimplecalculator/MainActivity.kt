package com.example.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var diogo2 = 2 // comment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {

        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a + b
        diogo2 = 3

        resultView.text = "Result: $result"

    }

    fun sub(view: View) {

        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a - b

        resultView.text = "Result: $result"

    }

    fun multi(view: View) {

        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a * b

        resultView.text = "Result: $result"

    }

    fun div(view: View) {

        val a = number1.text.toString().toInt()
        val b = number2.text.toString().toInt()

        val result = a / b

        resultView.text = "Result: $result"

    }

//    fun test() {
//
//        var asd = 2
//        var hjk = 2
//
//        if (asd != 3) {
//            kotlin.io.print("success")
//
//            var jkl = 2
//        }
//
//
//    }

}