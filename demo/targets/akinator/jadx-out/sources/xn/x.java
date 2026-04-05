package xn;

import io.bidmachine.media3.exoplayer.m0;
import io.bidmachine.media3.exoplayer.r1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f92165a;

    public x(w wVar) {
        this.f92165a = wVar;
    }

    @Override // xn.n
    public void onInputBufferAvailable() {
        r1 r1Var = this.f92165a.I;
        if (r1Var != null) {
            ((m0) r1Var).onWakeup();
        }
    }

    @Override // xn.n
    public void onOutputBufferAvailable() {
        r1 r1Var = this.f92165a.I;
        if (r1Var != null) {
            ((m0) r1Var).onWakeup();
        }
    }
}
