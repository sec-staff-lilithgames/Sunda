package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public float f27560a = 0.97f;

    /* renamed from: b, reason: collision with root package name */
    public float f27561b = 1.03f;

    /* renamed from: c, reason: collision with root package name */
    public long f27562c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public float f27563d = 1.0E-7f;

    /* renamed from: e, reason: collision with root package name */
    public long f27564e = com.google.android.exoplayer2.util.n1.msToUs(20);

    /* renamed from: f, reason: collision with root package name */
    public long f27565f = com.google.android.exoplayer2.util.n1.msToUs(500);

    /* renamed from: g, reason: collision with root package name */
    public float f27566g = 0.999f;

    public l build() {
        return new l(this.f27560a, this.f27561b, this.f27562c, this.f27563d, this.f27564e, this.f27565f, this.f27566g);
    }

    public k setFallbackMaxPlaybackSpeed(float f10) {
        com.google.android.exoplayer2.util.a.checkArgument(f10 >= 1.0f);
        this.f27561b = f10;
        return this;
    }

    public k setFallbackMinPlaybackSpeed(float f10) {
        com.google.android.exoplayer2.util.a.checkArgument(0.0f < f10 && f10 <= 1.0f);
        this.f27560a = f10;
        return this;
    }

    public k setMaxLiveOffsetErrorMsForUnitSpeed(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 > 0);
        this.f27564e = com.google.android.exoplayer2.util.n1.msToUs(j10);
        return this;
    }

    public k setMinPossibleLiveOffsetSmoothingFactor(float f10) {
        com.google.android.exoplayer2.util.a.checkArgument(f10 >= 0.0f && f10 < 1.0f);
        this.f27566g = f10;
        return this;
    }

    public k setMinUpdateIntervalMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 > 0);
        this.f27562c = j10;
        return this;
    }

    public k setProportionalControlFactor(float f10) {
        com.google.android.exoplayer2.util.a.checkArgument(f10 > 0.0f);
        this.f27563d = f10 / 1000000.0f;
        return this;
    }

    public k setTargetLiveOffsetIncrementOnRebufferMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 >= 0);
        this.f27565f = com.google.android.exoplayer2.util.n1.msToUs(j10);
        return this;
    }
}
