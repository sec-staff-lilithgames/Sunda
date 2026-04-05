package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f61017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61018c;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f61019e;

    public u(int i10, io.bidmachine.media3.common.b bVar, boolean z10) {
        super(a.b.e(i10, "AudioTrack write failed: "));
        this.f61018c = z10;
        this.f61017b = i10;
        this.f61019e = bVar;
    }
}
