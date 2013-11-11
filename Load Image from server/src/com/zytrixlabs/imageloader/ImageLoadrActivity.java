package com.zytrixlabs.imageloader;

import com.myimageloader.ImageLoaderImageView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageLoadrActivity extends Activity {
    /** Called when the activity is first created. */
    ImageView  mImageView;
    
    ImageLoaderImageView mImageLoaderImageView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mImageView=(ImageView)findViewById(R.id.imageview);
        
        mImageLoaderImageView=new ImageLoaderImageView(ImageLoadrActivity.this);
        
        mImageLoaderImageView.DisplayImage("http://zytrixlabs.com/projects/voynew/public/uploads/profile/pic.png", ImageLoadrActivity.this, mImageView);
        
        
        
        
       
        
        
        
        
        
    }
}