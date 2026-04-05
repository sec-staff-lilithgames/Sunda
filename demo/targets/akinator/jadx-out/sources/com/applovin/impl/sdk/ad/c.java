package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.c4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.u;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import j1.o2;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends AppLovinAdImpl {

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAd f15360d;

    /* renamed from: e, reason: collision with root package name */
    private final u f15361e;

    public c(u uVar, k kVar) {
        super(new JSONObject(), new JSONObject(), kVar);
        this.f15361e = uVar;
    }

    private AppLovinAd d() {
        return (AppLovinAd) this.sdk.i().f(this.f15361e);
    }

    private String e() {
        u adZone = getAdZone();
        if (adZone == null || adZone.i()) {
            return null;
        }
        return adZone.e();
    }

    public void a(AppLovinAd appLovinAd) {
        this.f15360d = appLovinAd;
    }

    public AppLovinAd c() {
        AppLovinAd appLovinAd = this.f15360d;
        return appLovinAd != null ? appLovinAd : d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        AppLovinAd appLovinAdC = c();
        return appLovinAdC != null ? appLovinAdC.equals(obj) : super.equals(obj);
    }

    public AppLovinAd f() {
        return this.f15360d;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public c4 getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public u getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) c();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f15361e;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        return new Bundle();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String getMediationServeId() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getMediationServeId();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd appLovinAdC = c();
        if (appLovinAdC instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) appLovinAdC).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().f();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().g();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f15361e.i()) {
            return null;
        }
        return this.f15361e.e();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd appLovinAdC = c();
        return appLovinAdC != null ? appLovinAdC.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) c();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isVideoAd() {
        AppLovinAd appLovinAdC = c();
        return (appLovinAdC instanceof AppLovinAdImpl) && ((AppLovinAdImpl) appLovinAdC).isVideoAd();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinAd{ #");
        sb2.append(getAdIdNumber());
        sb2.append(", adType=");
        sb2.append(getType());
        sb2.append(", adSize=");
        sb2.append(getSize());
        sb2.append(", zoneId='");
        return o2.o(sb2, e(), "'}");
    }
}
