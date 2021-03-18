package com.zaerina.retrofitlatihan

import android.telecom.Call
import retrofit2.http.GET

interface Api {
    @GET("posts")
    fun getPosts(): Call<ArrayList<PostResponse>>
}