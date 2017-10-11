package com.procreation.dagger2retrofit2.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sts on 11.10.17.
 */

@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application mApplication) // passes context
    {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication()
    {
        return mApplication;
    }
}
