package tb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f86764c = new r(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f86765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86766b;

    public r(int i10, int i11) {
        this.f86765a = i10;
        this.f86766b = i11;
    }

    public static r construct(u uVar) {
        return construct(uVar.with(), uVar.without());
    }

    public static r empty() {
        return f86764c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != r.class) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f86765a == this.f86765a && rVar.f86766b == this.f86766b;
    }

    public Boolean get(q qVar) {
        int iOrdinal = 1 << qVar.ordinal();
        if ((this.f86766b & iOrdinal) != 0) {
            return Boolean.FALSE;
        }
        if ((iOrdinal & this.f86765a) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public int hashCode() {
        return this.f86766b + this.f86765a;
    }

    public String toString() {
        return this == f86764c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f86765a), Integer.valueOf(this.f86766b));
    }

    public r with(q... qVarArr) {
        int i10 = this.f86765a;
        int iOrdinal = i10;
        for (q qVar : qVarArr) {
            iOrdinal |= 1 << qVar.ordinal();
        }
        return iOrdinal == i10 ? this : new r(iOrdinal, this.f86766b);
    }

    public r withOverrides(r rVar) {
        if (rVar != null) {
            int i10 = rVar.f86766b;
            int i11 = rVar.f86765a;
            if (i10 != 0 || i11 != 0) {
                int i12 = this.f86766b;
                int i13 = this.f86765a;
                if (i13 == 0 && i12 == 0) {
                    return rVar;
                }
                int i14 = ((~i10) & i13) | i11;
                int i15 = i10 | ((~i11) & i12);
                if (i14 != i13 || i15 != i12) {
                    return new r(i14, i15);
                }
            }
        }
        return this;
    }

    public r without(q... qVarArr) {
        int i10 = this.f86766b;
        int iOrdinal = i10;
        for (q qVar : qVarArr) {
            iOrdinal |= 1 << qVar.ordinal();
        }
        return iOrdinal == i10 ? this : new r(this.f86765a, iOrdinal);
    }

    public static r construct(q[] qVarArr, q[] qVarArr2) {
        int iOrdinal = 0;
        for (q qVar : qVarArr) {
            iOrdinal |= 1 << qVar.ordinal();
        }
        int iOrdinal2 = 0;
        for (q qVar2 : qVarArr2) {
            iOrdinal2 |= 1 << qVar2.ordinal();
        }
        return new r(iOrdinal, iOrdinal2);
    }
}
