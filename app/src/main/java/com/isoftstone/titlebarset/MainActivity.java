package com.isoftstone.titlebarset;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.isoftstone.styletitle.TitleBarView;


public class MainActivity extends AppCompatActivity {

    private TitleBarView ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"111",Toast.LENGTH_SHORT).show();
        ct = (TitleBarView) findViewById(R.id.ct);
        ct.setRight_button_text("");
        ct.setLeft_button_margin(20);
        ct.setRight_button_imageId(R.drawable.add_gongzhonghaoliebiao);
        ct.setLeft_button_imageId(R.drawable.add_gongzhonghaoliebiao);
        ct.setOnTitleClickListener(new TitleBarView.TitleOnClickListener() {
            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this, "点击了左边的返回按钮", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightClick() {
                Toast.makeText(MainActivity.this, "点击了右边的返回按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

