package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7115a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7116b;

    public final void a() {
        int[] iArr = this.f7115a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f7116b = null;
    }

    public void addFullSpanItem(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (this.f7116b == null) {
            this.f7116b = new ArrayList();
        }
        int size = this.f7116b.size();
        for (int i10 = 0; i10 < size; i10++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f7116b.get(i10);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7026b == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b) {
                this.f7116b.remove(i10);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7026b >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b) {
                this.f7116b.add(i10, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
        }
        this.f7116b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
    }

    public final void b(int i10) {
        int[] iArr = this.f7115a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i10, 10) + 1];
            this.f7115a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i10 >= iArr.length) {
            int length = iArr.length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f7115a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f7115a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i10) {
        ArrayList arrayList = this.f7116b;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f7116b.get(size)).f7026b >= i10) {
                    this.f7116b.remove(size);
                }
            }
        }
        d(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.f7115a
            r1 = -1
            if (r0 != 0) goto L6
            goto L9
        L6:
            int r0 = r0.length
            if (r5 < r0) goto La
        L9:
            return r1
        La:
            java.util.ArrayList r0 = r4.f7116b
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L46
        L10:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.getFullSpanItem(r5)
            if (r0 == 0) goto L1b
            java.util.ArrayList r2 = r4.f7116b
            r2.remove(r0)
        L1b:
            java.util.ArrayList r0 = r4.f7116b
            int r0 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r0) goto L34
            java.util.ArrayList r3 = r4.f7116b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.f7026b
            if (r3 < r5) goto L31
            goto L35
        L31:
            int r2 = r2 + 1
            goto L22
        L34:
            r2 = r1
        L35:
            if (r2 == r1) goto Le
            java.util.ArrayList r0 = r4.f7116b
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.util.ArrayList r3 = r4.f7116b
            r3.remove(r2)
            int r0 = r0.f7026b
        L46:
            if (r0 != r1) goto L52
            int[] r0 = r4.f7115a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.f7115a
            int r5 = r5.length
            return r5
        L52:
            int r0 = r0 + 1
            int[] r2 = r4.f7115a
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.f7115a
            java.util.Arrays.fill(r2, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e3.d(int):int");
    }

    public final void e(int i10, int i11) {
        int[] iArr = this.f7115a;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        b(i12);
        int[] iArr2 = this.f7115a;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill(this.f7115a, i10, i12, -1);
        ArrayList arrayList = this.f7116b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f7116b.get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b;
            if (i13 >= i10) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b = i13 + i11;
            }
        }
    }

    public final void f(int i10, int i11) {
        int[] iArr = this.f7115a;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        b(i12);
        int[] iArr2 = this.f7115a;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = this.f7115a;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        ArrayList arrayList = this.f7116b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f7116b.get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b;
            if (i13 >= i10) {
                if (i13 < i12) {
                    this.f7116b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b = i13 - i11;
                }
            }
        }
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFirstFullSpanItemInRange(int i10, int i11, int i12, boolean z10) {
        ArrayList arrayList = this.f7116b;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f7116b.get(i13);
            int i14 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b;
            if (i14 >= i11) {
                return null;
            }
            if (i14 >= i10 && (i12 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7027c == i12 || (z10 && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7029f))) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFullSpanItem(int i10) {
        ArrayList arrayList = this.f7116b;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f7116b.get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b == i10) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }
}
