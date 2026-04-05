package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.nativead.g;
import com.fyber.inneractive.sdk.flow.nativead.s;
import com.fyber.inneractive.sdk.flow.nativead.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.u0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.nativead.j;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements d, s {

    /* renamed from: h, reason: collision with root package name */
    public static final String f23718h = IAlog.a(b.class);

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f23719a;

    /* renamed from: b, reason: collision with root package name */
    public c f23720b;

    /* renamed from: c, reason: collision with root package name */
    public u0 f23721c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f23722d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* renamed from: e, reason: collision with root package name */
    public j f23723e;

    /* renamed from: f, reason: collision with root package name */
    public r f23724f;

    /* renamed from: g, reason: collision with root package name */
    public long f23725g;

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, j jVar, r rVar) {
        this.f23719a = fVar;
        this.f23720b = fVar2;
        this.f23723e = jVar;
        this.f23724f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(g gVar, Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) throws Throwable {
        String message;
        if (this.f23722d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.f23722d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = "Failed to download main media image: " + iVar.name();
            }
            IAlog.f("%s : %s", f23718h, message);
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            c cVar = this.f23720b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, message);
                return;
            }
            return;
        }
        if (this.f23723e != null && this.f23724f != null) {
            u uVar = u.EVENT_READY_ON_CLIENT;
            j jVar = this.f23723e;
            JSONArray jSONArrayB = this.f23724f.b();
            w wVar = new w(jVar);
            wVar.f24326c = uVar;
            wVar.f24324a = null;
            wVar.f24327d = jSONArrayB;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f23725g;
            IAlog.a(o2.n(jCurrentTimeMillis, "%sMain image load took: ", " msec"), IAlog.a(this));
            JSONObject jSONObject = new JSONObject();
            String str = this.f23719a.f26666d.f26660a;
            try {
                jSONObject.put("url", str);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", str);
            }
            String strB = com.fyber.inneractive.sdk.util.u.b(gVar.f23699b);
            try {
                jSONObject.put("mime", strB);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "mime", strB);
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            try {
                jSONObject.put("load_time", lValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "load_time", lValueOf);
            }
            wVar.f24329f.put(jSONObject);
            wVar.a((String) null);
        }
        this.f23722d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar2 = this.f23720b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.f23689d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f23719a;
        if (fVar != null && (cVar = fVar.f26666d) != null && (str = cVar.f26660a) != null && !str.trim().isEmpty()) {
            this.f23725g = System.currentTimeMillis();
            this.f23722d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            t tVar = new t(this.f23719a, this);
            IAConfigManager iAConfigManager = IAConfigManager.O;
            u0 u0Var = new u0(tVar, iAConfigManager.f23227v.f23318a, new com.fyber.inneractive.sdk.cache.d(this.f23719a.f26666d.f26660a));
            this.f23721c = u0Var;
            iAConfigManager.f23224s.a(u0Var);
            return;
        }
        a aVar = new a("Main media image is not loadable");
        this.f23722d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        i iVar = i.NATIVE_AD_IMAGE_LOAD_FAILED;
        String message = aVar.getMessage();
        IAlog.f("%s : %s", f23718h, message);
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        c cVar2 = this.f23720b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u0 u0Var = this.f23721c;
        if (u0Var != null) {
            u0Var.c();
            this.f23721c = null;
        }
        this.f23723e = null;
        this.f23724f = null;
        this.f23719a = null;
        this.f23720b = null;
        this.f23722d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f23722d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
