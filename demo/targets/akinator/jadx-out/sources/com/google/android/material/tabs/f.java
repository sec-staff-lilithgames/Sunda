package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends ViewPager2.a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f29450a;

    /* renamed from: c, reason: collision with root package name */
    public int f29452c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f29451b = 0;

    public f(TabLayout tabLayout) {
        this.f29450a = new WeakReference(tabLayout);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageScrollStateChanged(int i10) {
        this.f29451b = this.f29452c;
        this.f29452c = i10;
        TabLayout tabLayout = (TabLayout) this.f29450a.get();
        if (tabLayout != null) {
            tabLayout.f29396a0 = this.f29452c;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageScrolled(int i10, float f10, int i11) {
        boolean z10;
        TabLayout tabLayout = (TabLayout) this.f29450a.get();
        if (tabLayout != null) {
            int i12 = this.f29452c;
            boolean z11 = true;
            if (i12 != 2 || this.f29451b == 1) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            if (i12 == 2 && this.f29451b == 0) {
                z10 = false;
            }
            tabLayout.j(i10, f10, z11, z10, false);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageSelected(int i10) {
        TabLayout tabLayout = (TabLayout) this.f29450a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
            return;
        }
        int i11 = this.f29452c;
        tabLayout.selectTab(tabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.f29451b == 0));
    }
}
