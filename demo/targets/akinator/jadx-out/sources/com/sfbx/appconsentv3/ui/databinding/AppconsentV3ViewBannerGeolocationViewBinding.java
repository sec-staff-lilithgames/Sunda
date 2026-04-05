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
public final class AppconsentV3ViewBannerGeolocationViewBinding implements a {
    public final LinearLayoutCompat geoBanner;
    public final AppCompatButton geoSave;
    private final LinearLayoutCompat rootView;

    private AppconsentV3ViewBannerGeolocationViewBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, AppCompatButton appCompatButton) {
        this.rootView = linearLayoutCompat;
        this.geoBanner = linearLayoutCompat2;
        this.geoSave = appCompatButton;
    }

    public static AppconsentV3ViewBannerGeolocationViewBinding bind(View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i10 = R.id.geo_save;
        AppCompatButton appCompatButton = (AppCompatButton) b.findChildViewById(view, i10);
        if (appCompatButton != null) {
            return new AppconsentV3ViewBannerGeolocationViewBinding(linearLayoutCompat, linearLayoutCompat, appCompatButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewBannerGeolocationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewBannerGeolocationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_banner_geolocation_view, viewGroup, false);
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
