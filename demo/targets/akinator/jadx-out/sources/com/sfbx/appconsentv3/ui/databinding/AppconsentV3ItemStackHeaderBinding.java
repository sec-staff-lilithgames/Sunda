package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sfbx.appconsentv3.ui.R;
import com.sfbx.appconsentv3.ui.view.SwitchView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ItemStackHeaderBinding implements a {
    private final LinearLayoutCompat rootView;
    public final SwitchView switchStackHeader;
    public final AppCompatTextView textHeaderDescription;
    public final AppCompatTextView textVendorGlobal;

    private AppconsentV3ItemStackHeaderBinding(LinearLayoutCompat linearLayoutCompat, SwitchView switchView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.switchStackHeader = switchView;
        this.textHeaderDescription = appCompatTextView;
        this.textVendorGlobal = appCompatTextView2;
    }

    public static AppconsentV3ItemStackHeaderBinding bind(View view) {
        int i10 = R.id.switch_stack_header;
        SwitchView switchView = (SwitchView) b.findChildViewById(view, i10);
        if (switchView != null) {
            i10 = R.id.text_header_description;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.text_vendor_global;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) b.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    return new AppconsentV3ItemStackHeaderBinding((LinearLayoutCompat) view, switchView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ItemStackHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ItemStackHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_item_stack_header, viewGroup, false);
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
