package com.allgod.hdwallpaper;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdSize;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;


public class SecondPage extends AppCompatActivity {
// back press
//    private long backPressedTime;
//    private Toast backToast;

    //    Banner

    private AdView mAdView;

//    LottieAnimationView share;

    RecyclerView rcvMain;
    ArrayList<String> imgArraylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Toast.makeText(this, "Please Wait !!!", Toast.LENGTH_SHORT).show();

//        ConnectivityManager connectivityManager = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//
//        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();



//        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()){
//            Dialog dialog = new Dialog(this);
//            dialog.setContentView(R.layout.no_internet_dialog);
//            dialog.setCanceledOnTouchOutside(false);
//            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
//            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//            NeumorphButton btretry = dialog.findViewById(R.id.retry);
//
//            btretry.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    recreate();
//                }
//            });
//            dialog.show();
//        }

        //        Banner Ads

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-4833667347345148/9877680780");
//
//
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//        share = (LottieAnimationView) findViewById(R.id.share);
//        share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/plain");
//                String Body = "Download Swaminarayan Wallpaper App";
//                String Sub = "";
//                intent.putExtra(Intent.EXTRA_TEXT,Body);
//                intent.putExtra(Intent.EXTRA_TEXT,Sub);
//                startActivity(Intent.createChooser(intent,"Share Using"));
//            }
//        });


////        new new new 21/12/2021--------------------------------------------
//
        imgArraylist.add("https://i.postimg.cc/nhbYMqRw/kn1n.jpg");
        imgArraylist.add("https://i.postimg.cc/Lsmt32Mt/sn1n.jpg");
        imgArraylist.add("https://i.postimg.cc/65YY3M46/hn1.jpg");
        imgArraylist.add("https://i.postimg.cc/fRy50YYc/mn1.jpg");
        imgArraylist.add("https://i.postimg.cc/9QkbPzBv/rn1.jpg");
        imgArraylist.add("https://i.postimg.cc/zDWQ1zkM/nm2.jpg");
        imgArraylist.add("https://i.postimg.cc/1Xp70BtP/nm1.jpg");
        imgArraylist.add("https://i.postimg.cc/5yckFTfn/nm3.jpg");
        imgArraylist.add("https://i.postimg.cc/GtVtH23n/nnn2.jpg");
        imgArraylist.add("https://i.postimg.cc/1zBzDMRH/nnn3.jpg");
        imgArraylist.add("https://i.postimg.cc/hGKN169w/s2nn.jpg");
//
////        new new new --------------------------------------------

        imgArraylist.add("https://i.postimg.cc/R0PxS58V/w7-2.jpg");
        imgArraylist.add("https://i.postimg.cc/y69V5Thk/w1-3.jpg");
        imgArraylist.add("https://i.postimg.cc/t48fkdfb/g9.jpg");
        imgArraylist.add("https://i.postimg.cc/SRGWHGMZ/krishnaaa.jpg");
        imgArraylist.add("https://i.postimg.cc/vTdXx3cq/k5.jpg");
        imgArraylist.add("https://i.postimg.cc/7LshcKv5/krishna.jpg");
        imgArraylist.add("https://i.postimg.cc/zf7PCCSd/w6-2.jpg");

        imgArraylist.add("https://i.postimg.cc/6pxQR4Xm/w72.jpg");
        imgArraylist.add("https://i.postimg.cc/MTbqhZf9/ma1.jpg");
        imgArraylist.add("https://i.postimg.cc/Jh6mTGfm/w57.jpg");
        imgArraylist.add("https://i.postimg.cc/L4GFNZWm/r4.jpg");

