package com.example.abhinav.accessdenied;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ramotion.foldingcell.FoldingCell;

import spencerstudios.com.bungeelib.Bungee;

public class FAQs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar!=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_keyboard_backspace_black_24dp);
        actionBar.setTitle("FAQ's");
        final FoldingCell foldingCell1 = findViewById(R.id.folding_cell1);
        foldingCell1.initialize(30, 1000, R.color.BurlyWood, 0);
        foldingCell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foldingCell1.toggle(false);
            }
        });

        final FoldingCell foldingCell2 = findViewById(R.id.folding_cell2);
        foldingCell2.initialize(20, 1000, R.color.BurlyWood, 0);
        foldingCell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foldingCell2.toggle(false);
            }
        });
        final FoldingCell foldingCell3 = findViewById(R.id.folding_cell3);

        foldingCell3.initialize(20, 1000, R.color.BurlyWood, 0);

        foldingCell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foldingCell3.toggle(false);
            }
        });
        final FoldingCell foldingCell4 = findViewById(R.id.folding_cell4);

        foldingCell4.initialize(20, 1000, R.color.BurlyWood, 0);

        foldingCell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foldingCell4.toggle(false);
            }
        });
    }
    public boolean onSupportNavigateUp() {
        finish();

        return true;
    }
}
