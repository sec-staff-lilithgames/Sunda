package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class o implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f68619c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    public final int f68620a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68621b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i10 = this.f68620a - oVar.f68620a;
        return i10 == 0 ? this.f68621b - oVar.f68621b : i10;
    }

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.d("--");
        sVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        sVar.c('-');
        sVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        sVar.p(Locale.getDefault(), j$.time.format.z.SMART, null);
    }

    public o(int i10, int i11) {
        this.f68620a = i10;
        this.f68621b = i11;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.range();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.i(pVar);
        }
        m mVarG = m.G(this.f68620a);
        mVarG.getClass();
        int i10 = l.f68615a[mVarG.ordinal()];
        return j$.time.temporal.t.f(1L, i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, m.G(this.f68620a).D());
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return i(pVar).a(f(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        int i10;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.D(this);
        }
        int i11 = n.f68618a[((j$.time.temporal.a) pVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f68621b;
        } else {
            if (i11 != 2) {
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
            }
            i10 = this.f68620a;
        }
        return i10;
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68657b) {
            return j$.time.chrono.t.f68512c;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.m.l(lVar).equals(j$.time.chrono.t.f68512c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.l lVarG = lVar.g(this.f68620a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return lVarG.g(Math.min(lVarG.i(aVar).f68666d, this.f68621b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f68620a == oVar.f68620a && this.f68621b == oVar.f68621b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68620a << 6) + this.f68621b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f68620a < 10 ? "0" : "");
        sb2.append(this.f68620a);
        sb2.append(this.f68621b < 10 ? "-0" : "-");
        sb2.append(this.f68621b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