        imgArraylist.add("https://fsb.zobj.net/crop.php?r=B10llp4XtbJY_vRMlVpceYBFLkmmAWvHNdsc_b8kq38W_297_HgZOzD7aO2fN5sVJGOM1kDn4fQKQaXyJlZwu_6y51eYxBK2CamJeqUjE9ZeQoMMw_QbnLoVkBZlWr2Ey5WbEhI5uNDxRqZ7");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=o5edgLzDa6SSAs5jmYeoSlrDtu-GylcrTcK97-0lu6SRn86dGCuAB-8vFPEpzUJbCU3E8NOhIhavlUmpXmiU3rf_qCBzyZlDZ-T9CLP2Zc-O_DZOxepIuvxQUXWOLB41YzZBGfOGGKZEgEtQ");
        imgArraylist.add("https://i.postimg.cc/1tLxRMwB/w10.jpg");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=XoUtLNTHXwwqpzR9B8a53m4AXUVpoPt5IOkZp5i8CFUsHWRvI72V2SUkD_51OY1BK_hx-y14zUTSFGJTbuQiGduFz0tV11HqUa1jY8nJiU8wHyD4G1AjFtjmil7V3HxtSwe6m_CbHZWFQjxI");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=im-rfwjApwGL3uZwA9GdDsbqG8Fb7QPaZYN4VvRpeKmxabASfW6vYko3mRT5oxNSXvlj-hbgyFa_624OnDynPBYLIKSyiVOoG0qzXdpp5am6jPJU6T4qZp53ZjSu1B6OMdrXmJsT2s8_azs-");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=B11hcHmNnLv4D53E2kHh_6d95Dclzn9mzljtBbfFTzG8asLRSmo3_AEmMmuakwNxlWTy74xAafUjA7TvCjCky0ED-WTlF5UacXsPgas1aBWL9ESBt8jDhcha8XOshB0s1ijh4wp0_QGxwzzR");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=7j9Z-YO-qyJqasSQNyoyM47oE2BtwQ5hC09HnXu5Qj_dXIrxMc8o8SLZuRNdQf5jn6Wd1snyV-uYIOf0qld1nwW8IskemJWgEh6Y8Cidq-QpT0gmi1dqI9BYB93IDSF0AlJ5NR_7EPwhCS2B");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=pjL0MySeumUy1SgJO0ADdnhrijWO8K4VT9hd8gYiXIZATyyzctG1TABzlnLnku7fJqkdtm498HOEdJ8qto82I96BAzmFeGW_y-1eYzYCDNhDNmEjkyIiBdzznhONKez7nw6qNb4py_XSZ4Ce");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=_g7HFayXRGcDQ4n48mjt1aJVDRqEexZ9Bbmmd6GTMp2kJKyUxS382iStP3ET1xXbAPSk2XpB5mxVBQFnnWsMpxANhILFOxdNHjUYklF0UCI8PXR7P2VZLOLmWEV7tYd8YQh6iZXbf1pi_Obm");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=1YRqlarYlqpSlUAWGi6QV6uuDsXvx1QWiMWP-FVELw3J7s3S6s0d3IwLvyqRbYHxAzoH7PHdTZF4SJcjPHLX7KRFN4rgIQLyclIJjLOSWcVBAfrm3u_EcRilwkoGNgri-nciAIMUkvSHpeTo");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=VaudAzDSvRtIE2I50IaCpOPR-vzaC5GC51y3iCJZCl97MtsdUZGOx1-KtkAx_T9hga97FStXBdCeXGKO_LIANFSb3GOwpTZ0A0F8MikEEYr8bK9OClSja-xoMu_jND1ekOeJwyhOiArM899M");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=2RsjBEQ9T8gtmiCkBoiZqrgtSvKrSEgN2ZHYXULHBCHPpVT7U-FmSRDoGRmAKhzQSdxfKs77k4pjRt2_rW3LxI73dGdmBoWRe-Qwu1v0f3iOvAqkrej467m-0wsZ99WLF5ePdhW4UXfatuFl");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=8mHAlGJfjJ9nxSvxjmpVzrY9TXHVEDm6JAFehMJtkUl4ArZZN1tsq9ylWU2w3G8ovalvrs_iHAKFudxuEUZCWpFKCBKZ3i-MN26I0gLUruMLCo39PdOnEvd1OtVTTGW_WwrRtK8dFqE4hxhM");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=iMR2Ugl80yGNHKDYi1XH527ZReYI0B-lnSFLLLOTP21EovfkdVh06BgMIWWzjnlpBEvHfOOpnc1WYegLUXXZW5_CSkn6n9XnZLulBzUUZuw7rutSmHn30m1va591rcIaHsLu_4iJovONlIe9");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=7MBaW3dZWBU8FCgkSfelgAY6qNbdeC7Z41hzvkg_evAjdvvkaJZwnABAVuNvL6kbDSqXXfTKUuGA9puOVD3fgUZp9rF4rTqVIiT2iO2Am-229nbixEqubt9vAFtb_vsFfojGS0q7wcnzJvkK");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=DNc2npezijOi7LLmovFok6y_PfLeub2Viz6dbhpJAOOuDoZ_vccT1amkXJQtKSRNHyGu_LqYxTRaoE0ys7TldKsgkCQH0-JQKAF8iQFQ0MYON_tLqHivafKWXQiD3K3-B6-3yZO3UcopcC8G");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=-kPvjL44lBk89PWgIgjIC9sV-nOENJjVRFnQqNhtEbAu36QWSFwHExYqXxMQ3Mshb1rm5lSeGxT5gMxT_A9eVDIeYc77zO3f-u9h6qNpofp7ApB2r5rAbjrkrSCbf5ducXOCGaQ7UoO231PA");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=LF6n1wcntgQ054mE5IyY4qa2P19lOP9QJ__RhY3ZdyiXa72SP1TJStoC1XwJ2_EOVA4cPcEIypeSN-_9U10D2WebEHGn0FniO66bLUfefxzvK8HGtD0u9SpU938LODTotTPMJ2dcDVuY0tea");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=hTU4YqvOn4iAKIzkxTkYMu_ZnhjnzeGJeKkazY9wkdt6SM584yEfcWOFz3q_RG1ZQhtxxGX5wVOUFUGb-hEiI1fadEnHzVRUoczC4ohtZgR30N7FTZPo5Vl7FmJ6cOsoV3dnkNBA9tZKK2LH");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=JdJaIns72-2Zb_CjgOj4h09iyEVkWjXV9ButaS9iuQeHQwwqZM8LFp8_1U2PmXRgrOm1qN-qjf9ORy50Z8cnPcB9xzfV6rnQmTfuwNEVldOrEam7qMsq3QolFVBawLnhAcUGD7Xfj86bCcAS");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=74o4l4MZp8nSsnlofgerwtMKCLb20V46shWIgWKB_hvMP6ayoNOpFW2qK9dOeUEt2wH0jTjSPE36Y0f-E8i9gTvczGVqZiZJG1CTzD4mSfO-1RgMX7jMW4vkvAdr6Cek-seAunCL4lYFi3Vi");
        imgArraylist.add("https://fsb.zobj.net/crop.php?r=U5_kV6e8ZFcBRys_qvxxJ0E6rVgrGtqfl5GT7kc_qZdN0ayi-_UTTxyQHwFM7ZMKvJL0eq9Xuj7k63n4LFJUDlmjieiVyrkLpL0ldNotK_B0KVG3oheBH-ubzidjHc_AqgiGEH9TB2Xovh1s");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=YQhcEXH09_nrC9hw9rlwbwWMdtVDqaTpTGpzsYM1qXOBsJ3vDcGAD4KzPPIle9t3xKmqimSKVOUOukO_NjncHpTY_RZC00VGqQfPrM6bf3UFotKMLp-acwnqeLNil_xdp1IYqH3fAtwyKjYt");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=Mn-Y4y8uCdrBgGhSFd3_rLYgFJKpNA_tJvZ8Iyd32h-i_xJBO6dlgwIyiEPLWnGMvD4ywbyq_ObnwtBaspMyjbB89hnGuBZzWDzp7JIG0DnGPyWLm6ibm6_cNE8dvLxKoau9Zqir--JoCkvC");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=yJ7y0_Sa_0mKgReBFjo4Szx5P4bLmBfr4V5y1Xp-XUundnjV2qLLl6CI4Y0u8xb4xr1bDZHo5SsTAGRVAUVM5UkLnt5Tce4CUhs_aQRIzWwNjy8wpU8YxnQGt8oFWpf1IMBf4meZ_KUvnt7W");
        imgArraylist.add("https://fsa.zobj.net/crop.php?r=GNyG2ZcdroUa5QC6qf48KHaJsurfY6dCuyPn29LPPdwaLgIMWwb5m6fo-ff5MDvuYinDIvCWVMLpLmm_jVWzOddSyk07UFjEx1r-ewve0WDqDfD7REIwVaSge15kc-EE5uwl2UEeahqKa3Na");


