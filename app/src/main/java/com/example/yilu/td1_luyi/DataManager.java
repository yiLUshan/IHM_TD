package com.example.yilu.td1_luyi;

import java.util.ArrayList;

/**
 * Created by Yi LU on 2018/12/12.
 */

public class DataManager {
    private static DataManager INSTANCE;
    private ArrayList<String> list;

    private DataManager(){
        list = new ArrayList<>();
    }

    public static DataManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void addName(String name){
        list.add(name);
    }
}
