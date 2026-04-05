package le;

import b0.e2;
import com.google.android.exoplayer2.audio.j1;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import ee.g0;
import ee.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f73359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73360b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73361c;

    /* renamed from: d, reason: collision with root package name */
    public final long f73362d;

    /* renamed from: e, reason: collision with root package name */
    public final long f73363e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f73364f;

    public h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f73359a = j10;
        this.f73360b = i10;
        this.f73361c = j11;
        this.f73364f = jArr;
        this.f73362d = j12;
        this.f73363e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static h create(long j10, long j11, j1 j1Var, v0 v0Var) {
        int unsignedIntToInt;
        int i10 = j1Var.f27151g;
        int i11 = j1Var.f27148d;
        int i12 = v0Var.readInt();
        if ((i12 & 1) != 1 || (unsignedIntToInt = v0Var.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = n1.scaleLargeTimestamp(unsignedIntToInt, i10 * 1000000, i11);
        if ((i12 & 6) != 6) {
            return new h(j11, j1Var.f27147c, jScaleLargeTimestamp, -1L, null);
        }
        long unsignedInt = v0Var.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = v0Var.readUnsignedByte();
        }
        if (j10 != -1) {
            long j12 = j11 + unsignedInt;
            if (j10 != j12) {
                StringBuilder sbR = e2.r(j10, "XING data size mismatch: ", ", ");
                sbR.append(j12);
                f0.w("XingSeeker", sbR.toString());
            }
        }
        return new h(j11, j1Var.f27147c, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    @Override // le.f
    public long getDataEndPosition() {
        return this.f73363e;
    }

    @Override // le.f, ee.i0
    public long getDurationUs() {
        return this.f73361c;
    }

    @Override // le.f, ee.i0
    public g0 getSeekPoints(long j10) {
        double d10;
        double d11;
        boolean zIsSeekable = isSeekable();
        int i10 = this.f73360b;
        long j11 = this.f73359a;
        if (!zIsSeekable) {
            return new g0(new j0(0L, j11 + i10));
        }
        long jConstrainValue = n1.constrainValue(j10, 0L, this.f73361c);
        double d12 = (jConstrainValue * 100.0d) / this.f73361c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = (long[]) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f73364f);
            double d14 = jArr[i11];
            if (i11 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i11 + 1];
            }
            d13 = ((d11 - d14) * (d12 - i11)) + d14;
        }
        long j12 = this.f73362d;
        return new g0(new j0(jConstrainValue, j11 + n1.constrainValue(Math.round((d13 / d10) * j12), i10, j12 - 1)));
    }

    @Override // le.f
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f73359a;
        if (!isSeekable() || j11 <= this.f73360b) {
            return 0L;
        }
        long[] jArr = (long[]) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f73364f);
        double d10 = (j11 * 256.0d) / this.f73362d;
        int iBinarySearchFloor = n1.binarySearchFloor(jArr, (long) d10, true, true);
        long j12 = this.f73361c;
        long j13 = (iBinarySearchFloor * j12) / 100;
        long j14 = jArr[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        long j15 = (j12 * i10) / 100;
        return Math.round((j14 == (iBinarySearchFloor == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // le.f, ee.i0
    public boolean isSeekable() {
        return this.f73364f != null;
    }
}
