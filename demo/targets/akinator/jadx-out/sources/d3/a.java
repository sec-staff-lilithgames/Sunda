package d3;

import j1.o2;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a extends m {
    public int E0 = 0;
    public boolean F0 = true;
    public int G0 = 0;
    public boolean H0 = false;

    public a() {
    }

    @Override // d3.g
    public void addToSolver(x2.f fVar, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        e[] eVarArr = this.V;
        e eVar = this.N;
        eVarArr[0] = eVar;
        e eVar2 = this.O;
        eVarArr[2] = eVar2;
        e eVar3 = this.P;
        eVarArr[1] = eVar3;
        e eVar4 = this.Q;
        eVarArr[3] = eVar4;
        for (e eVar5 : eVarArr) {
            eVar5.f51765i = fVar.createObjectVariable(eVar5);
        }
        int i12 = this.E0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        e eVar6 = eVarArr[i12];
        if (!this.H0) {
            allSolved();
        }
        if (this.H0) {
            this.H0 = false;
            int i13 = this.E0;
            if (i13 == 0 || i13 == 1) {
                fVar.addEquality(eVar.f51765i, this.f51780e0);
                fVar.addEquality(eVar3.f51765i, this.f51780e0);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    fVar.addEquality(eVar2.f51765i, this.f51782f0);
                    fVar.addEquality(eVar4.f51765i, this.f51782f0);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.D0; i14++) {
            g gVar = this.C0[i14];
            if (this.F0 || gVar.allowedInBarrier()) {
                int i15 = this.E0;
                f fVar2 = f.f51768e;
                if (((i15 == 0 || i15 == 1) && gVar.getHorizontalDimensionBehaviour() == fVar2 && gVar.N.f51762f != null && gVar.P.f51762f != null) || (((i11 = this.E0) == 2 || i11 == 3) && gVar.getVerticalDimensionBehaviour() == fVar2 && gVar.O.f51762f != null && gVar.Q.f51762f != null)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = eVar.hasCenteredDependents() || eVar3.hasCenteredDependents();
        boolean z13 = eVar2.hasCenteredDependents() || eVar4.hasCenteredDependents();
        int i16 = !(!z11 && (((i10 = this.E0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.D0; i17++) {
            g gVar2 = this.C0[i17];
            if (this.F0 || gVar2.allowedInBarrier()) {
                x2.n nVarCreateObjectVariable = fVar.createObjectVariable(gVar2.V[this.E0]);
                e[] eVarArr2 = gVar2.V;
                int i18 = this.E0;
                e eVar7 = eVarArr2[i18];
                eVar7.f51765i = nVarCreateObjectVariable;
                e eVar8 = eVar7.f51762f;
                int i19 = (eVar8 == null || eVar8.f51760d != this) ? 0 : eVar7.f51763g;
                if (i18 == 0 || i18 == 2) {
                    fVar.addLowerBarrier(eVar6.f51765i, nVarCreateObjectVariable, this.G0 - i19, z11);
                } else {
                    fVar.addGreaterBarrier(eVar6.f51765i, nVarCreateObjectVariable, this.G0 + i19, z11);
                }
                fVar.addEquality(eVar6.f51765i, nVarCreateObjectVariable, this.G0 + i19, i16);
            }
        }
        int i20 = this.E0;
        if (i20 == 0) {
            fVar.addEquality(eVar3.f51765i, eVar.f51765i, 0, 8);
            fVar.addEquality(eVar.f51765i, this.Z.P.f51765i, 0, 4);
            fVar.addEquality(eVar.f51765i, this.Z.N.f51765i, 0, 0);
            return;
        }
        if (i20 == 1) {
            fVar.addEquality(eVar.f51765i, eVar3.f51765i, 0, 8);
            fVar.addEquality(eVar.f51765i, this.Z.N.f51765i, 0, 4);
            fVar.addEquality(eVar.f51765i, this.Z.P.f51765i, 0, 0);
        } else if (i20 == 2) {
            fVar.addEquality(eVar4.f51765i, eVar2.f51765i, 0, 8);
            fVar.addEquality(eVar2.f51765i, this.Z.Q.f51765i, 0, 4);
            fVar.addEquality(eVar2.f51765i, this.Z.O.f51765i, 0, 0);
        } else if (i20 == 3) {
            fVar.addEquality(eVar2.f51765i, eVar4.f51765i, 0, 8);
            fVar.addEquality(eVar2.f51765i, this.Z.O.f51765i, 0, 4);
            fVar.addEquality(eVar2.f51765i, this.Z.Q.f51765i, 0, 0);
        }
    }

    public boolean allSolved() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.D0;
            if (i13 >= i10) {
                break;
            }
            g gVar = this.C0[i13];
            if ((this.F0 || gVar.allowedInBarrier()) && ((((i11 = this.E0) == 0 || i11 == 1) && !gVar.isResolvedHorizontally()) || (((i12 = this.E0) == 2 || i12 == 3) && !gVar.isResolvedVertically()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.D0; i14++) {
            g gVar2 = this.C0[i14];
            if (this.F0 || gVar2.allowedInBarrier()) {
                d dVar = d.f51751f;
                d dVar2 = d.f51749c;
                d dVar3 = d.f51750e;
                d dVar4 = d.f51748b;
                if (!z11) {
                    int i15 = this.E0;
                    if (i15 == 0) {
                        iMax = gVar2.getAnchor(dVar4).getFinalValue();
                    } else if (i15 == 1) {
                        iMax = gVar2.getAnchor(dVar3).getFinalValue();
                    } else if (i15 == 2) {
                        iMax = gVar2.getAnchor(dVar2).getFinalValue();
                    } else if (i15 == 3) {
                        iMax = gVar2.getAnchor(dVar).getFinalValue();
                    }
                    z11 = true;
                }
                int i16 = this.E0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, gVar2.getAnchor(dVar4).getFinalValue());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, gVar2.getAnchor(dVar3).getFinalValue());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, gVar2.getAnchor(dVar2).getFinalValue());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, gVar2.getAnchor(dVar).getFinalValue());
                }
            }
        }
        int i17 = iMax + this.G0;
        int i18 = this.E0;
        if (i18 == 0 || i18 == 1) {
            setFinalHorizontal(i17, i17);
        } else {
            setFinalVertical(i17, i17);
        }
        this.H0 = true;
        return true;
    }

    @Override // d3.g
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.F0;
    }

    @Override // d3.m, d3.g
    public void copy(g gVar, HashMap<g, g> map) {
        super.copy(gVar, map);
        a aVar = (a) gVar;
        this.E0 = aVar.E0;
        this.F0 = aVar.F0;
        this.G0 = aVar.G0;
    }

    public boolean getAllowsGoneWidget() {
        return this.F0;
    }

    public int getBarrierType() {
        return this.E0;
    }

    public int getMargin() {
        return this.G0;
    }

    public int getOrientation() {
        int i10 = this.E0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // d3.g
    public boolean isResolvedHorizontally() {
        return this.H0;
    }

    @Override // d3.g
    public boolean isResolvedVertically() {
        return this.H0;
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.F0 = z10;
    }

    public void setBarrierType(int i10) {
        this.E0 = i10;
    }

    public void setMargin(int i10) {
        this.G0 = i10;
    }

    @Override // d3.g
    public String toString() {
        String string = "[Barrier] " + getDebugName() + " {";
        for (int i10 = 0; i10 < this.D0; i10++) {
            g gVar = this.C0[i10];
            if (i10 > 0) {
                string = o2.l(string, ", ");
            }
            StringBuilder sbU = p0.o2.u(string);
            sbU.append(gVar.getDebugName());
            string = sbU.toString();
        }
        return o2.l(string, "}");
    }

    public a(String str) {
        setDebugName(str);
    }
}
