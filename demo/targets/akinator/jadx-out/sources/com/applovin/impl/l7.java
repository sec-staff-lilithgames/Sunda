package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l7 extends com.applovin.impl.sdk.ad.b implements n4 {

    /* renamed from: n, reason: collision with root package name */
    private final String f14365n;

    /* renamed from: o, reason: collision with root package name */
    private final String f14366o;

    /* renamed from: p, reason: collision with root package name */
    private final u7 f14367p;

    /* renamed from: q, reason: collision with root package name */
    private final long f14368q;

    /* renamed from: r, reason: collision with root package name */
    private final y7 f14369r;

    /* renamed from: s, reason: collision with root package name */
    private final o7 f14370s;

    /* renamed from: t, reason: collision with root package name */
    private final String f14371t;

    /* renamed from: u, reason: collision with root package name */
    private final n7 f14372u;

    /* renamed from: v, reason: collision with root package name */
    private final i4 f14373v;

    /* renamed from: w, reason: collision with root package name */
    private final Set f14374w;

    /* renamed from: x, reason: collision with root package name */
    private final Set f14375x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f14376a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f14377b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.k f14378c;

        /* renamed from: d, reason: collision with root package name */
        private long f14379d;

        /* renamed from: e, reason: collision with root package name */
        private String f14380e;

        /* renamed from: f, reason: collision with root package name */
        private String f14381f;

        /* renamed from: g, reason: collision with root package name */
        private u7 f14382g;

        /* renamed from: h, reason: collision with root package name */
        private y7 f14383h;

        /* renamed from: i, reason: collision with root package name */
        private o7 f14384i;

        /* renamed from: j, reason: collision with root package name */
        private n7 f14385j;

        /* renamed from: k, reason: collision with root package name */
        private Set f14386k;

        /* renamed from: l, reason: collision with root package name */
        private Set f14387l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f14377b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f14380e = str;
            return this;
        }

        public b b(Set set) {
            this.f14386k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f14376a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.f14378c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f14381f = str;
            return this;
        }

        public b a(u7 u7Var) {
            this.f14382g = u7Var;
            return this;
        }

        public b a(y7 y7Var) {
            this.f14383h = y7Var;
            return this;
        }

        public b a(o7 o7Var) {
            this.f14384i = o7Var;
            return this;
        }

        public b a(n7 n7Var) {
            this.f14385j = n7Var;
            return this;
        }

        public b a(Set set) {
            this.f14387l = set;
            return this;
        }

        public b a(long j10) {
            this.f14379d = j10;
            return this;
        }

        public l7 a() {
            return new l7(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set A1() {
        y7 y7Var = this.f14369r;
        return y7Var != null ? y7Var.b() : Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List t(f5 f5Var) {
        return k7.a(f5Var.a("vimp_urls", new JSONObject()), getClCode(), null, w1(), T(), a1(), this.sdk);
    }

    private Set t1() {
        o7 o7Var = this.f14370s;
        return o7Var != null ? o7Var.b() : Collections.EMPTY_SET;
    }

    private String w1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public y7 B1() {
        return this.f14369r;
    }

    public z7 C1() {
        Long lF = r0.f(this.sdk);
        return this.f14369r.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean D1() {
        return x1() != null;
    }

    public boolean E1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void F1() {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean G1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean H1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean I1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean J1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List K() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new q9(this, 0));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, w1(), T(), a1(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean K0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean K1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean N0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && m() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean O0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String S() {
        return this.f14371t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public void d(String str) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7) || !super.equals(obj)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        String str = this.f14365n;
        if (str == null ? l7Var.f14365n != null : !str.equals(l7Var.f14365n)) {
            return false;
        }
        String str2 = this.f14366o;
        if (str2 == null ? l7Var.f14366o != null : !str2.equals(l7Var.f14366o)) {
            return false;
        }
        u7 u7Var = this.f14367p;
        if (u7Var == null ? l7Var.f14367p != null : !u7Var.equals(l7Var.f14367p)) {
            return false;
        }
        y7 y7Var = this.f14369r;
        if (y7Var == null ? l7Var.f14369r != null : !y7Var.equals(l7Var.f14369r)) {
            return false;
        }
        o7 o7Var = this.f14370s;
        if (o7Var == null ? l7Var.f14370s != null : !o7Var.equals(l7Var.f14370s)) {
            return false;
        }
        n7 n7Var = this.f14372u;
        if (n7Var == null ? l7Var.f14372u != null : !n7Var.equals(l7Var.f14372u)) {
            return false;
        }
        Set set = this.f14374w;
        if (set == null ? l7Var.f14374w != null : !set.equals(l7Var.f14374w)) {
            return false;
        }
        Set set2 = this.f14375x;
        Set set3 = l7Var.f14375x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f14368q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        y7 y7Var = this.f14369r;
        return (y7Var == null || (listG = y7Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f14365n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14366o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        u7 u7Var = this.f14367p;
        int iHashCode4 = (iHashCode3 + (u7Var != null ? u7Var.hashCode() : 0)) * 31;
        y7 y7Var = this.f14369r;
        int iHashCode5 = (iHashCode4 + (y7Var != null ? y7Var.hashCode() : 0)) * 31;
        o7 o7Var = this.f14370s;
        int iHashCode6 = (iHashCode5 + (o7Var != null ? o7Var.hashCode() : 0)) * 31;
        n7 n7Var = this.f14372u;
        int iHashCode7 = (iHashCode6 + (n7Var != null ? n7Var.hashCode() : 0)) * 31;
        Set set = this.f14374w;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f14375x;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f14372u != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri m() {
        y7 y7Var = this.f14369r;
        if (y7Var != null) {
            return y7Var.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri m0() {
        return m();
    }

    public o7 s1() {
        return this.f14370s;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f14365n + "', adDescription='" + this.f14366o + "', systemInfo=" + this.f14367p + ", videoCreative=" + this.f14369r + ", companionAd=" + this.f14370s + ", adVerifications=" + this.f14372u + ", impressionTrackers=" + this.f14374w + ", errorTrackers=" + this.f14375x + AbstractJsonLexerKt.END_OBJ;
    }

    public String u1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri v0() {
        z7 z7VarC1 = C1();
        if (z7VarC1 != null) {
            return z7VarC1.e();
        }
        return null;
    }

    public c v1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public r7 x1() {
        y7 y7Var = this.f14369r;
        if (y7Var != null) {
            return y7Var.f();
        }
        return null;
    }

    public long y1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public u7 z1() {
        return this.f14367p;
    }

    private l7(b bVar) {
        super(bVar.f14376a, bVar.f14377b, bVar.f14378c);
        this.f14365n = bVar.f14380e;
        this.f14367p = bVar.f14382g;
        this.f14366o = bVar.f14381f;
        this.f14369r = bVar.f14383h;
        this.f14370s = bVar.f14384i;
        this.f14372u = bVar.f14385j;
        this.f14374w = bVar.f14386k;
        this.f14375x = bVar.f14387l;
        this.f14373v = new i4(this);
        Uri uriV0 = v0();
        if (uriV0 != null) {
            this.f14371t = uriV0.toString();
        } else {
            this.f14371t = "";
        }
        this.f14368q = bVar.f14379d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f14374w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return A1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return t1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return x1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return x1().f();
        }
        if (dVar == d.ERROR) {
            return this.f14375x;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public i4 getAdEventTracker() {
        return this.f14373v;
    }

    public n7 r1() {
        return this.f14372u;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void Q0() {
    }

    private Set a(c cVar, String[] strArr) {
        Map mapD;
        o7 o7Var;
        y7 y7Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (y7Var = this.f14369r) != null) {
                mapD = y7Var.e();
            } else {
                mapD = (cVar != c.COMPANION_AD || (o7Var = this.f14370s) == null) ? null : o7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((Collection) mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.EMPTY_SET;
    }

    public static l7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f14377b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f14376a = jSONObject3;
        bVar.f14378c = kVar;
        bVar.f14379d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f14380e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f14381f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f14382g = u7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar);
        bVar.f14383h = y7.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar);
        bVar.f14384i = o7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar);
        bVar.f14385j = n7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (v7VarA != null) {
                hashSet.add(v7VarA);
            }
        }
        bVar.f14386k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            v7 v7VarA2 = v7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (v7VarA2 != null) {
                hashSet2.add(v7VarA2);
            }
        }
        bVar.f14387l = hashSet2;
        l7 l7Var = new l7(bVar);
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "cached_ad_html_resources_urls");
        for (int i12 = 0; i12 < jSONArrayT.length(); i12++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayT, i12, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    l7Var.a(Uri.parse(str));
                }
            }
        }
        return l7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f14368q);
        JsonUtils.putString(jSONObject, "title", this.f14365n);
        JsonUtils.putString(jSONObject, "ad_description", this.f14366o);
        u7 u7Var = this.f14367p;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", u7Var.a());
        }
        y7 y7Var = this.f14369r;
        if (y7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", y7Var.a());
        }
        o7 o7Var = this.f14370s;
        if (o7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", o7Var.a());
        }
        n7 n7Var = this.f14372u;
        if (n7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", n7Var.a());
        }
        if (this.f14374w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f14374w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f14375x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f14375x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((v7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it3 = l().iterator();
        while (it3.hasNext()) {
            arrayList.add(((Uri) it3.next()).toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        f5 f5Var = this.synchronizedFullResponse;
        if (f5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", f5Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
