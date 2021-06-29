package com.anagramvalidation.util

import com.anagramvalidation.util.AppConstants.Companion.IS_ANAGRAM
import com.anagramvalidation.util.AppConstants.Companion.NOT_ANAGRAM
import java.util.*

fun isAnagrams(strOne: String, strTwo: String): String {
    var message = NOT_ANAGRAM

    if (strOne.length != strTwo.length) {
        return message
    }

    val strArray1 = strOne.lowercase().toCharArray()
    val strArray2 = strTwo.lowercase().toCharArray()

    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    val sortedStr1 = String(strArray1)
    val sortedStr2 = String(strArray2)

    if (sortedStr1 == sortedStr2)
        message = IS_ANAGRAM

    return message
}
