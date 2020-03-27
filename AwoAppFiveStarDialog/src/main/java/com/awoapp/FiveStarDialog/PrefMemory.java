package com.awoapp.FiveStarDialog;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class PrefMemory {

    /*Write data for counter*/

    public static void WritePrefMemoryCounter(Activity activity,int starCounter)
    {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(activity.getPackageName() + "AwoAppFiveStarPref.xml", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("STAR_KEY", starCounter);
        editor.commit();
    }
    /*Read data for counter*/
    public static int ReadPrefMemoryCounter(Activity activity)
    {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(activity.getPackageName() + "AwoAppFiveStarPref.xml", Context.MODE_PRIVATE);
        int i = sharedPreferences.getInt("STAR_KEY",0);
        return i;
    }

    /*Write data for dialog show*/
    public static void ShowDialogPrefWrite(Activity activity,boolean b)
    {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(activity.getPackageName() + "AwoAppFiveStarPref.xml", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("SHOW", b);
        editor.commit();
    }

    /*Read data for dialog show*/
    public static boolean ShowDialogPrefRead(Activity activity)
    {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(activity.getPackageName() + "AwoAppFiveStarPref.xml", Context.MODE_PRIVATE);
        boolean i = sharedPreferences.getBoolean("SHOW",true);
        return i;
    }


    /*Clear memory*/
    public static void ClearPref(Activity activity)
    {
        SharedPreferences sharedPreferences = activity.getSharedPreferences(activity.getPackageName() + "AwoAppFiveStarPref.xml", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }
}
