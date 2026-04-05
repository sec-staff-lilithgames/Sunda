package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b1 implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public final d f28414b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28415c;

    /* renamed from: e, reason: collision with root package name */
    public long f28416e;

    /* renamed from: f, reason: collision with root package name */
    public long f28417f;

    /* renamed from: g, reason: collision with root package name */
    public l2 f28418g = l2.f27634f;

    public b1(d dVar) {
        this.f28414b = dVar;
    }

    @Override // com.google.android.exoplayer2.util.h0
    public l2 getPlaybackParameters() {
        return this.f28418g;
    }

    @Override // com.google.android.exoplayer2.util.h0
    public long getPositionUs() {
        long j10 = this.f28416e;
        if (!this.f28415c) {
            return j10;
        }
        long jElapsedRealtime = ((d1) this.f28414b).elapsedRealtime() - this.f28417f;
        l2 l2Var = this.f28418g;
        return (l2Var.f27637b == 1.0f ? n1.msToUs(jElapsedRealtime) : l2Var.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime)) + j10;
    }

    public void resetPosition(long j10) {
        this.f28416e = j10;
        if (this.f28415c) {
            this.f28417f = ((d1) this.f28414b).elapsedRealtime();
        }
    }

    @Override // com.google.android.exoplayer2.util.h0
    public void setPlaybackParameters(l2 l2Var) {
        if (this.f28415c) {
            resetPosition(getPositionUs());
        }
        this.f28418g = l2Var;
    }

    public void start() {
        if (this.f28415c) {
            return;
        }
        this.f28417f = ((d1) this.f28414b).elapsedRealtime();
        this.f28415c = true;
    }

    public void stop() {
        if (this.f28415c) {
            resetPosition(getPositionUs());
            this.f28415c = false;
        }
    }
}