//        --------------------- Website ma upload karela ee -------------------------------------------------------------------------------------------------------------------
//        mataji na halma umerela photos
        imgArraylist.add("https://i.postimg.cc/mrnbRHbt/ambe.png");
        imgArraylist.add("https://i.postimg.cc/FRfnLTN3/r5.jpg");
        imgArraylist.add("https://i.postimg.cc/brRYXY3J/meldima.jpg");
        imgArraylist.add("https://i.postimg.cc/2jdSLTrD/maldima2.jpg");
        imgArraylist.add("https://i.postimg.cc/GmFPD963/sn2n.jpg");


        imgArraylist.add("https://i.postimg.cc/bYZrMpVR/b2.jpg");
        imgArraylist.add("https://i.postimg.cc/SNgD98zN/w33.jpg");
        imgArraylist.add("https://i.postimg.cc/Tw0Cznkp/g10.jpg");
        imgArraylist.add("https://i.postimg.cc/Dz07RcfM/k9.jpg");
        imgArraylist.add("https://i.postimg.cc/q7WHSV5N/k10.jpg");
        imgArraylist.add("https://i.postimg.cc/tJ1jMBwb/kaaaaa2.jpg");
        imgArraylist.add("https://i.postimg.cc/D0Bdqk0Y/w37.jpg");
        imgArraylist.add("https://i.postimg.cc/NfQkhdSD/sh5.jpg");
        imgArraylist.add("https://i.postimg.cc/BnWy4QnC/w5-2.jpg");
        imgArraylist.add("https://i.postimg.cc/MTmDtjXT/w4.jpg");
        imgArraylist.add("https://i.postimg.cc/MHrrbjrB/w15.jpg");
        imgArraylist.add("https://i.postimg.cc/QVLr2QzQ/w27-2.jpg");
        imgArraylist.add("https://i.postimg.cc/dQp0VN5q/w47.jpg");
        imgArraylist.add("https://i.postimg.cc/N0wrgPFL/w71.jpg");
        imgArraylist.add("https://i.postimg.cc/FzLZVYck/g11n.png");
        imgArraylist.add("https://i.postimg.cc/wjX6drg7/w23-2.jpg");
        imgArraylist.add("https://i.postimg.cc/T2BLdZM9/w28-2.jpg");
        imgArraylist.add("https://i.postimg.cc/1tMbG8q1/r2.jpg");

        imgArraylist.add("https://i.postimg.cc/7hRwnZRh/krishna2.jpg");

        imgArraylist.add("https://i.postimg.cc/P5WkMnwC/wn1.jpg");
        imgArraylist.add("https://i.postimg.cc/Z5pyFnH6/wn2.jpg");

         //galary

        imgArraylist.add("https://i.postimg.cc/GhC0xF4G/w62.jpg");
        imgArraylist.add("https://i.postimg.cc/BbRBxpYP/b15.jpg");
        imgArraylist.add("https://i.postimg.cc/Gpzd4sBR/w24-2.jpg");
        imgArraylist.add("https://i.postimg.cc/d0cSMs9Z/b12.jpg");
        imgArraylist.add("https://i.postimg.cc/K8z566n5/w11-2.jpg");
        imgArraylist.add("https://i.postimg.cc/ydvxCbhF/w21-2.jpg");
        imgArraylist.add("https://i.postimg.cc/NfyN59Jr/b13.jpg");
        imgArraylist.add("https://i.postimg.cc/BQgvPbj4/b9.jpg");
        imgArraylist.add("https://i.postimg.cc/KYDb7J7g/w26.jpg");
        imgArraylist.add("https://i.postimg.cc/8c62mFCj/w9-2.jpg");
        imgArraylist.add("https://i.postimg.cc/y6LjL6RN/w35-2.jpg");


        imgArraylist.add("https://i.postimg.cc/sgkzxGpn/ma2.jpg");
        imgArraylist.add("https://i.postimg.cc/WbKLYqf2/r1.jpg");
        imgArraylist.add("https://i.postimg.cc/90ShcKWk/w52.jpg");
        imgArraylist.add("https://i.postimg.cc/Dy9cX6m3/w75.jpg");
        imgArraylist.add("https://i.postimg.cc/B6tfwZp9/k8.jpg");
        imgArraylist.add("https://i.postimg.cc/HsY6j3nh/w32.jpg");
        imgArraylist.add("https://i.postimg.cc/yYR8ghG0/w48.jpg");
        imgArraylist.add("https://i.postimg.cc/zvTs1Bcy/w61.jpg");
        imgArraylist.add("https://i.postimg.cc/BZg2CqyQ/k6.jpg");
        imgArraylist.add("https://i.postimg.cc/d1x2YnKN/d2.jpg");
        imgArraylist.add("https://i.postimg.cc/DZqQQnT7/w13-2.jpg");
        imgArraylist.add("https://i.postimg.cc/pdtcZvks/w18.jpg");
        imgArraylist.add("https://i.postimg.cc/vZcNrgSM/w29-2.jpg");
        imgArraylist.add("https://i.postimg.cc/y8FCBvbr/w30.jpg");
        imgArraylist.add("https://i.postimg.cc/V62w82sV/w58.jpg");
        imgArraylist.add("https://i.postimg.cc/1zm8X6mG/ka1-2.jpg");
        imgArraylist.add("https://i.postimg.cc/HkSj0Wpg/w12.jpg");
        imgArraylist.add("https://i.postimg.cc/wBNDHg3D/w16-2.jpg");
        imgArraylist.add("https://i.postimg.cc/Zq3jBQS6/w3.jpg");
        imgArraylist.add("https://i.postimg.cc/C5NJmnP7/w31.jpg");
        imgArraylist.add("https://i.postimg.cc/L6VvhcLG/sh3.jpg");
        imgArraylist.add("https://i.postimg.cc/7hZ2ZND5/g6.jpg");
        imgArraylist.add("https://i.postimg.cc/TwsrtqfT/w22.jpg");
        imgArraylist.add("https://i.postimg.cc/xC3dG16v/d3.jpg");
        imgArraylist.add("https://i.postimg.cc/7hW6QQ0X/k7.jpg");
        imgArraylist.add("https://i.postimg.cc/4NFc9m9z/w17-2.jpg");
        imgArraylist.add("https://i.postimg.cc/nccJ5kLf/b11.jpg");
        imgArraylist.add("https://i.postimg.cc/W18thkWr/b3.jpg");
        imgArraylist.add("https://i.postimg.cc/TPptzKz9/k4.jpg");
        imgArraylist.add("https://i.postimg.cc/GmBJsfCq/w39.jpg");
        imgArraylist.add("https://i.postimg.cc/mgHSZQ5c/w40-2.jpg");
        imgArraylist.add("https://i.postimg.cc/8s80KSkT/w54.jpg");
        imgArraylist.add("https://i.postimg.cc/rFyncZWg/b4.jpg");
        imgArraylist.add("https://i.postimg.cc/Fs3h0R17/g1.jpg");
        imgArraylist.add("https://i.postimg.cc/qBn5BCzD/k3.jpg");
        imgArraylist.add("https://i.postimg.cc/25L5Xfxt/kh1.jpg");
        imgArraylist.add("https://i.postimg.cc/XJs24CWP/w19.jpg");
        imgArraylist.add("https://i.postimg.cc/DyrK8MYG/g3.jpg");
        imgArraylist.add("https://i.postimg.cc/28xwKQKv/b1.jpg");
        imgArraylist.add("https://i.postimg.cc/y6rBhgFT/w53.jpg");
        imgArraylist.add("https://i.postimg.cc/nzZK2MGT/b5.jpg");
        imgArraylist.add("https://i.postimg.cc/3NvCK67f/ka3.jpg");
        imgArraylist.add("https://i.postimg.cc/mgsQBt04/b7.jpg");
        imgArraylist.add("https://i.postimg.cc/6QSq6PyZ/b8.jpg");
        imgArraylist.add("https://i.postimg.cc/sDDn6KYR/w2.jpg");
        imgArraylist.add("https://i.postimg.cc/7LG4YZvH/g8.jpg");

