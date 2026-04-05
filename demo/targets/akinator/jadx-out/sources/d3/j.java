package d3;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j extends p {

    /* renamed from: m1, reason: collision with root package name */
    public g[] f51853m1;
    public int P0 = -1;
    public int Q0 = -1;
    public int R0 = -1;
    public int S0 = -1;
    public int T0 = -1;
    public int U0 = -1;
    public float V0 = 0.5f;
    public float W0 = 0.5f;
    public float X0 = 0.5f;
    public float Y0 = 0.5f;
    public float Z0 = 0.5f;

    /* renamed from: a1, reason: collision with root package name */
    public float f51841a1 = 0.5f;

    /* renamed from: b1, reason: collision with root package name */
    public int f51842b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    public int f51843c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public int f51844d1 = 2;

    /* renamed from: e1, reason: collision with root package name */
    public int f51845e1 = 2;

    /* renamed from: f1, reason: collision with root package name */
    public int f51846f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public int f51847g1 = -1;

    /* renamed from: h1, reason: collision with root package name */
    public int f51848h1 = 0;

    /* renamed from: i1, reason: collision with root package name */
    public final ArrayList f51849i1 = new ArrayList();

    /* renamed from: j1, reason: collision with root package name */
    public g[] f51850j1 = null;

    /* renamed from: k1, reason: collision with root package name */
    public g[] f51851k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    public int[] f51852l1 = null;

    /* renamed from: n1, reason: collision with root package name */
    public int f51854n1 = 0;

    @Override // d3.g
    public void addToSolver(x2.f fVar, boolean z10) {
        g gVar;
        float f10;
        int i10;
        super.addToSolver(fVar, z10);
        boolean z11 = getParent() != null && ((h) getParent()).isRtl();
        int i11 = this.f51846f1;
        ArrayList arrayList = this.f51849i1;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((i) arrayList.get(i12)).createConstraints(z11, i12, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ((i) arrayList.get(i13)).createConstraints(z11, i13, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.f51852l1 != null && this.f51851k1 != null && this.f51850j1 != null) {
                for (int i14 = 0; i14 < this.f51854n1; i14++) {
                    this.f51853m1[i14].resetAnchors();
                }
                int[] iArr = this.f51852l1;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.V0;
                g gVar2 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z11) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.V0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    g gVar3 = this.f51851k1[i10];
                    if (gVar3 != null) {
                        e eVar = gVar3.N;
                        if (gVar3.getVisibility() != 8) {
                            if (i17 == 0) {
                                gVar3.connect(eVar, this.N, getPaddingLeft());
                                gVar3.setHorizontalChainStyle(this.P0);
                                gVar3.setHorizontalBiasPercent(f10);
                            }
                            if (i17 == i15 - 1) {
                                gVar3.connect(gVar3.P, this.P, getPaddingRight());
                            }
                            if (i17 > 0 && gVar2 != null) {
                                e eVar2 = gVar2.P;
                                gVar3.connect(eVar, eVar2, this.f51842b1);
                                gVar2.connect(eVar2, eVar, 0);
                            }
                            gVar2 = gVar3;
                        }
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i16; i18++) {
                    g gVar4 = this.f51850j1[i18];
                    if (gVar4 != null) {
                        e eVar3 = gVar4.O;
                        if (gVar4.getVisibility() != 8) {
                            if (i18 == 0) {
                                gVar4.connect(eVar3, this.O, getPaddingTop());
                                gVar4.setVerticalChainStyle(this.Q0);
                                gVar4.setVerticalBiasPercent(this.W0);
                            }
                            if (i18 == i16 - 1) {
                                gVar4.connect(gVar4.Q, this.Q, getPaddingBottom());
                            }
                            if (i18 > 0 && gVar2 != null) {
                                e eVar4 = gVar2.Q;
                                gVar4.connect(eVar3, eVar4, this.f51843c1);
                                gVar2.connect(eVar4, eVar3, 0);
                            }
                            gVar2 = gVar4;
                        }
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    for (int i20 = 0; i20 < i16; i20++) {
                        int i21 = (i20 * i15) + i19;
                        if (this.f51848h1 == 1) {
                            i21 = (i19 * i16) + i20;
                        }
                        g[] gVarArr = this.f51853m1;
                        if (i21 < gVarArr.length && (gVar = gVarArr[i21]) != null && gVar.getVisibility() != 8) {
                            g gVar5 = this.f51851k1[i19];
                            g gVar6 = this.f51850j1[i20];
                            if (gVar != gVar5) {
                                gVar.connect(gVar.N, gVar5.N, 0);
                                gVar.connect(gVar.P, gVar5.P, 0);
                            }
                            if (gVar != gVar6) {
                                gVar.connect(gVar.O, gVar6.O, 0);
                                gVar.connect(gVar.Q, gVar6.Q, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((i) arrayList.get(0)).createConstraints(z11, 0, true);
        }
        this.K0 = false;
    }

    @Override // d3.m, d3.g
    public void copy(g gVar, HashMap<g, g> map) {
        super.copy(gVar, map);
        j jVar = (j) gVar;
        this.P0 = jVar.P0;
        this.Q0 = jVar.Q0;
        this.R0 = jVar.R0;
        this.S0 = jVar.S0;
        this.T0 = jVar.T0;
        this.U0 = jVar.U0;
        this.V0 = jVar.V0;
        this.W0 = jVar.W0;
        this.X0 = jVar.X0;
        this.Y0 = jVar.Y0;
        this.Z0 = jVar.Z0;
        this.f51841a1 = jVar.f51841a1;
        this.f51842b1 = jVar.f51842b1;
        this.f51843c1 = jVar.f51843c1;
        this.f51844d1 = jVar.f51844d1;
        this.f51845e1 = jVar.f51845e1;
        this.f51846f1 = jVar.f51846f1;
        this.f51847g1 = jVar.f51847g1;
        this.f51848h1 = jVar.f51848h1;
    }

    public float getMaxElementsWrap() {
        return this.f51847g1;
    }

    public final int l(g gVar, int i10) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.getVerticalDimensionBehaviour() == f.f51768e) {
            int i11 = gVar.f51811u;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (gVar.B * i10);
                if (i12 != gVar.getHeight()) {
                    gVar.setMeasureRequested(true);
                    k(gVar, gVar.getHorizontalDimensionBehaviour(), gVar.getWidth(), f.f51766b, i12);
                }
                return i12;
            }
            gVar2 = gVar;
            if (i11 == 1) {
                return gVar2.getHeight();
            }
            if (i11 == 3) {
                return (int) ((gVar2.getWidth() * gVar2.f51776c0) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.getHeight();
    }

    public final int m(g gVar, int i10) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.getHorizontalDimensionBehaviour() == f.f51768e) {
            int i11 = gVar.f51809t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (gVar.f51819y * i10);
                if (i12 != gVar.getWidth()) {
                    gVar.setMeasureRequested(true);
                    k(gVar, f.f51766b, i12, gVar.getVerticalDimensionBehaviour(), gVar.getHeight());
                }
                return i12;
            }
            gVar2 = gVar;
            if (i11 == 1) {
                return gVar2.getWidth();
            }
            if (i11 == 3) {
                return (int) ((gVar2.getHeight() * gVar2.f51776c0) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    @Override // d3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.j.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f10) {
        this.X0 = f10;
    }

    public void setFirstHorizontalStyle(int i10) {
        this.R0 = i10;
    }

    public void setFirstVerticalBias(float f10) {
        this.Y0 = f10;
    }

    public void setFirstVerticalStyle(int i10) {
        this.S0 = i10;
    }

    public void setHorizontalAlign(int i10) {
        this.f51844d1 = i10;
    }

    public void setHorizontalBias(float f10) {
        this.V0 = f10;
    }

    public void setHorizontalGap(int i10) {
        this.f51842b1 = i10;
    }

    public void setHorizontalStyle(int i10) {
        this.P0 = i10;
    }

    public void setLastHorizontalBias(float f10) {
        this.Z0 = f10;
    }

    public void setLastHorizontalStyle(int i10) {
        this.T0 = i10;
    }

    public void setLastVerticalBias(float f10) {
        this.f51841a1 = f10;
    }

    public void setLastVerticalStyle(int i10) {
        this.U0 = i10;
    }

    public void setMaxElementsWrap(int i10) {
        this.f51847g1 = i10;
    }

    public void setOrientation(int i10) {
        this.f51848h1 = i10;
    }

    public void setVerticalAlign(int i10) {
        this.f51845e1 = i10;
    }

    public void setVerticalBias(float f10) {
        this.W0 = f10;
    }

    public void setVerticalGap(int i10) {
        this.f51843c1 = i10;
    }

    public void setVerticalStyle(int i10) {
        this.Q0 = i10;
    }

    public void setWrapMode(int i10) {
        this.f51846f1 = i10;
    }
}
