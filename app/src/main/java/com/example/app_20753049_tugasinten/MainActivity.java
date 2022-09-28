package com.example.app_20753049_tugasinten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnProfil, btnTentang, btnHubungisaya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfil = findViewById(R.id.btnProfil);
        btnHubungisaya = findViewById(R.id.btnHubungisaya);
        btnTentang = findViewById(R.id.btnTentang);

        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(i);
            }
        });

        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TentangSaya.class);
                startActivity(i);
            }
        });
        
        btnHubungisaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "082246658913";
                Intent Panggil = new Intent(Intent.ACTION_DIAL);
                Panggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(Panggil);

            }
        });

    }
}