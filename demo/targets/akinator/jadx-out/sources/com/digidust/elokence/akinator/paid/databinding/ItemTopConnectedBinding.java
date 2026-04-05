package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ItemTopConnectedBinding implements a {
    public final Button confirmationMailButton;
    public final RelativeLayout layoutSoundlike;
    public final LinearLayout linearText;
    public final ImageView pictureProfile;
    private final RelativeLayout rootView;
    public final TextView textMail;
    public final TextView textPseudo;

    private ItemTopConnectedBinding(RelativeLayout relativeLayout, Button button, RelativeLayout relativeLayout2, LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.confirmationMailButton = button;
        this.layoutSoundlike = relativeLayout2;
        this.linearText = linearLayout;
        this.pictureProfile = imageView;
        this.textMail = textView;
        this.textPseudo = textView2;
    }

    public static ItemTopConnectedBinding bind(View view) {
        int i10 = R.id.confirmationMailButton;
        Button button = (Button) b.findChildViewById(view, R.id.confirmationMailButton);
        if (button != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.linearText;
            LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.linearText);
            if (linearLayout != null) {
                i10 = R.id.pictureProfile;
                ImageView imageView = (ImageView) b.findChildViewById(view, R.id.pictureProfile);
                if (imageView != null) {
                    i10 = R.id.textMail;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.textMail);
                    if (textView != null) {
                        i10 = R.id.textPseudo;
                        TextView textView2 = (TextView) b.findChildViewById(view, R.id.textPseudo);
                        if (textView2 != null) {
                            return new ItemTopConnectedBinding(relativeLayout, button, relativeLayout, linearLayout, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemTopConnectedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemTopConnectedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_top_connected, viewGroup, false);
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
