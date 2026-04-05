package com.bytedance.sdk.openadsdk.jpo;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.sq.cm;
import com.bytedance.sdk.openadsdk.sq.wqx;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static boolean jpo(PAGLoadListener pAGLoadListener) {
        if (zz.jpo()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void jpo(final xyk xykVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpo.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                if (!oya.my()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.core.zz.jd().m482if()) {
                    wqx.jpo(new cm() { // from class: com.bytedance.sdk.openadsdk.jpo.jpo.1.1
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h(Constants.LOAD_AD);
                            jpoVarH.wqx(adSlot.getCodeId());
                            jpoVarH.cm(tic.wqx(adSlot.getDurationSlotType()));
                            jpoVarH.jpo(BuildConfig.VERSION_NAME);
                            jpoVarH.qk(tic.jpo(adSlot).toString());
                            return jpoVarH;
                        }
                    });
                    duq.cm(xykVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, com.bytedance.sdk.openadsdk.core.xyk.jpo(10004));
                    }
                }
            }
        };
        if (oya.my()) {
            runnable.run();
        } else {
            oya.jd().post(runnable);
        }
    }

    public static void jpo(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!oya.my() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS) && extraInfo.get(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS) != null) {
            builder.setExt(extraInfo.get(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS).toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean jpo(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
