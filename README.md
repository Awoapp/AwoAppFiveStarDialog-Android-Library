# AwoAppFiveStarDialog-Android
AwoAppFiveStarDialog library that simplifies the request to rating the application shown to the user and reduces the negative ratings.

<b>SCREENSHOOT</b>

![Alt text](/ss.png?raw=true "Optional Title")

# Usage

### Add jitpack


```
 repositories {
        maven { url 'https://jitpack.io' }
        }
```


### Include the library in your ``build.gradle``
```
dependencies{
implementation 'com.github.Awoapp:AwoAppFiveStarDialog-Android:1.0.0'
}
```       

## Simple Usage
```  
AwoAppFiveStarDialog awoAppFiveStarDialog = new AwoAppFiveStarDialog(MainActivity.this);
        awoAppFiveStarDialog.SetEmailAdress("c.awoapp@gmail.com");
        awoAppFiveStarDialog.ShowLikedAppDialog();
```           
        
        
## Detailed Usage
          ``` awoAppFiveStarDialog.SetInterval(0);//Rating dialog display interval
        awoAppFiveStarDialog.DialogCounter();//Create Counter
        awoAppFiveStarDialog.setBackgroundColor("#dae1e7");//Background Color
        awoAppFiveStarDialog.setButtonColor("#183661");//Button Color
        awoAppFiveStarDialog.setTextColor("#dd6b4d");//Text Color
        awoAppFiveStarDialog.setLikedDialogText("Do you like the app?");
        awoAppFiveStarDialog.setHateDialogText("You want to tell  us how to we make the app better?","Yes","No");
        awoAppFiveStarDialog.setRateDialogText("Great! Do you want to  give us  5 stars  in  Google play?","Yes","Never","Later");
```


        
