package com.softrasol.retrofitexample;

import com.softrasol.retrofitexample.Models.UserDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/photos")
    Call<List<UserDataModel>> getEmployees();

}
