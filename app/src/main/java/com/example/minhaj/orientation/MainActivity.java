package com.example.minhaj.orientation;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.layout);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d("tag","config");
        updateUi(newConfig.orientation);
    }

    private void updateUi(int orientation) {
        Log.d("tag","update");
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d("tag","land scape");
            LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
            layoutParams1.width = LinearLayout.LayoutParams.WRAP_CONTENT;
            layoutParams1.weight = 0;
            btn1.setLayoutParams(layoutParams1);

            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
            layoutParams2.width = LinearLayout.LayoutParams.WRAP_CONTENT;
            layoutParams2.weight = 0;
            btn1.setLayoutParams(layoutParams2);

            btn1.invalidate();
            btn2.invalidate();
        }else {
            LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
            layoutParams1.width = 0;
            layoutParams1.weight = 1;
            btn1.setLayoutParams(layoutParams1);

            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.weight = 1;
            btn1.setLayoutParams(layoutParams2);

            btn1.invalidate();
            btn2.invalidate();
        }
    }
}
