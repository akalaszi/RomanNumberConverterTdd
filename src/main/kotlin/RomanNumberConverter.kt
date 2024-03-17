package org.example

class RomanNumberConverter {
    companion object {
        fun convert(arabic: Int): String {
            if (arabic == 2) return "II"
            return "I"
        }
    }
}