package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FlagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);

        ImageView flagImage = findViewById(R.id.image_flag);
        TextView countryName = findViewById(R.id.text_country_name);
        TextView capital = findViewById(R.id.text_country_capital);

        Intent intent = getIntent();
        Country country = intent.getParcelableExtra("countrydata");
        assert country != null;
        Picasso.get().load(country.getFlagLink()).into(flagImage);
        countryName.setText(country.getCountryName());
        capital.setText(country.getCapital());
    }
}
