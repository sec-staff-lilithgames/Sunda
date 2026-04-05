package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f24419a;

    public h(i iVar) {
        this.f24419a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f24419a.f24420a.f24433d;
        if (xVar != null) {
            z zVar = xVar.f24452a;
            zVar.getClass();
            IAlog.a("%s onTextureViewDestroyed", IAlog.a(zVar));
        }
    }
}
