package com.ddiakovskiy.homework2.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

import com.ddiakovskiy.homework2.MainActivity;

@Singleton
@Component(modules={AppModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}