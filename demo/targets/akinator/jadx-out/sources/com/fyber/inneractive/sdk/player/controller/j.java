package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f24421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f24422b;

    public j(q qVar, com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        this.f24422b = qVar;
        this.f24421a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f24422b;
        if (qVar.f24436g) {
            return;
        }
        try {
            Iterator it = qVar.f24431b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a((com.fyber.inneractive.sdk.player.mediaplayer.o) this.f24421a);
            }
        } catch (Exception e10) {
            if (IAlog.f26748a <= 3) {
                q qVar2 = this.f24422b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
