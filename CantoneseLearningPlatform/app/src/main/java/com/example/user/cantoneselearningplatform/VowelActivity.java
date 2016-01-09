package com.example.user.cantoneselearningplatform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VowelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_vowel);

        Button pass_button = (Button)this.findViewById(R.id.setting_button);
        pass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VowelActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}
