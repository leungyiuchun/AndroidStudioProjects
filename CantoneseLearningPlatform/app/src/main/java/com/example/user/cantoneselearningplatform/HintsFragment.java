package com.example.user.cantoneselearningplatform;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HintsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HintsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HintsFragment extends DialogFragment {
    String hints = "  ";
    int hintsDecision;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                HintsFragment.this.getDialog().cancel();
            }
        })
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        TextView tv = (TextView) getActivity().findViewById(R.id.tv2_hints);
                        tv.setText(hints.toString());
                        sendInt(hintsDecision);
                    }
                });
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_hints, null);
        final RadioGroup rg = (RadioGroup)view.findViewById(R.id.hints_rg_1);
        rg.setVisibility(View.INVISIBLE);
        final Switch switch1 = (Switch)view.findViewById(R.id.hints_switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rg.setVisibility(View.VISIBLE);
                } else {
                    rg.setVisibility(View.INVISIBLE);
                    hintsDecision = 0;
                    hints = "沒有提示";
                }
            }
        });

        final RadioButton rb1 = (RadioButton)view.findViewById(R.id.task_rb_1);
        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                hintsDecision = 1;
                hints = rb1.getText().toString();
            }
        });
        final RadioButton rb2 = (RadioButton)view.findViewById(R.id.task_rb_2);
        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                hintsDecision = 2;
                hints = rb2.getText().toString();

            }
        });
        final RadioButton rb3 = (RadioButton)view.findViewById(R.id.task_rb_3);
        rb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                hintsDecision = 3;
                hints = rb3.getText().toString();
            }
        });
        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public void sendInt(Integer int1){
        ((SettingActivity)this.getActivity()).setHintInt(int1);
    }
}
