package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ViewPager2 f29453a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29454b;

    public g(ViewPager2 viewPager2, boolean z10) {
        this.f29453a = viewPager2;
        this.f29454b = z10;
    }

    @Override // com.google.android.material.tabs.c, com.google.android.material.tabs.b
    public void onTabSelected(TabLayout.a aVar) {
        this.f29453a.setCurrentItem(aVar.getPosition(), this.f29454b);
    }

    @Override // com.google.android.material.tabs.c, com.google.android.material.tabs.b
    public void onTabReselected(TabLayout.a aVar) {
    }

    @Override // com.google.android.material.tabs.c, com.google.android.material.tabs.b
    public void onTabUnselected(TabLayout.a aVar) {
    }
}
