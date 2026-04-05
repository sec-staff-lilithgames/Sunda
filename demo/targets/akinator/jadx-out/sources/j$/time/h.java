package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h implements j$.time.temporal.l, j$.time.temporal.n, j$.time.chrono.b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final h f68599d = M(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h f68600e = M(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    public final int f68601a;

    /* renamed from: b, reason: collision with root package name */
    public final short f68602b;

    /* renamed from: c, reason: collision with root package name */
    public final short f68603c;

    static {
        M(1970, 1, 1);
    }

    public static h M(int i10, int i11, int i12) {
        j$.time.temporal.a.YEAR.I(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.I(i11);
        j$.time.temporal.a.DAY_OF_MONTH.I(i12);
        return t(i10, i11, i12);
    }

    public static h N(long j10) {
        long j11;
        j$.time.temporal.a.EPOCH_DAY.I(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + (i11 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new h(aVar.f68639b.a(j16, aVar), i12, i13);
    }

    public static h D(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "temporal");
        h hVar = (h) mVar.b(j$.time.temporal.q.f68661f);
        if (hVar != null) {
            return hVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName());
    }

    public static h t(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (j$.time.chrono.t.f68512c.H(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.G(i11).name() + " " + i12 + "'");
            }
        }
        return new h(i10, i11, i12);
    }

    public static h S(int i10, int i11, int i12) {
        if (i11 == 2) {
            i12 = Math.min(i12, j$.time.chrono.t.f68512c.H((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new h(i10, i11, i12);
    }

    public h(int i10, int i11, int i12) {
        this.f68601a = i10;
        this.f68602b = (short) i11;
        this.f68603c = (short) i12;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
        int i10 = g.f68597a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.t.e(1L, K());
        }
        if (i10 == 2) {
            return j$.time.temporal.t.e(1L, E());
        }
        if (i10 != 3) {
            return i10 != 4 ? aVar.f68639b : this.f68601a <= 0 ? j$.time.temporal.t.e(1L, C.NANOS_PER_SECOND) : j$.time.temporal.t.e(1L, 999999999L);
        }
        return j$.time.temporal.t.e(1L, (m.G(this.f68602b) != m.FEBRUARY || s()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return G(pVar);
        }
        return super.d(pVar);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return z();
            }
            if (pVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return G(pVar);
            }
            return ((this.f68601a * 12) + this.f68602b) - 1;
        }
        return pVar.D(this);
    }

    public final int G(j$.time.temporal.p pVar) {
        switch (g.f68597a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f68603c;
            case 2:
                return J();
            case 3:
                return ((this.f68603c - 1) / 7) + 1;
            case 4:
                int i10 = this.f68601a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return I().getValue();
            case 6:
                return ((this.f68603c - 1) % 7) + 1;
            case 7:
                return ((J() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((J() - 1) / 7) + 1;
            case 10:
                return this.f68602b;
            case 11:
                throw new j$.time.temporal.s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f68601a;
            case 13:
                return this.f68601a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m getChronology() {
        return j$.time.chrono.t.f68512c;
    }

    public final int J() {
        return (m.G(this.f68602b).r(s()) + this.f68603c) - 1;
    }

    public final e I() {
        return e.r(((int) Math.floorMod(z() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.b
    public final boolean s() {
        return j$.time.chrono.t.f68512c.H(this.f68601a);
    }

    public final int K() {
        short s10 = this.f68602b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : s() ? 29 : 28;
    }

    @Override // j$.time.chrono.b
    public final int E() {
        return s() ? 366 : 365;
    }

    @Override // j$.time.temporal.l
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final h w(j$.time.temporal.n nVar) {
        if (nVar instanceof h) {
            return (h) nVar;
        }
        return (h) nVar.c(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final h g(long j10, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (h) pVar.G(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j10);
        switch (g.f68597a[aVar.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                if (this.f68603c != i10) {
                    return M(this.f68601a, this.f68602b, i10);
                }
                return this;
            case 2:
                return V((int) j10);
            case 3:
                return P(Math.multiplyExact(j10 - f(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.f68601a < 1) {
                    j10 = 1 - j10;
                }
                return W((int) j10);
            case 5:
                return P(j10 - I().getValue());
            case 6:
                return P(j10 - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return P(j10 - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return N(j10);
            case 9:
                return P(Math.multiplyExact(j10 - f(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i11 = (int) j10;
                if (this.f68602b != i11) {
                    j$.time.temporal.a.MONTH_OF_YEAR.I(i11);
                    return S(this.f68601a, i11, this.f68603c);
                }
                return this;
            case 11:
                return Q(j10 - (((this.f68601a * 12) + this.f68602b) - 1));
            case 12:
                return W((int) j10);
            case 13:
                if (f(j$.time.temporal.a.ERA) != j10) {
                    return W(1 - this.f68601a);
                }
                return this;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
    }

    public final h W(int i10) {
        if (this.f68601a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.I(i10);
        return S(i10, this.f68602b, this.f68603c);
    }

    public final h V(int i10) {
        if (J() == i10) {
            return this;
        }
        int i11 = this.f68601a;
        long j10 = i11;
        j$.time.temporal.a.YEAR.I(j10);
        j$.time.temporal.a.DAY_OF_YEAR.I(i10);
        boolean zH = j$.time.chrono.t.f68512c.H(j10);
        if (i10 == 366 && !zH) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i11 + "' is not a leap year");
        }
        m mVarG = m.G(((i10 - 1) / 31) + 1);
        if (i10 > (mVarG.t(zH) + mVarG.r(zH)) - 1) {
            mVarG = m.f68616a[((((int) 1) + 12) + mVarG.ordinal()) % 12];
        }
        return new h(i11, mVarG.getValue(), (i10 - mVarG.r(zH)) + 1);
    }

    @Override // j$.time.temporal.l
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final h j(long j10, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (h) rVar.r(this, j10);
        }
        switch (g.f68598b[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return P(j10);
            case 2:
                return P(Math.multiplyExact(j10, 7));
            case 3:
                return Q(j10);
            case 4:
                return R(j10);
            case 5:
                return R(Math.multiplyExact(j10, 10));
            case 6:
                return R(Math.multiplyExact(j10, 100));
            case 7:
                return R(Math.multiplyExact(j10, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return g(Math.addExact(f(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public final h R(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return S(aVar.f68639b.a(this.f68601a + j10, aVar), this.f68602b, this.f68603c);
    }

    public final h Q(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f68601a * 12) + (this.f68602b - 1) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return S(aVar.f68639b.a(Math.floorDiv(j11, j12), aVar), ((int) Math.floorMod(j11, j12)) + 1, this.f68603c);
    }

    public final h P(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.f68603c + j10;
        if (j11 > 0) {
            if (j11 <= 28) {
                return new h(this.f68601a, this.f68602b, (int) j11);
            }
            if (j11 <= 59) {
                long jK = K();
                if (j11 <= jK) {
                    return new h(this.f68601a, this.f68602b, (int) j11);
                }
                short s10 = this.f68602b;
                if (s10 < 12) {
                    return new h(this.f68601a, s10 + 1, (int) (j11 - jK));
                }
                j$.time.temporal.a.YEAR.I(this.f68601a + 1);
                return new h(this.f68601a + 1, 1, (int) (j11 - jK));
            }
        }
        return N(Math.addExact(z(), j10));
    }

    @Override // j$.time.temporal.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final h a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.f68661f ? this : super.b(aVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e A(k kVar) {
        return LocalDateTime.G(this, kVar);
    }

    @Override // j$.time.chrono.b
    public final long z() {
        long j10 = this.f68601a;
        long j11 = this.f68602b;
        long j12 = 365 * j10;
        long j13 = (((367 * j11) - 362) / 12) + (j10 >= 0 ? ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12 : j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))))) + (this.f68603c - 1);
        if (j11 > 2) {
            j13 = !s() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // j$.time.chrono.b, java.lang.Comparable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof h) {
            return r((h) bVar);
        }
        return super.compareTo(bVar);
    }

    public final int r(h hVar) {
        int i10 = this.f68601a - hVar.f68601a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f68602b - hVar.f68602b;
        return i11 == 0 ? this.f68603c - hVar.f68603c : i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && r((h) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.f68601a;
        return (((i10 << 11) + (this.f68602b << 6)) + this.f68603c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i10 = this.f68601a;
        short s10 = this.f68602b;
        short s11 = this.f68603c;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
