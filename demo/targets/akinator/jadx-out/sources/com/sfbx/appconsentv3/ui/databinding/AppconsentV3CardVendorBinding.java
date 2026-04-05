package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.SwitchView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3CardVendorBinding implements a {
    private final ConstraintLayout rootView;
    public final View separator;
    public final AppCompatTextView vendorLearnMore;
    public final AppCompatTextView vendorName;
    public final SwitchView vendorSwitch;

    private AppconsentV3CardVendorBinding(ConstraintLayout constraintLayout, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, SwitchView switchView) {
        this.rootView = constraintLayout;
        this.separator = view;
        this.vendorLearnMore = appCompatTextView;
        this.vendorName = appCompatTextView2;
        this.vendorSwitch = switchView;
    }

    public static AppconsentV3CardVendorBinding bind(View view) {
        int i10 = R.id.separator;
        View viewFindChildViewById = b.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            i10 = R.id.vendor_learn_more;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.vendor_name;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.vendor_switch;
                    SwitchView switchView = (SwitchView) b.findChildViewById(view, i10);
                    if (switchView != null) {
                        return new AppconsentV3CardVendorBinding((ConstraintLayout) view, viewFindChildViewById, appCompatTextView, appCompatTextView2, switchView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3CardVendorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3CardVendorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_card_vendor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
