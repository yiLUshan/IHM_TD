package com.example.yilu.td1_luyi;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button buttonEdition;
    RecyclerView recyclerView;
    NameListAdapter nameListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameListAdapter = new NameListAdapter();

        initViews();
        initList();
    }
/*
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
*/

    @Override
    protected void onResume() {
        super.onResume();
        nameListAdapter.updateList(DataManager.getInstance().getList());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.activity_main_button_edit:
                Intent intent = new Intent(this,FormActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void initViews(){
        buttonEdition = findViewById(R.id.activity_main_button_edit);
        recyclerView = findViewById(R.id.activity_main_recyclerview);

        buttonEdition.setOnClickListener(this);
    }

    private void initList(){
        final LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nameListAdapter);
    }
}
