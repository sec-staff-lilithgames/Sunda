package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.GeolocationBannerView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityGeolocationBinding implements a {
    public final GeolocationBannerView geolocationBanner;
    public final ConstraintLayout intLayout;
    public final RecyclerView recyclerGeolocation;
    private final ConstraintLayout rootView;

    private AppconsentV3ActivityGeolocationBinding(ConstraintLayout constraintLayout, GeolocationBannerView geolocationBannerView, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.geolocationBanner = geolocationBannerView;
        this.intLayout = constraintLayout2;
        this.recyclerGeolocation = recyclerView;
    }

    public static AppconsentV3ActivityGeolocationBinding bind(View view) {
        int i10 = R.id.geolocation_banner;
        GeolocationBannerView geolocationBannerView = (GeolocationBannerView) b.findChildViewById(view, i10);
        if (geolocationBannerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = R.id.recycler_geolocation;
            RecyclerView recyclerView = (RecyclerView) b.findChildViewById(view, i11);
            if (recyclerView != null) {
                return new AppconsentV3ActivityGeolocationBinding(constraintLayout, geolocationBannerView, constraintLayout, recyclerView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ActivityGeolocationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityGeolocationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_geolocation, viewGroup, false);
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
