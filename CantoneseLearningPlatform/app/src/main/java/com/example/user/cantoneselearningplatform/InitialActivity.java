package com.example.user.cantoneselearningplatform;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class InitialActivity extends AppCompatActivity {
    public int array_index =0;
    public String[] display = new String[19];
    public boolean init_1_clicked=false;
    public boolean init_1_input=false;
    public boolean init_2_clicked=false;
    public boolean init_2_input=false;
    public boolean init_3_clicked=false;
    public boolean init_3_input=false;
    public boolean init_4_clicked=false;
    public boolean init_4_input=false;
    public boolean init_5_clicked=false;
    public boolean init_5_input=false;
    public boolean init_6_clicked=false;
    public boolean init_6_input=false;
    public boolean init_7_clicked=false;
    public boolean init_7_input=false;
    public boolean init_8_clicked=false;
    public boolean init_8_input=false;
    public boolean init_9_clicked=false;
    public boolean init_9_input=false;
    public boolean init_10_clicked=false;
    public boolean init_10_input=false;
    public boolean init_11_clicked=false;
    public boolean init_11_input=false;
    public boolean init_12_clicked=false;
    public boolean init_12_input=false;
    public boolean init_13_clicked=false;
    public boolean init_13_input=false;
    public boolean init_14_clicked=false;
    public boolean init_14_input=false;
    public boolean init_15_clicked=false;
    public boolean init_15_input=false;
    public boolean init_16_clicked=false;
    public boolean init_16_input=false;
    public boolean init_17_clicked=false;
    public boolean init_17_input=false;
    public boolean init_18_clicked=false;
    public boolean init_18_input=false;
    public boolean init_19_clicked=false;
    public boolean init_19_input=false;
    public boolean found = false;
    public Integer foundIndex =0;
    public String[] passArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_initial);

        final TextView displayArrayTextView = (TextView)this.findViewById(R.id.displayArray);

        Button pass_button = (Button)this.findViewById(R.id.setting_button);
        pass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitialActivity.this, SettingActivity.class);
                intent.putExtra("Initial Array",passArray);
                startActivity(intent);

            }
        });
        final Button init_1_button = (Button)this.findViewById(R.id.init_1_button);
        init_1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_1_clicked = change(init_1_clicked, init_1_input, init_1_button.getText().toString(), init_1_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_2_button = (Button)this.findViewById(R.id.init_2_button);
        init_2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_2_clicked = change(init_2_clicked, init_2_input, init_2_button.getText().toString(), init_2_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_3_button = (Button)this.findViewById(R.id.init_3_button);
        init_3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_3_clicked = change(init_3_clicked, init_3_input, init_3_button.getText().toString(), init_3_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_4_button = (Button)this.findViewById(R.id.init_4_button);
        init_4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_4_clicked = change(init_4_clicked, init_4_input, init_4_button.getText().toString(), init_4_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_5_button = (Button)this.findViewById(R.id.init_5_button);
        init_5_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_5_clicked = change(init_5_clicked, init_5_input, init_5_button.getText().toString(), init_5_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_6_button = (Button)this.findViewById(R.id.init_6_button);
        init_6_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_6_clicked = change(init_6_clicked, init_6_input, init_6_button.getText().toString(), init_6_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_7_button = (Button)this.findViewById(R.id.init_7_button);
        init_7_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_7_clicked = change(init_7_clicked, init_7_input, init_7_button.getText().toString(), init_7_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_8_button = (Button)this.findViewById(R.id.init_8_button);
        init_8_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_8_clicked = change(init_8_clicked, init_8_input, init_8_button.getText().toString(), init_8_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_9_button = (Button)this.findViewById(R.id.init_9_button);
        init_9_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_9_clicked = change(init_9_clicked, init_9_input, init_9_button.getText().toString(), init_9_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        final Button init_10_button = (Button) this.findViewById(R.id.init_10_button);
        init_10_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_10_clicked = change(init_10_clicked, init_10_input, init_10_button.getText().toString(), init_10_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_11_button = (Button)this.findViewById(R.id.init_11_button);
        init_11_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_11_clicked = change(init_11_clicked, init_11_input, init_11_button.getText().toString(), init_11_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_12_button = (Button)this.findViewById(R.id.init_12_button);
        init_12_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_12_clicked = change(init_12_clicked, init_12_input, init_12_button.getText().toString(), init_12_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_13_button = (Button)this.findViewById(R.id.init_13_button);
        init_13_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_13_clicked = change(init_13_clicked, init_13_input, init_13_button.getText().toString(), init_13_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_14_button = (Button)this.findViewById(R.id.init_14_button);
        init_14_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_14_clicked = change(init_14_clicked, init_14_input, init_14_button.getText().toString(), init_14_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_15_button = (Button)this.findViewById(R.id.init_15_button);
        init_15_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_15_clicked = change(init_15_clicked, init_15_input, init_15_button.getText().toString(), init_15_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_16_button = (Button)this.findViewById(R.id.init_16_button);
        init_16_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_16_clicked = change(init_16_clicked, init_16_input, init_16_button.getText().toString(), init_16_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_17_button = (Button)this.findViewById(R.id.init_17_button);
        init_17_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_17_clicked = change(init_17_clicked, init_17_input, init_17_button.getText().toString(), init_17_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_18_button = (Button)this.findViewById(R.id.init_18_button);
        init_18_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_18_clicked = change(init_18_clicked, init_18_input, init_18_button.getText().toString(), init_18_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });

        final Button init_19_button = (Button)this.findViewById(R.id.init_19_button);
        init_19_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_19_clicked = change(init_19_clicked, init_19_input, init_19_button.getText().toString(), init_19_button);
                passArray = ArrayDisplay(display, displayArrayTextView);
                Log.d("Display array", "" + Arrays.toString(passArray));
            }
        });
        Log.d("Display array", "" + Arrays.toString(passArray));

    }

    public boolean change(boolean clicked, boolean input, String msg,Button button){
        boolean click_status = clicked;
        boolean input_status = input;
        String button_text =msg;
        Button  button1 = button;

        if (click_status){
            button.setBackgroundColor(Color.parseColor("#F7BCBC"));
            button.setTextColor(Color.parseColor("#5E3434"));
            deleteArray(msg);
            click_status = false;

            return click_status;
        }else{
            button.setBackgroundColor(Color.parseColor("#7D5050"));
            button.setTextColor(Color.parseColor("#FFFFFF"));
            click_status = true;
            addArray(msg);
            return click_status;
        }
    }
    public void addArray(String add) {

        display[array_index] = add;
        array_index++;

        if (Integer.compare(array_index,20) == 0)
        {
            new AlertDialog.Builder(InitialActivity.this)
                    .setTitle("已選聲母已到限制數量")
                    .setMessage("請重按某聲母以刪除 ")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })

                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }

    public void deleteArray(String del) {
        int delIndex;
        int i;

        for (i = 0; i < array_index; i++) {
            if (display[i] == del) {
                found = true;
                break;
            } else {
                found = false;

            }
        }
        delIndex = i;
        if (found) {
            for (int k = delIndex; k < array_index; k++) {
            display[k] = display[k+1];
             display[k+1]=null;
                array_index--;
            }
        }
    }
    public String[] ArrayDisplay(String[] DisplayArray, TextView t1){
        t1.setVisibility(View.VISIBLE);

         String[] displayArray = new String[array_index];
        for (int i=0;i<array_index;i++){
            displayArray[i] = DisplayArray[i];
        }
        t1.setText(Arrays.toString(displayArray));
        if (DisplayArray[0] == null){
            t1.setVisibility(View.INVISIBLE);
        }
        return displayArray;
    }
}



