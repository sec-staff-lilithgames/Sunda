package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f23660a;

    public j(k kVar) {
        this.f23660a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f23660a;
        kVar.getClass();
        IAlog.a("%s : IAAdContentLoaderImpl : retry load ad task started execution", IAlog.a(kVar));
        this.f23660a.b();
    }
}
