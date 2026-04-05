package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ViewBasicDialogBinding implements a {
    public final AppCompatButton basicDialogCloseButton;
    public final ConstraintLayout basicDialogContainer;
    public final AppCompatTextView basicDialogMessage;
    private final ConstraintLayout rootView;

    private AppconsentV3ViewBasicDialogBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.basicDialogCloseButton = appCompatButton;
        this.basicDialogContainer = constraintLayout2;
        this.basicDialogMessage = appCompatTextView;
    }

    public static AppconsentV3ViewBasicDialogBinding bind(View view) {
        int i10 = R.id.basic_dialog_close_button;
        AppCompatButton appCompatButton = (AppCompatButton) b.findChildViewById(view, i10);
        if (appCompatButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = R.id.basic_dialog_message;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i11);
            if (appCompatTextView != null) {
                return new AppconsentV3ViewBasicDialogBinding(constraintLayout, appCompatButton, constraintLayout, appCompatTextView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ViewBasicDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ViewBasicDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_view_basic_dialog, viewGroup, false);
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
