package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.AkinatorSmallButton;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutAlertePtsPerdusBinding implements a {
    public final ListView layoutFakeAkiAwards;
    public final AkinatorSmallButton okButton;
    public final TextView ptsPerdus;
    private final LinearLayout rootView;

    private LayoutAlertePtsPerdusBinding(LinearLayout linearLayout, ListView listView, AkinatorSmallButton akinatorSmallButton, TextView textView) {
        this.rootView = linearLayout;
        this.layoutFakeAkiAwards = listView;
        this.okButton = akinatorSmallButton;
        this.ptsPerdus = textView;
    }

    public static LayoutAlertePtsPerdusBinding bind(View view) {
        int i10 = R.id.layoutFakeAkiAwards;
        ListView listView = (ListView) b.findChildViewById(view, R.id.layoutFakeAkiAwards);
        if (listView != null) {
            i10 = R.id.okButton;
            AkinatorSmallButton akinatorSmallButton = (AkinatorSmallButton) b.findChildViewById(view, R.id.okButton);
            if (akinatorSmallButton != null) {
                i10 = R.id.ptsPerdus;
                TextView textView = (TextView) b.findChildViewById(view, R.id.ptsPerdus);
                if (textView != null) {
                    return new LayoutAlertePtsPerdusBinding((LinearLayout) view, listView, akinatorSmallButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAlertePtsPerdusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAlertePtsPerdusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_alerte_pts_perdus, viewGroup, false);
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
