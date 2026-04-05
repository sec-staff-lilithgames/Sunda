package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutGenizBinding implements a {
    public final ImageView imageGz;
    private final LinearLayout rootView;
    public final TextView textScoreGz;

    private LayoutGenizBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.imageGz = imageView;
        this.textScoreGz = textView;
    }

    public static LayoutGenizBinding bind(View view) {
        int i10 = R.id.imageGz;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.imageGz);
        if (imageView != null) {
            i10 = R.id.textScoreGz;
            TextView textView = (TextView) b.findChildViewById(view, R.id.textScoreGz);
            if (textView != null) {
                return new LayoutGenizBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutGenizBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutGenizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_geniz, viewGroup, false);
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
