package com.example.benny_laptop.capstone;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class ExerciseActivity extends AppCompatActivity {
    TextToSpeech t1;
    CustomKeyboard mCustomKeyboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        findViewById(R.id.editText).setVisibility(View.GONE);
        findViewById(R.id.editText2).setVisibility(View.GONE);
        findViewById(R.id.imageView).setVisibility(View.GONE);
        findViewById(R.id.confirmButton).setVisibility(View.GONE);
        t1 = new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status){
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(new Locale("zh","HK"));
                }
            }
        });

        mCustomKeyboard= new CustomKeyboard(ExerciseActivity.this,R.id.KeyboardView,R.xml.keyboard);
        mCustomKeyboard.registerEditText(R.id.editText);
        mCustomKeyboard.registerEditText(R.id.editText2);

        final Button soundButton = (Button)findViewById(R.id.soundButton);
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = soundButton.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.setSpeechRate(0.5f);
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                findViewById(R.id.editText).setVisibility(View.VISIBLE);
                findViewById(R.id.editText2).setVisibility(View.VISIBLE);
                findViewById(R.id.confirmButton).setVisibility(View.VISIBLE);
            }
        });

        final Button confirmButton = (Button)findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExerciseActivity.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

    }
    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
    super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exercise, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

class CustomKeyboard {
    private Activity     mHostActivity;
    private KeyboardView mKeyboardView;


    public CustomKeyboard(Activity host, int viewId, int layoutId) {
        mHostActivity = host;
        Keyboard mKeyboard = new Keyboard(host, viewId, layoutId);
        mKeyboardView = (KeyboardView) mHostActivity.findViewById(layoutId);
        mKeyboardView.setKeyboard(mKeyboard);
        mKeyboardView.setPreviewEnabled(false);
        mHostActivity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
        private KeyboardView.OnKeyboardActionListener mKeyboardViewListner = new KeyboardView.OnKeyboardActionListener() {
            public final static int CodeDelete   = -5; // Keyboard.KEYCODE_DELETE
            public final static int CodeCancel   = -3; // Keyboard.KEYCODE_CANCEL
            public final static int CodePrev     = 55000;
            public final static int CodeAllLeft  = 55001;
            public final static int CodeLeft     = 55002;
            public final static int CodeRight    = 55003;
            public final static int CodeAllRight = 55004;
            public final static int CodeNext     = 55005;
            public final static int CodeClear    = 55006;


            @Override
            public void onPress(int primaryCode) {

            }

            @Override
            public void onRelease(int primaryCode) {

            }

            @Override
            public void onKey(int primaryCode, int[] keyCodes) {

                View focusCurrent = mHostActivity.getWindow().getCurrentFocus();
                if (focusCurrent == null || focusCurrent.getClass() != EditText.class) return;
                EditText edittext = (EditText) focusCurrent;
                Editable editable = edittext.getText();
                int start = edittext.getSelectionStart();
                // Handle key
                if (primaryCode == CodeCancel) {
                    hideCustomKeyboard();
                } else if (primaryCode == CodeDelete) {
                    if (editable != null && start > 0) editable.delete(start - 1, start);
                } else if (primaryCode == CodeClear) {
                    if (editable != null) editable.clear();
                } else if (primaryCode == CodeLeft) {
                    if (start > 0) edittext.setSelection(start - 1);
                } else if (primaryCode == CodeRight) {
                    if (start < edittext.length()) edittext.setSelection(start + 1);
                } else if (primaryCode == CodeAllLeft) {
                    edittext.setSelection(0);
                } else if (primaryCode == CodeAllRight) {
                    edittext.setSelection(edittext.length());
                } else if (primaryCode == CodePrev) {
                    View focusNew = edittext.focusSearch(View.FOCUS_LEFT);
                    if (focusNew != null) focusNew.requestFocus();
                } else if (primaryCode == CodeNext) {
                    View focusNew = edittext.focusSearch(View.FOCUS_RIGHT);
                    if (focusNew != null) focusNew.requestFocus();
                } else {// Insert character
                    editable.insert(start, Character.toString((char) primaryCode));
                }
            }


            @Override
            public void onText(CharSequence text) {

            }

            @Override
            public void swipeLeft() {

            }

            @Override
            public void swipeRight() {

            }

            @Override
            public void swipeDown() {

            }

            @Override
            public void swipeUp() {

            }

    };

    public void hideCustomKeyboard() {
        mKeyboardView.setVisibility(View.GONE);
        mKeyboardView.setEnabled(false);
    }

    public void showCustomKeyboard( View v ) {
        mKeyboardView.setVisibility(View.VISIBLE);
        mKeyboardView.setEnabled(true);
        if( v!=null ) ((InputMethodManager)mHostActivity.getSystemService(Activity.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(v.getWindowToken(), 0);
    }

    public boolean isCustomKeyboardVisible() {
        return mKeyboardView.getVisibility() == View.VISIBLE;
    }

    public void registerEditText(int resid) {
        EditText edittext= (EditText)mHostActivity.findViewById(resid);
        edittext.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override public void onFocusChange(View v, boolean hasFocus) {
                if( hasFocus ) showCustomKeyboard(v); else hideCustomKeyboard();
            }
        });
        edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomKeyboard(v);
            }
        });
        edittext.setOnTouchListener(new View.OnTouchListener() {
            @Override public boolean onTouch(View v, MotionEvent event) {
                EditText edittext = (EditText) v;
                int inType = edittext.getInputType();       // Backup the input type
                edittext.setInputType(InputType.TYPE_NULL); // Disable standard keyboard
                edittext.onTouchEvent(event);               // Call native handler
                edittext.setInputType(inType);              // Restore input type
                return true; // Consume touch event
            }
        });
        edittext.setInputType(edittext.getInputType() | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
    }

}


