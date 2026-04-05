package j$.time.chrono;

import com.amazon.device.ads.DTBMetricReport;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class g implements e, j$.time.temporal.l, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a, reason: collision with root package name */
    public final transient b f68478a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.k f68479b;

    public static g r(m mVar, j$.time.temporal.l lVar) {
        g gVar = (g) lVar;
        if (mVar.equals(gVar.getChronology())) {
            return gVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.k() + ", actual: " + gVar.getChronology().k());
    }

    public g(b bVar, j$.time.k kVar) {
        Objects.requireNonNull(kVar, DTBMetricReport.TIME);
        this.f68478a = bVar;
        this.f68479b = kVar;
    }

    public final g I(j$.time.temporal.l lVar, j$.time.k kVar) {
        b bVar = this.f68478a;
        return (bVar == lVar && this.f68479b == kVar) ? this : new g(d.r(bVar.getChronology(), lVar), kVar);
    }

    public final int hashCode() {
        return this.f68478a.hashCode() ^ this.f68479b.hashCode();
    }

    @Override // j$.time.chrono.e
    public final b toLocalDate() {
        return this.f68478a;
    }

    public final String toString() {
        return this.f68478a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f68479b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.k toLocalTime() {
        return this.f68479b;
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
            return (((j$.time.temporal.a) pVar).J() ? this.f68479b : this.f68478a).i(pVar);
        }
        return pVar.t(this);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.f68479b.d(pVar) : this.f68478a.d(pVar);
        }
        return i(pVar).a(f(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.f68479b.f(pVar) : this.f68478a.f(pVar);
        }
        return pVar.D(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(j$.time.h hVar) {
        return I(hVar, this.f68479b);
    }

    @Override // j$.time.temporal.l
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final g g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).J()) {
                return I(this.f68478a, this.f68479b.g(j10, pVar));
            }
            return I(this.f68478a.g(j10, pVar), this.f68479b);
        }
        return r(this.f68478a.getChronology(), pVar.G(this, j10));
    }

    @Override // j$.time.temporal.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final g j(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return r(this.f68478a.getChronology(), rVar.r(this, j10));
        }
        switch (f.f68475a[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return D(this.f68478a, 0L, 0L, 0L, j10);
            case 2:
                g gVarI = I(this.f68478a.j(j10 / 86400000000L, (j$.time.temporal.r) ChronoUnit.DAYS), this.f68479b);
                return gVarI.D(gVarI.f68478a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                g gVarI2 = I(this.f68478a.j(j10 / 86400000, (j$.time.temporal.r) ChronoUnit.DAYS), this.f68479b);
                return gVarI2.D(gVarI2.f68478a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return D(this.f68478a, 0L, 0L, j10, 0L);
            case 5:
                return D(this.f68478a, 0L, j10, 0L, 0L);
            case 6:
                return D(this.f68478a, j10, 0L, 0L, 0L);
            case 7:
                g gVarI3 = I(this.f68478a.j(j10 / 256, (j$.time.temporal.r) ChronoUnit.DAYS), this.f68479b);
                return gVarI3.D(gVarI3.f68478a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return I(this.f68478a.j(j10, rVar), this.f68479b);
        }
    }

    public final g D(b bVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return I(bVar, this.f68479b);
        }
        long j14 = j10 / 24;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * C.NANOS_PER_SECOND) + (j13 % 86400000000000L);
        long jP = this.f68479b.P();
        long j16 = j15 + jP;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return I(bVar.j(jFloorDiv, (j$.time.temporal.r) ChronoUnit.DAYS), jFloorMod == jP ? this.f68479b : j$.time.k.I(jFloorMod));
    }

    @Override // j$.time.chrono.e
    public final j n(ZoneOffset zoneOffset) {
        return l.t(zoneOffset, null, this);
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }
}
