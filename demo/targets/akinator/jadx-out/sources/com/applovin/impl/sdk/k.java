package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a6;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.c7;
import com.applovin.impl.d1;
import com.applovin.impl.e1;
import com.applovin.impl.e8;
import com.applovin.impl.g4;
import com.applovin.impl.g5;
import com.applovin.impl.h3;
import com.applovin.impl.i1;
import com.applovin.impl.i3;
import com.applovin.impl.i7;
import com.applovin.impl.i8;
import com.applovin.impl.j2;
import com.applovin.impl.j7;
import com.applovin.impl.k7;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.impl.p6;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q0;
import com.applovin.impl.q1;
import com.applovin.impl.q2;
import com.applovin.impl.r0;
import com.applovin.impl.r3;
import com.applovin.impl.r5;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t0;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.v3;
import com.applovin.impl.v4;
import com.applovin.impl.w2;
import com.applovin.impl.w4;
import com.applovin.impl.w6;
import com.applovin.impl.x4;
import com.applovin.impl.y4;
import com.applovin.impl.z3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class k {
    public static k D0;
    protected static Context E0;
    private static boolean F0;
    private static final boolean H0;
    private static volatile com.applovin.impl.c I0;
    private AppLovinSdk.SdkInitializationListener A0;

    /* renamed from: a, reason: collision with root package name */
    private String f15447a;

    /* renamed from: b, reason: collision with root package name */
    private String f15449b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f15451c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15453d;

    /* renamed from: e, reason: collision with root package name */
    private long f15455e;

    /* renamed from: f, reason: collision with root package name */
    private long f15457f;

    /* renamed from: g, reason: collision with root package name */
    private Long f15459g;

    /* renamed from: h, reason: collision with root package name */
    private long f15461h;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f15465j;

    /* renamed from: j0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f15466j0;

    /* renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f15467k;

    /* renamed from: l, reason: collision with root package name */
    private String f15469l;

    /* renamed from: l0, reason: collision with root package name */
    private List f15470l0;

    /* renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f15479q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f15480q0;

    /* renamed from: v0, reason: collision with root package name */
    private String f15490v0;

    /* renamed from: w0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f15492w0;

    /* renamed from: z0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f15498z0;
    private static final Object J0 = new Object();
    private static final long G0 = System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f15463i = new AtomicBoolean();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f15471m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f15473n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f15475o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final AtomicReference f15477p = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final o f15481r = new o(this);

    /* renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f15483s = new com.applovin.impl.f(this);

    /* renamed from: t, reason: collision with root package name */
    private final w2 f15485t = new w2(this);

    /* renamed from: u, reason: collision with root package name */
    private final q1 f15487u = new q1(this);

    /* renamed from: v, reason: collision with root package name */
    private final i7 f15489v = new i7(this);

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f15491w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f15493x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicReference f15495y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    private final AtomicReference f15497z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* renamed from: a0, reason: collision with root package name */
    private final AtomicReference f15448a0 = new AtomicReference();

    /* renamed from: b0, reason: collision with root package name */
    private final AtomicReference f15450b0 = new AtomicReference();

    /* renamed from: c0, reason: collision with root package name */
    private final AtomicReference f15452c0 = new AtomicReference();

    /* renamed from: d0, reason: collision with root package name */
    private final AtomicReference f15454d0 = new AtomicReference();

    /* renamed from: e0, reason: collision with root package name */
    private final AtomicReference f15456e0 = new AtomicReference();

    /* renamed from: f0, reason: collision with root package name */
    private final AtomicReference f15458f0 = new AtomicReference();

    /* renamed from: g0, reason: collision with root package name */
    private final AtomicReference f15460g0 = new AtomicReference();

    /* renamed from: h0, reason: collision with root package name */
    private final AtomicReference f15462h0 = new AtomicReference();

    /* renamed from: i0, reason: collision with root package name */
    private final AtomicReference f15464i0 = new AtomicReference();

    /* renamed from: k0, reason: collision with root package name */
    private final AtomicReference f15468k0 = new AtomicReference();

    /* renamed from: m0, reason: collision with root package name */
    private final Object f15472m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f15474n0 = new AtomicBoolean(true);

    /* renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f15476o0 = new AtomicBoolean();

    /* renamed from: p0, reason: collision with root package name */
    private final AtomicBoolean f15478p0 = new AtomicBoolean();

    /* renamed from: r0, reason: collision with root package name */
    private boolean f15482r0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f15484s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f15486t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private int f15488u0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    private final Object f15494x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    private SdkConfigurationImpl f15496y0 = new SdkConfigurationImpl(this);
    private final g5 B0 = new p6(this, true, "scheduleAdLoadIntegrationError", new x(2, this));
    private final g5 C0 = new p6(this, true, "sdkInit", new x(3, this));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements r5.b {
        public a() {
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            k.this.c(jSONObject);
            if (((Boolean) k.this.a(o3.V7)).booleanValue()) {
                k kVar = k.this;
                kVar.f15466j0 = new com.applovin.impl.mediation.e(kVar);
            }
            k.this.m().a();
            r0.a(jSONObject, zIsValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.E().b();
            k kVar2 = k.this;
            kVar2.f15470l0 = kVar2.a(jSONObject);
            if (zIsValid) {
                k.this.f15496y0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.t0().a(jSONObject);
            k.this.b(jSONObject);
            q2.b(((Boolean) k.this.a(v4.f15966k6)).booleanValue());
            q2.a(((Boolean) k.this.a(v4.f15974l6)).booleanValue());
            k.this.R0();
            if (!((Boolean) k.this.a(v4.f15889b3)).booleanValue() || zIsValid || !r0.a(k.o())) {
                k.this.P0();
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.U0();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements t0.c {
        public b() {
        }

        @Override // com.applovin.impl.t0.c
        public void a(t0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.this.f15478p0.set(bVar.b());
            if (!bVar.a()) {
                k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.T0();
            k.this.S0();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements r5.b {
        public c() {
        }

        @Override // com.applovin.impl.r5.b
        public void a(JSONObject jSONObject) {
            k.this.c(jSONObject);
            k.this.f15463i.set(false);
            k.this.P0();
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new al.b(3));
            H0 = true;
        } catch (Throwable unused) {
            H0 = false;
        }
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f15480q0 = false;
        D0 = this;
        this.f15465j = appLovinSdkSettings;
        this.f15453d = System.currentTimeMillis();
        this.f15480q0 = true;
        if (!G0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
        E0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f15451c = new WeakReference((Activity) context);
        }
    }

    private void B0() {
        Context context = E0;
        o oVarO = O();
        y4 y4VarQ0 = q0();
        t0 t0VarY = y();
        a(context);
        n0();
        j();
        p();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f15447a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f15447a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f15449b) && this.f15449b.length() != 36) {
            String strO = o2.o(new StringBuilder("Axon event key length "), this.f15449b, " is invalid - expected 36");
            if (k7.c(this)) {
                throw new IllegalArgumentException(strO);
            }
            o.h("AppLovinSdk", strO);
        }
        if (t0VarY.l()) {
            String str2 = "Terms Flow has been replaced. " + t0VarY.g();
            if (k7.c(this)) {
                throw new IllegalStateException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (k7.i()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!k7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (k7.m(context)) {
            this.f15465j.setVerboseLogging(true);
        }
        p0().a(v4.f15959k, Boolean.valueOf(this.f15465j.isVerboseLoggingEnabled()));
        t3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        x4 x4Var = x4.f16175c;
        if (TextUtils.isEmpty((String) y4VarQ0.a(x4Var, (Object) null, defaultSharedPreferences))) {
            this.f15484s0 = true;
            y4VarQ0.b(x4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            y4VarQ0.b(x4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        x4 x4Var2 = x4.f16176d;
        if (((Boolean) y4VarQ0.a(x4Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f15486t0 = true;
        } else {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            y4VarQ0.b(x4Var2, Boolean.TRUE);
            y4VarQ0.b(x4.f16191s, Boolean.valueOf(t0VarY.j()));
        }
        x4 x4Var3 = x4.f16177e;
        this.f15457f = ((Long) y4VarQ0.a(x4Var3, 0L)).longValue() + 1;
        q0().b(x4Var3, Long.valueOf(this.f15457f));
        x4 x4Var4 = x4.f16178f;
        this.f15459g = (Long) y4VarQ0.a(x4Var4, null);
        q0().b(x4Var4, Long.valueOf(G0));
        x4 x4Var5 = x4.f16179g;
        String str3 = (String) y4VarQ0.a(x4Var5, null);
        if (StringUtils.isValidString(str3)) {
            if (AppLovinSdk.VERSION_CODE > k7.g(str3)) {
                y4VarQ0.b(x4Var5, AppLovinSdk.VERSION);
            }
        } else {
            y4VarQ0.b(x4Var5, AppLovinSdk.VERSION);
        }
        w0().d(c2.f13707e, CollectionUtils.map("details", "isInitProviderContextSet=" + F0));
    }

    public static boolean G0() {
        return H0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        if (r0().g()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        r0().h();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        b6 b6VarR0 = r0();
        int i10 = this.f15488u0 + 1;
        this.f15488u0 = i10;
        b6VarR0.a((g5) new r5(i10, this, new c()), b6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        if (H0()) {
            j2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0() {
        synchronized (this.f15472m0) {
            try {
                boolean zA = r0.a(o());
                if (!H0()) {
                    O();
                    if (o.a()) {
                        O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                    }
                }
                if (!((Boolean) a(v4.f15898c3)).booleanValue() || zA) {
                    T0();
                }
                if (((Boolean) a(v4.f15889b3)).booleanValue() && !zA) {
                    O();
                    if (o.a()) {
                        O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    U0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private r O0() {
        if (!o4.f(E0)) {
            return null;
        }
        try {
            return new r(this);
        } catch (Throwable th2) {
            o.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        Long l9 = (Long) a(v4.f15963k3);
        if (l9.longValue() >= 0 && this.f15463i.compareAndSet(false, true)) {
            e8.a(l9.longValue(), false, this, new x(1, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        if (!H0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f15476o0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!y().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            y().a(v0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        v3 v3VarC0 = c0();
        v3VarC0.a(new d(v3VarC0));
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(v4.f15924f4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    public static Context o() {
        return E0;
    }

    public e1 A() {
        Object e1Var = this.V.get();
        if (e1Var == null) {
            synchronized (this.V) {
                try {
                    e1Var = this.V.get();
                    if (e1Var == null) {
                        e1Var = new e1(this);
                        this.V.set(e1Var);
                    }
                } finally {
                }
            }
        }
        if (e1Var == this.V) {
            e1Var = null;
        }
        return (e1) e1Var;
    }

    public boolean A0() {
        return this.f15486t0;
    }

    public l B() {
        Object lVar = this.A.get();
        if (lVar == null) {
            synchronized (this.A) {
                try {
                    lVar = this.A.get();
                    if (lVar == null) {
                        lVar = new l(this);
                        this.A.set(lVar);
                    }
                } finally {
                }
            }
        }
        if (lVar == this.A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public i1 C() {
        Object i1Var = this.E.get();
        if (i1Var == null) {
            synchronized (this.E) {
                try {
                    i1Var = this.E.get();
                    if (i1Var == null) {
                        i1Var = new i1(this);
                        this.E.set(i1Var);
                    }
                } finally {
                }
            }
        }
        if (i1Var == this.E) {
            i1Var = null;
        }
        return (i1) i1Var;
    }

    public boolean C0() {
        boolean z10;
        synchronized (this.f15472m0) {
            z10 = this.f15482r0;
        }
        return z10;
    }

    public String D() {
        return this.f15490v0;
    }

    public boolean D0() {
        return this.f15484s0;
    }

    public q1 E() {
        return this.f15487u;
    }

    public boolean E0() {
        boolean z10;
        synchronized (this.f15494x0) {
            z10 = this.f15492w0 != null;
        }
        return z10;
    }

    public String F() {
        return x0().d();
    }

    public boolean F0() {
        boolean z10;
        synchronized (this.f15472m0) {
            z10 = this.f15480q0;
        }
        return z10;
    }

    public EventServiceImpl G() {
        Object eventServiceImpl = this.f15475o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f15475o) {
                try {
                    eventServiceImpl = this.f15475o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f15475o.set(eventServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (eventServiceImpl == this.f15475o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public m H() {
        Object mVar = this.H.get();
        if (mVar == null) {
            synchronized (this.H) {
                try {
                    mVar = this.H.get();
                    if (mVar == null) {
                        mVar = new m(this);
                        this.H.set(mVar);
                    }
                } finally {
                }
            }
        }
        if (mVar == this.H) {
            mVar = null;
        }
        return (m) mVar;
    }

    public boolean H0() {
        return StringUtils.containsIgnoreCase(V(), "max");
    }

    public n I() {
        Object nVar = this.J.get();
        if (nVar == null) {
            synchronized (this.J) {
                try {
                    nVar = this.J.get();
                    if (nVar == null) {
                        nVar = new n(this);
                        this.J.set(nVar);
                    }
                } finally {
                }
            }
        }
        if (nVar == this.J) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean I0() {
        return k7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity J() {
        WeakReference weakReference;
        if (!((Boolean) a(v4.f16052v4)).booleanValue() || (weakReference = this.f15451c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration K() {
        return this.f15492w0;
    }

    public long L() {
        return this.f15453d;
    }

    public Long M() {
        return this.f15459g;
    }

    public long N() {
        return this.f15457f;
    }

    public void N0() {
        b(false);
    }

    public o O() {
        return this.f15481r;
    }

    public w2 P() {
        return this.f15485t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.f15464i0.get();
        if (dVar == null) {
            synchronized (this.f15464i0) {
                try {
                    dVar = this.f15464i0.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.mediation.d(this);
                        this.f15464i0.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.f15464i0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void Q0() {
        if (StringUtils.isValidString(this.f15469l)) {
            return;
        }
        this.f15469l = "max";
    }

    public com.applovin.impl.mediation.e R() {
        return this.f15466j0;
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f15454d0.get();
        if (fVar == null) {
            synchronized (this.f15454d0) {
                try {
                    fVar = this.f15454d0.get();
                    if (fVar == null) {
                        fVar = new com.applovin.impl.mediation.f(this);
                        this.f15454d0.set(fVar);
                    }
                } finally {
                }
            }
        }
        if (fVar == this.f15454d0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public void S0() {
        u().a();
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.f15452c0.get();
        if (gVar == null) {
            synchronized (this.f15452c0) {
                try {
                    gVar = this.f15452c0.get();
                    if (gVar == null) {
                        gVar = new com.applovin.impl.mediation.g(this);
                        this.f15452c0.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.f15452c0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void T0() {
        synchronized (this.f15472m0) {
            this.f15480q0 = true;
            r0().i();
            d();
        }
    }

    public m3 U() {
        Object m3Var = this.f15460g0.get();
        if (m3Var == null) {
            synchronized (this.f15460g0) {
                try {
                    m3Var = this.f15460g0.get();
                    if (m3Var == null) {
                        m3Var = new m3(this);
                        this.f15460g0.set(m3Var);
                    }
                } finally {
                }
            }
        }
        if (m3Var == this.f15460g0) {
            m3Var = null;
        }
        return (m3) m3Var;
    }

    public String V() {
        return this.f15469l;
    }

    public void V0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        p0().a();
        p0().e();
        if (this.f15474n0.compareAndSet(true, false)) {
            T0();
        } else {
            this.f15474n0.set(true);
        }
    }

    public void W0() {
        if (StringUtils.isValidString(this.f15490v0)) {
            return;
        }
        this.f15490v0 = "max";
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.f15456e0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f15456e0) {
                try {
                    mediationServiceImpl = this.f15456e0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.f15456e0.set(mediationServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (mediationServiceImpl == this.f15456e0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        z().n();
    }

    public r3 Y() {
        Object r3Var = this.f15497z.get();
        if (r3Var == null) {
            synchronized (this.f15497z) {
                try {
                    r3Var = this.f15497z.get();
                    if (r3Var == null) {
                        r3Var = new r3(this);
                        this.f15497z.set(r3Var);
                    }
                } finally {
                }
            }
        }
        if (r3Var == this.f15497z) {
            r3Var = null;
        }
        return (r3) r3Var;
    }

    public void Y0() {
        a((Map) null);
    }

    public s3 Z() {
        Object s3Var = this.f15458f0.get();
        if (s3Var == null) {
            synchronized (this.f15458f0) {
                try {
                    s3Var = this.f15458f0.get();
                    if (s3Var == null) {
                        s3Var = new s3();
                        this.f15458f0.set(s3Var);
                    }
                } finally {
                }
            }
        }
        if (s3Var == this.f15458f0) {
            s3Var = null;
        }
        return (s3) s3Var;
    }

    public void Z0() {
        if ("admob".equalsIgnoreCase(this.f15469l) && ((Boolean) a(v4.J3)).booleanValue()) {
            String str = (String) a(v4.I3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb2.append(str2);
            sb2.append(".");
            if (str.startsWith(sb2.toString())) {
                return;
            }
            String strL = e3.g.l("Mismatched AdMob adapter (", str, ") and AppLovin SDK (", str2, ") versions detected, which may cause compatibility issues.");
            o.h("AppLovinSdk", strL);
            AppLovinSdkUtils.runOnUiThread(true, new t(3, this, strL));
        }
    }

    public p a0() {
        Object pVar = this.f15462h0.get();
        if (pVar == null) {
            synchronized (this.f15462h0) {
                try {
                    pVar = this.f15462h0.get();
                    if (pVar == null) {
                        pVar = new p(this);
                        this.f15462h0.set(pVar);
                    }
                } finally {
                }
            }
        }
        if (pVar == this.f15462h0) {
            pVar = null;
        }
        return (p) pVar;
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f15473n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f15473n) {
                try {
                    appLovinNativeAdService = this.f15473n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f15473n.set(appLovinNativeAdService);
                    }
                } finally {
                }
            }
        }
        if (appLovinNativeAdService == this.f15473n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public v3 c0() {
        Object v3Var = this.M.get();
        if (v3Var == null) {
            synchronized (this.M) {
                try {
                    v3Var = this.M.get();
                    if (v3Var == null) {
                        v3Var = new v3(o());
                        this.M.set(v3Var);
                    }
                } finally {
                }
            }
        }
        if (v3Var == this.M) {
            v3Var = null;
        }
        return (v3) v3Var;
    }

    public z3 d0() {
        Object z3Var = this.Y.get();
        if (z3Var == null) {
            synchronized (this.Y) {
                try {
                    z3Var = this.Y.get();
                    if (z3Var == null) {
                        z3Var = new z3(this);
                        this.Y.set(z3Var);
                    }
                } finally {
                }
            }
        }
        if (z3Var == this.Y) {
            z3Var = null;
        }
        return (z3) z3Var;
    }

    public g4 e0() {
        Object g4Var = this.T.get();
        if (g4Var == null) {
            synchronized (this.T) {
                try {
                    g4Var = this.T.get();
                    if (g4Var == null) {
                        g4Var = new g4(this);
                        this.T.set(g4Var);
                    }
                } finally {
                }
            }
        }
        if (g4Var == this.T) {
            g4Var = null;
        }
        return (g4) g4Var;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object bVar = this.f15448a0.get();
        if (bVar == null) {
            synchronized (this.f15448a0) {
                try {
                    bVar = this.f15448a0.get();
                    if (bVar == null) {
                        bVar = new com.applovin.impl.sdk.network.b(this);
                        this.f15448a0.set(bVar);
                    }
                } finally {
                }
            }
        }
        if (bVar == this.f15448a0) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public PostbackServiceImpl g0() {
        Object postbackServiceImpl = this.Z.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Z) {
                try {
                    postbackServiceImpl = this.Z.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.Z.set(postbackServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (postbackServiceImpl == this.Z) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public r h0() {
        Object objO0 = this.B.get();
        if (objO0 == null) {
            synchronized (this.B) {
                try {
                    objO0 = this.B.get();
                    if (objO0 == null) {
                        objO0 = O0();
                        if (objO0 == null) {
                            objO0 = this.B;
                        }
                        this.B.set(objO0);
                    }
                } finally {
                }
            }
        }
        if (objO0 == this.B) {
            objO0 = null;
        }
        return (r) objO0;
    }

    public String i0() {
        return x0().a();
    }

    public String j0() {
        return this.f15447a;
    }

    public MaxSegmentCollectionImpl k0() {
        return (MaxSegmentCollectionImpl) this.f15467k;
    }

    public Map l0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplK0 = k0();
        if (maxSegmentCollectionImplK0 == null) {
            return null;
        }
        return maxSegmentCollectionImplK0.getJsonData();
    }

    public u4 m0() {
        Object u4Var = this.O.get();
        if (u4Var == null) {
            synchronized (this.O) {
                try {
                    u4Var = this.O.get();
                    if (u4Var == null) {
                        u4Var = new u4(this);
                        this.O.set(u4Var);
                    }
                } finally {
                }
            }
        }
        if (u4Var == this.O) {
            u4Var = null;
        }
        return (u4) u4Var;
    }

    public SessionTracker n0() {
        Object sessionTracker = this.I.get();
        if (sessionTracker == null) {
            synchronized (this.I) {
                try {
                    sessionTracker = this.I.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.I.set(sessionTracker);
                    }
                } finally {
                }
            }
        }
        if (sessionTracker == this.I) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings o0() {
        return this.f15465j;
    }

    public ArrayService p() {
        Object arrayService = this.U.get();
        if (arrayService == null) {
            synchronized (this.U) {
                try {
                    arrayService = this.U.get();
                    if (arrayService == null) {
                        arrayService = new ArrayService(this);
                        this.U.set(arrayService);
                    }
                } finally {
                }
            }
        }
        if (arrayService == this.U) {
            arrayService = null;
        }
        return (ArrayService) arrayService;
    }

    public w4 p0() {
        Object w4Var = this.f15493x.get();
        if (w4Var == null) {
            synchronized (this.f15493x) {
                try {
                    w4Var = this.f15493x.get();
                    if (w4Var == null) {
                        w4Var = new w4(this);
                        this.f15493x.set(w4Var);
                    }
                } finally {
                }
            }
        }
        if (w4Var == this.f15493x) {
            w4Var = null;
        }
        return (w4) w4Var;
    }

    public i q() {
        Object iVar = this.P.get();
        if (iVar == null) {
            synchronized (this.P) {
                try {
                    iVar = this.P.get();
                    if (iVar == null) {
                        iVar = new i(this);
                        this.P.set(iVar);
                    }
                } finally {
                }
            }
        }
        if (iVar == this.P) {
            iVar = null;
        }
        return (i) iVar;
    }

    public y4 q0() {
        Object y4Var = this.C.get();
        if (y4Var == null) {
            synchronized (this.C) {
                try {
                    y4Var = this.C.get();
                    if (y4Var == null) {
                        y4Var = new y4(this);
                        this.C.set(y4Var);
                    }
                } finally {
                }
            }
        }
        if (y4Var == this.C) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public String r() {
        return this.f15449b;
    }

    public b6 r0() {
        Object b6Var = this.f15491w.get();
        if (b6Var == null) {
            synchronized (this.f15491w) {
                try {
                    b6Var = this.f15491w.get();
                    if (b6Var == null) {
                        b6Var = new b6(this);
                        this.f15491w.set(b6Var);
                    }
                } finally {
                }
            }
        }
        if (b6Var == this.f15491w) {
            b6Var = null;
        }
        return (b6) b6Var;
    }

    public String s() {
        return x0().b();
    }

    public w6 s0() {
        Object w6Var = this.R.get();
        if (w6Var == null) {
            synchronized (this.R) {
                try {
                    w6Var = this.R.get();
                    if (w6Var == null) {
                        w6Var = new w6(this);
                        this.R.set(w6Var);
                    }
                } finally {
                }
            }
        }
        if (w6Var == this.R) {
            w6Var = null;
        }
        return (w6) w6Var;
    }

    public CmpServiceImpl t() {
        Object cmpServiceImpl = this.f15477p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f15477p) {
                try {
                    cmpServiceImpl = this.f15477p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f15477p.set(cmpServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (cmpServiceImpl == this.f15477p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public c7 t0() {
        Object c7Var = this.f15468k0.get();
        if (c7Var == null) {
            synchronized (this.f15468k0) {
                try {
                    c7Var = this.f15468k0.get();
                    if (c7Var == null) {
                        c7Var = new c7(this);
                        this.f15468k0.set(c7Var);
                    }
                } finally {
                }
            }
        }
        if (c7Var == this.f15468k0) {
            c7Var = null;
        }
        return (c7) c7Var;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CoreSdk{sdkKey='");
        sb2.append(this.f15447a);
        sb2.append("', enabled=");
        sb2.append(this.f15482r0);
        sb2.append(", isFirstSession=");
        return a.b.p(sb2, this.f15484s0, AbstractJsonLexerKt.END_OBJ);
    }

    public j u() {
        Object jVar = this.N.get();
        if (jVar == null) {
            synchronized (this.N) {
                try {
                    jVar = this.N.get();
                    if (jVar == null) {
                        jVar = new j(this);
                        this.N.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.N) {
            jVar = null;
        }
        return (j) jVar;
    }

    public long u0() {
        if (this.f15461h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f15461h;
    }

    public String v() {
        return x0().c();
    }

    public Activity v0() {
        Activity activityB = a(o()).b();
        return activityB != null ? activityB : J();
    }

    public SdkConfigurationImpl w() {
        return this.f15496y0;
    }

    public i7 w0() {
        return this.f15489v;
    }

    public q0 x() {
        Object q0Var = this.f15495y.get();
        if (q0Var == null) {
            synchronized (this.f15495y) {
                try {
                    q0Var = this.f15495y.get();
                    if (q0Var == null) {
                        q0Var = new q0(this);
                        this.f15495y.set(q0Var);
                    }
                } finally {
                }
            }
        }
        if (q0Var == this.f15495y) {
            q0Var = null;
        }
        return (q0) q0Var;
    }

    public j7 x0() {
        Object j7Var = this.D.get();
        if (j7Var == null) {
            synchronized (this.D) {
                try {
                    j7Var = this.D.get();
                    if (j7Var == null) {
                        j7Var = new j7(this);
                        this.D.set(j7Var);
                    }
                } finally {
                }
            }
        }
        if (j7Var == this.D) {
            j7Var = null;
        }
        return (j7) j7Var;
    }

    public t0 y() {
        Object t0Var = this.Q.get();
        if (t0Var == null) {
            synchronized (this.Q) {
                try {
                    t0Var = this.Q.get();
                    if (t0Var == null) {
                        t0Var = new t0(this);
                        this.Q.set(t0Var);
                    }
                } finally {
                }
            }
        }
        if (t0Var == this.Q) {
            t0Var = null;
        }
        return (t0) t0Var;
    }

    public i8 y0() {
        Object i8Var = this.L.get();
        if (i8Var == null) {
            synchronized (this.L) {
                try {
                    i8Var = this.L.get();
                    if (i8Var == null) {
                        i8Var = new i8(this);
                        this.L.set(i8Var);
                    }
                } finally {
                }
            }
        }
        if (i8Var == this.L) {
            i8Var = null;
        }
        return (i8) i8Var;
    }

    public d1 z() {
        Object d1Var = this.S.get();
        if (d1Var == null) {
            synchronized (this.S) {
                try {
                    d1Var = this.S.get();
                    if (d1Var == null) {
                        d1Var = new d1(this);
                        this.S.set(d1Var);
                    }
                } finally {
                }
            }
        }
        if (d1Var == this.S) {
            d1Var = null;
        }
        return (d1) d1Var;
    }

    public AppLovinSdk z0() {
        return this.f15479q;
    }

    private void d() {
        b6 b6VarR0 = r0();
        int i10 = this.f15488u0 + 1;
        this.f15488u0 = i10;
        b6VarR0.a((g5) new r5(i10, this, new a()), b6.b.CORE);
    }

    public static long n() {
        return G0;
    }

    public com.applovin.impl.c e() {
        return a(E0);
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.G.get();
        if (aVar == null) {
            synchronized (this.G) {
                try {
                    aVar = this.G.get();
                    if (aVar == null) {
                        aVar = new com.applovin.impl.sdk.a(this);
                        this.G.set(aVar);
                    }
                } finally {
                }
            }
        }
        if (aVar == this.G) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.f g() {
        return this.f15483s;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.W.get();
        if (dVar == null) {
            synchronized (this.W) {
                try {
                    dVar = this.W.get();
                    if (dVar == null) {
                        dVar = new com.applovin.impl.sdk.d(this);
                        this.W.set(dVar);
                    }
                } finally {
                }
            }
        }
        if (dVar == this.W) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public e i() {
        Object eVar = this.F.get();
        if (eVar == null) {
            synchronized (this.F) {
                try {
                    eVar = this.F.get();
                    if (eVar == null) {
                        eVar = new e(this);
                        this.F.set(eVar);
                    }
                } finally {
                }
            }
        }
        if (eVar == this.F) {
            eVar = null;
        }
        return (e) eVar;
    }

    public com.applovin.impl.j j() {
        Object jVar = this.f15450b0.get();
        if (jVar == null) {
            synchronized (this.f15450b0) {
                try {
                    jVar = this.f15450b0.get();
                    if (jVar == null) {
                        jVar = new com.applovin.impl.j(this);
                        this.f15450b0.set(jVar);
                    }
                } finally {
                }
            }
        }
        if (jVar == this.f15450b0) {
            jVar = null;
        }
        return (com.applovin.impl.j) jVar;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f15471m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f15471m) {
                try {
                    appLovinAdServiceImpl = this.f15471m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f15471m.set(appLovinAdServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (appLovinAdServiceImpl == this.f15471m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public g l() {
        Object gVar = this.K.get();
        if (gVar == null) {
            synchronized (this.K) {
                try {
                    gVar = this.K.get();
                    if (gVar == null) {
                        gVar = new g(this);
                        this.K.set(gVar);
                    }
                } finally {
                }
            }
        }
        if (gVar == this.K) {
            gVar = null;
        }
        return (g) gVar;
    }

    public h m() {
        Object hVar = this.X.get();
        if (hVar == null) {
            synchronized (this.X) {
                try {
                    hVar = this.X.get();
                    if (hVar == null) {
                        hVar = new h(this);
                        this.X.set(hVar);
                    }
                } finally {
                }
            }
        }
        if (hVar == this.X) {
            hVar = null;
        }
        return (h) hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f15461h = System.currentTimeMillis();
            r0.c(jSONObject, this);
            r0.b(jSONObject, this);
            r0.a(jSONObject, this);
            i3.f(jSONObject, this);
            i3.d(jSONObject, this);
            i3.e(jSONObject, this);
            i3.g(jSONObject, this);
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        E0 = context.getApplicationContext();
        F0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        B0();
        this.f15465j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            p0().a(v4.I3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(v4.f16023s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        b6 b6VarR0 = r0();
        g5 g5Var = this.B0;
        b6.b bVar = b6.b.CORE;
        b6VarR0.a(g5Var, bVar);
        r0().a(this.C0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f15479q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextO = o();
        return a(contextO.getResources().getIdentifier(str, "string", contextO.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", str);
        }
        r0().a(new a6(this));
    }

    public static String a(int i10, List list) throws Resources.NotFoundException {
        String string = o().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public void c() {
        synchronized (this.f15472m0) {
            try {
                if (!this.f15480q0 && !this.f15482r0) {
                    T0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            o.h("AppLovinSdk", (String) it.next());
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (I0 == null) {
            synchronized (J0) {
                try {
                    if (I0 == null) {
                        I0 = new com.applovin.impl.c(context);
                    }
                } finally {
                }
            }
        }
        return I0;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements v3.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3 f15502a;

        public d(v3 v3Var) {
            this.f15502a = v3Var;
        }

        @Override // com.applovin.impl.v3.a
        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f15472m0) {
                try {
                    if (!k.this.f15480q0) {
                        k.this.T0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f15502a.b(this);
        }

        @Override // com.applovin.impl.v3.a
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (!k7.c(this)) {
            HashMap map = new HashMap();
            map.put("details", "admob");
            map.put("error_message", str);
            E().a(c2.E0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(v4 v4Var) {
        return p0().c(v4Var);
    }

    public void c(x4 x4Var) {
        q0().b(x4Var);
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f15494x0) {
            try {
                if (this.f15492w0 != null) {
                    o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f15492w0 + ". Ignoring the provided initialization configuration.");
                    if (!C0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new w(this, sdkInitializationListener, 0));
                    return;
                }
                this.f15455e = System.currentTimeMillis();
                this.f15492w0 = appLovinSdkInitializationConfiguration;
                this.f15498z0 = sdkInitializationListener;
                this.f15447a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f15449b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f15469l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f15467k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                k7.a((Runnable) new t(2, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(boolean z10) {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (y().i() || (sdkInitializationListener = this.f15498z0) == null) {
            return;
        }
        if (C0()) {
            this.f15498z0 = null;
            this.A0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.A0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(v4.f15999p)).booleanValue()) {
                this.f15498z0 = null;
            } else {
                this.A0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", C0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f15478p0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15455e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f15489v.d(c2.f13715i, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new w(this, sdkInitializationListener, 1), Math.max(0L, ((Long) a(v4.f16007q)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f15496y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f15496y0);
    }

    public void a(boolean z10) {
        synchronized (this.f15472m0) {
            this.f15480q0 = false;
            this.f15482r0 = z10;
        }
        if (z10) {
            List listA = t3.a(this);
            if (listA.isEmpty()) {
                r0().h();
                N0();
                return;
            }
            Long l9 = (Long) a(o3.f14945f7);
            p6 p6Var = new p6(this, true, "timeoutInitAdapters", new x(0, this));
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l9 + "ms...");
            }
            r0().a(p6Var, b6.b.TIMEOUT, l9.longValue(), true);
        }
    }

    public List b(v4 v4Var) {
        return p0().b(v4Var);
    }

    public void b(x4 x4Var, Object obj) {
        q0().b(x4Var, obj);
    }

    public Object b(x4 x4Var) {
        return q0().a(x4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r15.f15490v0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (com.applovin.impl.sdk.o.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.f15490v0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public void a(h3 h3Var) {
        if (r0().g()) {
            return;
        }
        List listA = t3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        r0().h();
        N0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f15470l0;
        return (list == null || list.size() <= 0 || this.f15470l0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) q0().a(x4.f16179g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < k7.g(str)) {
                o.h("AppLovinSdk", p0.o2.r(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public Object a(v4 v4Var) {
        return p0().a(v4Var);
    }

    public boolean a(v4 v4Var, MaxAdFormat maxAdFormat) {
        return b(v4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        C().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        q0().a(str, obj, editor);
    }

    public Object a(x4 x4Var) {
        return a(x4Var, (Object) null);
    }

    public Object a(x4 x4Var, Object obj) {
        return q0().a(x4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return y4.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        q0().a(sharedPreferences);
    }
}
