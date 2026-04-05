package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3CardIllustratedBinding implements a {
    public final AppCompatImageView imageBannerBackground;
    private final LinearLayoutCompat rootView;

    private AppconsentV3CardIllustratedBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayoutCompat;
        this.imageBannerBackground = appCompatImageView;
    }

    public static AppconsentV3CardIllustratedBinding bind(View view) {
        int i10 = R.id.image_banner_background;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            return new AppconsentV3CardIllustratedBinding((LinearLayoutCompat) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3CardIllustratedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3CardIllustratedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_card_illustrated, viewGroup, false);
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
