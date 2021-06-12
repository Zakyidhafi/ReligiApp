package com.zakyidhafi.religiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvRukun;
    private ArrayList<Rukun> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRukun = findViewById(R.id.rv_rukun);
        rvRukun.setHasFixedSize(true);

        list.addAll(RukunData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvRukun.setLayoutManager(new LinearLayoutManager(this));
        ListRukunAdapter listRukunAdapter = new ListRukunAdapter(list);
        rvRukun.setAdapter(listRukunAdapter);

        listRukunAdapter.setOnItemClickCallback(new ListRukunAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Rukun rukun) {
                Intent moveIntent = new Intent(MainActivity.this, DetailRukun.class);
                moveIntent.putExtra(DetailRukun.ITEM_EXTRA, rukun);
                startActivity(moveIntent);
            }
        });
    }

}