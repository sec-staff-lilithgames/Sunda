package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewConsentableBannerBinding implements a {
    public final AppCompatButton buttonSave;
    public final LinearLayoutCompat layoutConsentActionBanner;
    private final LinearLayoutCompat rootView;
    public final View separator;

    private AppconsentV3ViewConsentableBannerBinding(LinearLayoutCompat linearLayoutCompat, AppCompatButton appCompatButton, LinearLayoutCompat linearLayoutCompat2, View view) {
        this.rootView = linearLayoutCompat;
        this.buttonSave = appCompatButton;
        this.layoutConsentActionBanner = linearLayoutCompat2;
        this.separator = view;
    }

    public static AppconsentV3ViewConsentableBannerBinding bind(View view) {
        int i10 = R.id.button_save;
        AppCompatButton appCompatButton = (AppCompatButton) b.findChildViewById(view, i10);
        if (appCompatButton != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
            int i11 = R.id.separator;
            View viewFindChildViewById = b.findChildViewById(view, i11);
            if (viewFindChildViewById != null) {
                return new AppconsentV3ViewConsentableBannerBinding(linearLayoutCompat, appCompatButton, linearLayoutCompat, viewFindChildViewById);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewConsentableBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewConsentableBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_consentable_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