//        ---------------------------------------------new--------------------------------------------------------

        imgArraylist.add("https://i.postimg.cc/HWrXBbw8/le4n.jpg");
        imgArraylist.add("https://i.postimg.cc/gr9YKCvs/le5n.jpg");
        imgArraylist.add("https://i.postimg.cc/Y9s2vG0J/le6n.jpg");
        imgArraylist.add("https://i.postimg.cc/1566ZPY9/le7n.jpg");
        imgArraylist.add("https://i.postimg.cc/yxjMD2LW/le11n.jpg");
        imgArraylist.add("https://i.postimg.cc/dtJ8Y3gJ/le12nn.jpg");
        imgArraylist.add("https://i.postimg.cc/yd2mFTNK/le13n.jpg");
        imgArraylist.add("https://i.postimg.cc/TPgWW5sL/le14nn.jpg");
        imgArraylist.add("https://i.postimg.cc/C1TTXGZM/le15n.jpg");
        imgArraylist.add("https://i.postimg.cc/FKJXTWHn/le16n.jpg");
        imgArraylist.add("https://i.postimg.cc/W1yP6LTk/le19n.jpg");
        imgArraylist.add("https://i.postimg.cc/rsTT01cZ/le8n.jpg");
        imgArraylist.add("https://i.postimg.cc/3rs6hsTK/le20nn.jpg");
        imgArraylist.add("https://i.postimg.cc/Mp5mhqvn/le21.jpg");
        imgArraylist.add("https://i.postimg.cc/43FbxPvZ/le22n.jpg");
        imgArraylist.add("https://i.postimg.cc/J0jbKWf4/le24n.jpg");
        imgArraylist.add("https://i.postimg.cc/W44wVCkX/le25.jpg");
        imgArraylist.add("https://i.postimg.cc/JnkJ4L4c/le26n.jpg");
        imgArraylist.add("https://i.postimg.cc/Qt2QpMny/le29n.jpg");
        imgArraylist.add("https://i.postimg.cc/RVMxHSB0/le30nn.jpg");
        imgArraylist.add("https://i.postimg.cc/52s8sgRv/le31n.jpg");
        imgArraylist.add("https://i.postimg.cc/Z5brP2V4/le32n.jpg");
        imgArraylist.add("https://i.postimg.cc/kGbp8cx3/le33nn.jpg");
        imgArraylist.add("https://i.postimg.cc/wxNc9h18/le34n.jpg");
        imgArraylist.add("https://i.postimg.cc/rmXsjtMx/le27n.jpg");
        imgArraylist.add("https://i.postimg.cc/7YSRZKHS/le28nn.jpg");

