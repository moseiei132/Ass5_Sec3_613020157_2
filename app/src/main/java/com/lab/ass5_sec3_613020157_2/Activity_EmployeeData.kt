package com.lab.ass5_sec3_613020157_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity__employee_data.*

class Activity_EmployeeData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__employee_data)

        var data = intent.extras
        var newEmp = data?.getParcelable<Employee>("EmpData")
        nameText.text = "Name : ${newEmp?.Name}"
        GenderText.text = "Gender : ${newEmp?.Gender}"
        EmailText.text = "E-mail : ${newEmp?.Email}"
        SalaryText.text = "Salary : ${newEmp?.Salary} Baht"
    }

    fun onClickClose(view: View) {
        finish()
    }
}