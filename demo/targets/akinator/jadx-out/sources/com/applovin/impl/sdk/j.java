package com.applovin.impl.sdk;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b6;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.e7;
import com.applovin.impl.g5;
import com.applovin.impl.k7;
import com.applovin.impl.n0;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.ironsource.Me;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final k f15445a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f15446b;

    public j(k kVar) {
        this.f15445a = kVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(k.o());
        this.f15446b = appLovinCommunicator;
        if (((Boolean) kVar.a(v4.f15893b7)).booleanValue()) {
            appLovinCommunicator.a(kVar);
            appLovinCommunicator.subscribe(this, e7.f13942a);
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15445a.j0());
            bundle.putString("applovin_random_token", this.f15445a.i0());
            bundle.putString("compass_random_token", this.f15445a.v());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(k.o()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(t3.b(this.f15445a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f15445a.x0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f15445a.a(v4.f15902c7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f15445a.O();
            if (o.a()) {
                this.f15445a.O().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j10;
        int i10;
        long j11;
        Map<String, Object> map2;
        if (((Boolean) this.f15445a.a(v4.f15893b7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15445a.j0());
                }
                this.f15445a.f0().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map3).a(stringMap2).a(((Boolean) this.f15445a.a(v4.f15883a5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f15445a.k().addCustomQueryParams(k7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f15445a.k().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f15445a.X().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", C3271ic.f36944b);
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f15445a.a(v4.f15939h3)).longValue();
            int i11 = messageData2.getInt("retry_count", ((Integer) this.f15445a.a(v4.f15947i3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f15445a.a(v4.f15955j3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if (C3271ic.f36943a.equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f15445a.B().a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                j10 = millis;
                i10 = i11;
                j11 = millis2;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapE = this.f15445a.B().E();
                    Map mapO = this.f15445a.B().o();
                    j11 = millis2;
                    if (mapO.containsKey("idfv") && mapO.containsKey("idfv_scope")) {
                        i10 = i11;
                        String str = (String) mapO.get("idfv");
                        j10 = millis;
                        Integer num = (Integer) mapO.get("idfv_scope");
                        num.getClass();
                        mapO.remove("idfv");
                        mapO.remove("idfv_scope");
                        mapE.put("idfv", str);
                        mapE.put("idfv_scope", num);
                    } else {
                        j10 = millis;
                        i10 = i11;
                    }
                    mapE.put("server_installed_at", this.f15445a.a(v4.f15991o));
                    mapE.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f15445a.j0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, mapE);
                    map.put(C3191e4.h.G, mapO);
                } else {
                    j10 = millis;
                    i10 = i11;
                    j11 = millis2;
                }
            }
            this.f15445a.r0().a((g5) new n0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f15445a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j10).a(i10).b((int) j11).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f15445a), b6.b.OTHER);
        }
    }

    public void b(v2 v2Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(v2Var);
            bundleA.putString("type", str);
            this.f15445a.O();
            if (o.a()) {
                this.f15445a.O().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(v2 v2Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(v2Var);
            bundleA.putAll(JsonUtils.toBundle(v2Var.O()));
            bundleA.putString("country_code", this.f15445a.w().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(v2 v2Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(v2Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f15445a.a(v4.f15893b7)).booleanValue()) {
            return this.f15445a.c(v4.f15885a7).contains(str) || this.f15446b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString(Me.f34938n, strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f15446b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f15445a.c(v4.f15885a7).contains(str)));
        }
    }

    public boolean a(String str) {
        return e7.f13942a.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.os.Bundle a(com.applovin.impl.v2 r5) {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r5.P()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.c()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.Q()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r5.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.getCreativeId()
            java.lang.String r2 = "creative_id"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.v()
            java.lang.String r2 = "adomain"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.getDspName()
            java.lang.String r2 = "dsp_name"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.c()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L66
            java.lang.String r1 = r5.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            r0.putString(r2, r1)
        L66:
            org.json.JSONObject r1 = r5.x()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle(r1)
            r0.putAll(r1)
            boolean r1 = r5 instanceof com.applovin.impl.e3
            java.lang.String r2 = "ad_view"
            java.lang.String r3 = "N/A"
            if (r1 == 0) goto Lab
            boolean r1 = r5 instanceof com.applovin.impl.y2
            if (r1 == 0) goto L84
            com.applovin.impl.y2 r5 = (com.applovin.impl.y2) r5
            android.view.View r5 = r5.y()
            goto La1
        L84:
            boolean r1 = r5 instanceof com.applovin.impl.a3
            if (r1 == 0) goto La0
            com.applovin.impl.a3 r5 = (com.applovin.impl.a3) r5
            boolean r1 = r5.r0()
            if (r1 != 0) goto La0
            com.applovin.mediation.nativeAds.MaxNativeAdView r1 = r5.m0()
            if (r1 == 0) goto L9b
            com.applovin.mediation.nativeAds.MaxNativeAdView r5 = r5.m0()
            goto La1
        L9b:
            android.view.ViewGroup r5 = r5.n0()
            goto La1
        La0:
            r5 = 0
        La1:
            if (r5 == 0) goto La7
            java.lang.String r3 = com.applovin.impl.b8.a(r5)
        La7:
            r0.putString(r2, r3)
            return r0
        Lab:
            boolean r1 = r5 instanceof com.applovin.impl.z2
            if (r1 == 0) goto Lcf
            com.applovin.impl.z2 r5 = (com.applovin.impl.z2) r5
            android.os.Bundle r5 = r5.k0()
            java.lang.String r1 = "applovin_ad_view_info"
            android.os.Bundle r5 = r5.getBundle(r1)
            java.lang.String r1 = "ad_view_address"
            java.lang.String r1 = com.applovin.impl.sdk.utils.BundleUtils.getString(r1, r3, r5)
            r0.putString(r2, r1)
            java.lang.String r1 = "video_view_address"
            java.lang.String r5 = com.applovin.impl.sdk.utils.BundleUtils.getString(r1, r3, r5)
            java.lang.String r1 = "video_view"
            r0.putString(r1, r5)
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.j.a(com.applovin.impl.v2):android.os.Bundle");
    }
}
