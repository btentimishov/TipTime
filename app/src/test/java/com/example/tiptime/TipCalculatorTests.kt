package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat
//import org.junit.Assert.*

class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val amount = 10.00
        val tipPercent = 20.00

        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)

    }
}