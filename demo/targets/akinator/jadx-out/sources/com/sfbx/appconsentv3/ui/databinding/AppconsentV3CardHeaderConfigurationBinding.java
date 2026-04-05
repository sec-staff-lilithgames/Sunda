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
public final class AppconsentV3CardHeaderConfigurationBinding implements a {
    public final AppCompatImageView configCloseHeader;
    public final View configCustomHeaderSeparator;
    public final LinearLayoutCompat configHeader;
    public final AppCompatTextView configHeaderDescription;
    public final AppCompatTextView configHeaderTitle;
    private final LinearLayoutCompat rootView;

    private AppconsentV3CardHeaderConfigurationBinding(LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, View view, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.configCloseHeader = appCompatImageView;
        this.configCustomHeaderSeparator = view;
        this.configHeader = linearLayoutCompat2;
        this.configHeaderDescription = appCompatTextView;
        this.configHeaderTitle = appCompatTextView2;
    }

    public static AppconsentV3CardHeaderConfigurationBinding bind(View view) {
        View viewFindChildViewById;
        int i10 = R.id.config_close_header;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.findChildViewById(view, i10);
        if (appCompatImageView != null && (viewFindChildViewById = b.findChildViewById(view, (i10 = R.id.config_custom_header_separator))) != null) {
            i10 = R.id.config_header;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) b.findChildViewById(view, i10);
            if (linearLayoutCompat != null) {
                i10 = R.id.config_header_description;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView != null) {
                    i10 = R.id.config_header_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                    if (appCompatTextView2 != null) {
                        return new AppconsentV3CardHeaderConfigurationBinding((LinearLayoutCompat) view, appCompatImageView, viewFindChildViewById, linearLayoutCompat, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3CardHeaderConfigurationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3CardHeaderConfigurationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_card_header_configuration, viewGroup, false);
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
