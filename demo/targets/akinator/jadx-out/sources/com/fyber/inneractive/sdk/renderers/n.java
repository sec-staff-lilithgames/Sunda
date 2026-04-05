package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f26591a;

    public n(p pVar) {
        this.f26591a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f26591a;
        if (pVar.f26601t != null) {
            IAlog.a("%sIdle state reached!", IAlog.a(pVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26591a.f26570k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.f26591a.f26601t = null;
        }
    }
}
