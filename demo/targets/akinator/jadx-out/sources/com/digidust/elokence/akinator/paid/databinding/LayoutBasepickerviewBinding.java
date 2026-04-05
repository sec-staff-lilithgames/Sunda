package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutBasepickerviewBinding implements a {
    public final FrameLayout contentContainer;
    public final FrameLayout outmostContainer;
    private final FrameLayout rootView;

    private LayoutBasepickerviewBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.contentContainer = frameLayout2;
        this.outmostContainer = frameLayout3;
    }

    public static LayoutBasepickerviewBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.content_container);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.content_container)));
        }
        FrameLayout frameLayout2 = (FrameLayout) view;
        return new LayoutBasepickerviewBinding(frameLayout2, frameLayout, frameLayout2);
    }

    public static LayoutBasepickerviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBasepickerviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_basepickerview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
