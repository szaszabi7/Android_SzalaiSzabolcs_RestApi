package hu.petrik.szalaiszabolcs_restapi;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import hu.petrik.szalaiszabolcs_restapi.databinding.ActivityListResultBinding;

public class ListResultActivity extends AppCompatActivity {

    ActivityListResultBinding binding;
    List<City> cities = new ArrayList<>();

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