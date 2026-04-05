package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f27103b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27104c;

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(int i10, int i11, int i12, int i13, com.google.android.exoplayer2.z0 z0Var, boolean z10, Exception exc) {
        StringBuilder sbF = w0.i.f(i10, i11, "AudioTrack init failed ", " Config(", ", ");
        a.b.x(i12, i13, ", ", ") ", sbF);
        sbF.append(z0Var);
        sbF.append(z10 ? " (recoverable)" : "");
        super(sbF.toString(), exc);
        this.f27103b = i10;
        this.f27104c = z10;
    }
}
