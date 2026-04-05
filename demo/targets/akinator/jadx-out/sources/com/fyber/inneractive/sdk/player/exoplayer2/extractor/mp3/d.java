package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24991a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24992b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24993c;

    public d(long[] jArr, long[] jArr2, long j10) {
        this.f24991a = jArr;
        this.f24992b = jArr2;
        this.f24993c = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return this.f24991a[z.a(this.f24992b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f24993c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f24992b[z.a(this.f24991a, j10, true)];
    }
}
