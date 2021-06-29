package com.anagramvalidation.ui.validator

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.anagramvalidation.R
import com.anagramvalidation.databinding.ActivityAnagramValidationBinding
import com.google.android.material.button.MaterialButton


class AnagramValidationActivity : AppCompatActivity() {

    lateinit var edtStringOne: EditText
    lateinit var edtStringTwo: EditText
    lateinit var btnValidate: MaterialButton
    lateinit var anagramValidationViewModel: AnagramValidationViewModel
    lateinit var binding: ActivityAnagramValidationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anagram_validation)

        initView()

    }

    fun initView() {
        btnValidate = findViewById(R.id.button_validate)
        edtStringOne = findViewById(R.id.edit_normal_string)
        edtStringTwo = findViewById(R.id.edit_aragram_string)

        anagramValidationViewModel =
            ViewModelProviders.of(this).get(AnagramValidationViewModel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_anagram_validation)
        binding.lifecycleOwner = this
        binding.anagramValidationViewModel = anagramValidationViewModel

        anagramValidationViewModel.getIsAnagram().observe(this, {
            Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
        })
    }

}