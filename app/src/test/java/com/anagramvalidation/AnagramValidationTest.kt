package com.anagramvalidation

import com.anagramvalidation.util.AppConstants.Companion.IS_ANAGRAM
import com.anagramvalidation.util.AppConstants.Companion.NOT_ANAGRAM
import com.anagramvalidation.util.isAnagrams
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AnagramValidationTest {

    @Test
    fun anagramValidation_isAnagram() {
        assertEquals(isAnagrams("binary", "brainy"), IS_ANAGRAM)
    }

    @Test
    fun anagramValidation_isNotAnagram() {
        assertEquals(isAnagrams("abcd", "daba"), NOT_ANAGRAM)
    }

    @Test
    fun anagramValidation_isAnagramFail() {
        assertEquals(isAnagrams("john", "hnoj"), NOT_ANAGRAM)
    }

}