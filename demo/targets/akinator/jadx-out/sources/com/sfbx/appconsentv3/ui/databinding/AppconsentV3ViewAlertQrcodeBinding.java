package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewAlertQrcodeBinding implements a {
    public final AppCompatButton alertQrcodeCloseButton;
    public final ConstraintLayout alertQrcodeContainer;
    public final AppCompatTextView alertQrcodeDescription;
    public final Guideline alertQrcodeGuideline;
    public final AppCompatTextView alertQrcodeHelp;
    public final AppCompatImageView alertQrcodeImage;
    public final AppCompatTextView alertQrcodeTitle;
    private final ConstraintLayout rootView;

    private AppconsentV3ViewAlertQrcodeBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, Guideline guideline, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.alertQrcodeCloseButton = appCompatButton;
        this.alertQrcodeContainer = constraintLayout2;
        this.alertQrcodeDescription = appCompatTextView;
        this.alertQrcodeGuideline = guideline;
        this.alertQrcodeHelp = appCompatTextView2;
        this.alertQrcodeImage = appCompatImageView;
        this.alertQrcodeTitle = appCompatTextView3;
    }

    public static AppconsentV3ViewAlertQrcodeBinding bind(View view) {
        int i10 = R.id.alert_qrcode_close_button;
        AppCompatButton appCompatButton = (AppCompatButton) b.findChildViewById(view, i10);
        if (appCompatButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.alert_qrcode_description;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                Guideline guideline = (Guideline) b.findChildViewById(view, R.id.alert_qrcode_guideline);
                i10 = R.id.alert_qrcode_help;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.alert_qrcode_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
                    if (appCompatImageView != null) {
                        i10 = R.id.alert_qrcode_title;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                        if (appCompatTextView3 != null) {
                            return new AppconsentV3ViewAlertQrcodeBinding(constraintLayout, appCompatButton, constraintLayout, appCompatTextView, guideline, appCompatTextView2, appCompatImageView, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewAlertQrcodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewAlertQrcodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_alert_qrcode, viewGroup, false);
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
