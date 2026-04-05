package j$.time;

import com.amazon.device.ads.DTBMetricReport;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class q implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f68623c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a, reason: collision with root package name */
    public final k f68624a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset f68625b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        if (this.f68625b.equals(qVar.f68625b)) {
            return this.f68624a.compareTo(qVar.f68624a);
        }
        int iCompare = Long.compare(this.f68624a.P() - (this.f68625b.f68463b * C.NANOS_PER_SECOND), qVar.f68624a.P() - (qVar.f68625b.f68463b * C.NANOS_PER_SECOND));
        return iCompare == 0 ? this.f68624a.compareTo(qVar.f68624a) : iCompare;
    }

    static {
        k kVar = k.f68607e;
        ZoneOffset zoneOffset = ZoneOffset.f68462g;
        kVar.getClass();
        new q(kVar, zoneOffset);
        k kVar2 = k.f68608f;
        ZoneOffset zoneOffset2 = ZoneOffset.f68461f;
        kVar2.getClass();
        new q(kVar2, zoneOffset2);
    }

    public q(k kVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(kVar, DTBMetricReport.TIME);
        this.f68624a = kVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f68625b = zoneOffset;
    }

    public final q t(k kVar, ZoneOffset zoneOffset) {
        return (this.f68624a == kVar && this.f68625b.equals(zoneOffset)) ? this : new q(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).J() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f68624a.i(pVar);
            }
            return ((j$.time.temporal.a) pVar).f68639b;
        }
        return pVar.t(this);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f68625b.f68463b;
            }
            return this.f68624a.f(pVar);
        }
        return pVar.D(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        return (q) hVar.c(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                return t(this.f68624a, ZoneOffset.L(aVar.f68639b.a(j10, aVar)));
            }
            return t(this.f68624a.g(j10, pVar), this.f68625b);
        }
        return (q) pVar.G(this, j10);
    }

    @Override // j$.time.temporal.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final q j(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            return t(this.f68624a.j(j10, rVar), this.f68625b);
        }
        return (q) rVar.r(this, j10);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68659d || aVar == j$.time.temporal.q.f68660e) {
            return this.f68625b;
        }
        if (((aVar == j$.time.temporal.q.f68656a) || (aVar == j$.time.temporal.q.f68657b)) || aVar == j$.time.temporal.q.f68661f) {
            return null;
        }
        if (aVar == j$.time.temporal.q.f68662g) {
            return this.f68624a;
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(this.f68624a.P(), j$.time.temporal.a.NANO_OF_DAY).g(this.f68625b.f68463b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f68624a.equals(qVar.f68624a) && this.f68625b.equals(qVar.f68625b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68624a.hashCode() ^ this.f68625b.f68463b;
    }

    public final String toString() {
        return this.f68624a.toString() + this.f68625b.f68464c;
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
