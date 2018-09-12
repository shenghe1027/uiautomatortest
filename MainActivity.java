package com.example.administrator.uiautomatortest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button hello_btn;
    private Button second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_btn = findViewById(R.id.hello_btn);
        second = findViewById(R.id.second);
        hello_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hello_btn:
                Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second:
                Toast.makeText(MainActivity.this, "222", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
