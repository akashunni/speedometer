package com.akashunni.speedometer.Preferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Akash on 22-Aug-16.
 */
public class SharedPrefs {
    private static SharedPreferences sharedPreferences;
    private static String PREF_NAME = "Speedo";

    public static void setFirstTime(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("firstTime", false);
        editor.apply();
    }

    public static boolean isFirstTime(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("firstTime", true);
    }

    public static void setDistance(Context context, float distance) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("distance", distance);
        editor.apply();
    }

    public static float getDistance(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat("distance", 0);
    }

}
