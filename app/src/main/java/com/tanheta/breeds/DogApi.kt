package com.tanheta.breeds

import retrofit2.Call
import retrofit2.http.GET

interface DogApi {

    @GET("breeds/list")
    fun listBreeds(): Call<DogResponse>
}