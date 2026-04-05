package com.ironsource;

import android.content.Context;
import com.ironsource.C3272id;
import com.ironsource.Mb;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3568ze {

    /* renamed from: b, reason: collision with root package name */
    private static Qe f39379b;

    /* renamed from: h, reason: collision with root package name */
    private static C3326le f39385h;

    /* renamed from: i, reason: collision with root package name */
    private static C3364ne f39386i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f39387j;

    /* renamed from: k, reason: collision with root package name */
    private static long f39388k;

    /* renamed from: a, reason: collision with root package name */
    public static final C3568ze f39378a = new C3568ze();

    /* renamed from: c, reason: collision with root package name */
    private static final tu.o f39380c = tu.q.lazy(a.f39389a);

    /* renamed from: d, reason: collision with root package name */
    private static final String f39381d = "ze";

    /* renamed from: e, reason: collision with root package name */
    private static final De f39382e = new De();

    /* renamed from: f, reason: collision with root package name */
    private static final Ke f39383f = new Ke();

    /* renamed from: g, reason: collision with root package name */
    private static final List<InterfaceC3432re> f39384g = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.ze$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39389a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3357n7 invoke() {
            return Mb.f34856s.d().k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.ze$b */
    public static final class b implements InterfaceC3432re {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f39390a;

        public b(Context context) {
            this.f39390a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C3364ne error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
            C3568ze.f39378a.a(error);
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3326le sdkConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "sdkConfig");
            C3568ze.f39382e.a(new ni(2, this.f39390a, sdkConfig));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context applicationContext, C3326le sdkConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "$sdkConfig");
            C3568ze c3568ze = C3568ze.f39378a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
            c3568ze.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC3432re
        public void a(C3364ne error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            C3568ze.f39382e.a(new qi(error, 1));
        }
    }

    private C3568ze() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f39378a.a(true);
    }

    public final void e() {
        f39382e.c(new al.b(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3483ue serverResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverResponse, "$serverResponse");
        C3326le c3326le = new C3326le(serverResponse);
        C3568ze c3568ze = f39378a;
        c3568ze.b(c3326le);
        c3568ze.a(c3326le);
    }

    private final InterfaceC3357n7 c() {
        return (InterfaceC3357n7) f39380c.getValue();
    }

    private final void d() {
        if (Mb.f34856s.d().g().g()) {
            C3147be.i().a(new C5(D5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3364ne error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        f39378a.a(error);
    }

    private final void a(Context context, V9 v92, Me me2) {
        v92.i(me2.f().h());
        v92.c(me2.f().d());
        A1 a1B = me2.c().b();
        kotlin.jvm.internal.e0.checkNotNull(a1B);
        v92.a(a1B.a());
        v92.d(a1B.c().b());
        v92.b(a1B.k().b());
        v92.a(Boolean.valueOf(IronSourceUtils.c(context)));
        A1 a1B2 = me2.c().b();
        kotlin.jvm.internal.e0.checkNotNull(a1B2);
        v92.b(a1B2.f().b());
    }

    public final void b(C3364ne error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        f39382e.c(new qi(error, 0));
    }

    private final void b(C3326le c3326le) {
        f39385h = c3326le;
        a(false);
    }

    private final Be b() {
        if (f39385h != null) {
            return Be.INITIATED;
        }
        if (f39386i != null) {
            return Be.INIT_FAILED;
        }
        if (f39387j) {
            return Be.INIT_IN_PROGRESS;
        }
        return Be.NOT_INIT;
    }

    public final void a(Context context, C3466te initRequest, InterfaceC3432re listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        f39382e.c(new al.a(listener, context, initRequest, context.getApplicationContext(), 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3432re listener, Context context, C3466te c3466te, Context context2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullParameter(c3466te, PcrIk.oQgiQiXmQnZOAaa);
        C3326le c3326le = f39385h;
        if (c3326le != null) {
            f39378a.a(listener, c3326le);
            return;
        }
        f39384g.add(listener);
        if (f39387j) {
            return;
        }
        f39386i = null;
        f39378a.a(true);
        f39388k = b0.e2.c();
        f39383f.a(context, c3466te, f39382e, new b(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC3432re listener, C3326le sdkConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC3432re listener, C3364ne error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "$error");
        listener.a(error);
    }

    private final void b(Context context, C3326le c3326le) {
        Context context2;
        H1 h1B;
        Rb rbE;
        H1 h1G;
        V2 v2C;
        H1 h1G2;
        F9 f9D;
        H1 h1I;
        Zd zdF;
        H1 h1M;
        H1 h1B2;
        Me meD = c3326le.d();
        A1 a1B = meD.c().b();
        boolean zL = (a1B == null || (h1B2 = a1B.b()) == null) ? false : h1B2.l();
        V3 v3C = meD.c();
        boolean zL2 = (v3C == null || (zdF = v3C.f()) == null || (h1M = zdF.m()) == null) ? false : h1M.l();
        V3 v3C2 = meD.c();
        boolean zL3 = (v3C2 == null || (f9D = v3C2.d()) == null || (h1I = f9D.i()) == null) ? false : h1I.l();
        V3 v3C3 = meD.c();
        boolean zL4 = (v3C3 == null || (v2C = v3C3.c()) == null || (h1G2 = v2C.g()) == null) ? false : h1G2.l();
        V3 v3C4 = meD.c();
        boolean zL5 = (v3C4 == null || (rbE = v3C4.e()) == null || (h1G = rbE.g()) == null) ? false : h1G.l();
        if (zL) {
            A1 a1B2 = meD.c().b();
            if (a1B2 == null || (h1B = a1B2.b()) == null) {
                context2 = context;
            } else {
                context2 = context;
                a(f39378a, Mb.f34856s.d().q(), h1B, context2, meD, false, 16, null);
            }
        } else {
            context2 = context;
            Mb.f34856s.d().q().a(false);
        }
        if (zL2) {
            V3 v3C5 = meD.c();
            Zd zdF2 = v3C5 != null ? v3C5.f() : null;
            kotlin.jvm.internal.e0.checkNotNull(zdF2);
            H1 rewardedVideoConfig = zdF2.m();
            C3147be c3147beI = C3147be.i();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3147beI, "getInstance()");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, c3147beI, rewardedVideoConfig, context2, meD, false, 16, null);
        } else {
            C3147be.i().a(false);
        }
        if (zL3) {
            V3 v3C6 = meD.c();
            F9 f9D2 = v3C6 != null ? v3C6.d() : null;
            kotlin.jvm.internal.e0.checkNotNull(f9D2);
            H1 interstitialConfig = f9D2.i();
            H9 h9I = H9.i();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(h9I, "getInstance()");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, h9I, interstitialConfig, context2, meD, false, 16, null);
        } else if (zL4) {
            V3 v3C7 = meD.c();
            V2 v2C2 = v3C7 != null ? v3C7.c() : null;
            kotlin.jvm.internal.e0.checkNotNull(v2C2);
            H1 bannerConfig = v2C2.g();
            H9 h9I2 = H9.i();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(h9I2, "getInstance()");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            a(this, h9I2, bannerConfig, context2, meD, false, 16, null);
        } else if (zL5) {
            V3 v3C8 = meD.c();
            Rb rbE2 = v3C8 != null ? v3C8.e() : null;
            kotlin.jvm.internal.e0.checkNotNull(rbE2);
            H1 h1G3 = rbE2.g();
            H9 h9I3 = H9.i();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(h9I3, "getInstance()");
            a(this, h9I3, h1G3, context2, meD, false, 16, null);
        } else {
            H9.i().a(false);
        }
        V3 v3C9 = meD.c();
        A1 a1B3 = v3C9 != null ? v3C9.b() : null;
        kotlin.jvm.internal.e0.checkNotNull(a1B3);
        C3289jd c3289jdI = a1B3.i();
        boolean zA = c3289jdI.a();
        String strB = c3289jdI.b();
        boolean zC = c3289jdI.c();
        int iD = c3289jdI.d();
        int[] iArrE = c3289jdI.e();
        int[] iArrF = c3289jdI.f();
        C3272id c3272id = C3272id.O;
        c3272id.a(zA);
        if (zA) {
            c3272id.b(strB, context2);
            c3272id.b(iArrE, context2);
            c3272id.c(iArrF, context2);
            c3272id.b(zC);
            c3272id.c(iD);
        }
    }

    public final void a(C3483ue serverResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverResponse, "serverResponse");
        f39382e.c(new ch(serverResponse, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3364ne c3364ne) {
        f39386i = c3364ne;
        a(false);
        Iterator<InterfaceC3432re> it = f39384g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3364ne);
        }
        f39384g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c3364ne, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C3326le c3326le) {
        b(c3326le);
        K1 k1A = c3326le.a();
        C3120a5 c3120a5 = C3120a5.f35930a;
        c3120a5.c(k1A.g());
        Mb.b bVar = Mb.f34856s;
        bVar.a().o().a(k1A.c());
        c3120a5.a(k1A.f());
        c3120a5.a(k1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(k1A.h());
        c().a(k1A);
        De de2 = f39382e;
        a(context, de2.c(), c3326le.d());
        de2.a(b0.e2.c() - f39388k, c3326le.f());
        Qe qe2 = new Qe();
        f39379b = qe2;
        qe2.a(c());
        IronSourceUtils.e(context, c3326le.d().toString());
        bVar.d().q().c(true);
        H9.i().c(true);
        C3147be.i().c(true);
        C3272id.O.c(true);
        b(context, c3326le);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c3326le.e().b());
        D1 d1B = c3326le.b();
        if (d1B.f()) {
            de2.a(d1B);
        }
        a(c3326le);
        new C3272id.a().a();
        d();
    }

    private final void a(C3326le c3326le) {
        Iterator<InterfaceC3432re> it = f39384g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3326le);
        }
        f39384g.clear();
    }

    private final void a(boolean z10) {
        f39387j = z10;
        f39382e.a(b());
    }

    private final void a(InterfaceC3432re interfaceC3432re, C3326le c3326le) {
        f39382e.e(new dh(interfaceC3432re, c3326le, 2));
    }

    private final void a(InterfaceC3432re interfaceC3432re, C3364ne c3364ne) {
        f39382e.e(new eh(interfaceC3432re, c3364ne, 1));
    }

    public static /* synthetic */ void a(C3568ze c3568ze, AbstractC3472u3 abstractC3472u3, H1 h12, Context context, Me me2, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        c3568ze.a(abstractC3472u3, h12, context, me2, z10);
    }

    private final void a(AbstractC3472u3 abstractC3472u3, H1 h12, Context context, Me me2, boolean z10) {
        abstractC3472u3.a(z10);
        abstractC3472u3.a(h12.c(), context);
        abstractC3472u3.b(h12.d(), context);
        abstractC3472u3.a(h12.f());
        abstractC3472u3.d(h12.e());
        abstractC3472u3.b(h12.a());
        abstractC3472u3.b(h12.i(), context);
        abstractC3472u3.c(h12.h(), context);
        abstractC3472u3.a(h12.j(), context);
        abstractC3472u3.d(h12.g(), context);
        A1 a1B = me2.c().b();
        kotlin.jvm.internal.e0.checkNotNull(a1B);
        abstractC3472u3.a(a1B.j());
        abstractC3472u3.b(h12.k());
        abstractC3472u3.c(h12.b());
    }
}
