package org.example

class RomanNumberConverter {
    companion object {
        fun convert(arabic: Int): String {
            if (arabic == 4) {
                return "IV"
            }
            var ret = ""
            var a = arabic

            if (a >= 5) {
                ret = "V"
                a -= 5
            }
            for (i in 1..a) {
                ret += "I"
            }

            return ret
        }
    }
}