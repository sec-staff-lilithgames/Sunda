package io.bidmachine.media3.exoplayer.audio;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f61080b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61082d;

    /* renamed from: e, reason: collision with root package name */
    public final int f61083e;

    /* renamed from: f, reason: collision with root package name */
    public final int f61084f;

    /* renamed from: g, reason: collision with root package name */
    public final int f61085g;

    /* renamed from: h, reason: collision with root package name */
    public final int f61086h;

    public w0(v0 v0Var) {
        this.f61080b = v0Var.f61060a;
        this.f61081c = v0Var.f61061b;
        this.f61082d = v0Var.f61062c;
        this.f61083e = v0Var.f61063d;
        this.f61084f = v0Var.f61064e;
        this.f61085g = v0Var.f61065f;
        this.f61086h = v0Var.f61066g;
    }

    public static int a(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    @Override // io.bidmachine.media3.exoplayer.audio.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getBufferSizeInBytes(int r8, int r9, int r10, int r11, int r12, int r13, double r14) {
        /*
            r7 = this;
            r0 = 1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            if (r10 == 0) goto L47
            if (r10 == r0) goto L38
            r12 = 2
            if (r10 != r12) goto L32
            r10 = 5
            r12 = 8
            int r3 = r7.f61083e
            if (r9 != r10) goto L16
            int r10 = r7.f61085g
        L14:
            int r3 = r3 * r10
            goto L1b
        L16:
            if (r9 != r12) goto L1b
            int r10 = r7.f61086h
            goto L14
        L1b:
            r10 = -1
            if (r13 == r10) goto L25
            java.math.RoundingMode r9 = java.math.RoundingMode.CEILING
            int r9 = qh.f.divide(r13, r12, r9)
            goto L29
        L25:
            int r9 = a(r9)
        L29:
            long r12 = (long) r3
            long r9 = (long) r9
            long r12 = r12 * r9
            long r12 = r12 / r1
            int r9 = rh.w.checkedCast(r12)
            goto L64
        L32:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L38:
            int r9 = a(r9)
            int r10 = r7.f61084f
            long r12 = (long) r10
            long r9 = (long) r9
            long r12 = r12 * r9
            long r12 = r12 / r1
            int r9 = rh.w.checkedCast(r12)
            goto L64
        L47:
            int r9 = r7.f61082d
            int r9 = r9 * r8
            int r10 = r7.f61080b
            long r3 = (long) r10
            long r12 = (long) r12
            long r3 = r3 * r12
            long r5 = (long) r11
            long r3 = r3 * r5
            long r3 = r3 / r1
            int r10 = rh.w.checkedCast(r3)
            int r3 = r7.f61081c
            long r3 = (long) r3
            long r3 = r3 * r12
            long r3 = r3 * r5
            long r3 = r3 / r1
            int r12 = rh.w.checkedCast(r3)
            int r9 = io.bidmachine.media3.common.util.a1.constrainValue(r9, r10, r12)
        L64:
            double r9 = (double) r9
            double r9 = r9 * r14
            int r9 = (int) r9
            int r8 = java.lang.Math.max(r8, r9)
            int r8 = r8 + r11
            int r8 = r8 - r0
            int r8 = r8 / r11
            int r8 = r8 * r11
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.w0.getBufferSizeInBytes(int, int, int, int, int, int, double):int");
    }
}
