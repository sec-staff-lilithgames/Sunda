package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface e extends j$.time.temporal.l, j$.time.temporal.n, Comparable {
    j n(ZoneOffset zoneOffset);

    b toLocalDate();

    j$.time.k toLocalTime();

    default m getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.l
    default e a(long j10, j$.time.temporal.r rVar) {
        return g.r(getChronology(), super.a(j10, rVar));
    }

    @Override // j$.time.temporal.m
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68656a || aVar == j$.time.temporal.q.f68660e || aVar == j$.time.temporal.q.f68659d) {
            return null;
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

    @Override // j$.time.temporal.n
    default j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(toLocalDate().z(), j$.time.temporal.a.EPOCH_DAY).g(toLocalTime().P(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long p(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().z() * 86400) + toLocalTime().Q()) - zoneOffset.f68463b;
    }

    @Override // java.lang.Comparable
    /* renamed from: C */
    default int compareTo(e eVar) {
        int iCompareTo = toLocalDate().compareTo(eVar.toLocalDate());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(eVar.toLocalTime())) == 0) ? ((a) getChronology()).k().compareTo(eVar.getChronology().k()) : iCompareTo;
    }
}
