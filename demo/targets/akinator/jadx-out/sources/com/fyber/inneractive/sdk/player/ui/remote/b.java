package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f26285a;

    public b(d dVar) {
        this.f26285a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        d dVar = this.f26285a;
        dVar.f26293g = true;
        IAlog.a("%s : UI load timed out", "RemoteUIWebviewController");
        r.f26804b.post(dVar.f26298l);
    }
}
