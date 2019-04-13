package com.choirul.latihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nama, alamat, nomor;
    private String ipt_nama, ipt_alamat, ipt_nomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        nomor = findViewById(R.id.nomor);
    }

    public void regist(View view){
        Intent regist = new Intent(this, Main2Activity.class);
        ipt_nama = nama.getText().toString();
        ipt_alamat = alamat.getText().toString();
        ipt_nomor = nomor.getText().toString();
        regist.putExtra("nama", ipt_nama);
        regist.putExtra("alamat", ipt_alamat);
        regist.putExtra("nomor", ipt_nomor);

        startActivity(regist);
        finish();

    }
}
