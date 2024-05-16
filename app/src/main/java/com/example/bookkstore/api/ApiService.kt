package com.example.bookkstore.api

import android.telecom.Call
import com.example.bookkstore.model.Book
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    // tên route khai báo cuối api
    @Headers("Accept: application/json")
    @GET("books")
    fun  getAllBooks(): Call<List<Book>>

    @GET("book/{id}")
    fun getByID(@Path("id") id: Int): Call<List<Book>>

    @POST("books")
    fun addBook(@Body book: Book): Call<Book>
}