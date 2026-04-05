package com.fyber.inneractive.sdk.flow.storepromo;

import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.storepromo.loader.f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.g;
import com.fyber.inneractive.sdk.flow.storepromo.ui.c;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.b, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f23781k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final g f23782a;

    /* renamed from: b, reason: collision with root package name */
    public final e f23783b;

    /* renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f23784c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.b f23785d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f23786e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23787f;

    /* renamed from: g, reason: collision with root package name */
    public int f23788g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f23789h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f23790i = false;

    /* renamed from: j, reason: collision with root package name */
    public a f23791j = new a();

    public b(v vVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f23782a = new g(vVar, this);
        this.f23787f = vVar.f24146c;
        this.f23783b = eVar;
        this.f23784c = inneractiveAdRequest;
    }

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar = this.f23785d;
        if (bVar != null) {
            c cVar = bVar.f23795d;
            if (cVar != null) {
                if (cVar.f23883b != null && cVar.f23882a != null) {
                    cVar.f23885d.setAnimationListener(cVar.f23890i);
                    cVar.f23882a.setAnimation(cVar.f23885d);
                    cVar.f23882a.setVisibility(8);
                }
                if (cVar.f23883b != null) {
                    cVar.f23882a = null;
                    cVar.f23883b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.ui.b bVar2 = cVar.f23886e;
                if (bVar2 != null) {
                    try {
                        o.f26796a.unregisterReceiver(bVar2);
                    } catch (Exception unused) {
                    }
                    cVar.f23886e = null;
                }
                cVar.f23887f = null;
                bVar.f23795d = null;
            }
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar.f23794c;
            if (cVar2 != null) {
                f fVar = cVar2.f23804d;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f23818a;
                    if (aVar != null) {
                        aVar.destroy();
                        fVar.f23818a = null;
                    }
                    fVar.f23822e = null;
                    fVar.f23821d = null;
                    fVar.f23820c = null;
                    fVar.f23823f = null;
                    fVar.f23819b = null;
                }
                com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar2 = cVar2.f23802b;
                if (aVar2 != null) {
                    aVar2.destroy();
                    cVar2.f23802b = null;
                }
                cVar2.f23806f = null;
                cVar2.f23807g = null;
                cVar2.f23803c = null;
                cVar2.f23804d = null;
                bVar.f23794c = null;
            }
            bVar.f23800i = null;
            bVar.f23796e = null;
            bVar.f23797f = null;
            bVar.f23799h = null;
            this.f23785d = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        c cVar;
        View view;
        this.f23790i = true;
        com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar = this.f23786e;
        if (bVar != null) {
            bVar.a(g1Var);
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = this.f23785d;
        com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.f23795d) == null || cVar.f23883b == null || (view = cVar.f23882a) == null || view.getParent() == null || cVar.f23883b.getVisibility() != 0) ? false : true, this.f23790i);
        Iterator it = this.f23789h.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        a(bVar.name(), str, str2);
    }

    public final void a(String str, String str2, String str3) {
        IAlog.b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.f23791j != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f23784c;
            e eVar = this.f23783b;
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(str2)) {
                map.put("error", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("failedURL", str3);
            }
            com.fyber.inneractive.sdk.network.events.a.a(t.ERROR_STORE_PROMO_FAILURE, str, (String) null, inneractiveAdRequest, eVar, map, (Boolean) null);
            this.f23791j = null;
        }
    }
}
