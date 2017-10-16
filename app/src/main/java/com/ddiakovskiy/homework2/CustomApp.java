package com.ddiakovskiy.homework2;

import android.app.Application;
import com.ddiakovskiy.homework2.di.NetComponent;
/**
 * Created by d.diakovskiy on 17.10.2017.
 */

public class CustomApp extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        netComponent = DaggerNetComponent
//                .builder()
//                .build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }


}
