package com.example.user.cantoneselearningplatform;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.Image;
import android.net.ConnectivityManager;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class ExerciseActivity extends Activity {

    TextToSpeech t1;
    String initial;
    String vowel;
    String ans_init = "f";
    String ans_vowel = "aa";
    CustomKeyboard mCustomKeyboard;
    String[] globalInitArray = {" "};
    String[] globalVowelArray ={" "};
    public Integer globalTaskInt = 1;
    public Integer globalHintInt = 1;
    EditText et1;
    EditText et2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        final ImageView img = (ImageView) findViewById(R.id.imageView);
        final View v1 = findViewById(R.id.TwoToFour);
        int[] et1XY = new int[2];
        int et1Y;
        int[] et2XY = new int[2];
        int et2X;
        int et2Y;
        int[] btnXY = new int[2];
        int btnX;
        int btnY;

        mCustomKeyboard= new CustomKeyboard(ExerciseActivity.this, R.id.keyboardview, R.xml.keyboard );
        mCustomKeyboard.registerEditText(R.id.editText);
        mCustomKeyboard.registerEditText(R.id.editText2);

        final Button confirm_button = (Button) this.findViewById(R.id.confirmButton);
        confirm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        et1.setVisibility(View.GONE);
        et2.setVisibility(View.GONE);
        img.setVisibility(View.GONE);
        confirm_button.setVisibility(View.GONE);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(new Locale("zh", "HK"));
                }
            }
        });

        final Button soundButton = (Button) findViewById(R.id.soundButton);

        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = soundButton.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.setSpeechRate(0.5f);
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                et1.setVisibility(View.VISIBLE);
                et2.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
                confirm_button.setVisibility(View.VISIBLE);
            }
        });

        final Button confirmButton = (Button) findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                initial = et1.getText().toString();
                vowel = et2.getText().toString();
                if (checkAnswer(initial, vowel, ans_init,ans_vowel)) {
                    Intent intent = new Intent(ExerciseActivity.this, ExerciseActivity.class);
                    startActivity(intent);
                }
                else{
                }
            }
        });
    }

    @Override
    protected void onResume() {
        globalInitArray =  ((MyApp)getApplication()).getInitArray();
        globalVowelArray =  ((MyApp)getApplication()).getVowelArray();
        globalTaskInt =  ((MyApp)getApplication()).getTaskInt();
        globalHintInt =  ((MyApp)getApplication()).getHintInt();
        setTask(et1, et2, globalTaskInt);
        setHints(et1, et2, globalHintInt);
        Log.d("All called","");
        super.onResume();
    }

    @Override public void onBackPressed() {
        if( mCustomKeyboard.isCustomKeyboardVisible() ) mCustomKeyboard.hideCustomKeyboard(); else this.finish();
    }

    public boolean checkAnswer(String init, String vowel, String ans_init_check,String ans_vowel_check) {

        if (init.equalsIgnoreCase(ans_init_check)){
            if (vowel.equalsIgnoreCase(ans_vowel_check)){
                return true;
            }else {
                new AlertDialog.Builder(ExerciseActivity.this)
                            .setTitle("韻母錯誤")
                            .setMessage("請重填答案 ")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
//                                     continue with delete
                                }
                            })
                            .show();
                return false;
            }
        }else {
            new AlertDialog.Builder(ExerciseActivity.this)
                    .setTitle("聲母錯誤")
                    .setMessage("請重填答案 ")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
//                                     continue with delete
                        }
                    })
                    .show();
            if (vowel.equalsIgnoreCase(ans_vowel_check)){
            }else {
                new AlertDialog.Builder(ExerciseActivity.this)
                        .setTitle("韻母錯誤")
                        .setMessage("請重填答案 ")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
//                                     continue with delete
                            }
                        })
                        .show();
            }
            return false;
        }
    }
    public void setTask(EditText et1,EditText et2, Integer decision){
        switch (decision) {
            case 0:
                //do nothing
                break;
            case 1:
                et2.setText(ans_vowel);
                et2.setEnabled(false);
                break;
            case 2:
                et1.setText(ans_init);
                et1.setEnabled(false);
                break;
            case 3:
                //do nothing as both init and vowel are needed to be filled.
                break;
        }
    }
    public void setHints(EditText et1,EditText et2, Integer decision) {
        switch (decision) {
            case 0:
                //do nothing
                break;
            case 1:
                et2.setHint(ans_vowel);
                Log.d("Hint", "" + ans_vowel);
                break;
            case 2:
                et1.setHint(ans_init);
                Log.d("Hint",""+ans_init);
                break;
            case 3:
                et2.setHint(ans_vowel);
                et1.setHint(ans_init);
                break;
        }
    }

}
