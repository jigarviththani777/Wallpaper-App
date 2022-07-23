package com.allgod.hdwallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.FullScreenContentCallback;
//import com.google.android.gms.ads.LoadAdError;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.OnUserEarnedRewardListener;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
//import com.google.android.gms.ads.interstitial.InterstitialAd;
//import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
//import com.google.android.gms.ads.rewarded.RewardItem;
//import com.google.android.gms.ads.rewarded.RewardedAd;
//import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class WallpaperPagerActivity extends AppCompatActivity {

////    Rewarded ads
//
//    private RewardedAd mRewardedAd;

//    Interstitial

//    private InterstitialAd mInterstitialAd;


//    Banner

//    private AdView mAdView;

    int pos;
    ArrayList<String> allImageList = new ArrayList<>();

    ViewPager viewPager;
    ImageView ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_pager);

//------------------------- New Content ---------------

//        ss = findViewById(R.id.ss);
////        set_wallpaper = findViewById(R.id.set_wallpaper);
//        //Ask for storage permission
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
//            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1000);
//        }else {
//            //Do nothing at the moment
//        }
//
//        ss.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ss.setVisibility(View.GONE);
////                set_wallpaper.setVisibility(View.GONE);
//                View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
//                Bitmap bitmap = getSceenShot(rootView);
//                store(bitmap,"Wallpaper2.png");
//                ss.setVisibility(View.VISIBLE);
////                set_wallpaper.setVisibility(View.VISIBLE);
//            }
//        });

//------------------------- New Content ---------------

//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });

        //        rewarded ads

//        AdRequest adRequest = new AdRequest.Builder().build();
//
//        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917",
//                adRequest, new RewardedAdLoadCallback(){
//                    @Override
//                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                        // Handle the error.
//                        Log.d("TAG", loadAdError.getMessage());
//                        mRewardedAd = null;
//                    }
//
//                    @Override
//                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
//                        mRewardedAd = rewardedAd;
//                        Log.d("TAG", "Ad was loaded.");
//                    }
//                });

//        Interstitial
//        setAds();

        pos = getIntent().getIntExtra("pos",0);
        allImageList=getIntent().getStringArrayListExtra("list");

        viewPager = findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter = new  PagerAdapter(WallpaperPagerActivity.this,allImageList);

        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(pos);

//        Banner Ads

//        AdView adView = new AdView(this);
//
//        adView.setAdSize(AdSize.BANNER);
//
//        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
//
//
//
//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest55 = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest55);

    }
//    Interstitial

//    public void setAds(){
//
//        AdRequest adRequest = new AdRequest.Builder().build();
//
//        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
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

//------------------------- New Content ---------------
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == 1000) {
//            Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
//            finish();
//        }
//    }
//
//    //  get screenshot of the app
//    public static Bitmap getSceenShot(View view){
//        View screenview = view.getRootView();
//        screenview.setDrawingCacheEnabled(true);
//        Bitmap bitmap = Bitmap.createBitmap(screenview.getDrawingCache());
//        screenview.setDrawingCacheEnabled(false);
//        return bitmap;
//    }
//    //    store the image on the device
//    public void store(Bitmap bm,String fileName){
//        String dirpath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/God Wallpapers";
//        File dir = new File(dirpath);
//        if (!dir.exists()){
//            dir.mkdirs();
//        }
//        File file = new File(dirpath, fileName);
//        try {
//            FileOutputStream fos = new FileOutputStream(file);
//            bm.compress(Bitmap.CompressFormat.PNG,100,fos);
//            fos.flush();
//            fos.close();
//            Toast.makeText(this, "Saved!\nInternalStorage/GodWallpapers", Toast.LENGTH_SHORT).show();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

//------------------------- New Content ---------------

    @Override
    public void onBackPressed() {

//        if (mInterstitialAd != null) {
//
//            mInterstitialAd.show(WallpaperPagerActivity.this);
//
//            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
//                @Override
//                public void onAdDismissedFullScreenContent() {
//                    super.onAdDismissedFullScreenContent();
//                    mInterstitialAd = null;
//                    setAds();
//                    finish();
//                }
//            });
//        } 
//        else {
//            finish();
//        }

        finish();

    }

////    Rewarded
//
//
//    @Override
//    public void onBackPressed() {
//        if (mRewardedAd != null) {
//            Activity activityContext = WallpaperPagerActivity.this;
//            mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
//                @Override
//                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
//                    // Handle the reward.
//                    Log.d("TAG", "The user earned the reward.");
//                    int rewardAmount = rewardItem.getAmount();
//                    String rewardType = rewardItem.getType();
//                    finish();
//                }
//            });
//        } else {
//            Log.d("TAG", "The rewarded ad wasn't ready yet.");
//            finish();
//        }
//    }
}