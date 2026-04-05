package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3FragmentNoticeUserBinding implements a {
    public final AppCompatImageView appconsentClearNoticeUserImageClose;
    public final AppCompatTextView appconsentClearNoticeUserTextCopy;
    public final AppCompatTextView appconsentClearNoticeUserTextDescription;
    public final AppCompatTextView appconsentClearNoticeUserTextTitle;
    public final AppCompatTextView appconsentClearNoticeUserTextUuid;
    private final LinearLayoutCompat rootView;

    private AppconsentV3FragmentNoticeUserBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.rootView = linearLayoutCompat;
        this.appconsentClearNoticeUserImageClose = appCompatImageView;
        this.appconsentClearNoticeUserTextCopy = appCompatTextView;
        this.appconsentClearNoticeUserTextDescription = appCompatTextView2;
        this.appconsentClearNoticeUserTextTitle = appCompatTextView3;
        this.appconsentClearNoticeUserTextUuid = appCompatTextView4;
    }

    public static AppconsentV3FragmentNoticeUserBinding bind(View view) {
        int i10 = R.id.appconsent_clear_notice_user_image_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.appconsent_clear_notice_user_text_copy;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.appconsent_clear_notice_user_text_description;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.appconsent_clear_notice_user_text_title;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) b.findChildViewById(view, i10);
                    if (appCompatTextView3 != null) {
                        i10 = R.id.appconsent_clear_notice_user_text_uuid;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) b.findChildViewById(view, i10);
                        if (appCompatTextView4 != null) {
                            return new AppconsentV3FragmentNoticeUserBinding((LinearLayoutCompat) view, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3FragmentNoticeUserBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3FragmentNoticeUserBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_fragment_notice_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
