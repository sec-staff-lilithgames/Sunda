package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f15767e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f15768f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f15769a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15770b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f15771c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdType f15772d;

    private u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f15771c = appLovinAdSize;
        this.f15772d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z10 ? j1.o2.l(lowerCase, "_bidding") : lowerCase;
        this.f15770b = z11 ? j1.o2.l(lowerCase, "_direct_sold") : lowerCase;
    }

    public static u a(String str) {
        return a(null, null, str);
    }

    public static u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static u m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.f15770b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f15770b.equalsIgnoreCase(((u) obj).f15770b);
    }

    public AppLovinAdSize f() {
        if (this.f15771c == null && JsonUtils.valueExists(this.f15769a, "ad_size")) {
            this.f15771c = AppLovinAdSize.fromString(JsonUtils.getString(this.f15769a, "ad_size", null));
        }
        return this.f15771c;
    }

    public AppLovinAdType g() {
        if (this.f15772d == null && JsonUtils.valueExists(this.f15769a, "ad_type")) {
            this.f15772d = AppLovinAdType.fromString(JsonUtils.getString(this.f15769a, "ad_type", null));
        }
        return this.f15772d;
    }

    public int hashCode() {
        return this.f15770b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f15770b + ", zoneObject=" + this.f15769a + AbstractJsonLexerKt.END_OBJ;
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        u uVar = new u(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f15768f) {
            try {
                String str2 = uVar.f15770b;
                Map map = f15767e;
                if (map.containsKey(str2)) {
                    uVar = (u) map.get(str2);
                } else {
                    map.put(str2, uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f15768f) {
                try {
                    u uVar = (u) f15767e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (uVar != null) {
                        uVar.f15771c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        uVar.f15772d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
