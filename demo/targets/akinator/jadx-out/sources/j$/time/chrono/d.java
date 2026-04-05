package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class d implements b, j$.time.temporal.l, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract b D(long j10);

    public abstract b G(long j10);

    public abstract b t(long j10);

    @Override // j$.time.temporal.l
    public /* bridge */ /* synthetic */ j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return a(j10, rVar);
    }

    public static b r(m mVar, j$.time.temporal.l lVar) {
        b bVar = (b) lVar;
        if (mVar.equals(bVar.getChronology())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.k() + ", actual: " + bVar.getChronology().k());
    }

    @Override // j$.time.temporal.l
    public b j(long j10, j$.time.temporal.r rVar) {
        boolean z10 = rVar instanceof ChronoUnit;
        if (!z10) {
            if (!z10) {
                return r(getChronology(), rVar.r(this, j10));
            }
            throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
        switch (c.f68471a[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return t(j10);
            case 2:
                return t(Math.multiplyExact(j10, 7));
            case 3:
                return D(j10);
            case 4:
                return G(j10);
            case 5:
                return G(Math.multiplyExact(j10, 10));
            case 6:
                return G(Math.multiplyExact(j10, 100));
            case 7:
                return G(Math.multiplyExact(j10, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return g(Math.addExact(f(aVar), j10), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long jZ = z();
        return ((int) (jZ ^ (jZ >>> 32))) ^ getChronology().hashCode();
    }

    @Override // j$.time.temporal.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b w(j$.time.temporal.n nVar) {
        return r(getChronology(), nVar.c(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jF = f(j$.time.temporal.a.YEAR_OF_ERA);
        long jF2 = f(j$.time.temporal.a.MONTH_OF_YEAR);
        long jF3 = f(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(getChronology().toString());
        sb2.append(" ");
        sb2.append(B());
        sb2.append(" ");
        sb2.append(jF);
        sb2.append(jF2 < 10 ? "-0" : "-");
        sb2.append(jF2);
        sb2.append(jF3 < 10 ? "-0" : "-");
        sb2.append(jF3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.l
    public b g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", pVar));
        }
        return r(getChronology(), pVar.G(this, j10));
    }
}
