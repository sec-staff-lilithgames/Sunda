package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.ktor.util.date.GMTDateParser;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class Duration implements Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    public final long f68446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68447b;

    static {
        BigInteger.valueOf(C.NANOS_PER_SECOND);
    }

    public static Duration ofMinutes(long j10) {
        return r(Math.multiplyExact(j10, 60), 0);
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return r(j11, i10 * 1000000);
    }

    public static Duration ofNanos(long j10) {
        long j11 = j10 / C.NANOS_PER_SECOND;
        int i10 = (int) (j10 % C.NANOS_PER_SECOND);
        if (i10 < 0) {
            i10 = (int) (i10 + C.NANOS_PER_SECOND);
            j11--;
        }
        return r(j11, i10);
    }

    public static Duration r(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return ZERO;
        }
        return new Duration(j10, i10);
    }

    public Duration(long j10, int i10) {
        this.f68446a = j10;
        this.f68447b = i10;
    }

    public boolean isZero() {
        return (this.f68446a | ((long) this.f68447b)) == 0;
    }

    public boolean isNegative() {
        return this.f68446a < 0;
    }

    public long getSeconds() {
        return this.f68446a;
    }

    public int getNano() {
        return this.f68447b;
    }

    public long toMillis() {
        long j10 = this.f68446a;
        long j11 = this.f68447b;
        if (j10 < 0) {
            j10++;
            j11 -= C.NANOS_PER_SECOND;
        }
        return Math.addExact(Math.multiplyExact(j10, 1000), j11 / 1000000);
    }

    public long toNanos() {
        long j10 = this.f68446a;
        long j11 = this.f68447b;
        if (j10 < 0) {
            j10++;
            j11 -= C.NANOS_PER_SECOND;
        }
        return Math.addExact(Math.multiplyExact(j10, C.NANOS_PER_SECOND), j11);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.f68446a, duration.f68446a);
        return iCompare != 0 ? iCompare : this.f68447b - duration.f68447b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f68446a == duration.f68446a && this.f68447b == duration.f68447b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f68446a;
        return (this.f68447b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j10 = this.f68446a;
        if (j10 < 0 && this.f68447b > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(GMTDateParser.MONTH);
        }
        if (i11 == 0 && this.f68447b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f68446a < 0 && this.f68447b > 0 && i11 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i11);
        }
        if (this.f68447b > 0) {
            int length = sb2.length();
            if (this.f68446a < 0) {
                sb2.append(2000000000 - this.f68447b);
            } else {
                sb2.append(this.f68447b + C.NANOS_PER_SECOND);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
