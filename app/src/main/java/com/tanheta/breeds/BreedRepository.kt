package com.tanheta.breeds

class BreedRepository(private val dogDataSource: BreedDataSource) : BreedDataSource {

    override fun listAll(sucess: (List<Breed>) -> Unit, failure: () -> Unit) {
        dogDataSource.listAll(sucess, failure)
    }
}