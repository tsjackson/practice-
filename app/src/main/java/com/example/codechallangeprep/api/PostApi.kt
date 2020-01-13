package com.example.codechallangeprep.api

import com.example.codechallangeprep.data.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Response<List<Post>>
}