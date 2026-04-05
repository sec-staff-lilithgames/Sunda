package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.k;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.a {

    /* renamed from: a, reason: collision with root package name */
    public final InneractiveAdRequest f23792a;

    /* renamed from: b, reason: collision with root package name */
    public final e f23793b;

    /* renamed from: c, reason: collision with root package name */
    public c f23794c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.ui.c f23795d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f23796e;

    /* renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f23797f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23798g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f23799h;

    /* renamed from: i, reason: collision with root package name */
    public k f23800i;

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar, com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f23799h = aVar;
        this.f23794c = new c(cVar, this, this);
        this.f23797f = bVar;
        this.f23792a = inneractiveAdRequest;
        this.f23793b = eVar;
        this.f23796e = bVar2;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = this.f23795d;
        if (cVar != null) {
            if (cVar.f23883b != null && cVar.f23882a != null) {
                cVar.f23885d.setAnimationListener(cVar.f23890i);
                cVar.f23882a.setAnimation(cVar.f23885d);
                cVar.f23882a.setVisibility(8);
            }
            k kVar = this.f23800i;
            if (kVar == null || kVar.f23574b.a() == null || kVar.f23574b.a().f().b() == null) {
                return;
            }
            IAlog.a("%sonStorePromoDismissed restoring endcard focus", IAlog.a(kVar));
            kVar.f23574b.a().f().b().requestFocus();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) throws JSONException {
        this.f23795d = new com.fyber.inneractive.sdk.flow.storepromo.ui.c(IAConfigManager.O.f23227v.a(), aVar, this.f23797f);
        u uVar = u.VAST_EVENT_SP_LOADED;
        InneractiveAdRequest inneractiveAdRequest = this.f23792a;
        e eVar = this.f23793b;
        String str = cVar.f23873h;
        w wVar = new w(uVar, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
        IAlog.a("StorePromoController: onContentLoadedSuccess", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f23798g = true;
        a();
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f23799h;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
        }
    }
}
