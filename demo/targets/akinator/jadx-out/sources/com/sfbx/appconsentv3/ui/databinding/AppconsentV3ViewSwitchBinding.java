package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewSwitchBinding implements a {
    private final ConstraintLayout rootView;
    public final AppCompatImageView switchAllowed;
    public final ConstraintLayout switchContainer;
    public final AppCompatImageView switchDisallowed;
    public final AppCompatImageView switchMixed;
    public final AppCompatImageView switchSeparator;

    private AppconsentV3ViewSwitchBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4) {
        this.rootView = constraintLayout;
        this.switchAllowed = appCompatImageView;
        this.switchContainer = constraintLayout2;
        this.switchDisallowed = appCompatImageView2;
        this.switchMixed = appCompatImageView3;
        this.switchSeparator = appCompatImageView4;
    }

    public static AppconsentV3ViewSwitchBinding bind(View view) {
        int i10 = R.id.switch_allowed;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.switch_disallowed;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.findChildViewById(view, i10);
            if (appCompatImageView2 != null) {
                i10 = R.id.switch_mixed;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) b.findChildViewById(view, i10);
                if (appCompatImageView3 != null) {
                    i10 = R.id.switch_separator;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) b.findChildViewById(view, i10);
                    if (appCompatImageView4 != null) {
                        return new AppconsentV3ViewSwitchBinding(constraintLayout, appCompatImageView, constraintLayout, appCompatImageView2, appCompatImageView3, appCompatImageView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewSwitchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewSwitchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_switch, viewGroup, false);
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
