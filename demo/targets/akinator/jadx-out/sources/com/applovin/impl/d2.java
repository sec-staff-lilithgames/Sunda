package com.applovin.impl;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.c2;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class d2 {

    /* renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f13842g;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f13844a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f13845b;

    /* renamed from: c, reason: collision with root package name */
    private final c2.b f13846c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f13847d = a.b.u();

    /* renamed from: e, reason: collision with root package name */
    private final Set f13848e = Collections.synchronizedSet(new HashSet());

    /* renamed from: f, reason: collision with root package name */
    private static final int f13841f = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f13843h = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ThreadFactory {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.d2$a$a, reason: collision with other inner class name */
        public class C0030a implements Thread.UncaughtExceptionHandler {
            public C0030a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                d2.this.f13844a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    d2.this.f13844a.O().a("HealthEventsReporter", "Caught unhandled exception", th2);
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) d2.this.f13844a.a(v4.Q)).intValue());
            thread.setUncaughtExceptionHandler(new C0030a());
            return thread;
        }
    }

    public d2(com.applovin.impl.sdk.k kVar, c2.b bVar) {
        this.f13844a = kVar;
        this.f13845b = kVar.O();
        this.f13846c = bVar;
        a();
    }

    private void c(c2 c2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        if (c2Var.a() == c2.b.AD || c2Var.a() == c2.b.MEDIATED_AD || c2Var.a() == c2.b.USER_SESSION || !k7.a(((Integer) this.f13844a.a(v4.f16079z)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(c2Var, map).openConnection();
                try {
                    int i10 = f13841f;
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod(C3271ic.f36944b);
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", c2Var.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13845b.a("HealthEventsReporter", c2Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.f13847d.put(c2Var, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f13845b.d("HealthEventsReporter", "Failed to report " + c2Var.b() + " with extra parameters " + map, th2);
                        }
                        k7.a(httpURLConnection, this.f13844a);
                    } finally {
                        k7.a(httpURLConnection, this.f13844a);
                    }
                }
            } catch (Throwable th4) {
                httpURLConnection = null;
                th2 = th4;
            }
        }
    }

    public void d(c2 c2Var, Map map) {
        a(c2Var, map, 0L);
    }

    private void a() {
        if (f13842g != null) {
            return;
        }
        synchronized (f13843h) {
            try {
                if (f13842g != null) {
                    return;
                }
                f13842g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d(c2 c2Var, List list) {
        String str = (String) this.f13844a.a(v4.A);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = c2Var.a(this.f13844a);
        if (k7.a(dA)) {
            if (((Boolean) this.f13844a.a(v4.G)).booleanValue()) {
                a(str, c2Var, a(c2Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f13842g.execute(new al.a(4, str, (Object) this, (Object) c2Var, (Object) a(c2Var, dA, Collections.singletonList((Map) it.next()))));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, c2 c2Var, JSONObject jSONObject) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = jSONObject.toString().getBytes(C.UTF8_NAME);
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int i10 = f13841f;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod(C3271ic.f36944b);
            httpURLConnection.setRequestProperty("AppLovin-Event-Type", c2Var.b());
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13845b.a("HealthEventsReporter", c2Var.b() + " reported with code " + responseCode);
            }
            this.f13847d.put(c2Var, Long.valueOf(System.currentTimeMillis()));
            k7.a(httpURLConnection, this.f13844a);
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13845b.d("HealthEventsReporter", "Failed to report " + c2Var.b(), th);
                }
            } finally {
                k7.a(httpURLConnection2, this.f13844a);
            }
        }
    }

    public void a(c2 c2Var, String str) {
        a(c2Var, str, new HashMap());
    }

    public void a(c2 c2Var, String str, Map map) {
        map.put("source", str);
        d(c2Var, map);
    }

    public void a(c2 c2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f13848e.add(str2)) {
            map.put("source", str);
            a(c2Var, str, map);
        }
    }

    public void a(c2 c2Var, Map map, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(c2Var, arrayList, j10);
    }

    public void a(c2 c2Var, List list, long j10) {
        if (a(c2Var, j10)) {
            return;
        }
        try {
            if (k7.h()) {
                f13842g.execute(new androidx.browser.customtabs.g(this, 9, c2Var, list));
            } else {
                b(c2Var, list);
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13845b.d("HealthEventsReporter", "Failed to report " + c2Var.b() + " with extra parameters collection " + list, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(c2 c2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13845b.a("HealthEventsReporter", "Reporting " + c2Var.b() + " with extra parameters collection " + list);
        }
        if (this.f13846c != c2Var.a()) {
            k1.a("Health event " + c2Var.b() + " category: " + c2Var.a() + " does not match the reporter category: " + this.f13846c, new Object[0]);
        }
        c(c2Var, list);
        d(c2Var, list);
    }

    private Map c(c2 c2Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (c2Var == c2.C0) {
            map2.remove("details");
        }
        return map2;
    }

    private Map b(c2 c2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", c2Var.b());
        if (c2Var == c2.f13748y0 || c2Var == c2.f13746x0 || c2Var == c2.N0 || c2Var == c2.L0) {
            if (((Boolean) this.f13844a.a(v4.f15964k4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(k8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", k8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", k8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f13844a.B().I(), map2);
        }
        Map mapL = this.f13844a.B().L();
        map2.put(Q6.H, String.valueOf(mapL.get(Q6.H)));
        map2.put("country_code", String.valueOf(mapL.get("country_code")));
        map2.put("cc", this.f13844a.w().getCountryCode());
        map2.put("applovin_random_token", this.f13844a.i0());
        map2.put("compass_random_token", this.f13844a.v());
        map2.put("model", Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), map2);
        map2.put("md", (String) this.f13844a.a(v4.f16031t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(c2Var, map));
        }
        return map2;
    }

    private URL a(c2 c2Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = b(c2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), C.UTF8_NAME);
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME);
            sb2.append(strEncode);
            sb2.append(C3191e4.i.f36525b);
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append(C3191e4.i.f36527c);
            }
        }
        return new URL(sb2.toString());
    }

    private JSONObject a(c2 c2Var, double d10, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (c2Var == c2.f13748y0 || c2Var == c2.f13746x0 || c2Var == c2.N0 || c2Var == c2.L0) {
            if (((Boolean) this.f13844a.a(v4.f15964k4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(k8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", k8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", k8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f13844a.B().I());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapL = this.f13844a.B().L();
        JsonUtils.putObject(jSONObject2, Q6.H, mapL.get(Q6.H));
        JsonUtils.putObject(jSONObject2, "os", mapL.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapL.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapL.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", mapL.get("model"));
        JsonUtils.putObject(jSONObject2, "revision", mapL.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapL.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f13844a.w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f13844a.i0());
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map mapE = this.f13844a.B().E();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapE.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f13844a.a(v4.I3));
        JsonUtils.putObject(jSONObject2, "app_version", mapE.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapE.get("package_name"));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapE.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.f13844a.a(v4.f16031t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f13844a.V());
        SessionTracker sessionTrackerN0 = this.f13844a.n0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerN0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerN0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerN0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.k.n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", c2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d10);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.k.o()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d2.b(java.util.Map):void");
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f13844a.I().a();
        if (objA instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
        } else if (objA instanceof v2) {
            v2 v2Var = (v2) objA;
            map.put("fs_ad_network", v2Var.getNetworkName());
            map.put("fs_ad_creative_id", v2Var.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private boolean a(c2 c2Var, long j10) {
        Long l9 = (Long) this.f13847d.get(c2Var);
        return System.currentTimeMillis() - (l9 != null ? l9.longValue() : -1L) < j10;
    }
}
