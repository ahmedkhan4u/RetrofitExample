package com.softrasol.retrofitexample.Interface;

import com.softrasol.retrofitexample.Models.UserDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/photos")
    Call<List<UserDataModel>> getEmployees();

    @GET("/photos")
    Call<List<UserDataModel>> getSpecificEmployee(@Query("employee_id") String id);

}
