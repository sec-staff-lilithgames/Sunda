package com.sfbx.appconsentv3.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sfbx.appconsentv3.ui.R;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppconsentV3ActivityNoticeBinding implements a {
    public final ConstraintLayout intLayout;
    public final ProgressBar noticeLoader;
    public final RecyclerView recyclerConsentable;
    private final ConstraintLayout rootView;

    private AppconsentV3ActivityNoticeBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ProgressBar progressBar, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.intLayout = constraintLayout2;
        this.noticeLoader = progressBar;
        this.recyclerConsentable = recyclerView;
    }

    public static AppconsentV3ActivityNoticeBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.notice_loader;
        ProgressBar progressBar = (ProgressBar) b.findChildViewById(view, i10);
        if (progressBar != null) {
            i10 = R.id.recycler_consentable;
            RecyclerView recyclerView = (RecyclerView) b.findChildViewById(view, i10);
            if (recyclerView != null) {
                return new AppconsentV3ActivityNoticeBinding(constraintLayout, constraintLayout, progressBar, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AppconsentV3ActivityNoticeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AppconsentV3ActivityNoticeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appconsent_v3_activity_notice, viewGroup, false);
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
