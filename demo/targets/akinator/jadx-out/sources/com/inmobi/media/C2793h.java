package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.core.Trackers;
import com.inmobi.ads.core.TrackingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2793h {
    public static final String CLICK_BEACON = "click";
    public static final C2759f Companion = new C2759f();
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    public static final String LOSS_BEACON = "loss_beacon";
    private static final String TAG = "h";
    public static final String WIN_BEACON = "win_beacon";
    private final String adAuctionMeta;
    private JSONObject adContent;
    private final tu.o adMetaInfo$delegate;
    private AdQualityControl adQualityControl;
    private String adType;
    private final boolean allowAutoRedirection;
    private JSONArray assetUrls;
    private final JSONObject contextData;

    @InterfaceC2765f5
    private C2996t0 features;
    private final String impressionId;
    private boolean isPreloadWebView;
    private JSONArray landingPageParams;
    private long mExpiryDurationInMillis;
    private long mInsertionTimestampInMillis;
    private String markupType;
    private final JSONObject metaInfo;
    private String pubContent;

    /* renamed from: sf, reason: collision with root package name */
    private String f32890sf;
    private final JSONArray trackers;
    private final List<TrackingInfo> trackingInfo;
    private final JSONObject transaction;
    private String webVast;

    public C2793h() {
        this.webVast = "";
        this.impressionId = "";
        this.trackingInfo = uu.p0.emptyList();
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = tu.q.lazy(new C2776g(this));
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    public final String A() {
        return this.f32890sf;
    }

    public final Boolean C() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean("enabled"));
        }
        return null;
    }

    public final JSONArray D() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optJSONArray("trackingEvents");
        }
        return null;
    }

    public final JSONObject E() {
        return this.transaction;
    }

    public final String F() {
        return this.webVast;
    }

    public final boolean G() {
        return this.isPreloadWebView;
    }

    public final void a(JSONArray jSONArray) {
        this.assetUrls = jSONArray;
    }

    public final String b() {
        return this.adAuctionMeta;
    }

    public final JSONObject c() {
        return this.adContent;
    }

    public final void d(String str) {
        this.f32890sf = str;
    }

    public final void e(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.webVast = str;
    }

    public final String f() {
        return this.adType;
    }

    public final String h() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return jSONObject.optString("advertisedContent", null);
        }
        return null;
    }

    public final boolean i() {
        return this.allowAutoRedirection;
    }

    public final Long j() {
        try {
            JSONObject jSONObject = this.adContent;
            if (jSONObject == null || !jSONObject.has("asPlcId")) {
                return null;
            }
            return Long.valueOf(jSONObject.getLong("asPlcId"));
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        return null;
    }

    public final JSONArray k() {
        return this.assetUrls;
    }

    public final String l() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optString("baseEventUrl", null);
        }
        return null;
    }

    public final Long m() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Long.valueOf(jSONObject.optLong("bidderId"));
        }
        return null;
    }

    public final int n() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return jSONObject.optInt("casAdTypeId", -1);
        }
        return -1;
    }

    public final String o() {
        JSONObject jSONObject = this.adContent;
        String strOptString = jSONObject != null ? jSONObject.optString("creativeId") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final String p() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            return jSONObject.optString("creativeType", null);
        }
        return null;
    }

    public final C2996t0 q() {
        return this.features;
    }

    public final String s() {
        return this.impressionId;
    }

    public final String t() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("landingPageParams");
            this.landingPageParams = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray != null) {
                Object objOpt = jSONArrayOptJSONArray.opt(0);
                JSONObject jSONObject2 = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                if (jSONObject2 != null) {
                    String strOptString = jSONObject2.optString("openMode", "DEFAULT");
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "optString(...)");
                    return strOptString;
                }
            }
        }
        return "DEFAULT";
    }

    public final String u() {
        return this.markupType;
    }

    public final String w() {
        JSONObject jSONObject = this.adContent;
        String strOptString = jSONObject != null ? jSONObject.optString("telemetryMetadataBlob") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final String x() {
        return this.pubContent;
    }

    public final Set<Rb> y() {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = this.assetUrls;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i10));
                    byte b10 = (byte) jSONObject.getInt("type");
                    String strOptString = jSONObject.optString("url");
                    kotlin.jvm.internal.e0.checkNotNull(strOptString);
                    if (strOptString.length() > 0) {
                        hashSet.add(new Rb(b10, strOptString));
                    }
                }
            }
            return hashSet;
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return hashSet;
        }
    }

    public final Map<String, String> z() throws JSONException {
        try {
            JSONObject jSONObject = this.adContent;
            JSONObject pubContent = jSONObject != null ? jSONObject.getJSONObject("pubContent") : null;
            if (pubContent != null) {
                Companion.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(pubContent, "pubContent");
                if (!pubContent.has("rewards")) {
                    return null;
                }
                HashMap map = new HashMap();
                JSONObject jSONObjectOptJSONObject = pubContent.optJSONObject("rewards");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject.getString(next);
                        kotlin.jvm.internal.e0.checkNotNull(next);
                        kotlin.jvm.internal.e0.checkNotNull(string);
                        map.put(next, string);
                    }
                }
                return map;
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
        return null;
    }

    public final void a(boolean z10) {
        this.isPreloadWebView = z10;
    }

    public final void b(String str) {
        try {
            this.transaction.put(A0.CTX_HASH_KEY, str);
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (JSONException e10) {
            String TAG2 = TAG;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }

    public final List<String> c(String type) {
        JSONArray jSONArrayOptJSONArray;
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        JSONArray jSONArray = this.trackers;
        if (jSONArray != null && jSONArray.length() != 0) {
            LinkedList linkedList = new LinkedList();
            int length = this.trackers.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject = this.trackers.getJSONObject(i10);
                    if (kotlin.jvm.internal.e0.areEqual(type, jSONObject.optString("type")) && (jSONArrayOptJSONArray = jSONObject.optJSONArray("url")) != null) {
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            linkedList.add(jSONArrayOptJSONArray.getString(i11));
                        }
                    }
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (!linkedList.isEmpty()) {
                return linkedList;
            }
        } else if (!this.trackingInfo.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (TrackingInfo trackingInfo : this.trackingInfo) {
                for (Trackers trackers : trackingInfo.getTrackers()) {
                    try {
                        if (kotlin.jvm.internal.e0.areEqual(type, trackers.getType())) {
                            arrayList.addAll(trackers.getUrl());
                            List<String> imExts = trackers.getImExts();
                            ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(imExts, 10));
                            Iterator<T> it = imExts.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(trackingInfo.getImBaseUrl() + ((String) it.next()));
                            }
                            arrayList.addAll(arrayList2);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    public final AdMetaInfo d() {
        return (AdMetaInfo) this.adMetaInfo$delegate.getValue();
    }

    public final AdQualityControl e() {
        return this.adQualityControl;
    }

    public final void f(String pubContent) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(pubContent, "pubContent");
        if (kotlin.jvm.internal.e0.areEqual("inmobiJson", this.markupType)) {
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("pubContent", new JSONObject(pubContent));
            }
        } else {
            JSONObject jSONObject2 = this.adContent;
            if (jSONObject2 != null) {
                jSONObject2.put("pubContent", pubContent);
            }
        }
        this.pubContent = pubContent;
    }

    public final void a(C2996t0 c2996t0) {
        this.features = c2996t0;
    }

    public final void a() throws IllegalStateException {
        if (!kotlin.jvm.internal.e0.areEqual(this.markupType, "unknown")) {
            if (this.impressionId.length() != 0) {
                return;
            }
            String TAG2 = TAG;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            AbstractC2902n7.a((byte) 1, TAG2, "Impression Id is Null");
            throw new IllegalArgumentException("Invalid Ad");
        }
        String TAG3 = TAG;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
        AbstractC2902n7.a((byte) 1, TAG3, "UnKnown MarkUp Type");
        throw new IllegalArgumentException("Invalid Ad");
    }

    public C2793h(C2793h ad2, JSONArray jSONArray) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        this.webVast = "";
        this.impressionId = "";
        this.trackingInfo = uu.p0.emptyList();
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        this.adMetaInfo$delegate = tu.q.lazy(new C2776g(this));
        C3036v6.b(ad2, this);
        this.assetUrls = jSONArray;
    }

    public final void a(JSONObject jSONObject, String str, long j10) {
        this.adContent = jSONObject;
        this.adType = str;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
        this.mExpiryDurationInMillis = j10;
        String str2 = this.f32890sf;
        if (str2 != null) {
            if (!D2.a(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                this.features = new C2996t0(str2);
            }
        }
    }

    public final boolean a(long j10) {
        long jCurrentTimeMillis;
        long j11 = this.mExpiryDurationInMillis;
        if ((j11 == -1 ? -1L : this.mInsertionTimestampInMillis + j11) == -1) {
            jCurrentTimeMillis = (TimeUnit.SECONDS.toMillis(j10) + this.mInsertionTimestampInMillis) - System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = (j11 != -1 ? this.mInsertionTimestampInMillis + j11 : -1L) - System.currentTimeMillis();
        }
        return jCurrentTimeMillis < 0;
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void v() {
    }

    public final void a(String buyerPrice) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buyerPrice, "buyerPrice");
        try {
            this.transaction.put(A0.BUYER_PRICE, Double.parseDouble(buyerPrice));
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String str = this.pubContent;
                kotlin.jvm.internal.e0.checkNotNull(next);
                String string = jSONObject.getString(next);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
                this.pubContent = sv.k0.replace$default(str, next, string, false, 4, (Object) null);
            }
        }
        f(this.pubContent);
    }
}
