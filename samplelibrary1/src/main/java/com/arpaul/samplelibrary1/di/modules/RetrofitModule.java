package com.arpaul.samplelibrary1.di.modules;

import com.arpaul.samplelibrary1.network.RetrofitService;
import com.arpaul.samplelibrary1.webservices.APICall;

import dagger.Module;
import dagger.Provides;

@Module
public class RetrofitModule {
    @Provides
    RetrofitService provideRetrofitService() {
        return new RetrofitService();
    }

    @Provides
    APICall provideApiCall() {
        return RetrofitService.createService(APICall.class);
    }
}
