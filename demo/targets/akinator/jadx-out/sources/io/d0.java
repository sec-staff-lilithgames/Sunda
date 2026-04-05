package io;

import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62091b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f62092c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f62093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f62094f;

    public /* synthetic */ d0(f0 f0Var, int i10, long j10) {
        this.f62092c = f0Var;
        this.f62093e = i10;
        this.f62094f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62091b) {
            case 0:
                ((io.bidmachine.media3.exoplayer.j0) ((g0) a1.castNonNull(this.f62092c.f62123b))).onVideoFrameProcessingOffset(this.f62094f, this.f62093e);
                break;
            default:
                ((io.bidmachine.media3.exoplayer.j0) ((g0) a1.castNonNull(this.f62092c.f62123b))).onDroppedFrames(this.f62093e, this.f62094f);
                break;
        }
    }

    public /* synthetic */ d0(f0 f0Var, long j10, int i10) {
        this.f62092c = f0Var;
        this.f62094f = j10;
        this.f62093e = i10;
    }
}
