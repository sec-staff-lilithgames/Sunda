package com.bytedance.sdk.component.jj.jpo.wqx;

import a.b;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import ao.kwoC.zAQQWzBxnS;
import bp.oM.DwaEpyvxz;
import com.bytedance.sdk.component.jj.jpo.jd.cm;
import com.bytedance.sdk.component.jj.jpo.my;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.android.gms.ads.AdError;
import com.ironsource.Me;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.ui.AdActivity;
import hr.kNq.ikJMrW;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import w0.i;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jpo {
    private static final LinkedList<String> jpo = new LinkedList<>();

    /* renamed from: jd, reason: collision with root package name */
    private static final LinkedList<String> f18736jd = new LinkedList<>();
    private static final LinkedList<String> wqx = new LinkedList<>();

    /* renamed from: cm, reason: collision with root package name */
    private static final LinkedList<String> f18735cm = new LinkedList<>();
    private static final Map<String, Integer> my = new HashMap();

    /* renamed from: jj, reason: collision with root package name */
    private static HashMap<String, Integer> f18737jj = null;

    /* renamed from: qk, reason: collision with root package name */
    private static String f18738qk = "upload_init";
    private static int xyk = 0;
    private static int zz = 0;

    private static synchronized void cm(String str) {
        LinkedList<String> linkedList = f18735cm;
        if (linkedList.size() < 10) {
            linkedList.add(str);
        } else {
            linkedList.removeFirst();
            linkedList.add(str);
        }
    }

    private static synchronized String jd(String str) {
        StringBuilder sb2;
        try {
            LinkedList<String> linkedList = f18736jd;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            sb2 = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    private static synchronized String jj() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder();
            Iterator<String> it = f18735cm.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    public static void jpo() {
        if (f18737jj != null) {
            return;
        }
        String[] strArr = {"first_view", "open_splash", "ad_landing_webview_init", "show_failed_topview", "adstyle_template_show", "splash_init_monitor_first", "download_video_succeed", "shake_skip", "receive", "video_over_auto", "render_time", "splash_ad", "preload_start", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "covered", "download_image_failed", "splash_init_monitor_all", "preload_success_time", "download_video_start_sdk", "download_video_count", "not_showing_reason", "download_image_succeed", "load_video_success", "launch_covered", "download_video_prepare", "download_video_start", "boarding", "ad_wap_stat", "splash_pick", "preload_fail", "should_show", "adstyle_template_fill", CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, "preload_success", "show_failed", "stop_showing_monitor", "download_video_no_download", "track_url", "download_creative_duration", "adstyle_template_render", "download_video_count_splash_sdk", "landing_preload_finish", "adstyle_template_load", "load_ad_duration", ikJMrW.Wgu, "client_false", "download_video_failed", "data_invalid", "topview_boarding", "topview_start_download", "topview_show_confirmed", "splash_start_download", "topview_show_rejected", "splash_no_download", "redownload_video_count", "topview_other_show", "topview_no_download", "ad_selected", "invalid_model", "topview_deliver", "ad_no_selected", "topview_ad_download_retry_label", AdActivity.REQUEST_KEY_EXTRA, Me.f34938n, PtLatqAYjEFT.jEO, "front_performance", "ad_resp", "ad_resp_nodata", "preload_finish", "transit_show", "splash_switch", "block_splash_F2", "render_picture_time", "network_type", "play_start_error", "load_video_error", "render_picture_timeout", "py_loading_success", "download_status", "first_screen_load_finish", "landing_preload_failed", "data_received", "preload_result", "show_result", "reponse", "valid_time", "brand_satefy_context", "topview_ad_link_fail_label", "end_feed_request", "start_feed_request", "set_feed_data", "delayinstall_conflict_with_back_dialog", "clean_fetch_apk_head_failed", "cleanspace_download_after_quite_clean", "fps_too_low", "open_policy", "landing_perf_stats", "preload_topview", "show_effect_start", "dislike_monitor", "hour_show", "hour_skip", "triggered", "click_sound_switch", "enter_loft", "download_resume", "install_view_result", "contiguous_ad_event", "contiguous_ad_remove_event", "report_monitor", "open_landing_blank", "dynamic_ad", "report_load_failed", "ad_download_failed", "download_video_start_first_sdk", "splash_receive", "video_play", "clean_fetch_apk_head_switch_close", "label_external_permission", "pause_reserve_wifi_switch_status", "landing_download_dialog_show", "download_connect", "download_uncompleted", "pause_reserve_wifi_dialog_show", "download_io", "pause_reserve_wifi_confirm", "skvc_load_time", "segment_io", "click_no", "pause_reserve_wifi_cancel_on_wifi", "udp_stop", "mma_url", "error_save_sp", "download_notification_try_show", "ttd_pref_monitor", "item_above_the_fold_stay_time", "ttdownloader_unity", "bdad_query_log", "bdad_load_finish", "bdad_load", "bdad_load_fail", AdError.UNDEFINED_DOMAIN, "valid_stock", "show_filter", "splash_pk_result", "endcard_page_info", "page_on_create", "statistics_feed_docker", "show_search_card_word", "ad_new_video_render_start_label", "ad_new_video_play_start_label", "ad_new_video_ad_patch_data_set_null_label", "ad_new_video_ad_patch_play_label", "ad_new_video_ad_patch_render_label", "debug_touch_start", "try_second_request", "egg_unzip_success", "tap_2", "anti_0_result", "anti_2_result", "egg_unzip_no_start", "preload_no_start", "bind_impression_212202", "guide_auth_dialog_cancel", "show_im_entry", "sub_reco_impression_v2", "sync_request_log_mask", "no_send_sync_request", "load_timeout", "send_sync_request", "sync_request_not_show", "show_subv_tt_video_food", "track", "custom_event", "rd_landing_page_stat", "update_local_data", "showlimit", "upload_result", "debug_othershow", "debug_otherclick", "ad_show_time", "push_launch", "union_send_duplicate", "mnpl_js_finish_load", "mnpl_resource_finish_load", "mnpl_material_render_timeout", "mnpl_render_timing", "mnpl_vedio_interactive_timegap", "click_non_rectify_area", "start_impression", "end_impression", "picture_render_time", "splash_stop_show", "skip_post", "skan_show_start", "skan_show_end", "load_video_start", "rifle_ad_monitor", "download_video_redownload", "splash_video_quality", "splash_video_end", "splash_video_pause", "splash_video_failed", "adtrace_start_clear", "adtrace_clear_past_data", "adtrace_end_clear", "adtrace_write_success", "adtrace_write_failed", "adtrace_read_result", "adtrace_read_success", "adtrace_read_failed", "pick_model", "cache_model", "adtrace_reparse_file", "deeplink_failed_all", "ad_live_degenerate", "ad_live_miss", "live_play_fail", "sko_show_success", "sko_show_fail", "commerce_apps_open", "commerce_apps_jump", "pic_card_show", "live_ad_card_render_finish", "adtrace_select", "received_card_status", "live_ad_page_load_success", "mp_download_result", "download_video_cancel", "jump_count", "adtrace_try_show", "show_cart_entrance", "live_ad_page_load_fail", "click_interacted", "pop_up", "pop_up_cancel", "stream_loadtime", "mnpl_guide_comp_render", "thirdquartile", "customer_feed_pause", "customer_play_start", "customer_feed_break", "click_area_log", "customer_feed_continue", "customer_feed_play", "mnpl_resource_start_preload", "mnpl_resource_finish_preload", "customer_feed_over", "get_preload_ad", "web_inspect_status", "web_report_status", "preload_begin", "preload_end", "open_begin", "open_end", "pangle_live_sdk_monitor", "success", "rifle_load_state", "rifle_uri_load_state", "component_init", "component_release", "ad_lynx_download_sendAdLog", "dynamic2_render", "lynx_card_show", "pop_up_download", "live_shelf_commodity_show", "unity_fe_click", "enter_ads_explain", "adx_ads_switch", "personal_ads_switch", "qc_product_picture_cancel", "qc_product_picture_save", "qc_product_picture_press", "qc_product_detail_show", "qc_price_instruction_click", "qc_edit_sku_num_click", VPCjETNfjxu.HiLuGvkC, "enter_business_qualification_page ", "service_description_page_show", "order_words_fe", "qc_payment_mode_show", "qc_click_ali_pay", "qc_district_addr_click", "qc_auto_information_add", "qc_dial_consult_cancel_btn_click", "qc_dial_consult_show", "qc_maomadeng_click", "qc_maomadeng_show", "slide_product_big_picture", "qc_service_description_close", "appstore_manager_request", "preload_video_result", "preload_video_start", "adtrace_bind", "topview_ad_link_match_event", "skip_leisure_interact_render", "click_start_download", "ad_lynx_landing_page_exception", "lynx_page_res_download_monitor_event", "live_fail", "live_over", "render_live_picture_success", "render_live_picture_fail", "live_play_success", "live_play_close", "item_play_pver", "ad_gap_info", "item_play_over", "has_period_first_chance", "enter_live_auto", "mnpl_material_video_scene_show", "ad_rerank", "in_web_click", "post_request_failed", "destroy", "bidding_load", "bidding_receive", "in_web_scroll", "tobsdk_livesdk_live_show", "xigua_ad_rerank", "applink_unity", "top_ad_show", "top_button_show", "skip_button_show", "skip_click", "shake_show", "skip_result", "show_personal_compliance_button_click", "personal_compliance_click", "ad_click_result", "ad_preload_video", "popup_show", "topview_feed_down", "qr_scan", "qr_show", "topview_popup_show", "topview_feed_over", "topview_feed_show", "feed_down", "engine_ad_send", "permission_click", "policy_click", "download_start_click", "mini_playable_style_report", "load_detect", "aweme_show_info", "click_convert_anchor_detail_page", "click_anchor_gift_button", "show_anchor_gift_page", "click_anchor_gift_card", "show_anchor_gift_card", "anchor_convert_button", "show_anchor_page", "search_result_click", "sdk_session_launch", "not_use_app_link_sdk", "click_ios_check", zAQQWzBxnS.HiRl, "bind_click_area", "page_load", "show_finish", "next_fresh", "play_ready", "splash_pk_time", "unshow", "feed_show_failed", "othershow_cancel", "lu_cache", "realtime_splash_result", "channel_override_result", "internal_jump_live_status", "mnpl_video_play_backward", "splash_enter_foreground", "splash_enter_background", "button_light", "long_press", "webview_material_missing_key_error", "live_life_project_click_card", "mnpl_click_event", "show_anchor_convert_button", "bdar_log_info", "bdar_ad_request", "bdar_lynx_template_load_time", "bdar_lynx_fallback", "bdar_fetch_template_data", "bdar_lynx_render_time", "bdar_video_play_effective", "bdar_video_first_frame", "bdar_lynx_jsb_error", "invalidate_back_url_monitor_event", "lynx_page_plugin_exception_event", "live_custom_interaction", "pinch", "if_splash_card", "splash_card_show", "card_show_fail", "splash_card_click", "splash_card_close", "wind_icon_click", "excluded", "show_error", "toutiao_ad_receive", "show_ad", "toutiao_ad_excluded", "close_card", "lynx_status", "qpon_join", "apk_download_user", "comment_key_word_show", "v3_show_ad", "show_wish_button", "enterSection", "single_comment_show", "enter_product_detail", "xigua_ad_request", "qpon_apply", "splash_total_duration", "splash_render_duration", "download_template_duration", "homepage_hot", "homepage_follow", "homepage_fresh", "video_play_success", "general_search", "video_render_cost", "single_ad_render_cost", "unexpected_accurate_pause", "mnpl_interact_skip", "web_report_request_url", "web_report_init_status", "first_request", "video_ended", "mnpl_script_error", "open_wechat_failed_shake", "open_wechat_shacke", "open_wechat_success_shake", "options_popup", "close_pers_ads_type", DwaEpyvxz.bObCJBUMoES, "ad_guide_panel", "learn_ads", "learn_adx_ads", "learn_pers_ads", "resume_closed_type", "twist", "open_wechat_shake"};
        f18737jj = new HashMap<>(446);
        for (int i10 = 0; i10 < 446; i10++) {
            f18737jj.put(strArr[i10], 1);
        }
    }

    private static String ju(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || !jd()) {
            return null;
        }
        JSONObject jSONObjectQk = jpoVar.qk();
        try {
            return new JSONObject(jpoVar.cm() == 1 ? jSONObjectQk.optString("event_extra") : jSONObjectQk.optString("ad_extra_data")).optString("sdk_session_id");
        } catch (JSONException e10) {
            e10.getMessage();
            return null;
        }
    }

    public static String my(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || wqx()) {
            return null;
        }
        String strOptString = jpoVar.qk().optString("log_extra");
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                return new JSONObject(strOptString).optString("req_id");
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void qk(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) throws JSONException {
        try {
            if (xyk.qk().hna().qk()) {
                cm.f18630cm.jpo(System.currentTimeMillis() - jpoVar.xyk());
                jpoVar.jd(System.currentTimeMillis());
                if (jpoVar.cm() == 0 && xyk.qk().hna() != null && xyk.qk().hna().jpo()) {
                    String strJpo = jpo(jpoVar);
                    if (jpo(strJpo)) {
                        return;
                    }
                    JSONObject jSONObjectQk = jpoVar.qk();
                    String strOptString = jpoVar.qk().optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("save_success_labels", jd(strJpo + "_" + zz(jpoVar)));
                        jSONObjectQk.put("ad_extra_data", jSONObject.toString());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject2.optString("save_success_labels"))) {
                        jSONObject2.put("save_success_labels", jd(strJpo + "_" + zz(jpoVar)));
                    }
                    jSONObjectQk.put("ad_extra_data", jSONObject2.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    private static synchronized String wqx(String str) {
        StringBuilder sb2;
        try {
            LinkedList<String> linkedList = wqx;
            if (linkedList.size() >= 10) {
                linkedList.removeFirst();
                linkedList.add(str);
            } else {
                linkedList.add(str);
            }
            sb2 = new StringBuilder();
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(",");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    public static long xyk(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || !jd()) {
            return 0L;
        }
        try {
            return new JSONObject(jpoVar.qk().optString("ad_extra_data")).optLong("sdk_event_index");
        } catch (Exception e10) {
            e10.getMessage();
            return 0L;
        }
    }

    public static void yd(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        try {
            if (jd()) {
                my myVarHna = xyk.qk().hna();
                if (!TextUtils.isEmpty(jpoVar.wqx())) {
                    jd.jpo(cm.f18630cm.cgn(), 1);
                }
                if (myVarHna == null || !myVarHna.jd()) {
                    return;
                }
                if (jpoVar.cm() == 1) {
                    jd(jpoVar);
                    wqx(jpoVar);
                    jpoVar.wqx();
                    ju(jpoVar);
                    return;
                }
                if (jpoVar.cm() == 0) {
                    if (jpoVar.jd() != 3) {
                        if (zz(jpoVar) != 0) {
                            jpo(jpoVar);
                        } else {
                            jpo(jpoVar);
                        }
                        xyk(jpoVar);
                        jpoVar.wqx();
                        ju(jpoVar);
                        return;
                    }
                    if (jpoVar.qk() != null) {
                        jpoVar.qk().optString(NotificationCompat.CATEGORY_EVENT);
                        xyk(jpoVar);
                        zz(jpoVar);
                        jpoVar.wqx();
                        ju(jpoVar);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public static long zz(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || !jd()) {
            return 0L;
        }
        try {
            return new JSONObject(jpoVar.qk().optString("ad_extra_data")).optLong("sdk_event_valid_index");
        } catch (Exception e10) {
            e10.getMessage();
            return 0L;
        }
    }

    public static void jj(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) throws JSONException {
        try {
            if (jpoVar.cm() == 0 && xyk.qk().hna() != null && xyk.qk().hna().jpo()) {
                JSONObject jSONObjectQk = jpoVar.qk();
                String strJpo = jpo(jpoVar);
                if (jpo(strJpo)) {
                    return;
                }
                my(jpoVar);
                String strOptString = jSONObjectQk.optString("ad_extra_data");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject = new JSONObject(strOptString);
                    if (TextUtils.isEmpty(jSONObject.optString("will_send_labels"))) {
                        jSONObject.put("will_send_labels", wqx(strJpo + "_" + zz(jpoVar)));
                        jSONObject.put("send_success_valid_labels", jj());
                    }
                    jSONObjectQk.put("ad_extra_data", jSONObject.toString());
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("will_send_labels", wqx(strJpo + "_" + zz(jpoVar)));
                jSONObject2.put("send_success_valid_labels", jj());
                jSONObjectQk.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public static synchronized int cm(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar != null) {
            if (jpoVar.qk() != null) {
                if (!jd()) {
                    return 0;
                }
                try {
                    return new JSONObject(jpoVar.qk().optString("ad_extra_data")).optInt("sdk_event_self_count");
                } catch (Exception unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static String jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || wqx()) {
            return null;
        }
        if (jpoVar.jd() == 3) {
            return jpoVar.qk().optString(NotificationCompat.CATEGORY_EVENT);
        }
        return jpoVar.qk().optString("label");
    }

    public static boolean my() {
        return jd() || cm();
    }

    public static String jd(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || wqx()) {
            return null;
        }
        return jpoVar.qk().optString("type");
    }

    public static int wqx(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar == null || jpoVar.qk() == null || !jd()) {
            return -1;
        }
        try {
            return new JSONObject(jpoVar.qk().optString("event_extra")).optInt("stats_index");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public static boolean jpo(String str) {
        HashMap<String, Integer> map = f18737jj;
        if (map == null || str == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public static boolean jd() {
        my myVarHna = xyk.qk().hna();
        return myVarHna != null && myVarHna.jj() == 0;
    }

    public static void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, int i10) {
        try {
            if (xyk.qk().hna().qk()) {
                for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar : list) {
                    if (jpoVar != null && jpoVar.zz() != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - jpoVar.zz();
                        com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar2 = cm.f18630cm;
                        jpoVar2.fy().incrementAndGet();
                        jpoVar2.sbx().getAndAdd(jCurrentTimeMillis);
                        jpoVar.wqx(System.currentTimeMillis());
                    }
                    if (jpoVar != null) {
                        jj(jpoVar);
                    }
                }
                cm.f18630cm.ya().getAndAdd(list.size());
            }
        } catch (Exception unused) {
        }
    }

    public static boolean wqx() {
        my myVarHna = xyk.qk().hna();
        return myVarHna != null && myVarHna.jj() == 2;
    }

    public static boolean cm() {
        my myVarHna = xyk.qk().hna();
        return myVarHna != null && myVarHna.jj() == 1;
    }

    public static void jpo(JSONObject jSONObject, com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo jpoVar) {
        my myVarHna = xyk.qk().hna();
        if (myVarHna != null && myVarHna.jd() && my()) {
            jSONObject.optString("label");
            jpoVar.my();
        }
    }

    public static void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, int i10, String str) {
        my myVarHna = xyk.qk().hna();
        if (myVarHna == null || !myVarHna.jd() || list == null || wqx()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar : list) {
            if (jpoVar.cm() == 0) {
                JSONObject jSONObjectQk = jpoVar.qk();
                String strJpo = jpo(jpoVar);
                if (jpoVar.jd() == 3) {
                    if (jSONObjectQk != null) {
                        strJpo = jSONObjectQk.optString(NotificationCompat.CATEGORY_EVENT);
                    }
                    i.h(sb2, " [v3:", strJpo, "] ");
                } else {
                    long jXyk = xyk(jpoVar);
                    long jZz = zz(jpoVar);
                    int iCm = cm(jpoVar);
                    sb2.append(" [");
                    sb2.append(jXyk);
                    sb2.append("_");
                    sb2.append(strJpo);
                    if (jZz != 0) {
                        sb2.append("_");
                        sb2.append(jZz);
                    }
                    if (iCm == 0) {
                        sb2.append("] ");
                    } else {
                        sb2.append("_");
                        sb2.append(iCm);
                        sb2.append("] ");
                    }
                }
                z10 = true;
            } else if (jpoVar.cm() == 1) {
                String strJd = jd(jpoVar);
                int iWqx = wqx(jpoVar);
                sb2.append(" [");
                sb2.append(iWqx);
                sb2.append("_");
                sb2.append(strJd);
                sb2.append("] ");
            }
        }
        if (z10) {
            jpo(i10);
            list.size();
        } else {
            jpo(i10);
            list.size();
        }
    }

    public static String jpo(int i10) {
        switch (i10) {
            case 1:
                return "flush once";
            case 2:
                return "flush memory db";
            case 3:
                return "flush memory";
            case 4:
                return "new event";
            case 5:
                return "server busy";
            case 6:
                return "empty message";
            case 7:
                return "net error";
            default:
                return BuildConfig.FLAVOR;
        }
    }

    private static void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, String str, my myVar) {
        String strJpo = jpo(jpoVar);
        if (jpo(strJpo)) {
            return;
        }
        String strMy = my(jpoVar);
        if (jpoVar.cm() == 0 && myVar.jpo()) {
            StringBuilder sbT = b.t(strJpo, "_");
            sbT.append(zz(jpoVar));
            sbT.append("_");
            sbT.append(strMy);
            sbT.append("_");
            sbT.append(str);
            cm(sbT.toString());
        }
    }

    public static void jpo(boolean z10, int i10, com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        my myVarHna = xyk.qk().hna();
        if (wqx() || myVarHna == null || !myVarHna.jd()) {
            return;
        }
        jpo(i10);
        TextUtils.isEmpty(jd(jpoVar));
        TextUtils.isEmpty(jpo(jpoVar));
    }

    public static void jpo(int i10, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, long j10) {
        if (xyk.qk().hna().qk()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j10;
            if (i10 == 200) {
                com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar = cm.f18630cm;
                jpoVar.ree().getAndAdd(jCurrentTimeMillis);
                jpoVar.ota().incrementAndGet();
                jpoVar.et().getAndAdd(list.size());
                jpoVar.vrc().getAndAdd(list.size());
                return;
            }
            if (i10 == -1) {
                cm.f18630cm.ii().getAndAdd(list.size());
            } else {
                cm.f18630cm.ic().getAndAdd(list.size());
            }
            com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar2 = cm.f18630cm;
            jpoVar2.voc().getAndAdd(jCurrentTimeMillis);
            jpoVar2.wad().incrementAndGet();
        }
    }

    public static void jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, String str) {
        try {
            my myVarHna = xyk.qk().hna();
            if (myVarHna == null || !myVarHna.qk() || list == null) {
                return;
            }
            for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar : list) {
                if (jpoVar != null) {
                    jpo(jpoVar, str, myVarHna);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
