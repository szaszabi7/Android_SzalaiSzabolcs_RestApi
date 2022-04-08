package hu.petrik.szalaiszabolcs_restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.LauncherApps;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hu.petrik.szalaiszabolcs_restapi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnListazas.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListResultActivity.class);
            startActivity(intent);
            finish();
        });

        binding.btnUj.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, InsertActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private void init() {
    }
}