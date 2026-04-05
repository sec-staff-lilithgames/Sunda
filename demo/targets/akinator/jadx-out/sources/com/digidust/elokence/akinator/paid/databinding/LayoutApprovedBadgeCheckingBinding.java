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
public final class LayoutApprovedBadgeCheckingBinding implements a {
    public final ImageView approvedImage;
    public final TextView approvedText;
    private final RelativeLayout rootView;

    private LayoutApprovedBadgeCheckingBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.rootView = relativeLayout;
        this.approvedImage = imageView;
        this.approvedText = textView;
    }

    public static LayoutApprovedBadgeCheckingBinding bind(View view) {
        int i10 = R.id.approvedImage;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.approvedImage);
        if (imageView != null) {
            i10 = R.id.approvedText;
            TextView textView = (TextView) b.findChildViewById(view, R.id.approvedText);
            if (textView != null) {
                return new LayoutApprovedBadgeCheckingBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutApprovedBadgeCheckingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutApprovedBadgeCheckingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_approved_badge_checking, viewGroup, false);
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
