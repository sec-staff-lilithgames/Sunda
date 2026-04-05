package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f24282a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f24283b;

    /* renamed from: c, reason: collision with root package name */
    public final h f24284c;

    /* renamed from: d, reason: collision with root package name */
    public p0 f24285d;

    /* renamed from: e, reason: collision with root package name */
    public l f24286e;

    /* renamed from: f, reason: collision with root package name */
    public volatile i1 f24287f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24288g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f24289h;

    /* renamed from: i, reason: collision with root package name */
    public long f24290i;

    /* renamed from: j, reason: collision with root package name */
    public long f24291j;

    /* renamed from: k, reason: collision with root package name */
    public int f24292k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24293l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24294m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f24295n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24296o;

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f24282a = false;
        this.f24287f = i1.INITIAL;
        this.f24290i = 0L;
        this.f24291j = 0L;
        this.f24292k = 0;
        this.f24293l = false;
        this.f24294m = false;
        this.f24295n = new Object();
        this.f24296o = false;
        this.f24283b = f0Var;
        this.f24284c = hVar;
        this.f24288g = UUID.randomUUID().toString();
        this.f24289h = rVar;
    }

    public abstract o0 a(l lVar, Map map, int i10);

    public void a(o0 o0Var, String str, String str2) {
    }

    public void b(long j10) {
        synchronized (this.f24295n) {
            try {
                if (this.f24294m) {
                    this.f24292k = (int) ((j10 - this.f24290i) + this.f24292k);
                    this.f24294m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        this.f24282a = true;
    }

    public void d() {
        boolean z10;
        synchronized (this.f24295n) {
            z10 = this.f24293l;
        }
        if (z10) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public void e() {
        try {
            l lVar = this.f24286e;
            if (lVar != null) {
                lVar.a();
            }
            this.f24284c.getClass();
        } catch (Exception unused) {
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public int j() {
        return this.f24292k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.f24289h;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public String n() {
        return "application/json; charset=utf-8";
    }

    public abstract g1 o();

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        return new l1(iAConfigManager.f23226u.f23394b.a("connect_timeout", 5000, 1), iAConfigManager.f23226u.f23394b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i10;
        synchronized (this.f24295n) {
            i10 = this.f24292k;
        }
        return i10;
    }

    public abstract String r();

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f24289h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z10;
        synchronized (this.f24295n) {
            z10 = this.f24294m;
        }
        return z10;
    }

    public abstract boolean u();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v() {
        /*
            r4 = this;
            boolean r0 = r4.f24296o
            r1 = 0
            if (r0 == 0) goto L39
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.global.r r0 = r0.M
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.k> r2 = com.fyber.inneractive.sdk.config.global.features.k.class
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r2)
            com.fyber.inneractive.sdk.config.global.features.k r0 = (com.fyber.inneractive.sdk.config.global.features.k) r0
            java.lang.String r2 = "should_add_request_watchdog"
            java.lang.Boolean r2 = r0.c(r2)
            if (r2 == 0) goto L1e
            boolean r2 = r2.booleanValue()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r3 = 1
            if (r2 != 0) goto L35
            java.lang.String r2 = "should_report_request_watchdog"
            java.lang.Boolean r0 = r0.c(r2)
            if (r0 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 == 0) goto L39
            return r3
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.t0.v():boolean");
    }

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.f24285d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.f24286e = this.f24284c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            p0 p0Var2 = this.f24285d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.f24286e;
        } catch (b e10) {
            IAlog.a("failed start network request", e10, new Object[0]);
            throw e10;
        } catch (q1 e11) {
            IAlog.a("failed read network response", e11, new Object[0]);
            throw e11;
        } catch (Exception e12) {
            IAlog.a("failed start network request", e12, new Object[0]);
            throw e12;
        }
    }

    public void c(long j10) {
        synchronized (this.f24295n) {
            try {
                if (!this.f24293l) {
                    this.f24293l = true;
                    this.f24291j = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(long j10) {
        synchronized (this.f24295n) {
            try {
                if (!this.f24294m) {
                    this.f24294m = true;
                    this.f24290i = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0(t0 t0Var) {
        this.f24282a = false;
        this.f24287f = i1.INITIAL;
        this.f24290i = 0L;
        this.f24291j = 0L;
        this.f24292k = 0;
        this.f24293l = false;
        this.f24294m = false;
        this.f24295n = new Object();
        this.f24296o = false;
        this.f24283b = t0Var.f24283b;
        this.f24284c = t0Var.f24284c;
        this.f24288g = UUID.randomUUID().toString();
        this.f24289h = t0Var.f24289h;
        this.f24292k = t0Var.f24292k;
        this.f24290i = t0Var.f24290i;
        this.f24291j = t0Var.f24291j;
    }

    public final void a(Object obj, Exception exc, boolean z10) {
        p0 p0Var;
        if (!z10) {
            i1 i1Var = i1.RESOLVED;
            this.f24287f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.f24285d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.f26804b.post(new s0(this, obj, exc, z10));
    }

    public final com.fyber.inneractive.sdk.response.e a(int i10, o oVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.j jVar2) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i10);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f23522a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f23523a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i10));
                if (fVar.f23523a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i10);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i10), bVarB);
            if (jVar != null) {
                bVarB.f26620c = jVar;
            }
            bVarB.f26618a = bVarB.a();
            if (oVar != null) {
                bVarB.f26620c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.K = j();
            if (jVar2 != null) {
                eVarA.f26649u = jVar2;
            }
            p0 p0Var = this.f24285d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e10) {
            IAlog.a("failed parse ad network request", e10, new Object[0]);
            throw new n0(e10);
        }
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
        }
        return -1;
    }

    public void a(long j10) {
        synchronized (this.f24295n) {
            try {
                if (this.f24293l) {
                    this.f24292k = (int) ((j10 - this.f24291j) + this.f24292k);
                    this.f24293l = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
