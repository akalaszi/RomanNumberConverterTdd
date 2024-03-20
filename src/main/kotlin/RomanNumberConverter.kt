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

        private fun processOneToNine(number: Int): String {
            var a = number
            var ret = ""
            if (a % 5 == 4) {
                ret += "I"
            }

            if (a == 9) {
                ret += "X"
                return ret
            }

            if (a >= 4) {
                ret += "V"
                a -= 5
            }

            for (i in 1..a) {
                ret += "I"
            }
            return ret
        }

        private fun processTenth(number: Int): String {
            var a = number
            var ret = ""
            if (a % 5 == 4) {
                ret += "X"
            }

            if (a == 9) {
                ret += "L"
                return ret
            }

            if (a >= 4) {
                ret += "L"
                a -= 5
            }

            for (i in 1..a) {
                ret += "X"
            }
            return ret
        }

        fun convert(arabic: Int): String {
            val digits = splitToDigits(arabic)
            var ret = ""
            if (digits.size > 1) {
                ret += processTenth(digits[1])
            }
            ret += processOneToNine(digits[0])
            return ret
        }
    }
}