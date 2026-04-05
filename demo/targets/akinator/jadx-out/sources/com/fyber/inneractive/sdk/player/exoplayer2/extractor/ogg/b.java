package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final g f25220a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final long f25221b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25222c;

    /* renamed from: d, reason: collision with root package name */
    public final l f25223d;

    /* renamed from: e, reason: collision with root package name */
    public int f25224e;

    /* renamed from: f, reason: collision with root package name */
    public long f25225f;

    /* renamed from: g, reason: collision with root package name */
    public long f25226g;

    /* renamed from: h, reason: collision with root package name */
    public long f25227h;

    /* renamed from: i, reason: collision with root package name */
    public long f25228i;

    /* renamed from: j, reason: collision with root package name */
    public long f25229j;

    /* renamed from: k, reason: collision with root package name */
    public long f25230k;

    /* renamed from: l, reason: collision with root package name */
    public long f25231l;

    public b(long j10, long j11, l lVar, int i10, long j12) {
        if (j10 < 0 || j11 <= j10) {
            throw new IllegalArgumentException();
        }
        this.f25223d = lVar;
        this.f25221b = j10;
        this.f25222c = j11;
        if (i10 != j11 - j10) {
            this.f25224e = 0;
        } else {
            this.f25225f = j12;
            this.f25224e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r23) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b):long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        if (this.f25225f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        int i10 = this.f25224e;
        if (i10 != 3 && i10 != 2) {
            throw new IllegalArgumentException();
        }
        long j11 = j10 == 0 ? 0L : (this.f25223d.f25266i * j10) / 1000000;
        this.f25227h = j11;
        this.f25224e = 2;
        this.f25228i = this.f25221b;
        this.f25229j = this.f25222c;
        this.f25230k = 0L;
        this.f25231l = this.f25225f;
        return j11;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, long j10) throws InterruptedException, EOFException {
        int i10;
        long jMin = Math.min(j10 + 3, this.f25222c);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j11 = bVar.f24649c;
            int i12 = 0;
            if (i11 + j11 > jMin && (i11 = (int) (jMin - j11)) < 4) {
                return false;
            }
            bVar.a(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        bVar.a(i12);
                        return true;
                    }
                    i12++;
                }
            }
            bVar.a(i10);
        }
    }
}
