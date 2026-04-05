package dp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.m0;
import ko.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f52447a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52448b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52450d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52451e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f52452f;

    public h(r0 r0Var, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f52447a = new r0(r0Var);
        this.f52448b = j10;
        this.f52449c = j11;
        this.f52452f = jArr;
        this.f52450d = i10;
        this.f52451e = i11;
    }

    public static h parse(r0 r0Var, m0 m0Var) {
        long[] jArr;
        int i10;
        int i11;
        int i12 = m0Var.readInt();
        int unsignedIntToInt = (i12 & 1) != 0 ? m0Var.readUnsignedIntToInt() : -1;
        long unsignedInt = (i12 & 2) != 0 ? m0Var.readUnsignedInt() : -1L;
        if ((i12 & 4) == 4) {
            jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr[i13] = m0Var.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((i12 & 8) != 0) {
            m0Var.skipBytes(4);
        }
        if (m0Var.bytesLeft() >= 24) {
            m0Var.skipBytes(21);
            int unsignedInt24 = m0Var.readUnsignedInt24();
            i11 = unsignedInt24 & 4095;
            i10 = (16773120 & unsignedInt24) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new h(r0Var, unsignedIntToInt, unsignedInt, jArr2, i10, i11);
    }

    public long computeDurationUs() {
        long j10 = this.f52448b;
        if (j10 == -1 || j10 == 0) {
            return C.TIME_UNSET;
        }
        return a1.sampleCountToDurationUs((j10 * r0.f71752g) - 1, this.f52447a.f71749d);
    }
}
