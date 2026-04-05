package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: m, reason: collision with root package name */
    public static final Set f6926m = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: a, reason: collision with root package name */
    public boolean f6927a;

    /* renamed from: b, reason: collision with root package name */
    public int f6928b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f6929c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f6930d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f6931e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f6932f;

    /* renamed from: g, reason: collision with root package name */
    public c f6933g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f6934h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6935i;

    /* renamed from: j, reason: collision with root package name */
    public int f6936j;

    /* renamed from: k, reason: collision with root package name */
    public int f6937k;

    /* renamed from: l, reason: collision with root package name */
    public int f6938l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanIndex(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i10) {
            return 1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f6941a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f6942b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f6943c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6944d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public final int b(int i10, int i11) {
            if (!this.f6944d) {
                return getSpanGroupIndex(i10, i11);
            }
            SparseIntArray sparseIntArray = this.f6942b;
            int i12 = sparseIntArray.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanGroupIndex = getSpanGroupIndex(i10, i11);
            sparseIntArray.put(i10, spanGroupIndex);
            return spanGroupIndex;
        }

        public final int c(int i10, int i11) {
            if (!this.f6943c) {
                return getSpanIndex(i10, i11);
            }
            SparseIntArray sparseIntArray = this.f6941a;
            int i12 = sparseIntArray.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanIndex = getSpanIndex(i10, i11);
            sparseIntArray.put(i10, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i10, int i11) {
            int i12;
            int spanSize;
            int i13;
            SparseIntArray sparseIntArray;
            int iA;
            if (!this.f6944d || (iA = a((sparseIntArray = this.f6942b), i10)) == -1) {
                i12 = 0;
                spanSize = 0;
                i13 = 0;
            } else {
                i12 = sparseIntArray.get(iA);
                i13 = iA + 1;
                spanSize = getSpanSize(iA) + c(iA, i11);
                if (spanSize == i11) {
                    i12++;
                    spanSize = 0;
                }
            }
            int spanSize2 = getSpanSize(i10);
            while (i13 < i10) {
                int spanSize3 = getSpanSize(i13);
                spanSize += spanSize3;
                if (spanSize == i11) {
                    i12++;
                    spanSize = 0;
                } else if (spanSize > i11) {
                    i12++;
                    spanSize = spanSize3;
                }
                i13++;
            }
            return spanSize + spanSize2 > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:17:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002b -> B:17:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:17:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f6943c
                if (r2 == 0) goto L1e
                android.util.SparseIntArray r2 = r5.f6941a
                int r3 = a(r2, r6)
                if (r3 < 0) goto L1e
                int r2 = r2.get(r3)
                int r4 = r5.getSpanSize(r3)
                int r4 = r4 + r2
                goto L2e
            L1e:
                r3 = r1
                r4 = r3
            L20:
                if (r3 >= r6) goto L31
                int r2 = r5.getSpanSize(r3)
                int r4 = r4 + r2
                if (r4 != r7) goto L2b
                r4 = r1
                goto L2e
            L2b:
                if (r4 <= r7) goto L2e
                r4 = r2
            L2e:
                int r3 = r3 + 1
                goto L20
            L31:
                int r0 = r0 + r4
                if (r0 > r7) goto L35
                return r4
            L35:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i10);

        public void invalidateSpanGroupIndexCache() {
            this.f6942b.clear();
        }

        public void invalidateSpanIndexCache() {
            this.f6941a.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.f6944d;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.f6943c;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.f6942b.clear();
            }
            this.f6944d = z10;
        }

        public void setSpanIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.f6942b.clear();
            }
            this.f6943c = z10;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6927a = false;
        this.f6928b = -1;
        this.f6931e = new SparseIntArray();
        this.f6932f = new SparseIntArray();
        this.f6933g = new a();
        this.f6934h = new Rect();
        this.f6936j = -1;
        this.f6937k = -1;
        this.f6938l = -1;
        setSpanCount(RecyclerView.f.getProperties(context, attributeSet, i10, i11).f6958b);
    }

    public final int A(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (!lVar.isPreLayout()) {
            return this.f6933g.b(i10, this.f6928b);
        }
        int iConvertPreLayoutPositionToPostLayout = jVar.convertPreLayoutPositionToPostLayout(i10);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.f6933g.b(iConvertPreLayoutPositionToPostLayout, this.f6928b);
        }
        j1.o2.u(i10, "Cannot find span size for pre layout position. ", "GridLayoutManager");
        return 0;
    }

    public final int B(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (!lVar.isPreLayout()) {
            return this.f6933g.c(i10, this.f6928b);
        }
        int i11 = this.f6932f.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iConvertPreLayoutPositionToPostLayout = jVar.convertPreLayoutPositionToPostLayout(i10);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.f6933g.c(iConvertPreLayoutPositionToPostLayout, this.f6928b);
        }
        j1.o2.u(i10, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
        return 0;
    }

    public final int C(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (!lVar.isPreLayout()) {
            return this.f6933g.getSpanSize(i10);
        }
        int i11 = this.f6931e.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iConvertPreLayoutPositionToPostLayout = jVar.convertPreLayoutPositionToPostLayout(i10);
        if (iConvertPreLayoutPositionToPostLayout != -1) {
            return this.f6933g.getSpanSize(iConvertPreLayoutPositionToPostLayout);
        }
        j1.o2.u(i10, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
        return 1;
    }

    public final void D(View view, int i10, boolean z10) {
        int childMeasureSpec;
        int childMeasureSpec2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f6962b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iZ = z(bVar.f6939e, bVar.f6940f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.f.getChildMeasureSpec(iZ, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            childMeasureSpec = RecyclerView.f.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.f.getChildMeasureSpec(iZ, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec4 = RecyclerView.f.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        if (z10 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, gVar) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, gVar)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void E() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean checkLayoutParams(RecyclerView.g gVar) {
        return gVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.l lVar, b1 b1Var, h2 h2Var) {
        int i10;
        int spanSize = this.f6928b;
        for (int i11 = 0; i11 < this.f6928b && (i10 = b1Var.f7061d) >= 0 && i10 < lVar.getItemCount() && spanSize > 0; i11++) {
            int i12 = b1Var.f7061d;
            ((u0) h2Var).addPosition(i12, Math.max(0, b1Var.f7064g));
            spanSize -= this.f6933g.getSpanSize(i12);
            b1Var.f7061d += b1Var.f7062e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollOffset(RecyclerView.l lVar) {
        return this.f6935i ? s(lVar) : super.computeHorizontalScrollOffset(lVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollRange(RecyclerView.l lVar) {
        return this.f6935i ? t(lVar) : super.computeHorizontalScrollRange(lVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollOffset(RecyclerView.l lVar) {
        return this.f6935i ? s(lVar) : super.computeVerticalScrollOffset(lVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollRange(RecyclerView.l lVar) {
        return this.f6935i ? t(lVar) : super.computeVerticalScrollRange(lVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.j jVar, RecyclerView.l lVar, boolean z10, boolean z11) {
        int i10;
        int childCount;
        int childCount2 = getChildCount();
        int i11 = 1;
        if (z11) {
            childCount = getChildCount() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = childCount2;
            childCount = 0;
        }
        int itemCount = lVar.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i10) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && B(position, jVar, lVar) == 0) {
                if (((RecyclerView.g) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getColumnCountForAccessibility(RecyclerView.j jVar, RecyclerView.l lVar) {
        if (this.mOrientation == 1) {
            return Math.min(this.f6928b, getItemCount());
        }
        if (lVar.getItemCount() < 1) {
            return 0;
        }
        return A(lVar.getItemCount() - 1, jVar, lVar) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getRowCountForAccessibility(RecyclerView.j jVar, RecyclerView.l lVar) {
        if (this.mOrientation == 0) {
            return Math.min(this.f6928b, getItemCount());
        }
        if (lVar.getItemCount() < 1) {
            return 0;
        }
        return A(lVar.getItemCount() - 1, jVar, lVar) + 1;
    }

    public int getSpanCount() {
        return this.f6928b;
    }

    public c getSpanSizeLookup() {
        return this.f6933g;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.f6935i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(RecyclerView.j jVar, RecyclerView.l lVar, b1 b1Var, a1 a1Var) {
        int i10;
        int i11;
        int i12;
        int decoratedMeasurementInOther;
        int paddingLeft;
        int paddingTop;
        int decoratedMeasurementInOther2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z10;
        int i13;
        View viewA;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z11 = modeInOther != 1073741824;
        int i14 = getChildCount() > 0 ? this.f6929c[this.f6928b] : 0;
        if (z11) {
            E();
        }
        boolean z12 = b1Var.f7062e == 1;
        int iB = this.f6928b;
        if (!z12) {
            iB = B(b1Var.f7061d, jVar, lVar) + C(b1Var.f7061d, jVar, lVar);
        }
        int i15 = 0;
        while (i15 < this.f6928b && (i13 = b1Var.f7061d) >= 0 && i13 < lVar.getItemCount() && iB > 0) {
            int i16 = b1Var.f7061d;
            int iC = C(i16, jVar, lVar);
            if (iC > this.f6928b) {
                throw new IllegalArgumentException(a.b.f(this.f6928b, " spans.", w0.i.f(i16, iC, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            iB -= iC;
            if (iB < 0 || (viewA = b1Var.a(jVar)) == null) {
                break;
            }
            this.f6930d[i15] = viewA;
            i15++;
        }
        if (i15 == 0) {
            a1Var.f7047b = true;
            return;
        }
        if (z12) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.f6930d[i10];
            b bVar = (b) view.getLayoutParams();
            int iC2 = C(getPosition(view), jVar, lVar);
            bVar.f6940f = iC2;
            bVar.f6939e = i17;
            i17 += iC2;
            i10 += i12;
        }
        float f10 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.f6930d[i19];
            if (b1Var.f7068k != null) {
                z10 = false;
                if (z12) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z12) {
                addView(view2);
                z10 = false;
            } else {
                z10 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f6934h);
            D(view2, modeInOther, z10);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view2);
            if (decoratedMeasurement > i18) {
                i18 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther3 = (this.mOrientationHelper.getDecoratedMeasurementInOther(view2) * 1.0f) / ((b) view2.getLayoutParams()).f6940f;
            if (decoratedMeasurementInOther3 > f10) {
                f10 = decoratedMeasurementInOther3;
            }
        }
        if (z11) {
            r(Math.max(Math.round(f10 * this.f6928b), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.f6930d[i20];
                D(view3, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view3);
                if (decoratedMeasurement2 > i18) {
                    i18 = decoratedMeasurement2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.f6930d[i21];
            if (this.mOrientationHelper.getDecoratedMeasurement(view4) != i18) {
                b bVar2 = (b) view4.getLayoutParams();
                Rect rect = bVar2.f6962b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iZ = z(bVar2.f6939e, bVar2.f6940f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.f.getChildMeasureSpec(iZ, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    childMeasureSpec = RecyclerView.f.getChildMeasureSpec(iZ, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (RecyclerView.g) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        a1Var.f7046a = i18;
        if (this.mOrientation != 1) {
            if (b1Var.f7063f == -1) {
                int i24 = b1Var.f7059b;
                paddingLeft = i24 - i18;
                decoratedMeasurementInOther = i24;
            } else {
                int i25 = b1Var.f7059b;
                decoratedMeasurementInOther = i25 + i18;
                paddingLeft = i25;
            }
            paddingTop = 0;
            decoratedMeasurementInOther2 = 0;
        } else if (b1Var.f7063f == -1) {
            decoratedMeasurementInOther2 = b1Var.f7059b;
            paddingTop = decoratedMeasurementInOther2 - i18;
            paddingLeft = 0;
            decoratedMeasurementInOther = 0;
        } else {
            int i26 = b1Var.f7059b;
            paddingTop = i26;
            decoratedMeasurementInOther = 0;
            decoratedMeasurementInOther2 = i26 + i18;
            paddingLeft = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.f6930d[i27];
            b bVar3 = (b) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f6929c[bVar3.f6939e];
                decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                decoratedMeasurementInOther = this.f6929c[this.f6928b - bVar3.f6939e] + getPaddingLeft();
                paddingLeft = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f6929c[bVar3.f6939e];
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + paddingLeft;
            }
            int i28 = decoratedMeasurementInOther;
            int i29 = paddingLeft;
            int i30 = decoratedMeasurementInOther2;
            layoutDecoratedWithMargins(view5, i29, paddingTop, i28, i30);
            paddingLeft = i29;
            decoratedMeasurementInOther = i28;
            decoratedMeasurementInOther2 = i30;
            if (bVar3.isItemRemoved() || bVar3.isItemChanged()) {
                a1Var.f7048c = true;
            }
            a1Var.f7049d = view5.hasFocusable() | a1Var.f7049d;
        }
        Arrays.fill(this.f6930d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.j jVar, RecyclerView.l lVar, z0 z0Var, int i10) {
        super.onAnchorReady(jVar, lVar, z0Var, i10);
        E();
        if (lVar.getItemCount() > 0 && !lVar.isPreLayout()) {
            boolean z10 = i10 == 1;
            int iB = B(z0Var.f7333b, jVar, lVar);
            if (z10) {
                while (iB > 0) {
                    int i11 = z0Var.f7333b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    z0Var.f7333b = i12;
                    iB = B(i12, jVar, lVar);
                }
            } else {
                int itemCount = lVar.getItemCount() - 1;
                int i13 = z0Var.f7333b;
                while (i13 < itemCount) {
                    int i14 = i13 + 1;
                    int iB2 = B(i14, jVar, lVar);
                    if (iB2 <= iB) {
                        break;
                    }
                    i13 = i14;
                    iB = iB2;
                }
                z0Var.f7333b = i13;
            }
        }
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.j r26, androidx.recyclerview.widget.RecyclerView.l r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfo(RecyclerView.j jVar, RecyclerView.l lVar, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(jVar, lVar, cVar);
        cVar.setClassName(GridView.class.getName());
        RecyclerView.a aVar = this.mRecyclerView.mAdapter;
        if (aVar == null || aVar.getItemCount() <= 1) {
            return;
        }
        cVar.addAction(c.a.f94052t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.j jVar, RecyclerView.l lVar, View view, y3.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iA = A(bVar.getViewLayoutPosition(), jVar, lVar);
        if (this.mOrientation == 0) {
            cVar.setCollectionItemInfo(y3.k.obtain(bVar.getSpanIndex(), bVar.getSpanSize(), iA, 1, false, false));
        } else {
            cVar.setCollectionItemInfo(y3.k.obtain(iA, 1, bVar.getSpanIndex(), bVar.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        this.f6933g.invalidateSpanIndexCache();
        this.f6933g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f6933g.invalidateSpanIndexCache();
        this.f6933g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f6933g.invalidateSpanIndexCache();
        this.f6933g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        this.f6933g.invalidateSpanIndexCache();
        this.f6933g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f6933g.invalidateSpanIndexCache();
        this.f6933g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutChildren(RecyclerView.j jVar, RecyclerView.l lVar) {
        boolean zIsPreLayout = lVar.isPreLayout();
        SparseIntArray sparseIntArray = this.f6932f;
        SparseIntArray sparseIntArray2 = this.f6931e;
        if (zIsPreLayout) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b bVar = (b) getChildAt(i10).getLayoutParams();
                int viewLayoutPosition = bVar.getViewLayoutPosition();
                sparseIntArray2.put(viewLayoutPosition, bVar.getSpanSize());
                sparseIntArray.put(viewLayoutPosition, bVar.getSpanIndex());
            }
        }
        super.onLayoutChildren(jVar, lVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutCompleted(RecyclerView.l lVar) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(lVar);
        this.f6927a = false;
        int i10 = this.f6936j;
        if (i10 == -1 || (viewFindViewByPosition = findViewByPosition(i10)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.f6936j = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final void r(int i10) {
        int i11;
        int[] iArr = this.f6929c;
        int i12 = this.f6928b;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f6929c = iArr;
    }

    public final int s(RecyclerView.l lVar) {
        if (getChildCount() != 0 && lVar.getItemCount() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iB = this.f6933g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f6928b);
                int iB2 = this.f6933g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f6928b);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f6933g.b(lVar.getItemCount() - 1, this.f6928b) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.f6933g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f6928b) - this.f6933g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f6928b)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public int scrollHorizontallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        E();
        u();
        return super.scrollHorizontallyBy(i10, jVar, lVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public int scrollVerticallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        E();
        u();
        return super.scrollVerticallyBy(i10, jVar, lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f6929c == null) {
            super.setMeasuredDimension(rect, i10, i11);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.f.chooseSize(i11, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f6929c;
            iChooseSize = RecyclerView.f.chooseSize(i10, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.f.chooseSize(i10, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f6929c;
            iChooseSize2 = RecyclerView.f.chooseSize(i11, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i10) {
        if (i10 == this.f6928b) {
            return;
        }
        this.f6927a = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(a.b.e(i10, "Span count should be at least 1. Provided "));
        }
        this.f6928b = i10;
        this.f6933g.invalidateSpanIndexCache();
        requestLayout();
    }

    public void setSpanSizeLookup(c cVar) {
        this.f6933g = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z10) {
        this.f6935i = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f6927a;
    }

    public final int t(RecyclerView.l lVar) {
        if (getChildCount() != 0 && lVar.getItemCount() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f6933g.b(lVar.getItemCount() - 1, this.f6928b) + 1;
                }
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart);
                int iB = this.f6933g.b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f6928b);
                return (int) ((decoratedEnd / ((this.f6933g.b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f6928b) - iB) + 1)) * (this.f6933g.b(lVar.getItemCount() - 1, this.f6928b) + 1));
            }
        }
        return 0;
    }

    public final void u() {
        View[] viewArr = this.f6930d;
        if (viewArr == null || viewArr.length != this.f6928b) {
            this.f6930d = new View[this.f6928b];
        }
    }

    public final int v(int i10) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return A(i10, recyclerView.mRecycler, recyclerView.mState);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return B(i10, recyclerView2.mRecycler, recyclerView2.mState);
    }

    public final int w(int i10) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return A(i10, recyclerView.mRecycler, recyclerView.mState);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return B(i10, recyclerView2.mRecycler, recyclerView2.mState);
    }

    public final HashSet x(int i10) {
        return y(w(i10), i10);
    }

    public final HashSet y(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iC = C(i11, recyclerView.mRecycler, recyclerView.mState);
        for (int i12 = i10; i12 < i10 + iC; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    public final int z(int i10, int i11) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f6929c;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f6929c;
        int i12 = this.f6928b;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends RecyclerView.g {

        /* renamed from: e, reason: collision with root package name */
        public int f6939e;

        /* renamed from: f, reason: collision with root package name */
        public int f6940f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6939e = -1;
            this.f6940f = 0;
        }

        public int getSpanIndex() {
            return this.f6939e;
        }

        public int getSpanSize() {
            return this.f6940f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f6939e = -1;
            this.f6940f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6939e = -1;
            this.f6940f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6939e = -1;
            this.f6940f = 0;
        }

        public b(RecyclerView.g gVar) {
            super(gVar);
            this.f6939e = -1;
            this.f6940f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f6927a = false;
        this.f6928b = -1;
        this.f6931e = new SparseIntArray();
        this.f6932f = new SparseIntArray();
        this.f6933g = new a();
        this.f6934h = new Rect();
        this.f6936j = -1;
        this.f6937k = -1;
        this.f6938l = -1;
        setSpanCount(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f6927a = false;
        this.f6928b = -1;
        this.f6931e = new SparseIntArray();
        this.f6932f = new SparseIntArray();
        this.f6933g = new a();
        this.f6934h = new Rect();
        this.f6936j = -1;
        this.f6937k = -1;
        this.f6938l = -1;
        setSpanCount(i10);
    }
}
