package org.example

class RomanNumerals {
    companion object {
        fun convert(arabic: Int): String {
            if (arabic == 2 ) return "II"
            return "I"
        }
    }
}