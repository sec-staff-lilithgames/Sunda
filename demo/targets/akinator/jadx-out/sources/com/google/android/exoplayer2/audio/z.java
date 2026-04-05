package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f27331c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce.f f27332e;

    public /* synthetic */ z(a0 a0Var, ce.f fVar, int i10) {
        this.f27330b = i10;
        this.f27331c = a0Var;
        this.f27332e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27330b) {
            case 0:
                ((com.google.android.exoplayer2.p0) ((b0) com.google.android.exoplayer2.util.n1.castNonNull(this.f27331c.f27047b))).onAudioEnabled(this.f27332e);
                break;
            default:
                a0 a0Var = this.f27331c;
                a0Var.getClass();
                ce.f fVar = this.f27332e;
                fVar.ensureUpdated();
                ((com.google.android.exoplayer2.p0) ((b0) com.google.android.exoplayer2.util.n1.castNonNull(a0Var.f27047b))).onAudioDisabled(fVar);
                break;
        }
    }
}
