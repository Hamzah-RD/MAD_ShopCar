package com.example.shopcar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.shopcar.Adapter.CategoryAdapter;
import com.example.shopcar.Adapter.CarAdapter;
import com.example.shopcar.Domain.CategoryDomain;
import com.example.shopcar.Domain.CarDomain;
import com.example.shopcar.databinding.ActivityMainBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategoryList();
        initPopularList();
        bottomNavigation();
    }

    private void bottomNavigation() {

        binding.profilebtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
    }

    private void initCategoryList() {
        DatabaseReference myRef = database.getReference("Category");
        binding.progressBarcategroy.setVisibility(View.VISIBLE);

        ArrayList<CategoryDomain> items = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        items.add(issue.getValue(CategoryDomain.class));
                    }

                    if (!items.isEmpty()) {
                        binding.recyclerViewCategory.setLayoutManager(
                                new LinearLayoutManager(MainActivity.this,
                                        LinearLayoutManager.HORIZONTAL, false));
                        binding.recyclerViewCategory.setAdapter(new CategoryAdapter(items));
                        binding.recyclerViewCategory.setNestedScrollingEnabled(true);
                    }
                }
                binding.progressBarcategroy.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBarcategroy.setVisibility(View.GONE);
                Log.e("FirebaseError", "Category error", error.toException());
            }
        });
    }

    private void initPopularList() {
        DatabaseReference myref = database.getReference("Cars");
        binding.progressBarpopular.setVisibility(View.VISIBLE);

        ArrayList<CarDomain> items = new ArrayList<>();
        myref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot isuue : snapshot.getChildren()) {
                        items.add(isuue.getValue(CarDomain.class));
                    }

                    if (!items.isEmpty()) {
                        binding.recyclerViewpopular.setLayoutManager(
                                new GridLayoutManager(MainActivity.this,2));

                        binding.recyclerViewpopular.setAdapter(new CarAdapter(items));

                        binding.recyclerViewpopular.setNestedScrollingEnabled(true);
                    }
                }
                binding.progressBarpopular.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBarpopular.setVisibility(View.GONE);
                Log.e("FirebaseError", "Popular error", error.toException());
            }
        });
    }
}