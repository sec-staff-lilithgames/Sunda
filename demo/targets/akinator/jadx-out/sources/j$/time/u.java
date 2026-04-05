package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.format.a0;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class u implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f68684b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    public final int f68685a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f68685a - ((u) obj).f68685a;
    }

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.l(j$.time.temporal.a.YEAR, 4, 10, a0.EXCEEDS_PAD);
        sVar.p(Locale.getDefault(), j$.time.format.z.SMART, null);
    }

    public static u r(int i10) {
        j$.time.temporal.a.YEAR.I(i10);
        return new u(i10);
    }

    public u(int i10) {
        this.f68685a = i10;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.e(1L, this.f68685a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return super.i(pVar);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return i(pVar).a(f(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.D(this);
        }
        int i10 = t.f68632a[((j$.time.temporal.a) pVar).ordinal()];
        if (i10 == 1) {
            int i11 = this.f68685a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f68685a;
        }
        if (i10 == 3) {
            return this.f68685a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        return (u) hVar.c(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final u g(long j10, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (u) pVar.G(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j10);
        int i10 = t.f68632a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f68685a < 1) {
                j10 = 1 - j10;
            }
            return r((int) j10);
        }
        if (i10 == 2) {
            return r((int) j10);
        }
        if (i10 == 3) {
            return f(j$.time.temporal.a.ERA) == j10 ? this : r(1 - this.f68685a);
        }
        throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final u j(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (u) rVar.r(this, j10);
        }
        int i10 = t.f68633b[((ChronoUnit) rVar).ordinal()];
        if (i10 == 1) {
            return D(j10);
        }
        if (i10 == 2) {
            return D(Math.multiplyExact(j10, 10));
        }
        if (i10 == 3) {
            return D(Math.multiplyExact(j10, 100));
        }
        if (i10 == 4) {
            return D(Math.multiplyExact(j10, 1000));
        }
        if (i10 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return g(Math.addExact(f(aVar), j10), aVar);
        }
        throw new j$.time.temporal.s("Unsupported unit: " + rVar);
    }

    public final u D(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return r(aVar.f68639b.a(this.f68685a + j10, aVar));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68657b) {
            return j$.time.chrono.t.f68512c;
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.YEARS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.m.l(lVar).equals(j$.time.chrono.t.f68512c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return lVar.g(this.f68685a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f68685a == ((u) obj).f68685a;
    }

    public final int hashCode() {
        return this.f68685a;
    }

    public final String toString() {
        return Integer.toString(this.f68685a);
    }

    private Object writeReplace() {
        return new s((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
