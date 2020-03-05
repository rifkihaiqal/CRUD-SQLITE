package com.example.haiqal.crudsqlitehaiqallanjutan;


import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;
    private TextView textViewUserEmail;
    private Button buttonLogout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonLogout = (Button) findViewById(R.id.sign_out);
        buttonLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonLogout) {
            firebaseAuth.signOut();
            startActivity(new Intent(this, login.class));
        }
    }

    public void perpustakaan(View view) {
        startActivity(new Intent(MainActivity.this, perpustakaan.class));
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah anda yakin ingin keluar dari aplikasi ini? ");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.alertbox);

        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        tombolkeluar.show();
    }


}