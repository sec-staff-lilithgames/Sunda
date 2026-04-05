package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26062a;

    /* renamed from: b, reason: collision with root package name */
    public long f26063b;

    /* renamed from: c, reason: collision with root package name */
    public long f26064c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f26065d = com.fyber.inneractive.sdk.player.exoplayer2.s.f25723d;

    public final void a(long j10) {
        this.f26063b = j10;
        if (this.f26062a) {
            this.f26064c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j10 = this.f26063b;
        if (!this.f26062a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f26064c;
        if (this.f26065d.f25724a != 1.0f) {
            return (jElapsedRealtime * r4.f25726c) + j10;
        }
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f24611a;
        long j11 = C.TIME_UNSET;
        if (jElapsedRealtime != C.TIME_UNSET) {
            j11 = 1000 * jElapsedRealtime;
        }
        return j11 + j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f26062a) {
            a(b());
        }
        this.f26065d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f26065d;
    }
}
