package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f27140a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f27141b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f27142c = 1;

    /* renamed from: d, reason: collision with root package name */
    public int f27143d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f27144e = 0;

    public k build() {
        return new k(this.f27140a, this.f27141b, this.f27142c, this.f27143d, this.f27144e);
    }

    public j setAllowedCapturePolicy(int i10) {
        this.f27143d = i10;
        return this;
    }

    public j setContentType(int i10) {
        this.f27140a = i10;
        return this;
    }

    public j setFlags(int i10) {
        this.f27141b = i10;
        return this;
    }

    public j setSpatializationBehavior(int i10) {
        this.f27144e = i10;
        return this;
    }

    public j setUsage(int i10) {
        this.f27142c = i10;
        return this;
    }
}
