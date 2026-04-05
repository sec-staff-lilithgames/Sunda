package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityCongratsRareCharacterBinding implements a {
    public final TextView descriptionRareCharacter;
    public final ImageView imageGenie;
    public final LinearLayout layoutChoice;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final TextView titleExcellent;

    private ActivityCongratsRareCharacterBinding(RelativeLayout relativeLayout, TextView textView, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView2) {
        this.rootView = relativeLayout;
        this.descriptionRareCharacter = textView;
        this.imageGenie = imageView;
        this.layoutChoice = linearLayout;
        this.mainLayout = relativeLayout2;
        this.titleExcellent = textView2;
    }

    public static ActivityCongratsRareCharacterBinding bind(View view) {
        int i10 = R.id.descriptionRareCharacter;
        TextView textView = (TextView) b.findChildViewById(view, R.id.descriptionRareCharacter);
        if (textView != null) {
            i10 = R.id.imageGenie;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageGenie);
            if (imageView != null) {
                i10 = R.id.layoutChoice;
                LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutChoice);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i10 = R.id.titleExcellent;
                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.titleExcellent);
                    if (textView2 != null) {
                        return new ActivityCongratsRareCharacterBinding(relativeLayout, textView, imageView, linearLayout, relativeLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityCongratsRareCharacterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCongratsRareCharacterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_congrats_rare_character, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
