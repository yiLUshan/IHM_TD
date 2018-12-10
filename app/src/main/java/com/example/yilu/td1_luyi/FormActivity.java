package com.example.yilu.td1_luyi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Yi LU on 2018/12/5.
 */

public class FormActivity extends AppCompatActivity{
    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }
    public void initViews(){
        saveButton = findViewById(R.id.activity_form_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

    public void saveData(){
        Intent intent = new Intent();
        intent.putExtra("USERNAME","Bob");

        setResult(RESULT_OK);
    }
}
