package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;

/* loaded from: classes3.dex */
public interface j extends j$.time.temporal.l, Comparable {
    ZoneOffset getOffset();

    ZoneId getZone();

    e toLocalDateTime();

    j v(ZoneId zoneId);

    @Override // j$.time.temporal.m
    default j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return toLocalDateTime().i(pVar);
            }
            return ((j$.time.temporal.a) pVar).f68639b;
        }
        return pVar.t(this);
    }

    @Override // j$.time.temporal.m
    default int d(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = i.f68487a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return toLocalDateTime().d(pVar);
            }
            return getOffset().f68463b;
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    default long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = i.f68487a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                return toEpochSecond();
            }
            if (i10 != 2) {
                return toLocalDateTime().f(pVar);
            }
            return getOffset().f68463b;
        }
        return pVar.D(this);
    }

    default b toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    default j$.time.k toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    default m getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.l
    default j w(j$.time.temporal.n nVar) {
        return l.r(getChronology(), nVar.c(this));
    }

    @Override // j$.time.temporal.l
    default j a(long j10, j$.time.temporal.r rVar) {
        return l.r(getChronology(), super.a(j10, rVar));
    }

    @Override // j$.time.temporal.m
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68660e || aVar == j$.time.temporal.q.f68656a) {
            return getZone();
        }
        if (aVar == j$.time.temporal.q.f68659d) {
            return getOffset();
        }
        if (aVar == j$.time.temporal.q.f68662g) {
            return toLocalTime();
        }
        if (aVar == j$.time.temporal.q.f68657b) {
            return getChronology();
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    default long toEpochSecond() {
        return ((toLocalDate().z() * 86400) + toLocalTime().Q()) - getOffset().f68463b;
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    default int compareTo(j jVar) {
        int iCompare = Long.compare(toEpochSecond(), jVar.toEpochSecond());
        return (iCompare == 0 && (iCompare = toLocalTime().f68614d - jVar.toLocalTime().f68614d) == 0 && (iCompare = toLocalDateTime().compareTo(jVar.toLocalDateTime())) == 0 && (iCompare = getZone().k().compareTo(jVar.getZone().k())) == 0) ? ((a) getChronology()).k().compareTo(jVar.getChronology().k()) : iCompare;
    }
}
