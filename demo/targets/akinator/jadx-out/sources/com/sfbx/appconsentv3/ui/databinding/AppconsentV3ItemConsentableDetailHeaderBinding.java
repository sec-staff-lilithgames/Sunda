package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemConsentableDetailHeaderBinding implements a {
    public final ImageView imageConsentableDetailApplicationExample;
    private final ConstraintLayout rootView;
    public final AppCompatTextView textConsentableDetailAdditionnalText;
    public final AppCompatTextView textConsentableDetailHeader;
    public final AppCompatTextView textConsentableDetailSeeMore;

    private AppconsentV3ItemConsentableDetailHeaderBinding(ConstraintLayout constraintLayout, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.imageConsentableDetailApplicationExample = imageView;
        this.textConsentableDetailAdditionnalText = appCompatTextView;
        this.textConsentableDetailHeader = appCompatTextView2;
        this.textConsentableDetailSeeMore = appCompatTextView3;
    }

    public static AppconsentV3ItemConsentableDetailHeaderBinding bind(View view) {
        int i10 = R.id.image_consentable_detail_application_example;
        ImageView imageView = (ImageView) b.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.text_consentable_detail_additionnal_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.text_consentable_detail_header;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.text_consentable_detail_see_more;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                    if (appCompatTextView3 != null) {
                        return new AppconsentV3ItemConsentableDetailHeaderBinding((ConstraintLayout) view, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemConsentableDetailHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemConsentableDetailHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_consentable_detail_header, viewGroup, false);
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
