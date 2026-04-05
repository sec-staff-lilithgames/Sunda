package g3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public d3.h f56918a = new d3.h();

    /* renamed from: b, reason: collision with root package name */
    public d3.h f56919b = new d3.h();

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.widget.k f56920c = null;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.widget.k f56921d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f56922e;

    /* renamed from: f, reason: collision with root package name */
    public int f56923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f56924g;

    public c0(i0 i0Var) {
        this.f56924g = i0Var;
    }

    public static void b(d3.h hVar, d3.h hVar2) {
        ArrayList<d3.g> children = hVar.getChildren();
        HashMap<d3.g, d3.g> map = new HashMap<>();
        map.put(hVar, hVar2);
        hVar2.getChildren().clear();
        hVar2.copy(hVar, map);
        Iterator<d3.g> it = children.iterator();
        while (it.hasNext()) {
            d3.g next = it.next();
            d3.g aVar = next instanceof d3.a ? new d3.a() : next instanceof d3.k ? new d3.k() : next instanceof d3.j ? new d3.j() : next instanceof d3.o ? new d3.o() : next instanceof d3.l ? new d3.m() : new d3.g();
            hVar2.add(aVar);
            map.put(next, aVar);
        }
        Iterator<d3.g> it2 = children.iterator();
        while (it2.hasNext()) {
            d3.g next2 = it2.next();
            map.get(next2).copy(next2, map);
        }
    }

    public static d3.g c(d3.h hVar, View view) {
        if (hVar.getCompanionWidget() == view) {
            return hVar;
        }
        ArrayList<d3.g> children = hVar.getChildren();
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            d3.g gVar = children.get(i10);
            if (gVar.getCompanionWidget() == view) {
                return gVar;
            }
        }
        return null;
    }

    public final void a(int i10, int i11) {
        i0 i0Var = this.f56924g;
        int optimizationLevel = i0Var.getOptimizationLevel();
        if (i0Var.f56993h == i0Var.getStartState()) {
            d3.h hVar = this.f56919b;
            androidx.constraintlayout.widget.k kVar = this.f56921d;
            i0Var.resolveSystem(hVar, optimizationLevel, (kVar == null || kVar.f5432e == 0) ? i10 : i11, (kVar == null || kVar.f5432e == 0) ? i11 : i10);
            androidx.constraintlayout.widget.k kVar2 = this.f56920c;
            if (kVar2 != null) {
                d3.h hVar2 = this.f56918a;
                int i12 = kVar2.f5432e;
                int i13 = i12 == 0 ? i10 : i11;
                if (i12 == 0) {
                    i10 = i11;
                }
                i0Var.resolveSystem(hVar2, optimizationLevel, i13, i10);
                return;
            }
            return;
        }
        androidx.constraintlayout.widget.k kVar3 = this.f56920c;
        if (kVar3 != null) {
            d3.h hVar3 = this.f56918a;
            int i14 = kVar3.f5432e;
            i0Var.resolveSystem(hVar3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
        }
        d3.h hVar4 = this.f56919b;
        androidx.constraintlayout.widget.k kVar4 = this.f56921d;
        int i15 = (kVar4 == null || kVar4.f5432e == 0) ? i10 : i11;
        if (kVar4 == null || kVar4.f5432e == 0) {
            i10 = i11;
        }
        i0Var.resolveSystem(hVar4, optimizationLevel, i15, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void build() {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.c0.build():void");
    }

    public final void d(androidx.constraintlayout.widget.k kVar, androidx.constraintlayout.widget.k kVar2) {
        this.f56920c = kVar;
        this.f56921d = kVar2;
        this.f56918a = new d3.h();
        this.f56919b = new d3.h();
        d3.h hVar = this.f56918a;
        i0 i0Var = this.f56924g;
        hVar.setMeasurer(((ConstraintLayout) i0Var).mLayoutWidget.getMeasurer());
        this.f56919b.setMeasurer(((ConstraintLayout) i0Var).mLayoutWidget.getMeasurer());
        this.f56918a.removeAllChildren();
        this.f56919b.removeAllChildren();
        b(((ConstraintLayout) i0Var).mLayoutWidget, this.f56918a);
        b(((ConstraintLayout) i0Var).mLayoutWidget, this.f56919b);
        if (i0Var.f57011q > 0.5d) {
            if (kVar != null) {
                e(this.f56918a, kVar);
            }
            e(this.f56919b, kVar2);
        } else {
            e(this.f56919b, kVar2);
            if (kVar != null) {
                e(this.f56918a, kVar);
            }
        }
        this.f56918a.setRtl(i0Var.isRtl());
        this.f56918a.updateHierarchy();
        this.f56919b.setRtl(i0Var.isRtl());
        this.f56919b.updateHierarchy();
        ViewGroup.LayoutParams layoutParams = i0Var.getLayoutParams();
        if (layoutParams != null) {
            int i10 = layoutParams.width;
            d3.f fVar = d3.f.f51767c;
            if (i10 == -2) {
                this.f56918a.setHorizontalDimensionBehaviour(fVar);
                this.f56919b.setHorizontalDimensionBehaviour(fVar);
            }
            if (layoutParams.height == -2) {
                this.f56918a.setVerticalDimensionBehaviour(fVar);
                this.f56919b.setVerticalDimensionBehaviour(fVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(d3.h hVar, androidx.constraintlayout.widget.k kVar) {
        SparseArray<d3.g> sparseArray = new SparseArray<>();
        n.a aVar = new n.a(-2, -2);
        sparseArray.clear();
        sparseArray.put(0, hVar);
        i0 i0Var = this.f56924g;
        sparseArray.put(i0Var.getId(), hVar);
        if (kVar != null && kVar.f5432e != 0) {
            d3.h hVar2 = this.f56919b;
            int optimizationLevel = i0Var.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i0Var.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i0Var.getWidth(), 1073741824);
            boolean z10 = i0.f56980z0;
            i0Var.resolveSystem(hVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        Iterator<d3.g> it = hVar.getChildren().iterator();
        while (it.hasNext()) {
            d3.g next = it.next();
            next.setAnimated(true);
            sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
        }
        Iterator<d3.g> it2 = hVar.getChildren().iterator();
        while (it2.hasNext()) {
            d3.g next2 = it2.next();
            View view = (View) next2.getCompanionWidget();
            kVar.applyToLayoutParams(view.getId(), aVar);
            next2.setWidth(kVar.getWidth(view.getId()));
            next2.setHeight(kVar.getHeight(view.getId()));
            if (view instanceof androidx.constraintlayout.widget.c) {
                kVar.applyToHelper((androidx.constraintlayout.widget.c) view, next2, aVar, sparseArray);
                if (view instanceof Barrier) {
                    ((Barrier) view).validateParams();
                }
            }
            aVar.resolveLayoutDirection(i0Var.getLayoutDirection());
            boolean z11 = i0.f56980z0;
            this.f56924g.applyConstraintsFromLayoutParams(false, view, next2, aVar, sparseArray);
            if (kVar.getVisibilityMode(view.getId()) == 1) {
                next2.setVisibility(view.getVisibility());
            } else {
                next2.setVisibility(kVar.getVisibility(view.getId()));
            }
        }
        Iterator<d3.g> it3 = hVar.getChildren().iterator();
        while (it3.hasNext()) {
            d3.g next3 = it3.next();
            if (next3 instanceof d3.p) {
                androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) next3.getCompanionWidget();
                d3.l lVar = (d3.l) next3;
                cVar.updatePreLayout(hVar, lVar, sparseArray);
                ((d3.p) lVar).captureWidgets();
            }
        }
    }

    public boolean isNotConfiguredWith(int i10, int i11) {
        return (i10 == this.f56922e && i11 == this.f56923f) ? false : true;
    }

    public void measure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        i0 i0Var = this.f56924g;
        i0Var.f56983b0 = mode;
        i0Var.f56985c0 = mode2;
        a(i10, i11);
        if (!(i0Var.getParent() instanceof i0) || mode != 1073741824 || mode2 != 1073741824) {
            a(i10, i11);
            i0Var.U = this.f56918a.getWidth();
            i0Var.V = this.f56918a.getHeight();
            i0Var.W = this.f56919b.getWidth();
            i0Var.f56981a0 = this.f56919b.getHeight();
            i0Var.T = (i0Var.U == i0Var.W && i0Var.V == i0Var.f56981a0) ? false : true;
        }
        int i12 = i0Var.U;
        int i13 = i0Var.V;
        int i14 = i0Var.f56983b0;
        if (i14 == Integer.MIN_VALUE || i14 == 0) {
            i12 = (int) ((i0Var.f56986d0 * (i0Var.W - i12)) + i12);
        }
        int i15 = i12;
        int i16 = i0Var.f56985c0;
        if (i16 == Integer.MIN_VALUE || i16 == 0) {
            i13 = (int) ((i0Var.f56986d0 * (i0Var.f56981a0 - i13)) + i13);
        }
        this.f56924g.resolveMeasuredDimension(i10, i11, i15, i13, this.f56918a.isWidthMeasuredTooSmall() || this.f56919b.isWidthMeasuredTooSmall(), this.f56918a.isHeightMeasuredTooSmall() || this.f56919b.isHeightMeasuredTooSmall());
    }

    public void reEvaluateState() {
        i0 i0Var = this.f56924g;
        measure(i0Var.f56997j, i0Var.f56999k);
        HashMap<View, s> map = i0Var.f57003m;
        int childCount = i0Var.getChildCount();
        i0Var.f57018t0.build();
        i0Var.f57019u = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = i0Var.getChildAt(i11);
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        int width = i0Var.getWidth();
        int height = i0Var.getHeight();
        int iGatPathMotionArc = i0Var.f56982b.gatPathMotionArc();
        if (iGatPathMotionArc != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                s sVar = map.get(i0Var.getChildAt(i12));
                if (sVar != null) {
                    sVar.setPathMotionArc(iGatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            s sVar2 = map.get(i0Var.getChildAt(i14));
            if (sVar2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(sVar2.getAnimateRelativeTo(), true);
                iArr[i13] = sVar2.getAnimateRelativeTo();
                i13++;
            }
        }
        if (i0Var.M != null) {
            for (int i15 = 0; i15 < i13; i15++) {
                s sVar3 = map.get(i0Var.findViewById(iArr[i15]));
                if (sVar3 != null) {
                    i0Var.f56982b.getKeyFrames(sVar3);
                }
            }
            Iterator it = i0Var.M.iterator();
            while (it.hasNext()) {
                ((t) it.next()).onPreSetup(i0Var, map);
            }
            for (int i16 = 0; i16 < i13; i16++) {
                s sVar4 = map.get(i0Var.findViewById(iArr[i16]));
                if (sVar4 != null) {
                    sVar4.setup(width, height, i0Var.f57007o, i0Var.getNanoTime());
                }
            }
        } else {
            for (int i17 = 0; i17 < i13; i17++) {
                s sVar5 = map.get(i0Var.findViewById(iArr[i17]));
                if (sVar5 != null) {
                    i0Var.f56982b.getKeyFrames(sVar5);
                    sVar5.setup(width, height, i0Var.f57007o, i0Var.getNanoTime());
                }
            }
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = i0Var.getChildAt(i18);
            s sVar6 = map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && sVar6 != null) {
                i0Var.f56982b.getKeyFrames(sVar6);
                sVar6.setup(width, height, i0Var.f57007o, i0Var.getNanoTime());
            }
        }
        float staggered = i0Var.f56982b.getStaggered();
        if (staggered != 0.0f) {
            boolean z10 = ((double) staggered) < 0.0d;
            float fAbs = Math.abs(staggered);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i19 = 0; i19 < childCount; i19++) {
                s sVar7 = map.get(i0Var.getChildAt(i19));
                if (!Float.isNaN(sVar7.f57231l)) {
                    for (int i20 = 0; i20 < childCount; i20++) {
                        s sVar8 = map.get(i0Var.getChildAt(i20));
                        if (!Float.isNaN(sVar8.f57231l)) {
                            fMin = Math.min(fMin, sVar8.f57231l);
                            fMax = Math.max(fMax, sVar8.f57231l);
                        }
                    }
                    while (i10 < childCount) {
                        s sVar9 = map.get(i0Var.getChildAt(i10));
                        if (!Float.isNaN(sVar9.f57231l)) {
                            sVar9.f57233n = 1.0f / (1.0f - fAbs);
                            if (z10) {
                                sVar9.f57232m = fAbs - (((fMax - sVar9.f57231l) / (fMax - fMin)) * fAbs);
                            } else {
                                sVar9.f57232m = fAbs - (((sVar9.f57231l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i10++;
                    }
                    return;
                }
                float finalX = sVar7.getFinalX();
                float finalY = sVar7.getFinalY();
                float f10 = z10 ? finalY - finalX : finalY + finalX;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            while (i10 < childCount) {
                s sVar10 = map.get(i0Var.getChildAt(i10));
                float finalX2 = sVar10.getFinalX();
                float finalY2 = sVar10.getFinalY();
                float f11 = z10 ? finalY2 - finalX2 : finalY2 + finalX2;
                sVar10.f57233n = 1.0f / (1.0f - fAbs);
                sVar10.f57232m = fAbs - (((f11 - fMin2) * fAbs) / (fMax2 - fMin2));
                i10++;
            }
        }
    }

    public void setMeasuredId(int i10, int i11) {
        this.f56922e = i10;
        this.f56923f = i11;
    }
}
