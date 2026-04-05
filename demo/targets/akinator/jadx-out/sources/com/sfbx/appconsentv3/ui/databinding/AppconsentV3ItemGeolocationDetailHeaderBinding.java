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
public final class AppconsentV3ItemGeolocationDetailHeaderBinding implements a {
    public final AppCompatImageView consentableLogo;
    public final AppCompatTextView consentableName;
    public final SwitchView consentableSwitch;
    private final LinearLayoutCompat rootView;

    private AppconsentV3ItemGeolocationDetailHeaderBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, SwitchView switchView) {
        this.rootView = linearLayoutCompat;
        this.consentableLogo = appCompatImageView;
        this.consentableName = appCompatTextView;
        this.consentableSwitch = switchView;
    }

    public static AppconsentV3ItemGeolocationDetailHeaderBinding bind(View view) {
        int i10 = R.id.consentable_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.consentable_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.consentable_switch;
                SwitchView switchView = (SwitchView) b.findChildViewById(view, i10);
                if (switchView != null) {
                    return new AppconsentV3ItemGeolocationDetailHeaderBinding((LinearLayoutCompat) view, appCompatImageView, appCompatTextView, switchView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemGeolocationDetailHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemGeolocationDetailHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_geolocation_detail_header, viewGroup, false);
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
