package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final long f24994a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24995b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24996c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f24997d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24999f;

    public e(long j10, long j11, long j12, long[] jArr, long j13, int i10) {
        this.f24994a = j10;
        this.f24995b = j11;
        this.f24996c = j12;
        this.f24997d = jArr;
        this.f24998e = j13;
        this.f24999f = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f24997d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        if (!a()) {
            return 0L;
        }
        if (j10 < this.f24994a) {
            return 0L;
        }
        double d10 = ((j10 - r4) * 256.0d) / this.f24998e;
        int iA = z.a(this.f24997d, (long) d10, false);
        int i10 = iA + 1;
        long j11 = (i10 * this.f24995b) / 100;
        long j12 = i10 == 0 ? 0L : this.f24997d[iA];
        return j11 + ((i10 == 99 ? 256L : this.f24997d[i10]) == j12 ? 0L : (long) (((d10 - j12) * (((r7 * (iA + 2)) / 100) - j11)) / (r16 - j12)));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f24995b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (!a()) {
            return this.f24994a;
        }
        float f10 = (j10 * 100.0f) / this.f24995b;
        if (f10 > 0.0f) {
            if (f10 >= 100.0f) {
                fA = 256.0f;
            } else {
                int i10 = (int) f10;
                fA = i10 != 0 ? this.f24997d[i10 - 1] : 0.0f;
                fA = o2.a(f10, i10, (i10 < 99 ? this.f24997d[i10] : 256.0f) - fA, fA);
            }
        }
        long jRound = Math.round(fA * 0.00390625d * this.f24998e);
        long j11 = this.f24994a;
        long j12 = jRound + j11;
        long j13 = this.f24996c;
        return Math.min(j12, j13 != -1 ? j13 - 1 : ((j11 - this.f24999f) + this.f24998e) - 1);
    }
}
