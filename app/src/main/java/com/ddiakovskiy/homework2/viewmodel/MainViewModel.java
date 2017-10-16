package com.ddiakovskiy.homework2.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;

import android.content.Context;
import android.databinding.BaseObservable;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import com.ddiakovskiy.homework2.ActivityMediator;
import com.ddiakovskiy.homework2.SecondActivity;

/**
 * Created by d.diakovskiy on 17.10.2017.
 */

public class MainViewModel extends BaseObservable {

    private Context context;
    private ActivityMediator activityMediator;
    private String text;

    public MainViewModel(Context context, ActivityMediator activityMediator) {
        this.context = context;
        this.activityMediator = activityMediator;
    }

    public MainViewModel(Context context) {
        this.context = context;
    }

    public void onClickButtonCall(View v){
        activityMediator.ShowDialer(context);
    }
    public void onClickButtonApp(View v){
        activityMediator.ShowSecondActivity(context);
    }
    public void onClickButtonSms(View v){
        activityMediator.ShowSMSApp(context);
    }
}
