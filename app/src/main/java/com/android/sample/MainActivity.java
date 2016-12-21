package com.android.sample;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.android.sample.widget.TextDrawable;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabPower = (FloatingActionButton) findViewById(R.id.fab);
        fabPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPowerDialog();
            }
        });


        TextDrawable drawable1 = TextDrawable.builder().beginConfig().fontSize(14).textColor(R.color.colorPrimaryDark).toUpperCase().endConfig().buildRect("MAnish", android.R.color.holo_green_light);
        //TextDrawable drawable1 = TextDrawable.builder().beginConfig().fontSize(14).textColor(R.color.colorPrimaryDark).toUpperCase().endConfig().buildRect("MAnish", android.R.color.holo_green_light);
        //TextDrawable drawable1 = TextDrawable.builder().beginConfig().fontSize(14).textColor(R.color.colorPrimaryDark).toUpperCase().endConfig().buildRect("MAnish", android.R.color.holo_green_light);
        //  .buildRound("P", Color.parseColor("#d32f2f"));
        ((ImageView) findViewById(R.id.ipower)).setImageDrawable(drawable1);
    }

    private void showPowerDialog() {
        FragmentManager fm = getFragmentManager();
        MyDialog powerDialog = new MyDialog();
        powerDialog.show(fm, "fragment_power");

    }
}
