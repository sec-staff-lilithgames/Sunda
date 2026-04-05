package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.SwitchView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewConsentableBinding implements a {
    public final AppCompatImageView consentableLogo;
    public final AppCompatTextView consentableMore;
    public final AppCompatTextView consentableName;
    public final AppCompatTextView consentableNumberVendors;
    public final SwitchView consentableSwitch;
    private final LinearLayoutCompat rootView;

    private AppconsentV3ViewConsentableBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, SwitchView switchView) {
        this.rootView = linearLayoutCompat;
        this.consentableLogo = appCompatImageView;
        this.consentableMore = appCompatTextView;
        this.consentableName = appCompatTextView2;
        this.consentableNumberVendors = appCompatTextView3;
        this.consentableSwitch = switchView;
    }

    public static AppconsentV3ViewConsentableBinding bind(View view) {
        int i10 = R.id.consentable_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.consentable_more;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.consentable_name;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.consentable_number_vendors;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                    if (appCompatTextView3 != null) {
                        i10 = R.id.consentable_switch;
                        SwitchView switchView = (SwitchView) b.findChildViewById(view, i10);
                        if (switchView != null) {
                            return new AppconsentV3ViewConsentableBinding((LinearLayoutCompat) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, switchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewConsentableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewConsentableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_consentable, viewGroup, false);
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
