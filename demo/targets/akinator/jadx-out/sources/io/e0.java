package io;

import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f62107c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.media3.exoplayer.j f62108e;

    public /* synthetic */ e0(f0 f0Var, io.bidmachine.media3.exoplayer.j jVar, int i10) {
        this.f62106b = i10;
        this.f62107c = f0Var;
        this.f62108e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62106b) {
            case 0:
                f0 f0Var = this.f62107c;
                f0Var.getClass();
                io.bidmachine.media3.exoplayer.j jVar = this.f62108e;
                jVar.ensureUpdated();
                ((io.bidmachine.media3.exoplayer.j0) ((g0) a1.castNonNull(f0Var.f62123b))).onVideoDisabled(jVar);
                break;
            default:
                ((io.bidmachine.media3.exoplayer.j0) ((g0) a1.castNonNull(this.f62107c.f62123b))).onVideoEnabled(this.f62108e);
                break;
        }
    }
}
