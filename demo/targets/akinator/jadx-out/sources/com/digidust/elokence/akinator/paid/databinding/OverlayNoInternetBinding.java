package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class OverlayNoInternetBinding implements a {
    public final Button buttonNoInternetRetry;
    public final ImageView popupBackground;
    private final ConstraintLayout rootView;
    public final TextView textviewPopupNoInternetDesc;
    public final TextView textviewPopupNoInternetTitle;

    private OverlayNoInternetBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.buttonNoInternetRetry = button;
        this.popupBackground = imageView;
        this.textviewPopupNoInternetDesc = textView;
        this.textviewPopupNoInternetTitle = textView2;
    }

    public static OverlayNoInternetBinding bind(View view) {
        int i10 = R.id.button_no_internet_retry;
        Button button = (Button) b.findChildViewById(view, R.id.button_no_internet_retry);
        if (button != null) {
            i10 = R.id.popup_background;
            ImageView imageView = (ImageView) b.findChildViewById(view, R.id.popup_background);
            if (imageView != null) {
                i10 = R.id.textview_popup_no_internet_desc;
                TextView textView = (TextView) b.findChildViewById(view, R.id.textview_popup_no_internet_desc);
                if (textView != null) {
                    i10 = R.id.textview_popup_no_internet_title;
                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.textview_popup_no_internet_title);
                    if (textView2 != null) {
                        return new OverlayNoInternetBinding((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OverlayNoInternetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayNoInternetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.overlay_no_internet, viewGroup, false);
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
