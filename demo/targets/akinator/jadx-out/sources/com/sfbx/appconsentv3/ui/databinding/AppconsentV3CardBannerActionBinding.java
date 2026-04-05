package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.NoticeBannerView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3CardBannerActionBinding implements a {
    public final NoticeBannerView layoutConsentActionBanner;
    private final LinearLayoutCompat rootView;

    private AppconsentV3CardBannerActionBinding(LinearLayoutCompat linearLayoutCompat, NoticeBannerView noticeBannerView) {
        this.rootView = linearLayoutCompat;
        this.layoutConsentActionBanner = noticeBannerView;
    }

    public static AppconsentV3CardBannerActionBinding bind(View view) {
        int i10 = R.id.layout_consent_action_banner;
        NoticeBannerView noticeBannerView = (NoticeBannerView) b.findChildViewById(view, i10);
        if (noticeBannerView != null) {
            return new AppconsentV3CardBannerActionBinding((LinearLayoutCompat) view, noticeBannerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3CardBannerActionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3CardBannerActionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_card_banner_action, viewGroup, false);
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
