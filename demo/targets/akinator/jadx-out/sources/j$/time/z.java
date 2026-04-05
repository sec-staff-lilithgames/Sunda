package j$.time;

import com.ironsource.C3191e4;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class z implements j$.time.temporal.l, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f68695a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f68696b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneId f68697c;

    public static z t(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new z(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarR = zoneId.r();
        List listF = fVarR.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarR.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.K(Duration.r(bVar.f68704d.f68463b - bVar.f68703c.f68463b, 0).getSeconds());
            zoneOffset = bVar.f68704d;
        }
        return new z(localDateTime, zoneId, zoneOffset);
    }

    public static z r(long j10, int i10, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.r().d(Instant.ofEpochSecond(j10, i10));
        return new z(LocalDateTime.I(j10, i10, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public z(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f68695a = localDateTime;
        this.f68696b = zoneOffset;
        this.f68697c = zoneId;
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
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).f68639b;
            }
            return this.f68695a.i(pVar);
        }
        return pVar.t(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = y.f68694a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f68696b.f68463b;
            }
            return this.f68695a.d(pVar);
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = y.f68694a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                return toEpochSecond();
            }
            if (i10 == 2) {
                return this.f68696b.f68463b;
            }
            return this.f68695a.f(pVar);
        }
        return pVar.D(this);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset getOffset() {
        return this.f68696b;
    }

    @Override // j$.time.chrono.j
    public final ZoneId getZone() {
        return this.f68697c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j v(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f68697c.equals(zoneId) ? this : t(this.f68695a, zoneId, this.f68696b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e toLocalDateTime() {
        return this.f68695a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b toLocalDate() {
        return this.f68695a.f68453a;
    }

    @Override // j$.time.chrono.j
    public final k toLocalTime() {
        return this.f68695a.f68454b;
    }

    @Override // j$.time.chrono.j
    /* renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final z w(h hVar) {
        return t(LocalDateTime.G(hVar, this.f68695a.f68454b), this.f68697c, this.f68696b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i10 = y.f68694a[aVar.ordinal()];
            if (i10 == 1) {
                return r(j10, this.f68695a.f68454b.f68614d, this.f68697c);
            }
            if (i10 != 2) {
                return t(this.f68695a.g(j10, pVar), this.f68697c, this.f68696b);
            }
            ZoneOffset zoneOffsetL = ZoneOffset.L(aVar.f68639b.a(j10, aVar));
            return (zoneOffsetL.equals(this.f68696b) || !this.f68697c.r().f(this.f68695a).contains(zoneOffsetL)) ? this : new z(this.f68695a, this.f68697c, zoneOffsetL);
        }
        return (z) pVar.G(this, j10);
    }

    @Override // j$.time.temporal.l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final z j(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) rVar;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return t(this.f68695a.j(j10, rVar), this.f68697c, this.f68696b);
            }
            LocalDateTime localDateTimeJ = this.f68695a.j(j10, rVar);
            ZoneOffset zoneOffset = this.f68696b;
            ZoneId zoneId = this.f68697c;
            Objects.requireNonNull(localDateTimeJ, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.r().f(localDateTimeJ).contains(zoneOffset)) {
                return new z(localDateTimeJ, zoneId, zoneOffset);
            }
            return r(localDateTimeJ.p(zoneOffset), localDateTimeJ.f68454b.f68614d, zoneId);
        }
        return (z) rVar.r(this, j10);
    }

    @Override // j$.time.temporal.l
    public final j$.time.chrono.j a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68661f) {
            return this.f68695a.f68453a;
        }
        return super.b(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f68695a.equals(zVar.f68695a) && this.f68696b.equals(zVar.f68696b) && this.f68697c.equals(zVar.f68697c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f68695a.hashCode() ^ this.f68696b.f68463b) ^ Integer.rotateLeft(this.f68697c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f68695a.toString() + this.f68696b.f68464c;
        ZoneOffset zoneOffset = this.f68696b;
        ZoneId zoneId = this.f68697c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + C3191e4.i.f36529d + zoneId.toString() + C3191e4.i.f36531e;
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
