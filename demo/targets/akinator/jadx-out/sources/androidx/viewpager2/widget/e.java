package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends ViewPager2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f7419a;

    public e(ViewPager2 viewPager2) {
        this.f7419a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageSelected(int i10) {
        ViewPager2 viewPager2 = this.f7419a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f7390l.requestFocus(2);
        }
    }
}
