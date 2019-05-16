package com.tanheta.breeds

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class BreedsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun createViewModel(): BreedsViewModel {
        return BreedsViewModel()
    }

}