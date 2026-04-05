package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3AcUnorderedListWidgetBinding implements a {
    public final LinearLayoutCompat acUnorderedListWidget;
    private final LinearLayoutCompat rootView;

    private AppconsentV3AcUnorderedListWidgetBinding(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.acUnorderedListWidget = linearLayoutCompat2;
    }

    public static AppconsentV3AcUnorderedListWidgetBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        return new AppconsentV3AcUnorderedListWidgetBinding(linearLayoutCompat, linearLayoutCompat);
    }

    public static AppconsentV3AcUnorderedListWidgetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3AcUnorderedListWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_ac_unordered_list_widget, viewGroup, false);
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
