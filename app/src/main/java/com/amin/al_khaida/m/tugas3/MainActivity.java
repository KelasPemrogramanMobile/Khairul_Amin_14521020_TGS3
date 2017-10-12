package com.amin.al_khaida.m.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText txtNama, txtAlamat,txtPassword, txtTglLahir;
    private Spinner Sp_Agama;
    private RadioGroup rdg_jenisKelamin;
    private RadioButton rdb_Button;
    private Button btnKirim;

    String nama,alamat,ttl,password,agama,btnJenisKelamin;
    int jeniskelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (EditText)findViewById(R.id.nama);
        txtAlamat = (EditText) findViewById(R.id.alamat);
        txtTglLahir = (EditText) findViewById(R.id.tglLahir);
        txtPassword = (EditText) findViewById(R.id.Password);
        rdg_jenisKelamin = (RadioGroup) findViewById(R.id.radioGrup);
        Sp_Agama = (Spinner) findViewById(R.id.sp_agama);
        btnKirim = (Button) findViewById(R.id.btnambildata);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama            = txtNama.getText().toString();
                alamat          = txtAlamat.getText().toString();
                ttl             = txtTglLahir.getText().toString();
                agama           = Sp_Agama.getSelectedItem().toString();
                jeniskelamin    = rdg_jenisKelamin.getCheckedRadioButtonId();
                rdb_Button      = (RadioButton) findViewById(jeniskelamin);
                btnJenisKelamin = rdb_Button.getText().toString();


                Intent go = new Intent(MainActivity.this, hasil.class);
                go.putExtra("Nama", nama);
                go.putExtra("Alamat", alamat);
                go.putExtra("Ttl", ttl);
                go.putExtra("Password", password);
                go.putExtra("JenisKelamin", btnJenisKelamin);
                go.putExtra("Agama", agama);
                startActivity(go);

                finish();

            }
        });



    }
}
