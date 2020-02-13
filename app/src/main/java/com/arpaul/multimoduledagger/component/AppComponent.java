package com.arpaul.multimoduledagger.component;

import com.arpaul.multimoduledagger.BaseAppActivity;
import com.arpaul.multimoduledagger.model.AppModel;
import com.arpaul.multimoduledagger.modules.AppModelProvider;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModelProvider.class
})
public interface AppComponent {
    void inject(BaseAppActivity context);

    AppModel getModel();
}
