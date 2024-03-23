package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDivide = findViewById(R.id.btn_divide)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTV = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_subtract ->{
                result = a-b
            }
            R.id.btn_multiply ->{
                result = a*b
            }
            R.id.btn_divide ->{
                result = a/b
            }
        }
        resultTV.text = "Result is $result"
    }
}