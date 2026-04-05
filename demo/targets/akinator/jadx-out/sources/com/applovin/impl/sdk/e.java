package com.applovin.impl.sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f15387a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15388b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f15390d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f15391e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f15389c = new Object();

    public e(k kVar) {
        this.f15387a = kVar;
        this.f15388b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.f15390d.put(uVar, new q());
            this.f15391e.put(uVar, new q());
        }
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.f15389c) {
            try {
                q qVarB = b(uVar);
                if (qVarB.b() > 0) {
                    return qVarB;
                }
                return d(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f15389c) {
            try {
                qVar = (q) this.f15390d.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f15390d.put(uVar, qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f15389c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.f15388b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f15389c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f15389c) {
            appLovinAdImplD = c(uVar).d();
        }
        return appLovinAdImplD;
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f15389c) {
            try {
                q qVarD = d(uVar);
                if (qVarD.b() > 0) {
                    b(uVar).a(qVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(uVar, this.f15387a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f15388b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + APSSharedUtil.TRUNCATE_SEPARATOR);
                return cVar;
            }
        } else if (o.a()) {
            this.f15388b.a(PcrIk.SmMPOjFOsC, "Unable to retrieve ad of zone " + uVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return cVar;
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.f15389c) {
            try {
                qVar = (q) this.f15391e.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.f15391e.put(uVar, qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f15389c) {
            appLovinAdImplA = c(uVar).a();
        }
        return appLovinAdImplA;
    }
}
