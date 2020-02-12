package com.arpaul.multimoduledagger.modules;

import com.arpaul.multimoduledagger.model.AppModel;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModelProvider {
    @Provides
    public AppModel getAppModel() {
        return new AppModel();
    }
}
