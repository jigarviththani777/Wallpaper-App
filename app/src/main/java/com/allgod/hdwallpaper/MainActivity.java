package com.allgod.hdwallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        hide title bar
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
////        hide action bar
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ConnectivityManager connectivityManager = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()) {
            Toast.makeText(this, "Internet connection is not available!\nPlease connect your network...", Toast.LENGTH_SHORT).show();
        }
//            Dialog dialog = new Dialog(this);
//            dialog.setContentView(R.layout.no_internet_dialog);
//            dialog.setCanceledOnTouchOutside(false);
//            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
//            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//            NeumorphButton btretry = (NeumorphButton)dialog.findViewById(R.id.retry);
//
//            btretry.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    finish();
//                }
//                
//            });

//            dialog.show();

            ImageView imageView = findViewById(R.id.imageView);
            TextView textView = findViewById(R.id.textView);
            TextView textView2 = findViewById(R.id.textView2);
            TextView textView3 = findViewById(R.id.textView3);
            Animation animationimg = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
            Animation animationtext = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.textanim);
            Animation animationtext2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.textanim2);
            Animation animationtext3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.textanim3);
            imageView.startAnimation(animationimg);
            textView.startAnimation(animationtext);
            textView2.startAnimation(animationtext2);
            textView3.startAnimation(animationtext3);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainintent = new Intent(MainActivity.this,middale.class);
                    startActivity(mainintent);
                    finish();
                }
            },6000);

    }

}