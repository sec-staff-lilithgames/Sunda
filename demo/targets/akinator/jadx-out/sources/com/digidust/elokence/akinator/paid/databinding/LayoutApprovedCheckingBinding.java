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
public final class LayoutApprovedCheckingBinding implements a {
    public final TextView approvedText;
    public final TextView bravoMessage;
    public final TextView explicationPiege;
    public final RelativeLayout layoutApprovedChecking;
    public final ImageView rejectedImage;
    private final RelativeLayout rootView;

    private LayoutApprovedCheckingBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, ImageView imageView) {
        this.rootView = relativeLayout;
        this.approvedText = textView;
        this.bravoMessage = textView2;
        this.explicationPiege = textView3;
        this.layoutApprovedChecking = relativeLayout2;
        this.rejectedImage = imageView;
    }

    public static LayoutApprovedCheckingBinding bind(View view) {
        int i10 = R.id.approvedText;
        TextView textView = (TextView) b.findChildViewById(view, R.id.approvedText);
        if (textView != null) {
            i10 = R.id.bravoMessage;
            TextView textView2 = (TextView) b.findChildViewById(view, R.id.bravoMessage);
            if (textView2 != null) {
                i10 = R.id.explicationPiege;
                TextView textView3 = (TextView) b.findChildViewById(view, R.id.explicationPiege);
                if (textView3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i10 = R.id.rejectedImage;
                    ImageView imageView = (ImageView) b.findChildViewById(view, R.id.rejectedImage);
                    if (imageView != null) {
                        return new LayoutApprovedCheckingBinding(relativeLayout, textView, textView2, textView3, relativeLayout, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutApprovedCheckingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutApprovedCheckingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_approved_checking, viewGroup, false);
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
