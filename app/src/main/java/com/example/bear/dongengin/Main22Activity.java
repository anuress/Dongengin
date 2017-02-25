package com.example.bear.dongengin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main22Activity extends AppCompatActivity {

    int indexGen = Main2Activity.q;
    int kd = Main2Activity.kode;
    String ttl = Main2Activity.judul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        TextView tittle = (TextView) findViewById(R.id.title);
        tittle.setText(ttl);
        TextView helloTxt = (TextView) findViewById(R.id.story);
        helloTxt.setText(readTxt(kd));

    }

    private String readTxt(int kode) {
        InputStream inputStream;
        if (indexGen == 1) {
            if (kode == 0) {
                inputStream = getResources().openRawResource(R.raw.kanciltimun);
            } else if (kode == 1) {
                inputStream = getResources().openRawResource(R.raw.kancil2);
            } else if (kode == 2) {
                inputStream = getResources().openRawResource(R.raw.kancil3);
            } else if (kode == 3) {
                inputStream = getResources().openRawResource(R.raw.timunmas);
            } else if (kode == 4) {
                inputStream = getResources().openRawResource(R.raw.bawangpr);
            } else if (kode == 5) {
                inputStream = getResources().openRawResource(R.raw.monkerbau);
            } else if (kode == 6) {
                inputStream = getResources().openRawResource(R.raw.sembelalang);
            } else if (kode == 7) {
                inputStream = getResources().openRawResource(R.raw.kelkur);
            } else {
                inputStream = getResources().openRawResource(R.raw.kancmon);
            }
        } else {
            if (kode == 0) {
                inputStream = getResources().openRawResource(R.raw.gembalaserigala);
            } else if (kode == 1) {
                inputStream = getResources().openRawResource(R.raw.urashimataro);
            } else if (kode == 2) {
                inputStream = getResources().openRawResource(R.raw.hansel);
            } else {
                inputStream = getResources().openRawResource(R.raw.daydreamer);
            }
        }

        System.out.println(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

        return byteArrayOutputStream.toString();
    }
}
