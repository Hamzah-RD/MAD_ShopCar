package com.example.shopcar.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.shopcar.Domain.CarDomain;
import com.example.shopcar.databinding.ActivityDetailBinding;

import java.text.NumberFormat;
import java.util.Locale;

public class DetailActivity extends AppCompatActivity {
ActivityDetailBinding binding;
CarDomain object;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getIntentExtra() ;
        setVariable();
    }

    private void setVariable() {
        binding.backbtn.setOnClickListener(v -> finish());

        binding.titleTxt.setText(object.getTitle());
        binding.descriptionTxt.setText(object.getDescrition());
        binding.totalCapacityTxt.setText(object.getTotalCapacity());
        binding.highSpeedTxt.setText(object.getHighestSpeed());
        binding.enginOutputTxt.setText(object.getEngineOutput());
        binding.priceTxt.setText("$" + NumberFormat.getNumberInstance(Locale.US).format(object.getPrice()));
       // binding.ratingTxt.setText(String.valueOf(object.) );

        Glide.with(DetailActivity.this)
                .load(object.getPicUrl())
                .into(binding.pic);

    }

    private void getIntentExtra() {
        object=(CarDomain) getIntent().getSerializableExtra("object");
    }
}