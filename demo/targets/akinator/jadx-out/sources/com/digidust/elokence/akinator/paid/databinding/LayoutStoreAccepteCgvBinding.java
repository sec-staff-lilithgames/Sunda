package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutStoreAccepteCgvBinding implements a {
    private final TextView rootView;
    public final TextView storeTexteAccepteCGV;

    private LayoutStoreAccepteCgvBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.storeTexteAccepteCGV = textView2;
    }

    public static LayoutStoreAccepteCgvBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new LayoutStoreAccepteCgvBinding(textView, textView);
    }

    public static LayoutStoreAccepteCgvBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutStoreAccepteCgvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_store_accepte_cgv, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public TextView getRoot() {
        return this.rootView;
    }
}
