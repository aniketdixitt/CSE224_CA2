package com.example.cse224_ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    lateinit var rgb:RadioGroup
    lateinit var bt:Button
    lateinit var cb:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rgb=findViewById(R.id.grbp)
        bt=findViewById(R.id.button)
        cb=findViewById(R.id.checkBox)

        cb.setOnClickListener{
            if(cb.isChecked)
            {
                Toast.makeText(applicationContext, "You have agreed with terms and conditions!", Toast.LENGTH_SHORT).show()
            }
        }

        bt.setOnClickListener{
            val idd:Int=rgb.checkedRadioButtonId
            val rb=findViewById<RadioButton>(idd)
            Toast.makeText(applicationContext, "Your selected : "+rb?.text, Toast.LENGTH_SHORT).show()
        }


    }
}