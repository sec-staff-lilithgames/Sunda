package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.ViewPagerCustom;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FragmentSliderBinding implements a {
    public final LinearLayout layoutClickImages;
    public final ViewPagerCustom pager;
    private final RelativeLayout rootView;

    private FragmentSliderBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, ViewPagerCustom viewPagerCustom) {
        this.rootView = relativeLayout;
        this.layoutClickImages = linearLayout;
        this.pager = viewPagerCustom;
    }

    public static FragmentSliderBinding bind(View view) {
        int i10 = R.id.layoutClickImages;
        LinearLayout linearLayout = (LinearLayout) b.findChildViewById(view, R.id.layoutClickImages);
        if (linearLayout != null) {
            i10 = R.id.pager;
            ViewPagerCustom viewPagerCustom = (ViewPagerCustom) b.findChildViewById(view, R.id.pager);
            if (viewPagerCustom != null) {
                return new FragmentSliderBinding((RelativeLayout) view, linearLayout, viewPagerCustom);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentSliderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSliderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_slider, viewGroup, false);
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
