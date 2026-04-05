package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityRefineByVendorBinding implements a {
    public final ConstraintLayout intLayout;
    private final ConstraintLayout rootView;
    public final TabLayout tabLayout;
    public final ViewPager2 viewPager;

    private AppconsentV3ActivityRefineByVendorBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.intLayout = constraintLayout2;
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
    }

    public static AppconsentV3ActivityRefineByVendorBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.tab_layout;
        TabLayout tabLayout = (TabLayout) b.findChildViewById(view, i10);
        if (tabLayout != null) {
            i10 = R.id.view_pager;
            ViewPager2 viewPager2 = (ViewPager2) b.findChildViewById(view, i10);
            if (viewPager2 != null) {
                return new AppconsentV3ActivityRefineByVendorBinding(constraintLayout, constraintLayout, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ActivityRefineByVendorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityRefineByVendorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_refine_by_vendor, viewGroup, false);
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
