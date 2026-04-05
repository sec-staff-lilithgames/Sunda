package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutAdBannerBinding implements a {
    public final Button imageCroixFermetureBanner;
    public final FrameLayout layoutBannerAd;
    private final RelativeLayout rootView;

    private LayoutAdBannerBinding(RelativeLayout relativeLayout, Button button, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.imageCroixFermetureBanner = button;
        this.layoutBannerAd = frameLayout;
    }

    public static LayoutAdBannerBinding bind(View view) {
        int i10 = R.id.imageCroixFermetureBanner;
        Button button = (Button) b.findChildViewById(view, R.id.imageCroixFermetureBanner);
        if (button != null) {
            i10 = R.id.layoutBannerAd;
            FrameLayout frameLayout = (FrameLayout) b.findChildViewById(view, R.id.layoutBannerAd);
            if (frameLayout != null) {
                return new LayoutAdBannerBinding((RelativeLayout) view, button, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutAdBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutAdBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_ad_banner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
