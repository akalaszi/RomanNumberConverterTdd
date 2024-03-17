package org.example

class RomanNumberConverter {
    companion object {
        fun convert(arabic: Int): String {
            var ret = ""
            if (arabic < 4) {
                for (i in 1..arabic) {
                    ret += "I"
                }
            } else if (arabic == 4) {
                ret = "IV"
            } else if (arabic == 5) {
                ret = "V"
            } else if (arabic == 6) {
                ret = "VI"
            } else if (arabic == 7) {
                ret = "VII"
            } else if (arabic == 8) {
                ret = "VIII"
            }

            return ret
        }
    }
}