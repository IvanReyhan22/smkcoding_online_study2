package com.ezyindustries.stdy_challenge2.data

import com.ezyindustries.stdy_challenge2.GithubUserItem
import retrofit2.Call
import retrofit2.http.GET

interface GithubService {
    @GET("users")
    fun getUsers(): Call<List<GithubUserItem>>
}