package com.shivichu.runtimetheme.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.shivichu.runtimetheme.R;
import com.shivichu.runtimetheme.utils.ThemeColors;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new ThemeColors(this);
        setContentView(R.layout.activity_main);

        mChange = findViewById(R.id.btn_change_theme);

        mChange.setOnClickListener(v->{
            changeTheme();
        });
    }

    private void changeTheme() {
        int red= new Random().nextInt(255);
        int green= new Random().nextInt(255);
        int blue= new Random().nextInt(255);
        ThemeColors.setNewThemeColor(MainActivity.this, red, green, blue);
    }
}
