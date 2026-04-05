package j$.time;

import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f68455c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f68456a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f68457b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f68457b.equals(offsetDateTime2.f68457b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f68456a.p(this.f68457b), offsetDateTime2.f68456a.p(offsetDateTime2.f68457b));
            if (iCompare == 0) {
                iCompare = this.f68456a.f68454b.f68614d - offsetDateTime2.f68456a.f68454b.f68614d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f68451c;
        ZoneOffset zoneOffset = ZoneOffset.f68462g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f68452d;
        ZoneOffset zoneOffset2 = ZoneOffset.f68461f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime r(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.r().d(instant);
        return new OffsetDateTime(LocalDateTime.I(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f68456a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f68457b = zoneOffset;
    }

    public final OffsetDateTime D(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f68456a == localDateTime && this.f68457b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f68456a.i(pVar);
            }
            return ((j$.time.temporal.a) pVar).f68639b;
        }
        return pVar.t(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = p.f68622a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f68457b.f68463b;
            }
            return this.f68456a.d(pVar);
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = p.f68622a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                return this.f68456a.p(this.f68457b);
            }
            if (i10 == 2) {
                return this.f68457b.f68463b;
            }
            return this.f68456a.f(pVar);
        }
        return pVar.D(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f68456a;
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        LocalDateTime localDateTime = this.f68456a;
        return D(localDateTime.N(hVar, localDateTime.f68454b), this.f68457b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i10 = p.f68622a[aVar.ordinal()];
            if (i10 == 1) {
                return r(Instant.ofEpochSecond(j10, this.f68456a.f68454b.f68614d), this.f68457b);
            }
            if (i10 == 2) {
                return D(this.f68456a, ZoneOffset.L(aVar.f68639b.a(j10, aVar)));
            }
            return D(this.f68456a.g(j10, pVar), this.f68457b);
        }
        return (OffsetDateTime) pVar.G(this, j10);
    }

    @Override // j$.time.temporal.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime j(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            return D(this.f68456a.j(j10, rVar), this.f68457b);
        }
        return (OffsetDateTime) rVar.r(this, j10);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68659d || aVar == j$.time.temporal.q.f68660e) {
            return this.f68457b;
        }
        if (aVar == j$.time.temporal.q.f68656a) {
            return null;
        }
        if (aVar == j$.time.temporal.q.f68661f) {
            return this.f68456a.f68453a;
        }
        if (aVar == j$.time.temporal.q.f68662g) {
            return this.f68456a.f68454b;
        }
        if (aVar == j$.time.temporal.q.f68657b) {
            return j$.time.chrono.t.f68512c;
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(this.f68456a.f68453a.z(), j$.time.temporal.a.EPOCH_DAY).g(this.f68456a.f68454b.P(), j$.time.temporal.a.NANO_OF_DAY).g(this.f68457b.f68463b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f68456a.equals(offsetDateTime.f68456a) && this.f68457b.equals(offsetDateTime.f68457b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68456a.hashCode() ^ this.f68457b.f68463b;
    }

    public final String toString() {
        return this.f68456a.toString() + this.f68457b.f68464c;
    }

    private Object writeReplace() {
        return new s((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
