package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.b6;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.ironsource.Q6;
import com.sfbx.appconsent.core.IABConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r5 extends g5 {

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f15190j = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final int f15191g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f15192h;

    /* renamed from: i, reason: collision with root package name */
    private b f15193i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends g5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (r5.this.f15193i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Timing out fetch basic settings...");
                }
                r5.this.a(new JSONObject());
            }
        }
    }

    public r5(int i10, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f15192h = new Object();
        this.f15191g = i10;
        this.f15193i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.f14003a.a(v4.f15984n0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.f14003a.a(v4.f15976m0), "5.0/i", b());
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f14003a;
            v4 v4Var = v4.f15997o5;
            if (((Boolean) kVar.a(v4Var)).booleanValue() || ((Boolean) this.f14003a.a(v4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.f15191g);
            jSONObject.put("server_installed_at", this.f14003a.a(v4.f15991o));
            if (this.f14003a.D0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f14003a.A0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", k7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", k7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f14003a.a(v4.I3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f14003a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f14003a.D());
            jSONObject.put("installed_mediation_adapters", t3.b(this.f14003a));
            Map mapE = this.f14003a.B().E();
            jSONObject.put("package_name", mapE.get("package_name"));
            jSONObject.put("app_version", mapE.get("app_version"));
            jSONObject.put("debug", mapE.get("debug"));
            jSONObject.put("tg", mapE.get("tg"));
            jSONObject.put("target_sdk", mapE.get("target_sdk"));
            jSONObject.put("session_id", mapE.get("session_id"));
            List list = (List) mapE.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapE.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f14003a.K() != null ? this.f14003a.K().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapE.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapE.get("IABTCF_gdprApplies"));
            Object obj = mapE.get(IABConstants.GOOGLE_ADDITIONAL_CONSENT);
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, IABConstants.GOOGLE_ADDITIONAL_CONSENT, (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f14003a.y().b());
            Map mapL = this.f14003a.B().L();
            jSONObject.put(Q6.H, mapL.get(Q6.H));
            jSONObject.put("os", mapL.get("os"));
            jSONObject.put("locale", mapL.get("locale"));
            jSONObject.put("brand", mapL.get("brand"));
            jSONObject.put("brand_name", mapL.get("brand_name"));
            jSONObject.put("hardware", mapL.get("hardware"));
            jSONObject.put("model", mapL.get("model"));
            jSONObject.put("revision", mapL.get("revision"));
            jSONObject.put("is_tablet", mapL.get("is_tablet"));
            jSONObject.put("screen_size_in", mapL.get("screen_size_in"));
            jSONObject.put("supported_abis", mapL.get("supported_abis"));
            Object obj2 = mapL.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f14003a.a(v4.T3)).booleanValue()) {
                jSONObject.put("mtl", this.f14003a.n0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a aVarF = this.f14003a.B().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = p0.c().b(a());
            if (((Boolean) this.f14003a.a(v4.D3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarF = this.f14003a.B().F();
            if (((Boolean) this.f14003a.a(v4.f16059w3)).booleanValue() && bVarF != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarF.f15517a);
                jSONObject.put("idfv_scope", bVarF.f15518b);
            }
            if (((Boolean) this.f14003a.a(v4.f16083z3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f14003a.v());
            }
            if (((Boolean) this.f14003a.a(v4.B3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f14003a.i0());
            }
            if (((Boolean) this.f14003a.a(v4.F3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f14003a.s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f14003a.F());
            if (this.f14003a.t0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f14003a.t0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f14003a.o0().getExtraParameters()));
            Map mapL0 = this.f14003a.l0();
            if (!CollectionUtils.isEmpty(mapL0)) {
                jSONObject.put("segments", new JSONObject(mapL0));
            }
            if (this.f15191g > 1) {
                ArrayService arrayServiceP = this.f14003a.p();
                if (arrayServiceP.getIsDirectDownloadEnabled() != null) {
                    jSONObject.put("ah_dd_enabled", arrayServiceP.getIsDirectDownloadEnabled());
                }
                jSONObject.put("ah_sdk_version_code", arrayServiceP.getAppHubVersionCode());
                jSONObject.put("ah_random_user_token", StringUtils.emptyIfNull(arrayServiceP.getRandomUserToken()));
                jSONObject.put("ah_sdk_package_name", StringUtils.emptyIfNull(arrayServiceP.getAppHubPackageName()));
            }
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Failed to create JSON body", e10);
            }
            this.f14003a.E().a(this.f14004b, "createJSONBody", e10);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f14003a.a(v4.f16005p5)).booleanValue() && !((Boolean) this.f14003a.a(v4.f15997o5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f14003a.a(v4.f15883a5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f14003a.j0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f14003a.r(), map);
        Boolean boolB = p0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = p0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = p0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (!o0.j() && f15190j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.a(this.f14004b, "Cannot update security provider", th2);
                }
            }
        }
        this.f14003a.w0().d(c2.f13709f, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f14003a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f14003a.a(v4.A5)).booleanValue()).c(C3271ic.f36944b).a((Object) new JSONObject()).a(((Integer) this.f14003a.a(v4.f15881a3)).intValue()).b(((Integer) this.f14003a.a(v4.f15907d3)).intValue()).c(((Integer) this.f14003a.a(v4.Z2)).intValue()).e(((Boolean) this.f14003a.a(v4.f15979m3)).booleanValue()).a(s4.a.a(((Integer) this.f14003a.a(v4.f15925f5)).intValue())).f(true).a();
        this.f14003a.r0().a(new c(this.f14003a), b6.b.TIMEOUT, ((Integer) this.f14003a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, this.f14003a, d(), jElapsedRealtime);
        aVar.c(v4.f15976m0);
        aVar.b(v4.f15984n0);
        this.f14003a.r0().a(aVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f15194m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10, long j10) {
            super(aVar, kVar, z10);
            this.f15194m = j10;
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15194m;
            r5.this.a(jSONObject);
            this.f14003a.w0().d(c2.f13711g, r5.this.a(str, jElapsedRealtime, i10, jSONObject, null));
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f15194m;
            r5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f14003a.w0().d(c2.f13713h, r5.this.a(str, jElapsedRealtime, i10, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j10, int i10, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, C3191e4.i.D, uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f15191g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j10));
        map.put("code", Integer.toString(i10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f15192h) {
            bVar = this.f15193i;
            this.f15193i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
