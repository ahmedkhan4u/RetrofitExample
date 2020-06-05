package com.softrasol.retrofitexample.Models;

import com.google.gson.annotations.SerializedName;

public class EmployeeModel {

    @SerializedName("id")
    private String id;
    @SerializedName("employee_name")
    private String employee_name;
    @SerializedName("employee_salary")
    private String employee_salary;
    @SerializedName("employee_age")
    private String employee_age;
    @SerializedName("profile_image")
    private String profile_image;

    public String getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }
}
