package com.example.user.cantoneselearningplatform;

import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class SettingActivity extends AppCompatActivity {

    String ssssss[];
    TextView init_tv;
    TextView vowel_tv;
    TextView task_tv;
    TextView hints_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        init_tv = (TextView)findViewById(R.id.tv2_initial);
        vowel_tv = (TextView)findViewById(R.id.tv2_vowel);
        task_tv = (TextView)findViewById(R.id.tv2_task);
        hints_tv = (TextView)findViewById(R.id.tv2_hints);

        Button pass_button = (Button)this.findViewById(R.id.setting_button);
        pass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        final Button init_button = (Button)this.findViewById(R.id.tv_initial);
        init_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogFragment InitialDialog = new InitialFragment();
                InitialDialog.show(getFragmentManager(),"dialog");
//                Intent intent = new Intent(SettingActivity.this, InitialActivity.class);
//                startActivity(intent);
            }
        });

        final Button vowel_button = (Button)this.findViewById(R.id.tv_vowel);
        vowel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment VowelDialog = new VowelFragment();
                VowelDialog.show(getFragmentManager(), "dialog");
            }
        });

        final Button task_button = (Button)this.findViewById(R.id.tv_task);
        task_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Task","clicked");
                DialogFragment taskDialog = new TaskFragment();
                taskDialog.show(getFragmentManager(),"dialog");
            }
        });

        final Button hints_button = (Button)this.findViewById(R.id.tv_hints);
        hints_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment hintsDialog = new HintsFragment();
                hintsDialog.show(getFragmentManager(),"dialog");

            }
        });
    }

    @Override
    protected void onResume() {
        init_tv.setText(Arrays.toString(((MyApp)getApplication()).getInitArray()));
        vowel_tv.setText(Arrays.toString(((MyApp)getApplication()).getVowelArray()));

        super.onResume();
//        if (displayed==false){init_tv.setText(Arrays.toString(initArray));}


    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void setInitArray(String[] array){
        ((MyApp)getApplication()).setInitArray(array);
    }
    public void setVowelArray(String[] array){
        ((MyApp)getApplication()).setVowelArray(array);
    }
    public void setTaskInt(Integer taskInt){((MyApp)getApplication()).setTaskInt(taskInt);}
    public void setHintInt(Integer hintInt){
        ((MyApp)getApplication()).setHintInt(hintInt);
    }
}
