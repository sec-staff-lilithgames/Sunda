package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IOException f25763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f25764b;

    public l(p pVar, IOException iOException) {
        this.f25764b = pVar;
        this.f25763a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f25764b.f25784e;
        IOException iOException = this.f25763a;
        if (((com.fyber.inneractive.sdk.player.controller.f) b0Var.f24393a.get()) != null) {
            iOException.getCause();
        }
    }
}
