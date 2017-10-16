package com.ddiakovskiy.homework2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/**
 * Created by d.diakovskiy on 17.10.2017.
 */

public class ActivityMediator {
    public void ShowDialer(Context context){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"));
        context.startActivity(intent);
    }
    public void ShowSecondActivity(Context context){
        Intent appIntent = new Intent(context, SecondActivity.class);
        context.startActivity(appIntent);
    }
    public void ShowSMSApp(Context context){
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:"));
        context.startActivity(sendIntent);

    }
}
