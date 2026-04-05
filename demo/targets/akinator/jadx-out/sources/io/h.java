package io;

import android.view.Surface;
import com.facebook.ads.AdError;
import gn.k2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f62124b;

    public h(k kVar) {
        this.f62124b = kVar;
    }

    @Override // io.i0
    public void onError(l0 l0Var, k0 k0Var) {
        io.bidmachine.media3.common.b bVar = k0Var.f62172b;
        k kVar = this.f62124b;
        kVar.A0 = kVar.a(k0Var, bVar, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
    }

    @Override // io.i0
    public void onFirstFrameRendered(l0 l0Var) {
        k kVar = this.f62124b;
        Surface surface = kVar.X0;
        if (surface != null) {
            kVar.J0.renderedFirstFrame(surface);
            kVar.f62132a1 = true;
        }
    }

    @Override // io.i0
    public void onFrameDropped(l0 l0Var) {
        k kVar = this.f62124b;
        if (kVar.X0 != null) {
            kVar.v0(0, 1);
        }
    }

    @Override // io.i0
    public void onVideoSizeChanged(l0 l0Var, k2 k2Var) {
    }
}
