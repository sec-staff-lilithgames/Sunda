package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutLineBinding implements a {
    private final View rootView;

    private LayoutLineBinding(View view) {
        this.rootView = view;
    }

    public static LayoutLineBinding bind(View view) {
        if (view != null) {
            return new LayoutLineBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    public static LayoutLineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // h6.a
    public View getRoot() {
        return this.rootView;
    }

    public static LayoutLineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_line, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
