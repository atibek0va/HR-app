package com.example.hrapp.activities.financesupport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.hrapp.R;
import com.example.hrapp.fragment.FinanceFragment;

public class TransportActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
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
                startActivity(new Intent(TransportActivity.this, FinanceFragment.class));
            }
        });
    }
}