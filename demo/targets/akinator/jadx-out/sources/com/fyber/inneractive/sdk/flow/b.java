package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23529a;

    public b(d dVar) {
        this.f23529a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : ContentLoadTimeoutHandler Executing timeout task", IAlog.a(this.f23529a));
        this.f23529a.f23546b.a();
    }
}
