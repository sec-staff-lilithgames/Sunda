package com.applovin.impl;

import com.applovin.impl.z4;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class o3 extends v4 {
    public static final v4 A7;
    public static final v4 B7;
    public static final v4 C7;
    public static final v4 D7;
    public static final v4 E7;
    public static final v4 F7;
    public static final v4 G7;
    public static final v4 H7;
    public static final v4 I7;
    public static final v4 J7;
    public static final v4 K7;
    public static final v4 L7;
    public static final v4 M7;
    public static final v4 N7;
    public static final v4 O7;
    public static final v4 P7;
    public static final v4 Q7;
    public static final v4 R7;
    public static final v4 S7;
    public static final v4 T7;
    public static final v4 U7;
    public static final v4 V7;
    public static final v4 W7;
    public static final v4 X7;
    public static final v4 Y7;
    public static final v4 Z7;

    /* renamed from: a8, reason: collision with root package name */
    public static final v4 f14938a8;

    /* renamed from: b8, reason: collision with root package name */
    public static final v4 f14939b8;

    /* renamed from: c8, reason: collision with root package name */
    public static final v4 f14940c8;

    /* renamed from: d7, reason: collision with root package name */
    public static final v4 f14941d7 = v4.a("afi", "");

    /* renamed from: d8, reason: collision with root package name */
    public static final v4 f14942d8;

    /* renamed from: e7, reason: collision with root package name */
    public static final v4 f14943e7;

    /* renamed from: e8, reason: collision with root package name */
    public static final v4 f14944e8;

    /* renamed from: f7, reason: collision with root package name */
    public static final v4 f14945f7;

    /* renamed from: f8, reason: collision with root package name */
    public static final v4 f14946f8;

    /* renamed from: g7, reason: collision with root package name */
    public static final v4 f14947g7;
    public static final v4 g8;

    /* renamed from: h7, reason: collision with root package name */
    public static final v4 f14948h7;

    /* renamed from: h8, reason: collision with root package name */
    public static final v4 f14949h8;

    /* renamed from: i7, reason: collision with root package name */
    public static final v4 f14950i7;

    /* renamed from: i8, reason: collision with root package name */
    public static final v4 f14951i8;

    /* renamed from: j7, reason: collision with root package name */
    public static final v4 f14952j7;

    /* renamed from: j8, reason: collision with root package name */
    public static final v4 f14953j8;

    /* renamed from: k7, reason: collision with root package name */
    public static final v4 f14954k7;

    /* renamed from: k8, reason: collision with root package name */
    public static final v4 f14955k8;

    /* renamed from: l7, reason: collision with root package name */
    public static final v4 f14956l7;

    /* renamed from: l8, reason: collision with root package name */
    public static final v4 f14957l8;

    /* renamed from: m7, reason: collision with root package name */
    public static final v4 f14958m7;

    /* renamed from: m8, reason: collision with root package name */
    public static final v4 f14959m8;

    /* renamed from: n7, reason: collision with root package name */
    public static final v4 f14960n7;

    /* renamed from: n8, reason: collision with root package name */
    public static final v4 f14961n8;

    /* renamed from: o7, reason: collision with root package name */
    public static final v4 f14962o7;

    /* renamed from: o8, reason: collision with root package name */
    public static final v4 f14963o8;

    /* renamed from: p7, reason: collision with root package name */
    public static final v4 f14964p7;

    /* renamed from: p8, reason: collision with root package name */
    public static final v4 f14965p8;

    /* renamed from: q7, reason: collision with root package name */
    public static final v4 f14966q7;

    /* renamed from: q8, reason: collision with root package name */
    public static final v4 f14967q8;

    /* renamed from: r7, reason: collision with root package name */
    public static final v4 f14968r7;

    /* renamed from: r8, reason: collision with root package name */
    public static final v4 f14969r8;

    /* renamed from: s7, reason: collision with root package name */
    public static final v4 f14970s7;

    /* renamed from: s8, reason: collision with root package name */
    public static final v4 f14971s8;

    /* renamed from: t7, reason: collision with root package name */
    public static final v4 f14972t7;

    /* renamed from: u7, reason: collision with root package name */
    public static final v4 f14973u7;

    /* renamed from: v7, reason: collision with root package name */
    public static final v4 f14974v7;

    /* renamed from: w7, reason: collision with root package name */
    public static final v4 f14975w7;

    /* renamed from: x7, reason: collision with root package name */
    public static final v4 f14976x7;

    /* renamed from: y7, reason: collision with root package name */
    public static final v4 f14977y7;

    /* renamed from: z7, reason: collision with root package name */
    public static final v4 f14978z7;

    static {
        Boolean bool = Boolean.FALSE;
        f14943e7 = v4.a("iafiwaa", bool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f14945f7 = b0.e2.g("afi_ms", 5L, timeUnit);
        f14947g7 = v4.a("mediation_endpoint", "https://ms.applovin.com/");
        f14948h7 = v4.a("mediation_backup_endpoint", "https://ms.applvn.com/");
        f14950i7 = b0.e2.g("fetch_next_ad_retry_delay_ms", 2L, timeUnit);
        f14952j7 = b0.e2.g("fetch_next_ad_timeout_ms", 30L, timeUnit);
        f14954k7 = b0.e2.g("fetch_mediation_debugger_info_timeout_ms", 7L, timeUnit);
        Boolean bool2 = Boolean.TRUE;
        f14956l7 = v4.a("auto_init_mediation_debugger", bool2);
        f14958m7 = v4.a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
        f14960n7 = b0.e2.g("max_signal_provider_latency_ms", 30L, timeUnit);
        f14962o7 = b0.e2.g("default_adapter_timeout_ms", 10L, timeUnit);
        f14964p7 = b0.e2.g("ad_refresh_ms", 30L, timeUnit);
        f14966q7 = b0.e2.g("ad_load_failure_refresh_ms", 30L, timeUnit);
        f14968r7 = v4.a("ad_load_failure_refresh_ignore_error_codes", "204");
        f14970s7 = v4.a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
        f14972t7 = v4.a("refresh_ad_view_timer_responds_to_background", bool2);
        f14973u7 = v4.a("refresh_ad_view_timer_responds_to_store_kit", bool2);
        f14974v7 = v4.a("refresh_ad_view_timer_responds_to_window_visibility_changed", bool);
        f14975w7 = v4.a("avrsponse", bool);
        f14976x7 = v4.a("allow_pause_auto_refresh_immediately", bool);
        f14977y7 = v4.a("ad_view_race_condition_fix_enabled", bool);
        f14978z7 = v4.a("always_destroy_ad_view_on_ui_thread", bool);
        A7 = v4.a("fullscreen_display_delay_ms", 0L);
        B7 = v4.a("susaode", bool);
        C7 = v4.a("ahdm", 500L);
        D7 = v4.a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
        E7 = v4.a("ad_view_refresh_precache_request_enabled", bool2);
        F7 = v4.a("famttl_ms", 0L);
        G7 = v4.a("signal_expiration_ms", -1L);
        H7 = v4.a("signal_cache_level", Integer.valueOf(z4.b.AD_FORMAT.ordinal()));
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        I7 = b0.e2.g("ad_expiration_ms", 4L, timeUnit2);
        J7 = b0.e2.g("native_ad_expiration_ms", 4L, timeUnit2);
        K7 = v4.a("rena", bool2);
        L7 = v4.a("fullscreen_ad_displayed_timeout_ms", -1L);
        M7 = v4.a("freast_ms", -1L);
        N7 = v4.a("ad_hidden_timeout_ms", -1L);
        O7 = v4.a("schedule_ad_hidden_on_ad_dismiss", bool);
        P7 = v4.a("schedule_ad_hidden_on_single_task_app_relaunch", bool);
        Q7 = b0.e2.g("ad_hidden_on_ad_dismiss_callback_delay_ms", 1L, timeUnit);
        R7 = v4.a("proe", bool);
        S7 = v4.a("mute_state", 2);
        T7 = v4.a("saf", "");
        U7 = v4.a("saui", "");
        V7 = v4.a("malm_v2_e", bool);
        W7 = v4.a("mspc", 1);
        X7 = v4.a("mra", -1);
        Y7 = v4.a("mra_af", "INTER,REWARDED,BANNER,LEADER,MREC");
        Z7 = v4.a("fadiafase", bool2);
        f14938a8 = v4.a("fadwvcv", bool2);
        f14939b8 = v4.a("bfarud", bool);
        f14940c8 = v4.a("inacc", Boolean.valueOf(k7.b(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", duhsDlGWdBkekB.eHR, "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
        f14942d8 = v4.a("adiets_sec", Long.valueOf(TimeUnit.MINUTES.toSeconds(1L)));
        f14944e8 = v4.a("faomq", bool);
        f14946f8 = v4.a("rahcnct_sec", -1);
        g8 = v4.a("paslbaf", "{}");
        f14949h8 = v4.a("msbl", "{\"ad\":[\"ttdasi_ms\"]}");
        f14951i8 = v4.a("siarni", bool);
        f14953j8 = v4.a("spims", bool);
        f14955k8 = v4.a("uabta", bool);
        f14957l8 = v4.a("use_initialization_spec_during_init", bool);
        f14959m8 = v4.a("report_cimp_after_ierr", bool);
        f14961n8 = v4.a("fail_collection_for_empty_signal", bool);
        f14963o8 = v4.a("fetch_mediated_ad_gzip", bool2);
        f14965p8 = v4.a("max_postback_gzip", bool2);
        f14967q8 = v4.a("md_endpoint", "https://md.applovin.com/");
        f14969r8 = v4.a("md_backup_endpoint", "https://md.applvn.com/");
        f14971s8 = v4.a("md_v2", bool);
    }
}
