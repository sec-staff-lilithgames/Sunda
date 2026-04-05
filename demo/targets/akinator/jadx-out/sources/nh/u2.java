package nh;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u2 extends v2 {
    @Override // nh.v2
    public final void c(StringBuilder sb2) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(this.f76705b);
    }

    @Override // nh.v2, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.compareTo((v2) obj);
    }

    @Override // nh.v2
    public final void d(StringBuilder sb2) {
        sb2.append(this.f76705b);
        sb2.append(')');
    }

    @Override // nh.v2
    public final Comparable f(a3 a3Var) {
        return a3Var.previous(this.f76705b);
    }

    @Override // nh.v2
    public final boolean g(Comparable comparable) {
        ze zeVar = ze.f76826e;
        return this.f76705b.compareTo(comparable) <= 0;
    }

    @Override // nh.v2
    public final Comparable h(a3 a3Var) {
        return this.f76705b;
    }

    @Override // nh.v2
    public int hashCode() {
        return this.f76705b.hashCode();
    }

    @Override // nh.v2
    public final r0 i() {
        return r0.f76592c;
    }

    @Override // nh.v2
    public final r0 j() {
        return r0.f76591b;
    }

    @Override // nh.v2
    public final v2 k(r0 r0Var, a3 a3Var) {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 0) {
            Comparable comparablePrevious = a3Var.previous(this.f76705b);
            return comparablePrevious == null ? t2.f76651c : new s2(comparablePrevious);
        }
        if (iOrdinal == 1) {
            return this;
        }
        throw new AssertionError();
    }

    @Override // nh.v2
    public final v2 l(r0 r0Var, a3 a3Var) {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 0) {
            return this;
        }
        if (iOrdinal != 1) {
            throw new AssertionError();
        }
        Comparable comparablePrevious = a3Var.previous(this.f76705b);
        return comparablePrevious == null ? r2.f76594c : new s2(comparablePrevious);
    }

    public String toString() {
        return "\\" + this.f76705b + "/";
    }
}
