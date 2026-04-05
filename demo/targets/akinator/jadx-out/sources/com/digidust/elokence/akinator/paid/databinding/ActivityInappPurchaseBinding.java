package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivityInappPurchaseBinding implements a {
    private final RelativeLayout rootView;

    private ActivityInappPurchaseBinding(RelativeLayout relativeLayout) {
        this.rootView = relativeLayout;
    }

    public static ActivityInappPurchaseBinding bind(View view) {
        if (view != null) {
            return new ActivityInappPurchaseBinding((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ActivityInappPurchaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityInappPurchaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_inapp_purchase, viewGroup, false);
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
