package com.example.user.bakatanak;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class HomePage extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.activity_home_page);

        final EditText editText = (EditText) findViewById(R.id.namaAnak);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        Button button_mulai = (Button) findViewById(R.id.mulai_App);
        button_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Nama = (EditText) findViewById(R.id.namaAnak);
                String textToPass = Nama.getText().toString();

                Intent  i = new Intent(HomePage.this, Pertanyaan.class);
                i.putExtra("Nama", textToPass);
                startActivity(i);
            }
        });
    }
}

