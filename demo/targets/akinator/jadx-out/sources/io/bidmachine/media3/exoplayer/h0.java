package io.bidmachine.media3.exoplayer;

import io.bidmachine.media3.exoplayer.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class h0 implements io.bidmachine.media3.common.util.x, p0, io.bidmachine.media3.common.util.d, h2, io.bidmachine.media3.common.util.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f61216c;

    public /* synthetic */ h0(l0 l0Var, int i10) {
        this.f61215b = i10;
        this.f61216c = l0Var;
    }

    @Override // io.bidmachine.media3.common.util.x
    public void invoke(Object obj, gn.v vVar) {
        ((gn.g1) obj).onEvents(this.f61216c.f61345f, new gn.f1(vVar));
    }

    @Override // io.bidmachine.media3.exoplayer.p0
    public void onPlaybackInfoUpdate(o0.c cVar) {
        l0 l0Var = this.f61216c;
        l0Var.f61353j.post(new im.k(9, l0Var, cVar));
    }

    @Override // io.bidmachine.media3.exoplayer.h2
    public void onSelectedOutputSuitabilityChanged(boolean z10) {
        l0 l0Var = this.f61216c;
        if (l0Var.f61374t0) {
            return;
        }
        if (!z10) {
            l0Var.A(1, l0Var.f61382x0.f61314l);
            return;
        }
        k1 k1Var = l0Var.f61382x0;
        if (k1Var.f61316n == 3) {
            l0Var.A(1, k1Var.f61314l);
        }
    }

    @Override // io.bidmachine.media3.common.util.d
    public void onStateChanged(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        int iIntValue = num.intValue();
        int i10 = l0.A0;
        l0 l0Var = this.f61216c;
        l0Var.D();
        l0Var.u(1, 10, num);
        l0Var.u(2, 10, num);
        l0Var.f61359m.sendEvent(21, new com.google.android.exoplayer2.j0(iIntValue, 4));
    }

    @Override // io.bidmachine.media3.common.util.w
    public void invoke(Object obj) {
        gn.g1 g1Var = (gn.g1) obj;
        switch (this.f61215b) {
            case 4:
                g1Var.onPlaylistMetadataChanged(this.f61216c.U);
                break;
            default:
                g1Var.onAvailableCommandsChanged(this.f61216c.S);
                break;
        }
    }
}
