package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3FragmentVendorListBinding implements a {
    public final AppCompatImageView imageClose;
    public final RecyclerView recyclerVendors;
    private final ConstraintLayout rootView;
    public final AppCompatTextView textTitle;

    private AppconsentV3FragmentVendorListBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.imageClose = appCompatImageView;
        this.recyclerVendors = recyclerView;
        this.textTitle = appCompatTextView;
    }

    public static AppconsentV3FragmentVendorListBinding bind(View view) {
        int i10 = R.id.image_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.recycler_vendors;
            RecyclerView recyclerView = (RecyclerView) b.findChildViewById(view, i10);
            if (recyclerView != null) {
                i10 = R.id.text_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView != null) {
                    return new AppconsentV3FragmentVendorListBinding((ConstraintLayout) view, appCompatImageView, recyclerView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3FragmentVendorListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3FragmentVendorListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_fragment_vendor_list, viewGroup, false);
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
