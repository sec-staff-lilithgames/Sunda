package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements h, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* renamed from: a, reason: collision with root package name */
    public long[] f25232a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f25233b;

    /* renamed from: c, reason: collision with root package name */
    public long f25234c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f25235d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f25236e;

    public c(d dVar) {
        this.f25236e = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        long j11 = (this.f25236e.f25266i * j10) / 1000000;
        this.f25235d = this.f25232a[z.a(this.f25232a, j11, true)];
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j10 = this.f25235d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f25235d = -1L;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f25234c + this.f25233b[z.a(this.f25232a, (this.f25236e.f25266i * j10) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return (this.f25236e.f25237n.f26019d * 1000000) / r0.f26016a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        return this;
    }
}
