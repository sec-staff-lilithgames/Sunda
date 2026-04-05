package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutAlerteIUnderstandBinding implements a {
    public final Button okButton;
    private final LinearLayout rootView;
    public final TextView textTitre;

    private LayoutAlerteIUnderstandBinding(LinearLayout linearLayout, Button button, TextView textView) {
        this.rootView = linearLayout;
        this.okButton = button;
        this.textTitre = textView;
    }

    public static LayoutAlerteIUnderstandBinding bind(View view) {
        int i10 = R.id.okButton;
        Button button = (Button) b.findChildViewById(view, R.id.okButton);
        if (button != null) {
            i10 = R.id.textTitre;
            TextView textView = (TextView) b.findChildViewById(view, R.id.textTitre);
            if (textView != null) {
                return new LayoutAlerteIUnderstandBinding((LinearLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteIUnderstandBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteIUnderstandBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_i_understand, viewGroup, false);
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
