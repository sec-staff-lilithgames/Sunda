package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.C3460t8;
import com.ironsource.O;
import com.ironsource.Q8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q9 implements InterfaceC3255he, InterfaceC3541y4, InterfaceC3524x4, InterfaceC3490v4, InterfaceC3507w4, W9, Oc {

    /* renamed from: m, reason: collision with root package name */
    private static final String f35325m = "IronSourceAdsPublisherAgent";

    /* renamed from: n, reason: collision with root package name */
    private static Q9 f35326n;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.e f35327a;

    /* renamed from: b, reason: collision with root package name */
    private String f35328b;

    /* renamed from: c, reason: collision with root package name */
    private String f35329c;

    /* renamed from: d, reason: collision with root package name */
    private Z4 f35330d;

    /* renamed from: e, reason: collision with root package name */
    private C3397pc f35331e;

    /* renamed from: g, reason: collision with root package name */
    private C3245h4 f35333g;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35332f = false;

    /* renamed from: h, reason: collision with root package name */
    private FeaturesManager f35334h = FeaturesManager.getInstance();

    /* renamed from: i, reason: collision with root package name */
    private Q8.a f35335i = Mb.O().j();

    /* renamed from: j, reason: collision with root package name */
    private O.a f35336j = Mb.O().E();

    /* renamed from: k, reason: collision with root package name */
    private O f35337k = Mb.U().G();

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC3426r8 f35338l = Mb.U().t();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35339a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35340b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y4 f35341c;

        public a(String str, String str2, Y4 y42) {
            this.f35339a = str;
            this.f35340b = str2;
            this.f35341c = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q9 q92 = Q9.this;
            q92.f35327a.a(this.f35339a, this.f35340b, this.f35341c, (InterfaceC3541y4) q92);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f35343a;

        public b(JSONObject jSONObject) {
            this.f35343a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q9 q92 = Q9.this;
            q92.f35327a.a(this.f35343a, (InterfaceC3541y4) q92);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y4 f35347c;

        public c(String str, String str2, Y4 y42) {
            this.f35345a = str;
            this.f35346b = str2;
            this.f35347c = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q9 q92 = Q9.this;
            q92.f35327a.a(this.f35345a, this.f35346b, this.f35347c, (InterfaceC3524x4) q92);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35349a;

        public d(String str) {
            this.f35349a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q9 q92 = Q9.this;
            q92.f35327a.a(this.f35349a, q92);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f35351a;

        public e(JSONObject jSONObject) {
            this.f35351a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q9 q92 = Q9.this;
            q92.f35327a.a(this.f35351a, (InterfaceC3524x4) q92);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M9 f35353a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f35354b;

        public f(M9 m9, Map map) {
            this.f35353a = m9;
            this.f35354b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3460t8.e eVar = this.f35353a.i() ? C3460t8.e.Banner : C3460t8.e.Interstitial;
            Y4 y4A = Q9.this.f35330d.a(eVar, this.f35353a);
            C3494v8 c3494v8 = new C3494v8();
            c3494v8.a(G5.f34450x, Boolean.valueOf(this.f35353a.j())).a(G5.G, Boolean.valueOf(this.f35353a.m())).a(G5.f34448v, this.f35353a.g()).a(G5.f34449w, X9.a(this.f35353a)).a(G5.I, Long.valueOf(L.f34778a.b(this.f35353a.e())));
            A8.a(C3219fe.f36705h, c3494v8.a());
            if (eVar == C3460t8.e.Banner) {
                Q9 q92 = Q9.this;
                q92.f35327a.a(q92.f35328b, q92.f35329c, y4A, (InterfaceC3507w4) q92);
                Q9 q93 = Q9.this;
                q93.f35327a.a(y4A, this.f35354b, (InterfaceC3507w4) q93);
                return;
            }
            Q9 q94 = Q9.this;
            q94.f35327a.a(q94.f35328b, q94.f35329c, y4A, (InterfaceC3524x4) q94);
            Q9 q95 = Q9.this;
            q95.f35327a.b(y4A, this.f35354b, q95);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f35356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f35357b;

        public g(Y4 y42, Map map) {
            this.f35356a = y42;
            this.f35357b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            Q9 q92 = Q9.this;
            q92.f35327a.a(this.f35356a, this.f35357b, (InterfaceC3524x4) q92);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M9 f35359a;

        public h(M9 m9) {
            this.f35359a = m9;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3460t8.e eVar = this.f35359a.i() ? C3460t8.e.Banner : C3460t8.e.Interstitial;
            Y4 y4A = Q9.this.f35330d.a(eVar, this.f35359a);
            C3494v8 c3494v8 = new C3494v8();
            c3494v8.a(G5.f34450x, Boolean.valueOf(this.f35359a.j())).a(G5.f34448v, this.f35359a.g()).a(G5.f34449w, X9.a(this.f35359a)).a("isMultipleAdObjects", Boolean.valueOf(this.f35359a.l()));
            A8.a(C3219fe.f36710m, c3494v8.a());
            if (eVar == C3460t8.e.Banner) {
                Q9.this.f35327a.a(y4A);
            } else {
                y4A.a(false);
                Q9.this.f35327a.b(y4A);
            }
        }
    }

    private Q9(Context context, int i10) {
        c(context);
    }

    @Override // com.ironsource.InterfaceC3524x4
    public void onInterstitialAdRewarded(String str, int i10) {
        Y4 y4D = d(C3460t8.e.Interstitial, str);
        Lc lcB = b(y4D);
        if (y4D == null || lcB == null) {
            return;
        }
        lcB.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.InterfaceC3255he, com.ironsource.W9
    public void onPause(Activity activity) {
        if (this.f35332f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.InterfaceC3255he, com.ironsource.W9
    public void onResume(Activity activity) {
        if (this.f35332f) {
            return;
        }
        c(activity);
    }

    public static W9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized Q9 b(Context context) throws Exception {
        return a(context, 0);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C3197ea.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C3450sf(SDKUtils.getNetworkConfiguration().optJSONObject(C3191e4.a.f36373k)));
            C3197ea.e().d(SDKUtils.getSDKVersion());
            this.f35330d = new Z4();
            C3245h4 c3245h4 = new C3245h4();
            this.f35333g = c3245h4;
            if (context instanceof Activity) {
                c3245h4.a((Activity) context);
            }
            int debugMode = this.f35334h.getDebugMode();
            this.f35331e = new C3397pc();
            this.f35327a = new com.ironsource.sdk.controller.e(context, this.f35333g, this.f35330d, V7.f35633a, debugMode, this.f35334h.getDataManagerConfig(), this.f35328b, this.f35329c, this.f35331e);
            Logger.enableLogging(debugMode);
            Logger.i(f35325m, "C'tor");
            a(context);
            this.f35331e.d();
            this.f35331e.e();
            this.f35331e.a(context);
            this.f35331e.b();
            this.f35331e.a();
            this.f35331e.b(context);
            this.f35331e.c();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3524x4
    public void d(String str, String str2) {
        Y4 y4D = d(C3460t8.e.Interstitial, str);
        if (y4D != null) {
            M9 m9C = y4D.c();
            this.f35336j.a(EnumC3330m0.SHOW_FAIL, m9C.e());
            if (c(m9C)) {
                this.f35335i.a(new C3148bf(this.f35337k.a(m9C.e())));
            }
            Lc lcB = b(y4D);
            if (lcB != null) {
                lcB.onInterstitialShowFailed(str2);
            }
        }
    }

    public static synchronized W9 a(String str, String str2, Context context) {
        try {
            if (f35326n == null) {
                A8.a(C3219fe.f36698a);
                f35326n = new Q9(str, str2, context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35326n;
    }

    private Lc b(Y4 y42) {
        if (y42 == null) {
            return null;
        }
        return (Lc) y42.i();
    }

    @Override // com.ironsource.InterfaceC3255he
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f35327a.a(new d(strOptString));
    }

    public static synchronized Q9 a(Context context, int i10) throws Exception {
        try {
            Logger.i(f35325m, "getInstance()");
            if (f35326n == null) {
                f35326n = new Q9(context, i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f35326n;
    }

    @Override // com.ironsource.InterfaceC3490v4
    public void b(C3460t8.e eVar, String str) {
        Lc lcB;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C3460t8.e.RewardedVideo) {
                Qc qcC = c(y4D);
                if (qcC != null) {
                    qcC.d();
                    return;
                }
                return;
            }
            if (eVar != C3460t8.e.Interstitial || (lcB = b(y4D)) == null) {
                return;
            }
            lcB.onInterstitialClose();
        }
    }

    public Q9(String str, String str2, Context context) {
        this.f35328b = str;
        this.f35329c = str2;
        c(context);
    }

    @Override // com.ironsource.W9
    public com.ironsource.sdk.controller.e a() {
        return this.f35327a;
    }

    private Jc a(Y4 y42) {
        if (y42 == null) {
            return null;
        }
        return (Jc) y42.i();
    }

    private Y4 d(C3460t8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f35330d.a(eVar, str);
    }

    @Override // com.ironsource.InterfaceC3255he
    public void a(String str, String str2, String str3, Map<String, String> map, Qc qc2) {
        this.f35328b = str;
        this.f35329c = str2;
        this.f35327a.a(new a(str, str2, this.f35330d.a(C3460t8.e.RewardedVideo, str3, map, qc2)));
    }

    @Override // com.ironsource.InterfaceC3541y4
    public void b(String str, String str2) {
        Qc qcC;
        Y4 y4D = d(C3460t8.e.RewardedVideo, str);
        if (y4D == null || (qcC = c(y4D)) == null) {
            return;
        }
        qcC.a(str2);
    }

    @Override // com.ironsource.InterfaceC3255he
    public void a(JSONObject jSONObject) {
        this.f35327a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC3524x4
    public void b(String str) {
        Y4 y4D = d(C3460t8.e.Interstitial, str);
        if (y4D != null) {
            M9 m9C = y4D.c();
            this.f35336j.a(EnumC3330m0.SHOW_SUCCESS, m9C.e());
            if (c(m9C)) {
                this.f35335i.a(new C3166cf(this.f35337k.a(m9C.e())));
            }
            Lc lcB = b(y4D);
            if (lcB != null) {
                lcB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3255he
    public void a(String str, String str2, String str3, Map<String, String> map, Lc lc2) {
        this.f35328b = str;
        this.f35329c = str2;
        this.f35327a.a(new c(str, str2, this.f35330d.a(C3460t8.e.Interstitial, str3, map, lc2)));
    }

    @Override // com.ironsource.InterfaceC3255he
    public boolean a(String str) {
        return this.f35327a.a(str);
    }

    @Override // com.ironsource.InterfaceC3255he, com.ironsource.W9
    public void a(Activity activity) {
        try {
            Logger.i(f35325m, "release()");
            C3156c5.g();
            this.f35333g.b();
            this.f35327a.a((Context) activity);
            this.f35327a.a();
            this.f35327a = null;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
        f35326n = null;
    }

    @Override // com.ironsource.Y9
    public void b(Activity activity, M9 m9, Map<String, String> map) {
        if (Mb.U().g().d()) {
            this.f35333g.a(activity);
        }
        a(m9, map);
    }

    private Qc c(Y4 y42) {
        if (y42 == null) {
            return null;
        }
        return (Qc) y42.i();
    }

    @Override // com.ironsource.InterfaceC3255he
    public void c(JSONObject jSONObject) {
        this.f35327a.a(new e(jSONObject));
    }

    private void b(M9 m9, Map<String, String> map) {
        Logger.d(f35325m, "loadOnNewInstance " + m9.e());
        this.f35327a.a(new f(m9, map));
    }

    @Override // com.ironsource.InterfaceC3541y4
    public void c(String str) {
        Qc qcC;
        Y4 y4D = d(C3460t8.e.RewardedVideo, str);
        if (y4D == null || (qcC = c(y4D)) == null) {
            return;
        }
        qcC.c();
    }

    @Override // com.ironsource.InterfaceC3490v4
    public void a(C3460t8.e eVar, String str, Y0 y02) {
        Jc jcA;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            y4D.b(2);
            if (eVar == C3460t8.e.RewardedVideo) {
                Qc qcC = c(y4D);
                if (qcC != null) {
                    qcC.a(y02);
                    return;
                }
                return;
            }
            if (eVar == C3460t8.e.Interstitial) {
                Lc lcB = b(y4D);
                if (lcB != null) {
                    lcB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C3460t8.e.Banner || (jcA = a(y4D)) == null) {
                return;
            }
            jcA.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.Y9
    public void b(M9 m9) {
        Logger.d(f35325m, "destroyInstance " + m9.e());
        if (c(m9)) {
            this.f35336j.a(EnumC3330m0.DESTROYED, m9.e());
            this.f35335i.a(new Ye(this.f35337k.a(m9.e())));
        }
        this.f35327a.a(new h(m9));
    }

    @Override // com.ironsource.InterfaceC3490v4
    public void c(C3460t8.e eVar, String str) {
        Qc qcC;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C3460t8.e.Interstitial) {
                Lc lcB = b(y4D);
                if (lcB != null) {
                    lcB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C3460t8.e.RewardedVideo || (qcC = c(y4D)) == null) {
                return;
            }
            qcC.b();
        }
    }

    @Override // com.ironsource.Oc
    public void b(Activity activity) {
        try {
            this.f35327a.e();
            this.f35327a.a((Context) activity);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3507w4
    public void c(String str, String str2) {
        Jc jcA;
        Y4 y4D = d(C3460t8.e.Banner, str);
        if (y4D == null || (jcA = a(y4D)) == null) {
            return;
        }
        jcA.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.InterfaceC3490v4
    public void a(C3460t8.e eVar, String str, String str2) {
        Jc jcA;
        Y4 y4D = d(eVar, str);
        C3494v8 c3494v8A = new C3494v8().a(G5.f34448v, str).a(G5.f34449w, eVar).a(G5.A, str2);
        if (y4D != null) {
            L l9 = L.f34778a;
            c3494v8A.a(G5.I, Long.valueOf(l9.b(y4D.h())));
            c3494v8A.a(G5.f34450x, Boolean.valueOf(B8.a(y4D)));
            l9.a(y4D.h());
            y4D.b(3);
            if (eVar == C3460t8.e.RewardedVideo) {
                Qc qcC = c(y4D);
                if (qcC != null) {
                    qcC.b(str2);
                }
            } else if (eVar == C3460t8.e.Interstitial) {
                Lc lcB = b(y4D);
                if (lcB != null) {
                    lcB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C3460t8.e.Banner && (jcA = a(y4D)) != null) {
                jcA.onBannerLoadFail(str2);
            }
        }
        A8.a(C3219fe.f36706i, c3494v8A.a());
    }

    private void c(M9 m9, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            C3494v8 c3494v8A = new C3494v8().a(G5.A, e10.getMessage()).a(G5.f34450x, Boolean.valueOf(m9.j())).a(G5.G, Boolean.valueOf(m9.m())).a(G5.f34448v, m9.g()).a(G5.f34449w, X9.a(m9)).a(wHkgq.zFx, Long.valueOf(L.f34778a.b(m9.e())));
            L.f34778a.a(m9.e());
            A8.a(C3219fe.f36708k, c3494v8A.a());
            IronLog.INTERNAL.error(e10.toString());
            Logger.d(f35325m, "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        b(m9, map);
    }

    @Override // com.ironsource.Oc
    public void c(Activity activity) {
        this.f35333g.a(activity);
        this.f35327a.g();
        this.f35327a.b(activity);
    }

    @Override // com.ironsource.InterfaceC3541y4
    public void a(String str, int i10) {
        Qc qcC;
        Y4 y4D = d(C3460t8.e.RewardedVideo, str);
        if (y4D == null || (qcC = c(y4D)) == null) {
            return;
        }
        qcC.a(i10);
    }

    public boolean c(M9 m9) {
        return m9.l() && !m9.i() && a(m9);
    }

    @Override // com.ironsource.InterfaceC3490v4
    public void a(C3460t8.e eVar, String str) {
        Jc jcA;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C3460t8.e.RewardedVideo) {
                Qc qcC = c(y4D);
                if (qcC != null) {
                    qcC.a();
                    return;
                }
                return;
            }
            if (eVar == C3460t8.e.Interstitial) {
                Lc lcB = b(y4D);
                if (lcB != null) {
                    lcB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C3460t8.e.Banner || (jcA = a(y4D)) == null) {
                return;
            }
            jcA.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC3490v4
    public void a(C3460t8.e eVar, String str, String str2, JSONObject jSONObject) throws JSONException {
        Jc jcA;
        Y4 y4D = d(eVar, str);
        if (y4D == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f35325m, "Received Event Notification: " + str2 + " for demand source: " + y4D.f());
            if (eVar == C3460t8.e.Interstitial) {
                Lc lcB = b(y4D);
                if (lcB != null) {
                    jSONObject.put("demandSourceName", str);
                    lcB.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C3460t8.e.RewardedVideo) {
                Qc qcC = c(y4D);
                if (qcC != null) {
                    jSONObject.put("demandSourceName", str);
                    qcC.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C3460t8.e.Banner || (jcA = a(y4D)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                jcA.onBannerShowSuccess();
            }
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3524x4
    public void a(String str, JSONObject jSONObject) {
        C3460t8.e eVar = C3460t8.e.Interstitial;
        Y4 y4D = d(eVar, str);
        C3494v8 c3494v8A = new C3494v8().a(G5.f34448v, str);
        if (y4D != null) {
            M9 m9C = y4D.c();
            this.f35336j.a(jSONObject, EnumC3330m0.LOAD_SUCCESS, m9C.e());
            if (c(m9C)) {
                this.f35335i.a(new C3130af(this.f35337k.a(m9C.e())));
            }
            C3494v8 c3494v8A2 = c3494v8A.a(G5.f34449w, B8.a(y4D, eVar)).a(G5.f34450x, Boolean.valueOf(B8.a(y4D)));
            L l9 = L.f34778a;
            c3494v8A2.a(G5.I, Long.valueOf(l9.b(y4D.h())));
            l9.a(y4D.h());
            Lc lcB = b(y4D);
            if (lcB != null) {
                lcB.onInterstitialLoadSuccess(y4D.c());
            }
        }
        A8.a(C3219fe.f36709l, c3494v8A.a());
    }

    @Override // com.ironsource.InterfaceC3524x4
    public void a(String str, String str2) {
        Object obj;
        C3460t8.e eVar = C3460t8.e.Interstitial;
        Y4 y4D = d(eVar, str);
        C3494v8 c3494v8 = new C3494v8();
        c3494v8.a(G5.A, str2).a(G5.f34448v, str);
        if (y4D != null) {
            C3494v8 c3494v8A = c3494v8.a(G5.f34449w, B8.a(y4D, eVar));
            if (y4D.e() == 2) {
                obj = G5.E;
            } else {
                obj = G5.F;
            }
            C3494v8 c3494v8A2 = c3494v8A.a(G5.f34451y, obj).a(G5.f34450x, Boolean.valueOf(B8.a(y4D)));
            L l9 = L.f34778a;
            c3494v8A2.a(G5.I, Long.valueOf(l9.b(y4D.h())));
            l9.a(y4D.h());
            Lc lcB = b(y4D);
            if (lcB != null) {
                lcB.onInterstitialLoadFailed(str2);
            }
        }
        A8.a(C3219fe.f36704g, c3494v8.a());
    }

    @Override // com.ironsource.InterfaceC3255he
    public void a(String str, String str2, int i10) {
        C3460t8.e productType;
        Y4 y4A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (y4A = this.f35330d.a(productType, str2)) == null) {
            return;
        }
        y4A.c(i10);
    }

    @Override // com.ironsource.InterfaceC3507w4
    public void a(String str, C3302k8 c3302k8) {
        Jc jcA;
        Y4 y4D = d(C3460t8.e.Banner, str);
        if (y4D == null || (jcA = a(y4D)) == null) {
            return;
        }
        jcA.onBannerLoadSuccess(y4D.c(), c3302k8);
    }

    @Override // com.ironsource.Y9
    public void a(M9 m9, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C3191e4.h.f36520y0, String.valueOf(jCurrentTimeMillis));
        L.f34778a.a(m9.e(), jCurrentTimeMillis);
        C3494v8 c3494v8 = new C3494v8();
        c3494v8.a(G5.f34450x, Boolean.valueOf(m9.j())).a(G5.G, Boolean.valueOf(m9.m())).a(G5.f34448v, m9.g()).a(G5.f34449w, X9.a(m9)).a(G5.I, Long.valueOf(jCurrentTimeMillis));
        A8.a(C3219fe.f36703f, c3494v8.a());
        Logger.d(f35325m, "loadAd " + m9.e());
        N n9 = new N(m9);
        this.f35336j.a(n9);
        this.f35336j.a(new JSONObject(map), EnumC3330m0.LOAD_REQUEST, n9.c());
        if (c(m9)) {
            this.f35335i.a(new Ze(n9));
        }
        if (m9.k()) {
            c(m9, map);
        } else {
            b(m9, map);
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.Y9
    public void a(Activity activity, M9 m9, Map<String, String> map) {
        this.f35333g.a(activity);
        Logger.i(f35325m, "showAd " + m9.e());
        Y4 y4A = this.f35330d.a(C3460t8.e.Interstitial, m9.e());
        if (y4A == null) {
            return;
        }
        this.f35327a.a(new g(y4A, map));
    }

    @Override // com.ironsource.Y9
    public boolean a(M9 m9) {
        Logger.d(f35325m, "isAdAvailable " + m9.e());
        Y4 y4A = this.f35330d.a(C3460t8.e.Interstitial, m9.e());
        if (y4A == null) {
            return false;
        }
        return y4A.d();
    }

    public void a(Context context) {
        this.f35332f = false;
        Boolean boolC = this.f35338l.c(C3191e4.a.f36369g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f35332f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C3258i(this));
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                C3494v8 c3494v8 = new C3494v8();
                c3494v8.a(G5.f34451y, th2.getMessage());
                A8.a(C3219fe.f36718u, c3494v8.a());
            }
        }
    }
}
