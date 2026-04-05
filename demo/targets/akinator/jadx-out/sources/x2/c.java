package x2;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: d, reason: collision with root package name */
    public final b f91472d;

    /* renamed from: a, reason: collision with root package name */
    public n f91469a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f91470b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f91471c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f91473e = false;

    public c() {
    }

    public final n a(boolean[] zArr, n nVar) {
        m mVar;
        int currentSize = this.f91472d.getCurrentSize();
        n nVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < currentSize; i10++) {
            float variableValue = this.f91472d.getVariableValue(i10);
            if (variableValue < 0.0f) {
                n variable = this.f91472d.getVariable(i10);
                if ((zArr == null || !zArr[variable.f91519e]) && variable != nVar && (((mVar = variable.f91526l) == m.f91513c || mVar == m.f91514e) && variableValue < f10)) {
                    f10 = variableValue;
                    nVar2 = variable;
                }
            }
        }
        return nVar2;
    }

    public c addError(f fVar, int i10) {
        this.f91472d.put(fVar.createErrorVariable(i10, "ep"), 1.0f);
        this.f91472d.put(fVar.createErrorVariable(i10, "em"), -1.0f);
        return this;
    }

    public final void b(n nVar) {
        n nVar2 = this.f91469a;
        if (nVar2 != null) {
            this.f91472d.put(nVar2, -1.0f);
            this.f91469a.f91520f = -1;
            this.f91469a = null;
        }
        float fRemove = this.f91472d.remove(nVar, true) * (-1.0f);
        this.f91469a = nVar;
        if (fRemove == 1.0f) {
            return;
        }
        this.f91470b /= fRemove;
        this.f91472d.divideByAmount(fRemove);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r10 = this;
            x2.n r0 = r10.f91469a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            x2.n r1 = r10.f91469a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = j1.o2.l(r0, r1)
            float r1 = r10.f91470b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = p0.o2.u(r0)
            float r1 = r10.f91470b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            x2.b r5 = r10.f91472d
            int r5 = r5.getCurrentSize()
        L3c:
            if (r3 >= r5) goto L9c
            x2.b r6 = r10.f91472d
            x2.n r6 = r6.getVariable(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            x2.b r7 = r10.f91472d
            float r7 = r7.getVariableValue(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = j1.o2.l(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = j1.o2.l(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = j1.o2.l(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = j1.o2.l(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = j1.o2.l(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.c():java.lang.String");
    }

    @Override // x2.e
    public void clear() {
        this.f91472d.clear();
        this.f91469a = null;
        this.f91470b = 0.0f;
    }

    public c createRowDimensionRatio(n nVar, n nVar2, n nVar3, n nVar4, float f10) {
        this.f91472d.put(nVar, -1.0f);
        this.f91472d.put(nVar2, 1.0f);
        this.f91472d.put(nVar3, f10);
        this.f91472d.put(nVar4, -f10);
        return this;
    }

    public c createRowEqualDimension(float f10, float f11, float f12, n nVar, int i10, n nVar2, int i11, n nVar3, int i12, n nVar4, int i13) {
        if (f11 == 0.0f || f10 == f12) {
            this.f91470b = ((-i10) - i11) + i12 + i13;
            this.f91472d.put(nVar, 1.0f);
            this.f91472d.put(nVar2, -1.0f);
            this.f91472d.put(nVar4, 1.0f);
            this.f91472d.put(nVar3, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f91470b = (i13 * f13) + (i12 * f13) + ((-i10) - i11);
        this.f91472d.put(nVar, 1.0f);
        this.f91472d.put(nVar2, -1.0f);
        this.f91472d.put(nVar4, f13);
        this.f91472d.put(nVar3, -f13);
        return this;
    }

    public c createRowEqualMatchDimensions(float f10, float f11, float f12, n nVar, n nVar2, n nVar3, n nVar4) {
        this.f91470b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f91472d.put(nVar, 1.0f);
            this.f91472d.put(nVar2, -1.0f);
            this.f91472d.put(nVar4, 1.0f);
            this.f91472d.put(nVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f91472d.put(nVar, 1.0f);
            this.f91472d.put(nVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f91472d.put(nVar3, 1.0f);
            this.f91472d.put(nVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f91472d.put(nVar, 1.0f);
        this.f91472d.put(nVar2, -1.0f);
        this.f91472d.put(nVar4, f13);
        this.f91472d.put(nVar3, -f13);
        return this;
    }

    public c createRowEquals(n nVar, int i10) {
        if (i10 < 0) {
            this.f91470b = i10 * (-1);
            this.f91472d.put(nVar, 1.0f);
            return this;
        }
        this.f91470b = i10;
        this.f91472d.put(nVar, -1.0f);
        return this;
    }

    public c createRowGreaterThan(n nVar, n nVar2, n nVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f91470b = i10;
        }
        if (z10) {
            this.f91472d.put(nVar, 1.0f);
            this.f91472d.put(nVar2, -1.0f);
            this.f91472d.put(nVar3, -1.0f);
            return this;
        }
        this.f91472d.put(nVar, -1.0f);
        this.f91472d.put(nVar2, 1.0f);
        this.f91472d.put(nVar3, 1.0f);
        return this;
    }

    public c createRowLowerThan(n nVar, n nVar2, n nVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f91470b = i10;
        }
        if (z10) {
            this.f91472d.put(nVar, 1.0f);
            this.f91472d.put(nVar2, -1.0f);
            this.f91472d.put(nVar3, 1.0f);
            return this;
        }
        this.f91472d.put(nVar, -1.0f);
        this.f91472d.put(nVar2, 1.0f);
        this.f91472d.put(nVar3, -1.0f);
        return this;
    }

    public c createRowWithAngle(n nVar, n nVar2, n nVar3, n nVar4, float f10) {
        this.f91472d.put(nVar3, 0.5f);
        this.f91472d.put(nVar4, 0.5f);
        this.f91472d.put(nVar, -0.5f);
        this.f91472d.put(nVar2, -0.5f);
        this.f91470b = -f10;
        return this;
    }

    @Override // x2.e
    public n getKey() {
        return this.f91469a;
    }

    @Override // x2.e
    public n getPivotCandidate(f fVar, boolean[] zArr) {
        return a(zArr, null);
    }

    @Override // x2.e
    public void initFromRow(e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            this.f91469a = null;
            this.f91472d.clear();
            for (int i10 = 0; i10 < cVar.f91472d.getCurrentSize(); i10++) {
                this.f91472d.add(cVar.f91472d.getVariable(i10), cVar.f91472d.getVariableValue(i10), true);
            }
        }
    }

    @Override // x2.e
    public boolean isEmpty() {
        return this.f91469a == null && this.f91470b == 0.0f && this.f91472d.getCurrentSize() == 0;
    }

    public n pickPivot(n nVar) {
        return a(null, nVar);
    }

    public void reset() {
        this.f91469a = null;
        this.f91472d.clear();
        this.f91470b = 0.0f;
        this.f91473e = false;
    }

    public String toString() {
        return c();
    }

    @Override // x2.e
    public void updateFromFinalVariable(f fVar, n nVar, boolean z10) {
        if (nVar == null || !nVar.f91523i) {
            return;
        }
        float f10 = this.f91472d.get(nVar);
        this.f91470b = (nVar.f91522h * f10) + this.f91470b;
        this.f91472d.remove(nVar, z10);
        if (z10) {
            nVar.removeFromRow(this);
        }
        if (this.f91472d.getCurrentSize() == 0) {
            this.f91473e = true;
            fVar.f91480b = true;
        }
    }

    @Override // x2.e
    public void updateFromRow(f fVar, c cVar, boolean z10) {
        float fUse = this.f91472d.use(cVar, z10);
        this.f91470b = (cVar.f91470b * fUse) + this.f91470b;
        if (z10) {
            cVar.f91469a.removeFromRow(this);
        }
        if (this.f91469a == null || this.f91472d.getCurrentSize() != 0) {
            return;
        }
        this.f91473e = true;
        fVar.f91480b = true;
    }

    public void updateFromSynonymVariable(f fVar, n nVar, boolean z10) {
        if (nVar == null || !nVar.f91530p) {
            return;
        }
        float f10 = this.f91472d.get(nVar);
        this.f91470b = (nVar.f91532r * f10) + this.f91470b;
        this.f91472d.remove(nVar, z10);
        if (z10) {
            nVar.removeFromRow(this);
        }
        this.f91472d.add(fVar.f91491m.f91476c[nVar.f91531q], f10, z10);
        if (this.f91472d.getCurrentSize() == 0) {
            this.f91473e = true;
            fVar.f91480b = true;
        }
    }

    @Override // x2.e
    public void updateFromSystem(f fVar) {
        ArrayList arrayList;
        if (fVar.f91485g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int currentSize = this.f91472d.getCurrentSize();
            int i10 = 0;
            while (true) {
                arrayList = this.f91471c;
                if (i10 >= currentSize) {
                    break;
                }
                n variable = this.f91472d.getVariable(i10);
                if (variable.f91520f != -1 || variable.f91523i || variable.f91530p) {
                    arrayList.add(variable);
                }
                i10++;
            }
            int size = arrayList.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    n nVar = (n) arrayList.get(i11);
                    if (nVar.f91523i) {
                        updateFromFinalVariable(fVar, nVar, true);
                    } else if (nVar.f91530p) {
                        updateFromSynonymVariable(fVar, nVar, true);
                    } else {
                        updateFromRow(fVar, fVar.f91485g[nVar.f91520f], true);
                    }
                }
                arrayList.clear();
            } else {
                z10 = true;
            }
        }
        if (this.f91469a == null || this.f91472d.getCurrentSize() != 0) {
            return;
        }
        this.f91473e = true;
        fVar.f91480b = true;
    }

    @Override // x2.e
    public void addError(n nVar) {
        int i10 = nVar.f91521g;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f91472d.put(nVar, f10);
    }

    public c createRowEquals(n nVar, n nVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f91470b = i10;
        }
        if (!z10) {
            this.f91472d.put(nVar, -1.0f);
            this.f91472d.put(nVar2, 1.0f);
            return this;
        }
        this.f91472d.put(nVar, 1.0f);
        this.f91472d.put(nVar2, -1.0f);
        return this;
    }

    public c(d dVar) {
        this.f91472d = new a(this, dVar);
    }

    public c createRowGreaterThan(n nVar, int i10, n nVar2) {
        this.f91470b = i10;
        this.f91472d.put(nVar, -1.0f);
        return this;
    }
}
