package com.example.bookkstore.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APiClient {
    // điền địa chỉ ip của API với giao thức http://129.168.23.4:3000 3000 là port
    // biến kết nối đến API thông qua IP address
    private const val URL = ""
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    // biến cung cấp lời gọi ddeeesn các interface function
    val apiService: ApiService = retrofit.create(ApiService:: class.java)

}