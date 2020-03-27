package com.awoapp.FiveStarDialog;


import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StarDialog extends DialogFragment {


    public StarDialog() {
        // Required empty public constructor
    }

    RatingBar ratingBar;

    @Override
    public void onStart() {
        super.onStart();

        // safety check
        if (getDialog() == null&&getShowsDialog()!=true) {
            return;
        } else {

        // set the animations to use on showing and hiding the dialog
        getDialog().getWindow().setWindowAnimations(
                R.style.DialogAnimation);}


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_star_dialog, null);


        /*Settext color*/
        TextView textView = view.findViewById(R.id.tvStarTitle);
        textView.setTextColor(Color.parseColor(FiveStarConstants.TEXT_COLOR));
        textView.setText(FiveStarConstants.RATE_TITLE);
        Button btnNever=view.findViewById(R.id.btnNever);
        Button btnLater = view.findViewById(R.id.btnLater);
        Button btnYesGoRate= view.findViewById(R.id.btnYesGoRate);

        btnNever.setText(FiveStarConstants.RATE_NEVER);
        btnLater.setText(FiveStarConstants.RATE_LATER);
        btnYesGoRate.setText(FiveStarConstants.HATE_YES);
        ratingBar = view.findViewById(R.id.ratingBar2);


        view.findViewById(R.id.btnNever).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        view.findViewById(R.id.btnLater).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        view.findViewById(R.id.btnYesGoRate).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        view.findViewById(R.id.consStar).setBackgroundColor(Color.parseColor(FiveStarConstants.BACKGROUND_COLOR));
        view.findViewById(R.id.consBarStar).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        if (FiveStarConstants.ANIMATE) {
            ObjectAnimator anim = ObjectAnimator.ofFloat(ratingBar, "rating", (float) 0.1, 5f);
            anim.setDuration(1000);
            anim.start();
        }
        /*Bir daha asla gösterme için false işaretlendi*/
        view.findViewById(R.id.btnNever).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                PrefMemory.ShowDialogPrefWrite(getActivity(),false); }
        });


        /*Mağaza açılıyor*/
        view.findViewById(R.id.btnYesGoRate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                PrefMemory.ShowDialogPrefWrite(getActivity(),false);
                getActivity().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+getActivity().getPackageName())));
            }
        });

        /*Sonra oylama*/
        view.findViewById(R.id.btnLater).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return view;
    }

}
