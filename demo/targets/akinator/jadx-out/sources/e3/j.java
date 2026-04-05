package e3;

import e3.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f53675a = new b.a();

    public static boolean a(d3.g gVar) {
        d3.f horizontalDimensionBehaviour = gVar.getHorizontalDimensionBehaviour();
        d3.f verticalDimensionBehaviour = gVar.getVerticalDimensionBehaviour();
        d3.h hVar = gVar.getParent() != null ? (d3.h) gVar.getParent() : null;
        d3.f fVar = d3.f.f51766b;
        if (hVar != null) {
            hVar.getHorizontalDimensionBehaviour();
        }
        if (hVar != null) {
            hVar.getVerticalDimensionBehaviour();
        }
        d3.f fVar2 = d3.f.f51768e;
        d3.f fVar3 = d3.f.f51767c;
        boolean z10 = horizontalDimensionBehaviour == fVar || gVar.isResolvedHorizontally() || horizontalDimensionBehaviour == fVar3 || (horizontalDimensionBehaviour == fVar2 && gVar.f51809t == 0 && gVar.f51776c0 == 0.0f && gVar.hasDanglingDimension(0)) || (horizontalDimensionBehaviour == fVar2 && gVar.f51809t == 1 && gVar.hasResolvedTargets(0, gVar.getWidth()));
        boolean z11 = verticalDimensionBehaviour == fVar || gVar.isResolvedVertically() || verticalDimensionBehaviour == fVar3 || (verticalDimensionBehaviour == fVar2 && gVar.f51811u == 0 && gVar.f51776c0 == 0.0f && gVar.hasDanglingDimension(1)) || (verticalDimensionBehaviour == fVar2 && gVar.f51811u == 1 && gVar.hasResolvedTargets(1, gVar.getHeight()));
        return (gVar.f51776c0 > 0.0f && (z10 || z11)) || (z10 && z11);
    }

    public static void b(int i10, d3.g gVar, c cVar, boolean z10) {
        boolean z11;
        d3.e eVar;
        d3.e eVar2;
        d3.e eVar3;
        d3.e eVar4;
        if (gVar.isHorizontalSolvingPassDone()) {
            return;
        }
        int i11 = 0;
        if (!(gVar instanceof d3.h) && gVar.isMeasureRequested()) {
            int i12 = i10 + 1;
            if (a(gVar)) {
                d3.h.measure(i12, gVar, cVar, new b.a(), 0);
            }
        }
        d3.e anchor = gVar.getAnchor(d3.d.f51748b);
        d3.e anchor2 = gVar.getAnchor(d3.d.f51750e);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        HashSet<d3.e> dependents = anchor.getDependents();
        d3.f fVar = d3.f.f51768e;
        if (dependents != null && anchor.hasFinalValue()) {
            Iterator<d3.e> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                d3.e next = it.next();
                d3.g gVar2 = next.f51760d;
                int i13 = i10 + 1;
                boolean zA = a(gVar2);
                d3.e eVar5 = gVar2.N;
                d3.e eVar6 = gVar2.P;
                if (gVar2.isMeasureRequested() && zA) {
                    d3.h.measure(i13, gVar2, cVar, new b.a(), i11);
                }
                int i14 = ((next == eVar5 && (eVar4 = eVar6.f51762f) != null && eVar4.hasFinalValue()) || (next == eVar6 && (eVar3 = eVar5.f51762f) != null && eVar3.hasFinalValue())) ? 1 : i11;
                if (gVar2.getHorizontalDimensionBehaviour() != fVar || zA) {
                    if (!gVar2.isMeasureRequested()) {
                        if (next == eVar5 && eVar6.f51762f == null) {
                            int margin = eVar5.getMargin() + finalValue;
                            gVar2.setFinalHorizontal(margin, gVar2.getWidth() + margin);
                            b(i13, gVar2, cVar, z10);
                        } else if (next == eVar6 && eVar5.f51762f == null) {
                            int margin2 = finalValue - eVar6.getMargin();
                            gVar2.setFinalHorizontal(margin2 - gVar2.getWidth(), margin2);
                            b(i13, gVar2, cVar, z10);
                        } else if (i14 != 0 && !gVar2.isInHorizontalChain()) {
                            c(i13, gVar2, cVar, z10);
                        }
                    }
                } else if (gVar2.getHorizontalDimensionBehaviour() == fVar && gVar2.f51817x >= 0 && gVar2.f51815w >= 0 && ((gVar2.getVisibility() == 8 || (gVar2.f51809t == 0 && gVar2.getDimensionRatio() == 0.0f)) && !gVar2.isInHorizontalChain() && !gVar2.isInVirtualLayout() && i14 != 0 && !gVar2.isInHorizontalChain())) {
                    d(i13, gVar, cVar, gVar2, z10);
                }
                i11 = 0;
            }
        }
        if (gVar instanceof d3.k) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<d3.e> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                d3.e next2 = it2.next();
                d3.g gVar3 = next2.f51760d;
                int i15 = i10 + 1;
                boolean zA2 = a(gVar3);
                d3.e eVar7 = gVar3.N;
                d3.e eVar8 = gVar3.P;
                if (gVar3.isMeasureRequested() && zA2) {
                    z11 = false;
                    d3.h.measure(i15, gVar3, cVar, new b.a(), 0);
                } else {
                    z11 = false;
                }
                boolean z12 = ((next2 == eVar7 && (eVar2 = eVar8.f51762f) != null && eVar2.hasFinalValue()) || (next2 == eVar8 && (eVar = eVar7.f51762f) != null && eVar.hasFinalValue())) ? true : z11;
                if (gVar3.getHorizontalDimensionBehaviour() != fVar || zA2) {
                    if (!gVar3.isMeasureRequested()) {
                        if (next2 == eVar7 && eVar8.f51762f == null) {
                            int margin3 = eVar7.getMargin() + finalValue2;
                            gVar3.setFinalHorizontal(margin3, gVar3.getWidth() + margin3);
                            b(i15, gVar3, cVar, z10);
                        } else if (next2 == eVar8 && eVar7.f51762f == null) {
                            int margin4 = finalValue2 - eVar8.getMargin();
                            gVar3.setFinalHorizontal(margin4 - gVar3.getWidth(), margin4);
                            b(i15, gVar3, cVar, z10);
                        } else if (z12 && !gVar3.isInHorizontalChain()) {
                            c(i15, gVar3, cVar, z10);
                        }
                    }
                } else if (gVar3.getHorizontalDimensionBehaviour() == fVar && gVar3.f51817x >= 0 && gVar3.f51815w >= 0) {
                    if (gVar3.getVisibility() == 8 || (gVar3.f51809t == 0 && gVar3.getDimensionRatio() == 0.0f)) {
                        if (!gVar3.isInHorizontalChain() && !gVar3.isInVirtualLayout() && z12 && !gVar3.isInHorizontalChain()) {
                            d(i15, gVar, cVar, gVar3, z10);
                        }
                    }
                }
            }
        }
        gVar.markHorizontalSolvingPassDone();
    }

    public static void c(int i10, d3.g gVar, c cVar, boolean z10) {
        float horizontalBiasPercent = gVar.getHorizontalBiasPercent();
        d3.e eVar = gVar.N;
        int finalValue = eVar.f51762f.getFinalValue();
        d3.e eVar2 = gVar.P;
        int finalValue2 = eVar2.f51762f.getFinalValue();
        int margin = eVar.getMargin() + finalValue;
        int margin2 = finalValue2 - eVar2.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int width = gVar.getWidth();
        int i11 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i11 = (finalValue - finalValue2) - width;
        }
        int i12 = ((int) (i11 > 0 ? (horizontalBiasPercent * i11) + 0.5f : horizontalBiasPercent * i11)) + finalValue;
        int i13 = i12 + width;
        if (finalValue > finalValue2) {
            i13 = i12 - width;
        }
        gVar.setFinalHorizontal(i12, i13);
        b(i10 + 1, gVar, cVar, z10);
    }

    public static void d(int i10, d3.g gVar, c cVar, d3.g gVar2, boolean z10) {
        float horizontalBiasPercent = gVar2.getHorizontalBiasPercent();
        d3.e eVar = gVar2.N;
        int margin = eVar.getMargin() + eVar.f51762f.getFinalValue();
        d3.e eVar2 = gVar2.P;
        int finalValue = eVar2.f51762f.getFinalValue() - eVar2.getMargin();
        if (finalValue >= margin) {
            int width = gVar2.getWidth();
            if (gVar2.getVisibility() != 8) {
                int i11 = gVar2.f51809t;
                if (i11 == 2) {
                    width = (int) (gVar2.getHorizontalBiasPercent() * 0.5f * (gVar instanceof d3.h ? gVar.getWidth() : gVar.getParent().getWidth()));
                } else if (i11 == 0) {
                    width = finalValue - margin;
                }
                width = Math.max(gVar2.f51815w, width);
                int i12 = gVar2.f51817x;
                if (i12 > 0) {
                    width = Math.min(i12, width);
                }
            }
            int i13 = margin + ((int) ((horizontalBiasPercent * ((finalValue - margin) - width)) + 0.5f));
            gVar2.setFinalHorizontal(i13, width + i13);
            b(i10 + 1, gVar2, cVar, z10);
        }
    }

    public static void e(int i10, d3.g gVar, c cVar) {
        float verticalBiasPercent = gVar.getVerticalBiasPercent();
        d3.e eVar = gVar.O;
        int finalValue = eVar.f51762f.getFinalValue();
        d3.e eVar2 = gVar.Q;
        int finalValue2 = eVar2.f51762f.getFinalValue();
        int margin = eVar.getMargin() + finalValue;
        int margin2 = finalValue2 - eVar2.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int height = gVar.getHeight();
        int i11 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i11 = (finalValue - finalValue2) - height;
        }
        int i12 = (int) (i11 > 0 ? (verticalBiasPercent * i11) + 0.5f : verticalBiasPercent * i11);
        int i13 = finalValue + i12;
        int i14 = i13 + height;
        if (finalValue > finalValue2) {
            i13 = finalValue - i12;
            i14 = i13 - height;
        }
        gVar.setFinalVertical(i13, i14);
        g(i10 + 1, gVar, cVar);
    }

    public static void f(int i10, d3.g gVar, c cVar, d3.g gVar2) {
        float verticalBiasPercent = gVar2.getVerticalBiasPercent();
        d3.e eVar = gVar2.O;
        int margin = eVar.getMargin() + eVar.f51762f.getFinalValue();
        d3.e eVar2 = gVar2.Q;
        int finalValue = eVar2.f51762f.getFinalValue() - eVar2.getMargin();
        if (finalValue >= margin) {
            int height = gVar2.getHeight();
            if (gVar2.getVisibility() != 8) {
                int i11 = gVar2.f51811u;
                if (i11 == 2) {
                    height = (int) (verticalBiasPercent * 0.5f * (gVar instanceof d3.h ? gVar.getHeight() : gVar.getParent().getHeight()));
                } else if (i11 == 0) {
                    height = finalValue - margin;
                }
                height = Math.max(gVar2.f51821z, height);
                int i12 = gVar2.A;
                if (i12 > 0) {
                    height = Math.min(i12, height);
                }
            }
            int i13 = margin + ((int) ((verticalBiasPercent * ((finalValue - margin) - height)) + 0.5f));
            gVar2.setFinalVertical(i13, height + i13);
            g(i10 + 1, gVar2, cVar);
        }
    }

    public static void g(int i10, d3.g gVar, c cVar) {
        d3.e eVar;
        d3.e eVar2;
        int i11;
        d3.e eVar3;
        d3.e eVar4;
        if (gVar.isVerticalSolvingPassDone()) {
            return;
        }
        int i12 = 0;
        if (!(gVar instanceof d3.h) && gVar.isMeasureRequested()) {
            int i13 = i10 + 1;
            if (a(gVar)) {
                d3.h.measure(i13, gVar, cVar, new b.a(), 0);
            }
        }
        d3.e anchor = gVar.getAnchor(d3.d.f51749c);
        d3.e anchor2 = gVar.getAnchor(d3.d.f51751f);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        HashSet<d3.e> dependents = anchor.getDependents();
        d3.f fVar = d3.f.f51768e;
        if (dependents != null && anchor.hasFinalValue()) {
            Iterator<d3.e> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                d3.e next = it.next();
                d3.g gVar2 = next.f51760d;
                int i14 = i10 + 1;
                boolean zA = a(gVar2);
                d3.e eVar5 = gVar2.O;
                d3.e eVar6 = gVar2.Q;
                if (gVar2.isMeasureRequested() && zA) {
                    i11 = 1;
                    d3.h.measure(i14, gVar2, cVar, new b.a(), i12);
                } else {
                    i11 = 1;
                }
                int i15 = ((next == eVar5 && (eVar4 = eVar6.f51762f) != null && eVar4.hasFinalValue()) || (next == eVar6 && (eVar3 = eVar5.f51762f) != null && eVar3.hasFinalValue())) ? i11 : i12;
                if (gVar2.getVerticalDimensionBehaviour() != fVar || zA) {
                    if (!gVar2.isMeasureRequested()) {
                        if (next == eVar5 && eVar6.f51762f == null) {
                            int margin = eVar5.getMargin() + finalValue;
                            gVar2.setFinalVertical(margin, gVar2.getHeight() + margin);
                            g(i14, gVar2, cVar);
                        } else if (next == eVar6 && eVar5.f51762f == null) {
                            int margin2 = finalValue - eVar6.getMargin();
                            gVar2.setFinalVertical(margin2 - gVar2.getHeight(), margin2);
                            g(i14, gVar2, cVar);
                        } else if (i15 != 0 && !gVar2.isInVerticalChain()) {
                            e(i14, gVar2, cVar);
                        }
                    }
                } else if (gVar2.getVerticalDimensionBehaviour() == fVar && gVar2.A >= 0 && gVar2.f51821z >= 0 && ((gVar2.getVisibility() == 8 || (gVar2.f51811u == 0 && gVar2.getDimensionRatio() == 0.0f)) && !gVar2.isInVerticalChain() && !gVar2.isInVirtualLayout() && i15 != 0 && !gVar2.isInVerticalChain())) {
                    f(i14, gVar, cVar, gVar2);
                }
                i12 = 0;
            }
        }
        if (gVar instanceof d3.k) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<d3.e> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                d3.e next2 = it2.next();
                d3.g gVar3 = next2.f51760d;
                int i16 = i10 + 1;
                boolean zA2 = a(gVar3);
                d3.e eVar7 = gVar3.O;
                d3.e eVar8 = gVar3.Q;
                if (gVar3.isMeasureRequested() && zA2) {
                    d3.h.measure(i16, gVar3, cVar, new b.a(), 0);
                }
                boolean z10 = (next2 == eVar7 && (eVar2 = eVar8.f51762f) != null && eVar2.hasFinalValue()) || (next2 == eVar8 && (eVar = eVar7.f51762f) != null && eVar.hasFinalValue());
                if (gVar3.getVerticalDimensionBehaviour() != fVar || zA2) {
                    if (!gVar3.isMeasureRequested()) {
                        if (next2 == eVar7 && eVar8.f51762f == null) {
                            int margin3 = eVar7.getMargin() + finalValue2;
                            gVar3.setFinalVertical(margin3, gVar3.getHeight() + margin3);
                            g(i16, gVar3, cVar);
                        } else if (next2 == eVar8 && eVar7.f51762f == null) {
                            int margin4 = finalValue2 - eVar8.getMargin();
                            gVar3.setFinalVertical(margin4 - gVar3.getHeight(), margin4);
                            g(i16, gVar3, cVar);
                        } else if (z10 && !gVar3.isInVerticalChain()) {
                            e(i16, gVar3, cVar);
                        }
                    }
                } else if (gVar3.getVerticalDimensionBehaviour() == fVar && gVar3.A >= 0 && gVar3.f51821z >= 0 && (gVar3.getVisibility() == 8 || (gVar3.f51811u == 0 && gVar3.getDimensionRatio() == 0.0f))) {
                    if (!gVar3.isInVerticalChain() && !gVar3.isInVirtualLayout() && z10 && !gVar3.isInVerticalChain()) {
                        f(i16, gVar, cVar, gVar3);
                    }
                }
            }
        }
        d3.e anchor3 = gVar.getAnchor(d3.d.f51752g);
        if (anchor3.getDependents() != null && anchor3.hasFinalValue()) {
            int finalValue3 = anchor3.getFinalValue();
            Iterator<d3.e> it3 = anchor3.getDependents().iterator();
            while (it3.hasNext()) {
                d3.e next3 = it3.next();
                d3.g gVar4 = next3.f51760d;
                int i17 = i10 + 1;
                boolean zA3 = a(gVar4);
                if (gVar4.isMeasureRequested() && zA3) {
                    d3.h.measure(i17, gVar4, cVar, new b.a(), 0);
                }
                if (gVar4.getVerticalDimensionBehaviour() != fVar || zA3) {
                    if (!gVar4.isMeasureRequested() && next3 == gVar4.R) {
                        gVar4.setFinalBaseline(next3.getMargin() + finalValue3);
                        g(i17, gVar4, cVar);
                    }
                }
            }
        }
        gVar.markVerticalSolvingPassDone();
    }

    public static String ls(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("+-(" + i10 + ") ");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean solveChain(d3.h r21, x2.f r22, int r23, int r24, d3.c r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.j.solveChain(d3.h, x2.f, int, int, d3.c, boolean, boolean, boolean):boolean");
    }

    public static void solvingPass(d3.h hVar, c cVar) {
        d3.f horizontalDimensionBehaviour = hVar.getHorizontalDimensionBehaviour();
        d3.f verticalDimensionBehaviour = hVar.getVerticalDimensionBehaviour();
        hVar.resetFinalResolution();
        ArrayList<d3.g> children = hVar.getChildren();
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            children.get(i10).resetFinalResolution();
        }
        boolean zIsRtl = hVar.isRtl();
        d3.f fVar = d3.f.f51766b;
        if (horizontalDimensionBehaviour == fVar) {
            hVar.setFinalHorizontal(0, hVar.getWidth());
        } else {
            hVar.setFinalLeft(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            d3.g gVar = children.get(i11);
            if (gVar instanceof d3.k) {
                d3.k kVar = (d3.k) gVar;
                if (kVar.getOrientation() == 1) {
                    if (kVar.getRelativeBegin() != -1) {
                        kVar.setFinalValue(kVar.getRelativeBegin());
                    } else if (kVar.getRelativeEnd() != -1 && hVar.isResolvedHorizontally()) {
                        kVar.setFinalValue(hVar.getWidth() - kVar.getRelativeEnd());
                    } else if (hVar.isResolvedHorizontally()) {
                        kVar.setFinalValue((int) ((kVar.getRelativePercent() * hVar.getWidth()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((gVar instanceof d3.a) && ((d3.a) gVar).getOrientation() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                d3.g gVar2 = children.get(i12);
                if (gVar2 instanceof d3.k) {
                    d3.k kVar2 = (d3.k) gVar2;
                    if (kVar2.getOrientation() == 1) {
                        b(0, kVar2, cVar, zIsRtl);
                    }
                }
            }
        }
        b(0, hVar, cVar, zIsRtl);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                d3.g gVar3 = children.get(i13);
                if (gVar3 instanceof d3.a) {
                    d3.a aVar = (d3.a) gVar3;
                    if (aVar.getOrientation() == 0 && aVar.allSolved()) {
                        b(1, aVar, cVar, zIsRtl);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == fVar) {
            hVar.setFinalVertical(0, hVar.getHeight());
        } else {
            hVar.setFinalTop(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            d3.g gVar4 = children.get(i14);
            if (gVar4 instanceof d3.k) {
                d3.k kVar3 = (d3.k) gVar4;
                if (kVar3.getOrientation() == 0) {
                    if (kVar3.getRelativeBegin() != -1) {
                        kVar3.setFinalValue(kVar3.getRelativeBegin());
                    } else if (kVar3.getRelativeEnd() != -1 && hVar.isResolvedVertically()) {
                        kVar3.setFinalValue(hVar.getHeight() - kVar3.getRelativeEnd());
                    } else if (hVar.isResolvedVertically()) {
                        kVar3.setFinalValue((int) ((kVar3.getRelativePercent() * hVar.getHeight()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((gVar4 instanceof d3.a) && ((d3.a) gVar4).getOrientation() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                d3.g gVar5 = children.get(i15);
                if (gVar5 instanceof d3.k) {
                    d3.k kVar4 = (d3.k) gVar5;
                    if (kVar4.getOrientation() == 0) {
                        g(1, kVar4, cVar);
                    }
                }
            }
        }
        g(0, hVar, cVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                d3.g gVar6 = children.get(i16);
                if (gVar6 instanceof d3.a) {
                    d3.a aVar2 = (d3.a) gVar6;
                    if (aVar2.getOrientation() == 1 && aVar2.allSolved()) {
                        g(1, aVar2, cVar);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            d3.g gVar7 = children.get(i17);
            if (gVar7.isMeasureRequested() && a(gVar7)) {
                d3.h.measure(0, gVar7, cVar, f53675a, 0);
                if (!(gVar7 instanceof d3.k)) {
                    b(0, gVar7, cVar, zIsRtl);
                    g(0, gVar7, cVar);
                } else if (((d3.k) gVar7).getOrientation() == 0) {
                    g(0, gVar7, cVar);
                } else {
                    b(0, gVar7, cVar, zIsRtl);
                }
            }
        }
    }
}
