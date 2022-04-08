package hu.petrik.szalaiszabolcs_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import hu.petrik.szalaiszabolcs_restapi.databinding.ActivityInsertBinding;
import hu.petrik.szalaiszabolcs_restapi.databinding.ActivityListResultBinding;

public class InsertActivity extends AppCompatActivity {

    ActivityInsertBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInsertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnVissza.setOnClickListener(view -> {
            Intent intent = new Intent(InsertActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}