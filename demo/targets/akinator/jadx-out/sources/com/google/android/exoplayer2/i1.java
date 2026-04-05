package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public long f27521a;

    /* renamed from: b, reason: collision with root package name */
    public long f27522b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27523c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27524d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27525e;

    public j1 build() {
        return buildClippingProperties();
    }

    @Deprecated
    public k1 buildClippingProperties() {
        return new k1(this);
    }

    public i1 setEndPositionMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 == Long.MIN_VALUE || j10 >= 0);
        this.f27522b = j10;
        return this;
    }

    public i1 setRelativeToDefaultPosition(boolean z10) {
        this.f27524d = z10;
        return this;
    }

    public i1 setRelativeToLiveWindow(boolean z10) {
        this.f27523c = z10;
        return this;
    }

    public i1 setStartPositionMs(long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 >= 0);
        this.f27521a = j10;
        return this;
    }

    public i1 setStartsAtKeyFrame(boolean z10) {
        this.f27525e = z10;
        return this;
    }
}
