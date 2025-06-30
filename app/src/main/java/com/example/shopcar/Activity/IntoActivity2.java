package com.example.shopcar.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.shopcar.databinding.ActivityInto2Binding;

public class IntoActivity2 extends BaseActivity {

    ActivityInto2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInto2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.startbtn.setOnClickListener(v -> {
            startActivity(new Intent(IntoActivity2.this, MainActivity.class));
            finish();
        });
    }
}