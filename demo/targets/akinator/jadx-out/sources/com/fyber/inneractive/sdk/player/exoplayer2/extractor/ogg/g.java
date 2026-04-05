package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final int f25245h = z.a("OggS");

    /* renamed from: a, reason: collision with root package name */
    public int f25246a;

    /* renamed from: b, reason: collision with root package name */
    public long f25247b;

    /* renamed from: c, reason: collision with root package name */
    public int f25248c;

    /* renamed from: d, reason: collision with root package name */
    public int f25249d;

    /* renamed from: e, reason: collision with root package name */
    public int f25250e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f25251f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25252g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(255);

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f25252g;
        nVar.f26043b = 0;
        nVar.f26044c = 0;
        this.f25246a = 0;
        this.f25247b = 0L;
        this.f25248c = 0;
        this.f25249d = 0;
        this.f25250e = 0;
        long j10 = bVar.f24648b;
        if ((j10 != -1 && j10 - (bVar.f24649c + bVar.f24651e) < 27) || !bVar.a(nVar.f26042a, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f25252g.k() != f25245h) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("expected OggS capture pattern at begin of page");
        }
        if (this.f25252g.j() != 0) {
            if (z10) {
                return false;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("unsupported bit stream revision");
        }
        this.f25246a = this.f25252g.j();
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f25252g;
        byte[] bArr = nVar2.f26042a;
        int i10 = nVar2.f26043b;
        nVar2.f26043b = i10 + 1;
        nVar2.f26043b = i10 + 2;
        nVar2.f26043b = i10 + 3;
        long j11 = (bArr[i10] & 255) | ((bArr[r4] & 255) << 8) | ((bArr[r9] & 255) << 16);
        nVar2.f26043b = i10 + 4;
        long j12 = j11 | ((bArr[r10] & 255) << 24);
        nVar2.f26043b = i10 + 5;
        long j13 = j12 | ((bArr[r9] & 255) << 32);
        nVar2.f26043b = i10 + 6;
        long j14 = j13 | ((bArr[r10] & 255) << 40);
        nVar2.f26043b = i10 + 7;
        nVar2.f26043b = i10 + 8;
        this.f25247b = j14 | ((bArr[r9] & 255) << 48) | ((255 & bArr[r10]) << 56);
        nVar2.e();
        this.f25252g.e();
        this.f25252g.e();
        int iJ = this.f25252g.j();
        this.f25248c = iJ;
        this.f25249d = iJ + 27;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f25252g;
        nVar3.f26043b = 0;
        nVar3.f26044c = 0;
        bVar.a(nVar3.f26042a, 0, iJ, false);
        for (int i11 = 0; i11 < this.f25248c; i11++) {
            this.f25251f[i11] = this.f25252g.j();
            this.f25250e += this.f25251f[i11];
        }
        return true;
    }
}
