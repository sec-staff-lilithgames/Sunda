package ch;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d implements androidx.viewpager.widget.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f12307b;

    public d(TabLayout tabLayout) {
        this.f12307b = tabLayout;
    }

    @Override // androidx.viewpager.widget.h
    public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        TabLayout tabLayout = this.f12307b;
        if (tabLayout.R == viewPager) {
            tabLayout.i(pagerAdapter2, this.f12306a);
        }
    }
}
