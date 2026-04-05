package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.format.a0;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class w implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f68688c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    public final int f68689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68690b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        int i10 = this.f68689a - wVar.f68689a;
        return i10 == 0 ? this.f68690b - wVar.f68690b : i10;
    }

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.l(j$.time.temporal.a.YEAR, 4, 10, a0.EXCEEDS_PAD);
        sVar.c('-');
        sVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        sVar.p(Locale.getDefault(), j$.time.format.z.SMART, null);
    }

    public w(int i10, int i11) {
        this.f68689a = i10;
        this.f68690b = i11;
    }

    public final w I(int i10, int i11) {
        return (this.f68689a == i10 && this.f68690b == i11) ? this : new w(i10, i11);
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.e(1L, this.f68689a <= 0 ? C.NANOS_PER_SECOND : 999999999L);
        }
        return super.i(pVar);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        return i(pVar).a(f(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        int i10;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.D(this);
        }
        int i11 = v.f68686a[((j$.time.temporal.a) pVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f68690b;
        } else {
            if (i11 == 2) {
                return r();
            }
            if (i11 == 3) {
                int i12 = this.f68689a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f68689a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
            }
            i10 = this.f68689a;
        }
        return i10;
    }

    public final long r() {
        return ((this.f68689a * 12) + this.f68690b) - 1;
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        return (w) hVar.c(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final w g(long j10, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (w) pVar.G(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j10);
        int i10 = v.f68686a[aVar.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            j$.time.temporal.a.MONTH_OF_YEAR.I(i11);
            return I(this.f68689a, i11);
        }
        if (i10 == 2) {
            return D(j10 - r());
        }
        if (i10 == 3) {
            if (this.f68689a < 1) {
                j10 = 1 - j10;
            }
            int i12 = (int) j10;
            j$.time.temporal.a.YEAR.I(i12);
            return I(i12, this.f68690b);
        }
        if (i10 == 4) {
            int i13 = (int) j10;
            j$.time.temporal.a.YEAR.I(i13);
            return I(i13, this.f68690b);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
        if (f(j$.time.temporal.a.ERA) == j10) {
            return this;
        }
        int i14 = 1 - this.f68689a;
        j$.time.temporal.a.YEAR.I(i14);
        return I(i14, this.f68690b);
    }

    @Override // j$.time.temporal.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final w j(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (w) rVar.r(this, j10);
        }
        switch (v.f68687b[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return D(j10);
            case 2:
                return G(j10);
            case 3:
                return G(Math.multiplyExact(j10, 10));
            case 4:
                return G(Math.multiplyExact(j10, 100));
            case 5:
                return G(Math.multiplyExact(j10, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return g(Math.addExact(f(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public final w G(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return I(aVar.f68639b.a(this.f68689a + j10, aVar), this.f68690b);
    }

    public final w D(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f68689a * 12) + (this.f68690b - 1) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return I(aVar.f68639b.a(Math.floorDiv(j11, j12), aVar), ((int) Math.floorMod(j11, j12)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.m.l(lVar).equals(j$.time.chrono.t.f68512c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return lVar.g(r(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f68689a == wVar.f68689a && this.f68690b == wVar.f68690b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f68689a ^ (this.f68690b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f68689a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f68689a;
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f68689a);
        }
        sb2.append(this.f68690b < 10 ? "-0" : "-");
        sb2.append(this.f68690b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
