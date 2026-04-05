package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityQuestionOverlayBinding implements a {
    public final AkinatorSmallButton ButtonAcheter;
    public final AkinatorSmallButton ButtonNonMerci;
    public final Guideline bottomGuide;
    public final RelativeLayout contentFrame;
    public final LinearLayout continueButtons;
    public final ImageView imagePotionDansOverlayQuestion;
    public final ConstraintLayout layoutOverlay;
    public final TextView overlayTextDescQuestion;
    private final ConstraintLayout rootView;
    public final Guideline topGuide;

    private ActivityQuestionOverlayBinding(ConstraintLayout constraintLayout, AkinatorSmallButton akinatorSmallButton, AkinatorSmallButton akinatorSmallButton2, Guideline guideline, RelativeLayout relativeLayout, LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, Guideline guideline2) {
        this.rootView = constraintLayout;
        this.ButtonAcheter = akinatorSmallButton;
        this.ButtonNonMerci = akinatorSmallButton2;
        this.bottomGuide = guideline;
        this.contentFrame = relativeLayout;
        this.continueButtons = linearLayout;
        this.imagePotionDansOverlayQuestion = imageView;
        this.layoutOverlay = constraintLayout2;
        this.overlayTextDescQuestion = textView;
        this.topGuide = guideline2;
    }

    public static ActivityQuestionOverlayBinding bind(View view) {
        int i10 = R.id.ButtonAcheter;
        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.ButtonAcheter);
        if (akinatorSmallButton != null) {
            i10 = R.id.ButtonNonMerci;
            AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.ButtonNonMerci);
            if (akinatorSmallButton2 != null) {
                i10 = R.id.bottom_guide;
                Guideline guideline = (Guideline) b.findChildViewById(view, R.id.bottom_guide);
                if (guideline != null) {
                    i10 = R.id.contentFrame;
                    RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.contentFrame);
                    if (relativeLayout != null) {
                        i10 = R.id.continueButtons;
                        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.continueButtons);
                        if (linearLayout != null) {
                            i10 = R.id.imagePotionDansOverlayQuestion;
                            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imagePotionDansOverlayQuestion);
                            if (imageView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i10 = R.id.overlayTextDescQuestion;
                                TextView textView = (TextView) b.findChildViewById(view, R.id.overlayTextDescQuestion);
                                if (textView != null) {
                                    i10 = R.id.top_guide;
                                    Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.top_guide);
                                    if (guideline2 != null) {
                                        return new ActivityQuestionOverlayBinding(constraintLayout, akinatorSmallButton, akinatorSmallButton2, guideline, relativeLayout, linearLayout, imageView, constraintLayout, textView, guideline2);
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

    public static ActivityQuestionOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityQuestionOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_question_overlay, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
