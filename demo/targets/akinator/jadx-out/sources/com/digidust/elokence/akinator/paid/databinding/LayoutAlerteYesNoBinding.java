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
public final class LayoutAlerteYesNoBinding implements a {
    public final LinearLayout layoutButtons;
    public final AkinatorSmallButton nonButton;
    public final AkinatorSmallButton ouiButton;
    private final LinearLayout rootView;
    public final TextView textTitre;

    private LayoutAlerteYesNoBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AkinatorSmallButton akinatorSmallButton, AkinatorSmallButton akinatorSmallButton2, TextView textView) {
        this.rootView = linearLayout;
        this.layoutButtons = linearLayout2;
        this.nonButton = akinatorSmallButton;
        this.ouiButton = akinatorSmallButton2;
        this.textTitre = textView;
    }

    public static LayoutAlerteYesNoBinding bind(View view) {
        int i10 = R.id.layoutButtons;
        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutButtons);
        if (linearLayout != null) {
            i10 = R.id.nonButton;
            AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.nonButton);
            if (akinatorSmallButton != null) {
                i10 = R.id.ouiButton;
                AkinatorSmallButton akinatorSmallButton2 = (AkinatorSmallButton) b.findChildViewById(view, R.id.ouiButton);
                if (akinatorSmallButton2 != null) {
                    i10 = R.id.textTitre;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.textTitre);
                    if (textView != null) {
                        return new LayoutAlerteYesNoBinding((LinearLayout) view, linearLayout, akinatorSmallButton, akinatorSmallButton2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteYesNoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteYesNoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_yes_no, viewGroup, false);
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
