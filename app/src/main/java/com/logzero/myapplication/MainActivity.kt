package com.logzero.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Using Viewmodel data not losing
        val model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val number = model.randomNumber()
        text.setText(number)

    }
}
