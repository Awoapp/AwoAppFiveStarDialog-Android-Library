package com.messagesender.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.awoapp.FiveStarDialog.AwoAppFiveStarDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AwoAppFiveStarDialog awoAppFiveStarDialog = new AwoAppFiveStarDialog(MainActivity.this);
        awoAppFiveStarDialog.SetEmailAdress("c.awoapp@gmail.com");
        awoAppFiveStarDialog.SetInterval(0);
        awoAppFiveStarDialog.DialogCounter();
        awoAppFiveStarDialog.setBackgroundColor("#dae1e7");
        awoAppFiveStarDialog.setButtonColor("#183661");
        awoAppFiveStarDialog.setButtonTintColor("#dd6b4d");
        awoAppFiveStarDialog.setTextColor("#dd6b4d");
      awoAppFiveStarDialog.setLikedDialogText("Do you like the app?");
      awoAppFiveStarDialog.setHateDialogText("You want to tell  us how to we make the app better?","Yes","No");
      awoAppFiveStarDialog.setRateDialogText("Great! Do you want to  give us  5 stars  in  Google play?","Yes","Never","Later");
        awoAppFiveStarDialog.ShowLikedAppDialog();

    }
}
