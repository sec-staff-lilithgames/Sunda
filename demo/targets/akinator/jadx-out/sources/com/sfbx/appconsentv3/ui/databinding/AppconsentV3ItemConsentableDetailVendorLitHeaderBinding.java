package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.RejectButtonView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemConsentableDetailVendorLitHeaderBinding implements a {
    public final RejectButtonView rejectButton;
    private final ConstraintLayout rootView;
    public final AppCompatTextView textVendorLitHeader;

    private AppconsentV3ItemConsentableDetailVendorLitHeaderBinding(ConstraintLayout constraintLayout, RejectButtonView rejectButtonView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.rejectButton = rejectButtonView;
        this.textVendorLitHeader = appCompatTextView;
    }

    public static AppconsentV3ItemConsentableDetailVendorLitHeaderBinding bind(View view) {
        int i10 = R.id.reject_button;
        RejectButtonView rejectButtonView = (RejectButtonView) b.findChildViewById(view, i10);
        if (rejectButtonView != null) {
            i10 = R.id.text_vendor_lit_header;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                return new AppconsentV3ItemConsentableDetailVendorLitHeaderBinding((ConstraintLayout) view, rejectButtonView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemConsentableDetailVendorLitHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemConsentableDetailVendorLitHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_consentable_detail_vendor_lit_header, viewGroup, false);
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
