package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public int f27105a = 250000;

    /* renamed from: b, reason: collision with root package name */
    public int f27106b = 750000;

    /* renamed from: c, reason: collision with root package name */
    public int f27107c = 4;

    /* renamed from: d, reason: collision with root package name */
    public int f27108d = 250000;

    /* renamed from: e, reason: collision with root package name */
    public int f27109e = 50000000;

    /* renamed from: f, reason: collision with root package name */
    public int f27110f = 2;

    public e1 build() {
        return new e1(this);
    }

    public d1 setAc3BufferMultiplicationFactor(int i10) {
        this.f27110f = i10;
        return this;
    }

    public d1 setMaxPcmBufferDurationUs(int i10) {
        this.f27106b = i10;
        return this;
    }

    public d1 setMinPcmBufferDurationUs(int i10) {
        this.f27105a = i10;
        return this;
    }

    public d1 setOffloadBufferDurationUs(int i10) {
        this.f27109e = i10;
        return this;
    }

    public d1 setPassthroughBufferDurationUs(int i10) {
        this.f27108d = i10;
        return this;
    }

    public d1 setPcmBufferMultiplicationFactor(int i10) {
        this.f27107c = i10;
        return this;
    }
}
