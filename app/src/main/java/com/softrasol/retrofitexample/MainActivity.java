package com.softrasol.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.softrasol.retrofitexample.Adapters.CustomAdapter;
import com.softrasol.retrofitexample.Interface.ApiInterface;
import com.softrasol.retrofitexample.Models.UserDataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    List<UserDataModel> employeeList;
    TextView textView;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

      try {

          apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);

          Call<List<UserDataModel>> call = apiInterface.getEmployees();

          call.enqueue(new Callback<List<UserDataModel>>() {
              @Override
              public void onResponse(Call<List<UserDataModel>> call, Response<List<UserDataModel>> response) {

                  generateDataListRecyclerView(response.body());


              }

              @Override
              public void onFailure(Call<List<UserDataModel>> call, Throwable t) {
                  Log.d("dxdiag", "Failure Error : "+t.getMessage());
              }
          });


      }catch (Exception ex){
          Log.d("dxdiag", "Exception Error : "+ex.getMessage());

      }
    }

    private void generateDataListRecyclerView(List<UserDataModel> list) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list);
        recyclerView.setAdapter(adapter);

    }
}
