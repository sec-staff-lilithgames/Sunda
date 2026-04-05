package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentCorrectReasonBinding implements a {
    public final RadioButton radioCorrectionOrthographe;
    public final RadioButton radioDescriptionErreur;
    public final RadioButton radioElementManquant;
    public final RadioGroup radioGroupCorrect;
    public final RadioButton radioPrecisionDescription;
    public final TextView raisonCorrection;
    private final LinearLayout rootView;

    private FragmentCorrectReasonBinding(LinearLayout linearLayout, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, RadioButton radioButton4, TextView textView) {
        this.rootView = linearLayout;
        this.radioCorrectionOrthographe = radioButton;
        this.radioDescriptionErreur = radioButton2;
        this.radioElementManquant = radioButton3;
        this.radioGroupCorrect = radioGroup;
        this.radioPrecisionDescription = radioButton4;
        this.raisonCorrection = textView;
    }

    public static FragmentCorrectReasonBinding bind(View view) {
        int i10 = R.id.radioCorrectionOrthographe;
        RadioButton radioButton = (RadioButton) b.findChildViewById(view, R.id.radioCorrectionOrthographe);
        if (radioButton != null) {
            i10 = R.id.radioDescriptionErreur;
            RadioButton radioButton2 = (RadioButton) b.findChildViewById(view, R.id.radioDescriptionErreur);
            if (radioButton2 != null) {
                i10 = R.id.radioElementManquant;
                RadioButton radioButton3 = (RadioButton) b.findChildViewById(view, R.id.radioElementManquant);
                if (radioButton3 != null) {
                    i10 = R.id.radioGroupCorrect;
                    RadioGroup radioGroup = (RadioGroup) b.findChildViewById(view, R.id.radioGroupCorrect);
                    if (radioGroup != null) {
                        i10 = R.id.radioPrecisionDescription;
                        RadioButton radioButton4 = (RadioButton) b.findChildViewById(view, R.id.radioPrecisionDescription);
                        if (radioButton4 != null) {
                            i10 = R.id.raisonCorrection;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.raisonCorrection);
                            if (textView != null) {
                                return new FragmentCorrectReasonBinding((LinearLayout) view, radioButton, radioButton2, radioButton3, radioGroup, radioButton4, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentCorrectReasonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCorrectReasonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_correct_reason, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
