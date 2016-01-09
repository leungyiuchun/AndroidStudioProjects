package com.example.user.cantoneselearningplatform;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VowelFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link VowelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VowelFragment extends DialogFragment {
    public boolean found = false;
    public String[] passArray;
    public int array_index =0;
    public String[] display = new String[61];
    public boolean vowel_1_clicked=false;
    public boolean vowel_2_clicked=false;
    public boolean vowel_3_clicked=false;
    public boolean vowel_4_clicked=false;
    public boolean vowel_5_clicked=false;
    public boolean vowel_6_clicked=false;
    public boolean vowel_7_clicked=false;
    public boolean vowel_8_clicked=false;
    public boolean vowel_9_clicked=false;
    public boolean vowel_10_clicked=false;
    public boolean vowel_11_clicked=false;
    public boolean vowel_12_clicked=false;
    public boolean vowel_13_clicked=false;
    public boolean vowel_14_clicked=false;
    public boolean vowel_15_clicked=false;
    public boolean vowel_16_clicked=false;
    public boolean vowel_17_clicked=false;
    public boolean vowel_18_clicked=false;
    public boolean vowel_19_clicked=false;
    public boolean vowel_20_clicked=false;
    public boolean vowel_21_clicked=false;
    public boolean vowel_22_clicked=false;
    public boolean vowel_23_clicked=false;
    public boolean vowel_24_clicked=false;
    public boolean vowel_25_clicked=false;
    public boolean vowel_26_clicked=false;
    public boolean vowel_27_clicked=false;
    public boolean vowel_28_clicked=false;
    public boolean vowel_29_clicked=false;
    public boolean vowel_30_clicked=false;
    public boolean vowel_31_clicked=false;
    public boolean vowel_32_clicked=false;
    public boolean vowel_33_clicked=false;
    public boolean vowel_34_clicked=false;
    public boolean vowel_35_clicked=false;
    public boolean vowel_36_clicked=false;
    public boolean vowel_37_clicked=false;
    public boolean vowel_38_clicked=false;
    public boolean vowel_39_clicked=false;
    public boolean vowel_40_clicked=false;
    public boolean vowel_41_clicked=false;
    public boolean vowel_42_clicked=false;
    public boolean vowel_43_clicked=false;
    public boolean vowel_44_clicked=false;
    public boolean vowel_45_clicked=false;
    public boolean vowel_46_clicked=false;
    public boolean vowel_47_clicked=false;
    public boolean vowel_48_clicked=false;
    public boolean vowel_49_clicked=false;
    public boolean vowel_50_clicked=false;
    public boolean vowel_51_clicked=false;
    public boolean vowel_52_clicked=false;
    public boolean vowel_53_clicked=false;
    public boolean vowel_54_clicked=false;
    public boolean vowel_55_clicked=false;
    public boolean vowel_56_clicked=false;
    public boolean vowel_57_clicked=false;
    public boolean vowel_58_clicked=false;
    public boolean vowel_59_clicked=false;
    public boolean vowel_60_clicked=false;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        int width = 1536;
//        int height = 2048;
//        getDialog();
//        Log.d("Dialog",""+getDialog().toString());

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                VowelFragment.this.getDialog().cancel();
            }
        })
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        TextView tv = (TextView) getActivity().findViewById(R.id.tv2_vowel);
                        tv.setText(Arrays.toString(passArray));
                        sendArray(passArray);
                        Log.d("Presented", "DONE");
                    }
                });

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_vowel, null);

        final TextView vowel_1_tv = (TextView)view.findViewById(R.id.vowel_1_TextView);
        vowel_1_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_1_clicked = change(vowel_1_clicked,vowel_1_tv.getText().toString(), vowel_1_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_3_tv = (TextView)view.findViewById(R.id.vowel_3_TextView);
        vowel_3_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_3_clicked = change(vowel_3_clicked,vowel_3_tv.getText().toString(), vowel_3_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_4_tv = (TextView)view.findViewById(R.id.vowel_4_TextView);
        vowel_4_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_4_clicked = change(vowel_4_clicked,vowel_4_tv.getText().toString(), vowel_4_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_5_tv = (TextView)view.findViewById(R.id.vowel_5_TextView);
        vowel_5_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_5_clicked = change(vowel_5_clicked,vowel_5_tv.getText().toString(), vowel_5_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_6_tv = (TextView)view.findViewById(R.id.vowel_6_TextView);
        vowel_6_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_6_clicked = change(vowel_6_clicked,vowel_6_tv.getText().toString(), vowel_6_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_8_tv = (TextView)view.findViewById(R.id.vowel_8_TextView);
        vowel_8_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_8_clicked = change(vowel_8_clicked,vowel_8_tv.getText().toString(), vowel_8_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_9_tv = (TextView)view.findViewById(R.id.vowel_9_TextView);
        vowel_9_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_9_clicked = change(vowel_9_clicked,vowel_9_tv.getText().toString(), vowel_9_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_10_tv = (TextView)view.findViewById(R.id.vowel_10_TextView);
        vowel_10_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_10_clicked = change(vowel_10_clicked,vowel_10_tv.getText().toString(), vowel_10_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_11_tv = (TextView)view.findViewById(R.id.vowel_11_TextView);
        vowel_11_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_11_clicked = change(vowel_11_clicked,vowel_11_tv.getText().toString(), vowel_11_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_12_tv = (TextView)view.findViewById(R.id.vowel_12_TextView);
        vowel_12_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_12_clicked = change(vowel_12_clicked,vowel_12_tv.getText().toString(), vowel_12_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_13_tv = (TextView)view.findViewById(R.id.vowel_13_TextView);
        vowel_13_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_13_clicked = change(vowel_13_clicked,vowel_13_tv.getText().toString(), vowel_13_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_14_tv = (TextView)view.findViewById(R.id.vowel_14_TextView);
        vowel_14_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_14_clicked = change(vowel_14_clicked,vowel_14_tv.getText().toString(), vowel_14_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_15_tv = (TextView)view.findViewById(R.id.vowel_15_TextView);
        vowel_15_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_15_clicked = change(vowel_15_clicked,vowel_15_tv.getText().toString(), vowel_15_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_17_tv = (TextView)view.findViewById(R.id.vowel_17_TextView);
        vowel_17_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_17_clicked = change(vowel_17_clicked,vowel_17_tv.getText().toString(), vowel_17_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_18_tv = (TextView)view.findViewById(R.id.vowel_18_TextView);
        vowel_18_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_18_clicked = change(vowel_18_clicked,vowel_18_tv.getText().toString(), vowel_18_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_19_tv = (TextView)view.findViewById(R.id.vowel_19_TextView);
        vowel_19_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_19_clicked = change(vowel_19_clicked,vowel_19_tv.getText().toString(), vowel_19_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_20_tv = (TextView)view.findViewById(R.id.vowel_20_TextView);
        vowel_20_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_20_clicked = change(vowel_20_clicked,vowel_20_tv.getText().toString(), vowel_20_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_22_tv = (TextView)view.findViewById(R.id.vowel_22_TextView);
        vowel_22_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_22_clicked = change(vowel_22_clicked,vowel_22_tv.getText().toString(), vowel_22_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_23_tv = (TextView)view.findViewById(R.id.vowel_23_TextView);
        vowel_23_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_23_clicked = change(vowel_23_clicked,vowel_23_tv.getText().toString(), vowel_23_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_24_tv = (TextView)view.findViewById(R.id.vowel_24_TextView);
        vowel_24_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_24_clicked = change(vowel_24_clicked,vowel_24_tv.getText().toString(), vowel_24_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_26_tv = (TextView)view.findViewById(R.id.vowel_26_TextView);
        vowel_26_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_26_clicked = change(vowel_26_clicked,vowel_26_tv.getText().toString(), vowel_26_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_27_tv = (TextView)view.findViewById(R.id.vowel_27_TextView);
        vowel_27_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_27_clicked = change(vowel_27_clicked,vowel_27_tv.getText().toString(), vowel_27_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_28_tv = (TextView)view.findViewById(R.id.vowel_28_TextView);
        vowel_28_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_28_clicked = change(vowel_28_clicked,vowel_28_tv.getText().toString(), vowel_28_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_29_tv = (TextView)view.findViewById(R.id.vowel_29_TextView);
        vowel_29_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_29_clicked = change(vowel_29_clicked,vowel_29_tv.getText().toString(), vowel_29_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_30_tv = (TextView)view.findViewById(R.id.vowel_30_TextView);
        vowel_30_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_30_clicked = change(vowel_30_clicked,vowel_30_tv.getText().toString(), vowel_30_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_31_tv = (TextView)view.findViewById(R.id.vowel_31_TextView);
        vowel_31_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_31_clicked = change(vowel_31_clicked,vowel_31_tv.getText().toString(), vowel_31_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_32_tv = (TextView)view.findViewById(R.id.vowel_32_TextView);
        vowel_32_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_32_clicked = change(vowel_32_clicked,vowel_32_tv.getText().toString(), vowel_32_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_34_tv = (TextView)view.findViewById(R.id.vowel_34_TextView);
        vowel_34_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_34_clicked = change(vowel_34_clicked,vowel_34_tv.getText().toString(), vowel_34_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_35_tv = (TextView)view.findViewById(R.id.vowel_35_TextView);
        vowel_35_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_35_clicked = change(vowel_35_clicked,vowel_35_tv.getText().toString(), vowel_35_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_36_tv = (TextView)view.findViewById(R.id.vowel_36_TextView);
        vowel_36_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_36_clicked = change(vowel_36_clicked,vowel_36_tv.getText().toString(), vowel_36_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_37_tv = (TextView)view.findViewById(R.id.vowel_37_TextView);
        vowel_37_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_37_clicked = change(vowel_37_clicked,vowel_37_tv.getText().toString(), vowel_37_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_38_tv = (TextView)view.findViewById(R.id.vowel_38_TextView);
        vowel_38_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_38_clicked = change(vowel_38_clicked,vowel_38_tv.getText().toString(), vowel_38_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_39_tv = (TextView)view.findViewById(R.id.vowel_39_TextView);
        vowel_39_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_39_clicked = change(vowel_39_clicked,vowel_39_tv.getText().toString(), vowel_39_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_40_tv = (TextView)view.findViewById(R.id.vowel_40_TextView);
        vowel_40_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_40_clicked = change(vowel_40_clicked,vowel_40_tv.getText().toString(), vowel_40_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_42_tv = (TextView)view.findViewById(R.id.vowel_42_TextView);
        vowel_42_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_42_clicked = change(vowel_42_clicked,vowel_42_tv.getText().toString(), vowel_42_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_43_tv = (TextView)view.findViewById(R.id.vowel_43_TextView);
        vowel_43_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_43_clicked = change(vowel_43_clicked,vowel_43_tv.getText().toString(), vowel_43_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_44_tv = (TextView)view.findViewById(R.id.vowel_44_TextView);
        vowel_44_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_44_clicked = change(vowel_44_clicked,vowel_44_tv.getText().toString(), vowel_44_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_46_tv = (TextView)view.findViewById(R.id.vowel_46_TextView);
        vowel_46_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_46_clicked = change(vowel_46_clicked,vowel_46_tv.getText().toString(), vowel_46_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_47_tv = (TextView)view.findViewById(R.id.vowel_47_TextView);
        vowel_47_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_47_clicked = change(vowel_47_clicked,vowel_47_tv.getText().toString(), vowel_47_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_48_tv = (TextView)view.findViewById(R.id.vowel_48_TextView);
        vowel_48_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_48_clicked = change(vowel_48_clicked,vowel_48_tv.getText().toString(), vowel_48_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_49_tv = (TextView)view.findViewById(R.id.vowel_49_TextView);
        vowel_49_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_49_clicked = change(vowel_49_clicked,vowel_49_tv.getText().toString(), vowel_49_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_50_tv = (TextView)view.findViewById(R.id.vowel_50_TextView);
        vowel_50_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_50_clicked = change(vowel_50_clicked,vowel_50_tv.getText().toString(), vowel_50_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_51_tv = (TextView)view.findViewById(R.id.vowel_51_TextView);
        vowel_51_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_51_clicked = change(vowel_51_clicked,vowel_51_tv.getText().toString(), vowel_51_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_52_tv = (TextView)view.findViewById(R.id.vowel_52_TextView);
        vowel_52_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_52_clicked = change(vowel_52_clicked,vowel_52_tv.getText().toString(), vowel_52_tv);
                passArray = ArrayDisplay(display);
            }
        });

        final TextView vowel_54_tv = (TextView)view.findViewById(R.id.vowel_54_TextView);
        vowel_54_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_54_clicked = change(vowel_54_clicked,vowel_54_tv.getText().toString(), vowel_54_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_55_tv = (TextView)view.findViewById(R.id.vowel_55_TextView);
        vowel_55_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_55_clicked = change(vowel_55_clicked,vowel_55_tv.getText().toString(), vowel_55_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_56_tv = (TextView)view.findViewById(R.id.vowel_56_TextView);
        vowel_56_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_56_clicked = change(vowel_56_clicked,vowel_56_tv.getText().toString(), vowel_56_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_57_tv = (TextView)view.findViewById(R.id.vowel_57_TextView);
        vowel_57_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_57_clicked = change(vowel_57_clicked,vowel_57_tv.getText().toString(), vowel_57_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_58_tv = (TextView)view.findViewById(R.id.vowel_58_TextView);
        vowel_58_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_58_clicked = change(vowel_58_clicked,vowel_58_tv.getText().toString(), vowel_58_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_59_tv = (TextView)view.findViewById(R.id.vowel_59_TextView);
        vowel_59_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_59_clicked = change(vowel_59_clicked,vowel_59_tv.getText().toString(), vowel_59_tv);
                passArray = ArrayDisplay(display);
            }
        });
        final TextView vowel_60_tv = (TextView)view.findViewById(R.id.vowel_60_TextView);
        vowel_60_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vowel_60_clicked = change(vowel_60_clicked,vowel_60_tv.getText().toString(), vowel_60_tv);
                passArray = ArrayDisplay(display);
            }
        });

        builder.setView(view);

        return builder.create();
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void sendArray(String[] array){
        ((SettingActivity)this.getActivity()).setVowelArray(array);
    }

    public boolean change(boolean clicked,String msg,TextView tv){
        boolean click_status = clicked;
        String button_text =msg;
        TextView  tv1 = tv;

        if (click_status){
            tv1.setBackgroundResource(R.drawable.borders_black_and_blue);
            tv1.setTextColor(Color.parseColor("#49345E"));
            deleteArray(msg);
            click_status = false;

            return click_status;
        }else{
            tv1.setBackgroundResource(R.drawable.borders_black_and_darkblue);
            tv1.setTextColor(Color.parseColor("#FFFFFF"));
            click_status = true;
            addArray(msg);
            return click_status;
        }
    }
    public void addArray(String add) {

        display[array_index] = add;
        array_index++;

        if (Integer.compare(array_index,61) == 0)
        {
            new AlertDialog.Builder(VowelFragment.this.getContext())
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
    public String[] ArrayDisplay(String[] DisplayArray){

        String[] displayArray = new String[array_index];
        for (int i=0;i<array_index;i++){
            displayArray[i] = DisplayArray[i];
        }

        return displayArray;
    }
}
