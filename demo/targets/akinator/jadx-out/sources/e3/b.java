package e3;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53639a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final a f53640b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final d3.h f53641c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public d3.f f53642a;

        /* renamed from: b, reason: collision with root package name */
        public d3.f f53643b;

        /* renamed from: c, reason: collision with root package name */
        public int f53644c;

        /* renamed from: d, reason: collision with root package name */
        public int f53645d;

        /* renamed from: e, reason: collision with root package name */
        public int f53646e;

        /* renamed from: f, reason: collision with root package name */
        public int f53647f;

        /* renamed from: g, reason: collision with root package name */
        public int f53648g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f53649h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f53650i;

        /* renamed from: j, reason: collision with root package name */
        public int f53651j;
    }

    public b(d3.h hVar) {
        this.f53641c = hVar;
    }

    public final boolean a(int i10, d3.g gVar, c cVar) {
        d3.f horizontalDimensionBehaviour = gVar.getHorizontalDimensionBehaviour();
        int[] iArr = gVar.f51813v;
        a aVar = this.f53640b;
        aVar.f53642a = horizontalDimensionBehaviour;
        aVar.f53643b = gVar.getVerticalDimensionBehaviour();
        aVar.f53644c = gVar.getWidth();
        aVar.f53645d = gVar.getHeight();
        aVar.f53650i = false;
        aVar.f53651j = i10;
        d3.f fVar = aVar.f53642a;
        d3.f fVar2 = d3.f.f51768e;
        boolean z10 = fVar == fVar2;
        boolean z11 = aVar.f53643b == fVar2;
        boolean z12 = z10 && gVar.f51776c0 > 0.0f;
        boolean z13 = z11 && gVar.f51776c0 > 0.0f;
        d3.f fVar3 = d3.f.f51766b;
        if (z12 && iArr[0] == 4) {
            aVar.f53642a = fVar3;
        }
        if (z13 && iArr[1] == 4) {
            aVar.f53643b = fVar3;
        }
        ((androidx.constraintlayout.widget.e) cVar).measure(gVar, aVar);
        gVar.setWidth(aVar.f53646e);
        gVar.setHeight(aVar.f53647f);
        gVar.setHasBaseline(aVar.f53649h);
        gVar.setBaselineDistance(aVar.f53648g);
        aVar.f53651j = 0;
        return aVar.f53650i;
    }

    public final void b(d3.h hVar, int i10, int i11, int i12) {
        if (hVar.I0 != null) {
            System.nanoTime();
        }
        int minWidth = hVar.getMinWidth();
        int minHeight = hVar.getMinHeight();
        hVar.setMinWidth(0);
        hVar.setMinHeight(0);
        hVar.setWidth(i11);
        hVar.setHeight(i12);
        hVar.setMinWidth(minWidth);
        hVar.setMinHeight(minHeight);
        d3.h hVar2 = this.f53641c;
        hVar2.setPass(i10);
        hVar2.layout();
        if (hVar.I0 != null) {
            System.nanoTime();
            hVar.I0.getClass();
        }
    }

    public long solverMeasure(d3.h hVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        float f10;
        boolean zDirectMeasureWithOrientation;
        int i19;
        boolean z10;
        int i20;
        long j10;
        int i21;
        long j11;
        d3.d dVar;
        d3.d dVar2;
        ArrayList arrayList;
        int i22;
        int i23;
        c cVar;
        boolean z11;
        boolean z12;
        int i24;
        boolean z13;
        int i25;
        boolean z14;
        int i26;
        n nVar;
        boolean zDirectMeasureWithOrientation2;
        x2.g gVar;
        c measurer = hVar.getMeasurer();
        int size = hVar.C0.size();
        int width = hVar.getWidth();
        int height = hVar.getHeight();
        boolean zEnabled = d3.n.enabled(i10, 128);
        int i27 = 0;
        boolean z15 = zEnabled || d3.n.enabled(i10, 64);
        d3.f fVar = d3.f.f51768e;
        if (z15) {
            for (int i28 = 0; i28 < size; i28++) {
                f10 = 0.0f;
                d3.g gVar2 = (d3.g) hVar.C0.get(i28);
                boolean z16 = (gVar2.getHorizontalDimensionBehaviour() == fVar) && (gVar2.getVerticalDimensionBehaviour() == fVar) && gVar2.getDimensionRatio() > 0.0f;
                if ((gVar2.isInHorizontalChain() && z16) || ((gVar2.isInVerticalChain() && z16) || (gVar2 instanceof d3.p) || gVar2.isInHorizontalChain() || gVar2.isInVerticalChain())) {
                    z15 = false;
                    break;
                }
            }
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (z15 && (gVar = x2.f.f91478r) != null) {
            gVar.f91495a++;
        }
        boolean z17 = z15 & ((i13 == 1073741824 && i15 == 1073741824) || zEnabled);
        if (z17) {
            int iMin = Math.min(hVar.getMaxWidth(), i14);
            int iMin2 = Math.min(hVar.getMaxHeight(), i16);
            if (i13 == 1073741824 && hVar.getWidth() != iMin) {
                hVar.setWidth(iMin);
                hVar.invalidateGraph();
            }
            if (i15 == 1073741824 && hVar.getHeight() != iMin2) {
                hVar.setHeight(iMin2);
                hVar.invalidateGraph();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zDirectMeasureWithOrientation = hVar.directMeasure(zEnabled);
                i19 = 2;
            } else {
                boolean zDirectMeasureSetup = hVar.directMeasureSetup(zEnabled);
                if (i13 == 1073741824) {
                    zDirectMeasureWithOrientation2 = zDirectMeasureSetup & hVar.directMeasureWithOrientation(zEnabled, 0);
                    i19 = 1;
                } else {
                    zDirectMeasureWithOrientation2 = zDirectMeasureSetup;
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zDirectMeasureWithOrientation = hVar.directMeasureWithOrientation(zEnabled, 1) & zDirectMeasureWithOrientation2;
                    i19++;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureWithOrientation2;
                }
            }
            if (zDirectMeasureWithOrientation) {
                hVar.updateFromRuns(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zDirectMeasureWithOrientation = false;
            i19 = 0;
        }
        if (zDirectMeasureWithOrientation && i19 == 2) {
            j11 = 0;
        } else {
            int optimizationLevel = hVar.getOptimizationLevel();
            if (size > 0) {
                int size2 = hVar.C0.size();
                boolean zOptimizeFor = hVar.optimizeFor(64);
                c measurer2 = hVar.getMeasurer();
                int i29 = 0;
                while (i29 < size2) {
                    d3.g gVar3 = (d3.g) hVar.C0.get(i29);
                    if ((gVar3 instanceof d3.k) || (gVar3 instanceof d3.a) || gVar3.isInVirtualLayout()) {
                        z14 = z17;
                        i26 = size;
                    } else {
                        if (!zOptimizeFor || (nVar = gVar3.f51777d) == null) {
                            i25 = i27;
                        } else {
                            p pVar = gVar3.f51779e;
                            if (pVar == null || !nVar.f53699e.f53671j || !pVar.f53699e.f53671j) {
                                i25 = 0;
                            }
                            z14 = z17;
                            i26 = size;
                        }
                        d3.f dimensionBehaviour = gVar3.getDimensionBehaviour(i25);
                        z14 = z17;
                        d3.f dimensionBehaviour2 = gVar3.getDimensionBehaviour(1);
                        i26 = size;
                        boolean z18 = dimensionBehaviour == fVar && gVar3.f51809t != 1 && dimensionBehaviour2 == fVar && gVar3.f51811u != 1;
                        if (!z18 && hVar.optimizeFor(1) && !(gVar3 instanceof d3.p)) {
                            if (dimensionBehaviour == fVar && gVar3.f51809t == 0 && dimensionBehaviour2 != fVar && !gVar3.isInHorizontalChain()) {
                                z18 = true;
                            }
                            if (dimensionBehaviour2 == fVar && gVar3.f51811u == 0 && dimensionBehaviour != fVar && !gVar3.isInHorizontalChain()) {
                                z18 = true;
                            }
                            if ((dimensionBehaviour == fVar || dimensionBehaviour2 == fVar) && gVar3.f51776c0 > f10) {
                                z18 = true;
                            }
                        }
                        if (!z18) {
                            a(0, gVar3, measurer2);
                        }
                    }
                    i29++;
                    z17 = z14;
                    size = i26;
                    i27 = 0;
                }
                z10 = z17;
                i20 = size;
                ((androidx.constraintlayout.widget.e) measurer2).didMeasures();
            } else {
                z10 = z17;
                i20 = size;
            }
            long jNanoTime = hVar.I0 != null ? System.nanoTime() : 0L;
            updateHierarchy(hVar);
            ArrayList arrayList2 = this.f53639a;
            int size3 = arrayList2.size();
            if (i20 > 0) {
                b(hVar, 0, width, height);
            }
            if (size3 > 0) {
                d3.f horizontalDimensionBehaviour = hVar.getHorizontalDimensionBehaviour();
                d3.f fVar2 = d3.f.f51767c;
                boolean z19 = horizontalDimensionBehaviour == fVar2;
                boolean z20 = hVar.getVerticalDimensionBehaviour() == fVar2;
                int width2 = hVar.getWidth();
                d3.h hVar2 = this.f53641c;
                j10 = jNanoTime;
                int iMax = Math.max(width2, hVar2.getMinWidth());
                int i30 = 0;
                int iMax2 = Math.max(hVar.getHeight(), hVar2.getMinHeight());
                boolean zNeedSolverPass = false;
                while (true) {
                    dVar = d3.d.f51751f;
                    dVar2 = d3.d.f51750e;
                    if (i30 >= size3) {
                        break;
                    }
                    boolean z21 = z20;
                    d3.g gVar4 = (d3.g) arrayList2.get(i30);
                    int i31 = i30;
                    if (gVar4 instanceof d3.p) {
                        int width3 = gVar4.getWidth();
                        boolean z22 = zNeedSolverPass;
                        int height2 = gVar4.getHeight();
                        z12 = z19;
                        boolean zA = z22 | a(1, gVar4, measurer);
                        int width4 = gVar4.getWidth();
                        i24 = optimizationLevel;
                        int height3 = gVar4.getHeight();
                        if (width4 != width3) {
                            gVar4.setWidth(width4);
                            if (z12 && gVar4.getRight() > iMax) {
                                iMax = Math.max(iMax, gVar4.getAnchor(dVar2).getMargin() + gVar4.getRight());
                            }
                            z13 = true;
                        } else {
                            z13 = zA;
                        }
                        if (height3 != height2) {
                            gVar4.setHeight(height3);
                            if (z21 && gVar4.getBottom() > iMax2) {
                                iMax2 = Math.max(iMax2, gVar4.getAnchor(dVar).getMargin() + gVar4.getBottom());
                            }
                            z13 = true;
                        }
                        zNeedSolverPass = ((d3.p) gVar4).needSolverPass() | z13;
                    } else {
                        i24 = optimizationLevel;
                        z12 = z19;
                    }
                    i30 = i31 + 1;
                    z20 = z21;
                    z19 = z12;
                    optimizationLevel = i24;
                }
                int i32 = optimizationLevel;
                boolean z23 = z20;
                boolean z24 = z19;
                int iMax3 = iMax2;
                int i33 = 0;
                boolean z25 = zNeedSolverPass;
                while (i33 < 2) {
                    boolean z26 = z25;
                    int i34 = 0;
                    while (i34 < size3) {
                        d3.g gVar5 = (d3.g) arrayList2.get(i34);
                        if ((!(gVar5 instanceof d3.l) || (gVar5 instanceof d3.p)) && !(gVar5 instanceof d3.k)) {
                            arrayList = arrayList2;
                            if (gVar5.getVisibility() != 8 && ((!z10 || !gVar5.f51777d.f53699e.f53671j || !gVar5.f51779e.f53699e.f53671j) && !(gVar5 instanceof d3.p))) {
                                int width5 = gVar5.getWidth();
                                int height4 = gVar5.getHeight();
                                i22 = size3;
                                int baselineDistance = gVar5.getBaselineDistance();
                                i23 = i34;
                                boolean zA2 = a(i33 == 1 ? 2 : 1, gVar5, measurer) | z26;
                                int width6 = gVar5.getWidth();
                                cVar = measurer;
                                int height5 = gVar5.getHeight();
                                if (width6 != width5) {
                                    gVar5.setWidth(width6);
                                    if (z24 && gVar5.getRight() > iMax) {
                                        iMax = Math.max(iMax, gVar5.getAnchor(dVar2).getMargin() + gVar5.getRight());
                                    }
                                    zA2 = true;
                                }
                                if (height5 != height4) {
                                    gVar5.setHeight(height5);
                                    if (z23 && gVar5.getBottom() > iMax3) {
                                        iMax3 = Math.max(iMax3, gVar5.getAnchor(dVar).getMargin() + gVar5.getBottom());
                                    }
                                    z11 = true;
                                } else {
                                    z11 = zA2;
                                }
                                z26 = (!gVar5.hasBaseline() || baselineDistance == gVar5.getBaselineDistance()) ? z11 : true;
                            }
                            i34 = i23 + 1;
                            size3 = i22;
                            arrayList2 = arrayList;
                            measurer = cVar;
                        } else {
                            arrayList = arrayList2;
                        }
                        cVar = measurer;
                        i22 = size3;
                        i23 = i34;
                        i34 = i23 + 1;
                        size3 = i22;
                        arrayList2 = arrayList;
                        measurer = cVar;
                    }
                    ArrayList arrayList3 = arrayList2;
                    c cVar2 = measurer;
                    int i35 = size3;
                    if (!z26) {
                        break;
                    }
                    i33++;
                    b(hVar, i33, width, height);
                    size3 = i35;
                    arrayList2 = arrayList3;
                    measurer = cVar2;
                    z25 = false;
                }
                i21 = i32;
            } else {
                j10 = jNanoTime;
                i21 = optimizationLevel;
            }
            hVar.setOptimizationLevel(i21);
            j11 = j10;
        }
        return hVar.I0 != null ? System.nanoTime() - j11 : j11;
    }

    public void updateHierarchy(d3.h hVar) {
        ArrayList arrayList = this.f53639a;
        arrayList.clear();
        int size = hVar.C0.size();
        for (int i10 = 0; i10 < size; i10++) {
            d3.g gVar = (d3.g) hVar.C0.get(i10);
            d3.f horizontalDimensionBehaviour = gVar.getHorizontalDimensionBehaviour();
            d3.f fVar = d3.f.f51768e;
            if (horizontalDimensionBehaviour == fVar || gVar.getVerticalDimensionBehaviour() == fVar) {
                arrayList.add(gVar);
            }
        }
        hVar.invalidateGraph();
    }
}
