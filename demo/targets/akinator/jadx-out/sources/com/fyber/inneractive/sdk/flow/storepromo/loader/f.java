package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a, com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a f23818a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.model.c f23819b;

    /* renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b f23820c;

    /* renamed from: e, reason: collision with root package name */
    public a f23822e;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b f23821d = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b(this);

    /* renamed from: f, reason: collision with root package name */
    public i f23823f = new i();

    public f(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, a aVar) {
        this.f23822e = aVar;
        this.f23820c = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.b(this, this.f23822e);
        try {
            this.f23818a = new com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a(this.f23820c);
        } catch (Throwable th2) {
            IAlog.a("failed to create a promo webview", new Object[0]);
            this.f23822e.a(com.fyber.inneractive.sdk.network.events.b.NO_WEBVIEW_INSTALLED, th2.getLocalizedMessage(), null);
        }
        this.f23819b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(int i10, g1 g1Var) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void b() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f23818a;
        if (aVar != null) {
            aVar.a("DTStorePromoBridge.nativeCallComplete()");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        a aVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = this.f23818a;
        if (aVar2 == null || (cVar = this.f23819b) == null || (aVar = this.f23822e) == null) {
            return;
        }
        aVar.a(aVar2, cVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a
    public final void a(HashMap map) {
        String str = (String) map.get("error");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown error occurred on Store Promo side";
        }
        a aVar = this.f23822e;
        if (aVar != null) {
            aVar.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, str, null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a
    public final void a(String str, HashMap map) throws NumberFormatException {
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = this.f23818a;
        if (aVar == null) {
            IAlog.b("StorePromoContentLoader: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.b bVar = this.f23821d;
        if (bVar != null) {
            bVar.a(str, map, aVar.getLastClickedLocation());
        }
    }
}
