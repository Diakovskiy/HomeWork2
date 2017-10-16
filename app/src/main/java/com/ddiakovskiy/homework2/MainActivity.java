package com.ddiakovskiy.homework2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.databinding.DataBindingUtil;
import android.os.Bundle;


import javax.inject.Inject;

import com.ddiakovskiy.homework2.databinding.ActivityMainBinding;
import com.ddiakovskiy.homework2.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Inject
    public ActivityMediator activityMediator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ActivityMediator activityMediator = new ActivityMediator();

        MainViewModel mainViewModel = new MainViewModel(this, activityMediator);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(mainViewModel);
    }






}
