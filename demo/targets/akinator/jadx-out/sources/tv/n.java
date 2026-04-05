package tv;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f87449e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final n f87450f = new n(-31557014167219200L, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final n f87451g = new n(31556889864403199L, 999999999);

    /* renamed from: b, reason: collision with root package name */
    public final long f87452b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87453c;

    public n(long j10, int i10) {
        this.f87452b = j10;
        this.f87453c = i10;
        if (-31557014167219200L > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f87452b == nVar.f87452b && this.f87453c == nVar.f87453c;
    }

    public final long getEpochSeconds() {
        return this.f87452b;
    }

    public final int getNanosecondsOfSecond() {
        return this.f87453c;
    }

    public int hashCode() {
        return (this.f87453c * 51) + Long.hashCode(this.f87452b);
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public final n m7226minusLRDsOJo(long j10) {
        return m7228plusLRDsOJo(f.m7223unaryMinusUwyO8pc(j10));
    }

    /* renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m7227minusUwyO8pc(n other) {
        e0.checkNotNullParameter(other, "other");
        e eVar = f.f87433c;
        return f.m7208plusLRDsOJo(h.toDuration(this.f87452b - other.f87452b, i.f87442g), h.toDuration(this.f87453c - other.f87453c, i.f87439c));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public final n m7228plusLRDsOJo(long j10) {
        long jM7198getInWholeSecondsimpl = f.m7198getInWholeSecondsimpl(j10);
        int iM7200getNanosecondsComponentimpl = f.m7200getNanosecondsComponentimpl(j10);
        if (jM7198getInWholeSecondsimpl == 0 && iM7200getNanosecondsComponentimpl == 0) {
            return this;
        }
        long j11 = this.f87452b;
        long j12 = j11 + jM7198getInWholeSecondsimpl;
        if ((j11 ^ j12) >= 0 || (jM7198getInWholeSecondsimpl ^ j11) < 0) {
            return f87449e.fromEpochSeconds(j12, this.f87453c + iM7200getNanosecondsComponentimpl);
        }
        return f.m7206isPositiveimpl(j10) ? f87451g : f87450f;
    }

    public final long toEpochMilliseconds() {
        long j10 = this.f87452b;
        int i10 = this.f87453c;
        long j11 = 1000;
        if (j10 >= 0) {
            if (j10 != 1) {
                if (j10 != 0) {
                    long j12 = j10 * 1000;
                    if (j12 / 1000 != j10) {
                        return Long.MAX_VALUE;
                    }
                    j11 = j12;
                } else {
                    j11 = 0;
                }
            }
            long j13 = i10 / 1000000;
            long j14 = j11 + j13;
            if ((j11 ^ j14) >= 0 || (j13 ^ j11) < 0) {
                return j14;
            }
            return Long.MAX_VALUE;
        }
        long j15 = j10 + 1;
        if (j15 != 1) {
            if (j15 != 0) {
                long j16 = j15 * 1000;
                if (j16 / 1000 != j15) {
                    return Long.MIN_VALUE;
                }
                j11 = j16;
            } else {
                j11 = 0;
            }
        }
        long j17 = (i10 / 1000000) - 1000;
        long j18 = j11 + j17;
        if ((j11 ^ j18) >= 0 || (j17 ^ j11) < 0) {
            return j18;
        }
        return Long.MIN_VALUE;
    }

    public String toString() {
        return p.access$formatIso(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(n other) {
        e0.checkNotNullParameter(other, "other");
        int iCompare = e0.compare(this.f87452b, other.f87452b);
        return iCompare != 0 ? iCompare : e0.compare(this.f87453c, other.f87453c);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static /* synthetic */ n fromEpochSeconds$default(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j11 = 0;
            }
            return aVar.fromEpochSeconds(j10, j11);
        }

        public final n fromEpochMilliseconds(long j10) {
            long j11 = j10 / 1000;
            if ((j10 ^ 1000) < 0 && j11 * 1000 != j10) {
                j11--;
            }
            long j12 = j10 % 1000;
            return j11 < -31557014167219200L ? getMIN$kotlin_stdlib() : j11 > 31556889864403199L ? getMAX$kotlin_stdlib() : fromEpochSeconds(j11, (int) ((j12 + (1000 & (((j12 ^ 1000) & ((-j12) | j12)) >> 63))) * 1000000));
        }

        public final n fromEpochSeconds(long j10, long j11) {
            long j12 = j11 / C.NANOS_PER_SECOND;
            if ((j11 ^ C.NANOS_PER_SECOND) < 0 && j12 * C.NANOS_PER_SECOND != j11) {
                j12--;
            }
            long j13 = j10 + j12;
            if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                return j10 > 0 ? n.f87449e.getMAX$kotlin_stdlib() : n.f87449e.getMIN$kotlin_stdlib();
            }
            if (j13 < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (j13 > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            long j14 = j11 % C.NANOS_PER_SECOND;
            return new n(j13, (int) (j14 + ((((j14 ^ C.NANOS_PER_SECOND) & ((-j14) | j14)) >> 63) & C.NANOS_PER_SECOND)));
        }

        public final n getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        public final n getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        public final n getMAX$kotlin_stdlib() {
            return n.f87451g;
        }

        public final n getMIN$kotlin_stdlib() {
            return n.f87450f;
        }

        @tu.f
        public final n now() {
            throw new tu.u(null, 1, null);
        }

        public final n parse(CharSequence input) {
            e0.checkNotNullParameter(input, "input");
            return p.access$parseIso(input).toInstant();
        }

        public final n parseOrNull(CharSequence input) {
            e0.checkNotNullParameter(input, "input");
            return p.access$parseIso(input).toInstantOrNull();
        }

        public final n fromEpochSeconds(long j10, int i10) {
            return fromEpochSeconds(j10, i10);
        }
    }
}
