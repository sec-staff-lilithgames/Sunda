package tb;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements a, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final h f86718i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f86719j;

    /* renamed from: b, reason: collision with root package name */
    public final i f86720b;

    /* renamed from: c, reason: collision with root package name */
    public final i f86721c;

    /* renamed from: e, reason: collision with root package name */
    public final i f86722e;

    /* renamed from: f, reason: collision with root package name */
    public final i f86723f;

    /* renamed from: g, reason: collision with root package name */
    public final i f86724g;

    /* renamed from: h, reason: collision with root package name */
    public final i f86725h;

    static {
        i iVar = i.f86726b;
        i iVar2 = i.f86727c;
        i iVar3 = i.f86728e;
        f86718i = new h(iVar3, iVar3, iVar3, iVar, iVar3, iVar2);
        i iVar4 = i.f86730g;
        f86719j = new h(iVar4, iVar4, iVar4, iVar4, iVar4, iVar4);
    }

    public h(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6) {
        this.f86720b = iVar;
        this.f86721c = iVar2;
        this.f86722e = iVar3;
        this.f86723f = iVar4;
        this.f86724g = iVar5;
        this.f86725h = iVar6;
    }

    public static boolean a(h hVar, i iVar, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6) {
        return hVar.f86720b == iVar && hVar.f86721c == iVar2 && hVar.f86722e == iVar3 && hVar.f86723f == iVar4 && hVar.f86724g == iVar5 && hVar.f86725h == iVar6;
    }

    public static h construct(l1 l1Var, i iVar) {
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        i iVar7;
        int iOrdinal = l1Var.ordinal();
        i iVar8 = i.f86730g;
        if (iOrdinal == 0) {
            iVar2 = iVar;
            iVar3 = iVar8;
            iVar4 = iVar3;
        } else {
            if (iOrdinal == 1) {
                iVar7 = iVar;
                iVar3 = iVar8;
                iVar2 = iVar3;
                iVar4 = iVar2;
                iVar6 = iVar4;
                iVar5 = iVar6;
                return construct(iVar3, iVar2, iVar4, iVar7, iVar6, iVar5);
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    iVar4 = iVar;
                    iVar3 = iVar8;
                    iVar2 = iVar3;
                    iVar7 = iVar2;
                    iVar6 = iVar7;
                    iVar5 = iVar6;
                    return construct(iVar3, iVar2, iVar4, iVar7, iVar6, iVar5);
                }
                if (iOrdinal == 4) {
                    iVar6 = iVar;
                    iVar3 = iVar8;
                    iVar2 = iVar3;
                    iVar4 = iVar2;
                    iVar7 = iVar4;
                    iVar5 = iVar7;
                } else if (iOrdinal != 5) {
                    iVar3 = iOrdinal != 7 ? iVar8 : iVar;
                    iVar2 = iVar3;
                } else {
                    iVar5 = iVar;
                    iVar3 = iVar8;
                    iVar2 = iVar3;
                    iVar4 = iVar2;
                    iVar7 = iVar4;
                    iVar6 = iVar7;
                }
                return construct(iVar3, iVar2, iVar4, iVar7, iVar6, iVar5);
            }
            iVar3 = iVar;
            iVar2 = iVar8;
            iVar4 = iVar2;
        }
        iVar7 = iVar4;
        iVar6 = iVar7;
        iVar5 = iVar6;
        return construct(iVar3, iVar2, iVar4, iVar7, iVar6, iVar5);
    }

    public static h defaultVisibility() {
        return f86718i;
    }

    public static h from(j jVar) {
        return construct(jVar.fieldVisibility(), jVar.getterVisibility(), jVar.isGetterVisibility(), jVar.setterVisibility(), jVar.creatorVisibility(), jVar.scalarConstructorVisibility());
    }

    public static h merge(h hVar, h hVar2) {
        return hVar == null ? hVar2 : hVar.withOverrides(hVar2);
    }

    public static h noOverrides() {
        return f86719j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != h.class) {
            return false;
        }
        h hVar = (h) obj;
        return a(this, hVar.f86720b, hVar.f86721c, hVar.f86722e, hVar.f86723f, hVar.f86724g, hVar.f86725h);
    }

    public i getCreatorVisibility() {
        return this.f86724g;
    }

    public i getFieldVisibility() {
        return this.f86720b;
    }

    public i getGetterVisibility() {
        return this.f86721c;
    }

    public i getIsGetterVisibility() {
        return this.f86722e;
    }

    public i getScalarConstructorVisibility() {
        return this.f86725h;
    }

    public i getSetterVisibility() {
        return this.f86723f;
    }

    public int hashCode() {
        return ((this.f86720b.ordinal() + 1) ^ ((this.f86723f.ordinal() * 11) + ((this.f86721c.ordinal() * 3) - (this.f86722e.ordinal() * 7)))) ^ ((this.f86725h.ordinal() * 17) + (this.f86724g.ordinal() * 13));
    }

    public String toString() {
        return "JsonAutoDetect.Value(fields=" + this.f86720b + ",getters=" + this.f86721c + ",isGetters=" + this.f86722e + ",setters=" + this.f86723f + ",creators=" + this.f86724g + ",scalarConstructors=" + this.f86725h + ")";
    }

    @Override // tb.a
    public Class<j> valueFor() {
        return j.class;
    }

    public h withCreatorVisibility(i iVar) {
        return construct(this.f86720b, this.f86721c, this.f86722e, this.f86723f, iVar, this.f86725h);
    }

    public h withFieldVisibility(i iVar) {
        return construct(iVar, this.f86721c, this.f86722e, this.f86723f, this.f86724g, this.f86725h);
    }

    public h withGetterVisibility(i iVar) {
        return construct(this.f86720b, iVar, this.f86722e, this.f86723f, this.f86724g, this.f86725h);
    }

    public h withIsGetterVisibility(i iVar) {
        return construct(this.f86720b, this.f86721c, iVar, this.f86723f, this.f86724g, this.f86725h);
    }

    public h withOverrides(h hVar) {
        if (hVar == null || hVar == f86719j || hVar == this) {
            return this;
        }
        i iVar = hVar.f86720b;
        i iVar2 = i.f86730g;
        if (iVar == iVar2) {
            iVar = this.f86720b;
        }
        i iVar3 = iVar;
        i iVar4 = hVar.f86721c;
        if (iVar4 == iVar2) {
            iVar4 = this.f86721c;
        }
        i iVar5 = iVar4;
        i iVar6 = hVar.f86722e;
        if (iVar6 == iVar2) {
            iVar6 = this.f86722e;
        }
        i iVar7 = iVar6;
        i iVar8 = hVar.f86723f;
        if (iVar8 == iVar2) {
            iVar8 = this.f86723f;
        }
        i iVar9 = iVar8;
        i iVar10 = hVar.f86724g;
        if (iVar10 == iVar2) {
            iVar10 = this.f86724g;
        }
        i iVar11 = iVar10;
        i iVar12 = hVar.f86725h;
        if (iVar12 == iVar2) {
            iVar12 = this.f86725h;
        }
        i iVar13 = iVar12;
        return a(this, iVar3, iVar5, iVar7, iVar9, iVar11, iVar13) ? this : construct(iVar3, iVar5, iVar7, iVar9, iVar11, iVar13);
    }

    public h withScalarConstructorVisibility(i iVar) {
        return construct(this.f86720b, this.f86721c, this.f86722e, this.f86723f, this.f86724g, iVar);
    }

    public h withSetterVisibility(i iVar) {
        return construct(this.f86720b, this.f86721c, this.f86722e, iVar, this.f86724g, this.f86725h);
    }

    public static h construct(i iVar, i iVar2, i iVar3, i iVar4, i iVar5) {
        return construct(iVar, iVar2, iVar3, iVar4, iVar5, i.f86730g);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tb.h construct(tb.i r8, tb.i r9, tb.i r10, tb.i r11, tb.i r12, tb.i r13) {
        /*
            tb.i r0 = tb.i.f86728e
            if (r8 != r0) goto L15
            if (r9 != r0) goto L26
            if (r10 != r0) goto L26
            tb.i r1 = tb.i.f86726b
            if (r11 != r1) goto L26
            if (r12 != r0) goto L26
            tb.i r0 = tb.i.f86727c
            if (r13 != r0) goto L26
            tb.h r0 = tb.h.f86718i
            goto L27
        L15:
            tb.i r0 = tb.i.f86730g
            if (r8 != r0) goto L26
            if (r9 != r0) goto L26
            if (r10 != r0) goto L26
            if (r11 != r0) goto L26
            if (r12 != r0) goto L26
            if (r13 != r0) goto L26
            tb.h r0 = tb.h.f86719j
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L35
            tb.h r1 = new tb.h
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h.construct(tb.i, tb.i, tb.i, tb.i, tb.i, tb.i):tb.h");
    }
}
