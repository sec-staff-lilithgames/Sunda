package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityFinishBinding implements a {
    public final AppCompatButton buttonClose;
    public final AppCompatImageView imageSuccess;
    public final ConstraintLayout intLayout;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollView;
    public final AppCompatImageView succesIllustration;
    public final ConstraintLayout successContainer;
    public final AppCompatTextView textCongrats;
    public final AppCompatTextView textDescription;
    public final AppCompatTextView textSubtitle;

    private AppconsentV3ActivityFinishBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.buttonClose = appCompatButton;
        this.imageSuccess = appCompatImageView;
        this.intLayout = constraintLayout2;
        this.scrollView = nestedScrollView;
        this.succesIllustration = appCompatImageView2;
        this.successContainer = constraintLayout3;
        this.textCongrats = appCompatTextView;
        this.textDescription = appCompatTextView2;
        this.textSubtitle = appCompatTextView3;
    }

    public static AppconsentV3ActivityFinishBinding bind(View view) {
        int i10 = R.id.button_close;
        AppCompatButton appCompatButton = (AppCompatButton) b.findChildViewById(view, i10);
        if (appCompatButton != null) {
            i10 = R.id.image_success;
            AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) b.findChildViewById(view, i10);
                if (nestedScrollView != null) {
                    i10 = R.id.succes_illustration;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.findChildViewById(view, i10);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.success_container;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) b.findChildViewById(view, i10);
                        if (constraintLayout2 != null) {
                            i10 = R.id.text_congrats;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
                            if (appCompatTextView != null) {
                                i10 = R.id.text_description;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                                if (appCompatTextView2 != null) {
                                    i10 = R.id.text_subtitle;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                                    if (appCompatTextView3 != null) {
                                        return new AppconsentV3ActivityFinishBinding(constraintLayout, appCompatButton, appCompatImageView, constraintLayout, nestedScrollView, appCompatImageView2, constraintLayout2, appCompatTextView, appCompatTextView2, appCompatTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ActivityFinishBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityFinishBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_finish, viewGroup, false);
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
