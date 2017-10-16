package com.ddiakovskiy.homework2.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.ddiakovskiy.homework2.ActivityMediator;

@Module
public class AppModule {

    @Singleton
    @Provides
    public ActivityMediator getActivityMediator() {
        return new ActivityMediator();
    }
}
