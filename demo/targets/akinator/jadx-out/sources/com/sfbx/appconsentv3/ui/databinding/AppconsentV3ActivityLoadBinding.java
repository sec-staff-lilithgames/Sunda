package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.sfbx.appconsentv3.ui.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityLoadBinding implements a {
    public final RelativeLayout content;
    private final RelativeLayout rootView;

    private AppconsentV3ActivityLoadBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.content = relativeLayout2;
    }

    public static AppconsentV3ActivityLoadBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new AppconsentV3ActivityLoadBinding(relativeLayout, relativeLayout);
    }

    public static AppconsentV3ActivityLoadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityLoadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_load, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
