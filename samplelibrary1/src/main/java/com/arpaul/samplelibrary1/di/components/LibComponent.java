package com.arpaul.samplelibrary1.di.components;

import com.arpaul.samplelibrary1.di.modules.RetrofitModule;
import com.arpaul.samplelibrary1.di.scopes.ApplicationScope;
import com.arpaul.samplelibrary1.network.RetrofitService;
import com.arpaul.samplelibrary1.webservices.APICall;

import dagger.Component;

@ApplicationScope
@Component(modules = {
        RetrofitModule.class
})
public interface LibComponent {
    RetrofitService inject(RetrofitService activity);

}
