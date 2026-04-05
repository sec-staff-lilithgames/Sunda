package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.b6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3271ic;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class t5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final x2 f15740g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONArray f15741h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f15742i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0034a f15743j;

    public t5(x2 x2Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0034a interfaceC0034a) {
        super("TaskFetchMediatedAd", kVar, x2Var.b());
        this.f15740g = x2Var;
        this.f15741h = jSONArray;
        this.f15742i = context;
        this.f15743j = interfaceC0034a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.f14003a);
            r0.b(jSONObject, this.f14003a);
            r0.a(jSONObject, this.f14003a);
            i3.f(jSONObject, this.f14003a);
            i3.d(jSONObject, this.f14003a);
            i3.e(jSONObject, this.f14003a);
            i3.g(jSONObject, this.f14003a);
            this.f14003a.m().a();
            MaxAdFormat maxAdFormatA = this.f15740g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f15740g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f14003a.E().a(c2.M0, this.f14004b, map);
                }
                this.f15743j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (k7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.o.j(this.f14004b, str);
                a(jSONObject);
                return;
            }
            k1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f14004b, str);
            this.f15743j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strB);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f14003a.E().a(c2.E0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Unable to process mediated ad response for ad unit " + this.f15740g.b(), th2);
            }
            throw new RuntimeException("Unable to process ad: " + th2);
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        JSONObject andResetCustomPostBodyData = this.f14003a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !k7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f14003a.a(v4.C4)).booleanValue()) {
            r3 r3VarY = this.f14003a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            p3 p3Var = p3.f15029f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) r3VarY.a(p3Var, q3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) r3VarY.a(p3Var, q3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) r3VarY.a(p3.f15030g, q3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return i3.a(this.f14003a);
    }

    private String f() {
        return i3.b(this.f14003a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f14003a.B().a((Map) null, false, true);
        mapA.putAll(this.f15740g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f15740g.b());
        map.put("AppLovin-Ad-Format", this.f15740g.a().getLabel());
        Map mapD = this.f15740g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        t5 t5Var;
        MaxAdFormat maxAdFormatA = this.f15740g.a();
        String strB = this.f15740g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        j2.a();
        if (((Boolean) this.f14003a.a(v4.Q3)).booleanValue() && k7.j() && com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "User is connected to a VPN");
        }
        this.f14003a.P().a(c2.T, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f14003a.a(v4.C4)).booleanValue()) {
            r3 r3VarY = this.f14003a.Y();
            p3 p3Var = p3.f15029f;
            r3VarY.a(p3Var, q3.a(strB));
            r3VarY.a(p3Var, q3.a(maxAdFormatA));
        }
        k7.a(this.f14003a, this.f14004b);
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f14003a.a(v4.f16013q5)).booleanValue() && !((Boolean) this.f14003a.a(v4.f15997o5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f14003a.a(v4.f15883a5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f14003a.j0());
            }
            if (this.f14003a.t0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f14003a.t0().b();
            String str = this.f14003a.o0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = listB.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (true) {
                        sb2.append((CharSequence) next);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) ",");
                        next = it.next();
                    }
                }
                String string = sb2.toString();
                map.put("filter_ad_network", string);
                if (!this.f14003a.t0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f14003a.t0().d()) {
                    map.put("force_ad_network", string);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            t5Var = this;
            try {
                a aVar = t5Var.new a(com.applovin.impl.sdk.network.a.a(this.f14003a).c(C3271ic.f36944b).a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f14003a.a(o3.f14963o8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f14003a.a(o3.f14952j7)).intValue()).a(((Integer) this.f14003a.a(v4.U2)).intValue()).b(((Long) this.f14003a.a(o3.f14950i7)).intValue()).a(s4.a.a(((Integer) this.f14003a.a(v4.f15933g5)).intValue())).f(true).a(), this.f14003a, strB, maxAdFormatA);
                aVar.c(o3.f14947g7);
                aVar.b(o3.f14948h7);
                t5Var.f14003a.r0().a(aVar);
            } catch (Throwable th2) {
                th = th2;
                if (com.applovin.impl.sdk.o.a()) {
                    t5Var.f14005c.a(t5Var.f14004b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
                }
                a("", 0, th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            t5Var = this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f15744m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f15745n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.f15744m = str;
            this.f15745n = maxAdFormat;
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200) {
                t5.this.a(str, i10, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f14206l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f14206l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f15744m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f15745n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f14206l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f14206l.b()), map);
            this.f14003a.P().d(c2.U, map);
            t5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            t5.this.a(str, i10, str2);
            this.f14003a.E().a("fetchMediatedAd", str, i10, str2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f15740g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strB);
        jSONObject2.put("ad_format", this.f15740g.a().getLabel());
        Map map = CollectionUtils.map(this.f15740g.d());
        com.applovin.impl.sdk.p pVarA0 = this.f14003a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(strB), map);
        p.a aVarC = pVarA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f14003a.o0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f14003a.R() != null) {
                Queue<v2> queueC = this.f14003a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (v2 v2Var : queueC) {
                    arrayList.add(v2Var.c());
                    arrayList2.add(v2Var.getNetworkName());
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", sb2.toString(), map);
                StringBuilder sb3 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb3.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_network_names", sb3.toString(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Y1.f35725e, new JSONArray(this.f14003a.T().a()));
            jSONObject2.put("installed", t3.b(this.f14003a));
            jSONObject2.put("initialized", this.f14003a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f14003a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f14003a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f14003a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private void a(JSONObject jSONObject) {
        d6 d6Var = new d6(this.f15740g, jSONObject, this.f15742i, this.f14003a, this.f15743j);
        long j10 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j10 > 0) {
            this.f14003a.r0().a(d6Var, b6.b.MEDIATION, j10, true);
        } else {
            this.f14003a.r0().a(d6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.f15740g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i10);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f15740g.a().getLabel(), map);
        this.f14003a.P().d(c2.V, map);
        q2.a(this.f15743j, strB, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f15741h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f14003a.o0().getExtraParameters()));
    }
}
