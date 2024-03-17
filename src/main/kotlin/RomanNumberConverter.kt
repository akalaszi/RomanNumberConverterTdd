package org.example

class RomanNumberConverter {
    companion object {
        fun convert(arabic: Int): String {

            var ret = ""
            var a = arabic

            if (a == 40) {
                return "XL"
            }

            while (a >= 10) {
                ret += "X"
                a -= 10
            }

            if (a % 5 == 4) {
                ret += "I"
            }

            if (a == 9) {
                ret += "X"
                return ret
            }

            if (a >= 5 || a == 4) {
                ret += "V"
                a -= 5
            }

            for (i in 1..a) {
                ret += "I"
            }

            return ret
        }
    }
}