//        -----------------------------------------------new--------------------------------------------------------

        imgArraylist.add("https://i.postimg.cc/RZmMqr1r/w56.jpg");
        imgArraylist.add("https://i.postimg.cc/yYcvBqpM/k1.jpg");
        imgArraylist.add("https://i.postimg.cc/xTwhyyB2/k2.jpg");
        imgArraylist.add("https://i.postimg.cc/tg8NLpGn/sh4.jpg");
        imgArraylist.add("https://i.postimg.cc/DZy6F840/b14.jpg");
        imgArraylist.add("https://i.postimg.cc/R08YP7D9/g5.jpg");
        imgArraylist.add("https://i.postimg.cc/mgbXwLTb/sh1.jpg");
        imgArraylist.add("https://i.postimg.cc/Nj6kH11L/d1.jpg");
        imgArraylist.add("https://i.postimg.cc/xCnGkTgS/w8.jpg");
        imgArraylist.add("https://i.postimg.cc/cCjX8GrM/w20.jpg");
        imgArraylist.add("https://i.postimg.cc/43yWDWKq/sh2.jpg");
        imgArraylist.add("https://i.postimg.cc/fTqfyN6V/w38.jpg");



        imgArraylist.add("https://i.postimg.cc/mg1swpMy/cha1.jpg");
        imgArraylist.add("https://i.postimg.cc/63mcYcCC/cha2.jpg");
        imgArraylist.add("https://i.postimg.cc/SNC0YYpg/cha3.jpg");
        imgArraylist.add("https://i.postimg.cc/pLJgqNr8/cha4.jpg");
        imgArraylist.add("https://i.postimg.cc/htcYJCsG/cha5.jpg");
        imgArraylist.add("https://i.postimg.cc/5y8PyvFv/cha6.jpg");
        imgArraylist.add("https://i.postimg.cc/SNpT5ZwG/cha7.jpg");
        imgArraylist.add("https://i.postimg.cc/Hxyzv5zK/cha9.jpg");
        imgArraylist.add("https://i.postimg.cc/L8DMKc7f/cha10.jpg");
        imgArraylist.add("https://i.postimg.cc/xTRRZ9G0/cha11.jpg");
        imgArraylist.add("https://i.postimg.cc/MGhbBHwY/krishna1.jpg");
        imgArraylist.add("https://i.postimg.cc/vmQSK7gH/ramapir.jpg");
        imgArraylist.add("https://i.postimg.cc/SNHnVVPC/ramapir1.jpg");
        imgArraylist.add("https://i.postimg.cc/HspYmmBK/b10-2.jpg");
        imgArraylist.add("https://i.postimg.cc/jSHJkv1h/w46-2.jpg");

