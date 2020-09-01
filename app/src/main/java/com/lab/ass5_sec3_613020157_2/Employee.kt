package com.lab.ass5_sec3_613020157_2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee (val Name: String = "", val Gender: String = "", val Email: String = "", val Salary: String = ""): Parcelable