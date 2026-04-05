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
public final class ItemPartageAppBinding implements a {
    public final ImageView appImage;
    public final LinearLayout appLayout;
    public final TextView appName;
    private final LinearLayout rootView;

    private ItemPartageAppBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.appImage = imageView;
        this.appLayout = linearLayout2;
        this.appName = textView;
    }

    public static ItemPartageAppBinding bind(View view) {
        int i10 = R.id.appImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.appImage);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) b.findChildViewById(view, R.id.appName);
            if (textView != null) {
                return new ItemPartageAppBinding(linearLayout, imageView, linearLayout, textView);
            }
            i10 = R.id.appName;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPartageAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPartageAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_partage_app, viewGroup, false);
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
