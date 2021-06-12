package com.zakyidhafi.religiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRukun extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rukun);

        ImageView imgRukun = findViewById(R.id.imgRukun);
        TextView tvRukunName = findViewById(R.id.tvRukunName);
        TextView tvRukunDetail = findViewById(R.id.tvRukunDetail);
        TextView tvRukunDalil = findViewById(R.id.tvRukunDalil2);

        Rukun rukun = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (rukun != null) {
            Glide.with(this)
                    .load(rukun.getPhoto())
                    .into(imgRukun);

            tvRukunName.setText(rukun.getName());
            tvRukunDetail.setText(rukun.getDetail());
            tvRukunDalil.setText(rukun.getDalil());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Rukun Islam");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}