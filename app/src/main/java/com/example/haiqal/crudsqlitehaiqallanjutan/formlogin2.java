package com.example.haiqal.crudsqlitehaiqallanjutan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class formlogin2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin2);
    }

    public void login2 (View view) {
        startActivity(new Intent(formlogin2.this, anggota.class));
    }
}