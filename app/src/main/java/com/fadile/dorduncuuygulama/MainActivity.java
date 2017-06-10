package com.fadile.dorduncuuygulama;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

   LinearLayout ly;


    SeekBar kirmizi,mavi,yesil;



    int red,blue,green;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ly=(LinearLayout)findViewById(R.id.linear);
        kirmizi=(SeekBar) findViewById(R.id.kirmizi);
        mavi=(SeekBar) findViewById(R.id.mavi);
        yesil=(SeekBar) findViewById(R.id.yesil);


        // 0-255 arası değer alır
        kirmizi.setMax(255);
        mavi.setMax(255);
        yesil.setMax(255);

        //başlangıc değeri
        ly.setBackgroundColor(Color.rgb(red,green,blue));

        kirmizi.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //SeekBardan gelen değeri al
                red=progress;
                //arka plan rengini set et
                ly.setBackgroundColor(Color.rgb(red,green,blue));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


                
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mavi.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue=progress;
                ly.setBackgroundColor(Color.rgb(red,green,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        yesil.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green=progress;
                ly.setBackgroundColor(Color.rgb(red,green,blue));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });













    }
}
