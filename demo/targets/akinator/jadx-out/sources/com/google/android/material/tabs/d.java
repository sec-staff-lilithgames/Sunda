package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f29448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabLayout.c f29449c;

    public d(TabLayout.c cVar, View view) {
        this.f29449c = cVar;
        this.f29448b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f29448b;
        if (view2.getVisibility() == 0) {
            int i18 = TabLayout.c.f29435n;
            this.f29449c.e(view2);
        }
    }
}
