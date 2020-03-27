package com.awoapp.FiveStarDialog;

import android.app.Activity;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class AwoAppFiveStarDialog {

    private Activity activity;
    FragmentManager fragmentManager;

    public AwoAppFiveStarDialog(Activity activity)
    {
        this.activity = activity;
    }


    public void ShowLikedAppDialog()
    {
        /**
         * Show dialog ?
         *Get data from counter
         * */
        if (PrefMemory.ShowDialogPrefRead(activity)){
            if (PrefMemory.ReadPrefMemoryCounter(activity)>FiveStarConstants.INTERVAL){
        LikedApp likedApp = new LikedApp();
        fragmentManager  = ((FragmentActivity) activity).getSupportFragmentManager();
        PrefMemory.ClearPref(activity);
        likedApp.show(fragmentManager,"LIKED");}}

    }

    /*Set e-mail*/
    public void SetEmailAdress(String email)
    {
        FiveStarConstants.EMAIL=email;
    }

    /*Dialog counter*/
    public void DialogCounter()
    {
       PrefMemory.WritePrefMemoryCounter(activity,PrefMemory.ReadPrefMemoryCounter(activity)+1);

    }

    /*set intervali */
    public void SetInterval(int i)
    {
        FiveStarConstants.INTERVAL=i;
    }

    public void setTextColor(String textColor)
    {
        FiveStarConstants.TEXT_COLOR=textColor;
    }

    public void setButtonColor(String buttonColor)
    {
    FiveStarConstants.BUTTON_COLOR=buttonColor;
    }

    public void setBackgroundColor(String backgroundColor)
    {
    FiveStarConstants.BACKGROUND_COLOR = backgroundColor;
    }

    public void setButtonTintColor(String buttonTintColor)
    {
        FiveStarConstants.BUTTON_TINT_COLOR = buttonTintColor;
    }
    public void setRateDialogText(String title,String yes,String never,String later)
    {
        FiveStarConstants.RATE_TITLE=title;
        FiveStarConstants.HATE_YES=yes;
        FiveStarConstants.RATE_NEVER=never;
        FiveStarConstants.RATE_LATER=later;
    }

    public void setHateDialogText(String title,String yes,String no)
    {
        FiveStarConstants.HATE_TITLE = title;
        FiveStarConstants.HATE_YES = yes;
        FiveStarConstants.HATE_NO = no;
    }
    public void setLikedDialogText(String title)
    {
        FiveStarConstants.LIKED_TITLE =title;
    }

}
