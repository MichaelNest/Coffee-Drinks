package com.example.coffeetypes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleActivity extends AppCompatActivity {

    public static final String EXTRA_SIMPLE = "simpleId";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_layout);

        int simpleId = (Integer)getIntent().getExtras().get(EXTRA_SIMPLE);

        DrinkSimple drinkSimple = DrinkSimple.simpleDrinks[simpleId];

        TextView nameSimple = (TextView)findViewById(R.id.name_simple);
        nameSimple.setText(drinkSimple.getName());

        TextView descriptionSimple = (TextView)findViewById(R.id.description_simple);
        descriptionSimple.setText(drinkSimple.getDescription());

        ImageView photoSimple = (ImageView)findViewById(R.id.photo_simple);
        photoSimple.setImageResource(drinkSimple.getImageId());
        photoSimple.setContentDescription(drinkSimple.getName());
    }
}
