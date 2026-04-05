package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ao.n;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f29455a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f29456b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29457c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29458d;

    /* renamed from: e, reason: collision with root package name */
    public final e f29459e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView.a f29460f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29461g;

    /* renamed from: h, reason: collision with root package name */
    public f f29462h;

    /* renamed from: i, reason: collision with root package name */
    public g f29463i;

    /* renamed from: j, reason: collision with root package name */
    public ch.h f29464j;

    public h(TabLayout tabLayout, ViewPager2 viewPager2, e eVar) {
        this(tabLayout, viewPager2, true, eVar);
    }

    public final void a() {
        TabLayout tabLayout = this.f29455a;
        tabLayout.removeAllTabs();
        RecyclerView.a aVar = this.f29460f;
        if (aVar != null) {
            int itemCount = aVar.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.a aVarNewTab = tabLayout.newTab();
                ((n) this.f29459e).onConfigureTab(aVarNewTab, i10);
                tabLayout.addTab(aVarNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f29456b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    public void attach() {
        if (this.f29461g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.f29456b;
        RecyclerView.a adapter = viewPager2.getAdapter();
        this.f29460f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f29461g = true;
        TabLayout tabLayout = this.f29455a;
        f fVar = new f(tabLayout);
        this.f29462h = fVar;
        viewPager2.registerOnPageChangeCallback(fVar);
        g gVar = new g(viewPager2, this.f29458d);
        this.f29463i = gVar;
        tabLayout.addOnTabSelectedListener((c) gVar);
        if (this.f29457c) {
            ch.h hVar = new ch.h(this);
            this.f29464j = hVar;
            this.f29460f.registerAdapterDataObserver(hVar);
        }
        a();
        tabLayout.setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        RecyclerView.a aVar;
        if (this.f29461g) {
            if (this.f29457c && (aVar = this.f29460f) != null) {
                aVar.unregisterAdapterDataObserver(this.f29464j);
                this.f29464j = null;
            }
            this.f29455a.removeOnTabSelectedListener((c) this.f29463i);
            this.f29456b.unregisterOnPageChangeCallback(this.f29462h);
            this.f29463i = null;
            this.f29462h = null;
            this.f29460f = null;
            this.f29461g = false;
        }
    }

    public boolean isAttached() {
        return this.f29461g;
    }

    public h(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, e eVar) {
        this(tabLayout, viewPager2, z10, true, eVar);
    }

    public h(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, e eVar) {
        this.f29455a = tabLayout;
        this.f29456b = viewPager2;
        this.f29457c = z10;
        this.f29458d = z11;
        this.f29459e = eVar;
    }
}
