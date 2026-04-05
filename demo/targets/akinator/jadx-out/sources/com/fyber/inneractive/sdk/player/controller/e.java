package com.fyber.inneractive.sdk.player.controller;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f24403a;

    public e(f fVar) {
        this.f24403a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f24403a.f24408s;
        if (gVar != null) {
            gVar.a(gVar.a(), C.TIME_UNSET);
            this.f24403a.f24408s.f25554d.f25604f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f24403a.f24408s;
            gVar2.f25554d.d();
            gVar2.f25553c.removeCallbacksAndMessages(null);
            this.f24403a.f24408s = null;
        }
    }
}
