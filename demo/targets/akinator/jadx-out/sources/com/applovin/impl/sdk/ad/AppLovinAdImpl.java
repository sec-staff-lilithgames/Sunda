package com.applovin.impl.sdk.ad;

import com.applovin.impl.f5;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.u;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, s1 {

    /* renamed from: a, reason: collision with root package name */
    private u f15323a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15324b;

    /* renamed from: c, reason: collision with root package name */
    private c f15325c;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(v4.f15887b1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdC;
        if ((obj instanceof c) && (appLovinAdC = ((c) obj).c()) != null) {
            obj = appLovinAdC;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    public u getAdZone() {
        u uVar = this.f15323a;
        if (uVar != null) {
            if (uVar.f() != null && this.f15323a.g() != null) {
                return this.f15323a;
            }
            if (getSize() == null && getType() == null) {
                return this.f15323a;
            }
        }
        u uVarA = u.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f15323a = uVarA;
        return uVarA;
    }

    public c getDummyAd() {
        return this.f15325c;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String string;
        f5 f5Var = this.synchronizedFullResponse;
        if (f5Var != null) {
            return f5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.s1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.O();
        if (!o.a()) {
            return false;
        }
        this.sdk.O().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f15324b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f15325c = cVar;
    }

    @Override // com.applovin.impl.s1
    public void setExpired() {
        this.f15324b = true;
    }

    public void setHasShown(boolean z10) {
        try {
            f5 f5Var = this.synchronizedAdObject;
            if (f5Var != null) {
                f5Var.a("shown", (Object) Boolean.valueOf(z10));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
