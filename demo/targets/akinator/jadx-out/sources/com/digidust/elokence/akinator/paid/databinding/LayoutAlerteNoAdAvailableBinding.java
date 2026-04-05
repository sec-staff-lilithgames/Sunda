package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutAlerteNoAdAvailableBinding implements a {
    public final AkinatorSmallButton okButton;
    private final RelativeLayout rootView;
    public final TextView textLigne1;
    public final TextView textLigne2;

    private LayoutAlerteNoAdAvailableBinding(RelativeLayout relativeLayout, AkinatorSmallButton akinatorSmallButton, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.okButton = akinatorSmallButton;
        this.textLigne1 = textView;
        this.textLigne2 = textView2;
    }

    public static LayoutAlerteNoAdAvailableBinding bind(View view) {
        int i10 = R.id.okButton;
        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.okButton);
        if (akinatorSmallButton != null) {
            i10 = R.id.textLigne1;
            TextView textView = (TextView) b.findChildViewById(view, R.id.textLigne1);
            if (textView != null) {
                i10 = R.id.textLigne2;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.textLigne2);
                if (textView2 != null) {
                    return new LayoutAlerteNoAdAvailableBinding((RelativeLayout) view, akinatorSmallButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteNoAdAvailableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteNoAdAvailableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_no_ad_available, viewGroup, false);
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
