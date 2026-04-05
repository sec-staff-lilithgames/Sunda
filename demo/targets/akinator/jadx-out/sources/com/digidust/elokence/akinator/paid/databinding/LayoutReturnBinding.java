package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutReturnBinding implements a {
    public final ImageView retourButton;
    private final ImageView rootView;

    private LayoutReturnBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.retourButton = imageView2;
    }

    public static LayoutReturnBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new LayoutReturnBinding(imageView, imageView);
    }

    public static LayoutReturnBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutReturnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_return, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ImageView getRoot() {
        return this.rootView;
    }
}
