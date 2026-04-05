package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f25760a;

    public j(p pVar) {
        this.f25760a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f25760a;
        if (pVar.G) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f25795p;
        lVar.getClass();
        lVar.f25604f.obtainMessage(9, pVar).sendToTarget();
    }
}
