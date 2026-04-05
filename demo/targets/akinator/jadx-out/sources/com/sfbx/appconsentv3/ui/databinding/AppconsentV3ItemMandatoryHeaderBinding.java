package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemMandatoryHeaderBinding implements a {
    public final AppCompatTextView mandatoryHeaderText;
    private final LinearLayoutCompat rootView;

    private AppconsentV3ItemMandatoryHeaderBinding(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayoutCompat;
        this.mandatoryHeaderText = appCompatTextView;
    }

    public static AppconsentV3ItemMandatoryHeaderBinding bind(View view) {
        int i10 = R.id.mandatory_header_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
        if (appCompatTextView != null) {
            return new AppconsentV3ItemMandatoryHeaderBinding((LinearLayoutCompat) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemMandatoryHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemMandatoryHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_mandatory_header, viewGroup, false);
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
