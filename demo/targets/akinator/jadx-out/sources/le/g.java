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
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f73355a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f73356b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73357c;

    /* renamed from: d, reason: collision with root package name */
    public final long f73358d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f73355a = jArr;
        this.f73356b = jArr2;
        this.f73357c = j10;
        this.f73358d = j11;
    }

    public static g create(long j10, long j11, j1 j1Var, v0 v0Var) {
        int unsignedByte;
        v0 v0Var2 = v0Var;
        v0Var2.skipBytes(10);
        int i10 = v0Var2.readInt();
        if (i10 <= 0) {
            return null;
        }
        int i11 = j1Var.f27148d;
        long jScaleLargeTimestamp = n1.scaleLargeTimestamp(i10, (i11 >= 32000 ? 1152 : 576) * 1000000, i11);
        int unsignedShort = v0Var2.readUnsignedShort();
        int unsignedShort2 = v0Var2.readUnsignedShort();
        int unsignedShort3 = v0Var2.readUnsignedShort();
        v0Var2.skipBytes(2);
        long j12 = j11 + j1Var.f27147c;
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i12 = 0;
        long j13 = j11;
        while (i12 < unsignedShort) {
            long j14 = j12;
            long[] jArr3 = jArr;
            jArr3[i12] = (i12 * jScaleLargeTimestamp) / unsignedShort;
            jArr2[i12] = Math.max(j13, j14);
            if (unsignedShort3 == 1) {
                unsignedByte = v0Var2.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = v0Var2.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = v0Var2.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = v0Var2.readUnsignedIntToInt();
            }
            j13 += unsignedByte * unsignedShort2;
            i12++;
            v0Var2 = v0Var;
            jArr = jArr3;
            j12 = j14;
        }
        long[] jArr4 = jArr;
        if (j10 != -1 && j10 != j13) {
            StringBuilder sbR = e2.r(j10, "VBRI data size mismatch: ", ", ");
            sbR.append(j13);
            f0.w("VbriSeeker", sbR.toString());
        }
        return new g(jArr4, jArr2, jScaleLargeTimestamp, j13);
    }

    @Override // le.f
    public long getDataEndPosition() {
        return this.f73358d;
    }

    @Override // le.f, ee.i0
    public long getDurationUs() {
        return this.f73357c;
    }

    @Override // le.f, ee.i0
    public g0 getSeekPoints(long j10) {
        long[] jArr = this.f73355a;
        int iBinarySearchFloor = n1.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long[] jArr2 = this.f73356b;
        j0 j0Var = new j0(j11, jArr2[iBinarySearchFloor]);
        if (j0Var.f54211a >= j10 || iBinarySearchFloor == jArr.length - 1) {
            return new g0(j0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new g0(j0Var, new j0(jArr[i10], jArr2[i10]));
    }

    @Override // le.f
    public long getTimeUs(long j10) {
        return this.f73355a[n1.binarySearchFloor(this.f73356b, j10, true, true)];
    }

    @Override // le.f, ee.i0
    public boolean isSeekable() {
        return true;
    }
}
