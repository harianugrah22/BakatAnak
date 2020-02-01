package com.example.user.bakatanak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent intent = getIntent();

        String text = intent.getStringExtra("Nama");
        TextView textView = (TextView) findViewById(R.id.Nama);
        textView.setText(text);

        final int Pengusaha_1 = Integer.parseInt(intent.getStringExtra("Pengusaha"));
        final int Seniman_1 = Integer.parseInt(intent.getStringExtra("Seniman"));
        final int Pengajar_1 = Integer.parseInt(intent.getStringExtra("Pengajar"));
        final int Dokter_1 = Integer.parseInt(intent.getStringExtra("Dokter"));
        final int Polisi_1 = Integer.parseInt(intent.getStringExtra("Polisi"));

        if (Pengusaha_1>=Seniman_1 && Pengusaha_1>=Pengajar_1 && Pengusaha_1>=Dokter_1 && Pengusaha_1>=Polisi_1){
            TextView Potensi = (TextView) findViewById(R.id.Potensi);
            TextView Keterangan = (TextView) findViewById(R.id.Hasil);
            Keterangan.setText("Pengertian pengusaha adalah seseorang yang melakukan kegiatan atau aktivitas wirausaha yang dicirikan sebagai orang yang berbakat dalam mengatur dan mengelola suatu bisnis yang sedang dijalankan. Jadi, pada dasarnya seorang pengusaha itu harus mempunyai kemampuan dalam dirinya untuk berfikir secara kreatif dan imajinatif saat terdapat sebuah peluang bisnis baru. Di samping itu, ia juga harus bisa memberdayakan dirinya sendiri untuk kepentingan dan kebaikan sekitarnya, bukan malah memanfaatkan kondisi sekitarnya demi kepentingan dirinya sendiri.");
            if (Seniman_1==Pengusaha_1){
                Potensi.setText("Pengusaha / Seniman");
            } else if (Pengajar_1==Pengusaha_1){
                Potensi.setText("Pengusaha / Pengajar");
            } else if (Dokter_1==Pengusaha_1){
                Potensi.setText("Pengusaha / Dokter");
            } else if (Polisi_1==Pengusaha_1){
                Potensi.setText("Pengusaha / Polisi");
            } else {
                Potensi.setText("Pengusaha");
            }
        } else if(Seniman_1>=Pengajar_1 && Seniman_1>=Dokter_1 && Seniman_1>=Polisi_1){
            TextView Potensi = (TextView) findViewById(R.id.Potensi);
            TextView Keterangan = (TextView) findViewById(R.id.Hasil);
            Keterangan.setText("Seniman adalah istilah subyektif yang merujuk kepada seseorang yang kreatif, inovatif, atau mahir dalam bidang seni. Penggunaan yang paling kerap adalah untuk menyebut orang-orang yang menciptakan karya seni, seperti lukisan, patung, seni peran, seni tari, sastra, film dan musik. Seniman menggunakan imajinasi dan bakatnya untuk menciptakan karya dengan nilai estetik.");
            if (Pengajar_1==Seniman_1){
                Potensi.setText("Seniman / Pengajar");
            } else if (Dokter_1==Seniman_1){
                Potensi.setText("Seniman / Dokter");
            } else if (Polisi_1==Seniman_1){
                Potensi.setText("Seniman / Polisi");
            } else {
                Potensi.setText("Seniman");
            }
        } else if (Pengajar_1>=Dokter_1 && Pengajar_1>=Polisi_1){
            TextView Potensi = (TextView) findViewById(R.id.Potensi);
            TextView Keterangan = (TextView) findViewById(R.id.Hasil);
            Keterangan.setText("Pengajar adalah seseorang yang mengajarkan ilmu. Pengajar umumnya merujuk pendidik profesional dengan tugas utama mendidik, mengajar, membimbing, mengarahkan, melatih, menilai, dan mengevaluasi peserta didik.");
            if (Dokter_1==Pengajar_1){
                Potensi.setText("Pengajar / Dokter");
            } else if (Polisi_1==Pengajar_1){
                Potensi.setText("Pengajar / Polisi");
            } else{
                Potensi.setText("Pengajar");
            }
        } else if (Dokter_1>=Polisi_1){
            TextView Potensi = (TextView) findViewById(R.id.Potensi);
            TextView Keterangan = (TextView) findViewById(R.id.Hasil);
            Keterangan.setText("Dokter adalah seseorang yang karena keilmuannya berusaha menyembuhkan orang-orang yang sakit. Tidak semua orang yang menyembuhkan penyakit bisa disebut dokter. Untuk menjadi dokter biasanya diperlukan pendidikan dan pelatihan khusus dan mempunyai gelar dalam bidang kedokteran. ");
            if (Polisi_1==Dokter_1){
                Potensi.setText("Dokter / Polisi");
            } else{
                Potensi.setText("Dokter");
            }
        } else{
            TextView Potensi = (TextView) findViewById(R.id.Potensi);
            TextView Keterangan = (TextView) findViewById(R.id.Hasil);
            Keterangan.setText("Polisi adalah suatu pranata umum sipil yang menjaga ketertiban, keamanan dan penegakan hukum diseluruh wilayah negara. Kepolisian adalah salah satu lembaga penting yang memainkan tugas utama sebagai penjaga keamanan, ketertiban dan penegakan hukum, sehingga lembaga kepolisian pasti lah ada di seluruh negara berdaulat.");
            Potensi.setText("Polisi");
        }

        TextView textView1 = (TextView) findViewById(R.id.Hasil_Pengusaha);
        textView1.setText("Pengusaha :  " + Pengusaha_1 + "/10");
        TextView textView2 = (TextView) findViewById(R.id.Hasil_Seniman);
        textView2.setText("Seniman :  " + Seniman_1 + "/10");
        TextView textView3 = (TextView) findViewById(R.id.Hasil_Pengajar);
        textView3.setText("Pengajar :  " + Pengajar_1 + "/10");
        TextView textView4 = (TextView) findViewById(R.id.Hasil_Dokter);
        textView4.setText("Dokter :  " + Dokter_1 + "/10");
        TextView textView5 = (TextView) findViewById(R.id.Hasil_Polisi);
        textView5.setText("Polisi :  " + Polisi_1 + "/10");

        Button button_mulai = (Button) findViewById(R.id.Baru);
        button_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hasil.this, HomePage.class));
            }
        });
    }
}
