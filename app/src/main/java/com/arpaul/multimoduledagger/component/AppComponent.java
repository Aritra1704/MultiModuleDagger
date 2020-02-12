package com.arpaul.multimoduledagger.component;

import android.app.Activity;

import com.arpaul.multimoduledagger.MainActivity;
import com.arpaul.multimoduledagger.model.AppModel;
import com.arpaul.multimoduledagger.modules.AppModelProvider;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModelProvider.class
})
public interface AppComponent {
    void inject(MainActivity context);

    AppModel getModel();
}
