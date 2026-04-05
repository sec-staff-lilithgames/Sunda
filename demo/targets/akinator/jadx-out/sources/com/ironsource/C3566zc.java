package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.zc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3566zc {

    /* renamed from: a, reason: collision with root package name */
    private final String f39365a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39366b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39367c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39368d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39369e;

    /* renamed from: f, reason: collision with root package name */
    private final JSONObject f39370f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, JSONObject> f39371g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39372h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39373i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39374j;

    /* renamed from: k, reason: collision with root package name */
    private C3566zc f39375k;

    /* renamed from: l, reason: collision with root package name */
    private final tu.o f39376l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.zc$a */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.a {
        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C3566zc.this.j();
            String strL = C3566zc.this.l();
            String strH = C3566zc.this.h();
            String strK = C3566zc.this.k();
            JSONObject jSONObjectC = C3566zc.this.c();
            C3566zc c3566zc = C3566zc.this.f39375k;
            JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC, c3566zc != null ? c3566zc.c() : null);
            JSONObject jSONObjectM = C3566zc.this.m();
            C3566zc c3566zc2 = C3566zc.this.f39375k;
            JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, c3566zc2 != null ? c3566zc2.m() : null);
            JSONObject jSONObjectE = C3566zc.this.e();
            C3566zc c3566zc3 = C3566zc.this.f39375k;
            JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, c3566zc3 != null ? c3566zc3.e() : null);
            JSONObject jSONObjectD = C3566zc.this.d();
            C3566zc c3566zc4 = C3566zc.this.f39375k;
            JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, c3566zc4 != null ? c3566zc4.d() : null);
            JSONObject jSONObjectG = C3566zc.this.g();
            C3566zc c3566zc5 = C3566zc.this.f39375k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, c3566zc5 != null ? c3566zc5.g() : null));
            networkSettings.setIsMultipleInstances(C3566zc.this.o());
            networkSettings.setSubProviderId(C3566zc.this.n());
            networkSettings.setAdSourceNameForEvents(C3566zc.this.b());
            return networkSettings;
        }
    }

    public C3566zc(String providerName, JSONObject networkSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkSettings, "networkSettings");
        this.f39365a = providerName;
        this.f39366b = providerName;
        String strOptString = networkSettings.optString(Ac.f33840d, providerName);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f39367c = strOptString;
        String strOptString2 = networkSettings.optString(Ac.f33841e, strOptString);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f39368d = strOptString2;
        Object objOpt = networkSettings.opt(Ac.f33842f);
        this.f39369e = objOpt instanceof String ? (String) objOpt : null;
        this.f39370f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C3518wf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(next, jSONObjectOptJSONObject2);
        }
        this.f39371g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f39372h = strOptString3;
        String strOptString4 = networkSettings.optString(Ac.f33837a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f39373i = strOptString4;
        this.f39374j = networkSettings.optBoolean(Ac.f33839c, false);
        this.f39376l = tu.q.lazy(new a());
    }

    public final String b() {
        return this.f39373i;
    }

    public final JSONObject c() {
        return this.f39370f;
    }

    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f39371g.get("banner"), this.f39370f);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f39371g.get("interstitial"), this.f39370f);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.f39376l.getValue();
    }

    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f39371g.get("nativeAd"), this.f39370f);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    public final String h() {
        return this.f39368d;
    }

    public final String i() {
        return this.f39366b;
    }

    public final String j() {
        return this.f39365a;
    }

    public final String k() {
        return this.f39369e;
    }

    public final String l() {
        return this.f39367c;
    }

    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f39371g.get("rewarded"), this.f39370f);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectB, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectB;
    }

    public final String n() {
        return this.f39372h;
    }

    public final boolean o() {
        return this.f39374j;
    }

    public final Map<String, JSONObject> a() {
        return this.f39371g;
    }

    public final void b(C3566zc c3566zc) {
        this.f39375k = c3566zc;
    }
}
