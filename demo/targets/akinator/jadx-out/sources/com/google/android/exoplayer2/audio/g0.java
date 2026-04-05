package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f27124b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27125c;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.z0 f27126e;

    public g0(int i10, com.google.android.exoplayer2.z0 z0Var, boolean z10) {
        super(a.b.e(i10, "AudioTrack write failed: "));
        this.f27125c = z10;
        this.f27124b = i10;
        this.f27126e = z0Var;
    }
}
