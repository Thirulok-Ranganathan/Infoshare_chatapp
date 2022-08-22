package com.techerra.infoshare.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techerra.infoshare.R;
import com.techerra.infoshare.databinding.ActivitySignOutBinding;

public class SignOutActivity extends AppCompatActivity {

    private ActivitySignOutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignOutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.accountLogin.setOnClickListener(v -> onBackPressed());
    }

}