//        ----------------------------- website vala pura ---------------------------------------------------------------------------------------------

//        -------------_________--------------------error vala------------------------------------____________-----------------------------------------------------

//        imgArraylist.add("https://i.postimg.cc/kXfCGRHw/le10n.jpg");
//        imgArraylist.add("https://i.postimg.cc/YSxYj8fS/w43-2.jpg");
//        imgArraylist.add("https://i.postimg.cc/KjfcgcZ1/kha.png");
//        imgArraylist.add("https://i.postimg.cc/kMWzG2T4/w63.jpg");
//        imgArraylist.add("https://i.postimg.cc/hPrY8HWR/w64.jpg");
//        imgArraylist.add("https://i.postimg.cc/SQXQvfQP/w55.jpg");
//        imgArraylist.add("https://i.postimg.cc/2yV9n2Yn/r3.jpg");
//        imgArraylist.add("https://i.postimg.cc/Y9sss1DM/dur1.jpg");
//        imgArraylist.add("https://i.postimg.cc/3xZfn667/w25.jpg");
//        imgArraylist.add("https://i.postimg.cc/QtF3CNRN/g2.jpg");
//        imgArraylist.add("https://i.postimg.cc/kXXsCGZL/w68.jpg");
//        imgArraylist.add("https://i.postimg.cc/L6tpcycx/w59.jpg");
//        imgArraylist.add("https://i.postimg.cc/HxcqHZyV/g4.jpg");
//        imgArraylist.add("https://i.postimg.cc/6Q71Xq7B/w65.jpg");
//        imgArraylist.add("https://i.postimg.cc/QCs3C15Q/w73.jpg");
//        imgArraylist.add("https://i.postimg.cc/J0QLbszr/le9n.jpg");
//        imgArraylist.add("https://i.postimg.cc/JhgKQKNZ/cha8.jpg");
//        imgArraylist.add("https://i.postimg.cc/P5zypBDB/ka2.jpg");
//        imgArraylist.add("https://i.postimg.cc/bvBcx4nw/w60.jpg");
//        imgArraylist.add("https://i.postimg.cc/nL6BQc3V/w51.jpg");

//        --------------_________-------------------error vala-------------------------------------_____________------------------------------------------------


//-------------------------------------- Google Drive Vala All -----------------------------------------------------------------------------------------------------------------

