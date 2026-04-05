package dp;

import b0.e2;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.m0;
import ko.r0;
import ko.w0;
import ko.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f52442a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f52443b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f52445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52446e;

    public g(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f52442a = jArr;
        this.f52443b = jArr2;
        this.f52444c = j10;
        this.f52445d = j11;
        this.f52446e = i10;
    }

    public static g create(long j10, long j11, r0 r0Var, m0 m0Var) {
        int unsignedByte;
        m0Var.skipBytes(6);
        long jMax = j11 + r0Var.f71748c + m0Var.readInt();
        int i10 = m0Var.readInt();
        if (i10 <= 0) {
            return null;
        }
        long jSampleCountToDurationUs = a1.sampleCountToDurationUs((i10 * r0Var.f71752g) - 1, r0Var.f71749d);
        int unsignedShort = m0Var.readUnsignedShort();
        int unsignedShort2 = m0Var.readUnsignedShort();
        int unsignedShort3 = m0Var.readUnsignedShort();
        m0Var.skipBytes(2);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i11 = 0;
        long j12 = j11 + r0Var.f71748c;
        while (i11 < unsignedShort) {
            long j13 = jSampleCountToDurationUs;
            int i12 = i11;
            jArr[i12] = (i11 * j13) / unsignedShort;
            jArr2[i12] = j12;
            if (unsignedShort3 == 1) {
                unsignedByte = m0Var.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = m0Var.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = m0Var.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = m0Var.readUnsignedIntToInt();
            }
            j12 += unsignedByte * unsignedShort2;
            i11 = i12 + 1;
            jSampleCountToDurationUs = j13;
        }
        long j14 = jSampleCountToDurationUs;
        if (j10 != -1 && j10 != jMax) {
            StringBuilder sbR = e2.r(j10, "VBRI data size mismatch: ", ", ");
            sbR.append(jMax);
            b0.w("VbriSeeker", sbR.toString());
        }
        if (jMax != j12) {
            StringBuilder sbR2 = e2.r(jMax, "VBRI bytes and ToC mismatch (using max): ", ", ");
            sbR2.append(j12);
            sbR2.append("\nSeeking will be inaccurate.");
            b0.w("VbriSeeker", sbR2.toString());
            jMax = Math.max(jMax, j12);
        }
        return new g(jArr, jArr2, j14, jMax, r0Var.f71751f);
    }

    @Override // dp.f
    public int getAverageBitrate() {
        return this.f52446e;
    }

    @Override // dp.f
    public long getDataEndPosition() {
        return this.f52445d;
    }

    @Override // dp.f, ko.y0
    public long getDurationUs() {
        return this.f52444c;
    }

    @Override // dp.f, ko.y0
    public w0 getSeekPoints(long j10) {
        long[] jArr = this.f52442a;
        int iBinarySearchFloor = a1.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long[] jArr2 = this.f52443b;
        z0 z0Var = new z0(j11, jArr2[iBinarySearchFloor]);
        if (z0Var.f71811a >= j10 || iBinarySearchFloor == jArr.length - 1) {
            return new w0(z0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new w0(z0Var, new z0(jArr[i10], jArr2[i10]));
    }

    @Override // dp.f
    public long getTimeUs(long j10) {
        return this.f52442a[a1.binarySearchFloor(this.f52443b, j10, true, true)];
    }

    @Override // dp.f, ko.y0
    public boolean isSeekable() {
        return true;
    }
}
