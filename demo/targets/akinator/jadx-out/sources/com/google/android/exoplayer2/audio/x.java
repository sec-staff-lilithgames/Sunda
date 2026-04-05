package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f27319c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Exception f27320e;

    public /* synthetic */ x(a0 a0Var, Exception exc, int i10) {
        this.f27318b = i10;
        this.f27319c = a0Var;
        this.f27320e = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27318b) {
            case 0:
                ((com.google.android.exoplayer2.p0) ((b0) com.google.android.exoplayer2.util.n1.castNonNull(this.f27319c.f27047b))).onAudioCodecError(this.f27320e);
                break;
            default:
                ((com.google.android.exoplayer2.p0) ((b0) com.google.android.exoplayer2.util.n1.castNonNull(this.f27319c.f27047b))).onAudioSinkError(this.f27320e);
                break;
        }
    }
}
