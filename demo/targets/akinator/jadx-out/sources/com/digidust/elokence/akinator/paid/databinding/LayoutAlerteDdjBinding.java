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
public final class LayoutAlerteDdjBinding implements a {
    public final AkinatorSmallButton okButton;
    public final TextView regleDdj;
    public final TextView regleIndice1;
    public final TextView regleIndice2;
    private final LinearLayout rootView;

    private LayoutAlerteDdjBinding(LinearLayout linearLayout, AkinatorSmallButton akinatorSmallButton, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.okButton = akinatorSmallButton;
        this.regleDdj = textView;
        this.regleIndice1 = textView2;
        this.regleIndice2 = textView3;
    }

    public static LayoutAlerteDdjBinding bind(View view) {
        int i10 = R.id.okButton;
        AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.okButton);
        if (akinatorSmallButton != null) {
            i10 = R.id.regleDdj;
            TextView textView = (TextView) b.findChildViewById(view, R.id.regleDdj);
            if (textView != null) {
                i10 = R.id.regleIndice1;
                TextView textView2 = (TextView) b.findChildViewById(view, R.id.regleIndice1);
                if (textView2 != null) {
                    i10 = R.id.regleIndice2;
                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.regleIndice2);
                    if (textView3 != null) {
                        return new LayoutAlerteDdjBinding((LinearLayout) view, akinatorSmallButton, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteDdjBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteDdjBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_ddj, viewGroup, false);
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
