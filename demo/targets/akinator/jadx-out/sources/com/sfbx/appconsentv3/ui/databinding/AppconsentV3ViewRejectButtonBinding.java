package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewRejectButtonBinding implements a {
    public final ConstraintLayout layoutReject;
    public final AppCompatCheckBox rejectCheckBox;
    public final AppCompatTextView rejectLabel;
    private final ConstraintLayout rootView;

    private AppconsentV3ViewRejectButtonBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatCheckBox appCompatCheckBox, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.layoutReject = constraintLayout2;
        this.rejectCheckBox = appCompatCheckBox;
        this.rejectLabel = appCompatTextView;
    }

    public static AppconsentV3ViewRejectButtonBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.reject_checkBox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) b.findChildViewById(view, i10);
        if (appCompatCheckBox != null) {
            i10 = R.id.reject_label;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                return new AppconsentV3ViewRejectButtonBinding(constraintLayout, constraintLayout, appCompatCheckBox, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewRejectButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewRejectButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_reject_button, viewGroup, false);
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
