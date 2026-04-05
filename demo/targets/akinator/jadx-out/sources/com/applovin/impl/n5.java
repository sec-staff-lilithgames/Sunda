package com.applovin.impl;

import android.content.Context;
import com.amazon.device.ads.DTBMetricReport;
import com.applovin.impl.a5;
import com.applovin.impl.b6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n5 extends g5 {

    /* renamed from: j, reason: collision with root package name */
    private static JSONObject f14852j;

    /* renamed from: k, reason: collision with root package name */
    private static final Object f14853k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Map f14854l = a.b.u();

    /* renamed from: g, reason: collision with root package name */
    private final x2 f14855g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f14856h;

    /* renamed from: i, reason: collision with root package name */
    private final b f14857i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(JSONArray jSONArray);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements a5.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f14858a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f14859b;

        /* renamed from: c, reason: collision with root package name */
        private int f14860c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f14861d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection f14862e;

        /* renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f14863f;

        /* renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f14864g;

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.f14861d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i10, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f14860c = i10;
            this.f14858a = bVar;
            this.f14863f = kVar;
            this.f14864g = kVar.O();
            this.f14859b = new Object();
            this.f14862e = new ArrayList(i10);
            this.f14861d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.a5.a
        public void a(a5 a5Var) throws JSONException {
            boolean z10;
            synchronized (this.f14859b) {
                this.f14862e.add(a5Var);
                int i10 = this.f14860c - 1;
                this.f14860c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f14861d.compareAndSet(false, true)) {
                if (k7.h() && ((Boolean) this.f14863f.a(v4.N)).booleanValue()) {
                    this.f14863f.r0().a((g5) new p6(this.f14863f, "handleSignalCollectionCompleted", new m9(this, 1)), b6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList arrayList;
            synchronized (this.f14859b) {
                arrayList = new ArrayList(this.f14862e);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a5 a5Var = (a5) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    b5 b5VarF = a5Var.f();
                    jSONObject.put("name", b5VarF.c());
                    jSONObject.put("class", b5VarF.b());
                    jSONObject.put(DTBMetricReport.ADAPTER_VERSION, a5Var.a());
                    jSONObject.put("sdk_version", a5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = a5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", a5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", a5Var.b());
                    jSONObject2.put("is_cached", a5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14864g.a("TaskCollectSignals", "Collected signal from " + b5VarF);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14864g.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f14863f.E().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f14858a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public n5(x2 x2Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f14855g = x2Var;
        this.f14856h = context;
        this.f14857i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f14857i, this.f14003a);
        this.f14003a.r0().a(new p6(this.f14003a, "timeoutCollectSignal", cVar), b6.b.TIMEOUT, ((Long) this.f14003a.a(o3.f14960n7)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new b5(this.f14855g, jSONArray.getJSONObject(i10), jSONObject, this.f14003a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f14854l.get(this.f14855g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f14855g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f14853k) {
                jSONArray = JsonUtils.getJSONArray(f14852j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f14854l.size() > 0) {
                    b(jSONArray, f14852j);
                    return;
                } else {
                    a(jSONArray, f14852j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.k(this.f14004b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f14003a.a(x4.E, "{}"));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f14854l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
            this.f14003a.E().a("TaskCollectSignals", "waitForSignals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
            this.f14003a.E().a("TaskCollectSignals", "parseSignalsJSON", e11);
        } catch (Throwable th2) {
            a("Failed to collect signals", th2);
            this.f14003a.E().a("TaskCollectSignals", "collectSignals", th2);
        }
    }

    private void a(b5 b5Var, a5.a aVar) {
        if (b5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new androidx.browser.customtabs.g(this, 18, b5Var, aVar));
        } else {
            this.f14003a.X().collectSignal(b5Var, this.f14856h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b5 b5Var, a5.a aVar) {
        this.f14003a.X().collectSignal(b5Var, this.f14856h, aVar);
    }

    private void a(String str, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "No signals collected: " + str, th2);
        }
        b bVar = this.f14857i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f14853k) {
            f14852j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f14854l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            kVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }
}
