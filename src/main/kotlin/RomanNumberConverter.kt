package org.example

class RomanNumberConverter {
    companion object {
        fun convert(arabic: Int): String {
            var ret = ""
            for (i in 1..arabic) {
                ret += "I"
            }
            return ret
        }
    }
}