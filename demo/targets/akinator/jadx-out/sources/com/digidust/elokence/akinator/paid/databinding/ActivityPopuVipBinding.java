package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityPopuVipBinding implements a {
    public final Guideline guideLineTextDroit;
    public final Guideline guideLineTextGauche;
    public final ImageView imageFlecheDroite;
    public final ImageView mainImage;
    private final ConstraintLayout rootView;
    public final TextView textAwardPart1;
    public final TextView textAwardPart2;
    public final LinearLayout textCongratulation;

    private ActivityPopuVipBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.guideLineTextDroit = guideline;
        this.guideLineTextGauche = guideline2;
        this.imageFlecheDroite = imageView;
        this.mainImage = imageView2;
        this.textAwardPart1 = textView;
        this.textAwardPart2 = textView2;
        this.textCongratulation = linearLayout;
    }

    public static ActivityPopuVipBinding bind(View view) {
        int i10 = R.id.guideLineTextDroit;
        Guideline guideline = (Guideline) b.findChildViewById(view, R.id.guideLineTextDroit);
        if (guideline != null) {
            i10 = R.id.guideLineTextGauche;
            Guideline guideline2 = (Guideline) b.findChildViewById(view, R.id.guideLineTextGauche);
            if (guideline2 != null) {
                i10 = R.id.imageFlecheDroite;
                ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageFlecheDroite);
                if (imageView != null) {
                    i10 = R.id.mainImage;
                    ImageView imageView2 = (ImageView) b.findChildViewById(view, R.id.mainImage);
                    if (imageView2 != null) {
                        i10 = R.id.textAwardPart1;
                        TextView textView = (TextView) b.findChildViewById(view, R.id.textAwardPart1);
                        if (textView != null) {
                            i10 = R.id.textAwardPart2;
                            TextView textView2 = (TextView) b.findChildViewById(view, R.id.textAwardPart2);
                            if (textView2 != null) {
                                i10 = R.id.textCongratulation;
                                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.textCongratulation);
                                if (linearLayout != null) {
                                    return new ActivityPopuVipBinding((ConstraintLayout) view, guideline, guideline2, imageView, imageView2, textView, textView2, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPopuVipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPopuVipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_popu_vip, viewGroup, false);
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
