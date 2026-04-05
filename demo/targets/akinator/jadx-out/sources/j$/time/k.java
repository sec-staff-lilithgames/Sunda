package j$.time;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sfbx.appconsent.core.BuildConfig;
import j$.time.temporal.ChronoUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k implements j$.time.temporal.l, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final k f68607e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f68608f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f68609g;

    /* renamed from: h, reason: collision with root package name */
    public static final k[] f68610h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    public final byte f68611a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f68612b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f68613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68614d;

    static {
        int i10 = 0;
        while (true) {
            k[] kVarArr = f68610h;
            if (i10 < kVarArr.length) {
                kVarArr[i10] = new k(i10, 0, 0, 0);
                i10++;
            } else {
                k kVar = kVarArr[0];
                f68609g = kVar;
                k kVar2 = kVarArr[12];
                f68607e = kVar;
                f68608f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k I(long j10) {
        j$.time.temporal.a.NANO_OF_DAY.I(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i10 * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i11 * 60000000000L);
        int i12 = (int) (j12 / C.NANOS_PER_SECOND);
        return t(i10, i11, i12, (int) (j12 - (i12 * C.NANOS_PER_SECOND)));
    }

    public static k D(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "temporal");
        k kVar = (k) mVar.b(j$.time.temporal.q.f68662g);
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName());
    }

    public static k t(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f68610h[i10];
        }
        return new k(i10, i11, i12, i13);
    }

    public k(int i10, int i11, int i12, int i13) {
        this.f68611a = (byte) i10;
        this.f68612b = (byte) i11;
        this.f68613c = (byte) i12;
        this.f68614d = i13;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J();
        }
        return pVar != null && pVar.r(this);
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
            if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
                return P();
            }
            if (pVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return P() / 1000;
            }
            return G(pVar);
        }
        return pVar.D(this);
    }

    public final int G(j$.time.temporal.p pVar) {
        switch (j.f68605a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f68614d;
            case 2:
                throw new j$.time.temporal.s("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f68614d / 1000;
            case 4:
                throw new j$.time.temporal.s("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f68614d / 1000000;
            case 6:
                return (int) (P() / 1000000);
            case 7:
                return this.f68613c;
            case 8:
                return Q();
            case 9:
                return this.f68612b;
            case 10:
                return (this.f68611a * 60) + this.f68612b;
            case 11:
                return this.f68611a % 12;
            case 12:
                int i10 = this.f68611a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f68611a;
            case 14:
                byte b10 = this.f68611a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f68611a / 12;
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(h hVar) {
        return (k) hVar.c(this);
    }

    @Override // j$.time.temporal.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final k g(long j10, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (k) pVar.G(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j10);
        switch (j.f68605a[aVar.ordinal()]) {
            case 1:
                return S((int) j10);
            case 2:
                return I(j10);
            case 3:
                return S(((int) j10) * 1000);
            case 4:
                return I(j10 * 1000);
            case 5:
                return S(((int) j10) * 1000000);
            case 6:
                return I(j10 * 1000000);
            case 7:
                int i10 = (int) j10;
                if (this.f68613c != i10) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.I(i10);
                    return t(this.f68611a, this.f68612b, i10, this.f68614d);
                }
                return this;
            case 8:
                return N(j10 - Q());
            case 9:
                int i11 = (int) j10;
                if (this.f68612b != i11) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.I(i11);
                    return t(this.f68611a, i11, this.f68613c, this.f68614d);
                }
                return this;
            case 10:
                return L(j10 - ((this.f68611a * 60) + this.f68612b));
            case 11:
                return K(j10 - (this.f68611a % 12));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return K(j10 - (this.f68611a % 12));
            case 13:
                int i12 = (int) j10;
                if (this.f68611a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.I(i12);
                    return t(i12, this.f68612b, this.f68613c, this.f68614d);
                }
                return this;
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i13 = (int) j10;
                if (this.f68611a != i13) {
                    j$.time.temporal.a.HOUR_OF_DAY.I(i13);
                    return t(i13, this.f68612b, this.f68613c, this.f68614d);
                }
                return this;
            case 15:
                return K((j10 - (this.f68611a / 12)) * 12);
            default:
                throw new j$.time.temporal.s(d.a("Unsupported field: ", pVar));
        }
    }

    public final k S(int i10) {
        if (this.f68614d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.I(i10);
        return t(this.f68611a, this.f68612b, this.f68613c, i10);
    }

    @Override // j$.time.temporal.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final k j(long j10, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            switch (j.f68606b[((ChronoUnit) rVar).ordinal()]) {
                case 1:
                    return M(j10);
                case 2:
                    return M((j10 % 86400000000L) * 1000);
                case 3:
                    return M((j10 % 86400000) * 1000000);
                case 4:
                    return N(j10);
                case 5:
                    return L(j10);
                case 6:
                    return K(j10);
                case 7:
                    return K((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + rVar);
            }
        }
        return (k) rVar.r(this, j10);
    }

    public final k K(long j10) {
        return j10 == 0 ? this : t(((((int) (j10 % 24)) + this.f68611a) + 24) % 24, this.f68612b, this.f68613c, this.f68614d);
    }

    public final k L(long j10) {
        if (j10 != 0) {
            int i10 = (this.f68611a * 60) + this.f68612b;
            int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return t(i11 / 60, i11 % 60, this.f68613c, this.f68614d);
            }
        }
        return this;
    }

    public final k N(long j10) {
        if (j10 != 0) {
            int i10 = (this.f68612b * 60) + (this.f68611a * 3600) + this.f68613c;
            int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return t(i11 / BuildConfig.VERSION_CODE, (i11 / 60) % 60, i11 % 60, this.f68614d);
            }
        }
        return this;
    }

    public final k M(long j10) {
        if (j10 != 0) {
            long jP = P();
            long j11 = (((j10 % 86400000000000L) + jP) + 86400000000000L) % 86400000000000L;
            if (jP != j11) {
                return t((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / C.NANOS_PER_SECOND) % 60), (int) (j11 % C.NANOS_PER_SECOND));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }

    @Override // j$.time.temporal.m
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f68657b || aVar == j$.time.temporal.q.f68656a || aVar == j$.time.temporal.q.f68660e || aVar == j$.time.temporal.q.f68659d) {
            return null;
        }
        if (aVar == j$.time.temporal.q.f68662g) {
            return this;
        }
        if (aVar == j$.time.temporal.q.f68661f) {
            return null;
        }
        if (aVar == j$.time.temporal.q.f68658c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.g(P(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int Q() {
        return (this.f68612b * 60) + (this.f68611a * 3600) + this.f68613c;
    }

    public final long P() {
        return (this.f68613c * C.NANOS_PER_SECOND) + (this.f68612b * 60000000000L) + (this.f68611a * 3600000000000L) + this.f68614d;
    }

    @Override // java.lang.Comparable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.f68611a, kVar.f68611a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f68612b, kVar.f68612b)) == 0 && (iCompare = Integer.compare(this.f68613c, kVar.f68613c)) == 0) ? Integer.compare(this.f68614d, kVar.f68614d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f68611a == kVar.f68611a && this.f68612b == kVar.f68612b && this.f68613c == kVar.f68613c && this.f68614d == kVar.f68614d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jP = P();
        return (int) (jP ^ (jP >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f68611a;
        byte b11 = this.f68612b;
        byte b12 = this.f68613c;
        int i10 = this.f68614d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void T(DataOutput dataOutput) {
        if (this.f68614d == 0) {
            if (this.f68613c == 0) {
                if (this.f68612b == 0) {
                    dataOutput.writeByte(~this.f68611a);
                    return;
                } else {
                    dataOutput.writeByte(this.f68611a);
                    dataOutput.writeByte(~this.f68612b);
                    return;
                }
            }
            dataOutput.writeByte(this.f68611a);
            dataOutput.writeByte(this.f68612b);
            dataOutput.writeByte(~this.f68613c);
            return;
        }
        dataOutput.writeByte(this.f68611a);
        dataOutput.writeByte(this.f68612b);
        dataOutput.writeByte(this.f68613c);
        dataOutput.writeInt(this.f68614d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public static k O(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        byte b10 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b11 = dataInput.readByte();
            if (b11 < 0) {
                ?? r72 = ~b11;
                i10 = 0;
                b10 = r72;
                i11 = 0;
            } else {
                byte b12 = dataInput.readByte();
                if (b12 < 0) {
                    i11 = ~b12;
                    i10 = 0;
                    b10 = b11;
                } else {
                    i10 = dataInput.readInt();
                    b10 = b11;
                    i11 = b12;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.I(i12);
        j$.time.temporal.a.MINUTE_OF_HOUR.I(b10);
        j$.time.temporal.a.SECOND_OF_MINUTE.I(i11);
        j$.time.temporal.a.NANO_OF_SECOND.I(i10);
        return t(i12, b10, i11, i10);
    }
}
