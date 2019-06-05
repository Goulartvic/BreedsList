package com.tanheta.breeds

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class BreedsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.breeds_activity)

        addFragmentTo(R.id.content_frame, createFragment())
    }

    fun createViewModel(): BreedsViewModel {
        return BreedsViewModel()
    }

    fun createFragment(): BreedsFragment {
        return BreedsFragment.newInstance(createViewModel())
    }

}