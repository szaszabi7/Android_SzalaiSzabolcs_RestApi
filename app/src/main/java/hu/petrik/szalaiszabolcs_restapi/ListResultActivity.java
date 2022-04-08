package hu.petrik.szalaiszabolcs_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import hu.petrik.szalaiszabolcs_restapi.databinding.ActivityListResultBinding;
import hu.petrik.szalaiszabolcs_restapi.databinding.ActivityMainBinding;

public class ListResultActivity extends AppCompatActivity {

    ActivityListResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnVissza.setOnClickListener(view -> {
            Intent intent = new Intent(ListResultActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}