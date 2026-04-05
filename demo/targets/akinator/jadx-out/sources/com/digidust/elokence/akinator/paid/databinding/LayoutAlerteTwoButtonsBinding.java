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
public final class LayoutAlerteTwoButtonsBinding implements a {
    public final LinearLayout layoutButtons;
    public final Button nonButton;
    public final Button ouiButton;
    private final LinearLayout rootView;
    public final TextView textTitre;

    private LayoutAlerteTwoButtonsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, Button button, Button button2, TextView textView) {
        this.rootView = linearLayout;
        this.layoutButtons = linearLayout2;
        this.nonButton = button;
        this.ouiButton = button2;
        this.textTitre = textView;
    }

    public static LayoutAlerteTwoButtonsBinding bind(View view) {
        int i10 = R.id.layoutButtons;
        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutButtons);
        if (linearLayout != null) {
            i10 = R.id.nonButton;
            Button button = (Button) b.findChildViewById(view, R.id.nonButton);
            if (button != null) {
                i10 = R.id.ouiButton;
                Button button2 = (Button) b.findChildViewById(view, R.id.ouiButton);
                if (button2 != null) {
                    i10 = R.id.textTitre;
                    TextView textView = (TextView) b.findChildViewById(view, R.id.textTitre);
                    if (textView != null) {
                        return new LayoutAlerteTwoButtonsBinding((LinearLayout) view, linearLayout, button, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteTwoButtonsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteTwoButtonsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_two_buttons, viewGroup, false);
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
