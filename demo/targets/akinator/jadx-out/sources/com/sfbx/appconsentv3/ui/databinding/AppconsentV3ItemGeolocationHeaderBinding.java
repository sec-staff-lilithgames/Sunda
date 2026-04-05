package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemGeolocationHeaderBinding implements a {
    public final AppCompatImageView imageGeolocationHeader;
    private final ConstraintLayout rootView;
    public final AppCompatTextView textMessage;
    public final AppCompatTextView textMessageHidden;
    public final AppCompatTextView textSeeMore;
    public final AppCompatTextView textSubtitle;
    public final AppCompatTextView textTitle;

    private AppconsentV3ItemGeolocationHeaderBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.rootView = constraintLayout;
        this.imageGeolocationHeader = appCompatImageView;
        this.textMessage = appCompatTextView;
        this.textMessageHidden = appCompatTextView2;
        this.textSeeMore = appCompatTextView3;
        this.textSubtitle = appCompatTextView4;
        this.textTitle = appCompatTextView5;
    }

    public static AppconsentV3ItemGeolocationHeaderBinding bind(View view) {
        int i10 = R.id.image_geolocation_header;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.text_message;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.text_message_hidden;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.text_see_more;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                    if (appCompatTextView3 != null) {
                        i10 = R.id.text_subtitle;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) b.findChildViewById(view, i10);
                        if (appCompatTextView4 != null) {
                            i10 = R.id.text_title;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) b.findChildViewById(view, i10);
                            if (appCompatTextView5 != null) {
                                return new AppconsentV3ItemGeolocationHeaderBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemGeolocationHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemGeolocationHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_geolocation_header, viewGroup, false);
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
