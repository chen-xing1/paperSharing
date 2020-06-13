package com.example.cx;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class cx_MainActivity extends AppCompatActivity {
    private Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cx_activity_main);
        btn = (Button) findViewById(R.id.mButton);
        btn2 = (Button) findViewById(R.id.mButton1);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cx_MainActivity.this, cx_secondActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cx_MainActivity.this, cx_thirdActivity.class);
                startActivity(intent);
            }
        });

    }
}
