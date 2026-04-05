package androidx.viewpager.widget;

import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager f7351b;

    public c(ViewPager viewPager) {
        this.f7351b = viewPager;
    }

    @Override // java.lang.Runnable
    public void run() throws Resources.NotFoundException {
        ViewPager viewPager = this.f7351b;
        viewPager.setScrollState(0);
        viewPager.populate();
    }
}
