package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.Bb;
import com.ironsource.C3422r4;
import com.ironsource.Y8;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdInfo {
    private final Y8 impressionData;
    private final Bb loadArmData;

    public AdInfo(Y8 y82, Bb bb2) {
        this.impressionData = y82;
        this.loadArmData = bb2;
    }

    public final String getAb() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.a() == null) {
            return "";
        }
        String strA = this.impressionData.a();
        e0.checkNotNullExpressionValue(strA, "impressionData.ab");
        return strA;
    }

    public final String getAdNetwork() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.c() == null) {
            return "";
        }
        String strC = this.impressionData.c();
        e0.checkNotNullExpressionValue(strC, "impressionData.adNetwork");
        return strC;
    }

    public final String getAuctionId() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.e() == null) {
            return "";
        }
        String strE = this.impressionData.e();
        e0.checkNotNullExpressionValue(strE, "impressionData.auctionId");
        return strE;
    }

    public final String getCountry() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.f() == null) {
            return "";
        }
        String strF = this.impressionData.f();
        e0.checkNotNullExpressionValue(strF, "impressionData.country");
        return strF;
    }

    public final String getEncryptedCPM() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.h() == null) {
            return "";
        }
        String strH = this.impressionData.h();
        e0.checkNotNullExpressionValue(strH, "impressionData.encryptedCPM");
        return strH;
    }

    public final String getInstanceId() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.i() == null) {
            return "";
        }
        String strI = this.impressionData.i();
        e0.checkNotNullExpressionValue(strI, "impressionData.instanceId");
        return strI;
    }

    public final String getInstanceName() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.j() == null) {
            return "";
        }
        String strJ = this.impressionData.j();
        e0.checkNotNullExpressionValue(strJ, "impressionData.instanceName");
        return strJ;
    }

    public final String getPrecision() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.c();
        }
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.n() == null) {
            return "";
        }
        String strN = this.impressionData.n();
        e0.checkNotNullExpressionValue(strN, "impressionData.precision");
        return strN;
    }

    public final double getRevenue() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.d();
        }
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.o() == null) {
            return 0.0d;
        }
        Double dO = this.impressionData.o();
        e0.checkNotNullExpressionValue(dO, "impressionData.revenue");
        return dO.doubleValue();
    }

    public final String getSegmentName() {
        Y8 y82 = this.impressionData;
        if (y82 == null || y82.p() == null) {
            return "";
        }
        String strP = this.impressionData.p();
        e0.checkNotNullExpressionValue(strP, "impressionData.segmentName");
        return strP;
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        String string = jSONObject.toString();
        e0.checkNotNullExpressionValue(string, "adInfoData.toString()");
        return string;
    }
}
