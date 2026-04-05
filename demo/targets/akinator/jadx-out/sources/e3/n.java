package e3;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n extends s {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f53676k = new int[2];

    public n(d3.g gVar) {
        super(gVar);
        this.f53702h.f53666e = 4;
        this.f53703i.f53666e = 5;
        this.f53700f = 0;
    }

    public static void j(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    @Override // e3.s
    public void applyToWidget() {
        h hVar = this.f53702h;
        if (hVar.f53671j) {
            this.f53696b.setX(hVar.f53668g);
        }
    }

    @Override // e3.s
    public final void c() {
        d3.g parent;
        d3.g parent2;
        d3.g gVar = this.f53696b;
        boolean z10 = gVar.f51771a;
        i iVar = this.f53699e;
        if (z10) {
            iVar.resolve(gVar.getWidth());
        }
        boolean z11 = iVar.f53671j;
        ArrayList arrayList = iVar.f53672k;
        ArrayList arrayList2 = iVar.f53673l;
        d3.f fVar = d3.f.f51769f;
        d3.f fVar2 = d3.f.f51768e;
        d3.f fVar3 = d3.f.f51766b;
        h hVar = this.f53703i;
        h hVar2 = this.f53702h;
        if (!z11) {
            d3.f horizontalDimensionBehaviour = this.f53696b.getHorizontalDimensionBehaviour();
            this.f53698d = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != fVar2) {
                if (horizontalDimensionBehaviour == fVar && (parent2 = this.f53696b.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == fVar3 || parent2.getHorizontalDimensionBehaviour() == fVar)) {
                    int width = (parent2.getWidth() - this.f53696b.N.getMargin()) - this.f53696b.P.getMargin();
                    s.a(hVar2, parent2.f51777d.f53702h, this.f53696b.N.getMargin());
                    s.a(hVar, parent2.f51777d.f53703i, -this.f53696b.P.getMargin());
                    iVar.resolve(width);
                    return;
                }
                if (this.f53698d == fVar3) {
                    iVar.resolve(this.f53696b.getWidth());
                }
            }
        } else if (this.f53698d == fVar && (parent = this.f53696b.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == fVar3 || parent.getHorizontalDimensionBehaviour() == fVar)) {
            s.a(hVar2, parent.f51777d.f53702h, this.f53696b.N.getMargin());
            s.a(hVar, parent.f51777d.f53703i, -this.f53696b.P.getMargin());
            return;
        }
        if (iVar.f53671j) {
            d3.g gVar2 = this.f53696b;
            if (gVar2.f51771a) {
                d3.e[] eVarArr = gVar2.V;
                d3.e eVar = eVarArr[0];
                d3.e eVar2 = eVar.f51762f;
                if (eVar2 != null && eVarArr[1].f51762f != null) {
                    if (gVar2.isInHorizontalChain()) {
                        hVar2.f53667f = this.f53696b.V[0].getMargin();
                        hVar.f53667f = -this.f53696b.V[1].getMargin();
                        return;
                    }
                    h hVarF = s.f(this.f53696b.V[0]);
                    if (hVarF != null) {
                        s.a(hVar2, hVarF, this.f53696b.V[0].getMargin());
                    }
                    h hVarF2 = s.f(this.f53696b.V[1]);
                    if (hVarF2 != null) {
                        s.a(hVar, hVarF2, -this.f53696b.V[1].getMargin());
                    }
                    hVar2.f53663b = true;
                    hVar.f53663b = true;
                    return;
                }
                if (eVar2 != null) {
                    h hVarF3 = s.f(eVar);
                    if (hVarF3 != null) {
                        s.a(hVar2, hVarF3, this.f53696b.V[0].getMargin());
                        s.a(hVar, hVar2, iVar.f53668g);
                        return;
                    }
                    return;
                }
                d3.e eVar3 = eVarArr[1];
                if (eVar3.f51762f != null) {
                    h hVarF4 = s.f(eVar3);
                    if (hVarF4 != null) {
                        s.a(hVar, hVarF4, -this.f53696b.V[1].getMargin());
                        s.a(hVar2, hVar, -iVar.f53668g);
                        return;
                    }
                    return;
                }
                if ((gVar2 instanceof d3.l) || gVar2.getParent() == null || this.f53696b.getAnchor(d3.d.f51753h).f51762f != null) {
                    return;
                }
                s.a(hVar2, this.f53696b.getParent().f51777d.f53702h, this.f53696b.getX());
                s.a(hVar, hVar2, iVar.f53668g);
                return;
            }
        }
        if (this.f53698d == fVar2) {
            d3.g gVar3 = this.f53696b;
            int i10 = gVar3.f51809t;
            if (i10 == 2) {
                d3.g parent3 = gVar3.getParent();
                if (parent3 != null) {
                    i iVar2 = parent3.f51779e.f53699e;
                    arrayList2.add(iVar2);
                    iVar2.f53672k.add(iVar);
                    iVar.f53663b = true;
                    arrayList.add(hVar2);
                    arrayList.add(hVar);
                }
            } else if (i10 == 3) {
                if (gVar3.f51811u == 3) {
                    hVar2.f53662a = this;
                    hVar.f53662a = this;
                    p pVar = gVar3.f51779e;
                    pVar.f53702h.f53662a = this;
                    pVar.f53703i.f53662a = this;
                    iVar.f53662a = this;
                    if (gVar3.isInVerticalChain()) {
                        arrayList2.add(this.f53696b.f51779e.f53699e);
                        this.f53696b.f51779e.f53699e.f53672k.add(iVar);
                        p pVar2 = this.f53696b.f51779e;
                        pVar2.f53699e.f53662a = this;
                        arrayList2.add(pVar2.f53702h);
                        arrayList2.add(this.f53696b.f51779e.f53703i);
                        this.f53696b.f51779e.f53702h.f53672k.add(iVar);
                        this.f53696b.f51779e.f53703i.f53672k.add(iVar);
                    } else if (this.f53696b.isInHorizontalChain()) {
                        this.f53696b.f51779e.f53699e.f53673l.add(iVar);
                        arrayList.add(this.f53696b.f51779e.f53699e);
                    } else {
                        this.f53696b.f51779e.f53699e.f53673l.add(iVar);
                    }
                } else {
                    i iVar3 = gVar3.f51779e.f53699e;
                    arrayList2.add(iVar3);
                    iVar3.f53672k.add(iVar);
                    this.f53696b.f51779e.f53702h.f53672k.add(iVar);
                    this.f53696b.f51779e.f53703i.f53672k.add(iVar);
                    iVar.f53663b = true;
                    arrayList.add(hVar2);
                    arrayList.add(hVar);
                    hVar2.f53673l.add(iVar);
                    hVar.f53673l.add(iVar);
                }
            }
        }
        d3.g gVar4 = this.f53696b;
        d3.e[] eVarArr2 = gVar4.V;
        d3.e eVar4 = eVarArr2[0];
        d3.e eVar5 = eVar4.f51762f;
        if (eVar5 != null && eVarArr2[1].f51762f != null) {
            if (gVar4.isInHorizontalChain()) {
                hVar2.f53667f = this.f53696b.V[0].getMargin();
                hVar.f53667f = -this.f53696b.V[1].getMargin();
                return;
            }
            h hVarF5 = s.f(this.f53696b.V[0]);
            h hVarF6 = s.f(this.f53696b.V[1]);
            if (hVarF5 != null) {
                hVarF5.addDependency(this);
            }
            if (hVarF6 != null) {
                hVarF6.addDependency(this);
            }
            this.f53704j = 4;
            return;
        }
        if (eVar5 != null) {
            h hVarF7 = s.f(eVar4);
            if (hVarF7 != null) {
                s.a(hVar2, hVarF7, this.f53696b.V[0].getMargin());
                b(hVar, hVar2, 1, iVar);
                return;
            }
            return;
        }
        d3.e eVar6 = eVarArr2[1];
        if (eVar6.f51762f != null) {
            h hVarF8 = s.f(eVar6);
            if (hVarF8 != null) {
                s.a(hVar, hVarF8, -this.f53696b.V[1].getMargin());
                b(hVar2, hVar, -1, iVar);
                return;
            }
            return;
        }
        if ((gVar4 instanceof d3.l) || gVar4.getParent() == null) {
            return;
        }
        s.a(hVar2, this.f53696b.getParent().f51777d.f53702h, this.f53696b.getX());
        b(hVar, hVar2, 1, iVar);
    }

    @Override // e3.s
    public final void d() {
        this.f53697c = null;
        this.f53702h.clear();
        this.f53703i.clear();
        this.f53699e.clear();
        this.f53701g = false;
    }

    @Override // e3.s
    public final boolean h() {
        return this.f53698d != d3.f.f51768e || this.f53696b.f51809t == 0;
    }

    public final void k() {
        this.f53701g = false;
        h hVar = this.f53702h;
        hVar.clear();
        hVar.f53671j = false;
        h hVar2 = this.f53703i;
        hVar2.clear();
        hVar2.f53671j = false;
        this.f53699e.f53671j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f53696b.getDebugName();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0278  */
    @Override // e3.s, e3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(e3.e r24) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.n.update(e3.e):void");
    }
}
