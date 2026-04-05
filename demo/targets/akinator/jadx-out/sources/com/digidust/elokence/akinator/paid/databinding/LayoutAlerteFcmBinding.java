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
public final class LayoutAlerteFcmBinding implements a {
    public final Button okButton;
    public final Button okButton2;
    private final LinearLayout rootView;
    public final TextView textMessage;
    public final TextView textMessage2;
    public final TextView textTitre;
    public final TextView titleFcmToken;
    public final TextView titleJetonId;

    private LayoutAlerteFcmBinding(LinearLayout linearLayout, Button button, Button button2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.okButton = button;
        this.okButton2 = button2;
        this.textMessage = textView;
        this.textMessage2 = textView2;
        this.textTitre = textView3;
        this.titleFcmToken = textView4;
        this.titleJetonId = textView5;
    }

    public static LayoutAlerteFcmBinding bind(View view) {
        int i10 = R.id.okButton;
        Button button = (Button) b.findChildViewById(view, R.id.okButton);
        if (button != null) {
            i10 = R.id.okButton2;
            Button button2 = (Button) b.findChildViewById(view, R.id.okButton2);
            if (button2 != null) {
                i10 = R.id.textMessage;
                TextView textView = (TextView) b.findChildViewById(view, R.id.textMessage);
                if (textView != null) {
                    i10 = R.id.textMessage2;
                    TextView textView2 = (TextView) b.findChildViewById(view, R.id.textMessage2);
                    if (textView2 != null) {
                        i10 = R.id.textTitre;
                        TextView textView3 = (TextView) b.findChildViewById(view, R.id.textTitre);
                        if (textView3 != null) {
                            i10 = R.id.titleFcmToken;
                            TextView textView4 = (TextView) b.findChildViewById(view, R.id.titleFcmToken);
                            if (textView4 != null) {
                                i10 = R.id.titleJetonId;
                                TextView textView5 = (TextView) b.findChildViewById(view, R.id.titleJetonId);
                                if (textView5 != null) {
                                    return new LayoutAlerteFcmBinding((LinearLayout) view, button, button2, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlerteFcmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlerteFcmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_fcm, viewGroup, false);
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
