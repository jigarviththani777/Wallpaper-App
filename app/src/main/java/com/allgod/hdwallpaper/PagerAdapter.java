package com.allgod.hdwallpaper;

import android.Manifest;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {

    WallpaperPagerActivity wallpaperPagerActivity;
    ArrayList<String> allImageList;
//    private String url;
//    Dialog dialog;

    public PagerAdapter(WallpaperPagerActivity wallpaperPagerActivity, ArrayList<String> allImageList){
        this.allImageList=allImageList;
        this.wallpaperPagerActivity=wallpaperPagerActivity;
    }

    @Override
    public int getCount() {
        return allImageList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull  View view, @NonNull  Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(wallpaperPagerActivity).inflate(R.layout.pager_adapter_item,container,false);

        ImageView imageView;
        AppCompatButton setWallpaper;
//        AppCompatButton download_btn;
        imageView=view.findViewById(R.id.pagerImg);
        setWallpaper=view.findViewById(R.id.set_wallpaper);

//        download_btn = view.findViewById(R.id.download_btn);

//        url = allImageList.get(position);

        Glide.with(wallpaperPagerActivity).load(allImageList.get(position)).into(imageView);

//        ss.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });

//        PRDownloader.initialize(getApplicationContext());


        setWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ConnectivityManager connectivityManager;
                connectivityManager = (ConnectivityManager)view.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);

                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

                if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()){
                    Toast.makeText(wallpaperPagerActivity, "Internet connection is not available!\nPlease connect your network...", Toast.LENGTH_SHORT).show();
                }else {
                    new setWallpaper().execute(allImageList.get(position));
                    Toast.makeText(wallpaperPagerActivity, "Your wallpaper should set shortly.\nPlease wait...", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        PRDownloader.initialize(download_btn.getContext());

//        download_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                checkPermission();
//            }
//        });

        container.addView(view);
        return view;
    }
////  get screenshot of the app
//    public static Bitmap getSceenShot(View view){
//        View screenview = view.getRootView();
//        screenview.setDrawingCacheEnabled(true);
//        Bitmap bitmap = Bitmap.createBitmap(screenview.getDrawingCache());
//        screenview.setDrawingCacheEnabled(false);
//        return bitmap;
//    }
////    store the image on the device
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
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

//    private void checkPermission(){
//        Dexter.withContext(this)
//                .withPermission(
//                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
//                        Manifest.permission.READ_EXTERNAL_STORAGE
//                ).withListener(new MultiplePermissionsListener(){
//            @Override
//            public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
//                if (multiplePermissionsReport.areAllPermissionsGranted()){
//                    downloadImage();
//                }else {
//                    Toast.makeText(wallpaperPagerActivity, "Plaease allow all Permission", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//
//            @Override
//            public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
//
//            }
//        }).check();
//    }

//    private void downloadImage(){
//
//        ProgressDialog pd = new ProgressDialog(WallpaperPagerActivity.class);
//        pd.setMessage("Downloading...");
//        pd.setCancelable(false);
//        pd.show();
//
//        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
//
//        PRDownloader.download(url, file.getPath(), URLUtil.guessFileName(url,null,null))
//                .build()
//                .setOnStartOrResumeListener(new OnStartOrResumeListener() {
//                    @Override
//                    public void onStartOrResume() {
//
//                    }
//                })
//                .setOnPauseListener(new OnPauseListener() {
//                    @Override
//                    public void onPause() {
//
//                    }
//                })
//                .setOnCancelListener(new OnCancelListener() {
//                    @Override
//                    public void onCancel() {
//
//                    }
//                })
//                .setOnProgressListener(new OnProgressListener() {
//                    @Override
//                    public void onProgress(Progress progress) {
//                        long per = progress.currentBytes*100 / progress.totalBytes;
//
//                        pd.setMessage("Downloading : "+per+" %");
//                    }
//                })
//                .start(new OnDownloadListener() {
//                    @Override
//                    public void onDownloadComplete() {
//                        Toast.makeText(wallpaperPagerActivity, "Downloading Complete", Toast.LENGTH_SHORT).show();
//                        pd.dismiss();
//                    }
//
//                    @Override
//                    public void onError(Error error) {
//                        Toast.makeText(wallpaperPagerActivity, "Error", Toast.LENGTH_SHORT).show();
//                        pd.dismiss();
//                    }
//                });
//
//    }

    @Override
    public void destroyItem(@NonNull  ViewGroup container, int position,@NonNull  Object object) {
        container.removeView((View)object);
    }

    class setWallpaper extends AsyncTask<String, Void, Bitmap>{

        Random random;
        int var;

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);

            Toast.makeText(wallpaperPagerActivity, "Wallpaper set successfully...", Toast.LENGTH_SHORT).show();
//            dialog = new Dialog(PagerAdapter.this);
//            dialog.setContentView(R.layout.custom_dialog);
//            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//            dialog.setCancelable(false);
//
//            Button okey = dialog.findViewById(R.id.ok);
//
//            okey.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    dialog.dismiss();
//                }
//            });
//            dialog.show();

        }



        @Override
        protected Bitmap doInBackground(String... urls) {
            random = new Random();
            var = random.nextInt(10000);

            try{
                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);
                WallpaperManager myWallpaperManager = WallpaperManager.getInstance(wallpaperPagerActivity.getApplicationContext());

                try {
                    myWallpaperManager.setBitmap(myBitmap);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            return null;
        }
    }

}
