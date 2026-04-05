package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class R6 {

    /* renamed from: a, reason: collision with root package name */
    private final B7 f35390a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f35391b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f35392c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f35393d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35394a;

        public a(Context context) {
            this.f35394a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                R6.this.e(this.f35394a);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            R6.this.f35392c.set(false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        static volatile R6 f35396a = new R6(0);

        private b() {
        }
    }

    public /* synthetic */ R6(int i10) {
        this();
    }

    private void d(Context context) {
        if (context == null || this.f35393d.getAndSet(true)) {
            return;
        }
        a("auid", this.f35390a.d(context));
        a("model", this.f35390a.l());
        a("make", this.f35390a.q());
        a("os", this.f35390a.f());
        a(Q6.f35287p, this.f35390a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(Q6.B1, adQualitySdkVersion);
        }
        String strI = this.f35390a.i();
        if (strI != null) {
            a(Q6.G, strI.replaceAll("[^0-9/.]", ""));
            a(Q6.J, strI);
        }
        a(Q6.f35242a, String.valueOf(this.f35390a.e()));
        String strU = this.f35390a.u(context);
        if (!TextUtils.isEmpty(strU)) {
            a("carrier", strU);
        }
        String strE = C1.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(Q6.f35284o, strE);
        }
        String strR = this.f35390a.r(context);
        if (!TextUtils.isEmpty(strR)) {
            a("dt", strR);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.f35390a.q(context)));
        a(Q6.f35246b0, "2.0");
        a(Q6.f35249c0, Long.valueOf(C1.f(context)));
        a(Q6.f35243a0, Long.valueOf(C1.d(context)));
        a(Q6.f35251d, C1.b(context));
        a(Q6.O, Integer.valueOf(C3119a4.f(context)));
        a(Q6.Y, C3119a4.g(context));
        a("stid", C3182dd.c(context));
        a(Q6.H, "android");
        a(Q6.f35317z, this.f35390a.t());
        a("mThreshold", this.f35390a.a(this.f35390a.n(context)));
        a();
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strY = this.f35390a.y(context);
        if (!TextUtils.isEmpty(strY)) {
            a(Q6.K0, strY);
        } else if (a(Q6.K0)) {
            b(Q6.K0);
        }
        a("idfi", this.f35390a.i(context));
        String strC = this.f35390a.c(context);
        if (!TextUtils.isEmpty(strC)) {
            a(Q6.f35290q, strC.toUpperCase(Locale.getDefault()));
        }
        a(Q6.f35293r, this.f35390a.A(context));
        String strD = this.f35390a.d();
        if (!TextUtils.isEmpty(strD)) {
            a("tz", strD);
        }
        String strB = C3137b4.b(context);
        if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
            a(Q6.f35269j, strB);
        }
        String strD2 = C3137b4.d(context);
        if (!TextUtils.isEmpty(strD2)) {
            a(Q6.f35272k, strD2);
        }
        a("vpn", Boolean.valueOf(C3137b4.e(context)));
        String strG = this.f35390a.G(context);
        if (!TextUtils.isEmpty(strG)) {
            a("icc", strG);
        }
        int iS = this.f35390a.s(context);
        if (iS >= 0) {
            a(Q6.f35271j1, Integer.valueOf(iS));
        }
        a(Q6.f35274k1, this.f35390a.v(context));
        a(Q6.f35277l1, this.f35390a.F(context));
        a(Q6.f35264h0, Float.valueOf(this.f35390a.E(context)));
        a(Q6.f35278m, String.valueOf(this.f35390a.h()));
        a(Q6.R, Integer.valueOf(this.f35390a.k()));
        a(Q6.Q, Integer.valueOf(this.f35390a.c()));
        a(Q6.X0, String.valueOf(this.f35390a.a()));
        a(Q6.f35262g1, String.valueOf(this.f35390a.m()));
        a("mcc", Integer.valueOf(C3119a4.b(context)));
        a("mnc", Integer.valueOf(C3119a4.c(context)));
        a(Q6.T, Boolean.valueOf(this.f35390a.j()));
        a(Q6.f35260g, Boolean.valueOf(this.f35390a.C(context)));
        a(Q6.f35263h, Integer.valueOf(this.f35390a.D(context)));
        a(Q6.f35245b, Boolean.valueOf(this.f35390a.e(context)));
        a(Q6.K, Boolean.valueOf(this.f35390a.h(context)));
        a("rt", Boolean.valueOf(this.f35390a.p()));
        a(Q6.Z, String.valueOf(this.f35390a.r()));
        a(Q6.f35254e, Integer.valueOf(this.f35390a.k(context)));
        a(Q6.Y0, Boolean.valueOf(this.f35390a.J(context)));
        a(Q6.f35248c, this.f35390a.m(context));
        a(Q6.f35252d0, this.f35390a.s());
        C3536y c3536y = new C3536y(Mb.U().s());
        HashMap map = new HashMap();
        c3536y.a(map);
        a(Q6.D0, map);
        a(Q6.L, ConfigFile.getConfigFile().getPluginType());
        a(Q6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(Q6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private R6() {
        this.f35392c = new AtomicBoolean(false);
        this.f35393d = new AtomicBoolean(false);
        this.f35390a = Mb.U().i();
        this.f35391b = new ConcurrentHashMap<>();
    }

    public static R6 b() {
        return b.f35396a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strI = this.f35390a.I(context);
            if (!TextUtils.isEmpty(strI)) {
                a(Q6.U0, strI);
            }
            String strB = this.f35390a.b(context);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            a(NyKZx.djFFhaK, Boolean.valueOf(Boolean.parseBoolean(strB)));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void b(String str, Object obj) {
        a(str, obj);
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f35391b.remove(str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(T6.a(this.f35391b));
    }

    public void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f35391b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jSONArray2.put(jSONArray.get(i10));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f35391b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f35391b.put(str, obj);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f35391b.containsKey(str);
    }

    private void a(Context context) {
        if (this.f35392c.get()) {
            return;
        }
        try {
            this.f35392c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            this.f35392c.set(false);
        }
    }

    private void a() {
        String strA = C3239gg.f36817a.a();
        if (strA != null) {
            HashMap mapS = b0.e2.s("sdk", strA);
            HashMap map = new HashMap();
            map.put(Q6.G1, mapS);
            HashMap map2 = new HashMap();
            map2.put(Q6.D1, map);
            a(map2);
        }
    }
}
