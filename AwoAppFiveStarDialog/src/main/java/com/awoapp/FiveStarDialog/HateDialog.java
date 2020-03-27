package com.awoapp.FiveStarDialog;


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
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HateDialog extends DialogFragment {


    public HateDialog() {
        // Required empty public constructor
    }

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
        View view = inflater.inflate(R.layout.fragment_hate_dialog, null);


        /*Settext color*/
        TextView textView = view.findViewById(R.id.tvStarTitle);
        textView.setTextColor(Color.parseColor(FiveStarConstants.TEXT_COLOR));
        textView.setText(FiveStarConstants.HATE_TITLE);
        Button noHate=view.findViewById(R.id.btnNohate);
        Button yesHate=view.findViewById(R.id.btnYesPlay);
        noHate.setText(FiveStarConstants.HATE_NO);
        yesHate.setText(FiveStarConstants.HATE_YES);
        view.findViewById(R.id.btnNohate).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        view.findViewById(R.id.btnYesPlay).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));
        view.findViewById(R.id.consHateBg).setBackgroundColor(Color.parseColor(FiveStarConstants.BACKGROUND_COLOR));
        view.findViewById(R.id.consBar).setBackgroundColor(Color.parseColor(FiveStarConstants.BUTTON_COLOR));

        /**/
        view.findViewById(R.id.btnNohate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { dismiss(); }});



        /*send feedback*/
        view.findViewById(R.id.btnYesPlay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                Intent intentFeedback = new Intent(Intent.ACTION_SENDTO);
                intentFeedback.setData(Uri.parse("mailto:"+FiveStarConstants.EMAIL));
                getActivity().startActivity(intentFeedback);

            }
        });
        return view;
    }

}
