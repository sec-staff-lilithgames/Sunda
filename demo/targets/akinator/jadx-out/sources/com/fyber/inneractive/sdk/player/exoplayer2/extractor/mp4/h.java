package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25070c;

    /* renamed from: d, reason: collision with root package name */
    public int f25071d;

    /* renamed from: e, reason: collision with root package name */
    public int f25072e;

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f25068a = nVar;
        nVar.e(12);
        this.f25070c = nVar.m() & 255;
        this.f25069b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f25069b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f25070c;
        if (i10 == 8) {
            return this.f25068a.j();
        }
        if (i10 == 16) {
            return this.f25068a.o();
        }
        int i11 = this.f25071d;
        this.f25071d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f25072e & 15;
        }
        int iJ = this.f25068a.j();
        this.f25072e = iJ;
        return (iJ & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }
}
