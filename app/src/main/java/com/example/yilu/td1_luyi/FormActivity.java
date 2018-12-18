package com.example.yilu.td1_luyi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Yi LU on 2018/12/5.
 */

public class FormActivity extends AppCompatActivity{
    Button saveButton;
    EditText editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }
    public void initViews(){
        saveButton = findViewById(R.id.activity_form_button);
        editTextName = findViewById(R.id.activity_main_textview_name);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

    private void saveData(){
/*
        Intent intent = new Intent();
        intent.putExtra("USERNAME",editTextName.getText().toString());
        setResult(RESULT_OK,intent);
*/
        String name = editTextName.getText().toString();
        if(!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }else{
            Toast.makeText(this,
                    "Veuillez saisir votre nom",
                    Toast.LENGTH_SHORT)
                    .show();
        }


        finish();
    }

}
