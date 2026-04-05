package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f26186a;

    public c(p pVar) {
        this.f26186a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%sCannot wait for video size anymore", this.f26186a.b());
        p pVar = this.f26186a;
        if (pVar.f26218r == 0) {
            IAlog.a("%sCannot wait for video size anymore. duration is still 0 - aborting", pVar.b());
            p pVar2 = this.f26186a;
            pVar2.onError(pVar2, 0, 0);
        } else {
            IAlog.a("%sCannot wait for video size anymore. moving into ready", pVar.b());
            p pVar3 = this.f26186a;
            pVar3.f26206f = true;
            pVar3.c();
        }
    }
}