//        imgArraylist.add("https://drive.google.com/file/d/1ntXVM07HRiY_KlSjW-WROBlXkTTX8VeY/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/17UC9XYyqWfPrxMT0PB0Q0etVXVVTN_QI/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1JTg6D9BlcUO5iQC96pUiymlwCIQOmv_2/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1lIhO18HJtX4iBnM85KjV6qeAiILTOWJy/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1OyghpmScf-hc-ahCGFru8K4z04cm_F3g/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1RhtJ6ErRTYaoUK5R9ENEIe9J-KxAy2_c/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1sH0dJd02t9juJZmR5iwNzkIjQTGwAF6m/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1N-uHWkugmfL4NeBLlgPTygnIWve3_4Hm/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1rO6hh7rvtR97ijtCx8F21Oc3NkUe5jzb/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1spiBnyvBgkRGb2NuEr63hTTQhd9tZQEe/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1shjhA1Q8XlLlI1fxBE8au-Eu7si_K26d/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1mlDWzqMbGnRwt-dtbhr_8eFUd6D2rzDa/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1UzfZNE_gSpzGROfp7fGcWLYDJ3iIBlcQ/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1q5EediOkRORWWsZFPDmkmz7M6QKX7nd9/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1IYsR0zgi-QWxHtnJvRyuqMZ0NrTmT752/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1-kS6Pxu0mN3reXeqjwXyffdAXs36P5PX/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1ntXVM07HRiY_KlSjW-WROBlXkTTX8VeY/view?usp=sharing");
//
//
//        imgArraylist.add("https://drive.google.com/file/d/1QId4Y2BURsyXA8D7sdh-ek1qislRUP0Z/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1brvwEdqNCH3Zzt1L2K1zWSsl5zrikNrF/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1A6SYqY5BD_i5foyLF_CrKz-9TMK_5sLB/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1ovOl7OesM7IH3HHGlLgI6zAS6bKipM0c/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1QgkgW1hVNM3ZVuVODcbIiEePA0E2uSTz/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1FOoLutaiErepXKKryC2IFbTV55-AmA92/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1KjIoHho0IPQ_h1BnvTwjwepPA7djhhuT/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/19YvGxOFf4nkIhUFmYrUv3e9YC3MnlZY2/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1rRIX-cgpUnq2tZoTl66m9W0dEN-Tk8Xv/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1EOVY_Nxi4eXZ9g8BwCLL-DgoF6FJrVYZ/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/16qJ9tCJssdiBsKkvnGbnN9LAqNUez4t1/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1sI-6Yqbu-nqdKec6Z7M8fIvERSFbswn4/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1qKYgtyGdCnrGbV0crWsN-qCYWRDK6h0f/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1sRwH2fh4WsFS8B0SlFqT57utvQx1bAcD/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1PdhWfGX3XoYecvkAoq9NhFCNcrMICy_o/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1a_jXwMnHz8iLRBBZ14wQN-wI28_elvgi/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1IFoRI_d0GzMLtGeYLCTtosYkPdPCCiIE/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1PM2AeaDQ0noOcl9u85zs7UycoNJjbq-T/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1BFWY0aHbHIJCuMMFKEz8EPG0U0nzZTzF/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1VTg-oW2K3-7hfKgqh9UjFju76mMaAhsg/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1a-zX6-54FR1dGHlVF2WaJ-B7hcaWbBB1/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/11H4-B8E2EUeF6mP6eZteANfV688aZ8nf/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1WYcd36G7pGpbXrFCoOUMvK3E66b1XzaL/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1Lpslp2WXiq-pBMvXp5WzFdbMkVe0mj67/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/14o5ixnqv941N9iqRbNWo3Ihs0tkPA6UB/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1wOqc213KZvBP3uS0XFp_cgatGjTuiR0R/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1Iq6mvslsVR2H_X08wV9Mcat6Buo6k1qU/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1bdgG0MuztjMh1Re6t-V8NnL7M1cZCieZ/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1AvQYdJksgKMGXgubFANCJpmsvu3TNlRh/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1POu73FcmzR5CMxqmBa1DcrbBGRpVf2SL/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1LTM1zYfLVbGk7donczv6YxbN88Wist5L/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1DliSOD0F4m_ZudijvCpBUCNKz9PoFFpp/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1745HkkNsfjYVVe164275TLanOXoVEX4g/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1N6-aZv-qWFTN_QUhwWiA9yx02hhUqIQM/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1lPuBlwWzq-cjUiFCQICLs24VyGgxfuGa/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1_cWMoECdJlO5JENenv7_ArG4IQCx849w/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1_SJCCPR9Q3DrK8p1HAZM8OL8RG9LAtTI/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1i7iKx58kQP__J-PeNONYKqFR2oJd16qc/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1RKLm5_k1lFLrzhfz8twSmHMYad4TjbDm/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1UZRijEKb8alRLb_jsT3rAWkgbmAiIOFE/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1HDsdNopRJYeYNTZmiF2PoKoHF1RUH5eC/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1D6SQJkGt_OXbbRfURhP4gKqt-xpqKYd9/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/11il-o29FzKlGTWfYv_A1kiuSJvw0BuGO/view?usp=sharing");
//
//
//        imgArraylist.add("https://drive.google.com/file/d/1OI7JogZ5VDsOp-d4jSUwutluDGYb7VYS/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1C-orPed3vDIveM2SyGKjaHeja9nGXz45/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1T94fQCya4W8XTRNFyXtCLxlYONDoi1ub/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1gY7O-re1VYnAMsuPpdLU-JycZI0enPfN/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1U5ruGf2t8CpWZZvBrGTYGgf13yxuu8Pr/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1UP4zoMo80gPBZyi_d6X8mIatg7yfmF-f/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1KkXA0qWFlmfLb6Jh17K0JGzFTbUi79h0/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1swwx4K8NrnSM4eqW0QgnBXyzwPX-if7S/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1d876_IHeTi2pQyfViZXHVqdwfnYviI0T/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1-YiVybfThS-GZyrUcq6q8E1CBNpG6R7l/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1pFmgOhJKN9WOIAv0bzeQkC51la9s93Qb/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1vIoFSfsDN5eydP7FMwXinytXh6rcArG-/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1VDsg3UuUs7yai7M_n-oDQVEvaQ_n76VR/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1d1OpjJF0I8TFyW_UB3INz-cLuq0MGNi5/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1ikeyXnbusOJU9n9kssRBw-LHXZ5o34sq/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1F7NGEi3l2w63lPWg51dBDBW5U3HfsbXS/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1pem83zPWWMk5J-Cu1cJeUUgnUfNnm4XQ/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1K1h-rmIwJ7YWt0_BTvtvmWUdcoYB15Xf/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1X_tz9aPqH7Ntp8tX6Z5iH0DApn4yyPFj/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/14YI1W3XEbZsLMYK7JbpQ_xjWp2iX1rU8/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1Zi_1BNKzVZpgdbq4jKRdYNu31d0pfC-p/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1ne7fYoApAPE9jpx5LsNrLL7tCxysuF8h/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1ng4Ly-yP3xa61rKbN2YEnF1JYU2nJJf0/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1LBXpDnjiaY16sU7m6HkYfj4WkyvC4aQp/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1i1C6Byq89cgEGv571HnAZk8pdcB2AqFF/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/15HaA8ktLiyrEZh5xlYkXB9V1fDx1_qXH/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/18BarZRhoB9Xjjh_uDYm5L73lEdCOlOoC/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1vA3UrxFPD93-3Gd5cICtUAjxHwWrBlKH/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1B-OAGmAgWUurzNAkigH1atwRYE1FJLNO/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1YNA1LDZAZIfttprl7QXJjf8i7pQ1pre5/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1JxUwmueBPAuvSFjUU-k4rf3hZtuXLE8y/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1smt03fLKBQmAXIqHOrrBNY1pkVitxVS2/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1PdrtKZjFc8OeiWVfUIiwzJvJ2CZd1VkO/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/13k_ydFCLICTWBXZJe5hGDW0qRhAy0hP_/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1whsdtvWK-kO1G_1uHxGgfEMOHRVgATlI/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1YhmwD7P8rF07gxww8MqSsUvbIlsj8Ii-/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1TZoNB7fGeAb8--XNaxYXeC_nDrkG_cDO/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1t6hk7NvB4LBtiemOZJIY3NvFS2idIqCy/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1RLaFh2kAsKU0f-oSGF6TNKRHUO6blt2x/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1vCqE5M_pyYD04ruyfAPmClvkhvrBPp4C/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1rpqBTJFOl3JgZY7Md0RyJ6A6jXeKcTPD/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1Avs95R6M-5apP_DWWargOUFZ9p3jCrTd/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1thoJ6IlC83PCSrUYA2iF-0UiXh3EQdL-/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1fP81tM0B8wu_rHuD9NhArhPyrlRQ5v7P/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1YWypktuMxzkg17UQ7wkoGCZpftfQseLI/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1t4EENEm487DQrcRbTzbYTZ6tj0rkI_Rn/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/10Z4jAFXbJIM87a7iL-uLvsPhtp8lO_P_/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1QSCXl3u36cJk4DARi14eehcCB1W6MJ5Z/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1VBjzfGqgl3_McL-lNIF7GP7syOwAVtD-/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/18ahsabiU5qW1EABuhwn7qKa-TQkVIG8E/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1jOgYnzD_qyQTAJHlt9CKb323yuMkftN7/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/12DOai16Q9ZOxwiT7wwgDE7kRWjyC83e1/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1Dq0fk9V-cdeJgV17uwC31GASCIF2tPHM/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1TWxgjPGqlyWr_s2wEjpJkYhIPhn9EXl5/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/12FgHqPqQEFzb_u1lhMLBJOlysGF39oKQ/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/15ReTbrETc_WTBKLS43VnuNXmLqpz0WS7/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1gEQpurHSvDfMt-zEUvn3Dyy6roD-LuQr/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1MVj2-hOLjXr6UbOiuu6xhGoOQbz-2bQi/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/15cX6ZDO8iD7tLvCzsoNmBD8wusQbD-NK/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1MXkdTqa1CYBVLNbjicEDM3yFAyiOdg9N/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1R6EbKz2Sidib3Y_jMSGg8nU1X3zZJjaK/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1NihsCuMhOwAVqrIY-uJu8CLG89b3sxRC/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1JEpWXWUy4JGLqexUSFRCRuPVfsloW8CE/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1X5PNAKFQSi-tPYv9to0cSrqQ-VnqPJrk/view?usp=sharing");
//        imgArraylist.add("https://drive.google.com/file/d/1o3wcYZRjjymRZ86h6Twzcg2j8v0GloOE/view?usp=sharing");

//        -------------------------------- Google Drive Vala Pura ------------------------------------------------------------------------------------------------------------------



        rcvMain = findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new GridLayoutManager(this,2));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(SecondPage.this,imgArraylist);
        rcvMain.setAdapter(recyclerViewAdapter);
    }

//    @Override
//    public void onBackPressed() {
//
//        if (backPressedTime + 2000 > System.currentTimeMillis()){
//            backToast.cancel();
//            super.onBackPressed();
//            finish();
//        }else {
//            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
//            backToast.show();
//        }
//
//        backPressedTime = System.currentTimeMillis();
//
//
//    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SecondPage.this,middale.class);
        startActivity(intent);
        finish();
    }
}