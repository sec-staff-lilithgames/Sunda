package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f26765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f26766b;

    public c(com.fyber.inneractive.sdk.web.e eVar) {
        this.f26766b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26766b.getClass();
        com.fyber.inneractive.sdk.web.e eVar = this.f26766b;
        boolean z10 = eVar.f26859f;
        if (z10) {
            return;
        }
        d dVar = new d(eVar);
        eVar.f26857d = dVar;
        if (z10) {
            return;
        }
        try {
            eVar.f26854a.execute(dVar);
        } catch (NullPointerException e10) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e10.getMessage());
        } catch (RejectedExecutionException e11) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e11.getMessage());
        }
    }
}
