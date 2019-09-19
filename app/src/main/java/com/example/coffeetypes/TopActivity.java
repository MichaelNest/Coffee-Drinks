package com.example.coffeetypes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_layout);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 : {
                        Intent intent = new Intent(TopActivity.this, AlcoCategoryActivity.class);
                        startActivity(intent);

                    }break;
                    case 1 : {
                        Intent intent = new Intent(TopActivity.this, MilkCategoryActivity.class);
                        startActivity(intent);

                    }break;
                    case 2 : {
                        Intent intent = new Intent(TopActivity.this, SimpleCategoryActivity.class);
                        startActivity(intent);

                    }break;
                }
            }
        };

        ListView topListMenu = (ListView)findViewById(R.id.top_list_menu);
        topListMenu.setOnItemClickListener(itemClickListener);
    }
}
