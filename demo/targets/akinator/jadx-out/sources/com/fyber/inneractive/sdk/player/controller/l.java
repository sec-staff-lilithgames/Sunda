package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f24426b;

    public l(q qVar, int i10) {
        this.f24426b = qVar;
        this.f24425a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f24426b.f24432c.iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(this.f24425a);
            }
        } catch (Exception e10) {
            if (IAlog.f26748a <= 3) {
                q qVar = this.f24426b;
                qVar.getClass();
                IAlog.a("%sonPlayerProgress callback threw an exception!", e10, IAlog.a(qVar));
            }
        }
    }
}
