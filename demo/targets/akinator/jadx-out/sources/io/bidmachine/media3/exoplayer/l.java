package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public float f61329a = 0.97f;

    /* renamed from: b, reason: collision with root package name */
    public float f61330b = 1.03f;

    /* renamed from: c, reason: collision with root package name */
    public long f61331c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public float f61332d = 1.0E-7f;

    /* renamed from: e, reason: collision with root package name */
    public long f61333e = io.bidmachine.media3.common.util.a1.msToUs(20);

    /* renamed from: f, reason: collision with root package name */
    public long f61334f = io.bidmachine.media3.common.util.a1.msToUs(500);

    /* renamed from: g, reason: collision with root package name */
    public float f61335g = 0.999f;

    public m build() {
        return new m(this.f61329a, this.f61330b, this.f61331c, this.f61332d, this.f61333e, this.f61334f, this.f61335g);
    }

    public l setFallbackMaxPlaybackSpeed(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 >= 1.0f);
        this.f61330b = f10;
        return this;
    }

    public l setFallbackMinPlaybackSpeed(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(0.0f < f10 && f10 <= 1.0f);
        this.f61329a = f10;
        return this;
    }

    public l setMaxLiveOffsetErrorMsForUnitSpeed(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 > 0);
        this.f61333e = io.bidmachine.media3.common.util.a1.msToUs(j10);
        return this;
    }

    public l setMinPossibleLiveOffsetSmoothingFactor(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 >= 0.0f && f10 < 1.0f);
        this.f61335g = f10;
        return this;
    }

    public l setMinUpdateIntervalMs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 > 0);
        this.f61331c = j10;
        return this;
    }

    public l setProportionalControlFactor(float f10) {
        io.bidmachine.media3.common.util.a.checkArgument(f10 > 0.0f);
        this.f61332d = f10 / 1000000.0f;
        return this;
    }

    public l setTargetLiveOffsetIncrementOnRebufferMs(long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 >= 0);
        this.f61334f = io.bidmachine.media3.common.util.a1.msToUs(j10);
        return this;
    }
}
