package com.example.coffeetypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MilkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.milk_category_layout);

        ArrayAdapter<DrinkMilk> adapterMilk = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, DrinkMilk.milkDrinks);

        ListView milkListMenu = (ListView)findViewById(R.id.milk_list_menu);
        milkListMenu.setAdapter(adapterMilk);

        AdapterView.OnItemClickListener milkItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MilkCategoryActivity.this, MilkActivity.class);
                intent.putExtra(MilkActivity.EXTRA_MILK, (int) id);
                startActivity(intent);
            }
        };

        milkListMenu.setOnItemClickListener(milkItemClickListener);
    }
}
