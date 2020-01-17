package com.ad.dibbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class EmergencyActivity extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        pdfView= findViewById(R.id.pdfView);

        pdfView.fromAsset("pdfInstruction.pdf")
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .load();
    }
}
