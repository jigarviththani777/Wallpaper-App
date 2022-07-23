package com.allgod.hdwallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


import java.net.URI;


public class middale extends AppCompatActivity {
    //    Interstitial

//    private InterstitialAd mInterstitialAd;



    //    Banner

//    private AdView mAdView;

    // back press
    private long backPressedTime;
    private Toast backToast;

//    ImageView share;
    AppCompatButton images,privacypolicy;
    AppCompatButton share,rateapp,termsandconditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middale);

        //        Interstitial
//        setAds();



//        //        Banner Ads
//
//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
//            }
//        });
////
//        AdView adView = new AdView(this);
//
//        adView.setAdSize(AdSize.BANNER);
//
//        adView.setAdUnitId("ca-app-pub-4833667347345148/5426717386");

////        test id:ca-app-pub-3940256099942544/6300978111
////        banner id:ca-app-pub-4833667347345148/2804184517
//
//
//
//        AdView adView = new AdView(this);
//
//        adView.setAdSize(AdSize.BANNER);
//
//        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");


//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);


        images = findViewById(R.id.images);
        share = findViewById(R.id.share);
        termsandconditions = findViewById(R.id.termsandconditions);
        rateapp = findViewById(R.id.rateapp);
        privacypolicy = findViewById(R.id.privacypolicy);

//        animation

        Animation animationbtn1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middalebtn1);
        Animation animationbtn2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middalebtn2);
        Animation animationbtn3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middalebtn3);
        Animation animationbtn4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middalebtn4);
        Animation animationbtn5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middalebtn5);

        images.startAnimation(animationbtn1);
        share.startAnimation(animationbtn2);
        rateapp.startAnimation(animationbtn3);
        privacypolicy.startAnimation(animationbtn4);
        termsandconditions.startAnimation(animationbtn5);

        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(middale.this,SecondPage.class);
//                startActivity(intent);

                ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

                if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()) {
                    Toast.makeText(middale.this, "Internet connection is not available!\nPlease connect your network...", Toast.LENGTH_SHORT).show();
                } else {


//                    if (mInterstitialAd != null) {
//
//                        mInterstitialAd.show(middale.this);
//
//                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
//                            @Override
//                            public void onAdDismissedFullScreenContent() {
//                                super.onAdDismissedFullScreenContent();
//                                mInterstitialAd = null;
//                                setAds();
//                                finish();
//                                Intent intent = new Intent(middale.this, SecondPage.class);
//                                startActivity(intent);
//
//                            }
//                        });
//                    } else {
//                        Intent intent = new Intent(middale.this, SecondPage.class);
//                        startActivity(intent);
//                        finish();
//                    }
                    Intent intent = new Intent(middale.this, SecondPage.class);
                    startActivity(intent);
                    finish();
                }
            }

        });

//        share

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
//                    intent.putExtra(Intent.EXTRA_SUBJECT,"Download All Hindu Gods Wallpapers App");
                    String shareMessage = "All Gods & Goddes HD Wallpapers & Set Best Wallpaper in Your Mobile.\n\nDownload Now : https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName()+"\n\n";
//                    Download Gods & Goddess Best HD Wallpapers App and Set Wallpaper as you like :
                    intent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                    startActivity(Intent.createChooser(intent,"Share using"));
                }catch (Exception e){
                    Toast.makeText(middale.this, "Error occurred", Toast.LENGTH_SHORT).show();
                }


            }
        });

        rateapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Uri uri = Uri.parse("market://details?id="+ getPackageName());
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } catch (ActivityNotFoundException e){

//                    Toast.makeText(middale.this, "error", Toast.LENGTH_SHORT).show();
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.allgod.hdwallpaper");
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });




        privacypolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://gods-goddesbesthdwallpapers.blogspot.com/2021/06/privacy-policy.html");
            }
        });


        termsandconditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://gods-goddesbesthdwallpapers.blogspot.com/2021/06/terms-conditions.html");
            }
        });
    }

    //    Interstitial

//    public void setAds(){
//
//        AdRequest adRequest1 = new AdRequest.Builder().build();
//
//        InterstitialAd.load(this,"ca-app-pub-4833667347345148/4520042124", adRequest1, new InterstitialAdLoadCallback() {
//            @Override
//            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
//
//                mInterstitialAd = interstitialAd;
//            }
//
//            @Override
//            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                // Handle the error
//                mInterstitialAd = null;
//            }
//        });
//
//    }

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            finish();
        }else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();

//        Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.exit);
//        dialog.setCanceledOnTouchOutside(false);
//        dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//        NeumorphButton exit = (NeumorphButton) dialog.findViewById(R.id.exit);
//
//        exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                middale.super.onBackPressed();
//            }
//        });
//
//        dialog.show();



    }

    private void gotoUrl (String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}