package com.procreation.dagger2retrofit2;

import android.app.Application;

import com.procreation.dagger2retrofit2.dagger.component.DaggerNetComponent;
import com.procreation.dagger2retrofit2.dagger.component.NetComponent;
import com.procreation.dagger2retrofit2.dagger.module.AppModule;
import com.procreation.dagger2retrofit2.dagger.module.NetModule;

/**
 * Created by sts on 11.10.17.
 */

public class App extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com/"))
                .build();
    }

    NetComponent getNetComponent()
    {
        return netComponent;
    }
}
