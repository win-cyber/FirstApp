package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtnumone=findViewById<EditText>(R.id.edt_num_one)
        val edtnumtwo=findViewById<EditText>(R.id.edt_num_two)

        val btnsum=findViewById<Button>(R.id.btn_sum)
        val btnsub=findViewById<Button>(R.id.btn_sub)
        val btndiv=findViewById<Button>(R.id.btn_div)
        val btnmult=findViewById<Button>(R.id.btn_mult)

        val txtname=findViewById<TextView>(R.id.txt_name)
        val txtresult:TextView=findViewById(R.id.txt_result)


        btnsum.setOnClickListener {
            var num1:Int=edtnumone.text.toString().toInt()
            var num2:Int=edtnumtwo.text.toString().toInt()

            var result=num1+num2
            txtname.text="SUM="
            txtresult.text=result.toString()
        }
        btnsub.setOnClickListener {
            var num1:Int=edtnumone.text.toString().toInt()
            var num2:Int=edtnumtwo.text.toString().toInt()

            var result=num1-num2
            txtname.text="SUB="
            txtresult.text=result.toString()
        }
        btndiv.setOnClickListener {
            var num1:Int=edtnumone.text.toString().toInt()
            var num2:Int=edtnumtwo.text.toString().toInt()

            var result=num1/num2
            txtname.text="DIV="
            txtresult.text=result.toString()
        }
        btnmult.setOnClickListener {
            var num1:Int=edtnumone.text.toString().toInt()
            var num2:Int=edtnumtwo.text.toString().toInt()

            var result=num1*num2
            txtname.text="MULT="
            txtresult.text=result.toString()
        }


    }
}
