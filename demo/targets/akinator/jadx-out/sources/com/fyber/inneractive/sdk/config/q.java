package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f23340a;

    public q(s sVar) {
        this.f23340a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f23340a;
        Iterator it = sVar.f23395c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.f23394b);
        }
    }
}
