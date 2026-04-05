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
public final class AppconsentV3ItemVendorDetailConsentableBinding implements a {
    public final AppCompatImageView consentableLogo;
    private final ConstraintLayout rootView;
    public final AppCompatTextView textConsentableName;
    public final AppCompatTextView textConsentableType;
    public final View vendorConsentableSeparator;

    private AppconsentV3ItemVendorDetailConsentableBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view) {
        this.rootView = constraintLayout;
        this.consentableLogo = appCompatImageView;
        this.textConsentableName = appCompatTextView;
        this.textConsentableType = appCompatTextView2;
        this.vendorConsentableSeparator = view;
    }

    public static AppconsentV3ItemVendorDetailConsentableBinding bind(View view) {
        View viewFindChildViewById;
        int i10 = R.id.consentable_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.text_consentable_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.text_consentable_type;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null && (viewFindChildViewById = b.findChildViewById(view, (i10 = R.id.vendor_consentable_separator))) != null) {
                    return new AppconsentV3ItemVendorDetailConsentableBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemVendorDetailConsentableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemVendorDetailConsentableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_vendor_detail_consentable, viewGroup, false);
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
