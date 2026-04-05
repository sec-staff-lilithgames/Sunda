package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f61607a;

    public z() {
        int i10 = io.bidmachine.media3.common.util.a1.f60679a;
        if (i10 >= 35) {
            this.f61607a = new y();
        } else if (i10 >= 23) {
            this.f61607a = new u();
        } else {
            this.f61607a = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void disable() {
        i2 i2Var = this.f61607a;
        if (i2Var != null) {
            i2Var.disable();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public void enable(h2 h2Var, Context context, Looper looper, Looper looper2, io.bidmachine.media3.common.util.g gVar) {
        i2 i2Var = this.f61607a;
        if (i2Var != null) {
            i2Var.enable(h2Var, context, looper, looper2, gVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public boolean isSelectedOutputSuitableForPlayback() {
        i2 i2Var = this.f61607a;
        return i2Var == null || i2Var.isSelectedOutputSuitableForPlayback();
    }
}
