package com.procreation.dagger2retrofit2.dagger.component;

import com.procreation.dagger2retrofit2.MainActivity;
import com.procreation.dagger2retrofit2.dagger.module.AppModule;
import com.procreation.dagger2retrofit2.dagger.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sts on 11.10.17.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    void inject(MainActivity mainActivity);
}
