package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.amazon.device.ads.DTBMetricReport;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class e2 {
    public static Map a(AppLovinAdImpl appLovinAdImpl) {
        HashMap map = new HashMap(10);
        if (appLovinAdImpl != null) {
            CollectionUtils.putStringIfValid("ad_domain", appLovinAdImpl.getAdDomain(), map);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinAdImpl.getAdIdNumber()), map);
            MaxAdFormat maxAdFormatD = appLovinAdImpl.getAdZone().d();
            CollectionUtils.putStringIfValid("ad_format", maxAdFormatD != null ? maxAdFormatD.getLabel() : null, map);
            CollectionUtils.putStringIfValid("ad_zone_id", appLovinAdImpl.getAdZone().e(), map);
            CollectionUtils.putStringIfValid("clcode", appLovinAdImpl.getClCode(), map);
            CollectionUtils.putStringIfValid("dsp_id", appLovinAdImpl.getDspId(), map);
            CollectionUtils.putStringIfValid("dsp_name", appLovinAdImpl.getDspName(), map);
            CollectionUtils.putStringIfValid("ad_size", appLovinAdImpl.getSize().getLabel(), map);
            CollectionUtils.putStringIfValid("ad_event_id", appLovinAdImpl.getMediationServeId(), map);
            CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinAdImpl.isOpenMeasurementEnabled()), map);
            if (appLovinAdImpl instanceof com.applovin.impl.sdk.ad.b) {
                CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(((com.applovin.impl.sdk.ad.b) appLovinAdImpl).K0()), map);
            }
        }
        return map;
    }

    public static String b(com.applovin.impl.sdk.ad.b bVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "reshow_count", bVar.b0());
        return jSONObject.toString();
    }

    public static Map a(com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        if (bVar != null) {
            com.applovin.impl.sdk.k sdk = bVar.getSdk();
            if (((Boolean) sdk.a(v4.J)).booleanValue()) {
                HashMap map2 = new HashMap();
                Iterator it = bVar.l().iterator();
                while (it.hasNext()) {
                    String path = ((Uri) it.next()).getPath();
                    map2.put(path, Formatter.formatFileSize(com.applovin.impl.sdk.k.o(), new File(path).length()));
                }
                map.put("path", map2.toString());
            }
            if ((bVar instanceof com.applovin.impl.sdk.ad.a) && ((Boolean) sdk.a(v4.K)).booleanValue()) {
                map.put("details", ((com.applovin.impl.sdk.ad.a) bVar).s1());
            }
        }
        return map;
    }

    public static Map a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        HashMap map = new HashMap(7);
        if (appLovinNativeAdImpl == null) {
            return map;
        }
        CollectionUtils.putStringIfValid("ad_domain", appLovinNativeAdImpl.getAdDomain(), map);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinNativeAdImpl.getAdIdNumber()), map);
        CollectionUtils.putStringIfValid("clcode", appLovinNativeAdImpl.getClCode(), map);
        CollectionUtils.putStringIfValid("dsp_id", appLovinNativeAdImpl.getDspId(), map);
        CollectionUtils.putStringIfValid("dsp_name", appLovinNativeAdImpl.getDspName(), map);
        CollectionUtils.putStringIfValid("ad_size", AppLovinAdSize.NATIVE.toString(), map);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinNativeAdImpl.getMediationServeId(), map);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinNativeAdImpl.isOpenMeasurementEnabled()), map);
        return map;
    }

    public static Map a(v2 v2Var) {
        Map mapA = a((h3) v2Var);
        CollectionUtils.putStringIfValid("bcode", v2Var.C(), mapA);
        CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, v2Var.getCreativeId(), mapA);
        CollectionUtils.putStringIfValid("ad_unit_id", v2Var.getAdUnitId(), mapA);
        CollectionUtils.putStringIfValid("ad_event_id", v2Var.P(), mapA);
        CollectionUtils.putStringIfValid("ad_format", v2Var.getFormat().getLabel(), mapA);
        CollectionUtils.putStringIfValid("dsp_id", v2Var.getDspId(), mapA);
        CollectionUtils.putStringIfValid("dsp_name", v2Var.getDspName(), mapA);
        return mapA;
    }

    public static Map a(h3 h3Var) {
        HashMap map = new HashMap(3);
        CollectionUtils.putStringIfValid("network_name", h3Var.c(), map);
        String strB = h3Var.b();
        CollectionUtils.putStringIfValid("adapter_class", strB, map);
        CollectionUtils.putStringIfValid(DTBMetricReport.ADAPTER_VERSION, t3.a(strB).getAdapterVersion(), map);
        return map;
    }

    public static Map a(MaxError maxError) {
        HashMap map = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), map);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        return map;
    }

    public static String a(String str) {
        return StringUtils.prefixToIndex(1000, str);
    }
}
