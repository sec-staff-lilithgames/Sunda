package j$.time;

import com.amazon.device.ads.DTBMetricReport;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.n, j$.time.chrono.e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f68451c = G(h.f68599d, k.f68607e);

    /* renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f68452d = G(h.f68600e, k.f68608f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a, reason: collision with root package name */
    public final h f68453a;

    /* renamed from: b, reason: collision with root package name */
    public final k f68454b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j n(ZoneOffset zoneOffset) {
        return z.t(this, zoneOffset, null);
    }

    public static LocalDateTime G(h hVar, k kVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(kVar, DTBMetricReport.TIME);
        return new LocalDateTime(hVar, kVar);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return I(instant.getEpochSecond(), instant.getNano(), zoneId.r().d(instant));
    }

    public static LocalDateTime I(long j10, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.I(j11);
        return new LocalDateTime(h.N(Math.floorDiv(j10 + zoneOffset.f68463b, 86400)), k.I((((int) Math.floorMod(r5, r7)) * C.NANOS_PER_SECOND) + j11));
    }

    public static LocalDateTime t(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDateTime) {
            return (LocalDateTime) mVar;
        }
        if (!(mVar instanceof z)) {
            if (mVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) mVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(h.D(mVar), k.D(mVar));
            } catch (c e10) {
                throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName(), e10);
            }
        }
        return ((z) mVar).f68695a;
    }

    public LocalDateTime(h hVar, k kVar) {
        this.f68453a = hVar;
        this.f68454b = kVar;
    }

    public final LocalDateTime N(h hVar, k kVar) {
        return (this.f68453a == hVar && this.f68454b == kVar) ? this : new LocalDateTime(hVar, kVar);
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.r(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.J();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.f68454b.i(pVar) : this.f68453a.i(pVar);
        }
        return pVar.t(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.f68454b.d(pVar) : this.f68453a.d(pVar);
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.f68454b.f(pVar) : this.f68453a.f(pVar);
        }
        return pVar.D(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b toLocalDate() {
        return this.f68453a;
    }

    @Override // j$.time.chrono.e
    public final k toLocalTime() {
        return this.f68454b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        return N(hVar, this.f68454b);
    }

    @Override // j$.time.temporal.l
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).J()) {
                return N(this.f68453a, this.f68454b.g(j10, pVar));
            }
            return N(this.f68453a.g(j10, pVar), this.f68454b);
        }
        return (LocalDateTime) pVar.G(this, j10);
    }

    @Override // j$.time.temporal.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime j(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (LocalDateTime) rVar.r(this, j10);
        }
        switch (i.f68604a[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return L(this.f68453a, 0L, 0L, 0L, j10);
            case 2:
                LocalDateTime localDateTimeN = N(this.f68453a.P(j10 / 86400000000L), this.f68454b);
                return localDateTimeN.L(localDateTimeN.f68453a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeN2 = N(this.f68453a.P(j10 / 86400000), this.f68454b);
                return localDateTimeN2.L(localDateTimeN2.f68453a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return K(j10);
            case 5:
                return L(this.f68453a, 0L, j10, 0L, 0L);
            case 6:
                return L(this.f68453a, j10, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeN3 = N(this.f68453a.P(j10 / 256), this.f68454b);
                return localDateTimeN3.L(localDateTimeN3.f68453a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return N(this.f68453a.j(j10, rVar), this.f68454b);
        }
    }

    public final LocalDateTime K(long j10) {
        return L(this.f68453a, 0L, 0L, j10, 0L);
    }

    @Override // j$.time.temporal.l
    public final j$.time.chrono.e a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    public final LocalDateTime L(h hVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return N(hVar, this.f68454b);
        }
        long j14 = 1;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * C.NANOS_PER_SECOND) + (j13 % 86400000000000L);
        long jP = this.f68454b.P();
        long j16 = (j15 * j14) + jP;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + (((j10 / 24) + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L)) * j14);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return N(hVar.P(jFloorDiv), jFloorMod == jP ? this.f68454b : k.I(jFloorMod));
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68661f) {
            return this.f68453a;
        }
        return super.b(aVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.e, java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return r((LocalDateTime) eVar);
        }
        return super.compareTo(eVar);
    }

    public final int r(LocalDateTime localDateTime) {
        int iR = this.f68453a.r(localDateTime.f68453a);
        return iR == 0 ? this.f68454b.compareTo(localDateTime.f68454b) : iR;
    }

    public final boolean D(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return r((LocalDateTime) eVar) < 0;
        }
        long jZ = this.f68453a.z();
        long jZ2 = eVar.toLocalDate().z();
        if (jZ >= jZ2) {
            return jZ == jZ2 && this.f68454b.P() < eVar.toLocalTime().P();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f68453a.equals(localDateTime.f68453a) && this.f68454b.equals(localDateTime.f68454b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68453a.hashCode() ^ this.f68454b.hashCode();
    }

    public final String toString() {
        return this.f68453a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f68454b.toString();
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
