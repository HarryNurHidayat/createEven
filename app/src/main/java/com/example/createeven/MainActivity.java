package com.example.createeven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btSingin;
    //Deklarasi variabel untuk EditText
    EditText edEmail, edPassword;
    //Deklarasi variabel untuk menyimpan email dan password
    String Email, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btsingin dengan componen button pada layout
        btSingin=findViewById(R.id.btSingin);
        //Menghubungkan variabel edmail dengan componen button pada layout
        edEmail=findViewById(R.id.edEmail);
        //menghubungkan variabel edpassword dengan componen button pada layout
        edPassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btsingin
        btSingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Menyimpan input user di edittext email kedalam variabel Email
                Email = edEmail.getText().toString();
                //Menyimpan input user di edittext Password kedalam varibel password
                Password = edPassword.getText().toString();
                // Membuat variabel toast dan membuat toast dengan menambahkan variabel email dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: "+Email+"dan password anda: "+Password+"", Toast.LENGTH_LONG);
                //Menampilkan toast
                t.show();
            }
        });




    }
}