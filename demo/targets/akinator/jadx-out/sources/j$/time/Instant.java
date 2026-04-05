package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sfbx.appconsent.core.BuildConfig;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.l, j$.time.temporal.n, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a, reason: collision with root package name */
    public final long f68449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68450b;

    /* renamed from: c, reason: collision with root package name */
    public static final Instant f68448c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        a.f68465b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f68449a, instant2.f68449a);
        return iCompare != 0 ? iCompare : this.f68450b - instant2.f68450b;
    }

    public static Instant ofEpochSecond(long j10, long j11) {
        return r(Math.addExact(j10, Math.floorDiv(j11, C.NANOS_PER_SECOND)), (int) Math.floorMod(j11, C.NANOS_PER_SECOND));
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = 1000;
        return r(Math.floorDiv(j10, j11), ((int) Math.floorMod(j10, j11)) * 1000000);
    }

    public static Instant t(j$.time.temporal.m mVar) {
        if (mVar instanceof Instant) {
            return (Instant) mVar;
        }
        Objects.requireNonNull(mVar, "temporal");
        try {
            return ofEpochSecond(mVar.f(j$.time.temporal.a.INSTANT_SECONDS), mVar.d(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e10) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName(), e10);
        }
    }

    public static Instant r(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return f68448c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    public Instant(long j10, int i10) {
        this.f68449a = j10;
        this.f68450b = i10;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return super.i(pVar).a(pVar.D(this), pVar);
        }
        int i10 = f.f68528a[((j$.time.temporal.a) pVar).ordinal()];
        if (i10 == 1) {
            return this.f68450b;
        }
        if (i10 == 2) {
            return this.f68450b / 1000;
        }
        if (i10 == 3) {
            return this.f68450b / 1000000;
        }
        if (i10 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f68639b.a(this.f68449a, aVar);
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        int i10;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.D(this);
        }
        int i11 = f.f68528a[((j$.time.temporal.a) pVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f68450b;
        } else if (i11 == 2) {
            i10 = this.f68450b / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f68449a;
                }
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
            }
            i10 = this.f68450b / 1000000;
        }
        return i10;
    }

    public long getEpochSecond() {
        return this.f68449a;
    }

    public int getNano() {
        return this.f68450b;
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        return (Instant) hVar.c(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j10, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.G(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j10);
        int i10 = f.f68528a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = ((int) j10) * 1000;
                if (i11 != this.f68450b) {
                    return r(this.f68449a, i11);
                }
            } else if (i10 == 3) {
                int i12 = ((int) j10) * 1000000;
                if (i12 != this.f68450b) {
                    return r(this.f68449a, i12);
                }
            } else {
                if (i10 != 4) {
                    throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
                }
                if (j10 != this.f68449a) {
                    return r(j10, this.f68450b);
                }
            }
        } else if (j10 != this.f68450b) {
            return r(this.f68449a, (int) j10);
        }
        return this;
    }

    @Override // j$.time.temporal.l
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final Instant j(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (Instant) rVar.r(this, j10);
        }
        switch (f.f68529b[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return D(0L, j10);
            case 2:
                return D(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return D(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return D(j10, 0L);
            case 5:
                return D(Math.multiplyExact(j10, 60), 0L);
            case 6:
                return D(Math.multiplyExact(j10, BuildConfig.VERSION_CODE), 0L);
            case 7:
                return D(Math.multiplyExact(j10, 43200), 0L);
            case 8:
                return D(Math.multiplyExact(j10, 86400), 0L);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public final Instant D(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f68449a, j10), j11 / C.NANOS_PER_SECOND), this.f68450b + (j11 % C.NANOS_PER_SECOND));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.NANOS;
        }
        if (aVar == j$.time.temporal.q.f68657b || aVar == j$.time.temporal.q.f68656a || aVar == j$.time.temporal.q.f68660e || aVar == j$.time.temporal.q.f68659d || aVar == j$.time.temporal.q.f68661f || aVar == j$.time.temporal.q.f68662g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(this.f68449a, j$.time.temporal.a.INSTANT_SECONDS).g(this.f68450b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.r(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j10 = this.f68449a;
        return (j10 >= 0 || this.f68450b <= 0) ? Math.addExact(Math.multiplyExact(j10, 1000), this.f68450b / 1000000) : Math.addExact(Math.multiplyExact(j10 + 1, 1000), (this.f68450b / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f68449a == instant.f68449a && this.f68450b == instant.f68450b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f68449a;
        return (this.f68450b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f68530e.a(this);
    }

    private Object writeReplace() {
        return new s((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
