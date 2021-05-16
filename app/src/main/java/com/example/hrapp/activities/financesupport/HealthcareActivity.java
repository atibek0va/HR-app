package com.example.hrapp.activities.financesupport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.hrapp.R;
import com.example.hrapp.activities.Doctors;
import com.example.hrapp.fragment.FinanceFragment;
import com.example.hrapp.fragment.PsychFragment;

public class HealthcareActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcare);
        initViews();
        onClicked();
    }

    public void initViews(){
        toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);

        btnBack = findViewById(R.id.back);
    }
    public void onClicked(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthcareActivity.this, FinanceFragment.class));
            }
        });
    }
}