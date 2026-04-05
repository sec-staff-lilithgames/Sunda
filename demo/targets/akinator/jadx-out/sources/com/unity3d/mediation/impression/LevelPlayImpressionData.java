package com.unity3d.mediation.impression;

import b3.h;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import java.text.DecimalFormat;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayImpressionData {
    public static final a Companion = new a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f50680a;

    /* renamed from: b, reason: collision with root package name */
    private final DecimalFormat f50681b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(JSONObject allData) {
        e0.checkNotNullParameter(allData, "allData");
        this.f50680a = allData;
        this.f50681b = new DecimalFormat("#.#####");
    }

    public final String getAb() {
        String it = this.f50680a.optString("ab", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdFormat() {
        String it = this.f50680a.optString("adFormat", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.f50680a;
    }

    public final String getAuctionId() {
        String it = this.f50680a.optString("auctionId", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCountry() {
        String it = this.f50680a.optString("country", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCreativeId() {
        String it = this.f50680a.optString("creativeId", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String it = this.f50680a.optString("encryptedCPM", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceId() {
        String it = this.f50680a.optString("instanceId", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceName() {
        String it = this.f50680a.optString("instanceName", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String it = this.f50680a.optString("mediationAdUnitId", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String it = this.f50680a.optString("mediationAdUnitName", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPlacement() {
        String it = this.f50680a.optString("placement", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPrecision() {
        String it = this.f50680a.optString("precision", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final Double getRevenue() {
        double dOptDouble = this.f50680a.optDouble("revenue");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return dValueOf;
    }

    public final String getSegmentName() {
        String it = this.f50680a.optString("segmentName", "");
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            str = levelPlayImpressionData.f50681b.format(levelPlayImpressionData.getRevenue());
        }
        String precision = levelPlayImpressionData.getPrecision();
        String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
        String creativeId = levelPlayImpressionData.getCreativeId();
        StringBuilder sbB = h.b("auctionId: '", auctionId, "', mediationAdUnitName: '", mediationAdUnitName, "', mediationAdUnitId: '");
        com.google.android.gms.internal.play_billing.a.B(sbB, mediationAdUnitId, "', adFormat: '", adFormat, "', country: '");
        com.google.android.gms.internal.play_billing.a.B(sbB, country, "', ab: '", ab2, "', segmentName: '");
        com.google.android.gms.internal.play_billing.a.B(sbB, segmentName, "', placement: '", placement, "', adNetwork: '");
        com.google.android.gms.internal.play_billing.a.B(sbB, adNetwork, "', instanceName: '", instanceName, "', instanceId: '");
        com.google.android.gms.internal.play_billing.a.B(sbB, instanceId, "', revenue: ", str, ", precision: '");
        com.google.android.gms.internal.play_billing.a.B(sbB, precision, "', encryptedCPM: '", encryptedCPM, "', creativeId: '");
        return o2.o(sbB, creativeId, "'");
    }

    public final String getAdNetwork() {
        String it = this.f50680a.optString("adNetwork", QGjYBESwAiCc.wGnUClJO);
        e0.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }
}
