package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import ao.kwoC.zAQQWzBxnS;
import com.amazon.device.ads.DtbDeviceRegistration;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.settings.Cif;
import com.bytedance.sdk.openadsdk.core.settings.my;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.sz;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.se;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class yd extends Cif {

    /* renamed from: cm, reason: collision with root package name */
    static final ArrayList<String> f20885cm = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    private Set<String> my;
    public boolean wqx;

    public yd(Cif.jpo jpoVar) {
        super("tt_sdk_settings_sr.prop", jpoVar);
        this.my = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.my
    public void jpo(JSONObject jSONObject) {
        int iOptInt;
        my.jpo jpoVarJpo = jpo();
        JSONObject jSONObjectMy = au.jrx().my();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("digest");
        this.wqx = (jSONObjectOptJSONObject == null || jSONObjectMy == null || !jSONObjectOptJSONObject.toString().equals(jSONObjectMy.toString())) ? false : true;
        if (jSONObjectOptJSONObject != null) {
            jpoVarJpo.jpo("digest", jSONObjectOptJSONObject.toString());
        } else {
            jpoVarJpo.jpo("digest");
        }
        jpoVarJpo.jpo("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long jOptLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            if (jOptLong < 0 || jOptLong > 86400000) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            jpoVarJpo.jpo("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            jpoVarJpo.jpo("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int iOptInt2 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt2 < 0 || iOptInt2 > 100) {
                iOptInt2 = 30;
            }
            jpoVarJpo.jpo("blank_detect_rate", iOptInt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has(IronSourceConstants.EVENTS_DURATION)) {
                jpoVarJpo.jpo(IronSourceConstants.EVENTS_DURATION, jSONObjectOptJSONObject2.optLong(IronSourceConstants.EVENTS_DURATION) * 1000);
            }
            if (jSONObjectOptJSONObject2.has("max")) {
                jpoVarJpo.jpo("max", jSONObjectOptJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            jpoVarJpo.jpo("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("version")) {
                jpoVarJpo.jpo("ab_test_version", jSONObjectOptJSONObject3.optString("version"));
            }
            if (jSONObjectOptJSONObject3.has("param")) {
                jpoVarJpo.jpo("ab_test_param", jSONObjectOptJSONObject3.optString("param"));
            }
        } else {
            au.jrx().qk();
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("global_rate")) {
            jpoVarJpo.jpo("global_rate", (float) jSONObjectOptJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            jpoVarJpo.jpo("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            jpoVarJpo.jpo("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            jpoVarJpo.jpo("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("settings_url")) {
            jpoVarJpo.jpo("settings_url", jSONObject.optString("settings_url"));
        }
        if (jSONObject.has("app_log_url")) {
            jpoVarJpo.jpo("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            jpoVarJpo.jpo("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            jpoVarJpo.jpo("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            jpoVarJpo.jpo("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            jpoVarJpo.jpo("dc", jSONObject.optString("dc"));
        }
        au.jrx().jpo(jSONObject, jpoVarJpo);
        au.jrx().jd(jSONObject, jpoVarJpo);
        if (jSONObject.has("if_both_open")) {
            jpoVarJpo.jpo("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            jpoVarJpo.jpo("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            jpoVarJpo.jpo("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            jpoVarJpo.jpo("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        if (jSONObject.has("target_region")) {
            jpoVarJpo.jpo("target_region", jSONObject.optString("target_region", ""));
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("force_language")) {
                String strOptString = jSONObjectOptJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(strOptString) && f20885cm.contains(strOptString)) {
                    jpoVarJpo.jpo("force_language", strOptString);
                }
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                jpoVarJpo.jpo("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject5.optInt("fetch_tpl_timeout_ctrl", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
            }
            if (jSONObjectOptJSONObject5.has("fetch_tpl_second")) {
                jpoVarJpo.jpo("fetch_tpl_second", jSONObjectOptJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (jSONObjectOptJSONObject5.has("support_gzip")) {
                jpoVarJpo.jpo("support_gzip", jSONObjectOptJSONObject5.optBoolean("support_gzip", false));
            }
            if (jSONObjectOptJSONObject5.has("aes_key")) {
                jpoVarJpo.jpo("aes_key", jSONObjectOptJSONObject5.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject5.has("support_rtl")) {
                jpoVarJpo.jpo("support_rtl", jSONObjectOptJSONObject5.optBoolean("support_rtl", false));
            }
            if (jSONObjectOptJSONObject5.has("ad_revenue_enable")) {
                jpoVarJpo.jpo("ad_revenue_enable", jSONObjectOptJSONObject5.optBoolean("ad_revenue_enable", true));
            }
            if (jSONObjectOptJSONObject5.has("gecko_hosts")) {
                try {
                    this.my.clear();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("gecko_hosts");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            this.my.add(jSONArrayOptJSONArray.getString(i10));
                        }
                    }
                    this.my = jpo(this.my);
                    jpoVarJpo.jpo("gecko_hosts", jSONArrayOptJSONArray.toString());
                } catch (Throwable th2) {
                    nmd.wqx("GeckoLog: settings json error ".concat(String.valueOf(th2)), new Object[0]);
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            jpoVarJpo.jpo("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        wqx.jpo(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject(DtbDeviceRegistration.CONFIG_PRIVACY_KEY);
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("ad_enable")) {
                jpoVarJpo.jpo("privacy_ad_enable", jSONObjectOptJSONObject6.optInt("ad_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("personalized_ad")) {
                jpoVarJpo.jpo("privacy_personalized_ad", jSONObjectOptJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("sladar_enable")) {
                jpoVarJpo.jpo("privacy_sladar_enable", jSONObjectOptJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("app_log_enable")) {
                jpoVarJpo.jpo("privacy_app_log_enable", jSONObjectOptJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("debug_unlock")) {
                jpoVarJpo.jpo("privacy_debug_unlock", jSONObjectOptJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                String strOptString2 = jSONObjectOptJSONObject6.optString(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, "");
                if (TextUtils.isEmpty(strOptString2)) {
                    jpoVarJpo.jpo("privacy_fields_allowed");
                } else {
                    jpoVarJpo.jpo("privacy_fields_allowed", strOptString2);
                }
            }
            if (jSONObjectOptJSONObject6.has("app_reg")) {
                int iOptInt3 = jSONObjectOptJSONObject6.optInt("app_reg", 1);
                if (iOptInt3 == 0 && sz.jpo().cm() == 1) {
                    duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.yd.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(sq.jpo(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                jpoVarJpo.jpo("privacy_app_reg", iOptInt3 != 0);
            }
        }
        if (jSONObject.has("video_cache_config")) {
            jpoVarJpo.jpo("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0 && iOptInt4 != 1) {
                iOptInt4 = 0;
            }
            jpoVarJpo.jpo("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int iOptInt5 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt5 < 0 || iOptInt5 > 3) {
                iOptInt5 = 0;
            }
            jpoVarJpo.jpo("splash_video_load_strategy", iOptInt5);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            jpoVarJpo.jpo("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject7 != null) {
            if (jSONObjectOptJSONObject7.has("bus_con_send_log_type")) {
                jpoVarJpo.jpo("bus_con_send_log_type", jSONObjectOptJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_sec_type")) {
                jpoVarJpo.jpo("bus_con_sec_type", jSONObjectOptJSONObject7.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_dislike_report_raw")) {
                jpoVarJpo.jpo("bus_con_dislike_report_raw", jSONObjectOptJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_adshow_check_enable")) {
                jpoVarJpo.jpo("bus_con_adshow_check_enable", jSONObjectOptJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_tnc_interval")) {
                jpoVarJpo.jpo("bus_con_tnc_interval", jSONObjectOptJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_token_thread_count")) {
                jpoVarJpo.jpo("bus_con_token_thread_count", jSONObjectOptJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_video_keep_screen_on")) {
                jpoVarJpo.jpo("bus_con_video_keep_screen_on", jSONObjectOptJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_auto_click_delay")) {
                jpoVarJpo.jpo("bus_con_auto_click_delay", jSONObjectOptJSONObject7.optInt("bus_con_auto_click_delay", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_express_host")) {
                jpoVarJpo.jpo("bus_con_express_host", jSONObjectOptJSONObject7.optString("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/"));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_check_clz")) {
                jpoVarJpo.jpo("bus_con_check_clz", jSONObjectOptJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_url_check")) {
                jpoVarJpo.jpo("bus_con_url_check", jSONObjectOptJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject7.has("bus_con_behavior_count")) {
                jpoVarJpo.jpo("bus_con_behavior_count", jSONObjectOptJSONObject7.optInt("bus_con_behavior_count", 300));
            }
            String str = au.jpo;
            if (jSONObjectOptJSONObject7.has(str)) {
                jpoVarJpo.jpo(str, jSONObjectOptJSONObject7.optBoolean(str, false));
            }
            String str2 = au.f20839jd;
            if (jSONObjectOptJSONObject7.has(str2)) {
                jpoVarJpo.jpo(str2, jSONObjectOptJSONObject7.optInt(str2, 10000));
            }
            String str3 = au.wqx;
            if (jSONObjectOptJSONObject7.has(str3)) {
                jpoVarJpo.jpo(str3, (float) jSONObjectOptJSONObject7.optDouble(str3, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject8 != null) {
                    if (jSONObjectOptJSONObject8.has("perf_con_stats_rate")) {
                        String strOptString3 = jSONObjectOptJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            jpoVarJpo.jpo("perf_con_stats_rate", strOptString3);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_send")) {
                        String strOptString4 = jSONObjectOptJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            jpoVarJpo.jpo("perf_con_applog_send", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_apm_native")) {
                        jpoVarJpo.jpo("perf_con_apm_native", jSONObjectOptJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache")) {
                        jpoVarJpo.jpo("perf_con_webview_preload_cache", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        jpoVarJpo.jpo("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count")) {
                        jpoVarJpo.jpo("perf_con_webview_cache_count", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        jpoVarJpo.jpo("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                        jpoVarJpo.jpo("perf_con_thread_stack_size", iOptInt);
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_new_thread_pool")) {
                        jpoVarJpo.jpo("perf_con_use_new_thread_pool", jSONObjectOptJSONObject8.optInt(zAQQWzBxnS.FiZfvy, 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_thread_pool_config")) {
                        String strOptString5 = jSONObjectOptJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(strOptString5)) {
                            jpoVarJpo.jpo("perf_con_thread_pool_config", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_is_new_net_thread")) {
                        jpoVarJpo.jpo("perf_con_is_new_net_thread", jSONObjectOptJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_use_prop")) {
                        se.jpo(jSONObjectOptJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_expire_time")) {
                        jpoVarJpo.jpo("perf_con_adlog_expire_time", jSONObjectOptJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        jpoVarJpo.jpo("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        jpoVarJpo.jpo("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_applog_rate")) {
                        jpoVarJpo.jpo("perf_con_applog_rate", jSONObjectOptJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_track_url_strategy")) {
                        jpoVarJpo.jpo("perf_con_track_url_strategy", jSONObjectOptJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drawable_code")) {
                        jpoVarJpo.jpo("perf_con_drawable_code", jSONObjectOptJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        jpoVarJpo.jpo("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        jpoVarJpo.jpo("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4_get_ad")) {
                        jpoVarJpo.jpo("perf_con_crypt_V4_get_ad", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4_applog")) {
                        jpoVarJpo.jpo("perf_con_crypt_V4_applog", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if (jSONObjectOptJSONObject8.has("perf_con_crypt_V4")) {
                        jpoVarJpo.jpo("perf_con_crypt_V4", jSONObjectOptJSONObject8.optBoolean("perf_con_crypt_V4", false));
                    }
                }
            } catch (Throwable th3) {
                nmd.wqx("SettingsDefaultRepository", th3.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e10) {
            nmd.wqx("SettingsDefaultRepository", "coreSettingJson", e10.getMessage());
        }
        jpoVarJpo.jpo("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            jpoVarJpo.jpo("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        if (jSONObject.has("token_enable")) {
            jpoVarJpo.jpo("token_enable", jSONObject.optInt("token_enable"));
        }
        if (jSONObject.has("token_adx_ids")) {
            String strOptString6 = jSONObject.optString("token_adx_ids", "");
            if (TextUtils.isEmpty(strOptString6)) {
                jpoVarJpo.jpo("token_adx_ids");
            } else {
                jpoVarJpo.jpo("token_adx_ids", strOptString6);
            }
        }
        jpoVarJpo.jpo();
        au.jrx().nq();
        cm();
    }

    public static Set<String> jpo(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
