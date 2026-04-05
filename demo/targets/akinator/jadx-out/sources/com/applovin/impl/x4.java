package com.applovin.impl;

import com.sfbx.appconsent.core.IABConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class x4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16199a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f16200b;

    /* renamed from: c, reason: collision with root package name */
    public static final x4 f16175c = new x4("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: d, reason: collision with root package name */
    public static final x4 f16176d = new x4("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: e, reason: collision with root package name */
    public static final x4 f16177e = new x4("com.applovin.sdk.launch_count", Long.class);

    /* renamed from: f, reason: collision with root package name */
    public static final x4 f16178f = new x4("com.applovin.sdk.last_launch_timestamp", Long.class);

    /* renamed from: g, reason: collision with root package name */
    public static final x4 f16179g = new x4("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: h, reason: collision with root package name */
    public static final x4 f16180h = new x4("com.applovin.sdk.install_date", Long.class);

    /* renamed from: i, reason: collision with root package name */
    public static final x4 f16181i = new x4("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);

    /* renamed from: j, reason: collision with root package name */
    public static final x4 f16182j = new x4("com.applovin.sdk.user_id", String.class);

    /* renamed from: k, reason: collision with root package name */
    public static final x4 f16183k = new x4("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: l, reason: collision with root package name */
    public static final x4 f16184l = new x4("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: m, reason: collision with root package name */
    public static final x4 f16185m = new x4("com.applovin.sdk.alart", String.class);

    /* renamed from: n, reason: collision with root package name */
    public static final x4 f16186n = new x4("com.applovin.sdk.aleid", String.class);

    /* renamed from: o, reason: collision with root package name */
    public static final x4 f16187o = new x4("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: p, reason: collision with root package name */
    public static final x4 f16188p = new x4("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: q, reason: collision with root package name */
    public static final x4 f16189q = new x4("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: r, reason: collision with root package name */
    public static final x4 f16190r = new x4("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: s, reason: collision with root package name */
    public static final x4 f16191s = new x4("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: t, reason: collision with root package name */
    public static final x4 f16192t = new x4(IABConstants.CMP_SDK_ID, Object.class);

    /* renamed from: u, reason: collision with root package name */
    public static final x4 f16193u = new x4(IABConstants.CMP_SDK_VERSION, Object.class);

    /* renamed from: v, reason: collision with root package name */
    public static final x4 f16194v = new x4("IABTCF_gdprApplies", Object.class);

    /* renamed from: w, reason: collision with root package name */
    public static final x4 f16195w = new x4("IABTCF_TCString", String.class);

    /* renamed from: x, reason: collision with root package name */
    public static final x4 f16196x = new x4(IABConstants.GOOGLE_ADDITIONAL_CONSENT, String.class);

    /* renamed from: y, reason: collision with root package name */
    public static final x4 f16197y = new x4(IABConstants.VENDOR_CONSENTS, String.class);

    /* renamed from: z, reason: collision with root package name */
    public static final x4 f16198z = new x4(IABConstants.VENDOR_LEGITIMATE_INTERESTS, String.class);
    public static final x4 A = new x4(IABConstants.PURPOSE_CONSENTS, String.class);
    public static final x4 B = new x4(IABConstants.PURPOSE_LEGITIMATE_INTERESTS, String.class);
    public static final x4 C = new x4(IABConstants.SPECIAL_FEATURE_OPT_INS, String.class);
    public static final x4 D = new x4("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final x4 E = new x4("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final x4 F = new x4("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final x4 G = new x4("com.applovin.sdk.persisted_data", String.class);
    public static final x4 H = new x4("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final x4 I = new x4("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);
    public static final x4 J = new x4("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);
    public static final x4 K = new x4("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);
    public static final x4 L = new x4("com.applovin.sdk.user_agent", String.class);
    public static final x4 M = new x4("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final x4 N = new x4("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final x4 O = new x4("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final x4 P = new x4("com.applovin.sdk.app_killed_last_ad_data", String.class);
    public static final x4 Q = new x4("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);
    public static final x4 R = new x4("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);
    public static final x4 S = new x4("com.applovin.sdk.template_browser_package_name", String.class);

    public x4(String str, Class cls) {
        this.f16199a = str;
        this.f16200b = cls;
    }

    public String a() {
        return this.f16199a;
    }

    public Class b() {
        return this.f16200b;
    }

    public String toString() {
        return "Key{name='" + this.f16199a + "', type=" + this.f16200b + AbstractJsonLexerKt.END_OBJ;
    }
}
