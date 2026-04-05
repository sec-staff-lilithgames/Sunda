package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutLoadingBinding implements a {
    public final RelativeLayout progres;
    private final RelativeLayout rootView;
    public final TextView textInLoading;

    private LayoutLoadingBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.progres = relativeLayout2;
        this.textInLoading = textView;
    }

    public static LayoutLoadingBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        TextView textView = (TextView) b.findChildViewById(view, R.id.textInLoading);
        if (textView != null) {
            return new LayoutLoadingBinding(relativeLayout, relativeLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.textInLoading)));
    }

    public static LayoutLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_loading, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
