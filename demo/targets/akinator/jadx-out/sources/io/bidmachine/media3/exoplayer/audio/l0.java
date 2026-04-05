package io.bidmachine.media3.exoplayer.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f60972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f60976e;

    /* renamed from: f, reason: collision with root package name */
    public final int f60977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f60978g;

    /* renamed from: h, reason: collision with root package name */
    public final int f60979h;

    /* renamed from: i, reason: collision with root package name */
    public final hn.e f60980i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f60981j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f60982k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f60983l;

    public l0(io.bidmachine.media3.common.b bVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, hn.e eVar, boolean z10, boolean z11, boolean z12) {
        this.f60972a = bVar;
        this.f60973b = i10;
        this.f60974c = i11;
        this.f60975d = i12;
        this.f60976e = i13;
        this.f60977f = i14;
        this.f60978g = i15;
        this.f60979h = i16;
        this.f60980i = eVar;
        this.f60981j = z10;
        this.f60982k = z11;
        this.f60983l = z12;
    }

    public p buildAudioTrackConfig() {
        return new p(this.f60978g, this.f60976e, this.f60977f, this.f60983l, this.f60974c == 1, this.f60979h);
    }

    public boolean canReuseAudioTrack(l0 l0Var) {
        return l0Var.f60974c == this.f60974c && l0Var.f60978g == this.f60978g && l0Var.f60976e == this.f60976e && l0Var.f60977f == this.f60977f && l0Var.f60975d == this.f60975d && l0Var.f60981j == this.f60981j && l0Var.f60982k == this.f60982k;
    }

    public l0 copyWithBufferSize(int i10) {
        return new l0(this.f60972a, this.f60973b, this.f60974c, this.f60975d, this.f60976e, this.f60977f, this.f60978g, i10, this.f60980i, this.f60981j, this.f60982k, this.f60983l);
    }

    public long framesToDurationUs(long j10) {
        return io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(j10, this.f60976e);
    }

    public long inputFramesToDurationUs(long j10) {
        return io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(j10, this.f60972a.F);
    }

    public boolean outputModeIsOffload() {
        return this.f60974c == 1;
    }
}
