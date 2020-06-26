package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent, implicitintent1, implicitintent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitintent = findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);

        implicitintent1 = findViewById(R.id.implicitintent1);
        implicitintent1.setOnClickListener(this);

        implicitintent2 = findViewById(R.id.implicitintent2);
        implicitintent2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent(this, MainActivity2.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent1:
                Intent implicit1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://amikom.ac.id"));
                startActivity(implicit1);
                break;
            case R.id.implicitintent2:
                Intent implicit2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0854646435"));
                startActivity(implicit2);
            default:
                break;
        }
    }
}