package com.tanheta.breeds

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DogDataSource(val dogApi: DogApi) : BreedDataSource {
    override fun listAll(sucess: (List<Breed>) -> Unit, failure: () -> Unit) {
        val call = dogApi.listBreeds();
        call.enqueue(object : Callback<DogResponse>{

            override fun onResponse(call: Call<DogResponse>, response: Response<DogResponse>) {
                if (response.isSuccessful) {
                    val breeds = mutableListOf<Breed>()
                    response.body()?.message?.forEach {
                        breeds.add(Breed(it))
                    }
                    sucess(breeds)
                    return
                }
                failure()
            }

            override fun onFailure(call: Call<DogResponse>, t: Throwable) {
                failure()
            }
        })
    }

}