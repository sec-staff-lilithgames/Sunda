package j$.time.chrono;

import j$.time.temporal.ChronoUnit;

/* loaded from: classes3.dex */
public interface b extends j$.time.temporal.l, j$.time.temporal.n, Comparable {
    @Override // j$.time.temporal.l
    b g(long j10, j$.time.temporal.p pVar);

    m getChronology();

    int hashCode();

    @Override // j$.time.temporal.l
    b j(long j10, j$.time.temporal.r rVar);

    String toString();

    default e A(j$.time.k kVar) {
        return new g(this, kVar);
    }

    default n B() {
        return getChronology().u(d(j$.time.temporal.a.ERA));
    }

    default boolean s() {
        return getChronology().H(f(j$.time.temporal.a.YEAR));
    }

    default int E() {
        return s() ? 366 : 365;
    }

    @Override // j$.time.temporal.m
    default boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.l
    default b a(long j10, j$.time.temporal.r rVar) {
        return d.r(getChronology(), super.a(j10, rVar));
    }

    @Override // j$.time.temporal.m
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68656a || aVar == j$.time.temporal.q.f68660e || aVar == j$.time.temporal.q.f68659d || aVar == j$.time.temporal.q.f68662g) {
            return null;
        }
        if (aVar == j$.time.temporal.q.f68657b) {
            return getChronology();
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.DAYS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(z(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long z() {
        return f(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: F */
    default int compareTo(b bVar) {
        int iCompare = Long.compare(z(), bVar.z());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) getChronology()).k().compareTo(bVar.getChronology().k());
    }
}
