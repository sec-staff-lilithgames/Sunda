package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C3422r4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class NetworkSettings {

    /* renamed from: r, reason: collision with root package name */
    private static final String f37609r = "customNetwork";

    /* renamed from: s, reason: collision with root package name */
    private static final String f37610s = "customNetworkPackage";

    /* renamed from: t, reason: collision with root package name */
    private static final String f37611t = "customNetworkAdapterName";

    /* renamed from: a, reason: collision with root package name */
    private String f37612a;

    /* renamed from: b, reason: collision with root package name */
    private String f37613b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f37614c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f37615d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f37616e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f37617f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f37618g;

    /* renamed from: h, reason: collision with root package name */
    private String f37619h;

    /* renamed from: i, reason: collision with root package name */
    private String f37620i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37621j;

    /* renamed from: k, reason: collision with root package name */
    private String f37622k;

    /* renamed from: l, reason: collision with root package name */
    private int f37623l;

    /* renamed from: m, reason: collision with root package name */
    private int f37624m;

    /* renamed from: n, reason: collision with root package name */
    private int f37625n;

    /* renamed from: o, reason: collision with root package name */
    private int f37626o;

    /* renamed from: p, reason: collision with root package name */
    private String f37627p;

    /* renamed from: q, reason: collision with root package name */
    private String f37628q;

    public NetworkSettings(String str) {
        this.f37612a = str;
        this.f37622k = str;
        this.f37613b = str;
        this.f37627p = str;
        this.f37628q = str;
        this.f37615d = new JSONObject();
        this.f37616e = new JSONObject();
        this.f37617f = new JSONObject();
        this.f37618g = new JSONObject();
        this.f37614c = new JSONObject();
        this.f37623l = -1;
        this.f37624m = -1;
        this.f37625n = -1;
        this.f37626o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f37620i;
    }

    public JSONObject getApplicationSettings() {
        return this.f37614c;
    }

    public int getBannerPriority() {
        return this.f37625n;
    }

    public JSONObject getBannerSettings() {
        return this.f37617f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f37614c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (aVar == null && (jSONObject5 = this.f37614c) != null) {
            return jSONObject5.optString(f37611t);
        }
        if (aVar.equals(IronSource.a.REWARDED_VIDEO) && (jSONObject4 = this.f37615d) != null) {
            return jSONObject4.optString(f37611t);
        }
        if (aVar.equals(IronSource.a.f37252c) && (jSONObject3 = this.f37616e) != null) {
            return jSONObject3.optString(f37611t);
        }
        if (aVar.equals(IronSource.a.BANNER) && (jSONObject2 = this.f37617f) != null) {
            return jSONObject2.optString(f37611t);
        }
        if (!aVar.equals(IronSource.a.NATIVE_AD) || (jSONObject = this.f37618g) == null) {
            return null;
        }
        return jSONObject.optString(f37611t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f37614c;
        return jSONObject != null ? jSONObject.optString(f37610s, "") : "";
    }

    public int getInstanceType(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.f37252c) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f37624m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f37616e;
    }

    public int getMaxAdsPerSession(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.f37252c) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f37626o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f37618g;
    }

    public String getProviderDefaultInstance() {
        return this.f37627p;
    }

    public String getProviderInstanceName() {
        return this.f37622k;
    }

    public String getProviderName() {
        return this.f37612a;
    }

    public String getProviderNetworkKey() {
        return this.f37628q;
    }

    public String getProviderTypeForReflection() {
        return this.f37613b;
    }

    public int getRewardedVideoPriority() {
        return this.f37623l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f37615d;
    }

    public String getSubProviderId() {
        return this.f37619h;
    }

    public boolean isBidder(IronSource.a aVar) {
        return !isCustomNetwork() && getInstanceType(aVar) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f37621j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f37620i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f37614c = jSONObject;
    }

    public void setBannerPriority(int i10) {
        this.f37625n = i10;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f37617f = jSONObject;
    }

    public void setInterstitialPriority(int i10) {
        this.f37624m = i10;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f37616e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z10) {
        this.f37621j = z10;
    }

    public void setNativeAdPriority(int i10) {
        this.f37626o = i10;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f37618g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f37628q = str;
    }

    public void setRewardedVideoPriority(int i10) {
        this.f37623l = i10;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f37615d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f37619h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f37614c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public void setBannerSettings(String str, Object obj) throws JSONException {
        try {
            this.f37617f.put(str, obj);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setInterstitialSettings(String str, Object obj) throws JSONException {
        try {
            this.f37616e.put(str, obj);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setNativeAdSettings(String str, Object obj) throws JSONException {
        try {
            this.f37618g.put(str, obj);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void setRewardedVideoSettings(String str, Object obj) throws JSONException {
        try {
            this.f37615d.put(str, obj);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f37612a = str;
        this.f37622k = str;
        this.f37613b = str2;
        this.f37627p = str3;
        this.f37628q = str4;
        this.f37615d = jSONObject2;
        this.f37616e = jSONObject3;
        this.f37617f = jSONObject4;
        this.f37618g = jSONObject5;
        this.f37614c = jSONObject;
        this.f37623l = -1;
        this.f37624m = -1;
        this.f37625n = -1;
        this.f37626o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f37612a = networkSettings.getProviderName();
        this.f37622k = networkSettings.getProviderName();
        this.f37613b = networkSettings.getProviderTypeForReflection();
        this.f37615d = networkSettings.getRewardedVideoSettings();
        this.f37616e = networkSettings.getInterstitialSettings();
        this.f37617f = networkSettings.getBannerSettings();
        this.f37618g = networkSettings.getNativeAdSettings();
        this.f37614c = networkSettings.getApplicationSettings();
        this.f37623l = networkSettings.getRewardedVideoPriority();
        this.f37624m = networkSettings.getInterstitialPriority();
        this.f37625n = networkSettings.getBannerPriority();
        this.f37626o = networkSettings.getNativeAdPriority();
        this.f37627p = networkSettings.getProviderDefaultInstance();
        this.f37628q = networkSettings.getProviderNetworkKey();
    }
}
