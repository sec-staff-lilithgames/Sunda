package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A9;
import com.ironsource.AbstractC3472u3;
import com.ironsource.B7;
import com.ironsource.Be;
import com.ironsource.Bf;
import com.ironsource.C3120a5;
import com.ironsource.C3125aa;
import com.ironsource.C3127ac;
import com.ironsource.C3131ag;
import com.ironsource.C3147be;
import com.ironsource.C3149bg;
import com.ironsource.C3155c4;
import com.ironsource.C3161ca;
import com.ironsource.C3163cc;
import com.ironsource.C3241h0;
import com.ironsource.C3249h8;
import com.ironsource.C3250h9;
import com.ironsource.C3262i3;
import com.ironsource.C3266i7;
import com.ironsource.C3272id;
import com.ironsource.C3276j0;
import com.ironsource.C3285j9;
import com.ironsource.C3289jd;
import com.ironsource.C3325ld;
import com.ironsource.C3360na;
import com.ironsource.C3373o5;
import com.ironsource.C3390p5;
import com.ironsource.C3398pd;
import com.ironsource.C3422r4;
import com.ironsource.C3467tf;
import com.ironsource.C3565zb;
import com.ironsource.C5;
import com.ironsource.Ce;
import com.ironsource.Cf;
import com.ironsource.D5;
import com.ironsource.Ec;
import com.ironsource.Ed;
import com.ironsource.F9;
import com.ironsource.G3;
import com.ironsource.H1;
import com.ironsource.H2;
import com.ironsource.H9;
import com.ironsource.InterfaceC3124a9;
import com.ironsource.InterfaceC3141b8;
import com.ironsource.InterfaceC3252hb;
import com.ironsource.InterfaceC3357n7;
import com.ironsource.InterfaceC3446sb;
import com.ironsource.K1;
import com.ironsource.K9;
import com.ironsource.L9;
import com.ironsource.M8;
import com.ironsource.Mb;
import com.ironsource.Mc;
import com.ironsource.Me;
import com.ironsource.Nb;
import com.ironsource.O6;
import com.ironsource.Oe;
import com.ironsource.P7;
import com.ironsource.R7;
import com.ironsource.Rb;
import com.ironsource.S5;
import com.ironsource.T4;
import com.ironsource.T7;
import com.ironsource.U3;
import com.ironsource.U4;
import com.ironsource.U9;
import com.ironsource.V2;
import com.ironsource.V3;
import com.ironsource.V6;
import com.ironsource.V9;
import com.ironsource.Wd;
import com.ironsource.Zd;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.u;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.FeaturesManager;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class r implements U9, Mc, T4, T4.b, T4.c, T4.a {

    /* renamed from: m0, reason: collision with root package name */
    private static boolean f37644m0 = false;
    private C3161ca A;
    private final String B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private Boolean J;
    private q K;
    private String L;
    private Boolean M;
    private R7 N;
    private y O;
    private A9 P;
    private Wd Q;
    private H2 R;
    private Ec S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private final ConcurrentHashMap<String, h.d> Z;

    /* renamed from: a, reason: collision with root package name */
    private final String f37645a;

    /* renamed from: a0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.b> f37646a0;

    /* renamed from: b, reason: collision with root package name */
    private final String f37647b;

    /* renamed from: b0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f37648b0;

    /* renamed from: c, reason: collision with root package name */
    private final B7 f37649c;

    /* renamed from: c0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.f f37650c0;

    /* renamed from: d, reason: collision with root package name */
    private final B7.a f37651d;

    /* renamed from: d0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.k f37652d0;

    /* renamed from: e, reason: collision with root package name */
    private final P7 f37653e;

    /* renamed from: e0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.c f37654e0;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3357n7 f37655f;

    /* renamed from: f0, reason: collision with root package name */
    private S5 f37656f0;

    /* renamed from: g, reason: collision with root package name */
    private final M8.a f37657g;

    /* renamed from: g0, reason: collision with root package name */
    private V9 f37658g0;

    /* renamed from: h, reason: collision with root package name */
    private IronSourceLoggerManager f37659h;

    /* renamed from: h0, reason: collision with root package name */
    private V6 f37660h0;

    /* renamed from: i, reason: collision with root package name */
    private C3565zb f37661i;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f37662i0;

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f37663j;

    /* renamed from: j0, reason: collision with root package name */
    private AdQualityBridge f37664j0;

    /* renamed from: k, reason: collision with root package name */
    private final Object f37665k;

    /* renamed from: k0, reason: collision with root package name */
    InterfaceC3141b8<ISDemandOnlyInterstitialListener> f37666k0;

    /* renamed from: l, reason: collision with root package name */
    private Me f37667l;

    /* renamed from: l0, reason: collision with root package name */
    InterfaceC3141b8<ISDemandOnlyRewardedVideoListener> f37668l0;

    /* renamed from: m, reason: collision with root package name */
    private String f37669m;

    /* renamed from: n, reason: collision with root package name */
    private String f37670n;

    /* renamed from: o, reason: collision with root package name */
    private String f37671o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f37672p;

    /* renamed from: q, reason: collision with root package name */
    private String f37673q;

    /* renamed from: r, reason: collision with root package name */
    private AtomicBoolean f37674r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37675s;

    /* renamed from: t, reason: collision with root package name */
    private List<IronSource.a> f37676t;

    /* renamed from: u, reason: collision with root package name */
    private String f37677u;

    /* renamed from: v, reason: collision with root package name */
    private Context f37678v;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f37679w;

    /* renamed from: x, reason: collision with root package name */
    private Set<IronSource.a> f37680x;

    /* renamed from: y, reason: collision with root package name */
    private Set<IronSource.a> f37681y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f37682z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37683a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37684b;

        static {
            int[] iArr = new int[u.d.values().length];
            f37684b = iArr;
            try {
                iArr[u.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37684b[u.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37684b[u.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37684b[u.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f37683a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37683a[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37683a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37683a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        static volatile r f37685a = new r(0);

        private c() {
        }
    }

    public /* synthetic */ r(int i10) {
        this();
    }

    private boolean A() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.j() == null || this.f37667l.j().a() == null || this.f37667l.j().a().size() <= 0) ? false : true;
    }

    private synchronized boolean C() {
        return this.f37675s;
    }

    private boolean D() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.c() == null || this.f37667l.c().d() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.j() == null || this.f37667l.j().b() == null || this.f37667l.j().b().size() <= 0) ? false : true;
    }

    private boolean H() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.c() == null || this.f37667l.c().e() == null) ? false : true;
    }

    private boolean I() {
        return H() && J();
    }

    private boolean J() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.j() == null || this.f37667l.j().c() == null || this.f37667l.j().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.c() == null || this.f37667l.c().f() == null) ? false : true;
    }

    private boolean M() {
        return L() && N();
    }

    private boolean N() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.j() == null || this.f37667l.j().d() == null || this.f37667l.j().d().size() <= 0) ? false : true;
    }

    private void T() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C3360na.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f37597c)) {
            if (TextUtils.isEmpty(concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f37597c).get(0))) {
                return;
            }
            C3120a5.f35930a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private void U() throws JSONException {
        if (this.F) {
            W();
            return;
        }
        boolean zH = this.f37667l.c().c().d().h();
        this.X = zH;
        if (zH) {
            V();
        } else {
            c0();
        }
    }

    private void V() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f37667l.j().a());
        if (listA.size() > 0) {
            this.R = new H2(listA, this.f37667l.c().c(), IronSourceUtils.f(), C3360na.b(), this.A);
            u();
        } else {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
        }
    }

    private void W() throws JSONException {
        this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f37667l.j().a().size(); i10++) {
            String str = this.f37667l.j().a().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f37667l.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.f37646a0) {
            try {
                V2 v2C = this.f37667l.c().c();
                U4.a aVar = new U4.a("Mediation");
                if (v2C.k()) {
                    aVar.a("isOneFlow", 1);
                }
                this.f37654e0 = new com.ironsource.mediationsdk.demandOnly.c(arrayList, v2C, n(), o(), new U4.b(H9.i(), aVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (h.b bVar : this.f37646a0.values()) {
            this.f37654e0.a(bVar.g(), bVar.e());
        }
        this.f37646a0.clear();
    }

    private void X() throws JSONException {
        this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f37667l.j().b().size(); i10++) {
            String str = this.f37667l.j().b().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f37667l.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.f37252c, false);
            return;
        }
        synchronized (this.Z) {
            this.f37650c0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.Z.values().iterator();
        while (it.hasNext()) {
            this.f37650c0.a(it.next());
        }
        this.Z.clear();
    }

    private void Y() {
        this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f37667l.j().d().size(); i10++) {
            String str = this.f37667l.j().d().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f37667l.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f37648b0) {
            this.f37652d0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.f37648b0.values().iterator();
        while (it.hasNext()) {
            this.f37652d0.a(it.next());
        }
        this.f37648b0.clear();
    }

    private void Z() throws JSONException {
        if (this.E) {
            X();
        } else {
            a0();
        }
    }

    private void a0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f37667l.j().b());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.f37252c, false);
            return;
        }
        A9 a92 = new A9(listA, this.f37667l.c().d(), IronSourceUtils.f(), C3360na.b(), this.A);
        this.P = a92;
        Boolean bool = this.f37679w;
        if (bool != null) {
            a92.a(this.f37678v, bool.booleanValue());
        }
        if (this.W) {
            this.W = false;
            this.P.A();
        }
    }

    private boolean b(List<IronSource.a> list, boolean z10, V3 v32) throws JSONException {
        IronLog.INTERNAL.verbose();
        try {
            this.f37676t = list;
            c(true);
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.i("init success");
            if (z10) {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                try {
                    jSONObjectB.put("revived", true);
                } catch (JSONException e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
                Mb.U().q().a(new C5(D5.FIRST_INSTANCE_RESULT, jSONObjectB));
            }
            int iB = v32.b().f().b();
            if (iB >= 0) {
                C3155c4 c3155c4 = new C3155c4();
                c3155c4.a(iB);
                c3155c4.a(iB, this.f37667l.k().d());
            }
            H9.i().h();
            C3147be.i().h();
            Mb.U().q().h();
            com.ironsource.mediationsdk.c.b().b(n(), o());
            for (IronSource.a aVar : IronSource.a.values()) {
                if (this.f37680x.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            Ec ecQ = q();
            if (ecQ != null) {
                ecQ.a(this.f37667l);
            }
            return true;
        } catch (Exception e11) {
            C3422r4.d().a(e11);
            IronLog.INTERNAL.error(e11.toString());
            Ec ecQ2 = q();
            if (ecQ2 != null) {
                ecQ2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private void b0() throws JSONException {
        this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listA = a(this.f37667l.j().d());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, this.Y);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(D5.TROUBLESHOOTING_RV_INIT_FAILED, jSONObjectA);
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        s sVar = new s(listA, this.f37667l.c().f(), n(), IronSourceUtils.f(), C3360na.b().a(), this.A);
        this.N = sVar;
        Boolean bool = this.f37679w;
        if (bool != null) {
            sVar.a(this.f37678v, bool.booleanValue());
        }
    }

    private synchronized void c(boolean z10) {
        this.f37675s = z10;
    }

    private void c0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f37667l.j().a());
        if (listA.size() > 0) {
            this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.O = new y(listA, new k(n(), IronSourceUtils.f(), this.f37667l.c().c()), C3360na.b().a(), this.A);
            u();
        } else {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
        }
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.f37663j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C3467tf.a().a(new O6(context));
        Mb.U().q().a(context, this.A);
        H9.i().a(context, this.A);
        C3147be.i().a(context, this.A);
        C3272id.O.a(context, this.A);
    }

    private void d0() throws JSONException {
        if (this.D) {
            Y();
            return;
        }
        Zd zdF = this.f37667l.c().f();
        this.V = zdF.k().h();
        this.Y = a(zdF);
        if (this.T || this.V) {
            e0();
        } else {
            b0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.app.Activity r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.ld r8 = r6.n(r8)     // Catch: java.lang.Exception -> L29
            if (r8 != 0) goto Lf
            com.ironsource.ld r8 = r6.j()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L2b
        Lf:
            if (r8 != 0) goto L3b
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f37659h     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Ld
            r3.log(r4, r2, r0)     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Ld
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> Ld
            com.ironsource.Ed r2 = com.ironsource.Ed.a()     // Catch: java.lang.Exception -> Ld
            r2.a(r3, r1)     // Catch: java.lang.Exception -> Ld
            return
        L29:
            r2 = move-exception
            r8 = r1
        L2b:
            com.ironsource.r4 r3 = com.ironsource.C3422r4.d()
            r3.a(r2)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f37659h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L3b:
            if (r7 == 0) goto L41
            r6.e(r7)
            goto L62
        L41:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            if (r2 != 0) goto L62
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f37659h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "Activity must be provided in showRewardedVideo when initializing SDK with context"
            r7.log(r8, r2, r0)
            com.ironsource.Ed r7 = com.ironsource.Ed.a()
            java.lang.String r8 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r8)
            r7.a(r8, r1)
            return
        L62:
            com.ironsource.Wd r2 = r6.Q
            if (r2 == 0) goto L72
            boolean r3 = r6.T
            if (r3 != 0) goto L6e
            boolean r3 = r6.V
            if (r3 == 0) goto L72
        L6e:
            r2.a(r7, r8)
            goto L91
        L72:
            com.ironsource.R7 r2 = r6.N
            if (r2 == 0) goto L7a
            r2.a(r7, r8)
            goto L91
        L7a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f37659h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            r7.log(r8, r2, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r7 = new com.ironsource.mediationsdk.logger.IronSourceError
            r8 = 1023(0x3ff, float:1.434E-42)
            r7.<init>(r8, r2)
            com.ironsource.Ed r8 = com.ironsource.Ed.a()
            r8.a(r7, r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.e(android.app.Activity, java.lang.String):void");
    }

    private void e0() throws JSONException {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f37667l.j().d());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, this.Y);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(D5.TROUBLESHOOTING_RV_INIT_FAILED, jSONObjectA);
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Wd wd2 = new Wd(listA, this.f37667l.c().f(), IronSourceUtils.f(), this.T, C3360na.b(), this.A);
        this.Q = wd2;
        Boolean bool = this.f37679w;
        if (bool != null) {
            wd2.a(this.f37678v, bool.booleanValue());
        }
        if (this.U && this.T) {
            this.U = false;
            this.Q.A();
        }
    }

    private K9 i() {
        F9 f9D = this.f37667l.c().d();
        if (f9D != null) {
            return f9D.a();
        }
        return null;
    }

    private C3325ld j() {
        Zd zdF = this.f37667l.c().f();
        if (zdF != null) {
            return zdF.a();
        }
        return null;
    }

    private C3262i3 k(String str) {
        V2 v2C = this.f37667l.c().c();
        if (v2C == null) {
            return new C3373o5();
        }
        if (TextUtils.isEmpty(str)) {
            return v2C.i();
        }
        C3262i3 c3262i3A = v2C.a(str);
        return c3262i3A != null ? c3262i3A : v2C.i();
    }

    public static r m() {
        return c.f37685a;
    }

    private C3325ld n(String str) {
        Zd zdF = this.f37667l.c().f();
        if (zdF != null) {
            return zdF.a(str);
        }
        return null;
    }

    private synchronized Ec q() {
        return this.S;
    }

    private void u() {
        if (this.J.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.J = Boolean.FALSE;
            a(this.K, this.L);
            this.K = null;
            this.L = null;
        }
    }

    private void v() {
        this.f37659h = IronSourceLoggerManager.getLogger(0);
        this.f37661i = new C3565zb();
    }

    private boolean w() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: ".concat(IronSourceAdQuality.class.getName()));
            return true;
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean x() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.c() == null || this.f37667l.c().b() == null || this.f37667l.c().b().b() == null) ? false : true;
    }

    private boolean y() {
        Me me2 = this.f37667l;
        return (me2 == null || me2.c() == null || this.f37667l.c().c() == null) ? false : true;
    }

    private boolean z() {
        return y() && A();
    }

    public boolean B() {
        return this.D || this.E || this.F;
    }

    public boolean F() {
        boolean z10;
        try {
            if (this.E) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            A9 a92 = this.P;
            boolean z11 = a92 != null && a92.u();
            try {
                H9.i().a(new C5(z11 ? D5.IS_CHECK_READY_TRUE : D5.IS_CHECK_READY_FALSE, IronSourceUtils.a(false, true, 1)));
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z11, 1);
                return z11;
            } catch (Throwable th2) {
                z10 = z11;
                th = th2;
                C3422r4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z10, 1);
                this.f37659h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public boolean K() {
        boolean z10;
        boolean z11;
        try {
            if (this.D) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.T || this.V) {
                Wd wd2 = this.Q;
                z11 = wd2 != null && wd2.u();
            } else {
                R7 r72 = this.N;
                if (r72 != null && r72.d()) {
                }
            }
            try {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                a(jSONObjectB, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.Y)}});
                C3147be.i().a(new C5(z11 ? D5.RV_API_HAS_AVAILABILITY_TRUE : D5.RV_API_HAS_AVAILABILITY_FALSE, jSONObjectB));
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z11, 1);
                return z11;
            } catch (Throwable th2) {
                z10 = z11;
                th = th2;
                C3422r4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z10, 1);
                this.f37659h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public boolean O() {
        return C();
    }

    public void P() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.E) {
                this.f37659h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!this.H) {
                this.f37659h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f37659h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (!u.c().d()) {
                    this.W = true;
                    return;
                } else {
                    this.f37659h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
            }
            if (!E()) {
                this.f37659h.log(ironSourceTag, "No interstitial configurations found", 3);
                n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            A9 a92 = this.P;
            if (a92 == null) {
                this.W = true;
            } else {
                a92.A();
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th2);
            n.a().b(IronSource.a.f37252c, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void Q() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.D) {
                this.f37659h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!this.T && !this.f37662i0) {
                this.f37659h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!this.G) {
                this.f37659h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f37659h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (!u.c().d()) {
                    this.U = true;
                    return;
                } else {
                    this.f37659h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
            }
            if (!M()) {
                this.f37659h.log(ironSourceTag, "No rewarded video configurations found", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            Wd wd2 = this.Q;
            if (wd2 == null) {
                this.U = true;
            } else {
                wd2.A();
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th2);
            n.a().b(IronSource.a.REWARDED_VIDEO, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void R() {
        this.f37662i0 = false;
    }

    public void S() throws JSONException {
        if (f37644m0) {
            return;
        }
        f37644m0 = true;
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put("status", "false");
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Mb.U().q().a(new C5(D5.FIRST_INSTANCE_RESULT, jSONObjectB));
    }

    public void a(long j10, Me.a aVar) throws JSONException {
        JSONObject jSONObjectB = IronSourceUtils.b(B());
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j10);
            jSONObjectB.put("sessionDepth", this.C);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Mb.U().q().a(new C5(D5.INIT_COMPLETE, jSONObjectB));
    }

    public C3127ac f() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f37667l.j().c());
        if (listA.size() > 0) {
            return new C3127ac(listA, this.f37667l.c().e(), IronSourceUtils.f(), C3360na.b(), this.A);
        }
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(D5.TROUBLESHOOTING_NT_INIT_FAILED, jSONObjectA);
        return null;
    }

    @Override // com.ironsource.U9
    public void g(String str) {
        try {
            String str2 = this.f37645a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (!a(str, 1, 64) || !p(str)) {
                this.f37659h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f37673q = str;
                this.f37658g0.f(str);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, o2.r(new StringBuilder(), this.f37645a, ":setMediationType(mediationType:", str, ")"), e10);
        }
    }

    @Override // com.ironsource.Mc
    public void h(String str) {
        try {
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.i("Mediation init failed");
            if (this.f37661i != null) {
                Iterator<IronSource.a> it = this.f37680x.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            Ec ecQ = q();
            if (ecQ != null) {
                ecQ.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String l() {
        return this.f37671o;
    }

    public void o(String str) {
        com.google.android.gms.internal.play_billing.a.u("userId = ", str, IronLog.API);
        this.f37670n = str;
        Mb.U().q().a(new C5(D5.SET_USER_ID, IronSourceUtils.a(false)));
        AdQualityBridge adQualityBridge = this.f37664j0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String p() {
        return this.f37673q;
    }

    public Map<String, String> r() {
        return this.f37672p;
    }

    public C3161ca s() {
        return this.A;
    }

    public String t() {
        return this.f37677u;
    }

    private r() {
        this(Mb.U().i(), Mb.O().b(), Mb.U().w(), Mb.U().k(), Mb.O().C());
    }

    private K9 l(String str) {
        F9 f9D = this.f37667l.c().d();
        if (f9D != null) {
            return f9D.a(str);
        }
        return null;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private U3 q(String str) {
        U3 u32 = new U3();
        if (str == null) {
            u32.a(new IronSourceError(506, "Init Fail - appKey is missing"));
            return u32;
        }
        if (!a(str, 5, 10)) {
            u32.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
            return u32;
        }
        if (!p(str)) {
            u32.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return u32;
    }

    @Override // com.ironsource.U9
    public void c() {
        this.f37672p = null;
    }

    public C3163cc m(String str) {
        Rb rbE = this.f37667l.c().e();
        if (rbE == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return rbE.e();
        }
        C3163cc c3163ccA = rbE.a(str);
        return c3163ccA != null ? c3163ccA : rbE.e();
    }

    public void c(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.E) {
                this.f37659h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C3249h8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else {
                if (!D()) {
                    C3249h8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
                    return;
                }
                K9 k9I = i();
                if (k9I != null) {
                    c(activity, k9I.c());
                } else {
                    C3249h8.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e10);
            C3249h8.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.U9
    public C3325ld i(String str) {
        C3325ld c3325ldN;
        try {
            c3325ldN = n(str);
            if (c3325ldN == null) {
                try {
                    this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    c3325ldN = j();
                } catch (Exception e10) {
                    e = e10;
                    C3422r4.d().a(e);
                    return c3325ldN;
                }
            }
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + c3325ldN, 1);
            return c3325ldN;
        } catch (Exception e11) {
            e = e11;
            c3325ldN = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // com.ironsource.T4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean j(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.k r0 = r1.f37652d0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r2 = r0.a(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.j(java.lang.String):boolean");
    }

    public String n() {
        return this.f37669m;
    }

    public void d(Activity activity) {
        if (!L()) {
            Ed.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        C3325ld c3325ldJ = j();
        if (c3325ldJ == null) {
            this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            Ed.a().a(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        f(activity, c3325ldJ.c());
    }

    public r(B7 b72, B7.a aVar, P7 p72, InterfaceC3357n7 interfaceC3357n7, M8.a aVar2) {
        this.f37645a = getClass().getName();
        this.f37647b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.0.0";
        this.f37665k = new Object();
        this.f37667l = null;
        this.f37669m = null;
        this.f37670n = "";
        this.f37671o = null;
        this.f37672p = null;
        this.f37673q = null;
        this.f37675s = false;
        this.f37679w = null;
        this.f37682z = true;
        this.B = "sessionDepth";
        this.M = null;
        this.f37662i0 = false;
        this.f37649c = b72;
        this.f37651d = aVar;
        this.f37653e = p72;
        this.f37655f = interfaceC3357n7;
        this.f37657g = aVar2;
        v();
        this.f37663j = new AtomicBoolean();
        this.f37680x = new HashSet();
        this.f37681y = new HashSet();
        this.E = false;
        this.D = false;
        this.F = false;
        this.f37674r = new AtomicBoolean(true);
        this.C = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f37677u = IronSourceUtils.d();
        this.J = Boolean.FALSE;
        this.W = false;
        this.L = null;
        this.N = null;
        this.S = null;
        this.O = null;
        this.T = false;
        this.Z = new ConcurrentHashMap<>();
        this.f37648b0 = new ConcurrentHashMap<>();
        this.f37646a0 = new ConcurrentHashMap<>();
        this.f37650c0 = null;
        this.f37652d0 = null;
        this.f37654e0 = null;
        this.Y = 1;
        this.f37656f0 = new S5();
        V9 v92 = new V9();
        this.f37658g0 = v92;
        this.f37660h0 = new V6(v92);
        this.f37664j0 = null;
        this.f37666k0 = new InterfaceC3141b8.a();
        this.f37668l0 = new InterfaceC3141b8.b();
    }

    private U4 k() {
        return new U4.b(Mb.U().q(), new U4.a("IronSource"));
    }

    public synchronized IronSourceError a(Context context, String str, boolean z10, Ec ec2, IronSource.a... aVarArr) {
        Throwable th2;
        boolean z11;
        r rVar;
        boolean z12;
        try {
            try {
                IronLog.INTERNAL.verbose("GitHash: 9f697d2");
                try {
                    if (!C3125aa.a((Object) context, "Init Failed - provided context is null")) {
                        h("Provided context is null");
                        return new IronSourceError(2000, "Provided context is null");
                    }
                    this.f37657g.a(context);
                    boolean z13 = context instanceof Activity;
                    if (z13) {
                        e((Activity) context);
                    }
                    AtomicBoolean atomicBoolean = this.f37674r;
                    if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                        Ce.f33927a.a(ec2 == null);
                        if ((aVarArr == null || aVarArr.length == 0) && ec2 == null) {
                            for (IronSource.a aVar : IronSource.a.values()) {
                                this.f37680x.add(aVar);
                            }
                            this.G = true;
                            this.H = true;
                            this.I = true;
                        } else {
                            for (IronSource.a aVar2 : aVarArr) {
                                this.f37680x.add(aVar2);
                                this.f37681y.add(aVar2);
                                if (aVar2.equals(IronSource.a.f37252c)) {
                                    this.H = true;
                                }
                                if (aVar2.equals(IronSource.a.BANNER)) {
                                    this.I = true;
                                }
                                if (aVar2.equals(IronSource.a.REWARDED_VIDEO)) {
                                    this.G = true;
                                }
                            }
                        }
                        IronLog.API.info("init(appKey:" + str + ")");
                        U3 u3Q = q(str);
                        if (u3Q.b()) {
                            this.f37669m = str;
                        }
                        Me meA = a(context, this.f37669m);
                        if (meA != null) {
                            IronLog.INTERNAL.verbose("init cache exists");
                            a(meA.c().b().f());
                        } else {
                            IronLog.INTERNAL.verbose("init cache does not exist");
                        }
                        ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
                        this.f37651d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(C3120a5.f35930a.d()));
                        this.f37658g0.g(LevelPlay.getSdkVersion());
                        this.f37658g0.a(T7.a());
                        this.f37658g0.b(IronSourceUtils.f(context));
                        this.f37658g0.a(C3276j0.a());
                        T();
                        d(context);
                        if (this.f37669m == null) {
                            u.c().f();
                            if (this.f37680x.contains(IronSource.a.REWARDED_VIDEO)) {
                                Ed.a().a(false, (AdInfo) null);
                            }
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, u3Q.a().toString(), 1);
                            return new IronSourceError(2010, "App key is null");
                        }
                        this.f37658g0.a(context);
                        this.f37658g0.c(this.f37669m);
                        this.f37658g0.h(this.f37677u);
                        if (this.f37682z) {
                            JSONObject jSONObjectB = IronSourceUtils.b(z10);
                            if (aVarArr != null) {
                                for (IronSource.a aVar3 : aVarArr) {
                                    try {
                                        jSONObjectB.put(aVar3.toString(), true);
                                    } catch (Exception e10) {
                                        C3422r4.d().a(e10);
                                    }
                                }
                            }
                            int i10 = this.C + 1;
                            this.C = i10;
                            if (ec2 != null) {
                                z11 = true;
                                z12 = z10;
                                rVar = this;
                            } else {
                                z11 = false;
                                rVar = this;
                                z12 = z10;
                            }
                            try {
                                rVar.a(z13, z12, i10, jSONObjectB, z11);
                                rVar.f37682z = false;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                throw th2;
                            }
                        }
                        return null;
                    }
                    if (aVarArr != null) {
                        a(z13, z10, ec2 != null, aVarArr);
                    } else {
                        this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
                    }
                    Be beB = Ce.f33927a.b();
                    if (C()) {
                        a(this.f37667l);
                        return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
                    }
                    if (beB == Be.INIT_FAILED) {
                        return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
                    }
                    if (beB != Be.NOT_INIT) {
                        if (ec2 != null) {
                            a(ec2);
                        }
                        return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
                    }
                    return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public Me h() {
        return this.f37667l;
    }

    public void f(Activity activity, String str) {
        String strL = a.b.l("showRewardedVideo(", str, ")");
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, strL, 1);
        try {
            if (this.D) {
                this.f37659h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                Ed.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (!L()) {
                Ed.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else {
                e(activity, str);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, strL, e10);
            Ed.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    public String o() {
        return this.f37670n;
    }

    private void d(Activity activity, String str) {
        try {
            K9 k9L = l(str);
            if (k9L == null) {
                k9L = i();
            }
            if (k9L == null) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                C3249h8.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                C3249h8.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.P.a(activity, new C3325ld(k9L));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e10);
        }
    }

    public Boolean g() {
        return this.M;
    }

    public void c(Activity activity, String str) {
        String strL = a.b.l("showInterstitial(", str, ")");
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, strL, 1);
        try {
            if (this.E) {
                this.f37659h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C3249h8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!D()) {
                C3249h8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            } else {
                d(activity, str);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, strL, e10);
            C3249h8.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.T4.a
    public void e(String str) {
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.f37654e0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th2);
        }
    }

    public String e() {
        u uVarC = u.c();
        int i10 = a.f37684b[uVarC.a().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? i10 != 3 ? (i10 == 4 && !I()) ? "No Native Ad configurations found" : "" : uVarC.d() ? "init() had failed" : "init() not finished yet" : "init() had failed";
        }
        return "init() must be called first";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // com.ironsource.T4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean d(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.f r0 = r1.f37650c0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r2 = r0.b(r2)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Ld:
            r2 = move-exception
            goto L12
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.d(java.lang.String):boolean");
    }

    @Override // com.ironsource.U9
    public void d() {
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        C3249h8.a().a((InterfaceC3252hb) null);
    }

    private void b(IronSource.a aVar) throws JSONException {
        int i10 = a.f37683a[aVar.ordinal()];
        if (i10 == 1) {
            d0();
        } else if (i10 == 2) {
            Z();
        } else {
            if (i10 != 3) {
                return;
            }
            U();
        }
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private boolean d(Me me2) {
        com.ironsource.mediationsdk.adquality.a aVarA = me2.c().a();
        return this.f37664j0 == null && aVarA != null && aVarA.b() && AdQualityBridge.adQualityAvailable();
    }

    @Override // com.ironsource.U9
    public K9 f(String str) {
        K9 k9L;
        try {
            k9L = l(str);
            if (k9L == null) {
                try {
                    this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    k9L = i();
                } catch (Exception e10) {
                    e = e10;
                    C3422r4.d().a(e);
                    return k9L;
                }
            }
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + k9L, 1);
            return k9L;
        } catch (Exception e11) {
            e = e11;
            k9L = null;
        }
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        Zd zdF = this.f37667l.c().f();
        U4.a aVar = new U4.a("Mediation");
        if (zdF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, zdF, com.ironsource.mediationsdk.c.b(), this.f37668l0, n(), o(), new U4.b(C3147be.i(), aVar));
    }

    @Override // com.ironsource.T4.b
    public void c(String str) {
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.f37666k0.a(str);
        try {
            if (!this.E) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.f37650c0;
            if (fVar == null) {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ironLog.info("onResume() is disabled");
            } else {
                ContextProvider.getInstance().onResume(activity);
            }
        } catch (Throwable th2) {
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th2);
            C3422r4.d().a(th2);
        }
    }

    @Override // com.ironsource.U9
    public boolean b(String str) {
        try {
            U3 u32 = new U3();
            a(str, u32);
            if (u32.b()) {
                this.f37671o = str;
                Mb.U().q().a(new C5(D5.SET_USER_ID, IronSourceUtils.a(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, u32.a().toString(), 2);
            return false;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, o2.r(new StringBuilder(), this.f37645a, ":setDynamicUserId(dynamicUserId:", str, ")"), e10);
            return false;
        }
    }

    public void c(Context context) {
        Bf bf2 = Bf.f33908a;
        bf2.b();
        if (!C()) {
            bf2.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.f37667l)) {
            bf2.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.g(context)) {
            bf2.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        A9 a92 = this.P;
        if (a92 != null) {
            a92.J();
        }
        Wd wd2 = this.Q;
        if (wd2 != null) {
            wd2.J();
        }
        H2 h22 = this.R;
        if (h22 != null) {
            h22.J();
            this.R.T();
        }
        new Cf().a(context, n(), this.f37667l.i(), LevelPlay.getSdkVersion(), this.f37667l.c().g().b(), g(), this.T);
        this.f37662i0 = true;
        bf2.c();
    }

    @Override // com.ironsource.T4.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.REWARDED_VIDEO).b(), this.f37668l0.a(str));
    }

    @Override // com.ironsource.T4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.f37252c).a(true).a(str2).b(), this.f37666k0.a(str));
    }

    private void a(K1 k12) {
        C3120a5 c3120a5 = C3120a5.f35930a;
        c3120a5.c(k12.g());
        c3120a5.a(k12.f());
        c3120a5.a(k12.j());
        this.f37655f.a(k12);
    }

    private boolean c(Me me2) {
        return me2 != null && me2.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0009, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:29:0x0058, B:30:0x005c, B:32:0x0064, B:33:0x0067, B:35:0x006f, B:37:0x0073, B:38:0x0077, B:40:0x007f, B:41:0x0082, B:43:0x008a, B:45:0x008e, B:46:0x0092, B:48:0x009a, B:49:0x009d, B:51:0x00a2, B:53:0x00a6, B:54:0x00ac, B:11:0x0012, B:13:0x0016, B:15:0x0023, B:17:0x0027, B:19:0x0034, B:21:0x0038, B:22:0x003e, B:18:0x002d, B:14:0x001c), top: B:59:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.ironsource.mediationsdk.IronSource.a> a(android.content.Context r5, java.lang.String r6, boolean r7, com.ironsource.mediationsdk.IronSource.a... r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r6.<init>()     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r8 == 0) goto L10
            int r1 = r8.length     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L46
            goto L10
        Ld:
            r5 = move-exception
            goto Lb9
        L10:
            if (r7 == 0) goto L46
            boolean r7 = r4.G     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L1c
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            r4.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L23
        L1c:
            r4.D = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
        L23:
            boolean r7 = r4.H     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L2d
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.f37252c     // Catch: java.lang.Throwable -> Ld
            r4.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L34
        L2d:
            r4.E = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.f37252c     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
        L34:
            boolean r7 = r4.I     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L3e
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.BANNER     // Catch: java.lang.Throwable -> Ld
            r4.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto La0
        L3e:
            r4.F = r0     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r7 = com.ironsource.mediationsdk.IronSource.a.BANNER     // Catch: java.lang.Throwable -> Ld
            r6.add(r7)     // Catch: java.lang.Throwable -> Ld
            goto La0
        L46:
            int r7 = r8.length     // Catch: java.lang.Throwable -> Ld
            r1 = 0
        L48:
            if (r1 >= r7) goto La0
            r2 = r8[r1]     // Catch: java.lang.Throwable -> Ld
            com.ironsource.mediationsdk.IronSource$a r3 = com.ironsource.mediationsdk.IronSource.a.f37252c     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L67
            boolean r3 = r4.H     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L5c
            r4.a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L67
        L5c:
            r4.E = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L67
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L67:
            com.ironsource.mediationsdk.IronSource$a r3 = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L82
            boolean r3 = r4.G     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L77
            r4.a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L82
        L77:
            r4.D = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L82
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L82:
            com.ironsource.mediationsdk.IronSource$a r3 = com.ironsource.mediationsdk.IronSource.a.BANNER     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L9d
            boolean r3 = r4.I     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L92
            r4.a(r2)     // Catch: java.lang.Throwable -> Ld
            goto L9d
        L92:
            r4.F = r0     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r6.contains(r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L9d
            r6.add(r2)     // Catch: java.lang.Throwable -> Ld
        L9d:
            int r1 = r1 + 1
            goto L48
        La0:
            if (r5 == 0) goto Lb7
            boolean r7 = r5 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto Lac
            r7 = r5
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> Ld
            r4.e(r7)     // Catch: java.lang.Throwable -> Ld
        Lac:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            r7.updateAppContext(r5)     // Catch: java.lang.Throwable -> Ld
        Lb7:
            monitor-exit(r4)
            return r6
        Lb9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.IronSource$a[]):java.util.List");
    }

    public q b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f37659h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new q(activity, iSBannerSize);
    }

    public void b(q qVar) {
        a(qVar, "");
    }

    private boolean b(h.b bVar) {
        synchronized (this.f37646a0) {
            try {
                if (this.f37654e0 != null) {
                    return false;
                }
                this.f37646a0.put(bVar.e(), bVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Me b(Context context, String str, b bVar) {
        synchronized (this.f37665k) {
            try {
                Me me2 = this.f37667l;
                if (me2 != null) {
                    return new Me(me2);
                }
                Me meA = a(context, str, bVar);
                if (meA == null || !meA.p()) {
                    IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                    meA = a(context, n());
                    if (meA != null) {
                        IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(n(), str);
                        this.f37659h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + meA.toString(), 1);
                        Mb.U().q().a(new C5(D5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
                    }
                }
                if (meA != null) {
                    this.f37667l = meA;
                    IronSourceUtils.e(context, meA.toString());
                    b(this.f37667l, context);
                    H9.i().c(true);
                    C3147be.i().c(true);
                    C3272id.O.c(true);
                    Mb.U().q().c(true);
                }
                return meA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Me me2, Context context) {
        b(me2);
        a(me2, context);
    }

    private void a(IronSource.a aVar) {
        String str = aVar + " ad unit has already been initialized";
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.i(str);
    }

    private void b(Me me2) {
        this.f37659h.setLoggerDebugLevel("console", me2.c().b().h().a());
    }

    private synchronized void a(boolean z10, boolean z11, boolean z12, IronSource.a... aVarArr) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = 0;
                for (IronSource.a aVar : aVarArr) {
                    try {
                        if (aVar.equals(IronSource.a.f37252c)) {
                            this.H = true;
                        } else if (aVar.equals(IronSource.a.BANNER)) {
                            this.I = true;
                        } else if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                            this.G = true;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (u.c().a() == u.d.INIT_FAILED) {
                    try {
                        if (this.f37661i != null) {
                            int length = aVarArr.length;
                            while (i10 < length) {
                                IronSource.a aVar2 = aVarArr[i10];
                                if (!this.f37680x.contains(aVar2)) {
                                    a(aVar2, true);
                                }
                                i10++;
                            }
                        }
                    } catch (Exception e10) {
                        C3422r4.d().a(e10);
                        IronLog.INTERNAL.error(e10.toString());
                    }
                } else if (!C()) {
                    JSONObject jSONObjectB = IronSourceUtils.b(z11);
                    int length2 = aVarArr.length;
                    while (i10 < length2) {
                        IronSource.a aVar3 = aVarArr[i10];
                        if (!this.f37680x.contains(aVar3)) {
                            this.f37680x.add(aVar3);
                            this.f37681y.add(aVar3);
                            try {
                                jSONObjectB.put(aVar3.toString(), true);
                            } catch (Exception e11) {
                                C3422r4.d().a(e11);
                                IronLog.INTERNAL.error(e11.toString());
                            }
                        } else {
                            this.f37659h.log(IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                        }
                        i10++;
                    }
                    int i11 = this.C + 1;
                    this.C = i11;
                    a(z10, z11, i11, jSONObjectB, z12);
                } else {
                    if (this.f37676t == null) {
                        return;
                    }
                    try {
                        new Nb().a(this.f37667l.c().b().e().b(), B());
                    } catch (Exception e12) {
                        C3422r4.d().a(e12);
                        IronLog.INTERNAL.error(e12.toString());
                    }
                    JSONObject jSONObjectB2 = IronSourceUtils.b(z11);
                    for (IronSource.a aVar4 : aVarArr) {
                        if (!this.f37680x.contains(aVar4)) {
                            this.f37680x.add(aVar4);
                            this.f37681y.add(aVar4);
                            try {
                                jSONObjectB2.put(aVar4.toString(), true);
                            } catch (Exception e13) {
                                C3422r4.d().a(e13);
                                IronLog.INTERNAL.error(e13.toString());
                            }
                            List<IronSource.a> list = this.f37676t;
                            if (list != null && list.contains(aVar4)) {
                                b(aVar4);
                            } else {
                                a(aVar4, false);
                            }
                        } else {
                            a(aVar4);
                        }
                    }
                    int i12 = this.C + 1;
                    this.C = i12;
                    try {
                        a(z10, z11, i12, jSONObjectB2, z12);
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // com.ironsource.U9
    public void b() {
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        Ed.a().a((InterfaceC3446sb) null);
    }

    @Override // com.ironsource.U9
    public String b(Context context) {
        String strI = this.f37649c.I(context);
        Mb.U().q().a(new C5(D5.GET_ADVERTISING_ID, IronSourceUtils.b(false)));
        return !TextUtils.isEmpty(strI) ? strI : "";
    }

    private void b(D5 d52, JSONObject jSONObject) {
        C3147be.i().a(new C5(d52, jSONObject));
    }

    public void b(boolean z10) {
        this.M = Boolean.valueOf(z10);
        com.ironsource.mediationsdk.c.b().b(z10);
        this.f37658g0.a(z10);
        Mb.U().q().a(new C5(z10 ? D5.CONSENT_TRUE_CODE : D5.CONSENT_FALSE_CODE, IronSourceUtils.b(false)));
    }

    public void b(String str, JSONObject jSONObject) throws JSONException {
        com.ironsource.mediationsdk.c.b().b(new x(str, jSONObject));
    }

    @Override // com.ironsource.Z8
    public void b(InterfaceC3124a9 interfaceC3124a9) {
        if (C3125aa.a((Object) interfaceC3124a9, "removeImpressionDataListener - listener is null")) {
            C3360na.b().b(interfaceC3124a9);
            R7 r72 = this.N;
            if (r72 != null) {
                r72.b(interfaceC3124a9);
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.b(interfaceC3124a9);
            }
        }
    }

    private void a(boolean z10, boolean z11, int i10, JSONObject jSONObject, boolean z12) throws JSONException {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                sb2.append(",Activity=" + (ContextProvider.getInstance().getCurrentActiveActivity() != null));
            } else if (!z10) {
                sb2.append(",init_context_flow");
            }
            sb2.append(",cachedUserAgent=" + this.f37649c.n());
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
            jSONObject.put("sessionDepth", i10);
            if (z12) {
                if (z11) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Mb.U().q().a(new C5(D5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(Ec ec2) {
        this.S = ec2;
    }

    public boolean a(boolean z10, Me me2) {
        a(me2);
        if (C()) {
            return true;
        }
        synchronized (this.f37665k) {
            this.f37667l = me2;
        }
        return b(me2.g(), z10, me2.c());
    }

    @Override // com.ironsource.Mc
    public void a(List<IronSource.a> list, boolean z10, V3 v32) throws JSONException {
        a(this.f37667l);
        b(list, z10, v32);
    }

    private void a(Me me2) {
        if (w() && d(me2)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), n(), o(), new C3241h0(), me2.c().b().h().a());
            this.f37664j0 = adQualityBridge;
            C3161ca c3161ca = this.A;
            if (c3161ca != null) {
                adQualityBridge.setSegment(c3161ca);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        F9 f9D = this.f37667l.c().d();
        U4.a aVar = new U4.a("Mediation");
        if (f9D.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, f9D, com.ironsource.mediationsdk.c.b(), this.f37666k0, n(), o(), new U4.b(H9.i(), aVar));
    }

    private int a(Zd zd2) {
        return (this.V || this.T || !zd2.k().e()) ? 1 : 2;
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f37667l.k().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Mc
    public void a() {
        if (this.J.booleanValue()) {
            this.J = Boolean.FALSE;
            n.a().b(IronSource.a.BANNER, new IronSourceError(603, "init() had failed"));
            this.K = null;
            this.L = null;
        }
        if (this.W) {
            this.W = false;
            n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.U) {
            this.U = false;
            n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.Z) {
            try {
                Iterator<h.d> it = this.Z.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.f37666k0.a(strE).onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                }
                this.Z.clear();
            } finally {
            }
        }
        synchronized (this.f37648b0) {
            try {
                Iterator<h.d> it2 = this.f37648b0.values().iterator();
                while (it2.hasNext()) {
                    String strE2 = it2.next().e();
                    this.f37668l0.a(strE2).onRewardedVideoAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f37648b0.clear();
            } finally {
            }
        }
        synchronized (this.f37646a0) {
            try {
                for (h.b bVar : this.f37646a0.values()) {
                    ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                    if (iSDemandOnlyBannerLayoutG != null) {
                        iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                    }
                }
                this.f37646a0.clear();
            } finally {
            }
        }
    }

    private void a(IronSource.a aVar, boolean z10) {
        int i10 = a.f37683a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.D) {
                Iterator<h.d> it = this.f37648b0.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.f37668l0.a(strE).onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f37648b0.clear();
                return;
            }
            if (this.T) {
                if (this.U) {
                    this.U = false;
                    n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z10 || L() || this.f37681y.contains(aVar)) {
                Ed.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (this.E) {
                Iterator<h.d> it2 = this.Z.values().iterator();
                while (it2.hasNext()) {
                    String strE2 = it2.next().e();
                    this.f37666k0.a(strE2).onInterstitialAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
                }
                this.Z.clear();
                return;
            }
            if (this.W) {
                this.W = false;
                n.a().b(IronSource.a.f37252c, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        if (this.F) {
            for (h.b bVar : this.f37646a0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                }
            }
            this.f37646a0.clear();
            return;
        }
        if (this.J.booleanValue()) {
            this.J = Boolean.FALSE;
            n.a().b(IronSource.a.BANNER, new IronSourceError(602, "init() had failed"));
            this.K = null;
            this.L = null;
        }
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th2);
        }
    }

    public void a(C3161ca c3161ca) {
        this.A = c3161ca;
        Wd wd2 = this.Q;
        if (wd2 != null) {
            wd2.a(c3161ca);
        }
        R7 r72 = this.N;
        if (r72 != null) {
            r72.a(c3161ca);
        }
        A9 a92 = this.P;
        if (a92 != null) {
            a92.a(c3161ca);
        }
        y yVar = this.O;
        if (yVar != null) {
            yVar.a(c3161ca);
        }
        H2 h22 = this.R;
        if (h22 != null) {
            h22.a(c3161ca);
        }
        AdQualityBridge adQualityBridge = this.f37664j0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c3161ca);
        }
        H9.i().a(this.A);
        C3147be.i().a(this.A);
        C3272id.O.a(this.A);
        Mb.U().q().a(this.A);
    }

    @Override // com.ironsource.U9
    public void a(boolean z10) {
        com.ironsource.mediationsdk.c.b().a(z10);
    }

    @Override // com.ironsource.U9
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, this.f37645a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.f37672p = new HashMap(map);
                C5 c52 = new C5(D5.SET_RV_SERVER_PARAMS, IronSourceUtils.b(false));
                c52.a(IronSourceConstants.EVENTS_EXT1, map.toString());
                C3147be.i().a(c52);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                this.f37659h.logException(IronSourceLogger.IronSourceTag.API, this.f37645a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e10);
            }
        }
    }

    @Override // com.ironsource.T4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.a.REWARDED_VIDEO).b(), this.f37668l0.a(str));
    }

    public void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
        }
        if (!this.G) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.D) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        u.d dVarA = u.c().a();
        if (dVarA == u.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError ironSourceErrorA = dVar.a();
        if (ironSourceErrorA != null) {
            if (ironSourceErrorA.getErrorCode() == 1060) {
                b(D5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(ironSourceErrorA.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ironSourceErrorA);
            return;
        }
        e(dVar.d());
        if (dVarA == u.d.INIT_IN_PROGRESS) {
            if (u.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f37648b0) {
                this.f37648b0.put(strE, dVar);
            }
            if (TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(D5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!M()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.f37648b0) {
            try {
                com.ironsource.mediationsdk.demandOnly.k kVar = this.f37652d0;
                if (kVar == null) {
                    this.f37648b0.put(strE, dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        b(D5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                kVar.a(dVar);
                return;
            } finally {
            }
        }
        C3422r4.d().a(th2);
        IronLog.API.error(th2.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
    }

    @Override // com.ironsource.T4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.f37668l0.a(str);
        try {
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e10.getMessage()));
            }
        }
        if (!this.D) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f37652d0;
        if (kVar == null) {
            ironLog.error("Rewarded video was not initiated");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was not initiated"));
        } else {
            kVar.b(str);
        }
    }

    @Override // com.ironsource.T4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f37668l0.a((InterfaceC3141b8<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.T4.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.f37252c).b(), this.f37666k0.a(str));
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
        }
        if (!this.H) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.E) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        u.d dVarA = u.c().a();
        if (dVarA == u.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        IronSourceError ironSourceErrorA = dVar.a();
        if (ironSourceErrorA != null) {
            if (ironSourceErrorA.getErrorCode() == 1060) {
                b(D5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(ironSourceErrorA.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ironSourceErrorA);
            return;
        }
        e(dVar.d());
        if (dVarA == u.d.INIT_IN_PROGRESS) {
            if (u.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.Z) {
                    this.Z.put(dVar.e(), dVar);
                }
                if (!TextUtils.isEmpty(dVar.e())) {
                    a(D5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
            }
            return;
        }
        if (!E()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.Z) {
            try {
                com.ironsource.mediationsdk.demandOnly.f fVar = this.f37650c0;
                if (fVar == null) {
                    this.Z.put(dVar.e(), dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        a(D5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                fVar.a(dVar);
                return;
            } finally {
            }
        }
    }

    @Override // com.ironsource.T4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f37666k0.a((InterfaceC3141b8<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.T4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f37659h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f37659h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public void a(q qVar, String str) {
        com.google.android.gms.internal.play_billing.a.u("placementName = ", str, IronLog.INTERNAL);
        if (this.F) {
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.a.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (qVar != null && !qVar.b()) {
            if (!this.I) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
                n.a().b(IronSource.a.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
                return;
            }
            if (qVar.getSize().getDescription().equals(l.f37559f) && (qVar.getSize().getWidth() <= 0 || qVar.getSize().getHeight() <= 0)) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
                n.a().b(IronSource.a.BANNER, ErrorBuilder.unsupportedBannerSize(""));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.a.BANNER, new IronSourceError(600, "Init() had failed"));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (u.c().d()) {
                    this.f37659h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    n.a().b(IronSource.a.BANNER, new IronSourceError(601, "Init() had failed"));
                    return;
                } else {
                    this.K = qVar;
                    this.J = Boolean.TRUE;
                    this.L = str;
                    return;
                }
            }
            if (!z()) {
                this.f37659h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                n.a().b(IronSource.a.BANNER, new IronSourceError(615, "the server response does not contain banner data"));
                return;
            }
            y yVar = this.O;
            if (yVar == null && this.R == null) {
                this.K = qVar;
                this.J = Boolean.TRUE;
                this.L = str;
                return;
            } else if (this.X) {
                this.R.a(qVar, new C3325ld(k(str)));
                return;
            } else {
                yVar.a(qVar, k(str));
                return;
            }
        }
        String strConcat = "loadBanner can't be called - ".concat(qVar == null ? "banner layout is null " : "banner layout is destroyed");
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, strConcat, 3);
        n.a().b(IronSource.a.BANNER, ErrorBuilder.buildLoadFailedError(strConcat));
    }

    public void a(q qVar) {
        H2 h22;
        this.f37659h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (this.X && (h22 = this.R) != null) {
                h22.a(qVar);
                return;
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.a(qVar);
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            this.f37659h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th2);
        }
    }

    @Override // com.ironsource.T4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b bVarA = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.a.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(u.c().a());
        if (ironSourceErrorA2 != null) {
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!z()) {
            this.f37659h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.f37654e0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(h.b bVar) {
        if (u.c().a() != u.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f37646a0) {
            this.f37646a0.put(bVar.e(), bVar);
        }
        return true;
    }

    private IronSourceError a(u.d dVar) {
        if (!this.I) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.F) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == u.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == u.d.INIT_IN_PROGRESS && u.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public Me a(Context context, String str) {
        if (!C3285j9.a(context)) {
            return null;
        }
        G3 g3C = C3285j9.c(context);
        String strD = g3C.d();
        String strF = g3C.f();
        String strE = g3C.e();
        if (!strD.equals(str)) {
            return null;
        }
        Me me2 = new Me(context, strD, strF, strE);
        me2.a(Me.a.CACHE);
        return me2;
    }

    private Me a(Context context, String str, b bVar) {
        Exception exc;
        Me me2 = null;
        if (!IronSourceUtils.g(context)) {
            return null;
        }
        try {
            String strB = b(context);
            if (TextUtils.isEmpty(strB)) {
                strB = this.f37649c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strB;
            C3161ca c3161ca = this.A;
            String strA = C3266i7.a(Oe.a(context, n(), str, str2, p(), this.T, c3161ca != null ? c3161ca.f() : null, B()), C3250h9.a().toString(), bVar);
            if (strA == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(strA);
                String strOptString = jSONObject.optString(Me.f34938n, null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strA = a(strOptString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strA)) {
                    ironLog.warning("encoded response invalid - return null");
                    S();
                    return null;
                }
            }
            Me me3 = new Me(context, n(), str, strA);
            try {
                me3.a(Me.a.SERVER);
                if (me3.p()) {
                    return me3;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e10) {
                exc = e10;
                me2 = me3;
                C3422r4.d().a(exc);
                IronLog.INTERNAL.warning("exception = " + exc);
                return me2;
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    private String a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return L9.d(C3390p5.b().c(), str);
        }
        return L9.b(C3390p5.b().c(), str);
    }

    private void a(Me me2, Context context) {
        boolean zL = x() ? me2.c().b().b().l() : false;
        boolean zL2 = L() ? me2.c().f().m().l() : false;
        boolean zL3 = D() ? me2.c().d().i().l() : false;
        boolean zL4 = y() ? me2.c().c().g().l() : false;
        boolean zL5 = H() ? me2.c().e().g().l() : false;
        C3289jd c3289jdI = me2.c().b().i();
        boolean zI = c3289jdI.i();
        if (zL) {
            a((AbstractC3472u3) Mb.U().q(), me2.c().b().b(), context, me2, true);
        }
        if (zL2) {
            a((AbstractC3472u3) C3147be.i(), me2.c().f().m(), context, me2, true);
        } else {
            C3147be.i().a(false);
        }
        if (zL3) {
            a((AbstractC3472u3) H9.i(), me2.c().d().i(), context, me2, true);
        } else if (zL4) {
            a((AbstractC3472u3) H9.i(), me2.c().c().g(), context, me2, true);
        } else if (zL5) {
            a((AbstractC3472u3) H9.i(), me2.c().e().g(), context, me2, true);
        } else {
            H9.i().a(false);
        }
        C3272id c3272id = C3272id.O;
        c3272id.a(zI);
        if (zI) {
            c3272id.b(c3289jdI.j(), context);
            c3272id.b(c3289jdI.l(), context);
            c3272id.c(c3289jdI.k(), context);
            c3272id.b(c3289jdI.g());
            c3272id.c(c3289jdI.h());
        }
    }

    private void a(AbstractC3472u3 abstractC3472u3, H1 h12, Context context, Me me2, boolean z10) {
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
        abstractC3472u3.a(me2.c().b().j());
        abstractC3472u3.b(h12.k());
        abstractC3472u3.c(h12.b());
    }

    private void a(String str, U3 u32) {
        if (a(str, 1, 128)) {
            return;
        }
        u32.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    @Override // com.ironsource.U9
    public void a(Context context, boolean z10) {
        this.f37678v = context;
        this.f37679w = Boolean.valueOf(z10);
        A9 a92 = this.P;
        if (a92 != null) {
            a92.a(context, z10);
        }
        if (this.V) {
            Wd wd2 = this.Q;
            if (wd2 != null) {
                wd2.a(context, z10);
            }
        } else {
            R7 r72 = this.N;
            if (r72 != null) {
                r72.a(context, z10);
            }
        }
        Mb.U().q().a(new C5(D5.SHOULD_TRACK_NETWORK_STATE, IronSourceUtils.b(false)));
    }

    public boolean a(C3262i3 c3262i3) {
        return this.f37653e.c(ContextProvider.getInstance().getApplicationContext(), c3262i3, IronSource.a.BANNER);
    }

    public C3398pd.b a(C3325ld c3325ld) {
        return this.f37653e.a(ContextProvider.getInstance().getApplicationContext(), c3325ld, IronSource.a.REWARDED_VIDEO);
    }

    private void a(D5 d52, JSONObject jSONObject) {
        H9.i().a(new C5(d52, jSONObject));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) throws JSONException {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
            }
        }
    }

    public void a(String str, List<String> list) throws JSONException {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (C() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                C3360na.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapD = com.ironsource.mediationsdk.c.b().d();
            concurrentHashMapD.putAll(C3360na.b().c());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapD.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.f37660h0.a(jSONObject);
            this.f37658g0.a(jSONObject);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("got the following error " + e10.getMessage());
        }
        Mb.U().q().a(new C5(C() ? D5.SET_META_DATA_AFTER_INIT : D5.SET_META_DATA, IronSourceUtils.a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.T4
    public String a(Context context) {
        String str;
        Be beA;
        String str2;
        String strC;
        C3149bg c3149bgK;
        U4 u4K = k();
        Be be2 = null;
        try {
            beA = Ce.f33927a.a();
        } catch (Exception unused) {
            str = null;
        }
        try {
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, beA);
        } catch (Exception unused2) {
            str = null;
            be2 = beA;
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, be2);
            beA = be2;
            str2 = str;
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, beA);
            return str2;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (Be) null);
            return null;
        }
        if (beA == Be.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (Be) null);
            return null;
        }
        u.c().g();
        Me me2 = this.f37667l;
        boolean zE = (me2 == null || (c3149bgK = me2.c().b().k()) == null) ? true : c3149bgK.e();
        this.f37658g0.b(context);
        JSONObject jSONObjectA = new C3131ag().a(context);
        d.b().a(jSONObjectA, true);
        if (zE) {
            strC = L9.a(jSONObjectA.toString());
        } else {
            strC = L9.c(jSONObjectA.toString());
        }
        str2 = strC;
        if (TextUtils.isEmpty(str2)) {
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, beA);
        }
        u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, beA);
        return str2;
    }

    @Override // com.ironsource.Z8
    public void a(InterfaceC3124a9 interfaceC3124a9) {
        if (C3125aa.a((Object) interfaceC3124a9, "addImpressionDataListener - listener is null")) {
            C3360na.b().a(interfaceC3124a9);
            R7 r72 = this.N;
            if (r72 != null) {
                r72.a(interfaceC3124a9);
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.a(interfaceC3124a9);
            }
            IronLog.API.info("add impression data listener to ".concat(interfaceC3124a9.getClass().getSimpleName()));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (C3125aa.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && C3125aa.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f37656f0.a(str, jSONObject);
        }
    }
}
