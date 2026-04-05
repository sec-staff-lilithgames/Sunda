package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends ViewPager2.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7404a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator it = this.f7404a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.a) it.next()).onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageScrolled(int i10, float f10, int i11) {
        try {
            Iterator it = this.f7404a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.a) it.next()).onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public void onPageSelected(int i10) {
        try {
            Iterator it = this.f7404a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.a) it.next()).onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}
