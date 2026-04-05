package com.applovin.impl;

import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3271ic;
import io.ktor.http.ContentDisposition;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    protected final u f15040g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15041h;

    public p5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f15040g = uVar;
        this.f15041h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f15040g.e());
        if (this.f15040g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f15040g.f().getLabel());
        }
        if (this.f15040g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f15040g.g().getLabel());
        }
        return map;
    }

    public abstract g5 a(JSONObject jSONObject);

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Unable to fetch " + this.f15040g + " ad: server returned " + i10);
        }
        this.f14003a.g().a(c2.f13723m, this.f15040g, new AppLovinError(i10, str));
    }

    public void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f14003a);
        r0.b(jSONObject, this.f14003a);
        r0.a(jSONObject, this.f14003a);
        u.a(jSONObject);
        this.f14003a.r0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f15040g.e());
        if (this.f15040g.f() != null) {
            map.put(ContentDisposition.Parameters.Size, this.f15040g.f().getLabel());
        }
        if (this.f15040g.g() != null) {
            map.put("require", this.f15040g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        s4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Fetching next ad of zone: " + this.f15040g);
        }
        if (((Boolean) this.f14003a.a(v4.Q3)).booleanValue() && k7.j() && com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "User is connected to a VPN");
        }
        k7.a(this.f14003a, this.f14004b);
        this.f14003a.g().a(c2.f13719k, this.f15040g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f14003a.k().getAndResetCustomPostBody();
            boolean zBooleanValue = ((Boolean) this.f14003a.a(v4.f15923f3)).booleanValue();
            String str = C3271ic.f36944b;
            if (zBooleanValue) {
                aVarA = s4.a.a(((Integer) this.f14003a.a(v4.f15949i5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f14003a.B().a(h(), false, true));
                HashMap map2 = new HashMap();
                if (!((Boolean) this.f14003a.a(v4.f16029s5)).booleanValue() && !((Boolean) this.f14003a.a(v4.f15997o5)).booleanValue()) {
                    map2.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f14003a.a(v4.f15883a5)).booleanValue()) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f14003a.j0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
                map = map2;
            } else {
                s4.a aVarA2 = s4.a.a(((Integer) this.f14003a.a(v4.f15957j5)).intValue());
                Map mapA = k7.a(this.f14003a.B().a(h(), false, false));
                if (!((Boolean) this.f14003a.a(v4.A6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = C3271ic.f36943a;
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (k7.h(a()) || k7.j(a())) {
                map.putAll(this.f14003a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f15041h)) {
                map.put("sts", this.f15041h);
            }
            a.C0042a c0042aF = com.applovin.impl.sdk.network.a.a(this.f14003a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f14003a.a(v4.U2)).intValue()).c(((Boolean) this.f14003a.a(v4.V2)).booleanValue()).d(((Boolean) this.f14003a.a(v4.W2)).booleanValue()).c(((Integer) this.f14003a.a(v4.T2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0042aF.a(andResetCustomPostBody);
                c0042aF.b(((Boolean) this.f14003a.a(v4.C5)).booleanValue());
            }
            a aVar = new a(c0042aF.a(), this.f14003a);
            aVar.c(v4.f15992o0);
            aVar.b(v4.f16000p0);
            this.f14003a.r0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Unable to fetch ad for zone id: " + this.f15040g, th2);
            }
            a(0, th2.getMessage());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f14206l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f14206l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
                CollectionUtils.putStringIfValid("ad_zone_id", p5.this.f15040g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f14206l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f14206l.b()), map);
                this.f14003a.g().d(c2.f13721l, map);
                p5.this.b(jSONObject);
                return;
            }
            p5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            p5.this.a(i10, str2);
            this.f14003a.E().a("fetchAd", str, i10, str2);
        }
    }
}
