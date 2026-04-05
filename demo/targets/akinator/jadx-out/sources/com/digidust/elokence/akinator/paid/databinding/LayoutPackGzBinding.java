package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.views.DarkAutoButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutPackGzBinding implements a {
    public final DarkAutoButton buttonBuyGz1;
    public final DarkAutoButton buttonBuyGz2;
    public final DarkAutoButton buttonBuyGz3;
    public final DarkAutoButton buttonBuyGz4;
    public final DarkAutoButton buttonBuyGz5;
    public final LinearLayout layoutGetGz;
    private final LinearLayout rootView;
    public final TextView textGz1;
    public final TextView textGz2;
    public final TextView textGz3;
    public final TextView textGz4;
    public final TextView textGz5;

    private LayoutPackGzBinding(LinearLayout linearLayout, DarkAutoButton darkAutoButton, DarkAutoButton darkAutoButton2, DarkAutoButton darkAutoButton3, DarkAutoButton darkAutoButton4, DarkAutoButton darkAutoButton5, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.buttonBuyGz1 = darkAutoButton;
        this.buttonBuyGz2 = darkAutoButton2;
        this.buttonBuyGz3 = darkAutoButton3;
        this.buttonBuyGz4 = darkAutoButton4;
        this.buttonBuyGz5 = darkAutoButton5;
        this.layoutGetGz = linearLayout2;
        this.textGz1 = textView;
        this.textGz2 = textView2;
        this.textGz3 = textView3;
        this.textGz4 = textView4;
        this.textGz5 = textView5;
    }

    public static LayoutPackGzBinding bind(View view) {
        int i10 = R.id.buttonBuyGz1;
        DarkAutoButton darkAutoButton = (DarkAutoButton) b.findChildViewById(view, R.id.buttonBuyGz1);
        if (darkAutoButton != null) {
            i10 = R.id.buttonBuyGz2;
            DarkAutoButton darkAutoButton2 = (DarkAutoButton) b.findChildViewById(view, R.id.buttonBuyGz2);
            if (darkAutoButton2 != null) {
                i10 = R.id.buttonBuyGz3;
                DarkAutoButton darkAutoButton3 = (DarkAutoButton) b.findChildViewById(view, R.id.buttonBuyGz3);
                if (darkAutoButton3 != null) {
                    i10 = R.id.buttonBuyGz4;
                    DarkAutoButton darkAutoButton4 = (DarkAutoButton) b.findChildViewById(view, R.id.buttonBuyGz4);
                    if (darkAutoButton4 != null) {
                        i10 = R.id.buttonBuyGz5;
                        DarkAutoButton darkAutoButton5 = (DarkAutoButton) b.findChildViewById(view, R.id.buttonBuyGz5);
                        if (darkAutoButton5 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i10 = R.id.textGz1;
                            TextView textView = (TextView) b.findChildViewById(view, R.id.textGz1);
                            if (textView != null) {
                                i10 = R.id.textGz2;
                                TextView textView2 = (TextView) b.findChildViewById(view, R.id.textGz2);
                                if (textView2 != null) {
                                    i10 = R.id.textGz3;
                                    TextView textView3 = (TextView) b.findChildViewById(view, R.id.textGz3);
                                    if (textView3 != null) {
                                        i10 = R.id.textGz4;
                                        TextView textView4 = (TextView) b.findChildViewById(view, R.id.textGz4);
                                        if (textView4 != null) {
                                            i10 = R.id.textGz5;
                                            TextView textView5 = (TextView) b.findChildViewById(view, R.id.textGz5);
                                            if (textView5 != null) {
                                                return new LayoutPackGzBinding(linearLayout, darkAutoButton, darkAutoButton2, darkAutoButton3, darkAutoButton4, darkAutoButton5, linearLayout, textView, textView2, textView3, textView4, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutPackGzBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutPackGzBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_pack_gz, viewGroup, false);
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
