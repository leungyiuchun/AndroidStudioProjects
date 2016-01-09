package com.example.user.cantoneselearningplatform;

import android.app.Application;

/**
 * Created by user on 7/1/16.
 */
public class MyApp extends Application {
    String[] globalInitArray = {" "};
    String[] globalVowelArray = {" "};
    Integer globalTaskInt = 0;
    Integer globalHintInt = 0;

    public String[] getInitArray(){return this.globalInitArray;}
    public void setInitArray(String[] initArray){this.globalInitArray = initArray;}

    public String[] getVowelArray(){return this.globalVowelArray;}
    public void setVowelArray(String[] vowelArray){this.globalVowelArray = vowelArray;}

    public Integer getTaskInt(){return this.globalTaskInt;}
    public void setTaskInt(Integer taskInt){this.globalTaskInt = taskInt;}

    public Integer getHintInt(){return this.globalHintInt;}
    public void setHintInt(Integer taskInt){this.globalHintInt = taskInt;}
}
