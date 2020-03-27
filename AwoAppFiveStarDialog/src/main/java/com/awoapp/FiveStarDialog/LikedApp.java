package com.awoapp.FiveStarDialog;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LikedApp extends DialogFragment {


    public LikedApp() {
        // Required empty public constructor
    }
    ImageView consLike,consBigLike;
    private FragmentManager fragmentManager;
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
        View view = inflater.inflate(R.layout.fragment_liked_app, null);

        /*Fragment manager */
        fragmentManager  = ((FragmentActivity) getActivity()).getSupportFragmentManager();

        /*Settext color*/
        TextView textView = view.findViewById(R.id.tvLikedApp);
        textView.setTextColor(Color.parseColor(FiveStarConstants.TEXT_COLOR));
        textView.setText(FiveStarConstants.LIKED_TITLE);

       view.findViewById(R.id.conslike).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
       view.findViewById(R.id.consBigLike).setBackgroundColor(Color.parseColor(FiveStarConstants.BACKGROUND_COLOR));

        view.findViewById(R.id.btnHate).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        view.findViewById(R.id.btnLike).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));

        /*Show hate dialog*/
        view.findViewById(R.id.btnHate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                HateDialog hateDialog = new HateDialog();
                hateDialog.show(fragmentManager,"HATE");
            }
        });

        /*Show like dialog.*/
        view.findViewById(R.id.btnLike).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                StarDialog starDialog = new StarDialog();
                starDialog.show(fragmentManager,"STAR");
            }
        });
        return view;
    }


}
