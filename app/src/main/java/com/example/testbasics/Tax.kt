package com.example.testbasics

class Tax {

    fun calculateTax(grossIncome: Double, taxRate: Double): Double {
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double): Double{
        return grossIncome - (grossIncome * taxRate)
    }
}