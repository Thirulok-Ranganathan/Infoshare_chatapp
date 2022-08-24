package com.techerra.infoshare.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techerra.infoshare.R;
import com.techerra.infoshare.databinding.ActivityChatBinding;
import com.techerra.infoshare.databinding.ActivityUserBinding;
import com.techerra.infoshare.models.User;
import com.techerra.infoshare.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }
    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }
    private void setListeners() {
        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}