package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final long f24973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24974b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24975c;

    public a(int i10, long j10, long j11) {
        this.f24973a = j10;
        this.f24974b = i10;
        this.f24975c = j11 == -1 ? C.TIME_UNSET : b(j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f24975c != C.TIME_UNSET;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f24973a) * 8000000) / this.f24974b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f24975c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        long j11 = this.f24975c;
        if (j11 == C.TIME_UNSET) {
            return 0L;
        }
        int i10 = z.f26070a;
        return ((Math.max(0L, Math.min(j10, j11)) * this.f24974b) / 8000000) + this.f24973a;
    }
}
