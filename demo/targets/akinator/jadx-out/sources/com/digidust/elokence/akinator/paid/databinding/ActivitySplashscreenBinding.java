package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ActivitySplashscreenBinding implements a {
    public final ImageView akLogoElokence;
    public final ProgressBar loadingBar;
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final View viewVide;

    private ActivitySplashscreenBinding(RelativeLayout relativeLayout, ImageView imageView, ProgressBar progressBar, RelativeLayout relativeLayout2, View view) {
        this.rootView = relativeLayout;
        this.akLogoElokence = imageView;
        this.loadingBar = progressBar;
        this.mainLayout = relativeLayout2;
        this.viewVide = view;
    }

    public static ActivitySplashscreenBinding bind(View view) {
        int i10 = R.id.ak_logo_elokence;
        ImageView imageView = (ImageView) b.findChildViewById(view, R.id.ak_logo_elokence);
        if (imageView != null) {
            i10 = R.id.loadingBar;
            ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, R.id.loadingBar);
            if (progressBar != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.viewVide;
                View viewFindChildViewById = b.findChildViewById(view, R.id.viewVide);
                if (viewFindChildViewById != null) {
                    return new ActivitySplashscreenBinding(relativeLayout, imageView, progressBar, relativeLayout, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivitySplashscreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySplashscreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_splashscreen, viewGroup, false);
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
