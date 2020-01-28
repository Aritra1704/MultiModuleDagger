package com.arpaul.samplelibrary1.webservices;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APICall {
    @GET
    Call<String> getData();
}
