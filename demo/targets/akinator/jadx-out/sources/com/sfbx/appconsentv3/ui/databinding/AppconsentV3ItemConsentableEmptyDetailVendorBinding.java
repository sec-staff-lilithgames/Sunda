package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemConsentableEmptyDetailVendorBinding implements a {
    public final AppCompatTextView appconsentClearItemConsentableEmptyTextDisplayAll;
    public final ConstraintLayout layoutVendorItem;
    private final ConstraintLayout rootView;

    private AppconsentV3ItemConsentableEmptyDetailVendorBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.appconsentClearItemConsentableEmptyTextDisplayAll = appCompatTextView;
        this.layoutVendorItem = constraintLayout2;
    }

    public static AppconsentV3ItemConsentableEmptyDetailVendorBinding bind(View view) {
        int i10 = R.id.appconsent_clear_item_consentable_empty_text_display_all;
        AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
        if (appCompatTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new AppconsentV3ItemConsentableEmptyDetailVendorBinding(constraintLayout, appCompatTextView, constraintLayout);
    }

    public static AppconsentV3ItemConsentableEmptyDetailVendorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemConsentableEmptyDetailVendorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_consentable_empty_detail_vendor, viewGroup, false);
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
