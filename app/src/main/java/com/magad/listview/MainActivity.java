package com.magad.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

// data array
    String[] contacnama = {"Tebe","rizki","Mukhlas","Magadir"};
    String[] numberphone = {"081234512312367","045674312113","081280195460","00000000001"};
    int[] imagec = {R.drawable.payment,R.drawable.shoppin,R.drawable.shopping,R.drawable.custo};

    // Variable listview
    ListView lv;
    // Key
    String name = "namkontak";
    String number = "nohp";
    String image = "imagecontak";
   //1st Lifecycle method Function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi
        lv = findViewById(R.id.contac);
        //Menampung list aarray hashmap / object
        List<HashMap<String, String>> listContact = new ArrayList<HashMap<String, String>>();
        // looping lenght data
        for (int i = 0; i < 4; i++) {
            //a class yang berisi sekumpulan pasangan nilai key dan value
            HashMap<String, String> hm = new HashMap<String, String>();

            hm.put(name, contacnama[i]);
            hm.put(number, numberphone[i]);
            hm.put(image, Integer.toString(imagec[i]));

            //menambahkan kumpulan key dan value ke list array(listcontact) hashmap
            listContact.add(hm);
        }

        String[] from = {name, number, image};
        int[] to = {R.id.tv,R.id.tv_pjone, R.id.icoffn};
        //adapter list view
        SimpleAdapter simpleAdapter = new SimpleAdapter(MainActivity.this, listContact, R.layout.main_contact, from, to);
        lv.setAdapter(simpleAdapter);
    }
}
