package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import e3.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements e3.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f5389a;

    /* renamed from: b, reason: collision with root package name */
    public int f5390b;

    /* renamed from: c, reason: collision with root package name */
    public int f5391c;

    /* renamed from: d, reason: collision with root package name */
    public int f5392d;

    /* renamed from: e, reason: collision with root package name */
    public int f5393e;

    /* renamed from: f, reason: collision with root package name */
    public int f5394f;

    /* renamed from: g, reason: collision with root package name */
    public int f5395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f5396h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5396h = constraintLayout;
        this.f5389a = constraintLayout2;
    }

    public static boolean a(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
        }
        return false;
    }

    public void captureLayoutInfo(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f5390b = i12;
        this.f5391c = i13;
        this.f5392d = i14;
        this.f5393e = i15;
        this.f5394f = i10;
        this.f5395g = i11;
    }

    @Override // e3.c
    public final void didMeasures() {
        ConstraintLayout constraintLayout = this.f5389a;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt instanceof p) {
                ((p) childAt).updatePostMeasure(constraintLayout);
            }
        }
        int size = constraintLayout.mConstraintHelpers.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((c) constraintLayout.mConstraintHelpers.get(i11)).updatePostMeasure(constraintLayout);
            }
        }
    }

    @Override // e3.c
    public final void measure(d3.g gVar, b.a aVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        ConstraintLayout constraintLayout;
        int i10;
        if (gVar == null) {
            return;
        }
        if (gVar.getVisibility() == 8 && !gVar.isInPlaceholder()) {
            aVar.f53646e = 0;
            aVar.f53647f = 0;
            aVar.f53648g = 0;
            return;
        }
        if (gVar.getParent() == null) {
            return;
        }
        ConstraintLayout constraintLayout2 = this.f5396h;
        if (constraintLayout2.mMetrics != null) {
            constraintLayout2.mMetrics.getClass();
            System.nanoTime();
        }
        d3.f fVar = aVar.f53642a;
        d3.f fVar2 = aVar.f53643b;
        int i11 = aVar.f53644c;
        int i12 = aVar.f53645d;
        int i13 = this.f5390b + this.f5391c;
        int i14 = this.f5392d;
        View view = (View) gVar.getCompanionWidget();
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else if (iOrdinal == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5394f, i14, -2);
        } else if (iOrdinal != 2) {
            iMakeMeasureSpec = iOrdinal != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.f5394f, gVar.getHorizontalMargin() + i14, -1);
        } else {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5394f, i14, -2);
            boolean z10 = gVar.f51809t == 1;
            int i15 = aVar.f53651j;
            if (i15 == 1 || i15 == 2) {
                boolean z11 = view.getMeasuredHeight() == gVar.getHeight();
                if (aVar.f53651j == 2 || !z10 || ((z10 && z11) || (view instanceof p) || gVar.isResolvedHorizontally())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gVar.getWidth(), 1073741824);
                }
            }
        }
        int iOrdinal2 = fVar2.ordinal();
        if (iOrdinal2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (iOrdinal2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5395g, i13, -2);
        } else if (iOrdinal2 != 2) {
            iMakeMeasureSpec2 = iOrdinal2 != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.f5395g, gVar.getVerticalMargin() + i13, -1);
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5395g, i13, -2);
            boolean z12 = gVar.f51811u == 1;
            int i16 = aVar.f53651j;
            if (i16 == 1 || i16 == 2) {
                boolean z13 = view.getMeasuredWidth() == gVar.getWidth();
                if (aVar.f53651j == 2 || !z12 || ((z12 && z13) || (view instanceof p) || gVar.isResolvedVertically())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gVar.getHeight(), 1073741824);
                }
            }
        }
        d3.h hVar = (d3.h) gVar.getParent();
        if (hVar != null && d3.n.enabled(constraintLayout2.mOptimizationLevel, NotificationCompat.FLAG_LOCAL_ONLY) && view.getMeasuredWidth() == gVar.getWidth() && view.getMeasuredWidth() < hVar.getWidth() && view.getMeasuredHeight() == gVar.getHeight() && view.getMeasuredHeight() < hVar.getHeight() && view.getBaseline() == gVar.getBaselineDistance() && !gVar.isMeasureRequested() && a(gVar.getLastHorizontalMeasureSpec(), iMakeMeasureSpec, gVar.getWidth()) && a(gVar.getLastVerticalMeasureSpec(), iMakeMeasureSpec2, gVar.getHeight())) {
            aVar.f53646e = gVar.getWidth();
            aVar.f53647f = gVar.getHeight();
            aVar.f53648g = gVar.getBaselineDistance();
            return;
        }
        d3.f fVar3 = d3.f.f51768e;
        boolean z14 = fVar == fVar3;
        boolean z15 = fVar2 == fVar3;
        d3.f fVar4 = d3.f.f51766b;
        d3.f fVar5 = d3.f.f51769f;
        boolean z16 = fVar2 == fVar5 || fVar2 == fVar4;
        boolean z17 = fVar == fVar5 || fVar == fVar4;
        boolean z18 = z14 && gVar.f51776c0 > 0.0f;
        boolean z19 = z15 && gVar.f51776c0 > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) view.getLayoutParams();
        int i17 = aVar.f53651j;
        if (i17 != 1 && i17 != 2 && z14 && gVar.f51809t == 0 && z15 && gVar.f51811u == 0) {
            constraintLayout = constraintLayout2;
            i10 = -1;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof x) && (gVar instanceof d3.p)) {
                ((x) view).onMeasure((d3.p) gVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            gVar.setLastMeasureSpec(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            int i18 = gVar.f51815w;
            iMax = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
            int i19 = gVar.f51817x;
            if (i19 > 0) {
                iMax = Math.min(i19, iMax);
            }
            int i20 = gVar.f51821z;
            iMax2 = i20 > 0 ? Math.max(i20, measuredHeight) : measuredHeight;
            constraintLayout = constraintLayout2;
            int i21 = gVar.A;
            if (i21 > 0) {
                iMax2 = Math.min(i21, iMax2);
            }
            boolean z20 = z17;
            if (!d3.n.enabled(constraintLayout.mOptimizationLevel, 1)) {
                if (z18 && z16) {
                    iMax = (int) ((iMax2 * gVar.f51776c0) + 0.5f);
                } else if (z19 && z20) {
                    iMax2 = (int) ((iMax / gVar.f51776c0) + 0.5f);
                }
            }
            if (measuredWidth != iMax || measuredHeight != iMax2) {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                if (measuredHeight != iMax2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                gVar.setLastMeasureSpec(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = view.getMeasuredWidth();
                iMax2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
            }
            i10 = -1;
        }
        boolean z21 = baseline != i10;
        aVar.f53650i = (iMax == aVar.f53644c && iMax2 == aVar.f53645d) ? false : true;
        if (aVar2.f5324c0) {
            z21 = true;
        }
        if (z21 && baseline != -1 && gVar.getBaselineDistance() != baseline) {
            aVar.f53650i = true;
        }
        aVar.f53646e = iMax;
        aVar.f53647f = iMax2;
        aVar.f53649h = z21;
        aVar.f53648g = baseline;
        if (constraintLayout.mMetrics != null) {
            System.nanoTime();
            constraintLayout.mMetrics.getClass();
        }
    }
}
