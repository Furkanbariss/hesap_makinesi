package com.furkanbaris.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1 : Int?=null
    val number2 : Int?=null
    var result: Int?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun plus(view: View){
        val number1= editTextNumber.text.toString().toIntOrNull()
        val number2= editTextNumber2.text.toString().toIntOrNull()

        if (number1==null || number2==null){
        resultView.text="Hata!"
        }else{

        val result= number1 + number2
            resultView.text="Sonuç= $result"
        }

       // resultView.text="Sonuç= $result"
    }
    fun minus(view: View){
        val number1= editTextNumber.text.toString().toIntOrNull()
        val number2= editTextNumber2.text.toString().toIntOrNull()

        if (number1==null || number2==null){
            resultView.text="Hata!"
        }else{

            val result= number1 - number2
            resultView.text="Sonuç= $result"}

    }
    fun divide(view: View){
        val number1= editTextNumber.text.toString().toIntOrNull()
        val number2= editTextNumber2.text.toString().toIntOrNull()

        if (number1==null || number2==null){
            resultView.text="Hata!"
        }else{

            val result= number1 / number2
            resultView.text="Sonuç= $result"}
    }
    fun multiplication(view: View){
        val number1= editTextNumber.text.toString().toIntOrNull()
        val number2= editTextNumber2.text.toString().toIntOrNull()

        if (number1==null || number2==null){
            resultView.text="Hata!"
        }else{

            val result= number1 * number2
            resultView.text="Sonuç= $result"}
    }
    fun button55(view: View){
        val date2="20/11/2022"
        textView2.text="$date2"
    }



}