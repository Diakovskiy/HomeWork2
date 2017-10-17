package com.ddiakovskiy.homework2;

import android.app.Application;
import com.ddiakovskiy.homework2.di.DaggerNetComponent;
import com.ddiakovskiy.homework2.di.NetComponent;

public class CustomApp extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent
                .builder()
                .build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }


}
