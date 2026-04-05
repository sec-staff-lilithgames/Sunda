package e3;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends s {

    /* renamed from: k, reason: collision with root package name */
    public final h f53679k;

    /* renamed from: l, reason: collision with root package name */
    public a f53680l;

    public p(d3.g gVar) {
        super(gVar);
        h hVar = new h(this);
        this.f53679k = hVar;
        this.f53680l = null;
        this.f53702h.f53666e = 6;
        this.f53703i.f53666e = 7;
        hVar.f53666e = 8;
        this.f53700f = 1;
    }

    @Override // e3.s
    public void applyToWidget() {
        h hVar = this.f53702h;
        if (hVar.f53671j) {
            this.f53696b.setY(hVar.f53668g);
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
            iVar.resolve(gVar.getHeight());
        }
        boolean z11 = iVar.f53671j;
        ArrayList arrayList = iVar.f53672k;
        ArrayList arrayList2 = iVar.f53673l;
        d3.f fVar = d3.f.f51769f;
        d3.f fVar2 = d3.f.f51766b;
        d3.f fVar3 = d3.f.f51768e;
        h hVar = this.f53703i;
        h hVar2 = this.f53702h;
        if (!z11) {
            this.f53698d = this.f53696b.getVerticalDimensionBehaviour();
            if (this.f53696b.hasBaseline()) {
                this.f53680l = new a(this);
            }
            d3.f fVar4 = this.f53698d;
            if (fVar4 != fVar3) {
                if (fVar4 == fVar && (parent2 = this.f53696b.getParent()) != null && parent2.getVerticalDimensionBehaviour() == fVar2) {
                    int height = (parent2.getHeight() - this.f53696b.O.getMargin()) - this.f53696b.Q.getMargin();
                    s.a(hVar2, parent2.f51779e.f53702h, this.f53696b.O.getMargin());
                    s.a(hVar, parent2.f51779e.f53703i, -this.f53696b.Q.getMargin());
                    iVar.resolve(height);
                    return;
                }
                if (this.f53698d == fVar2) {
                    iVar.resolve(this.f53696b.getHeight());
                }
            }
        } else if (this.f53698d == fVar && (parent = this.f53696b.getParent()) != null && parent.getVerticalDimensionBehaviour() == fVar2) {
            s.a(hVar2, parent.f51779e.f53702h, this.f53696b.O.getMargin());
            s.a(hVar, parent.f51779e.f53703i, -this.f53696b.Q.getMargin());
            return;
        }
        boolean z12 = iVar.f53671j;
        h hVar3 = this.f53679k;
        if (z12) {
            d3.g gVar2 = this.f53696b;
            if (gVar2.f51771a) {
                d3.e[] eVarArr = gVar2.V;
                d3.e eVar = eVarArr[2];
                d3.e eVar2 = eVar.f51762f;
                if (eVar2 != null && eVarArr[3].f51762f != null) {
                    if (gVar2.isInVerticalChain()) {
                        hVar2.f53667f = this.f53696b.V[2].getMargin();
                        hVar.f53667f = -this.f53696b.V[3].getMargin();
                    } else {
                        h hVarF = s.f(this.f53696b.V[2]);
                        if (hVarF != null) {
                            s.a(hVar2, hVarF, this.f53696b.V[2].getMargin());
                        }
                        h hVarF2 = s.f(this.f53696b.V[3]);
                        if (hVarF2 != null) {
                            s.a(hVar, hVarF2, -this.f53696b.V[3].getMargin());
                        }
                        hVar2.f53663b = true;
                        hVar.f53663b = true;
                    }
                    if (this.f53696b.hasBaseline()) {
                        s.a(hVar3, hVar2, this.f53696b.getBaselineDistance());
                        return;
                    }
                    return;
                }
                if (eVar2 != null) {
                    h hVarF3 = s.f(eVar);
                    if (hVarF3 != null) {
                        s.a(hVar2, hVarF3, this.f53696b.V[2].getMargin());
                        s.a(hVar, hVar2, iVar.f53668g);
                        if (this.f53696b.hasBaseline()) {
                            s.a(hVar3, hVar2, this.f53696b.getBaselineDistance());
                            return;
                        }
                        return;
                    }
                    return;
                }
                d3.e eVar3 = eVarArr[3];
                if (eVar3.f51762f != null) {
                    h hVarF4 = s.f(eVar3);
                    if (hVarF4 != null) {
                        s.a(hVar, hVarF4, -this.f53696b.V[3].getMargin());
                        s.a(hVar2, hVar, -iVar.f53668g);
                    }
                    if (this.f53696b.hasBaseline()) {
                        s.a(hVar3, hVar2, this.f53696b.getBaselineDistance());
                        return;
                    }
                    return;
                }
                d3.e eVar4 = eVarArr[4];
                if (eVar4.f51762f != null) {
                    h hVarF5 = s.f(eVar4);
                    if (hVarF5 != null) {
                        s.a(hVar3, hVarF5, 0);
                        s.a(hVar2, hVar3, -this.f53696b.getBaselineDistance());
                        s.a(hVar, hVar2, iVar.f53668g);
                        return;
                    }
                    return;
                }
                if ((gVar2 instanceof d3.l) || gVar2.getParent() == null || this.f53696b.getAnchor(d3.d.f51753h).f51762f != null) {
                    return;
                }
                s.a(hVar2, this.f53696b.getParent().f51779e.f53702h, this.f53696b.getY());
                s.a(hVar, hVar2, iVar.f53668g);
                if (this.f53696b.hasBaseline()) {
                    s.a(hVar3, hVar2, this.f53696b.getBaselineDistance());
                    return;
                }
                return;
            }
        }
        if (z12 || this.f53698d != fVar3) {
            iVar.addDependency(this);
        } else {
            d3.g gVar3 = this.f53696b;
            int i10 = gVar3.f51811u;
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
            } else if (i10 == 3 && !gVar3.isInVerticalChain()) {
                d3.g gVar4 = this.f53696b;
                if (gVar4.f51809t != 3) {
                    i iVar3 = gVar4.f51777d.f53699e;
                    arrayList2.add(iVar3);
                    iVar3.f53672k.add(iVar);
                    iVar.f53663b = true;
                    arrayList.add(hVar2);
                    arrayList.add(hVar);
                }
            }
        }
        d3.g gVar5 = this.f53696b;
        d3.e[] eVarArr2 = gVar5.V;
        d3.e eVar5 = eVarArr2[2];
        d3.e eVar6 = eVar5.f51762f;
        if (eVar6 != null && eVarArr2[3].f51762f != null) {
            if (gVar5.isInVerticalChain()) {
                hVar2.f53667f = this.f53696b.V[2].getMargin();
                hVar.f53667f = -this.f53696b.V[3].getMargin();
            } else {
                h hVarF6 = s.f(this.f53696b.V[2]);
                h hVarF7 = s.f(this.f53696b.V[3]);
                if (hVarF6 != null) {
                    hVarF6.addDependency(this);
                }
                if (hVarF7 != null) {
                    hVarF7.addDependency(this);
                }
                this.f53704j = 4;
            }
            if (this.f53696b.hasBaseline()) {
                b(hVar3, hVar2, 1, this.f53680l);
            }
        } else if (eVar6 != null) {
            h hVarF8 = s.f(eVar5);
            if (hVarF8 != null) {
                s.a(hVar2, hVarF8, this.f53696b.V[2].getMargin());
                b(hVar, hVar2, 1, iVar);
                if (this.f53696b.hasBaseline()) {
                    b(hVar3, hVar2, 1, this.f53680l);
                }
                if (this.f53698d == fVar3 && this.f53696b.getDimensionRatio() > 0.0f) {
                    n nVar = this.f53696b.f51777d;
                    if (nVar.f53698d == fVar3) {
                        nVar.f53699e.f53672k.add(iVar);
                        arrayList2.add(this.f53696b.f51777d.f53699e);
                        iVar.f53662a = this;
                    }
                }
            }
        } else {
            d3.e eVar7 = eVarArr2[3];
            if (eVar7.f51762f != null) {
                h hVarF9 = s.f(eVar7);
                if (hVarF9 != null) {
                    s.a(hVar, hVarF9, -this.f53696b.V[3].getMargin());
                    b(hVar2, hVar, -1, iVar);
                    if (this.f53696b.hasBaseline()) {
                        b(hVar3, hVar2, 1, this.f53680l);
                    }
                }
            } else {
                d3.e eVar8 = eVarArr2[4];
                if (eVar8.f51762f != null) {
                    h hVarF10 = s.f(eVar8);
                    if (hVarF10 != null) {
                        s.a(hVar3, hVarF10, 0);
                        b(hVar2, hVar3, -1, this.f53680l);
                        b(hVar, hVar2, 1, iVar);
                    }
                } else if (!(gVar5 instanceof d3.l) && gVar5.getParent() != null) {
                    s.a(hVar2, this.f53696b.getParent().f51779e.f53702h, this.f53696b.getY());
                    b(hVar, hVar2, 1, iVar);
                    if (this.f53696b.hasBaseline()) {
                        b(hVar3, hVar2, 1, this.f53680l);
                    }
                    if (this.f53698d == fVar3 && this.f53696b.getDimensionRatio() > 0.0f) {
                        n nVar2 = this.f53696b.f51777d;
                        if (nVar2.f53698d == fVar3) {
                            nVar2.f53699e.f53672k.add(iVar);
                            arrayList2.add(this.f53696b.f51777d.f53699e);
                            iVar.f53662a = this;
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            iVar.f53664c = true;
        }
    }

    @Override // e3.s
    public final void d() {
        this.f53697c = null;
        this.f53702h.clear();
        this.f53703i.clear();
        this.f53679k.clear();
        this.f53699e.clear();
        this.f53701g = false;
    }

    @Override // e3.s
    public final boolean h() {
        return this.f53698d != d3.f.f51768e || this.f53696b.f51811u == 0;
    }

    public final void j() {
        this.f53701g = false;
        h hVar = this.f53702h;
        hVar.clear();
        hVar.f53671j = false;
        h hVar2 = this.f53703i;
        hVar2.clear();
        hVar2.f53671j = false;
        h hVar3 = this.f53679k;
        hVar3.clear();
        hVar3.f53671j = false;
        this.f53699e.f53671j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f53696b.getDebugName();
    }

    @Override // e3.s, e3.e
    public void update(e eVar) {
        float f10;
        float dimensionRatio;
        int dimensionRatio2;
        if (b3.h.c(this.f53704j) == 3) {
            d3.g gVar = this.f53696b;
            i(gVar.O, gVar.Q, 1);
            return;
        }
        i iVar = this.f53699e;
        boolean z10 = iVar.f53664c;
        d3.f fVar = d3.f.f51768e;
        if (z10 && !iVar.f53671j && this.f53698d == fVar) {
            d3.g gVar2 = this.f53696b;
            int i10 = gVar2.f51811u;
            if (i10 == 2) {
                d3.g parent = gVar2.getParent();
                if (parent != null) {
                    if (parent.f51779e.f53699e.f53671j) {
                        iVar.resolve((int) ((r1.f53668g * this.f53696b.B) + 0.5f));
                    }
                }
            } else if (i10 == 3 && gVar2.f51777d.f53699e.f53671j) {
                int dimensionRatioSide = gVar2.getDimensionRatioSide();
                if (dimensionRatioSide != -1) {
                    if (dimensionRatioSide == 0) {
                        dimensionRatio2 = (int) ((this.f53696b.getDimensionRatio() * r1.f51777d.f53699e.f53668g) + 0.5f);
                    } else if (dimensionRatioSide != 1) {
                        dimensionRatio2 = 0;
                    } else {
                        d3.g gVar3 = this.f53696b;
                        f10 = gVar3.f51777d.f53699e.f53668g;
                        dimensionRatio = gVar3.getDimensionRatio();
                    }
                    iVar.resolve(dimensionRatio2);
                } else {
                    d3.g gVar4 = this.f53696b;
                    f10 = gVar4.f51777d.f53699e.f53668g;
                    dimensionRatio = gVar4.getDimensionRatio();
                }
                dimensionRatio2 = (int) ((f10 / dimensionRatio) + 0.5f);
                iVar.resolve(dimensionRatio2);
            }
        }
        h hVar = this.f53702h;
        boolean z11 = hVar.f53664c;
        ArrayList arrayList = hVar.f53673l;
        if (z11) {
            h hVar2 = this.f53703i;
            boolean z12 = hVar2.f53664c;
            ArrayList arrayList2 = hVar2.f53673l;
            if (z12) {
                if (hVar.f53671j && hVar2.f53671j && iVar.f53671j) {
                    return;
                }
                if (!iVar.f53671j && this.f53698d == fVar) {
                    d3.g gVar5 = this.f53696b;
                    if (gVar5.f51809t == 0 && !gVar5.isInVerticalChain()) {
                        h hVar3 = (h) arrayList.get(0);
                        h hVar4 = (h) arrayList2.get(0);
                        int i11 = hVar3.f53668g + hVar.f53667f;
                        int i12 = hVar4.f53668g + hVar2.f53667f;
                        hVar.resolve(i11);
                        hVar2.resolve(i12);
                        iVar.resolve(i12 - i11);
                        return;
                    }
                }
                if (!iVar.f53671j && this.f53698d == fVar && this.f53695a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    h hVar5 = (h) arrayList.get(0);
                    int i13 = (((h) arrayList2.get(0)).f53668g + hVar2.f53667f) - (hVar5.f53668g + hVar.f53667f);
                    int i14 = iVar.f53674m;
                    if (i13 < i14) {
                        iVar.resolve(i13);
                    } else {
                        iVar.resolve(i14);
                    }
                }
                if (iVar.f53671j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    h hVar6 = (h) arrayList.get(0);
                    h hVar7 = (h) arrayList2.get(0);
                    int i15 = hVar6.f53668g + hVar.f53667f;
                    int i16 = hVar7.f53668g + hVar2.f53667f;
                    float verticalBiasPercent = this.f53696b.getVerticalBiasPercent();
                    if (hVar6 == hVar7) {
                        i15 = hVar6.f53668g;
                        i16 = hVar7.f53668g;
                        verticalBiasPercent = 0.5f;
                    }
                    hVar.resolve((int) ((((i16 - i15) - iVar.f53668g) * verticalBiasPercent) + i15 + 0.5f));
                    hVar2.resolve(hVar.f53668g + iVar.f53668g);
                }
            }
        }
    }
}
