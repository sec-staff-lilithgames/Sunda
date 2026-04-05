package com.applovin.impl.sdk.nativeAd;

import af.n;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b6;
import com.applovin.impl.f6;
import com.applovin.impl.g5;
import com.applovin.impl.k7;
import com.applovin.impl.l7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class b extends g5 implements a.InterfaceC0041a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f15558g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f15559h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f15560i;

    /* renamed from: j, reason: collision with root package name */
    private String f15561j;

    /* renamed from: k, reason: collision with root package name */
    private String f15562k;

    /* renamed from: l, reason: collision with root package name */
    private String f15563l;

    /* renamed from: m, reason: collision with root package name */
    private Double f15564m;

    /* renamed from: n, reason: collision with root package name */
    private String f15565n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f15566o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f15567p;

    /* renamed from: q, reason: collision with root package name */
    private l7 f15568q;

    /* renamed from: r, reason: collision with root package name */
    private Uri f15569r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f15570s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f15571t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f15572u;

    /* renamed from: v, reason: collision with root package name */
    private final List f15573v;

    /* renamed from: w, reason: collision with root package name */
    private final List f15574w;

    /* renamed from: x, reason: collision with root package name */
    private final List f15575x;

    /* renamed from: y, reason: collision with root package name */
    private final List f15576y;

    /* renamed from: z, reason: collision with root package name */
    private final List f15577z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f15561j = "";
        this.f15562k = "";
        this.f15563l = "";
        this.f15564m = null;
        this.f15565n = "";
        this.f15566o = null;
        this.f15567p = null;
        this.f15569r = null;
        this.f15570s = null;
        this.f15571t = null;
        this.f15572u = null;
        this.f15573v = new ArrayList();
        this.f15574w = new ArrayList();
        this.f15575x = new ArrayList();
        this.f15576y = new ArrayList();
        this.f15577z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f15558g = jSONObject;
        this.f15559h = jSONObject2;
        this.f15560i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f15571t = Uri.parse(string);
            if (o.a()) {
                this.f14005c.a(this.f14004b, "Processed click destination URL: " + this.f15571t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f15572u = Uri.parse(string2);
            if (o.a()) {
                this.f14005c.a(this.f14004b, "Processed click destination backup URL: " + this.f15572u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f15558g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f14003a.a(v4.M2)).booleanValue()) {
                try {
                    this.f15573v.addAll(JsonUtils.toList(jSONArray));
                    if (o.a()) {
                        this.f14005c.a(this.f14004b, "Processed click tracking URLs: " + this.f15573v);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (o.a()) {
                        this.f14005c.a(this.f14004b, "Failed to render click tracking URLs", th2);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f15575x.add(new e.a(this.f14003a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (o.a()) {
                this.f14005c.a(this.f14004b, "Processed click tracking requests: " + this.f15575x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (o.a()) {
                this.f14005c.a(this.f14004b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f15560i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f14005c.a(this.f14004b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.f14003a.E().a(this.f14004b, "prepareNativeComponents", th2);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new n(21, this, appLovinNativeAdImpl));
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f15558g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f14003a.a(v4.L2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (o.a()) {
            this.f14005c.a(this.f14004b, "VAST ad rendered successfully");
        }
        this.f15568q = (l7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (o.a()) {
            this.f14005c.b(this.f14004b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f15558g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f15569r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f15558g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f15570s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f15558g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (o.a()) {
                this.f14005c.b(this.f14004b, "No oRtb response provided: " + this.f15558g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (o.a()) {
            e2.y("Rendering native ad for oRTB version: ", string3, this.f14005c, this.f14004b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (o.a()) {
                this.f14005c.b(this.f14004b, "Unable to retrieve assets - failing ad load: " + this.f15558g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.f15561j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", null);
                if (o.a()) {
                    e2.B(new StringBuilder("Processed title: "), this.f15561j, this.f14005c, this.f14004b);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has("img")) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", null);
                if (i12 == 1 || 3 == i11) {
                    this.f15566o = Uri.parse(string4);
                    if (o.a()) {
                        this.f14005c.a(this.f14004b, "Processed icon URL: " + this.f15566o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f15567p = Uri.parse(string4);
                    if (o.a()) {
                        this.f14005c.a(this.f14004b, "Processed main image URL: " + this.f15567p);
                    }
                } else {
                    if (o.a()) {
                        this.f14005c.k(this.f14004b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (o.a()) {
                            this.f14005c.k(this.f14004b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (o.a()) {
                            this.f14005c.a(this.f14004b, o2.i(i13, i14, "Inferring main image from ", "x", APSSharedUtil.TRUNCATE_SEPARATOR));
                        }
                        this.f15567p = Uri.parse(string4);
                    } else {
                        if (o.a()) {
                            this.f14005c.a(this.f14004b, o2.i(i13, i14, "Inferring icon image from ", "x", APSSharedUtil.TRUNCATE_SEPARATOR));
                        }
                        this.f15566o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (o.a()) {
                        this.f14005c.a(this.f14004b, "Processed VAST video");
                    }
                } else if (o.a()) {
                    this.f14005c.k(this.f14004b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i16 == 1 || i15 == 8) {
                    this.f15562k = string6;
                    if (o.a()) {
                        e2.B(new StringBuilder("Processed advertiser: "), this.f15562k, this.f14005c, this.f14004b);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f15563l = string6;
                    if (o.a()) {
                        e2.B(new StringBuilder("Processed body: "), this.f15563l, this.f14005c, this.f14004b);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f15565n = string6;
                    if (o.a()) {
                        e2.B(new StringBuilder("Processed cta: "), this.f15565n, this.f14005c, this.f14004b);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = k7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f15564m = Double.valueOf(dA);
                        if (o.a()) {
                            this.f14005c.a(this.f14004b, "Processed star rating: " + this.f15564m);
                        }
                    } else if (o.a()) {
                        e2.y("Received invalid star rating: ", string6, this.f14005c, this.f14004b);
                    }
                } else if (o.a()) {
                    this.f14005c.k(this.f14004b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (o.a()) {
                this.f14005c.b(this.f14004b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f15574w.add(string7);
            if (o.a()) {
                e2.y("Processed jstracker: ", string7, this.f14005c, this.f14004b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i17 = 0; i17 < jSONArray2.length(); i17++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f15576y.add(new e.a(this.f14003a).b(str2).b(false).a(false).h(f()).a());
                        if (o.a()) {
                            this.f14005c.a(this.f14004b, "Processed imptracker URL: ".concat(str2));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, OIPXcgrVyyxoLF.qcz, null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r32);
                int i19 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r32);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f15574w.add(string8);
                        } else {
                            e eVarB = new e.a(this.f14003a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f15576y.add(eVarB);
                                if (o.a()) {
                                    e2.y("Processed impression URL: ", string8, this.f14005c, this.f14004b);
                                }
                            } else if (i19 == 2) {
                                this.f15577z.add(eVarB);
                                if (o.a()) {
                                    e2.y("Processed viewable MRC50 URL: ", string8, this.f14005c, this.f14004b);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarB);
                                if (o.a()) {
                                    e2.y("Processed viewable MRC100 URL: ", string8, this.f14005c, this.f14004b);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarB);
                                if (o.a()) {
                                    e2.y("Processed viewable video 50 URL: ", string8, this.f14005c, this.f14004b);
                                }
                            } else if (i19 == 555) {
                                if (o.a()) {
                                    e2.y("Ignoring processing of OMID URL: ", string8, this.f14005c, this.f14004b);
                                }
                            } else if (o.a()) {
                                this.f14005c.b(this.f14004b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (o.a()) {
                        this.f14005c.b(this.f14004b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r32 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Processing VAST video...");
        }
        this.f14003a.r0().a(f6.a(str, JsonUtils.shallowCopy(this.f15558g), JsonUtils.shallowCopy(this.f15559h), this, this.f14003a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f15558g), JsonUtils.shallowCopy(this.f15559h), this.f14003a).setTitle(this.f15561j).setAdvertiser(this.f15562k).setBody(this.f15563l).setCallToAction(this.f15565n).setStarRating(this.f15564m).setIconUri(this.f15566o).setMainImageUri(this.f15567p).setPrivacyIconUri(this.f15569r).setVastAd(this.f15568q).setPrivacyDestinationUri(this.f15570s).setClickDestinationUri(this.f15571t).setClickDestinationBackupUri(this.f15572u).setClickTrackingUrls(this.f15573v).setJsTrackers(this.f15574w).setClickTrackingRequests(this.f15575x).setImpressionRequests(this.f15576y).setViewableMRC50Requests(this.f15577z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f14003a.r0().a((g5) new a(appLovinNativeAdImplBuild, this.f14003a, this), b6.b.CORE);
    }

    private void b(String str) {
        this.f15560i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0041a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
