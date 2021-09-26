package com.abumadi.myretrofitapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("posts")
    fun getPosts():Call<List<Posts>>
}