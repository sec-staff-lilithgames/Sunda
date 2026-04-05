package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutRejectedCheckingBinding implements a {
    public final ImageView rejectedImage;
    public final TextView rejectedText;
    private final RelativeLayout rootView;

    private LayoutRejectedCheckingBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.rootView = relativeLayout;
        this.rejectedImage = imageView;
        this.rejectedText = textView;
    }

    public static LayoutRejectedCheckingBinding bind(View view) {
        int i10 = R.id.rejectedImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.rejectedImage);
        if (imageView != null) {
            i10 = R.id.rejectedText;
            TextView textView = (TextView) b.findChildViewById(view, R.id.rejectedText);
            if (textView != null) {
                return new LayoutRejectedCheckingBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutRejectedCheckingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutRejectedCheckingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_rejected_checking, viewGroup, false);
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
