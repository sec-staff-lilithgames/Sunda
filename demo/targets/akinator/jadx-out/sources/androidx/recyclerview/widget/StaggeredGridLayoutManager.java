package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.f implements o2 {

    /* renamed from: b, reason: collision with root package name */
    public g3[] f7003b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f7004c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f7005d;

    /* renamed from: e, reason: collision with root package name */
    public int f7006e;

    /* renamed from: f, reason: collision with root package name */
    public int f7007f;

    /* renamed from: g, reason: collision with root package name */
    public final y0 f7008g;

    /* renamed from: j, reason: collision with root package name */
    public BitSet f7011j;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7016o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7017p;

    /* renamed from: q, reason: collision with root package name */
    public SavedState f7018q;

    /* renamed from: r, reason: collision with root package name */
    public int f7019r;

    /* renamed from: w, reason: collision with root package name */
    public int[] f7024w;

    /* renamed from: a, reason: collision with root package name */
    public int f7002a = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7009h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7010i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f7012k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f7013l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public final e3 f7014m = new e3();

    /* renamed from: n, reason: collision with root package name */
    public int f7015n = 2;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f7020s = new Rect();

    /* renamed from: t, reason: collision with root package name */
    public final c3 f7021t = new c3(this);

    /* renamed from: u, reason: collision with root package name */
    public boolean f7022u = false;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7023v = true;

    /* renamed from: x, reason: collision with root package name */
    public final b3 f7025x = new b3(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new f3();

        /* renamed from: b, reason: collision with root package name */
        public int f7030b;

        /* renamed from: c, reason: collision with root package name */
        public int f7031c;

        /* renamed from: e, reason: collision with root package name */
        public int f7032e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f7033f;

        /* renamed from: g, reason: collision with root package name */
        public int f7034g;

        /* renamed from: h, reason: collision with root package name */
        public int[] f7035h;

        /* renamed from: i, reason: collision with root package name */
        public ArrayList f7036i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f7037j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f7038k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f7039l;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f7030b);
            parcel.writeInt(this.f7031c);
            parcel.writeInt(this.f7032e);
            if (this.f7032e > 0) {
                parcel.writeIntArray(this.f7033f);
            }
            parcel.writeInt(this.f7034g);
            if (this.f7034g > 0) {
                parcel.writeIntArray(this.f7035h);
            }
            parcel.writeInt(this.f7037j ? 1 : 0);
            parcel.writeInt(this.f7038k ? 1 : 0);
            parcel.writeInt(this.f7039l ? 1 : 0);
            parcel.writeList(this.f7036i);
        }

        public SavedState(SavedState savedState) {
            this.f7032e = savedState.f7032e;
            this.f7030b = savedState.f7030b;
            this.f7031c = savedState.f7031c;
            this.f7033f = savedState.f7033f;
            this.f7034g = savedState.f7034g;
            this.f7035h = savedState.f7035h;
            this.f7037j = savedState.f7037j;
            this.f7038k = savedState.f7038k;
            this.f7039l = savedState.f7039l;
            this.f7036i = savedState.f7036i;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends RecyclerView.g {

        /* renamed from: e, reason: collision with root package name */
        public g3 f7040e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7041f;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            g3 g3Var = this.f7040e;
            if (g3Var == null) {
                return -1;
            }
            return g3Var.f7127e;
        }

        public boolean isFullSpan() {
            return this.f7041f;
        }

        public void setFullSpan(boolean z10) {
            this.f7041f = z10;
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(RecyclerView.g gVar) {
            super(gVar);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.f.a properties = RecyclerView.f.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f6957a);
        setSpanCount(properties.f6958b);
        setReverseLayout(properties.f6959c);
        this.f7008g = new y0();
        this.f7004c = o1.createOrientationHelper(this, this.f7006e);
        this.f7005d = o1.createOrientationHelper(this, 1 - this.f7006e);
    }

    public static int C(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public final void A(int i10, RecyclerView.l lVar) {
        int totalSpace;
        int totalSpace2;
        int targetScrollPosition;
        y0 y0Var = this.f7008g;
        boolean z10 = false;
        y0Var.f7313b = 0;
        y0Var.f7314c = i10;
        if (!isSmoothScrolling() || (targetScrollPosition = lVar.getTargetScrollPosition()) == -1) {
            totalSpace = 0;
            totalSpace2 = 0;
        } else {
            if (this.f7010i == (targetScrollPosition < i10)) {
                totalSpace = this.f7004c.getTotalSpace();
                totalSpace2 = 0;
            } else {
                totalSpace2 = this.f7004c.getTotalSpace();
                totalSpace = 0;
            }
        }
        if (getClipToPadding()) {
            y0Var.f7317f = this.f7004c.getStartAfterPadding() - totalSpace2;
            y0Var.f7318g = this.f7004c.getEndAfterPadding() + totalSpace;
        } else {
            y0Var.f7318g = this.f7004c.getEnd() + totalSpace;
            y0Var.f7317f = -totalSpace2;
        }
        y0Var.f7319h = false;
        y0Var.f7312a = true;
        if (this.f7004c.getMode() == 0 && this.f7004c.getEnd() == 0) {
            z10 = true;
        }
        y0Var.f7320i = z10;
    }

    public final void B(g3 g3Var, int i10, int i11) {
        int deletedSize = g3Var.getDeletedSize();
        int i12 = g3Var.f7127e;
        if (i10 == -1) {
            int i13 = g3Var.f7124b;
            if (i13 == Integer.MIN_VALUE) {
                g3Var.c();
                i13 = g3Var.f7124b;
            }
            if (i13 + deletedSize <= i11) {
                this.f7011j.set(i12, false);
                return;
            }
            return;
        }
        int i14 = g3Var.f7125c;
        if (i14 == Integer.MIN_VALUE) {
            g3Var.b();
            i14 = g3Var.f7125c;
        }
        if (i14 - deletedSize >= i11) {
            this.f7011j.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f7018q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollHorizontally() {
        return this.f7006e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollVertically() {
        return this.f7006e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean checkLayoutParams(RecyclerView.g gVar) {
        return gVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.l lVar, h2 h2Var) {
        y0 y0Var;
        int iF;
        int iG;
        if (this.f7006e != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        t(i10, lVar);
        int[] iArr = this.f7024w;
        if (iArr == null || iArr.length < this.f7002a) {
            this.f7024w = new int[this.f7002a];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f7002a;
            y0Var = this.f7008g;
            if (i12 >= i14) {
                break;
            }
            if (y0Var.f7315d == -1) {
                iF = y0Var.f7317f;
                iG = this.f7003b[i12].g(iF);
            } else {
                iF = this.f7003b[i12].f(y0Var.f7318g);
                iG = y0Var.f7318g;
            }
            int i15 = iF - iG;
            if (i15 >= 0) {
                this.f7024w[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f7024w, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = y0Var.f7314c;
            if (i17 < 0 || i17 >= lVar.getItemCount()) {
                return;
            }
            ((u0) h2Var).addPosition(y0Var.f7314c, this.f7024w[i16]);
            y0Var.f7314c += y0Var.f7315d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollExtent(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        o1 o1Var = this.f7004c;
        boolean z10 = !this.f7023v;
        return s2.a(lVar, o1Var, h(z10), g(z10), this, this.f7023v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollOffset(RecyclerView.l lVar) {
        return e(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollRange(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        o1 o1Var = this.f7004c;
        boolean z10 = !this.f7023v;
        return s2.c(lVar, o1Var, h(z10), g(z10), this, this.f7023v);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.PointF computeScrollVectorForPosition(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f7010i
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.k()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f7010i
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f7006e
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.computeScrollVectorForPosition(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollExtent(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        o1 o1Var = this.f7004c;
        boolean z10 = !this.f7023v;
        return s2.a(lVar, o1Var, h(z10), g(z10), this, this.f7023v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollOffset(RecyclerView.l lVar) {
        return e(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollRange(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        o1 o1Var = this.f7004c;
        boolean z10 = !this.f7023v;
        return s2.c(lVar, o1Var, h(z10), g(z10), this, this.f7023v);
    }

    public final boolean d() {
        int iK;
        int iL;
        if (getChildCount() != 0 && this.f7015n != 0 && isAttachedToWindow()) {
            if (this.f7010i) {
                iK = l();
                iL = k();
            } else {
                iK = k();
                iL = l();
            }
            e3 e3Var = this.f7014m;
            if (iK == 0 && p() != null) {
                e3Var.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.f7022u) {
                int i10 = this.f7010i ? -1 : 1;
                int i11 = iL + 1;
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem firstFullSpanItemInRange = e3Var.getFirstFullSpanItemInRange(iK, i11, i10, true);
                if (firstFullSpanItemInRange == null) {
                    this.f7022u = false;
                    e3Var.c(i11);
                    return false;
                }
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem firstFullSpanItemInRange2 = e3Var.getFirstFullSpanItemInRange(iK, firstFullSpanItemInRange.f7026b, i10 * (-1), true);
                if (firstFullSpanItemInRange2 == null) {
                    e3Var.c(firstFullSpanItemInRange.f7026b);
                } else {
                    e3Var.c(firstFullSpanItemInRange2.f7026b + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        o1 o1Var = this.f7004c;
        boolean z10 = !this.f7023v;
        return s2.b(lVar, o1Var, h(z10), g(z10), this, this.f7023v, this.f7010i);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(androidx.recyclerview.widget.RecyclerView.j r23, androidx.recyclerview.widget.y0 r24, androidx.recyclerview.widget.RecyclerView.l r25) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.f(androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.y0, androidx.recyclerview.widget.RecyclerView$l):int");
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f7002a];
        } else if (iArr.length < this.f7002a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f7002a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f7002a; i10++) {
            iArr[i10] = this.f7003b[i10].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f7002a];
        } else if (iArr.length < this.f7002a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f7002a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f7002a; i10++) {
            iArr[i10] = this.f7003b[i10].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f7002a];
        } else if (iArr.length < this.f7002a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f7002a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f7002a; i10++) {
            iArr[i10] = this.f7003b[i10].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f7002a];
        } else if (iArr.length < this.f7002a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f7002a + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f7002a; i10++) {
            iArr[i10] = this.f7003b[i10].findLastVisibleItemPosition();
        }
        return iArr;
    }

    public final View g(boolean z10) {
        int startAfterPadding = this.f7004c.getStartAfterPadding();
        int endAfterPadding = this.f7004c.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.f7004c.getDecoratedStart(childAt);
            int decoratedEnd = this.f7004c.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateDefaultLayoutParams() {
        return this.f7006e == 0 ? new a(-2, -1) : new a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getColumnCountForAccessibility(RecyclerView.j jVar, RecyclerView.l lVar) {
        if (this.f7006e == 1) {
            return Math.min(this.f7002a, lVar.getItemCount());
        }
        return -1;
    }

    public int getGapStrategy() {
        return this.f7015n;
    }

    public int getOrientation() {
        return this.f7006e;
    }

    public boolean getReverseLayout() {
        return this.f7009h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getRowCountForAccessibility(RecyclerView.j jVar, RecyclerView.l lVar) {
        if (this.f7006e == 0) {
            return Math.min(this.f7002a, lVar.getItemCount());
        }
        return -1;
    }

    public int getSpanCount() {
        return this.f7002a;
    }

    public final View h(boolean z10) {
        int startAfterPadding = this.f7004c.getStartAfterPadding();
        int endAfterPadding = this.f7004c.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int decoratedStart = this.f7004c.getDecoratedStart(childAt);
            if (this.f7004c.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z10) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(RecyclerView.j jVar, RecyclerView.l lVar, boolean z10) {
        int endAfterPadding;
        int iM = m(Integer.MIN_VALUE);
        if (iM != Integer.MIN_VALUE && (endAfterPadding = this.f7004c.getEndAfterPadding() - iM) > 0) {
            int i10 = endAfterPadding - (-scrollBy(-endAfterPadding, jVar, lVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f7004c.offsetChildren(i10);
        }
    }

    public void invalidateSpanAssignments() {
        this.f7014m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean isAutoMeasureEnabled() {
        return this.f7015n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean isLayoutReversed() {
        return this.f7009h;
    }

    public final void j(RecyclerView.j jVar, RecyclerView.l lVar, boolean z10) {
        int startAfterPadding;
        int iN = n(Integer.MAX_VALUE);
        if (iN != Integer.MAX_VALUE && (startAfterPadding = iN - this.f7004c.getStartAfterPadding()) > 0) {
            int iScrollBy = startAfterPadding - scrollBy(startAfterPadding, jVar, lVar);
            if (!z10 || iScrollBy <= 0) {
                return;
            }
            this.f7004c.offsetChildren(-iScrollBy);
        }
    }

    public final int k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int m(int i10) {
        int iF = this.f7003b[0].f(i10);
        for (int i11 = 1; i11 < this.f7002a; i11++) {
            int iF2 = this.f7003b[i11].f(i10);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int n(int i10) {
        int iG = this.f7003b[0].g(i10);
        for (int i11 = 1; i11 < this.f7002a; i11++) {
            int iG2 = this.f7003b[i11].g(i10);
            if (iG2 < iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f7010i
            if (r0 == 0) goto L9
            int r0 = r7.l()
            goto Ld
        L9:
            int r0 = r7.k()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.e3 r4 = r7.f7014m
            r4.d(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.f(r8, r5)
            r4.e(r9, r5)
            goto L3a
        L33:
            r4.f(r8, r9)
            goto L3a
        L37:
            r4.e(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            goto L4f
        L3d:
            boolean r8 = r7.f7010i
            if (r8 == 0) goto L46
            int r8 = r7.k()
            goto L4a
        L46:
            int r8 = r7.l()
        L4a:
            if (r3 > r8) goto L4f
            r7.requestLayout()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f7002a; i11++) {
            g3 g3Var = this.f7003b[i11];
            int i12 = g3Var.f7124b;
            if (i12 != Integer.MIN_VALUE) {
                g3Var.f7124b = i12 + i10;
            }
            int i13 = g3Var.f7125c;
            if (i13 != Integer.MIN_VALUE) {
                g3Var.f7125c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f7002a; i11++) {
            g3 g3Var = this.f7003b[i11];
            int i12 = g3Var.f7124b;
            if (i12 != Integer.MIN_VALUE) {
                g3Var.f7124b = i12 + i10;
            }
            int i13 = g3Var.f7125c;
            if (i13 != Integer.MIN_VALUE) {
                g3Var.f7125c = i13 + i10;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onAdapterChanged(RecyclerView.a aVar, RecyclerView.a aVar2) {
        this.f7014m.a();
        for (int i10 = 0; i10 < this.f7002a; i10++) {
            this.f7003b[i10].d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.j jVar) {
        super.onDetachedFromWindow(recyclerView, jVar);
        removeCallbacks(this.f7025x);
        for (int i10 = 0; i10 < this.f7002a; i10++) {
            this.f7003b[i10].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.j r12, androidx.recyclerview.widget.RecyclerView.l r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewH = h(false);
            View viewG = g(false);
            if (viewH == null || viewG == null) {
                return;
            }
            int position = getPosition(viewH);
            int position2 = getPosition(viewG);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfo(RecyclerView.j jVar, RecyclerView.l lVar, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(jVar, lVar, cVar);
        cVar.setClassName("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.j jVar, RecyclerView.l lVar, View view, y3.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        a aVar = (a) layoutParams;
        if (this.f7006e == 0) {
            cVar.setCollectionItemInfo(y3.k.obtain(aVar.getSpanIndex(), aVar.f7041f ? this.f7002a : 1, -1, -1, false, false));
        } else {
            cVar.setCollectionItemInfo(y3.k.obtain(-1, -1, aVar.getSpanIndex(), aVar.f7041f ? this.f7002a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        o(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f7014m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        o(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        o(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        o(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutChildren(RecyclerView.j jVar, RecyclerView.l lVar) {
        r(jVar, lVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutCompleted(RecyclerView.l lVar) {
        super.onLayoutCompleted(lVar);
        this.f7012k = -1;
        this.f7013l = Integer.MIN_VALUE;
        this.f7018q = null;
        this.f7021t.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7018q = savedState;
            if (this.f7012k != -1) {
                savedState.f7030b = -1;
                savedState.f7031c = -1;
                savedState.f7033f = null;
                savedState.f7032e = 0;
                savedState.f7034g = 0;
                savedState.f7035h = null;
                savedState.f7036i = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public Parcelable onSaveInstanceState() {
        int iG;
        int startAfterPadding;
        int[] iArr;
        SavedState savedState = this.f7018q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f7037j = this.f7009h;
        savedState2.f7038k = this.f7016o;
        savedState2.f7039l = this.f7017p;
        e3 e3Var = this.f7014m;
        if (e3Var == null || (iArr = e3Var.f7115a) == null) {
            savedState2.f7034g = 0;
        } else {
            savedState2.f7035h = iArr;
            savedState2.f7034g = iArr.length;
            savedState2.f7036i = e3Var.f7116b;
        }
        if (getChildCount() <= 0) {
            savedState2.f7030b = -1;
            savedState2.f7031c = -1;
            savedState2.f7032e = 0;
            return savedState2;
        }
        savedState2.f7030b = this.f7016o ? l() : k();
        View viewG = this.f7010i ? g(true) : h(true);
        savedState2.f7031c = viewG != null ? getPosition(viewG) : -1;
        int i10 = this.f7002a;
        savedState2.f7032e = i10;
        savedState2.f7033f = new int[i10];
        for (int i11 = 0; i11 < this.f7002a; i11++) {
            if (this.f7016o) {
                iG = this.f7003b[i11].f(Integer.MIN_VALUE);
                if (iG != Integer.MIN_VALUE) {
                    startAfterPadding = this.f7004c.getEndAfterPadding();
                    iG -= startAfterPadding;
                }
            } else {
                iG = this.f7003b[i11].g(Integer.MIN_VALUE);
                if (iG != Integer.MIN_VALUE) {
                    startAfterPadding = this.f7004c.getStartAfterPadding();
                    iG -= startAfterPadding;
                }
            }
            savedState2.f7033f[i11] = iG;
        }
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View p() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p():android.view.View");
    }

    public final void q(View view, int i10, int i11) {
        Rect rect = this.f7020s;
        calculateItemDecorationsForChild(view, rect);
        a aVar = (a) view.getLayoutParams();
        int iC = C(i10, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) aVar).rightMargin + rect.right);
        int iC2 = C(i11, ((ViewGroup.MarginLayoutParams) aVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iC, iC2, aVar)) {
            view.measure(iC, iC2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0420  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.recyclerview.widget.RecyclerView.j r17, androidx.recyclerview.widget.RecyclerView.l r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l, boolean):void");
    }

    public final boolean s(int i10) {
        if (this.f7006e == 0) {
            return (i10 == -1) != this.f7010i;
        }
        return ((i10 == -1) == this.f7010i) == isLayoutRTL();
    }

    public final int scrollBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        t(i10, lVar);
        y0 y0Var = this.f7008g;
        int iF = f(jVar, y0Var, lVar);
        if (y0Var.f7313b >= iF) {
            i10 = i10 < 0 ? -iF : iF;
        }
        this.f7004c.offsetChildren(-i10);
        this.f7016o = this.f7010i;
        y0Var.f7313b = 0;
        u(jVar, y0Var);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollHorizontallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        return scrollBy(i10, jVar, lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void scrollToPosition(int i10) {
        SavedState savedState = this.f7018q;
        if (savedState != null && savedState.f7030b != i10) {
            savedState.f7033f = null;
            savedState.f7032e = 0;
            savedState.f7030b = -1;
            savedState.f7031c = -1;
        }
        this.f7012k = i10;
        this.f7013l = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        SavedState savedState = this.f7018q;
        if (savedState != null) {
            savedState.f7033f = null;
            savedState.f7032e = 0;
            savedState.f7030b = -1;
            savedState.f7031c = -1;
        }
        this.f7012k = i10;
        this.f7013l = i11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollVerticallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        return scrollBy(i10, jVar, lVar);
    }

    public void setGapStrategy(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f7015n) {
            return;
        }
        if (i10 != 0 && i10 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f7015n = i10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f7006e == 1) {
            iChooseSize2 = RecyclerView.f.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = RecyclerView.f.chooseSize(i10, (this.f7007f * this.f7002a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.f.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = RecyclerView.f.chooseSize(i11, (this.f7007f * this.f7002a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f7006e) {
            return;
        }
        this.f7006e = i10;
        o1 o1Var = this.f7004c;
        this.f7004c = this.f7005d;
        this.f7005d = o1Var;
        requestLayout();
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f7018q;
        if (savedState != null && savedState.f7037j != z10) {
            savedState.f7037j = z10;
        }
        this.f7009h = z10;
        requestLayout();
    }

    public void setSpanCount(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f7002a) {
            invalidateSpanAssignments();
            this.f7002a = i10;
            this.f7011j = new BitSet(this.f7002a);
            this.f7003b = new g3[this.f7002a];
            for (int i11 = 0; i11 < this.f7002a; i11++) {
                this.f7003b[i11] = new g3(this, i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.l lVar, int i10) {
        d1 d1Var = new d1(recyclerView.getContext());
        d1Var.setTargetPosition(i10);
        startSmoothScroll(d1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean supportsPredictiveItemAnimations() {
        return this.f7018q == null;
    }

    public final void t(int i10, RecyclerView.l lVar) {
        int iK;
        int i11;
        if (i10 > 0) {
            iK = l();
            i11 = 1;
        } else {
            iK = k();
            i11 = -1;
        }
        y0 y0Var = this.f7008g;
        y0Var.f7312a = true;
        A(iK, lVar);
        y(i11);
        y0Var.f7314c = iK + y0Var.f7315d;
        y0Var.f7313b = Math.abs(i10);
    }

    public final void u(RecyclerView.j jVar, y0 y0Var) {
        if (!y0Var.f7312a || y0Var.f7320i) {
            return;
        }
        if (y0Var.f7313b == 0) {
            if (y0Var.f7316e == -1) {
                v(y0Var.f7318g, jVar);
                return;
            } else {
                w(y0Var.f7317f, jVar);
                return;
            }
        }
        int i10 = 1;
        if (y0Var.f7316e == -1) {
            int i11 = y0Var.f7317f;
            int iG = this.f7003b[0].g(i11);
            while (i10 < this.f7002a) {
                int iG2 = this.f7003b[i10].g(i11);
                if (iG2 > iG) {
                    iG = iG2;
                }
                i10++;
            }
            int i12 = i11 - iG;
            v(i12 < 0 ? y0Var.f7318g : y0Var.f7318g - Math.min(i12, y0Var.f7313b), jVar);
            return;
        }
        int i13 = y0Var.f7318g;
        int iF = this.f7003b[0].f(i13);
        while (i10 < this.f7002a) {
            int iF2 = this.f7003b[i10].f(i13);
            if (iF2 < iF) {
                iF = iF2;
            }
            i10++;
        }
        int i14 = iF - y0Var.f7318g;
        w(i14 < 0 ? y0Var.f7317f : Math.min(i14, y0Var.f7313b) + y0Var.f7317f, jVar);
    }

    public final void v(int i10, RecyclerView.j jVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f7004c.getDecoratedStart(childAt) < i10 || this.f7004c.getTransformedStartWithDecoration(childAt) < i10) {
                return;
            }
            a aVar = (a) childAt.getLayoutParams();
            if (aVar.f7041f) {
                for (int i11 = 0; i11 < this.f7002a; i11++) {
                    if (this.f7003b[i11].f7123a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f7002a; i12++) {
                    this.f7003b[i12].h();
                }
            } else if (aVar.f7040e.f7123a.size() == 1) {
                return;
            } else {
                aVar.f7040e.h();
            }
            removeAndRecycleView(childAt, jVar);
        }
    }

    public final void w(int i10, RecyclerView.j jVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f7004c.getDecoratedEnd(childAt) > i10 || this.f7004c.getTransformedEndWithDecoration(childAt) > i10) {
                return;
            }
            a aVar = (a) childAt.getLayoutParams();
            if (aVar.f7041f) {
                for (int i11 = 0; i11 < this.f7002a; i11++) {
                    if (this.f7003b[i11].f7123a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f7002a; i12++) {
                    this.f7003b[i12].i();
                }
            } else if (aVar.f7040e.f7123a.size() == 1) {
                return;
            } else {
                aVar.f7040e.i();
            }
            removeAndRecycleView(childAt, jVar);
        }
    }

    public final void x() {
        if (this.f7006e == 1 || !isLayoutRTL()) {
            this.f7010i = this.f7009h;
        } else {
            this.f7010i = !this.f7009h;
        }
    }

    public final void y(int i10) {
        y0 y0Var = this.f7008g;
        y0Var.f7316e = i10;
        y0Var.f7315d = this.f7010i != (i10 == -1) ? -1 : 1;
    }

    public final void z(int i10, int i11) {
        for (int i12 = 0; i12 < this.f7002a; i12++) {
            if (!this.f7003b[i12].f7123a.isEmpty()) {
                B(this.f7003b[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f7006e = i11;
        setSpanCount(i10);
        this.f7008g = new y0();
        this.f7004c = o1.createOrientationHelper(this, this.f7006e);
        this.f7005d = o1.createOrientationHelper(this, 1 - this.f7006e);
    }
}
