package com.topsus.espeedboat_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.topsus.espeedboat_android.adapter.SpeedboatAdapter;

import java.util.ArrayList;
import java.util.List;

public class SpeedboatListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SpeedboatAdapter speedboatAdapter;

    List<String> speedBoat, kapasitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speedboat_list);

        speedBoat = new ArrayList<>();
        speedBoat.add("CASPLA 1");
        speedBoat.add("CASPLA 2");
        speedBoat.add("CASPLA 3");
        speedBoat.add("CASPLA 4");
        speedBoat.add("CASPLA 5");
        speedBoat.add("CASPLA 6");
        speedBoat.add("CASPLA 7");
        speedBoat.add("CASPLA 8");
        speedBoat.add("CASPLA 9");

        kapasitas = new ArrayList<>();
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");
        kapasitas.add("Kapasitas: 100 Orang");

        recyclerView = findViewById(R.id.recycler1);
        speedboatAdapter = new SpeedboatAdapter(speedBoat,kapasitas,this);
        recyclerView.setAdapter(speedboatAdapter);
    }
}