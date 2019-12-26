package com.shadowhite.ujala.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.shadowhite.ujala.R;
import com.shadowhite.ujala.ujala.UjalaActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void ujalaClick(View view) {
        Intent intent=new Intent(HomeActivity.this, UjalaActivity.class);
        startActivity(intent);
    }
}
