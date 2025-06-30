package com.example.shopcar.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.shopcar.R;
import com.example.shopcar.databinding.ActivityMainBinding;
import com.example.shopcar.databinding.ActivityProfileBinding;

public class ProfileActivity extends BaseActivity {
ActivityProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding=ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backbtn.setOnClickListener(view -> finish());

    }
}