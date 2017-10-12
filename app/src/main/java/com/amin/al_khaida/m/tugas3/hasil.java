package com.amin.al_khaida.m.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends AppCompatActivity {
    TextView  textNama, textAlamat, textTtl, textPassword, textAgama, textJk;
    Intent nama, alamat, ttl, password, agama, JenisKelamin;
    String strNama, strAlamat, strTtl, strPassword, strAgama, strJk;
    Button btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        textNama        = (TextView) findViewById(R.id.txtnama);
        textAlamat      = (TextView) findViewById(R.id.txtalamat);
        textJk          = (TextView) findViewById(R.id.txtJenisKelamin);
        textTtl         = (TextView) findViewById(R.id.txtTglLahir);
        textAgama       = (TextView) findViewById(R.id.txtAgama);
        textPassword    = (TextView) findViewById(R.id.txtPassword);
        btnback         = (Button) findViewById(R.id.btnkembali);


        nama    = getIntent();
        strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        alamat      = getIntent();
        strAlamat   = alamat.getStringExtra("Alamat");
        textAlamat.setText(strAlamat);

        ttl     = getIntent();
        strTtl  = ttl.getStringExtra("Ttl");
        textTtl.setText(strTtl);

        password    = getIntent();
        strPassword = password.getStringExtra("Password");
        textPassword.setText(strPassword);

        agama       = getIntent();
        strAgama    = agama.getStringExtra("Agama");
        textAgama.setText(strAgama);

        JenisKelamin      = getIntent();
        strJk   = JenisKelamin.getStringExtra("JenisKelamin");
        textJk.setText(strJk);


        btnback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(hasil.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}
