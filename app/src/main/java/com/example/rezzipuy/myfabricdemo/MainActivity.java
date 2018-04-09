package com.example.rezzipuy.myfabricdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

    }

    public void onClickCrash1(View v ){
        Button btn = null;
        btn.setText("Dead Sure");
    }

    public void onClickCrash2(View v ){
        Integer[] array = new Integer[]{1,2,3};
        Toast.makeText(MainActivity.this, "array[4]:" + array[4], Toast.LENGTH_SHORT).show();
    }

    public void onClickCrash3(View v ){
        View view = new View(this);
        Button btn = (Button)view;
        btn.setText("ok");
    }
}
