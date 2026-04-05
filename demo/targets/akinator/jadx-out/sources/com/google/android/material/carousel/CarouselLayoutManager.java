package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.ui.p;
import eg.b;
import eg.c;
import eg.d;
import eg.e;
import eg.f;
import eg.g;
import eg.h;
import eg.j;
import eg.k;
import eg.l;
import eg.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import vf.a;
import w3.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class CarouselLayoutManager extends RecyclerView.f implements b, o2 {

    /* renamed from: a, reason: collision with root package name */
    public int f29068a;

    /* renamed from: b, reason: collision with root package name */
    public int f29069b;

    /* renamed from: c, reason: collision with root package name */
    public int f29070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29071d;

    /* renamed from: e, reason: collision with root package name */
    public final d f29072e;

    /* renamed from: f, reason: collision with root package name */
    public h f29073f;

    /* renamed from: g, reason: collision with root package name */
    public l f29074g;

    /* renamed from: h, reason: collision with root package name */
    public k f29075h;

    /* renamed from: i, reason: collision with root package name */
    public int f29076i;

    /* renamed from: j, reason: collision with root package name */
    public HashMap f29077j;

    /* renamed from: k, reason: collision with root package name */
    public g f29078k;

    /* renamed from: l, reason: collision with root package name */
    public final View.OnLayoutChangeListener f29079l;

    /* renamed from: m, reason: collision with root package name */
    public int f29080m;

    /* renamed from: n, reason: collision with root package name */
    public int f29081n;

    /* renamed from: o, reason: collision with root package name */
    public int f29082o;

    public CarouselLayoutManager() {
        this(new m());
    }

    public static androidx.localbroadcastmanager.content.b p(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            j jVar = (j) list.get(i14);
            float f15 = z10 ? jVar.f54374b : jVar.f54373a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        j jVar2 = (j) list.get(i10);
        j jVar3 = (j) list.get(i12);
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b();
        i.checkArgument(jVar2.f54373a <= jVar3.f54373a);
        bVar.f6756a = jVar2;
        bVar.f6757b = jVar3;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollExtent(RecyclerView.l lVar) {
        if (getChildCount() == 0 || this.f29074g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f29074g.f54387a.f54381a / computeHorizontalScrollRange(lVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollOffset(RecyclerView.l lVar) {
        return this.f29068a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollRange(RecyclerView.l lVar) {
        return this.f29070c - this.f29069b;
    }

    @Override // androidx.recyclerview.widget.o2
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f29074g == null) {
            return null;
        }
        int iN = n(i10, m(i10)) - this.f29068a;
        return isHorizontal() ? new PointF(iN, 0.0f) : new PointF(0.0f, iN);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollExtent(RecyclerView.l lVar) {
        if (getChildCount() == 0 || this.f29074g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f29074g.f54387a.f54381a / computeVerticalScrollRange(lVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollOffset(RecyclerView.l lVar) {
        return this.f29068a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollRange(RecyclerView.l lVar) {
        return this.f29070c - this.f29069b;
    }

    public final float d(float f10, float f11) {
        return q() ? f10 - f11 : f10 + f11;
    }

    public final void e(RecyclerView.j jVar, int i10, int i11) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return;
        }
        float fI = i(i10);
        View viewForPosition = jVar.getViewForPosition(i10);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fD = d(fI, this.f29075h.f54381a / 2.0f);
        float fH = h(fD, p(this.f29075h.f54383c, fD, false));
        float f10 = this.f29075h.f54381a / 2.0f;
        addView(viewForPosition, i11);
        measureChildWithMargins(viewForPosition, 0, 0);
        this.f29078k.layoutDecoratedWithMargins(viewForPosition, (int) (fH - f10), (int) (fH + f10));
    }

    public final void f(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        float fI = i(i10);
        while (i10 < lVar.getItemCount()) {
            float fD = d(fI, this.f29075h.f54381a / 2.0f);
            androidx.localbroadcastmanager.content.b bVarP = p(this.f29075h.f54383c, fD, false);
            float fH = h(fD, bVarP);
            if (r(fH, bVarP)) {
                return;
            }
            fI = d(fI, this.f29075h.f54381a);
            if (!s(fH, bVarP)) {
                View viewForPosition = jVar.getViewForPosition(i10);
                float f10 = this.f29075h.f54381a / 2.0f;
                addView(viewForPosition, -1);
                measureChildWithMargins(viewForPosition, 0, 0);
                this.f29078k.layoutDecoratedWithMargins(viewForPosition, (int) (fH - f10), (int) (fH + f10));
            }
            i10++;
        }
    }

    public final void g(int i10, RecyclerView.j jVar) {
        float fI = i(i10);
        while (i10 >= 0) {
            float fD = d(fI, this.f29075h.f54381a / 2.0f);
            androidx.localbroadcastmanager.content.b bVarP = p(this.f29075h.f54383c, fD, false);
            float fH = h(fD, bVarP);
            if (s(fH, bVarP)) {
                return;
            }
            float f10 = this.f29075h.f54381a;
            fI = q() ? fI + f10 : fI - f10;
            if (!r(fH, bVarP)) {
                View viewForPosition = jVar.getViewForPosition(i10);
                float f11 = this.f29075h.f54381a / 2.0f;
                addView(viewForPosition, 0);
                measureChildWithMargins(viewForPosition, 0, 0);
                this.f29078k.layoutDecoratedWithMargins(viewForPosition, (int) (fH - f11), (int) (fH + f11));
            }
            i10--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateDefaultLayoutParams() {
        return new RecyclerView.g(-2, -2);
    }

    @Override // eg.b
    public int getCarouselAlignment() {
        return this.f29082o;
    }

    @Override // eg.b
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // eg.b
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        androidx.localbroadcastmanager.content.b bVarP = p(this.f29075h.f54383c, fCenterY, true);
        j jVar = (j) bVarP.f6756a;
        float f10 = jVar.f54376d;
        j jVar2 = (j) bVarP.f6757b;
        float fLerp = a.lerp(f10, jVar2.f54376d, jVar.f54374b, jVar2.f54374b, fCenterY);
        float fWidth = isHorizontal() ? (rect.width() - fLerp) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - fLerp) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.f29078k.f54361a;
    }

    public final float h(float f10, androidx.localbroadcastmanager.content.b bVar) {
        j jVar = (j) bVar.f6756a;
        float f11 = jVar.f54374b;
        j jVar2 = (j) bVar.f6757b;
        float f12 = jVar2.f54374b;
        float f13 = jVar.f54373a;
        float f14 = jVar2.f54373a;
        float fLerp = a.lerp(f11, f12, f13, f14, f10);
        if (jVar2 != this.f29075h.b() && jVar != this.f29075h.d()) {
            return fLerp;
        }
        return j1.o2.a(1.0f, jVar2.f54375c, f10 - f14, fLerp);
    }

    public final float i(int i10) {
        return d(this.f29078k.d() - this.f29068a, this.f29075h.f54381a * i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // eg.b
    public boolean isHorizontal() {
        return this.f29078k.f54361a == 0;
    }

    public final void j(RecyclerView.j jVar, RecyclerView.l lVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fL = l(childAt);
            if (!s(fL, p(this.f29075h.f54383c, fL, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, jVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fL2 = l(childAt2);
            if (!r(fL2, p(this.f29075h.f54383c, fL2, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, jVar);
            }
        }
        if (getChildCount() == 0) {
            g(this.f29076i - 1, jVar);
            f(this.f29076i, jVar, lVar);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            g(position - 1, jVar);
            f(position2 + 1, jVar, lVar);
        }
        y();
    }

    public final int k() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    public final float l(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return isHorizontal() ? r0.centerX() : r0.centerY();
    }

    public final k m(int i10) {
        k kVar;
        HashMap map = this.f29077j;
        return (map == null || (kVar = (k) map.get(Integer.valueOf(r3.a.clamp(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f29074g.f54387a : kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void measureChildWithMargins(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int n(int i10, k kVar) {
        if (!q()) {
            return (int) ((kVar.f54381a / 2.0f) + ((i10 * kVar.f54381a) - kVar.a().f54373a));
        }
        float fK = k() - kVar.c().f54373a;
        float f10 = kVar.f54381a;
        return (int) ((fK - (i10 * f10)) - (f10 / 2.0f));
    }

    public void notifyItemSizeChanged() {
        u();
    }

    public final int o(int i10, k kVar) {
        int i11 = Integer.MAX_VALUE;
        for (j jVar : kVar.f54383c.subList(kVar.f54384d, kVar.f54385e + 1)) {
            float f10 = kVar.f54381a;
            float f11 = (f10 / 2.0f) + (i10 * f10);
            int iK = (q() ? (int) ((k() - jVar.f54373a) - f11) : (int) (f11 - jVar.f54373a)) - this.f29068a;
            if (Math.abs(i11) > Math.abs(iK)) {
                i11 = iK;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onAttachedToWindow(RecyclerView recyclerView) throws Resources.NotFoundException {
        super.onAttachedToWindow(recyclerView);
        h hVar = this.f29073f;
        Context context = recyclerView.getContext();
        float dimension = hVar.f54362a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        hVar.f54362a = dimension;
        float dimension2 = hVar.f54363b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        hVar.f54363b = dimension2;
        u();
        recyclerView.addOnLayoutChangeListener(this.f29079l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.j jVar) {
        super.onDetachedFromWindow(recyclerView, jVar);
        recyclerView.removeOnLayoutChangeListener(this.f29079l);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r6, int r7, androidx.recyclerview.widget.RecyclerView.j r8, androidx.recyclerview.widget.RecyclerView.l r9) {
        /*
            r5 = this;
            int r9 = r5.getChildCount()
            r0 = 0
            if (r9 != 0) goto L8
            return r0
        L8:
            int r9 = r5.getOrientation()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r7 == r3) goto L3a
            r4 = 2
            if (r7 == r4) goto L30
            r4 = 17
            if (r7 == r4) goto L3f
            r4 = 33
            if (r7 == r4) goto L3c
            r4 = 66
            if (r7 == r4) goto L32
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L2e
            java.lang.String r9 = "CarouselLayoutManager"
            java.lang.String r4 = "Unknown focus request:"
            p0.o2.z(r7, r4, r9)
        L2c:
            r7 = r1
            goto L48
        L2e:
            if (r9 != r3) goto L2c
        L30:
            r7 = r3
            goto L48
        L32:
            if (r9 != 0) goto L2c
            boolean r7 = r5.q()
            if (r7 == 0) goto L30
        L3a:
            r7 = r2
            goto L48
        L3c:
            if (r9 != r3) goto L2c
            goto L3a
        L3f:
            if (r9 != 0) goto L2c
            boolean r7 = r5.q()
            if (r7 == 0) goto L3a
            goto L30
        L48:
            if (r7 != r1) goto L4b
            return r0
        L4b:
            r9 = 0
            if (r7 != r2) goto L72
            int r6 = r5.getPosition(r6)
            if (r6 != 0) goto L55
            return r0
        L55:
            android.view.View r6 = r5.getChildAt(r9)
            int r6 = r5.getPosition(r6)
            int r6 = r6 - r3
            r5.e(r8, r6, r9)
            boolean r6 = r5.q()
            if (r6 == 0) goto L6d
            int r6 = r5.getChildCount()
            int r9 = r6 + (-1)
        L6d:
            android.view.View r6 = r5.getChildAt(r9)
            return r6
        L72:
            int r6 = r5.getPosition(r6)
            int r7 = r5.getItemCount()
            int r7 = r7 - r3
            if (r6 != r7) goto L7e
            return r0
        L7e:
            int r6 = r5.getChildCount()
            int r6 = r6 - r3
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r5.getPosition(r6)
            int r6 = r6 + r3
            r5.e(r8, r6, r2)
            boolean r6 = r5.q()
            if (r6 == 0) goto L96
            goto L9c
        L96:
            int r6 = r5.getChildCount()
            int r9 = r6 + (-1)
        L9c:
            android.view.View r6 = r5.getChildAt(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutChildren(RecyclerView.j jVar, RecyclerView.l lVar) {
        if (lVar.getItemCount() <= 0 || k() <= 0.0f) {
            removeAndRecycleAllViews(jVar);
            this.f29076i = 0;
            return;
        }
        boolean zQ = q();
        l lVar2 = this.f29074g;
        int i10 = 1;
        boolean z10 = lVar2 == null;
        if (z10 || lVar2.f54387a.f54386f != k()) {
            t(jVar);
        }
        l lVar3 = this.f29074g;
        boolean zQ2 = q();
        k kVarA = zQ2 ? lVar3.a() : lVar3.b();
        float f10 = (zQ2 ? kVarA.c() : kVarA.a()).f54373a;
        float f11 = kVarA.f54381a / 2.0f;
        int iD = (int) (this.f29078k.d() - (q() ? f10 + f11 : f10 - f11));
        l lVar4 = this.f29074g;
        boolean zQ3 = q();
        k kVarB = zQ3 ? lVar4.b() : lVar4.a();
        j jVarA = zQ3 ? kVarB.a() : kVarB.c();
        int itemCount = (int) ((((zQ3 ? -1 : 1) * jVarA.f54376d) / 2.0f) + ((((lVar.getItemCount() - 1) * kVarB.f54381a) * (zQ3 ? -1.0f : 1.0f)) - (jVarA.f54373a - this.f29078k.d())));
        int iMin = zQ3 ? Math.min(0, itemCount) : Math.max(0, itemCount);
        this.f29069b = zQ ? iMin : iD;
        if (zQ) {
            iMin = iD;
        }
        this.f29070c = iMin;
        if (z10) {
            this.f29068a = iD;
            l lVar5 = this.f29074g;
            int itemCount2 = getItemCount();
            int i11 = this.f29069b;
            int i12 = this.f29070c;
            boolean zQ4 = q();
            List list = lVar5.f54388b;
            List list2 = lVar5.f54389c;
            float f12 = lVar5.f54387a.f54381a;
            HashMap map = new HashMap();
            int i13 = 0;
            int i14 = 0;
            while (i13 < itemCount2) {
                int i15 = zQ4 ? (itemCount2 - i13) - i10 : i13;
                int i16 = i10;
                if (i15 * f12 * (zQ4 ? -1 : i16) > i12 - lVar5.f54393g || i13 >= itemCount2 - list2.size()) {
                    map.put(Integer.valueOf(i15), (k) list2.get(r3.a.clamp(i14, 0, list2.size() - 1)));
                    i14++;
                }
                i13++;
                i10 = i16;
            }
            int i17 = i10;
            int i18 = 0;
            for (int i19 = itemCount2 - 1; i19 >= 0; i19--) {
                int i20 = zQ4 ? (itemCount2 - i19) - 1 : i19;
                if (i20 * f12 * (zQ4 ? -1 : i17) < i11 + lVar5.f54392f || i19 < list.size()) {
                    map.put(Integer.valueOf(i20), (k) list.get(r3.a.clamp(i18, 0, list.size() - 1)));
                    i18++;
                }
            }
            this.f29077j = map;
            int i21 = this.f29081n;
            if (i21 != -1) {
                this.f29068a = n(i21, m(i21));
            }
        }
        int i22 = this.f29068a;
        int i23 = this.f29069b;
        int i24 = this.f29070c;
        this.f29068a = (i22 < i23 ? i23 - i22 : i22 > i24 ? i24 - i22 : 0) + i22;
        this.f29076i = r3.a.clamp(this.f29076i, 0, lVar.getItemCount());
        w(this.f29074g);
        detachAndScrapAttachedViews(jVar);
        j(jVar, lVar);
        this.f29080m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutCompleted(RecyclerView.l lVar) {
        super.onLayoutCompleted(lVar);
        if (getChildCount() == 0) {
            this.f29076i = 0;
        } else {
            this.f29076i = getPosition(getChildAt(0));
        }
        y();
    }

    public final boolean q() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    public final boolean r(float f10, androidx.localbroadcastmanager.content.b bVar) {
        j jVar = (j) bVar.f6756a;
        float f11 = jVar.f54376d;
        j jVar2 = (j) bVar.f6757b;
        float fLerp = a.lerp(f11, jVar2.f54376d, jVar.f54374b, jVar2.f54374b, f10) / 2.0f;
        float f12 = q() ? f10 + fLerp : f10 - fLerp;
        return q() ? f12 < 0.0f : f12 > ((float) k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iO;
        if (this.f29074g == null || (iO = o(getPosition(view), m(getPosition(view)))) == 0) {
            return false;
        }
        int i10 = this.f29068a;
        int i11 = this.f29069b;
        int i12 = this.f29070c;
        int i13 = i10 + iO;
        if (i13 < i11) {
            iO = i11 - i10;
        } else if (i13 > i12) {
            iO = i12 - i10;
        }
        int iO2 = o(getPosition(view), this.f29074g.getShiftedState(i10 + iO, i11, i12));
        if (isHorizontal()) {
            recyclerView.scrollBy(iO2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iO2);
        return true;
    }

    public final boolean s(float f10, androidx.localbroadcastmanager.content.b bVar) {
        j jVar = (j) bVar.f6756a;
        float f11 = jVar.f54376d;
        j jVar2 = (j) bVar.f6757b;
        float fD = d(f10, a.lerp(f11, jVar2.f54376d, jVar.f54374b, jVar2.f54374b, f10) / 2.0f);
        return q() ? fD > ((float) k()) : fD < 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollHorizontallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (canScrollHorizontally()) {
            return v(i10, jVar, lVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void scrollToPosition(int i10) {
        this.f29081n = i10;
        if (this.f29074g == null) {
            return;
        }
        this.f29068a = n(i10, m(i10));
        this.f29076i = r3.a.clamp(i10, 0, Math.max(0, getItemCount() - 1));
        w(this.f29074g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollVerticallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (canScrollVertically()) {
            return v(i10, jVar, lVar);
        }
        return 0;
    }

    public void setCarouselAlignment(int i10) {
        this.f29082o = i10;
        u();
    }

    public void setCarouselStrategy(h hVar) {
        this.f29073f = hVar;
        u();
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean z10) {
        this.f29071d = z10;
        d dVar = this.f29072e;
        recyclerView.removeItemDecoration(dVar);
        if (z10) {
            recyclerView.addItemDecoration(dVar);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i10) {
        g fVar;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a.b.e(i10, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        g gVar = this.f29078k;
        if (gVar == null || i10 != gVar.f54361a) {
            if (i10 == 0) {
                fVar = new f(this);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                fVar = new e(this);
            }
            this.f29078k = fVar;
            u();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.l lVar, int i10) {
        c cVar = new c(this, recyclerView.getContext());
        cVar.setTargetPosition(i10);
        startSmoothScroll(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[PHI: r24
      0x0135: PHI (r24v1 float) = (r24v3 float), (r24v4 float) binds: [B:63:0x0133, B:60:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.recyclerview.widget.RecyclerView.j r30) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.t(androidx.recyclerview.widget.RecyclerView$j):void");
    }

    public final void u() {
        this.f29074g = null;
        requestLayout();
    }

    public final int v(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (getChildCount() != 0 && i10 != 0) {
            if (this.f29074g == null) {
                t(jVar);
            }
            int itemCount = getItemCount();
            l lVar2 = this.f29074g;
            if (itemCount > (q() ? lVar2.a() : lVar2.b()).f54382b) {
                int i11 = this.f29068a;
                int i12 = this.f29069b;
                int i13 = this.f29070c;
                int i14 = i11 + i10;
                if (i14 < i12) {
                    i10 = i12 - i11;
                } else if (i14 > i13) {
                    i10 = i13 - i11;
                }
                this.f29068a = i11 + i10;
                w(this.f29074g);
                float f10 = this.f29075h.f54381a / 2.0f;
                float fI = i(getPosition(getChildAt(0)));
                Rect rect = new Rect();
                float f11 = q() ? this.f29075h.c().f54374b : this.f29075h.a().f54374b;
                float f12 = Float.MAX_VALUE;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    float fD = d(fI, f10);
                    float fH = h(fD, p(this.f29075h.f54383c, fD, false));
                    super.getDecoratedBoundsWithMargins(childAt, rect);
                    this.f29078k.offsetChild(childAt, rect, f10, fH);
                    float fAbs = Math.abs(f11 - fH);
                    if (childAt != null && fAbs < f12) {
                        this.f29081n = getPosition(childAt);
                        f12 = fAbs;
                    }
                    fI = d(fI, this.f29075h.f54381a);
                }
                j(jVar, lVar);
                return i10;
            }
        }
        return 0;
    }

    public final void w(l lVar) {
        int i10 = this.f29070c;
        int i11 = this.f29069b;
        if (i10 <= i11) {
            this.f29075h = q() ? lVar.a() : lVar.b();
        } else {
            this.f29075h = lVar.getShiftedState(this.f29068a, i11, i10);
        }
        List list = this.f29075h.f54383c;
        d dVar = this.f29072e;
        dVar.getClass();
        dVar.f54358b = Collections.unmodifiableList(list);
    }

    public final void x() {
        int itemCount = getItemCount();
        int i10 = this.f29080m;
        if (itemCount == i10 || this.f29074g == null) {
            return;
        }
        if (this.f29073f.shouldRefreshKeylineState(this, i10)) {
            u();
        }
        this.f29080m = itemCount;
    }

    public final void y() {
        if (!this.f29071d || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                if (this.f29071d && Log.isLoggable("CarouselLayoutManager", 3)) {
                    Log.d("CarouselLayoutManager", "internal representation of views on the screen");
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        View childAt = getChildAt(i12);
                        Log.d("CarouselLayoutManager", "item position " + getPosition(childAt) + ", center:" + l(childAt) + ", child index:" + i12);
                    }
                    Log.d("CarouselLayoutManager", "==============");
                }
                StringBuilder sbF = w0.i.f(i10, position, "Detected invalid child order. Child at index [", "] had adapter position [", "] and child at index [");
                sbF.append(i11);
                sbF.append("] had adapter position [");
                sbF.append(position2);
                sbF.append("].");
                throw new IllegalStateException(sbF.toString());
            }
            i10 = i11;
        }
    }

    public CarouselLayoutManager(h hVar) {
        this(hVar, 0);
    }

    public CarouselLayoutManager(h hVar, int i10) {
        this.f29071d = false;
        this.f29072e = new d();
        this.f29076i = 0;
        this.f29079l = new p(this, 3);
        this.f29081n = -1;
        this.f29082o = 0;
        setCarouselStrategy(hVar);
        setOrientation(i10);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f29071d = false;
        this.f29072e = new d();
        this.f29076i = 0;
        this.f29079l = new p(this, 3);
        this.f29081n = -1;
        this.f29082o = 0;
        setCarouselStrategy(new m());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88458f);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(0, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
