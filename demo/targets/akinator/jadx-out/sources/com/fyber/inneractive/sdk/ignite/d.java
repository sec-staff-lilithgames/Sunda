package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23972a;

    public d(h hVar) {
        this.f23972a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f23972a;
        IAlog.a("onInstallTimeout after %d msec", Long.valueOf(hVar.f23988k));
        Iterator it = hVar.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a((String) null, j.INSTALL_TIMEOUT.a(), (String) null);
            }
        }
    }
}
