package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f24424b;

    public k(f fVar, boolean z10) {
        this.f24424b = fVar;
        this.f24423a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f24424b;
        if (qVar.f24436g) {
            return;
        }
        try {
            Iterator it = qVar.f24431b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).c(this.f24423a);
            }
        } catch (Exception e10) {
            if (IAlog.f26748a <= 3) {
                q qVar2 = this.f24424b;
                qVar2.getClass();
                IAlog.a("%sonPlayerError callback threw an exception!", e10, IAlog.a(qVar2));
            }
        }
    }
}
