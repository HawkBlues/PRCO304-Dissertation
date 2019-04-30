package com.example.planty.Classes

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.ArrayList

class DataSort {

    /**Converts given string to 2dp
     * @param string String to convert to 2dp
     * @return String: String now 2dp
     */
     fun convertTo2dp(string: String): String{ //Converts a decimal to 2dp, returning a string
        var origString = string.toDouble()
        val newString = BigDecimal(origString).setScale(2, RoundingMode.HALF_EVEN)//Round the confidence to 2dp
        return newString.toString()
    }


    /**Returns a list of three identified labels
     * Used to give the top three (Highest confidence) identifications
     * @param identifiedString
     * @param indexStart
     * @return  ArrayList<String> ,3 long of identified labels
     */
     fun getSingleIdent(identifiedString: ArrayList<String>, indexStart: Int) : ArrayList<String> { //Returns an ArrayList, 3 long from the provided ArrayList
        var orignalString = identifiedString
        var newString = ArrayList<String>()
        var counter = 0
        var index = indexStart
        for (item in orignalString){
            if (counter <= 2) {
                newString.add(counter, orignalString.get(index))
                index++
                counter++
            }
        }
        return newString
    }

}