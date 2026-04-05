package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutAlerteOkBinding implements a {
    public final AkinatorSmallButton okButton;
    private final LinearLayout rootView;
    public final TextView textTitre;

    private LayoutAlerteOkBinding(LinearLayout linearLayout, AkinatorSmallButton akinatorSmallButton, TextView textView) {
        this.rootView = linearLayout;
        this.okButton = akinatorSmallButton;
        this.textTitre = textView;
    }

    public static LayoutAlerteOkBinding bind(View view) {
        int i10 = R.id.okButton;
        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.okButton);
        if (akinatorSmallButton != null) {
            i10 = R.id.textTitre;
            TextView textView = (TextView) b.findChildViewById(view, R.id.textTitre);
            if (textView != null) {
                return new LayoutAlerteOkBinding((LinearLayout) view, akinatorSmallButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteOkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteOkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_ok, viewGroup, false);
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
