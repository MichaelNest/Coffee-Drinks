package com.example.coffeetypes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AlcoActivity extends AppCompatActivity {

    public static final String EXTRA_ALCO = "alcoId";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alco_layout);

        int alcoId = (Integer)getIntent().getExtras().get(EXTRA_ALCO);
        DrinkAlco drinkAlco = DrinkAlco.alkoDrinks[alcoId];

        TextView nameAlco = (TextView)findViewById(R.id.name_alco);
        nameAlco.setText(drinkAlco.getName());

        TextView descriptionAlco = (TextView)findViewById(R.id.description_alco);
        descriptionAlco.setText(drinkAlco.getDescription());

        ImageView photoAlco = (ImageView)findViewById(R.id.photo_alco);
        photoAlco.setImageResource(drinkAlco.getImageId());
        photoAlco.setContentDescription(drinkAlco.getName());
    }
}
