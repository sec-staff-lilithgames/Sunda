package x2;

import j1.o2;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f91477q = false;

    /* renamed from: r, reason: collision with root package name */
    public static g f91478r;

    /* renamed from: d, reason: collision with root package name */
    public final l f91482d;

    /* renamed from: m, reason: collision with root package name */
    public final d f91491m;

    /* renamed from: p, reason: collision with root package name */
    public c f91494p;

    /* renamed from: a, reason: collision with root package name */
    public int f91479a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f91480b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f91481c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f91483e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f91484f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91486h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f91487i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f91488j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f91489k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f91490l = 32;

    /* renamed from: n, reason: collision with root package name */
    public n[] f91492n = new n[1000];

    /* renamed from: o, reason: collision with root package name */
    public int f91493o = 0;

    /* renamed from: g, reason: collision with root package name */
    public c[] f91485g = new c[32];

    public f() {
        h();
        d dVar = new d();
        this.f91491m = dVar;
        this.f91482d = new l(dVar);
        this.f91494p = new c(dVar);
    }

    public static c createRowDimensionPercent(f fVar, n nVar, n nVar2, float f10) {
        c cVarCreateRow = fVar.createRow();
        cVarCreateRow.f91472d.put(nVar, -1.0f);
        cVarCreateRow.f91472d.put(nVar2, f10);
        return cVarCreateRow;
    }

    public static g getMetrics() {
        return f91478r;
    }

    public final n a(m mVar, String str) {
        n nVar = (n) this.f91491m.f91475b.acquire();
        if (nVar == null) {
            nVar = new n(mVar, str);
            nVar.setType(mVar, str);
        } else {
            nVar.reset();
            nVar.setType(mVar, str);
        }
        int i10 = this.f91493o;
        int i11 = this.f91479a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f91479a = i12;
            this.f91492n = (n[]) Arrays.copyOf(this.f91492n, i12);
        }
        n[] nVarArr = this.f91492n;
        int i13 = this.f91493o;
        this.f91493o = i13 + 1;
        nVarArr[i13] = nVar;
        return nVar;
    }

    public void addCenterPoint(d3.g gVar, d3.g gVar2, float f10, int i10) {
        d3.d dVar = d3.d.f51748b;
        n nVarCreateObjectVariable = createObjectVariable(gVar.getAnchor(dVar));
        d3.d dVar2 = d3.d.f51749c;
        n nVarCreateObjectVariable2 = createObjectVariable(gVar.getAnchor(dVar2));
        d3.d dVar3 = d3.d.f51750e;
        n nVarCreateObjectVariable3 = createObjectVariable(gVar.getAnchor(dVar3));
        d3.d dVar4 = d3.d.f51751f;
        n nVarCreateObjectVariable4 = createObjectVariable(gVar.getAnchor(dVar4));
        n nVarCreateObjectVariable5 = createObjectVariable(gVar2.getAnchor(dVar));
        n nVarCreateObjectVariable6 = createObjectVariable(gVar2.getAnchor(dVar2));
        n nVarCreateObjectVariable7 = createObjectVariable(gVar2.getAnchor(dVar3));
        n nVarCreateObjectVariable8 = createObjectVariable(gVar2.getAnchor(dVar4));
        c cVarCreateRow = createRow();
        double d10 = f10;
        double d11 = i10;
        cVarCreateRow.createRowWithAngle(nVarCreateObjectVariable2, nVarCreateObjectVariable4, nVarCreateObjectVariable6, nVarCreateObjectVariable8, (float) (Math.sin(d10) * d11));
        addConstraint(cVarCreateRow);
        c cVarCreateRow2 = createRow();
        cVarCreateRow2.createRowWithAngle(nVarCreateObjectVariable, nVarCreateObjectVariable3, nVarCreateObjectVariable5, nVarCreateObjectVariable7, (float) (Math.cos(d10) * d11));
        addConstraint(cVarCreateRow2);
    }

    public void addCentering(n nVar, n nVar2, int i10, float f10, n nVar3, n nVar4, int i11, int i12) {
        c cVarCreateRow = createRow();
        if (nVar2 == nVar3) {
            cVarCreateRow.f91472d.put(nVar, 1.0f);
            cVarCreateRow.f91472d.put(nVar4, 1.0f);
            cVarCreateRow.f91472d.put(nVar2, -2.0f);
        } else if (f10 == 0.5f) {
            cVarCreateRow.f91472d.put(nVar, 1.0f);
            cVarCreateRow.f91472d.put(nVar2, -1.0f);
            cVarCreateRow.f91472d.put(nVar3, -1.0f);
            cVarCreateRow.f91472d.put(nVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                cVarCreateRow.f91470b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            cVarCreateRow.f91472d.put(nVar, -1.0f);
            cVarCreateRow.f91472d.put(nVar2, 1.0f);
            cVarCreateRow.f91470b = i10;
        } else if (f10 >= 1.0f) {
            cVarCreateRow.f91472d.put(nVar4, -1.0f);
            cVarCreateRow.f91472d.put(nVar3, 1.0f);
            cVarCreateRow.f91470b = -i11;
        } else {
            float f11 = 1.0f - f10;
            cVarCreateRow.f91472d.put(nVar, f11 * 1.0f);
            cVarCreateRow.f91472d.put(nVar2, f11 * (-1.0f));
            cVarCreateRow.f91472d.put(nVar3, (-1.0f) * f10);
            cVarCreateRow.f91472d.put(nVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                cVarCreateRow.f91470b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            cVarCreateRow.addError(this, i12);
        }
        addConstraint(cVarCreateRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addConstraint(x2.c r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.f.addConstraint(x2.c):void");
    }

    public c addEquality(n nVar, n nVar2, int i10, int i11) {
        if (i11 == 8 && nVar2.f91523i && nVar.f91520f == -1) {
            nVar.setFinalValue(this, nVar2.f91522h + i10);
            return null;
        }
        c cVarCreateRow = createRow();
        cVarCreateRow.createRowEquals(nVar, nVar2, i10);
        if (i11 != 8) {
            cVarCreateRow.addError(this, i11);
        }
        addConstraint(cVarCreateRow);
        return cVarCreateRow;
    }

    public void addGreaterBarrier(n nVar, n nVar2, int i10, boolean z10) {
        c cVarCreateRow = createRow();
        n nVarCreateSlackVariable = createSlackVariable();
        nVarCreateSlackVariable.f91521g = 0;
        cVarCreateRow.createRowGreaterThan(nVar, nVar2, nVarCreateSlackVariable, i10);
        addConstraint(cVarCreateRow);
    }

    public void addGreaterThan(n nVar, n nVar2, int i10, int i11) {
        c cVarCreateRow = createRow();
        n nVarCreateSlackVariable = createSlackVariable();
        nVarCreateSlackVariable.f91521g = 0;
        cVarCreateRow.createRowGreaterThan(nVar, nVar2, nVarCreateSlackVariable, i10);
        if (i11 != 8) {
            cVarCreateRow.f91472d.put(createErrorVariable(i11, null), (int) (cVarCreateRow.f91472d.get(nVarCreateSlackVariable) * (-1.0f)));
        }
        addConstraint(cVarCreateRow);
    }

    public void addLowerBarrier(n nVar, n nVar2, int i10, boolean z10) {
        c cVarCreateRow = createRow();
        n nVarCreateSlackVariable = createSlackVariable();
        nVarCreateSlackVariable.f91521g = 0;
        cVarCreateRow.createRowLowerThan(nVar, nVar2, nVarCreateSlackVariable, i10);
        addConstraint(cVarCreateRow);
    }

    public void addLowerThan(n nVar, n nVar2, int i10, int i11) {
        c cVarCreateRow = createRow();
        n nVarCreateSlackVariable = createSlackVariable();
        nVarCreateSlackVariable.f91521g = 0;
        cVarCreateRow.createRowLowerThan(nVar, nVar2, nVarCreateSlackVariable, i10);
        if (i11 != 8) {
            cVarCreateRow.f91472d.put(createErrorVariable(i11, null), (int) (cVarCreateRow.f91472d.get(nVarCreateSlackVariable) * (-1.0f)));
        }
        addConstraint(cVarCreateRow);
    }

    public void addRatio(n nVar, n nVar2, n nVar3, n nVar4, float f10, int i10) {
        c cVarCreateRow = createRow();
        cVarCreateRow.createRowDimensionRatio(nVar, nVar2, nVar3, nVar4, f10);
        if (i10 != 8) {
            cVarCreateRow.addError(this, i10);
        }
        addConstraint(cVarCreateRow);
    }

    public void addSynonym(n nVar, n nVar2, int i10) {
        if (nVar.f91520f != -1 || i10 != 0) {
            addEquality(nVar, nVar2, i10, 8);
            return;
        }
        boolean z10 = nVar2.f91530p;
        d dVar = this.f91491m;
        if (z10) {
            nVar2 = dVar.f91476c[nVar2.f91531q];
        }
        if (nVar.f91530p) {
            n nVar3 = dVar.f91476c[nVar.f91531q];
        } else {
            nVar.setSynonym(this, nVar2, 0.0f);
        }
    }

    public final void b(c cVar) {
        int i10;
        if (cVar.f91473e) {
            cVar.f91469a.setFinalValue(this, cVar.f91470b);
        } else {
            c[] cVarArr = this.f91485g;
            int i11 = this.f91489k;
            cVarArr[i11] = cVar;
            n nVar = cVar.f91469a;
            nVar.f91520f = i11;
            this.f91489k = i11 + 1;
            nVar.updateReferencesWithNewDefinition(this, cVar);
        }
        if (this.f91480b) {
            int i12 = 0;
            while (i12 < this.f91489k) {
                if (this.f91485g[i12] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f91485g[i12];
                if (cVar2 != null && cVar2.f91473e) {
                    cVar2.f91469a.setFinalValue(this, cVar2.f91470b);
                    this.f91491m.f91474a.release(cVar2);
                    this.f91485g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f91489k;
                        if (i13 >= i10) {
                            break;
                        }
                        c[] cVarArr2 = this.f91485g;
                        int i15 = i13 - 1;
                        c cVar3 = cVarArr2[i13];
                        cVarArr2[i15] = cVar3;
                        n nVar2 = cVar3.f91469a;
                        if (nVar2.f91520f == i13) {
                            nVar2.f91520f = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f91485g[i14] = null;
                    }
                    this.f91489k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f91480b = false;
        }
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f91489k; i10++) {
            c cVar = this.f91485g[i10];
            cVar.f91469a.f91522h = cVar.f91470b;
        }
    }

    public n createErrorVariable(int i10, String str) {
        if (this.f91488j + 1 >= this.f91484f) {
            e();
        }
        n nVarA = a(m.f91514e, str);
        int i11 = this.f91481c + 1;
        this.f91481c = i11;
        this.f91488j++;
        nVarA.f91519e = i11;
        nVarA.f91521g = i10;
        this.f91491m.f91476c[i11] = nVarA;
        this.f91482d.addError(nVarA);
        return nVarA;
    }

    public n createExtraVariable() {
        if (this.f91488j + 1 >= this.f91484f) {
            e();
        }
        n nVarA = a(m.f91513c, null);
        int i10 = this.f91481c + 1;
        this.f91481c = i10;
        this.f91488j++;
        nVarA.f91519e = i10;
        this.f91491m.f91476c[i10] = nVarA;
        return nVarA;
    }

    public n createObjectVariable(Object obj) {
        n solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f91488j + 1 >= this.f91484f) {
            e();
        }
        if (obj instanceof d3.e) {
            d3.e eVar = (d3.e) obj;
            solverVariable = eVar.getSolverVariable();
            d dVar = this.f91491m;
            if (solverVariable == null) {
                eVar.resetSolverVariable(dVar);
                solverVariable = eVar.getSolverVariable();
            }
            int i10 = solverVariable.f91519e;
            if (i10 != -1 && i10 <= this.f91481c && dVar.f91476c[i10] != null) {
                return solverVariable;
            }
            if (i10 != -1) {
                solverVariable.reset();
            }
            int i11 = this.f91481c + 1;
            this.f91481c = i11;
            this.f91488j++;
            solverVariable.f91519e = i11;
            solverVariable.f91526l = m.f91512b;
            dVar.f91476c[i11] = solverVariable;
        }
        return solverVariable;
    }

    public c createRow() {
        d dVar = this.f91491m;
        c cVar = (c) dVar.f91474a.acquire();
        if (cVar == null) {
            return new c(dVar);
        }
        cVar.reset();
        return cVar;
    }

    public n createSlackVariable() {
        if (this.f91488j + 1 >= this.f91484f) {
            e();
        }
        n nVarA = a(m.f91513c, null);
        int i10 = this.f91481c + 1;
        this.f91481c = i10;
        this.f91488j++;
        nVarA.f91519e = i10;
        this.f91491m.f91476c[i10] = nVarA;
        return nVarA;
    }

    public final void d() {
        StringBuilder sb2 = new StringBuilder("Display Rows (");
        sb2.append(this.f91489k);
        sb2.append("x");
        System.out.println(a.b.f(this.f91488j, ")\n", sb2));
    }

    public void displayReadableRows() {
        d dVar;
        d();
        String strF = a.b.f(this.f91481c, "\n", new StringBuilder(" num vars "));
        int i10 = 0;
        while (true) {
            int i11 = this.f91481c + 1;
            dVar = this.f91491m;
            if (i10 >= i11) {
                break;
            }
            n nVar = dVar.f91476c[i10];
            if (nVar != null && nVar.f91523i) {
                strF = strF + " $[" + i10 + "] => " + nVar + " = " + nVar.f91522h + "\n";
            }
            i10++;
        }
        String strL = o2.l(strF, "\n");
        for (int i12 = 0; i12 < this.f91481c + 1; i12++) {
            n[] nVarArr = dVar.f91476c;
            n nVar2 = nVarArr[i12];
            if (nVar2 != null && nVar2.f91530p) {
                strL = strL + " ~[" + i12 + "] => " + nVar2 + " = " + nVarArr[nVar2.f91531q] + " + " + nVar2.f91532r + "\n";
            }
        }
        String strL2 = o2.l(strL, "\n\n #  ");
        for (int i13 = 0; i13 < this.f91489k; i13++) {
            StringBuilder sbU = p0.o2.u(strL2);
            sbU.append(this.f91485g[i13].c());
            strL2 = o2.l(sbU.toString(), "\n #  ");
        }
        l lVar = this.f91482d;
        if (lVar != null) {
            strL2 = strL2 + "Goal: " + lVar + "\n";
        }
        System.out.println(strL2);
    }

    public void displayVariablesReadableRows() {
        d();
        String strL = "";
        for (int i10 = 0; i10 < this.f91489k; i10++) {
            if (this.f91485g[i10].f91469a.f91526l == m.f91512b) {
                StringBuilder sbU = p0.o2.u(strL);
                sbU.append(this.f91485g[i10].c());
                strL = o2.l(sbU.toString(), "\n");
            }
        }
        StringBuilder sbU2 = p0.o2.u(strL);
        sbU2.append(this.f91482d);
        sbU2.append("\n");
        System.out.println(sbU2.toString());
    }

    public final void e() {
        int i10 = this.f91483e * 2;
        this.f91483e = i10;
        this.f91485g = (c[]) Arrays.copyOf(this.f91485g, i10);
        d dVar = this.f91491m;
        dVar.f91476c = (n[]) Arrays.copyOf(dVar.f91476c, this.f91483e);
        int i11 = this.f91483e;
        this.f91487i = new boolean[i11];
        this.f91484f = i11;
        this.f91490l = i11;
        g gVar = f91478r;
        if (gVar != null) {
            gVar.f91496b = Math.max(gVar.f91496b, i11);
            long j10 = f91478r.f91496b;
        }
    }

    public final void f(l lVar) {
        g gVar = f91478r;
        if (gVar != null) {
            gVar.f91500f = Math.max(gVar.f91500f, this.f91488j);
            g gVar2 = f91478r;
            gVar2.f91501g = Math.max(gVar2.f91501g, this.f91489k);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f91489k) {
                break;
            }
            c cVar = this.f91485g[i10];
            m mVar = cVar.f91469a.f91526l;
            m mVar2 = m.f91512b;
            if (mVar != mVar2) {
                float f10 = 0.0f;
                if (cVar.f91470b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (i12 < this.f91489k) {
                            c cVar2 = this.f91485g[i12];
                            if (cVar2.f91469a.f91526l != mVar2 && !cVar2.f91473e && cVar2.f91470b < f10) {
                                int currentSize = cVar2.f91472d.getCurrentSize();
                                int i16 = 0;
                                while (i16 < currentSize) {
                                    n variable = cVar2.f91472d.getVariable(i16);
                                    float f12 = f10;
                                    float f13 = cVar2.f91472d.get(variable);
                                    if (f13 > f12) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = variable.f91524j[i17] / f13;
                                            if ((f14 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = variable.f91519e;
                                                i13 = i12;
                                                f11 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = f12;
                                }
                            }
                            i12++;
                            f10 = f10;
                        }
                        float f15 = f10;
                        if (i13 != -1) {
                            c cVar3 = this.f91485g[i13];
                            cVar3.f91469a.f91520f = -1;
                            cVar3.b(this.f91491m.f91476c[i14]);
                            n nVar = cVar3.f91469a;
                            nVar.f91520f = i13;
                            nVar.updateReferencesWithNewDefinition(this, cVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f91488j / 2) {
                            z10 = true;
                        }
                        f10 = f15;
                    }
                }
            }
            i10++;
        }
        g(lVar);
        c();
    }

    public void fillMetrics(g gVar) {
        f91478r = gVar;
    }

    public final void g(e eVar) {
        for (int i10 = 0; i10 < this.f91488j; i10++) {
            this.f91487i[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f91488j * 2) {
                return;
            }
            if (eVar.getKey() != null) {
                this.f91487i[eVar.getKey().f91519e] = true;
            }
            n pivotCandidate = eVar.getPivotCandidate(this, this.f91487i);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f91487i;
                int i12 = pivotCandidate.f91519e;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (pivotCandidate != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f91489k; i14++) {
                    c cVar = this.f91485g[i14];
                    if (cVar.f91469a.f91526l != m.f91512b && !cVar.f91473e && cVar.f91472d.contains(pivotCandidate)) {
                        float f11 = cVar.f91472d.get(pivotCandidate);
                        if (f11 < 0.0f) {
                            float f12 = (-cVar.f91470b) / f11;
                            if (f12 < f10) {
                                i13 = i14;
                                f10 = f12;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar2 = this.f91485g[i13];
                    cVar2.f91469a.f91520f = -1;
                    cVar2.b(pivotCandidate);
                    n nVar = cVar2.f91469a;
                    nVar.f91520f = i13;
                    nVar.updateReferencesWithNewDefinition(this, cVar2);
                }
            } else {
                z10 = true;
            }
        }
    }

    public d getCache() {
        return this.f91491m;
    }

    public int getMemoryUsed() {
        int iSizeInBytes = 0;
        for (int i10 = 0; i10 < this.f91489k; i10++) {
            c cVar = this.f91485g[i10];
            if (cVar != null) {
                iSizeInBytes += cVar.f91472d.sizeInBytes() + (cVar.f91469a != null ? 4 : 0) + 8;
            }
        }
        return iSizeInBytes;
    }

    public int getNumEquations() {
        return this.f91489k;
    }

    public int getNumVariables() {
        return this.f91481c;
    }

    public int getObjectVariableValue(Object obj) {
        n solverVariable = ((d3.e) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.f91522h + 0.5f);
        }
        return 0;
    }

    public final void h() {
        for (int i10 = 0; i10 < this.f91489k; i10++) {
            c cVar = this.f91485g[i10];
            if (cVar != null) {
                this.f91491m.f91474a.release(cVar);
            }
            this.f91485g[i10] = null;
        }
    }

    public void minimize() throws Exception {
        l lVar = this.f91482d;
        if (lVar.isEmpty()) {
            c();
            return;
        }
        if (!this.f91486h) {
            f(lVar);
            return;
        }
        g gVar = f91478r;
        if (gVar != null) {
            gVar.f91497c++;
        }
        for (int i10 = 0; i10 < this.f91489k; i10++) {
            if (!this.f91485g[i10].f91473e) {
                f(lVar);
                return;
            }
        }
        c();
    }

    public void removeRow(c cVar) {
        n nVar;
        int i10;
        if (!cVar.f91473e || (nVar = cVar.f91469a) == null) {
            return;
        }
        int i11 = nVar.f91520f;
        if (i11 != -1) {
            while (true) {
                i10 = this.f91489k - 1;
                if (i11 >= i10) {
                    break;
                }
                c[] cVarArr = this.f91485g;
                int i12 = i11 + 1;
                c cVar2 = cVarArr[i12];
                n nVar2 = cVar2.f91469a;
                if (nVar2.f91520f == i12) {
                    nVar2.f91520f = i11;
                }
                cVarArr[i11] = cVar2;
                i11 = i12;
            }
            this.f91489k = i10;
        }
        n nVar3 = cVar.f91469a;
        if (!nVar3.f91523i) {
            nVar3.setFinalValue(this, cVar.f91470b);
        }
        this.f91491m.f91474a.release(cVar);
    }

    public void reset() {
        d dVar;
        int i10 = 0;
        while (true) {
            dVar = this.f91491m;
            n[] nVarArr = dVar.f91476c;
            if (i10 >= nVarArr.length) {
                break;
            }
            n nVar = nVarArr[i10];
            if (nVar != null) {
                nVar.reset();
            }
            i10++;
        }
        dVar.f91475b.releaseAll(this.f91492n, this.f91493o);
        this.f91493o = 0;
        Arrays.fill(dVar.f91476c, (Object) null);
        this.f91481c = 0;
        this.f91482d.clear();
        this.f91488j = 1;
        for (int i11 = 0; i11 < this.f91489k; i11++) {
            c cVar = this.f91485g[i11];
        }
        h();
        this.f91489k = 0;
        this.f91494p = new c(dVar);
    }

    public void addEquality(n nVar, int i10) {
        int i11 = nVar.f91520f;
        if (i11 == -1) {
            float f10 = i10;
            nVar.setFinalValue(this, f10);
            for (int i12 = 0; i12 < this.f91481c + 1; i12++) {
                n nVar2 = this.f91491m.f91476c[i12];
                if (nVar2 != null && nVar2.f91530p && nVar2.f91531q == nVar.f91519e) {
                    nVar2.setFinalValue(this, nVar2.f91532r + f10);
                }
            }
            return;
        }
        if (i11 != -1) {
            c cVar = this.f91485g[i11];
            if (cVar.f91473e) {
                cVar.f91470b = i10;
                return;
            }
            if (cVar.f91472d.getCurrentSize() == 0) {
                cVar.f91473e = true;
                cVar.f91470b = i10;
                return;
            } else {
                c cVarCreateRow = createRow();
                cVarCreateRow.createRowEquals(nVar, i10);
                addConstraint(cVarCreateRow);
                return;
            }
        }
        c cVarCreateRow2 = createRow();
        cVarCreateRow2.f91469a = nVar;
        float f11 = i10;
        nVar.f91522h = f11;
        cVarCreateRow2.f91470b = f11;
        cVarCreateRow2.f91473e = true;
        addConstraint(cVarCreateRow2);
    }
}
