package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import com.example.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
        callcitizen()
    }

    fun callcitizen() {
        var error = false
        binding.btncall.setOnClickListener {
            var addition = binding.tvaddition.text.toString()
            if (addition.isEmpty()) {
                error = true
                binding.tvaddition.setError("get the resuilt of two number")
            }
            var subtraction = binding.tvsub.editText.toString()
            if (subtraction.isEmpty()) {
                error = true
                binding.tvsub.setError("get the answer of the two number")

            }
            var multiplication=binding.tvmultiplication.editText.toString()
            if (multiplication.isEmpty()){
                error=true
                binding.tvmultiplication.setErrorIconOnClickListener {
                    binding.tvmultiplication.setError("multipy the two number")
                }
            }
            var division = binding.tvdivision.editText.toString()
            if (division.isEmpty()) {
                error = true
                binding.tvdivision.setErrorIconOnClickListener {
                    binding.tvdivision.setError("get the resuilt of two number")

                }
                if (binding.btncall.selectionStart != 0) {
                    binding.btncall.setOnClickListener {
                        var addition = binding.tvaddition.text.toString()
                        var subtration = binding.tvsub.editText.toString()
                        var division = binding.tvdivision.editText.toString()
                        var muiltiplication = binding.textInputLayout.toString()
                    }
                }

            }


        }
    }
}

