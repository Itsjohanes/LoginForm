package com.mobileprogramming.loginformtest.Rest;

import com.mobileprogramming.loginformtest.Model.*;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("restapi_pasien.php")
    Call<GetAccount> getakun(@Query("function") String function, @Query("username") String username, @Query("password") String password);
}
