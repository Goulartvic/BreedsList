package com.tanheta.breeds

import android.hardware.camera2.CaptureFailure

interface BreedDataSource {
    fun listAll(sucess: (List<Breed>) -> Unit, failure: () -> Unit)
}