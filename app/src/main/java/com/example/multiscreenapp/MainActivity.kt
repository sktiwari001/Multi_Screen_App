package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Creating a global key....
    companion object{
        const val KEY="com.example.multiScreen.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val ordersPlaced=eT1.text.toString() + " \n" + eT2.text.toString() + "\n " + eT3.text.toString() + "\n" +  eT4.text.toString()


            intent=Intent(this, Order::class.java)
            intent.putExtra(KEY,ordersPlaced)
            startActivity(intent)
        }

    }
}