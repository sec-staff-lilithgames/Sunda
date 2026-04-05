package com.bytedance.sdk.openadsdk.ju.jpo;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.ef;
import com.ironsource.C3191e4;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {

    /* renamed from: jd, reason: collision with root package name */
    private final String f21265jd;
    private final ef jpo;

    public qk(String str, ef efVar) {
        this.jpo = efVar;
        this.f21265jd = str;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo("appInfo", new qk("appInfo", efVar));
        prrVar.jpo("adInfo", new qk("adInfo", efVar));
        prrVar.jpo("sendLog", new qk("sendLog", efVar));
        prrVar.jpo("playable_style", new qk("playable_style", efVar));
        prrVar.jpo("getTemplateInfo", new qk("getTemplateInfo", efVar));
        prrVar.jpo("getTeMaiAds", new qk("getTeMaiAds", efVar));
        prrVar.jpo(C3191e4.h.f36499o, new qk(C3191e4.h.f36499o, efVar));
        prrVar.jpo("getScreenSize", new qk("getScreenSize", efVar));
        prrVar.jpo("getCloseButtonInfo", new qk("getCloseButtonInfo", efVar));
        prrVar.jpo("getVolume", new qk("getVolume", efVar));
        prrVar.jpo("removeLoading", new qk("removeLoading", efVar));
        prrVar.jpo("sendReward", new qk("sendReward", efVar));
        prrVar.jpo("subscribe_app_ad", new qk("subscribe_app_ad", efVar));
        prrVar.jpo("download_app_ad", new qk("download_app_ad", efVar));
        prrVar.jpo("cancel_download_app_ad", new qk("cancel_download_app_ad", efVar));
        prrVar.jpo("unsubscribe_app_ad", new qk("unsubscribe_app_ad", efVar));
        prrVar.jpo("landscape_click", new qk("landscape_click", efVar));
        prrVar.jpo("clickEvent", new qk("clickEvent", efVar));
        prrVar.jpo("renderDidFinish", new qk("renderDidFinish", efVar));
        prrVar.jpo("dynamicTrack", new qk("dynamicTrack", efVar));
        prrVar.jpo("skipVideo", new qk("skipVideo", efVar));
        prrVar.jpo("muteVideo", new qk("muteVideo", efVar));
        prrVar.jpo("changeVideoState", new qk("changeVideoState", efVar));
        prrVar.jpo("getCurrentVideoState", new qk("getCurrentVideoState", efVar));
        prrVar.jpo("send_temai_product_ids", new qk("send_temai_product_ids", efVar));
        prrVar.jpo("getMaterialMeta", new qk("getMaterialMeta", efVar));
        prrVar.jpo("endcard_load", new qk("endcard_load", efVar));
        prrVar.jpo("pauseWebView", new qk("pauseWebView", efVar));
        prrVar.jpo("pauseWebViewTimers", new qk("pauseWebViewTimers", efVar));
        prrVar.jpo("webview_time_track", new qk("webview_time_track", efVar));
        prrVar.jpo("openPrivacy", new qk("openPrivacy", efVar));
        prrVar.jpo("openAdLandPageLinks", new qk("openAdLandPageLinks", efVar));
        prrVar.jpo("getNativeSiteCustomData", new qk("getNativeSiteCustomData", efVar));
        prrVar.jpo("close", new qk("close", efVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        ef.jd jdVar = new ef.jd();
        jdVar.jpo = NotificationCompat.CATEGORY_CALL;
        jdVar.wqx = this.f21265jd;
        jdVar.f20342cm = jSONObject;
        return this.jpo.jpo(jdVar, 3);
    }
}
