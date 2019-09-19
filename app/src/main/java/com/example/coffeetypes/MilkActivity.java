package com.example.coffeetypes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MilkActivity extends AppCompatActivity {

    public static final String EXTRA_MILK = "milkId";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.milk_layout);

        int milkId = (Integer)getIntent().getExtras().get(EXTRA_MILK);
        DrinkMilk drinkMilk = DrinkMilk.milkDrinks[milkId];

        TextView nameMilk = (TextView)findViewById(R.id.name_milk);
        nameMilk.setText(drinkMilk.getName());

        TextView descriptionMilk = (TextView)findViewById(R.id.description_milk);
        descriptionMilk.setText(drinkMilk.getDescription());

        ImageView photoMilk = (ImageView)findViewById(R.id.photo_milk);
        photoMilk.setImageResource(drinkMilk.getImageId());
        photoMilk.setContentDescription(drinkMilk.getName());
    }
}
