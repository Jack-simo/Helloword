package com.oneplus.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这是一行注释注释注释，哈哈哈哈哈哈哈哈
        ImageView imageView = new ImageView(this);
    }
}
