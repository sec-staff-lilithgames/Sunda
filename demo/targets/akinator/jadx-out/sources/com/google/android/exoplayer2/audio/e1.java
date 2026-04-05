package com.google.android.exoplayer2.audio;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e1 implements t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f27114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27115c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27117e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27119g;

    public e1(d1 d1Var) {
        this.f27114b = d1Var.f27105a;
        this.f27115c = d1Var.f27106b;
        this.f27116d = d1Var.f27107c;
        this.f27117e = d1Var.f27108d;
        this.f27118f = d1Var.f27109e;
        this.f27119g = d1Var.f27110f;
    }

    public static int a(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
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
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // com.google.android.exoplayer2.audio.t0
    public int getBufferSizeInBytes(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        int iConstrainValue;
        if (i12 == 0) {
            long j10 = i14;
            long j11 = i13;
            iConstrainValue = com.google.android.exoplayer2.util.n1.constrainValue(this.f27116d * i10, rh.w.checkedCast(((this.f27114b * j10) * j11) / 1000000), rh.w.checkedCast(((this.f27115c * j10) * j11) / 1000000));
        } else if (i12 == 1) {
            iConstrainValue = rh.w.checkedCast((this.f27118f * a(i11)) / 1000000);
        } else {
            if (i12 != 2) {
                throw new IllegalArgumentException();
            }
            int i16 = this.f27117e;
            if (i11 == 5) {
                i16 *= this.f27119g;
            }
            iConstrainValue = rh.w.checkedCast((i16 * (i15 != -1 ? qh.f.divide(i15, 8, RoundingMode.CEILING) : a(i11))) / 1000000);
        }
        return (((Math.max(i10, (int) (iConstrainValue * d10)) + i13) - 1) / i13) * i13;
    }
}
