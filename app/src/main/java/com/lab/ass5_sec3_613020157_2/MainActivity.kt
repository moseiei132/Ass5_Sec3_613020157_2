package com.lab.ass5_sec3_613020157_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun reset(view: View) {
        name.text.clear()
        radioGroup.clearCheck()
        email.text.clear()
        salary.text.clear()
    }

    fun showData(view: View) {
        val selectID :Int = radioGroup.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked : RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        }catch (t: Throwable){
            gender = ""
        }
        val intent = Intent(this, Activity_EmployeeData::class.java)
        intent.putExtra("EmpData", Employee(name.text.toString(), gender.toString(), email.text.toString(), salary.text.toString()))
        startActivity(intent)
    }
}