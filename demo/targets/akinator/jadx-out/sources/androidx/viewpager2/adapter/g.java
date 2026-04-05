package androidx.viewpager2.adapter;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends ViewPager2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f7370a;

    public g(j jVar) {
        this.f7370a = jVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageScrollStateChanged(int i10) {
        this.f7370a.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageSelected(int i10) {
        this.f7370a.b(false);
    }
}
