package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f26175a;

    public g(h hVar) {
        this.f26175a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f26175a;
        hVar.getClass();
        IAlog.a("player progress monitor: run started", new Object[0]);
        int iB = hVar.f26176a.b();
        if (!hVar.f26179d) {
            IAlog.a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(iB));
            if (iB >= 2000) {
                IAlog.a("run: setting played 2 seconds flag", new Object[0]);
                hVar.f26179d = true;
            }
        }
        hVar.f26176a.a(iB);
    }
}
