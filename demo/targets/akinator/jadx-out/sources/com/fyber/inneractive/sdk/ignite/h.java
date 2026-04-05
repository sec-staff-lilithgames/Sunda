package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements ab.b, ab.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f23978a;

    /* renamed from: b, reason: collision with root package name */
    public IIgniteServiceAPI f23979b;

    /* renamed from: k, reason: collision with root package name */
    public long f23988k;

    /* renamed from: l, reason: collision with root package name */
    public String f23989l;

    /* renamed from: m, reason: collision with root package name */
    public d f23990m;

    /* renamed from: n, reason: collision with root package name */
    public bb.a f23991n;

    /* renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f23992o;

    /* renamed from: p, reason: collision with root package name */
    public l f23993p;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23980c = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23982e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23983f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23984g = false;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f23985h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f23986i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23987j = false;

    /* renamed from: d, reason: collision with root package name */
    public final i f23981d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean z10;
        h hVar;
        this.f23992o = rVar;
        if (!TextUtils.isEmpty(this.f23989l)) {
            IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) rVar.a(com.fyber.inneractive.sdk.config.global.features.i.class);
            IAlog.a("%s : initializing ignite features", "IgniteAdapter");
            Boolean boolC = iVar.c("odt");
            this.f23982e = boolC != null ? boolC.booleanValue() : false;
            Boolean boolC2 = iVar.c("flow");
            this.f23983f = boolC2 != null ? boolC2.booleanValue() : false;
            Boolean boolC3 = iVar.c("updates");
            this.f23984g = boolC3 != null ? boolC3.booleanValue() : false;
            Context context = this.f23978a;
            if (context != null && ((z10 = this.f23982e) || this.f23983f)) {
                if (this.f23993p == null) {
                    this.f23987j = false;
                    hVar = this;
                    l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z10, this.f23983f, this.f23984g, hVar);
                    hVar.f23993p = lVar;
                    lVar.authenticate();
                } else {
                    hVar = this;
                }
                hVar.f23988k = TimeUnit.SECONDS.toMillis(IAConfigManager.O.f23228w.f23398a.f23394b.a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }

    public final void m() {
        d dVar = this.f23990m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar);
            this.f23990m = null;
        }
    }

    public final boolean n() {
        l lVar = this.f23993p;
        return lVar != null && lVar.isConnected() && this.f23993p.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.f23993p;
        return lVar == null || lVar.f88175a.f();
    }

    @Override // ab.b
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.f23993p;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // ab.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.f23993p;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // ab.a
    public final void onIgniteServiceAuthenticated(String str) {
        this.f23980c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        bb.a aVar = this.f23991n;
        if (aVar != null) {
            aVar.a();
            this.f23991n = null;
        }
    }

    @Override // ab.a
    public final void onIgniteServiceAuthenticationFailed(String str) throws JSONException {
        this.f23979b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        bb.a aVar = this.f23991n;
        if (aVar != null) {
            aVar.a(str);
            this.f23991n = null;
        }
    }

    @Override // ab.a
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.f23989l = componentName.getPackageName();
        this.f23979b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.f23987j) {
            l lVar = this.f23993p;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.f23987j = true;
        byte[] byteArray = null;
        try {
            o oVarNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.O.f23208c;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.f26796a.getPackageName();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setSdkVersion(version);
            String str3 = this.f23989l;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.f23989l) || (context = this.f23978a) == null) {
                str = null;
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setIgniteVersionName(str);
                String strA = com.fyber.inneractive.sdk.util.o.a(this.f23978a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setAppSignature(strA);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.f23989l, 0).versionName;
                } catch (Exception unused) {
                    IAlog.a("Failed to resolve ignite version", new Object[0]);
                }
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setIgniteVersionName(str);
                String strA2 = com.fyber.inneractive.sdk.util.o.a(this.f23978a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.f26483b).setAppSignature(strA2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.O.f23224s.a(new a1(new b(this), byteArray, this.f23992o));
        }
    }

    @Override // ab.a
    public final void onIgniteServiceConnectionFailed(String str) throws JSONException {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // ab.a
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f23983f || (lVar = this.f23993p) == null) {
            return;
        }
        lVar.destroy();
        this.f23993p = null;
    }

    public final void a(j jVar, String str) throws JSONException {
        if (this.f23986i) {
            return;
        }
        this.f23986i = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.f24325b = tVar;
        wVar.f24324a = null;
        wVar.f24327d = null;
        JSONObject jSONObject = new JSONObject();
        String strA = jVar.a();
        try {
            jSONObject.put("error_code", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, str);
            }
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(bb.a aVar) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + aVar, new Object[0]);
        this.f23991n = aVar;
        l lVar = this.f23993p;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(String str, g gVar) throws JSONException {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.f23988k));
        d dVar = new d(this);
        this.f23990m = dVar;
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(dVar, this.f23988k);
        if (n() && !o() && this.f23979b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.f23979b;
                String string = jSONObject.toString();
                Bundle bundle = this.f23980c;
                Bundle bundle2 = new Bundle();
                i iVar = this.f23981d;
                c cVar = new c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(string, bundle, bundle2, new s((e) iVar.f23994a, cVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        Iterator it = this.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                if (o()) {
                    strA = j.SESSION_EXPIRED.a();
                } else {
                    strA = j.NOT_CONNECTED.a();
                }
                rVar.a((String) null, strA, (String) null);
            }
        }
    }
}
