package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f61060a = 250000;

    /* renamed from: b, reason: collision with root package name */
    public int f61061b = 750000;

    /* renamed from: c, reason: collision with root package name */
    public int f61062c = 4;

    /* renamed from: d, reason: collision with root package name */
    public int f61063d = 250000;

    /* renamed from: e, reason: collision with root package name */
    public int f61064e = 50000000;

    /* renamed from: f, reason: collision with root package name */
    public int f61065f = 2;

    /* renamed from: g, reason: collision with root package name */
    public int f61066g = 4;

    public w0 build() {
        return new w0(this);
    }

    public v0 setAc3BufferMultiplicationFactor(int i10) {
        this.f61065f = i10;
        return this;
    }

    public v0 setDtshdBufferMultiplicationFactor(int i10) {
        this.f61066g = i10;
        return this;
    }

    public v0 setMaxPcmBufferDurationUs(int i10) {
        this.f61061b = i10;
        return this;
    }

    public v0 setMinPcmBufferDurationUs(int i10) {
        this.f61060a = i10;
        return this;
    }

    public v0 setOffloadBufferDurationUs(int i10) {
        this.f61064e = i10;
        return this;
    }

    public v0 setPassthroughBufferDurationUs(int i10) {
        this.f61063d = i10;
        return this;
    }

    public v0 setPcmBufferMultiplicationFactor(int i10) {
        this.f61062c = i10;
        return this;
    }
}
