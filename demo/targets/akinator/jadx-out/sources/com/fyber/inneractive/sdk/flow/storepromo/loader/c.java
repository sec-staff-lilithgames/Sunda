package com.fyber.inneractive.sdk.flow.storepromo.loader;

import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f23814b;

    public c(d dVar, String str) {
        this.f23814b = dVar;
        this.f23813a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f23814b.f23815a;
        String str = this.f23813a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f23818a;
        if (aVar != null) {
            try {
                aVar.loadDataWithBaseURL(null, str, "text/html", C.UTF8_NAME, null);
            } catch (Throwable th2) {
                if (fVar.f23822e != null) {
                    fVar.f23822e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, e2.o(th2, new StringBuilder("Unable to load data: ")), "");
                }
            }
        }
    }
}
