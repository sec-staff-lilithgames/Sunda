package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f24429a;

    public n(q qVar) {
        this.f24429a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f24429a.f24431b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).d();
            }
        } catch (Exception e10) {
            if (IAlog.f26748a <= 3) {
                q qVar = this.f24429a;
                qVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
