package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {
    public String A;
    public Boolean B;
    public String C;
    public int D;
    public InneractiveUserConfig.Gender E;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final boolean K;
    public Boolean L;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f23092a;

    /* renamed from: b, reason: collision with root package name */
    public String f23093b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23094c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23096e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23097f;

    /* renamed from: g, reason: collision with root package name */
    public String f23098g;

    /* renamed from: h, reason: collision with root package name */
    public String f23099h;

    /* renamed from: i, reason: collision with root package name */
    public String f23100i;

    /* renamed from: j, reason: collision with root package name */
    public String f23101j;

    /* renamed from: k, reason: collision with root package name */
    public String f23102k;

    /* renamed from: l, reason: collision with root package name */
    public Long f23103l;

    /* renamed from: m, reason: collision with root package name */
    public int f23104m;

    /* renamed from: n, reason: collision with root package name */
    public int f23105n;

    /* renamed from: o, reason: collision with root package name */
    public final q f23106o;

    /* renamed from: p, reason: collision with root package name */
    public String f23107p;

    /* renamed from: q, reason: collision with root package name */
    public String f23108q;

    /* renamed from: r, reason: collision with root package name */
    public final d0 f23109r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f23110s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f23111t;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f23112u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23113v;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f23114w;

    /* renamed from: x, reason: collision with root package name */
    public Boolean f23115x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f23116y;

    /* renamed from: z, reason: collision with root package name */
    public int f23117z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.f23092a = cVar;
        if (TextUtils.isEmpty(this.f23093b)) {
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new c(this));
        }
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.0");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        this.f23094c = sb2.toString();
        this.f23095d = com.fyber.inneractive.sdk.util.o.f26796a.getPackageName();
        this.f23096e = com.fyber.inneractive.sdk.util.k.j();
        this.f23097f = com.fyber.inneractive.sdk.util.k.l();
        this.f23104m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f23105n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f26681a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f23106o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.f23109r = (!com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.O.f23222q) ? d0.SECURE : d0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f23219n)) {
            this.H = iAConfigManager.f23217l;
        } else {
            this.H = w0.i.d(iAConfigManager.f23217l, "_", iAConfigManager.f23219n);
        }
        this.K = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.f23111t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.f23114w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.f23115x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.f23116y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f23092a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        this.f23098g = iAConfigManager.f23220o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f23092a.getClass();
            this.f23099h = com.fyber.inneractive.sdk.util.k.i();
            this.f23100i = this.f23092a.a();
            String str = this.f23092a.f26686b;
            this.f23101j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f23092a.f26686b;
            this.f23102k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f23092a.getClass();
            z0 z0VarA = z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            this.f23108q = z0VarA.b();
            int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f23410a.f23418b;
                property = vVar != null ? vVar.f23414a : null;
            }
            this.A = property;
            this.G = iAConfigManager.f23215j.getZipCode();
        }
        this.E = iAConfigManager.f23215j.getGender();
        this.D = iAConfigManager.f23215j.getAge();
        this.f23103l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f23092a.getClass();
        ArrayList arrayList = iAConfigManager.f23221p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f23107p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.f23113v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.f23117z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.F = iAConfigManager.f23216k;
        this.f23110s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (TextUtils.isEmpty(iAConfigManager.f23219n)) {
            this.H = iAConfigManager.f23217l;
        } else {
            this.H = w0.i.d(iAConfigManager.f23217l, "_", iAConfigManager.f23219n);
        }
        this.f23112u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.E.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f23993p;
        this.I = lVar != null ? lVar.f88175a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f23993p;
        this.J = lVar2 != null ? lVar2.f88175a.d() : null;
        this.f23092a.getClass();
        this.f23104m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f23092a.getClass();
        this.f23105n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.L = com.fyber.inneractive.sdk.serverapi.b.j();
        com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
        if (bVar != null && IAConfigManager.f()) {
            this.N = bVar.f26693f;
            this.M = bVar.f26692e;
        }
    }
}
