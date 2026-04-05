package com.inmobi.media;

import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A0 {
    public static final String BUYER_PRICE = "buyerPrice";
    public static final String CTX_HASH_KEY = "ctxHash";
    public static final C3098z0 Companion = new C3098z0();
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String KEY_ADS = "ads";
    private static final String KEY_AD_SET_EXPIRY = "expiry";
    private static final String KEY_IMPRESSION_ID = "impressionId";
    private static final String KEY_IM_EXT = "imExts";
    private static final String KEY_MACROS = "macros";
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String KEY_TRACKERS = "trackers";
    private static final String KEY_TRACKING_INFO = "trackingInfo";
    private static final String KEY_URL = "url";
    private static final String MACRO_ADV_PRICE = "${advPrice}";
    public static final String MACRO_CTX_HASH = "${ctxhash}";
    private static final String TAG = "A0";
    private final String adSetAuctionMeta;
    private String adType;
    private final boolean isPod;
    private Boolean isRewarded;
    private boolean logEnabled;
    private JSONObject macros;
    private long placementId;
    private final String adSetId = "";
    private String requestId = "";
    private boolean isAuctionClosed = true;
    private String transactionID = "";
    private final LinkedList<C2793h> ads = new LinkedList<>();

    public final String c() {
        return this.adSetId;
    }

    public final String d() {
        return this.adType;
    }

    public final LinkedList<C2793h> f() {
        return this.ads;
    }

    public final boolean g() {
        return this.logEnabled;
    }

    public final JSONObject h() {
        return this.macros;
    }

    public final C2793h i() {
        try {
            if (!this.ads.isEmpty()) {
                uu.v0.removeFirst(this.ads);
            }
        } catch (Exception unused) {
        }
        return p();
    }

    public final long j() {
        return this.placementId;
    }

    public final String k() {
        return this.requestId;
    }

    public final String l() {
        return this.transactionID;
    }

    public final boolean m() {
        return this.isAuctionClosed;
    }

    public final boolean n() {
        return this.isPod;
    }

    public final Boolean o() {
        return this.isRewarded;
    }

    public final C2793h p() {
        try {
            if (this.ads.isEmpty()) {
                return null;
            }
            return this.ads.getFirst();
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b() {
        return this.adSetAuctionMeta;
    }

    public final void a(Boolean bool) {
        this.isRewarded = bool;
    }

    public final void a(JSONObject responseJson, AdConfig adConfig, F5 f52) throws JSONException {
        C2793h c2793hA;
        kotlin.jvm.internal.e0.checkNotNullParameter(responseJson, "responseJson");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        if (!this.isAuctionClosed) {
            String string = responseJson.getString(KEY_REQUEST_ID);
            JSONArray jSONArray = responseJson.getJSONArray("ads");
            if (kotlin.jvm.internal.e0.areEqual(this.requestId, string)) {
                int length = jSONArray.length();
                if (length != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string2 = jSONObject.getString(KEY_IMPRESSION_ID);
                        this.macros = jSONObject.optJSONObject(KEY_MACROS);
                        kotlin.jvm.internal.e0.checkNotNull(string2);
                        Iterator<T> it = this.ads.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c2793hA = (C2793h) it.next();
                                if (kotlin.jvm.internal.e0.areEqual(string2, c2793hA.s())) {
                                    break;
                                }
                            } else {
                                c2793hA = null;
                                break;
                            }
                        }
                        if (c2793hA != null) {
                            c2793hA.a(this.macros);
                            try {
                                c2793hA = K.a(c2793hA, adConfig, f52);
                            } catch (VastException unused) {
                            }
                            if (c2793hA != null) {
                                JSONObject jSONObject2 = this.macros;
                                if (jSONObject2 != null) {
                                    if (jSONObject2.has(MACRO_ADV_PRICE)) {
                                        String string3 = jSONObject2.getString(MACRO_ADV_PRICE);
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "getString(...)");
                                        c2793hA.a(string3);
                                    }
                                    if (jSONObject2.has(MACRO_CTX_HASH)) {
                                        c2793hA.b(jSONObject2.getString(MACRO_CTX_HASH));
                                    }
                                }
                                linkedList.add(c2793hA);
                            }
                        }
                    }
                    this.ads.clear();
                    this.ads.addAll(linkedList);
                    if (!this.ads.isEmpty()) {
                        this.isAuctionClosed = true;
                        return;
                    }
                    throw new IllegalArgumentException("No matching ads to render");
                }
                throw new IllegalArgumentException("UAS response supplied doesn't have any ads");
            }
            throw new IllegalArgumentException("UAS response supplied was of a different requestId");
        }
        throw new IllegalStateException("Auction was already closed. Can't process UAS response");
    }

    public static /* synthetic */ void e() {
    }

    public final void a(AdConfig adConfig, InterfaceC2994sf interfaceC2994sf, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        C2793h c2793hP = p();
        if (c2793hP != null) {
            C2977rf.a(c2793hP, adConfig, interfaceC2994sf, f52);
        }
    }

    public final void a(C2793h ad2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        try {
            if (p() != null) {
                uu.v0.removeFirst(this.ads);
            }
        } catch (Exception unused) {
        }
        this.ads.add(0, ad2);
    }
}
