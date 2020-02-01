package com.example.user.bakatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pertanyaan_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan_8);

        Intent intent = getIntent();
        final String text = intent.getStringExtra("Nama");
        final int Pengusaha_1 = Integer.parseInt(intent.getStringExtra("Pengusaha"));
        final int Seniman_1 = Integer.parseInt(intent.getStringExtra("Seniman"));
        final int Pengajar_1 = Integer.parseInt(intent.getStringExtra("Pengajar"));
        final int Dokter_1 = Integer.parseInt(intent.getStringExtra("Dokter"));
        final int Polisi_1 = Integer.parseInt(intent.getStringExtra("Polisi"));


        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RGroup8);

        Button button_next = (Button) findViewById(R.id.buttonNext_8);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(selectedId);
                final String nilai = (String) radioButton.getText();

                if (nilai.equals("Setuju")){
                    String Pengusaha1T= String.valueOf(Pengusaha_1+0);
                    String Seniman1T= String.valueOf(Seniman_1+3);
                    String Pengajar1T= String.valueOf(Pengajar_1+0);
                    String Dokter1T= String.valueOf(Dokter_1+0);
                    String Polisi1T= String.valueOf(Polisi_1+0);

                    Intent  i = new Intent(Pertanyaan_8.this, Pertanyaan_9.class);
                    i.putExtra("Nama", text);
                    i.putExtra("Pengusaha",Pengusaha1T);
                    i.putExtra("Seniman",Seniman1T);
                    i.putExtra("Pengajar",Pengajar1T);
                    i.putExtra("Dokter",Dokter1T);
                    i.putExtra("Polisi",Polisi1T);
                    startActivity(i);
                } else if (nilai.equals("Kurang Setuju")){
                    String Pengusaha1T= String.valueOf(Pengusaha_1+0);
                    String Seniman1T= String.valueOf(Seniman_1+1);
                    String Pengajar1T= String.valueOf(Pengajar_1+0);
                    String Dokter1T= String.valueOf(Dokter_1+0);
                    String Polisi1T= String.valueOf(Polisi_1+0);

                    Intent  i = new Intent(Pertanyaan_8.this, Pertanyaan_9.class);
                    i.putExtra("Nama", text);
                    i.putExtra("Pengusaha",Pengusaha1T);
                    i.putExtra("Seniman",Seniman1T);
                    i.putExtra("Pengajar",Pengajar1T);
                    i.putExtra("Dokter",Dokter1T);
                    i.putExtra("Polisi",Polisi1T);
                    startActivity(i);
                } else if (nilai.equals("Tidak Setuju")){
                    String Pengusaha1T= String.valueOf(Pengusaha_1+0);
                    String Seniman1T= String.valueOf(Seniman_1+0);
                    String Pengajar1T= String.valueOf(Pengajar_1+0);
                    String Dokter1T= String.valueOf(Dokter_1+0);
                    String Polisi1T= String.valueOf(Polisi_1+0);

                    Intent  i = new Intent(Pertanyaan_8.this, Pertanyaan_9.class);
                    i.putExtra("Nama", text);
                    i.putExtra("Pengusaha",Pengusaha1T);
                    i.putExtra("Seniman",Seniman1T);
                    i.putExtra("Pengajar",Pengajar1T);
                    i.putExtra("Dokter",Dokter1T);
                    i.putExtra("Polisi",Polisi1T);
                    startActivity(i);
                } else{
                    Toast.makeText(Pertanyaan_8.this,"Jawaban Belum Diisi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
