package com.example.yilu.td1_luyi;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewName;
    Button buttonEdition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewName = findViewById(R.id.activity_main_textview_name);
        buttonEdition = findViewById(R.id.activity_main_button_edit);

        buttonEdition.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK && data.getExtras() != null){
                Bundle args = data.getExtras();
                String name = args.getString("USERNAME");
                textViewName.setText(name);
            } else {

            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.activity_main_button_edit:
                Intent intent = new Intent(this,FormActivity.class);
                startActivityForResult(intent,1);
                break;
        }
    }
}
