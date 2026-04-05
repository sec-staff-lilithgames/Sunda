package d3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f51823a;

    /* renamed from: d, reason: collision with root package name */
    public e f51826d;

    /* renamed from: e, reason: collision with root package name */
    public e f51827e;

    /* renamed from: f, reason: collision with root package name */
    public e f51828f;

    /* renamed from: g, reason: collision with root package name */
    public e f51829g;

    /* renamed from: h, reason: collision with root package name */
    public int f51830h;

    /* renamed from: i, reason: collision with root package name */
    public int f51831i;

    /* renamed from: j, reason: collision with root package name */
    public int f51832j;

    /* renamed from: k, reason: collision with root package name */
    public int f51833k;

    /* renamed from: q, reason: collision with root package name */
    public int f51839q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f51840r;

    /* renamed from: b, reason: collision with root package name */
    public g f51824b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f51825c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f51834l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f51835m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f51836n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f51837o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f51838p = 0;

    public i(j jVar, int i10, e eVar, e eVar2, e eVar3, e eVar4, int i11) {
        this.f51840r = jVar;
        this.f51830h = 0;
        this.f51831i = 0;
        this.f51832j = 0;
        this.f51833k = 0;
        this.f51839q = 0;
        this.f51823a = i10;
        this.f51826d = eVar;
        this.f51827e = eVar2;
        this.f51828f = eVar3;
        this.f51829g = eVar4;
        this.f51830h = jVar.getPaddingLeft();
        this.f51831i = jVar.getPaddingTop();
        this.f51832j = jVar.getPaddingRight();
        this.f51833k = jVar.getPaddingBottom();
        this.f51839q = i11;
    }

    public void add(g gVar) {
        int i10 = this.f51823a;
        f fVar = f.f51768e;
        j jVar = this.f51840r;
        if (i10 == 0) {
            int iM = jVar.m(gVar, this.f51839q);
            if (gVar.getHorizontalDimensionBehaviour() == fVar) {
                this.f51838p++;
                iM = 0;
            }
            this.f51834l = iM + (gVar.getVisibility() != 8 ? jVar.f51842b1 : 0) + this.f51834l;
            int iL = jVar.l(gVar, this.f51839q);
            if (this.f51824b == null || this.f51825c < iL) {
                this.f51824b = gVar;
                this.f51825c = iL;
                this.f51835m = iL;
            }
        } else {
            int iM2 = jVar.m(gVar, this.f51839q);
            int iL2 = jVar.l(gVar, this.f51839q);
            if (gVar.getVerticalDimensionBehaviour() == fVar) {
                this.f51838p++;
                iL2 = 0;
            }
            this.f51835m = iL2 + (gVar.getVisibility() != 8 ? jVar.f51843c1 : 0) + this.f51835m;
            if (this.f51824b == null || this.f51825c < iM2) {
                this.f51824b = gVar;
                this.f51825c = iM2;
                this.f51834l = iM2;
            }
        }
        this.f51837o++;
    }

    public void clear() {
        this.f51825c = 0;
        this.f51824b = null;
        this.f51834l = 0;
        this.f51835m = 0;
        this.f51836n = 0;
        this.f51837o = 0;
        this.f51838p = 0;
    }

    public void createConstraints(boolean z10, int i10, boolean z11) {
        j jVar;
        int i11;
        int i12;
        g gVar;
        boolean z12;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        float f12;
        int i16;
        float f13;
        float f14;
        int i17 = this.f51837o;
        int i18 = 0;
        while (true) {
            jVar = this.f51840r;
            if (i18 >= i17) {
                break;
            }
            int i19 = this.f51836n;
            if (i19 + i18 >= jVar.f51854n1) {
                break;
            }
            g gVar2 = jVar.f51853m1[i19 + i18];
            if (gVar2 != null) {
                gVar2.resetAnchors();
            }
            i18++;
        }
        if (i17 == 0 || this.f51824b == null) {
            return;
        }
        boolean z13 = z11 && i10 == 0;
        int i20 = -1;
        int i21 = -1;
        for (int i22 = 0; i22 < i17; i22++) {
            int i23 = z10 ? (i17 - 1) - i22 : i22;
            int i24 = this.f51836n;
            if (i24 + i23 >= jVar.f51854n1) {
                break;
            }
            g gVar3 = jVar.f51853m1[i24 + i23];
            if (gVar3 != null && gVar3.getVisibility() == 0) {
                if (i20 == -1) {
                    i20 = i22;
                }
                i21 = i22;
            }
        }
        if (this.f51823a == 0) {
            g gVar4 = this.f51824b;
            gVar4.setVerticalChainStyle(jVar.Q0);
            e eVar = gVar4.Q;
            e eVar2 = gVar4.O;
            int i25 = this.f51831i;
            if (i10 > 0) {
                i25 += jVar.f51843c1;
            }
            eVar2.connect(this.f51827e, i25);
            if (z11) {
                eVar.connect(this.f51829g, this.f51833k);
            }
            if (i10 > 0) {
                this.f51827e.f51760d.Q.connect(eVar2, 0);
            }
            if (jVar.f51845e1 != 3 || gVar4.hasBaseline()) {
                i12 = 1;
                gVar = gVar4;
            } else {
                for (int i26 = 0; i26 < i17; i26++) {
                    int i27 = z10 ? (i17 - 1) - i26 : i26;
                    int i28 = this.f51836n;
                    i12 = 1;
                    if (i28 + i27 >= jVar.f51854n1) {
                        break;
                    }
                    gVar = jVar.f51853m1[i28 + i27];
                    if (gVar.hasBaseline()) {
                        break;
                    }
                }
                i12 = 1;
                gVar = gVar4;
            }
            int i29 = 0;
            g gVar5 = null;
            while (i29 < i17) {
                int i30 = z10 ? (i17 - 1) - i29 : i29;
                int i31 = this.f51836n;
                if (i31 + i30 >= jVar.f51854n1) {
                    return;
                }
                g gVar6 = jVar.f51853m1[i31 + i30];
                if (gVar6 == null) {
                    i15 = i17;
                    z12 = z13;
                    i13 = i21;
                } else {
                    e eVar3 = gVar6.Q;
                    e eVar4 = gVar6.O;
                    z12 = z13;
                    e eVar5 = gVar6.N;
                    i13 = i21;
                    if (i29 == 0) {
                        i14 = i30;
                        gVar6.connect(eVar5, this.f51826d, this.f51830h);
                    } else {
                        i14 = i30;
                    }
                    if (i14 == 0) {
                        int i32 = jVar.P0;
                        if (z10) {
                            f10 = 1.0f;
                            f11 = 1.0f - jVar.V0;
                        } else {
                            f10 = 1.0f;
                            f11 = jVar.V0;
                        }
                        if (this.f51836n == 0) {
                            i16 = jVar.R0;
                            f12 = f11;
                            if (i16 != -1) {
                                if (z10) {
                                    f14 = jVar.X0;
                                    f13 = f10 - f14;
                                    gVar6.setHorizontalChainStyle(i16);
                                    gVar6.setHorizontalBiasPercent(f13);
                                } else {
                                    f13 = jVar.X0;
                                    gVar6.setHorizontalChainStyle(i16);
                                    gVar6.setHorizontalBiasPercent(f13);
                                }
                            }
                        } else {
                            f12 = f11;
                        }
                        if (!z11 || (i16 = jVar.T0) == -1) {
                            i16 = i32;
                            f13 = f12;
                        } else if (z10) {
                            f14 = jVar.Z0;
                            f13 = f10 - f14;
                        } else {
                            f13 = jVar.Z0;
                        }
                        gVar6.setHorizontalChainStyle(i16);
                        gVar6.setHorizontalBiasPercent(f13);
                    }
                    if (i29 == i17 - 1) {
                        i15 = i17;
                        gVar6.connect(gVar6.P, this.f51828f, this.f51832j);
                    } else {
                        i15 = i17;
                    }
                    if (gVar5 != null) {
                        e eVar6 = gVar5.P;
                        eVar5.connect(eVar6, jVar.f51842b1);
                        if (i29 == i20) {
                            eVar5.setGoneMargin(this.f51830h);
                        }
                        eVar6.connect(eVar5, 0);
                        if (i29 == i13 + 1) {
                            eVar6.setGoneMargin(this.f51832j);
                        }
                    }
                    if (gVar6 != gVar4) {
                        if (jVar.f51845e1 == 3 && gVar.hasBaseline() && gVar6 != gVar && gVar6.hasBaseline()) {
                            gVar6.R.connect(gVar.R, 0);
                        } else {
                            int i33 = jVar.f51845e1;
                            if (i33 == 0) {
                                eVar4.connect(eVar2, 0);
                            } else if (i33 == i12) {
                                eVar3.connect(eVar, 0);
                            } else if (z12) {
                                eVar4.connect(this.f51827e, this.f51831i);
                                eVar3.connect(this.f51829g, this.f51833k);
                            } else {
                                eVar4.connect(eVar2, 0);
                                eVar3.connect(eVar, 0);
                            }
                        }
                    }
                    gVar5 = gVar6;
                }
                i29++;
                z13 = z12;
                i21 = i13;
                i17 = i15;
                i12 = 1;
            }
            return;
        }
        int i34 = i17;
        boolean z14 = z13;
        int i35 = i21;
        g gVar7 = this.f51824b;
        gVar7.setHorizontalChainStyle(jVar.P0);
        e eVar7 = gVar7.N;
        e eVar8 = gVar7.P;
        int i36 = this.f51830h;
        if (i10 > 0) {
            i36 += jVar.f51842b1;
        }
        if (z10) {
            eVar8.connect(this.f51828f, i36);
            if (z11) {
                eVar7.connect(this.f51826d, this.f51832j);
            }
            if (i10 > 0) {
                this.f51828f.f51760d.N.connect(eVar8, 0);
            }
        } else {
            eVar7.connect(this.f51826d, i36);
            if (z11) {
                eVar8.connect(this.f51828f, this.f51832j);
            }
            if (i10 > 0) {
                this.f51826d.f51760d.P.connect(eVar7, 0);
            }
        }
        int i37 = 0;
        g gVar8 = null;
        while (true) {
            int i38 = i34;
            if (i37 >= i38) {
                return;
            }
            int i39 = this.f51836n;
            if (i39 + i37 >= jVar.f51854n1) {
                return;
            }
            g gVar9 = jVar.f51853m1[i39 + i37];
            if (gVar9 == null) {
                i34 = i38;
            } else {
                e eVar9 = gVar9.O;
                e eVar10 = gVar9.P;
                e eVar11 = gVar9.N;
                if (i37 == 0) {
                    gVar9.connect(eVar9, this.f51827e, this.f51831i);
                    int i40 = jVar.Q0;
                    float f15 = jVar.W0;
                    if (this.f51836n == 0) {
                        int i41 = jVar.S0;
                        i34 = i38;
                        i11 = -1;
                        if (i41 != -1) {
                            f15 = jVar.Y0;
                        }
                        i40 = i41;
                        gVar9.setVerticalChainStyle(i40);
                        gVar9.setVerticalBiasPercent(f15);
                    } else {
                        i34 = i38;
                        i11 = -1;
                    }
                    if (z11 && (i41 = jVar.U0) != i11) {
                        f15 = jVar.f51841a1;
                        i40 = i41;
                    }
                    gVar9.setVerticalChainStyle(i40);
                    gVar9.setVerticalBiasPercent(f15);
                } else {
                    i34 = i38;
                }
                if (i37 == i34 - 1) {
                    gVar9.connect(gVar9.Q, this.f51829g, this.f51833k);
                }
                if (gVar8 != null) {
                    e eVar12 = gVar8.Q;
                    eVar9.connect(eVar12, jVar.f51843c1);
                    if (i37 == i20) {
                        eVar9.setGoneMargin(this.f51831i);
                    }
                    eVar12.connect(eVar9, 0);
                    if (i37 == i35 + 1) {
                        eVar12.setGoneMargin(this.f51833k);
                    }
                }
                if (gVar9 == gVar7) {
                    gVar8 = gVar9;
                } else if (z10) {
                    int i42 = jVar.f51844d1;
                    if (i42 == 0) {
                        eVar10.connect(eVar8, 0);
                    } else if (i42 == 1) {
                        eVar11.connect(eVar7, 0);
                    } else if (i42 == 2) {
                        eVar11.connect(eVar7, 0);
                        eVar10.connect(eVar8, 0);
                    }
                    gVar8 = gVar9;
                } else {
                    int i43 = jVar.f51844d1;
                    if (i43 == 0) {
                        eVar11.connect(eVar7, 0);
                    } else if (i43 == 1) {
                        eVar10.connect(eVar8, 0);
                    } else if (i43 == 2) {
                        if (z14) {
                            eVar11.connect(this.f51826d, this.f51830h);
                            eVar10.connect(this.f51828f, this.f51832j);
                        } else {
                            eVar11.connect(eVar7, 0);
                            eVar10.connect(eVar8, 0);
                        }
                    }
                    gVar8 = gVar9;
                }
            }
            i37++;
        }
    }

    public int getHeight() {
        return this.f51823a == 1 ? this.f51835m - this.f51840r.f51843c1 : this.f51835m;
    }

    public int getWidth() {
        return this.f51823a == 0 ? this.f51834l - this.f51840r.f51842b1 : this.f51834l;
    }

    public void measureMatchConstraints(int i10) {
        j jVar;
        int i11 = this.f51838p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f51837o;
        int i13 = i10 / i11;
        int i14 = 0;
        while (true) {
            jVar = this.f51840r;
            if (i14 >= i12) {
                break;
            }
            int i15 = this.f51836n;
            if (i15 + i14 >= jVar.f51854n1) {
                break;
            }
            g gVar = jVar.f51853m1[i15 + i14];
            int i16 = this.f51823a;
            f fVar = f.f51766b;
            f fVar2 = f.f51768e;
            if (i16 == 0) {
                if (gVar != null && gVar.getHorizontalDimensionBehaviour() == fVar2 && gVar.f51809t == 0) {
                    this.f51840r.k(gVar, fVar, i13, gVar.getVerticalDimensionBehaviour(), gVar.getHeight());
                }
            } else if (gVar != null && gVar.getVerticalDimensionBehaviour() == fVar2 && gVar.f51811u == 0) {
                int i17 = i13;
                this.f51840r.k(gVar, gVar.getHorizontalDimensionBehaviour(), gVar.getWidth(), fVar, i17);
                i13 = i17;
            }
            i14++;
        }
        this.f51834l = 0;
        this.f51835m = 0;
        this.f51824b = null;
        this.f51825c = 0;
        int i18 = this.f51837o;
        for (int i19 = 0; i19 < i18; i19++) {
            int i20 = this.f51836n + i19;
            if (i20 >= jVar.f51854n1) {
                return;
            }
            g gVar2 = jVar.f51853m1[i20];
            if (this.f51823a == 0) {
                int width = gVar2.getWidth();
                int i21 = jVar.f51842b1;
                if (gVar2.getVisibility() == 8) {
                    i21 = 0;
                }
                this.f51834l = width + i21 + this.f51834l;
                int iL = jVar.l(gVar2, this.f51839q);
                if (this.f51824b == null || this.f51825c < iL) {
                    this.f51824b = gVar2;
                    this.f51825c = iL;
                    this.f51835m = iL;
                }
            } else {
                int iM = jVar.m(gVar2, this.f51839q);
                int iL2 = jVar.l(gVar2, this.f51839q);
                int i22 = jVar.f51843c1;
                if (gVar2.getVisibility() == 8) {
                    i22 = 0;
                }
                this.f51835m = iL2 + i22 + this.f51835m;
                if (this.f51824b == null || this.f51825c < iM) {
                    this.f51824b = gVar2;
                    this.f51825c = iM;
                    this.f51834l = iM;
                }
            }
        }
    }

    public void setStartIndex(int i10) {
        this.f51836n = i10;
    }

    public void setup(int i10, e eVar, e eVar2, e eVar3, e eVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f51823a = i10;
        this.f51826d = eVar;
        this.f51827e = eVar2;
        this.f51828f = eVar3;
        this.f51829g = eVar4;
        this.f51830h = i11;
        this.f51831i = i12;
        this.f51832j = i13;
        this.f51833k = i14;
        this.f51839q = i15;
    }
}
