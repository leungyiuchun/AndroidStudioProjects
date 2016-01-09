package com.example.user.cantoneselearningplatform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button  play_button = (Button)this.findViewById(R.id.play_button);
        Button  setting_button = (Button)this.findViewById(R.id.setting_button);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setting_button = (Button)findViewById(R.id.setting_button);
        setting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                Log.d("Set button", "Done");
            }
        });

        play_button = (Button)findViewById(R.id.play_button);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
                startActivity(intent);
                Log.d("Play button", "Done");

            }
        });
    }

    @Override
    protected void onResume() {
        checkInternet();
        super.onResume();
    }

    public void checkInternet(){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm.getActiveNetworkInfo() != null){
        }else {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("無法連到網路")
                    .setMessage("請開啟Wi-Fi或數據連線 ")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                        }
                    })
                    .show();
        }

    }
}
