package com.anagramvalidation.ui.validator

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anagramvalidation.util.hideKeyboard
import com.anagramvalidation.util.isAnagrams

class AnagramValidationViewModel : ViewModel() {

    var normalString: MutableLiveData<String> = MutableLiveData()
    var anagramString: MutableLiveData<String> = MutableLiveData()
    var isAnagram: MutableLiveData<String> = MutableLiveData()

    fun onSubmit(view: View): Unit {
        view.hideKeyboard()
        isAnagram.value = isAnagrams(normalString.value.toString(), anagramString.value.toString())
    }

    fun getIsAnagram(): MutableLiveData<String> {
        return isAnagram
    }

}