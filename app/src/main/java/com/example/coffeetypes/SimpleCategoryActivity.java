package com.example.coffeetypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_category_layout);

        ArrayAdapter<DrinkSimple> adapterSimple = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, DrinkSimple.simpleDrinks);

        ListView simpleListMenu = (ListView)findViewById(R.id.simple_list_menu);
        simpleListMenu.setAdapter(adapterSimple);

        AdapterView.OnItemClickListener simpleItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SimpleCategoryActivity.this, SimpleActivity.class);
                intent.putExtra(SimpleActivity.EXTRA_SIMPLE, (int) id);
                startActivity(intent);
            }
        };

        simpleListMenu.setOnItemClickListener(simpleItemClickListener);
    }
}
