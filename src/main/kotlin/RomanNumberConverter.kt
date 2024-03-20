package org.example

class RomanNumberConverter {
    companion object {

        fun splitToDigits(number: Int): List<Int> {
            var tmp = number
            val digits: MutableList<Int> = ArrayList()
            while (tmp >= 1) {
                digits.add(tmp % 10)
                tmp /= 10
            }
            return digits
        }

        private fun process(number: Int, numerals: Numerals): String {
            var a = number
            var ret = ""
            if (a % 5 == 4) {
                ret += numerals.one
            }

            if (a == 9) {
                ret += numerals.ten
                return ret
            }

            if (a >= 4) {
                ret += numerals.five
                a -= 5
            }

            for (i in 1..a) {
                ret += numerals.one
            }
            return ret
        }


        fun convert(arabic: Int): String {
            val ones = Numerals("I", "V", "X")
            val tens = Numerals("X", "L", "C")
            val hundreds = Numerals("C", "D", "M")
            val posToNumerals = mapOf(0 to ones, 1 to tens, 2 to hundreds)
            val digits = splitToDigits(arabic)
            var ret = ""
            for (i in digits.size-1  downTo 0) {
                ret += process(digits[i], posToNumerals[i]!!)
            }
            return ret
        }

        data class Numerals(val one: String, val five: String, val ten: String)
    }
}