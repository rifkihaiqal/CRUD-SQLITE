package com.example.haiqal.crudsqlitehaiqallanjutan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class perpusmahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpusmahasiswa);
    }

    public void formulir (View view) {
        startActivity(new Intent(perpusmahasiswa.this, formulir.class));
    }

    public void anggota (View view) {
        startActivity(new Intent(perpusmahasiswa.this,formlogin2.class));
    }
}