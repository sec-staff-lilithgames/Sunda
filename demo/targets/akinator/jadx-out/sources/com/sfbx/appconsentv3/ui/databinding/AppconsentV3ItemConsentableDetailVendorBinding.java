package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemConsentableDetailVendorBinding implements a {
    public final AppCompatImageView iabLogo;
    public final ConstraintLayout layoutVendorItem;
    private final ConstraintLayout rootView;
    public final View separator;
    public final AppCompatTextView textDisplayAll;
    public final AppCompatTextView textPolicy;
    public final AppCompatTextView textVendorName;

    private AppconsentV3ItemConsentableDetailVendorBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.iabLogo = appCompatImageView;
        this.layoutVendorItem = constraintLayout2;
        this.separator = view;
        this.textDisplayAll = appCompatTextView;
        this.textPolicy = appCompatTextView2;
        this.textVendorName = appCompatTextView3;
    }

    public static AppconsentV3ItemConsentableDetailVendorBinding bind(View view) {
        int i10 = R.id.iab_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.separator;
            View viewFindChildViewById = b.findChildViewById(view, i10);
            if (viewFindChildViewById != null) {
                i10 = R.id.text_display_all;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView != null) {
                    i10 = R.id.text_policy;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.text_vendor_name;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                        if (appCompatTextView3 != null) {
                            return new AppconsentV3ItemConsentableDetailVendorBinding(constraintLayout, appCompatImageView, constraintLayout, viewFindChildViewById, appCompatTextView, appCompatTextView2, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemConsentableDetailVendorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemConsentableDetailVendorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_consentable_detail_vendor, viewGroup, false);
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
