package j$.time.chrono;

import com.ironsource.C3191e4;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    public final transient g f68492a;

    /* renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f68493b;

    /* renamed from: c, reason: collision with root package name */
    public final transient ZoneId f68494c;

    public static l t(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, gVar);
        }
        j$.time.zone.f fVarR = zoneId.r();
        LocalDateTime localDateTimeT = LocalDateTime.t(gVar);
        List listF = fVarR.f(localDateTimeT);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarR.e(localDateTimeT);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.D(gVar.f68478a, 0L, 0L, Duration.r(bVar.f68704d.f68463b - bVar.f68703c.f68463b, 0).getSeconds(), 0L);
            zoneOffset = bVar.f68704d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, gVar);
    }

    public static l r(m mVar, j$.time.temporal.l lVar) {
        l lVar2 = (l) lVar;
        if (mVar.equals(lVar2.getChronology())) {
            return lVar2;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.k() + ", actual: " + lVar2.getChronology().k());
    }

    public l(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.f68492a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f68493b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f68494c = zoneId;
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset getOffset() {
        return this.f68493b;
    }

    public final int hashCode() {
        return (this.f68492a.hashCode() ^ this.f68493b.f68463b) ^ Integer.rotateLeft(this.f68494c.hashCode(), 3);
    }

    @Override // j$.time.chrono.j
    public final e toLocalDateTime() {
        return this.f68492a;
    }

    public final String toString() {
        String str = this.f68492a.toString() + this.f68493b.f68464c;
        ZoneOffset zoneOffset = this.f68493b;
        ZoneId zoneId = this.f68494c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + C3191e4.i.f36529d + zoneId.toString() + C3191e4.i.f36531e;
    }

    @Override // j$.time.chrono.j
    public final ZoneId getZone() {
        return this.f68494c;
    }

    @Override // j$.time.chrono.j
    public final j v(ZoneId zoneId) {
        return t(zoneId, this.f68493b, this.f68492a);
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i10 = k.f68490a[aVar.ordinal()];
            if (i10 == 1) {
                return j(j10 - toEpochSecond(), ChronoUnit.SECONDS);
            }
            if (i10 == 2) {
                ZoneOffset zoneOffsetL = ZoneOffset.L(aVar.f68639b.a(j10, aVar));
                Instant instantOfEpochSecond = Instant.ofEpochSecond(this.f68492a.p(zoneOffsetL), r5.f68479b.f68614d);
                ZoneId zoneId = this.f68494c;
                m chronology = getChronology();
                ZoneOffset zoneOffsetD = zoneId.r().d(instantOfEpochSecond);
                Objects.requireNonNull(zoneOffsetD, "offset");
                return new l(zoneId, zoneOffsetD, (g) chronology.y(LocalDateTime.I(instantOfEpochSecond.getEpochSecond(), instantOfEpochSecond.getNano(), zoneOffsetD)));
            }
            return t(this.f68494c, this.f68493b, this.f68492a.g(j10, pVar));
        }
        return r(getChronology(), pVar.G(this, j10));
    }

    @Override // j$.time.temporal.l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final l j(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            return (l) w(this.f68492a.j(j10, rVar));
        }
        return r(getChronology(), rVar.r(this, j10));
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }
}
