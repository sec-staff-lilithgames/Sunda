package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3FragmentDisplayByVendorTabBinding implements a {
    public final RecyclerView recyclerVendors;
    private final RelativeLayout rootView;

    private AppconsentV3FragmentDisplayByVendorTabBinding(RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.recyclerVendors = recyclerView;
    }

    public static AppconsentV3FragmentDisplayByVendorTabBinding bind(View view) {
        int i10 = R.id.recycler_vendors;
        RecyclerView recyclerView = (RecyclerView) b.findChildViewById(view, i10);
        if (recyclerView != null) {
            return new AppconsentV3FragmentDisplayByVendorTabBinding((RelativeLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3FragmentDisplayByVendorTabBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3FragmentDisplayByVendorTabBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_fragment_display_by_vendor_tab, viewGroup, false);
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
