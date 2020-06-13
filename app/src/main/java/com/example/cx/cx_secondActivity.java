package com.example.cx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class cx_secondActivity extends AppCompatActivity {
    private Spinner spap;
    private Spinner spap2;
    private Spinner spap3;
    private  String[] date;
    private  String[] date2;
    private  String[] date3;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cx_second);
        spap =findViewById(R.id.sp_ap);
        spap2 =findViewById(R.id.sp_ap2);
        spap3 =findViewById(R.id.sp_ap3);
        //为数据源设置值
        date = new String[]
                {"学历",
                        "大专及以上",
                        "二本",
                        "一本",
                        "研究生",
                        "硕士及以上"};
        //创建数组适配器
        adapter = new ArrayAdapter<String>(this,R.layout.cx_spinner,date);
        // 给下拉列表控件设置适配器
        spap.setAdapter(adapter);
        date2 = new String[]
                {"性别需求",
                        "男",
                        "女",};
        //创建数组适配器
        adapter = new ArrayAdapter<String>(this,R.layout.cx_spinner,date2);
        // 给下拉列表控件设置适配器
        spap2.setAdapter(adapter);
        date3 = new String[]
                {"年龄需求",
                        "25以下",
                        "25-35",
                        "35以上",
                        "不限"
                };
        //创建数组适配器
        adapter = new ArrayAdapter<String>(this,R.layout.cx_spinner,date3);
        // 给下拉列表控件设置适配器
        spap3.setAdapter(adapter);


    }
}



