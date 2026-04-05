package io;

import gn.k2;
import io.bidmachine.media3.common.util.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public io.bidmachine.media3.common.b f62089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f62090b;

    public d(e eVar) {
        this.f62090b = eVar;
    }

    @Override // io.b0
    public void dropFrame() {
        e eVar = this.f62090b;
        eVar.f62104j.execute(new c(this, 1));
        ((j0) eVar.f62098d.remove()).skip();
    }

    @Override // io.b0
    public void onVideoSizeChanged(k2 k2Var) {
        this.f62089a = new gn.w().setWidth(k2Var.f57981a).setHeight(k2Var.f57982b).setSampleMimeType("video/raw").build();
        this.f62090b.f62104j.execute(new im.k(1, this, k2Var));
    }

    @Override // io.b0
    public void renderFrame(long j10, long j11, boolean z10) {
        e eVar = this.f62090b;
        if (z10 && eVar.f62099e != null) {
            eVar.f62104j.execute(new c(this, 0));
        }
        io.bidmachine.media3.common.b bVarBuild = this.f62089a;
        if (bVarBuild == null) {
            bVarBuild = new gn.w().build();
        }
        eVar.f62105k.onVideoFrameAboutToBeRendered(j11, ((q0) eVar.f62096b).nanoTime(), bVarBuild, null);
        ((j0) eVar.f62098d.remove()).render(j10);
    }
}
