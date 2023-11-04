package com.example.testbasics

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class TaxTest {

    private lateinit var tax: Tax

    @Before
    fun setup(){
        tax = Tax()
    }
    @Test
    fun calculateTaxTest(){
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest(){
    val netIncome = tax.calculateIncome(200.0,0.2)
    assertThat(netIncome).isEqualTo(160)

    }
}