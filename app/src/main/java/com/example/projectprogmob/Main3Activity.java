package com.example.projectprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    implements ProteinFragment.SendMessage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button btnPress = findViewById(R.id.buttonTesFragment);
        btnPress.setOnClickListener(new onCreateView().OnClickListener);(
            @Override
                    Public void onClick(View view) (
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai", "ParamProgmobers");
                ft.replace (R.id.FrameMain, proteinFragment);
                ft.commit();

    }

    }
}
