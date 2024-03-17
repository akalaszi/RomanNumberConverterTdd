package org.example

class RomanNumberConverter {
    companion object {
        fun convert(arabic: Int): String {
            var ret = ""
            if (arabic < 4) {
                for (i in 1..arabic) {
                    ret += "I"
                }
            } else if(arabic==4) {
                ret = "IV"
            } else if(arabic==5) {
                ret = "V"
            }

            return ret
        }
    }
}