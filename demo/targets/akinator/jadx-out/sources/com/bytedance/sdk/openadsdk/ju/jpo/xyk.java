package com.bytedance.sdk.openadsdk.ju.jpo;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.ef;
import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends com.bytedance.sdk.component.jpo.opi<JSONObject, JSONObject> {
    public static final HashSet<String> jpo = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", C3191e4.h.f36499o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));

    /* renamed from: jd, reason: collision with root package name */
    private final ef f21266jd;

    public xyk(ef efVar) {
        this.f21266jd = efVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo(jpo, new xyk(efVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        ef.jd jdVar = new ef.jd();
        jdVar.jpo = NotificationCompat.CATEGORY_CALL;
        jdVar.wqx = str;
        jdVar.f20342cm = jSONObject;
        return this.f21266jd.jpo(jdVar, 3);
    }
}
