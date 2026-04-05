package ov;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.io.Serializable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f79860b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final g f79861c = dv.c.f52904a.defaultPlatformRandom();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends g implements Serializable {
        public a(u uVar) {
        }

        @Override // ov.g
        public int nextBits(int i10) {
            return g.f79861c.nextBits(i10);
        }

        @Override // ov.g
        public boolean nextBoolean() {
            return g.f79861c.nextBoolean();
        }

        @Override // ov.g
        public byte[] nextBytes(byte[] array) {
            e0.checkNotNullParameter(array, "array");
            return g.f79861c.nextBytes(array);
        }

        @Override // ov.g
        public double nextDouble() {
            return g.f79861c.nextDouble();
        }

        @Override // ov.g
        public float nextFloat() {
            return g.f79861c.nextFloat();
        }

        @Override // ov.g
        public int nextInt() {
            return g.f79861c.nextInt();
        }

        @Override // ov.g
        public long nextLong() {
            return g.f79861c.nextLong();
        }

        @Override // ov.g
        public byte[] nextBytes(int i10) {
            return g.f79861c.nextBytes(i10);
        }

        @Override // ov.g
        public double nextDouble(double d10) {
            return g.f79861c.nextDouble(d10);
        }

        @Override // ov.g
        public int nextInt(int i10) {
            return g.f79861c.nextInt(i10);
        }

        @Override // ov.g
        public long nextLong(long j10) {
            return g.f79861c.nextLong(j10);
        }

        @Override // ov.g
        public byte[] nextBytes(byte[] array, int i10, int i11) {
            e0.checkNotNullParameter(array, "array");
            return g.f79861c.nextBytes(array, i10, i11);
        }

        @Override // ov.g
        public double nextDouble(double d10, double d11) {
            return g.f79861c.nextDouble(d10, d11);
        }

        @Override // ov.g
        public int nextInt(int i10, int i11) {
            return g.f79861c.nextInt(i10, i11);
        }

        @Override // ov.g
        public long nextLong(long j10, long j11) {
            return g.f79861c.nextLong(j10, j11);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(g gVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return gVar.nextBytes(bArr, i10, i11);
    }

    public abstract int nextBits(int i10);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] bArr, int i10, int i11) {
        e0.checkNotNullParameter(bArr, wHkgq.vya);
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || i11 > bArr.length) {
            throw new IllegalArgumentException(e3.g.m(w0.i.f(i10, i11, "fromIndex (", ") or toIndex (", ") are out of range: 0.."), bArr.length, '.').toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(o2.i(i10, i11, "fromIndex (", ") must be not greater than toIndex (", ").").toString());
        }
        int i12 = (i11 - i10) / 4;
        for (int i13 = 0; i13 < i12; i13++) {
            int iNextInt = nextInt();
            bArr[i10] = (byte) iNextInt;
            bArr[i10 + 1] = (byte) (iNextInt >>> 8);
            bArr[i10 + 2] = (byte) (iNextInt >>> 16);
            bArr[i10 + 3] = (byte) (iNextInt >>> 24);
            i10 += 4;
        }
        int i14 = i11 - i10;
        int iNextBits = nextBits(i14 * 8);
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i10 + i15] = (byte) (iNextBits >>> (i15 * 8));
        }
        return bArr;
    }

    public double nextDouble() {
        return f.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d10) {
        return nextDouble(0.0d, d10);
    }

    public int nextInt(int i10) {
        return nextInt(0, i10);
    }

    public long nextLong(long j10) {
        return nextLong(0L, j10);
    }

    public double nextDouble(double d10, double d11) {
        double dNextDouble;
        h.checkRangeBounds(d10, d11);
        double d12 = d11 - d10;
        if (Double.isInfinite(d12) && Math.abs(d10) <= Double.MAX_VALUE && Math.abs(d11) <= Double.MAX_VALUE) {
            double d13 = 2;
            double dNextDouble2 = ((d11 / d13) - (d10 / d13)) * nextDouble();
            dNextDouble = d10 + dNextDouble2 + dNextDouble2;
        } else {
            dNextDouble = d10 + (nextDouble() * d12);
        }
        return dNextDouble >= d11 ? Math.nextAfter(d11, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public int nextInt(int i10, int i11) {
        int iNextInt;
        int i12;
        int iNextBits;
        h.checkRangeBounds(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iNextBits = nextBits(h.fastLog2(i13));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i12 = iNextInt % i13;
                } while ((i13 - 1) + (iNextInt - i12) < 0);
                iNextBits = i12;
            }
            return i10 + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i10 <= iNextInt2 && iNextInt2 < i11) {
                return iNextInt2;
            }
        }
    }

    public long nextLong(long j10, long j11) {
        long jNextLong;
        long j12;
        long jNextBits;
        int iNextInt;
        h.checkRangeBounds(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iNextInt = nextBits(h.fastLog2(i10));
                } else if (i11 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (nextBits(h.fastLog2(i11)) << 32) + (nextInt() & 4294967295L);
                }
                jNextBits = iNextInt & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j12 = jNextLong % j13;
                } while ((j13 - 1) + (jNextLong - j12) < 0);
                jNextBits = j12;
            }
            return j10 + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j10 <= jNextLong2 && jNextLong2 < j11) {
                return jNextLong2;
            }
        }
    }

    public byte[] nextBytes(byte[] array) {
        e0.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int i10) {
        return nextBytes(new byte[i10]);
    }
}
