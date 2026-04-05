package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsentv3.ui.R;
import h6.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityStackBinding implements a {
    public final RecyclerView recyclerStack;
    private final RecyclerView rootView;

    private AppconsentV3ActivityStackBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.recyclerStack = recyclerView2;
    }

    public static AppconsentV3ActivityStackBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new AppconsentV3ActivityStackBinding(recyclerView, recyclerView);
    }

    public static AppconsentV3ActivityStackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityStackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_stack, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
