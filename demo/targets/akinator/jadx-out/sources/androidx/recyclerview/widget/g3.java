package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7123a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f7124b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f7125c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f7126d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f7127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7128f;

    public g3(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f7128f = staggeredGridLayoutManager;
        this.f7127e = i10;
    }

    public final void a(View view) {
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        aVar.f7040e = this;
        ArrayList arrayList = this.f7123a;
        arrayList.add(view);
        this.f7125c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7124b = Integer.MIN_VALUE;
        }
        if (aVar.isItemRemoved() || aVar.isItemChanged()) {
            this.f7126d = this.f7128f.f7004c.getDecoratedMeasurement(view) + this.f7126d;
        }
    }

    public final void b() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem fullSpanItem;
        View view = (View) j1.o2.e(1, this.f7123a);
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7128f;
        this.f7125c = staggeredGridLayoutManager.f7004c.getDecoratedEnd(view);
        if (aVar.f7041f && (fullSpanItem = staggeredGridLayoutManager.f7014m.getFullSpanItem(aVar.getViewLayoutPosition())) != null && fullSpanItem.f7027c == 1) {
            int i10 = this.f7125c;
            int[] iArr = fullSpanItem.f7028e;
            this.f7125c = i10 + (iArr == null ? 0 : iArr[this.f7127e]);
        }
    }

    public final void c() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem fullSpanItem;
        View view = (View) this.f7123a.get(0);
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7128f;
        this.f7124b = staggeredGridLayoutManager.f7004c.getDecoratedStart(view);
        if (aVar.f7041f && (fullSpanItem = staggeredGridLayoutManager.f7014m.getFullSpanItem(aVar.getViewLayoutPosition())) != null && fullSpanItem.f7027c == -1) {
            int i10 = this.f7124b;
            int[] iArr = fullSpanItem.f7028e;
            this.f7124b = i10 - (iArr != null ? iArr[this.f7127e] : 0);
        }
    }

    public final void d() {
        this.f7123a.clear();
        this.f7124b = Integer.MIN_VALUE;
        this.f7125c = Integer.MIN_VALUE;
        this.f7126d = 0;
    }

    public final int e(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7128f;
        int startAfterPadding = staggeredGridLayoutManager.f7004c.getStartAfterPadding();
        int endAfterPadding = staggeredGridLayoutManager.f7004c.getEndAfterPadding();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) this.f7123a.get(i10);
            int decoratedStart = staggeredGridLayoutManager.f7004c.getDecoratedStart(view);
            int decoratedEnd = staggeredGridLayoutManager.f7004c.getDecoratedEnd(view);
            boolean z13 = false;
            boolean z14 = !z12 ? decoratedStart >= endAfterPadding : decoratedStart > endAfterPadding;
            if (!z12 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                z13 = true;
            }
            if (z14 && z13) {
                if (z10 && z11) {
                    if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z11) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
            i10 += i12;
        }
        return -1;
    }

    public final int f(int i10) {
        int i11 = this.f7125c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f7123a.size() == 0) {
            return i10;
        }
        b();
        return this.f7125c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        return this.f7128f.f7009h ? e(r1.size() - 1, -1, true, true, false) : e(0, this.f7123a.size(), true, true, false);
    }

    public int findFirstPartiallyVisibleItemPosition() {
        return this.f7128f.f7009h ? e(r1.size() - 1, -1, false, false, true) : e(0, this.f7123a.size(), false, false, true);
    }

    public int findFirstVisibleItemPosition() {
        return this.f7128f.f7009h ? e(r1.size() - 1, -1, false, true, false) : e(0, this.f7123a.size(), false, true, false);
    }

    public int findLastCompletelyVisibleItemPosition() {
        return this.f7128f.f7009h ? e(0, this.f7123a.size(), true, true, false) : e(r1.size() - 1, -1, true, true, false);
    }

    public int findLastPartiallyVisibleItemPosition() {
        return this.f7128f.f7009h ? e(0, this.f7123a.size(), false, false, true) : e(r1.size() - 1, -1, false, false, true);
    }

    public int findLastVisibleItemPosition() {
        return this.f7128f.f7009h ? e(0, this.f7123a.size(), false, true, false) : e(r1.size() - 1, -1, false, true, false);
    }

    public final int g(int i10) {
        int i11 = this.f7124b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (this.f7123a.size() == 0) {
            return i10;
        }
        c();
        return this.f7124b;
    }

    public int getDeletedSize() {
        return this.f7126d;
    }

    public View getFocusableViewAfter(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f7128f;
        ArrayList arrayList = this.f7123a;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f7009h && staggeredGridLayoutManager.getPosition(view2) >= i10) || ((!staggeredGridLayoutManager.f7009h && staggeredGridLayoutManager.getPosition(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f7009h && staggeredGridLayoutManager.getPosition(view3) <= i10) || ((!staggeredGridLayoutManager.f7009h && staggeredGridLayoutManager.getPosition(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    public final void h() {
        ArrayList arrayList = this.f7123a;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        aVar.f7040e = null;
        if (aVar.isItemRemoved() || aVar.isItemChanged()) {
            this.f7126d -= this.f7128f.f7004c.getDecoratedMeasurement(view);
        }
        if (size == 1) {
            this.f7124b = Integer.MIN_VALUE;
        }
        this.f7125c = Integer.MIN_VALUE;
    }

    public final void i() {
        ArrayList arrayList = this.f7123a;
        View view = (View) arrayList.remove(0);
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        aVar.f7040e = null;
        if (arrayList.size() == 0) {
            this.f7125c = Integer.MIN_VALUE;
        }
        if (aVar.isItemRemoved() || aVar.isItemChanged()) {
            this.f7126d -= this.f7128f.f7004c.getDecoratedMeasurement(view);
        }
        this.f7124b = Integer.MIN_VALUE;
    }

    public final void j(View view) {
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        aVar.f7040e = this;
        ArrayList arrayList = this.f7123a;
        arrayList.add(0, view);
        this.f7124b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f7125c = Integer.MIN_VALUE;
        }
        if (aVar.isItemRemoved() || aVar.isItemChanged()) {
            this.f7126d = this.f7128f.f7004c.getDecoratedMeasurement(view) + this.f7126d;
        }
    }
}
