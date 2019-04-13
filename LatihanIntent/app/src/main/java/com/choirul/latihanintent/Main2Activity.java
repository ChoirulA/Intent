package com.choirul.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String nama, alamat, nomor;
    private TextView name, address, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        nama = intent.getStringExtra(nama);
        alamat = intent.getStringExtra(alamat);
        nomor = intent.getStringExtra(nomor);

        name = findViewById(R.id.textView_nama);
        address = findViewById(R.id.textView_alamat);
        number = findViewById(R.id.textView_nomor);

        name.setText(nama);
        address.setText(alamat);
        number.setText(nomor);
    }

    public void Share(View view){
        Intent share = new Intent();
        share.setAction(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Nama : "+name+" Alamat : "+address+" Nomoh HP : "+number);
        share.setType("text/plain");
        startActivity(share);
    }

}
