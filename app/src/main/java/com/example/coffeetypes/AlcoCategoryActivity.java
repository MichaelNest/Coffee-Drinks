package com.example.coffeetypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AlcoCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alco_category_layout);

        ArrayAdapter<DrinkAlco> adapterAlco = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, DrinkAlco.alkoDrinks);

        ListView alcoListMenu = (ListView)findViewById(R.id.alco_list_menu);
        alcoListMenu.setAdapter(adapterAlco);

        AdapterView.OnItemClickListener alcoItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AlcoCategoryActivity.this, AlcoActivity.class);
                intent.putExtra(AlcoActivity.EXTRA_ALCO, (int)id);
                startActivity(intent);
            }
        };

        alcoListMenu.setOnItemClickListener(alcoItemClickListener);
    }
}
