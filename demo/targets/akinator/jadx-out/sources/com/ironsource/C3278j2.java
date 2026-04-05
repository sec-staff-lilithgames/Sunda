package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3278j2 {

    /* renamed from: h, reason: collision with root package name */
    public static final b f36968h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f36969a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.demandOnly.a f36970b;

    /* renamed from: c, reason: collision with root package name */
    private final C3352n2 f36971c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f36972d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f36973e;

    /* renamed from: f, reason: collision with root package name */
    private final C3171d2 f36974f;

    /* renamed from: g, reason: collision with root package name */
    private final C3370o2 f36975g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.j2$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f36976a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36977b;

        /* renamed from: c, reason: collision with root package name */
        private final String f36978c;

        /* renamed from: d, reason: collision with root package name */
        private final com.ironsource.mediationsdk.demandOnly.a f36979d;

        /* renamed from: e, reason: collision with root package name */
        private final C3352n2 f36980e;

        /* renamed from: f, reason: collision with root package name */
        private final JSONObject f36981f;

        /* renamed from: g, reason: collision with root package name */
        private final JSONObject f36982g;

        /* renamed from: h, reason: collision with root package name */
        private final C3171d2 f36983h;

        /* renamed from: i, reason: collision with root package name */
        private final C3370o2 f36984i;

        public a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            this.f36976a = auctionData;
            this.f36977b = instanceId;
            JSONObject jSONObjectA = a(auctionData);
            this.f36978c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.f36979d = aVarA;
            this.f36980e = c(jSONObjectA);
            this.f36981f = d(jSONObjectA);
            this.f36982g = b(jSONObjectA);
            this.f36983h = a(aVarA, instanceId);
            this.f36984i = b(aVarA, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C3278j2 a() {
            return new C3278j2(this.f36978c, this.f36979d, this.f36980e, this.f36981f, this.f36982g, this.f36983h, this.f36984i);
        }

        public final JSONObject b() {
            return this.f36976a;
        }

        public final String c() {
            return this.f36977b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C3352n2 c(JSONObject jSONObject) {
            return new C3352n2(jSONObject);
        }

        private final C3370o2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C3352n2 c3352n2A = aVar.a(str);
            if (c3352n2A == null) {
                return null;
            }
            String strK = c3352n2A.k();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strK, "it.serverData");
            return new C3370o2(strK);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f37317d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f37321h);
            if (jSONArrayOptJSONArray != null) {
                qv.m mVarUntil = qv.v.until(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = mVarUntil.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((uu.j1) it).nextInt();
                    C3352n2 c3352n2 = new C3352n2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c3352n2.m()) {
                        c3352n2 = null;
                    }
                    if (c3352n2 != null) {
                        arrayList2.add(c3352n2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0236a(arrayList);
        }

        private final C3171d2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C3352n2 c3352n2A = aVar.a(str);
            if (c3352n2A == null) {
                return null;
            }
            C3171d2 c3171d2 = new C3171d2();
            c3171d2.a(c3352n2A.b());
            c3171d2.c(c3352n2A.h());
            c3171d2.b(c3352n2A.g());
            return c3171d2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.j2$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C3278j2 c3278j2, String str) {
            String strB = c3278j2.b();
            if (strB != null && strB.length() != 0) {
                if (c3278j2.i()) {
                    int i10 = tu.z.f87419c;
                    return tu.z.m7131constructorimpl(tu.a0.createFailure(new C3213f8(C3559z5.f39348a.f())));
                }
                C3352n2 c3352n2A = c3278j2.a(str);
                if (c3352n2A == null) {
                    int i11 = tu.z.f87419c;
                    return tu.z.m7131constructorimpl(tu.a0.createFailure(new C3213f8(C3559z5.f39348a.j())));
                }
                String strK = c3352n2A.k();
                if (strK != null && strK.length() != 0) {
                    return tu.z.m7131constructorimpl(c3278j2);
                }
                int i12 = tu.z.f87419c;
                return tu.z.m7131constructorimpl(tu.a0.createFailure(new C3213f8(C3559z5.f39348a.e())));
            }
            int i13 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new C3213f8(C3559z5.f39348a.i())));
        }
    }

    public C3278j2(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, C3352n2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C3171d2 c3171d2, C3370o2 c3370o2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        kotlin.jvm.internal.e0.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f36969a = str;
        this.f36970b = waterfall;
        this.f36971c = genericNotifications;
        this.f36972d = jSONObject;
        this.f36973e = jSONObject2;
        this.f36974f = c3171d2;
        this.f36975g = c3370o2;
    }

    public final String a() {
        C3370o2 c3370o2 = this.f36975g;
        if (c3370o2 != null) {
            return c3370o2.d();
        }
        return null;
    }

    public final String b() {
        return this.f36969a;
    }

    public final C3171d2 c() {
        return this.f36974f;
    }

    public final JSONObject d() {
        return this.f36973e;
    }

    public final C3352n2 e() {
        return this.f36971c;
    }

    public final JSONObject f() {
        return this.f36972d;
    }

    public final C3370o2 g() {
        return this.f36975g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f36970b;
    }

    public final boolean i() {
        return this.f36970b.isEmpty();
    }

    public final C3352n2 a(String providerName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
        return a(this.f36970b, providerName);
    }

    private final C3352n2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
