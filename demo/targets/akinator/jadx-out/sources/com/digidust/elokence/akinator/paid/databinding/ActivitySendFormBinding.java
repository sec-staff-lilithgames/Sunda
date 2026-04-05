package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivitySendFormBinding implements a {
    public final ImageView backImage;
    public final RadioButton choiceFour;
    public final RadioButton choiceOne;
    public final RadioButton choiceThree;
    public final RadioButton choiceTwo;
    public final RelativeLayout descriptionMessage;
    public final EditText editTextDescription;
    public final LinearLayout layoutInfosContainer;
    public final ScrollView mainLayout;
    public final RelativeLayout mainRelativeLayout;
    public final TextView preventionMessage;
    public final TextView preventionMessageUrl;
    public final RadioGroup radioGroup;
    public final RelativeLayout relativeBackButton;
    private final ScrollView rootView;
    public final AkinatorAddMagicButton sendButton;
    public final ImageView separation;
    public final RelativeLayout sujetMessage;
    public final RelativeLayout technicalDataMessage;
    public final TextView textDescriptionMessage;
    public final TextView textExplicatifTechnicalDataMessage;
    public final TextView textSujetMessage;
    public final TextView textTechnicalDataMessage;
    public final TextView textTitleForm;
    public final RelativeLayout topTitle;

    private ActivitySendFormBinding(ScrollView scrollView, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RelativeLayout relativeLayout, EditText editText, LinearLayout linearLayout, ScrollView scrollView2, RelativeLayout relativeLayout2, TextView textView, TextView textView2, RadioGroup radioGroup, RelativeLayout relativeLayout3, AkinatorAddMagicButton akinatorAddMagicButton, ImageView imageView2, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, RelativeLayout relativeLayout6) {
        this.rootView = scrollView;
        this.backImage = imageView;
        this.choiceFour = radioButton;
        this.choiceOne = radioButton2;
        this.choiceThree = radioButton3;
        this.choiceTwo = radioButton4;
        this.descriptionMessage = relativeLayout;
        this.editTextDescription = editText;
        this.layoutInfosContainer = linearLayout;
        this.mainLayout = scrollView2;
        this.mainRelativeLayout = relativeLayout2;
        this.preventionMessage = textView;
        this.preventionMessageUrl = textView2;
        this.radioGroup = radioGroup;
        this.relativeBackButton = relativeLayout3;
        this.sendButton = akinatorAddMagicButton;
        this.separation = imageView2;
        this.sujetMessage = relativeLayout4;
        this.technicalDataMessage = relativeLayout5;
        this.textDescriptionMessage = textView3;
        this.textExplicatifTechnicalDataMessage = textView4;
        this.textSujetMessage = textView5;
        this.textTechnicalDataMessage = textView6;
        this.textTitleForm = textView7;
        this.topTitle = relativeLayout6;
    }

    public static ActivitySendFormBinding bind(View view) {
        int i10 = R.id.backImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.backImage);
        if (imageView != null) {
            i10 = R.id.choiceFour;
            RadioButton radioButton = (RadioButton) b.findChildViewById(view, R.id.choiceFour);
            if (radioButton != null) {
                i10 = R.id.choiceOne;
                RadioButton radioButton2 = (RadioButton) b.findChildViewById(view, R.id.choiceOne);
                if (radioButton2 != null) {
                    i10 = R.id.choiceThree;
                    RadioButton radioButton3 = (RadioButton) b.findChildViewById(view, R.id.choiceThree);
                    if (radioButton3 != null) {
                        i10 = R.id.choiceTwo;
                        RadioButton radioButton4 = (RadioButton) b.findChildViewById(view, R.id.choiceTwo);
                        if (radioButton4 != null) {
                            i10 = R.id.descriptionMessage;
                            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.descriptionMessage);
                            if (relativeLayout != null) {
                                i10 = R.id.editTextDescription;
                                EditText editText = (EditText) b.findChildViewById(view, R.id.editTextDescription);
                                if (editText != null) {
                                    i10 = R.id.layoutInfosContainer;
                                    LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutInfosContainer);
                                    if (linearLayout != null) {
                                        ScrollView scrollView = (ScrollView) view;
                                        i10 = R.id.mainRelativeLayout;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) b.findChildViewById(view, R.id.mainRelativeLayout);
                                        if (relativeLayout2 != null) {
                                            i10 = R.id.preventionMessage;
                                            TextView textView = (TextView) b.findChildViewById(view, R.id.preventionMessage);
                                            if (textView != null) {
                                                i10 = R.id.preventionMessageUrl;
                                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.preventionMessageUrl);
                                                if (textView2 != null) {
                                                    i10 = R.id.radioGroup;
                                                    RadioGroup radioGroup = (RadioGroup) b.findChildViewById(view, R.id.radioGroup);
                                                    if (radioGroup != null) {
                                                        i10 = R.id.relativeBackButton;
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) b.findChildViewById(view, R.id.relativeBackButton);
                                                        if (relativeLayout3 != null) {
                                                            i10 = R.id.sendButton;
                                                            AkinatorAddMagicButton akinatorAddMagicButton = (AkinatorAddMagicButton) b.findChildViewById(view, R.id.sendButton);
                                                            if (akinatorAddMagicButton != null) {
                                                                i10 = R.id.separation;
                                                                ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.separation);
                                                                if (imageView2 != null) {
                                                                    i10 = R.id.sujetMessage;
                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) b.findChildViewById(view, R.id.sujetMessage);
                                                                    if (relativeLayout4 != null) {
                                                                        i10 = R.id.technicalDataMessage;
                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) b.findChildViewById(view, R.id.technicalDataMessage);
                                                                        if (relativeLayout5 != null) {
                                                                            i10 = R.id.textDescriptionMessage;
                                                                            TextView textView3 = (TextView) b.findChildViewById(view, R.id.textDescriptionMessage);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.textExplicatifTechnicalDataMessage;
                                                                                TextView textView4 = (TextView) b.findChildViewById(view, R.id.textExplicatifTechnicalDataMessage);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.textSujetMessage;
                                                                                    TextView textView5 = (TextView) b.findChildViewById(view, R.id.textSujetMessage);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.textTechnicalDataMessage;
                                                                                        TextView textView6 = (TextView) b.findChildViewById(view, R.id.textTechnicalDataMessage);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.textTitleForm;
                                                                                            TextView textView7 = (TextView) b.findChildViewById(view, R.id.textTitleForm);
                                                                                            if (textView7 != null) {
                                                                                                i10 = R.id.topTitle;
                                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) b.findChildViewById(view, R.id.topTitle);
                                                                                                if (relativeLayout6 != null) {
                                                                                                    return new ActivitySendFormBinding(scrollView, imageView, radioButton, radioButton2, radioButton3, radioButton4, relativeLayout, editText, linearLayout, scrollView, relativeLayout2, textView, textView2, radioGroup, relativeLayout3, akinatorAddMagicButton, imageView2, relativeLayout4, relativeLayout5, textView3, textView4, textView5, textView6, textView7, relativeLayout6);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySendFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySendFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_send_form, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}
