package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f25219a;

    public a(b bVar) {
        this.f25219a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return (this.f25219a.f25225f * 1000000) / r0.f25223d.f25266i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (j10 == 0) {
            return this.f25219a.f25221b;
        }
        b bVar = this.f25219a;
        long j11 = (bVar.f25223d.f25266i * j10) / 1000000;
        long j12 = bVar.f25221b;
        long j13 = bVar.f25222c;
        long j14 = ((((j13 - j12) * j11) / bVar.f25225f) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) + j12;
        if (j14 >= j12) {
            j12 = j14;
        }
        return j12 >= j13 ? j13 - 1 : j12;
    }
}
