package com.saisreenivas.inputcontrols.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sellectedItems;
    private Button showTheSellected;
    private CheckBox DogBox, CatBox, DragonBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sellectedItems = (TextView) findViewById(R.id.showSellected);
        showTheSellected = (Button) findViewById(R.id.sellectBtn);
        DragonBox = (CheckBox) findViewById(R.id.dragonNameId);
        CatBox = (CheckBox) findViewById(R.id.catNameId);
        DogBox = (CheckBox) findViewById(R.id.dogNameId);

        showTheSellected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(DogBox.getText() + " is sellected: " + DogBox.isChecked() + "\n");
                stringBuilder.append(CatBox.getText() + " is sellected: " + CatBox.isChecked() + "\n");
                stringBuilder.append(DragonBox.getText() + " is sellected: " + DragonBox.isChecked() + "\n");

                sellectedItems.setText(stringBuilder);
            }
        });
    }
}
