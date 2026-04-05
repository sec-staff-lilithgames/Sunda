package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.a8;
import com.applovin.impl.adview.e;
import com.applovin.impl.adview.m;
import com.applovin.impl.c4;
import com.applovin.impl.f1;
import com.applovin.impl.f5;
import com.applovin.impl.k7;
import com.applovin.impl.k8;
import com.applovin.impl.l4;
import com.applovin.impl.n4;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import cv.BLca.YsiBvdpw;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class b extends AppLovinAdImpl implements n4 {

    /* renamed from: d, reason: collision with root package name */
    private final List f15330d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f15331e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f15332f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f15333g;

    /* renamed from: h, reason: collision with root package name */
    private final Bundle f15334h;

    /* renamed from: i, reason: collision with root package name */
    private String f15335i;

    /* renamed from: j, reason: collision with root package name */
    private long f15336j;

    /* renamed from: k, reason: collision with root package name */
    private int f15337k;

    /* renamed from: l, reason: collision with root package name */
    private String f15338l;

    /* renamed from: m, reason: collision with root package name */
    private d f15339m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.sdk.ad.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0039b {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum c {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f15348a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15349b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15350c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15351d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15352e;

        private d() {
            this.f15348a = AppLovinSdkUtils.dpToPx(k.o(), b.this.p());
            this.f15349b = AppLovinSdkUtils.dpToPx(k.o(), b.this.r());
            this.f15350c = AppLovinSdkUtils.dpToPx(k.o(), b.this.n());
            this.f15351d = AppLovinSdkUtils.dpToPx(k.o(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(v4.f15937h1)).intValue());
            this.f15352e = AppLovinSdkUtils.dpToPx(k.o(), ((Integer) ((AppLovinAdBase) b.this).sdk.a(v4.f15929g1)).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum e {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f15330d = CollectionUtils.synchronizedList();
        this.f15331e = new AtomicBoolean();
        this.f15332f = new AtomicBoolean();
        this.f15333g = new AtomicReference();
        this.f15334h = new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List i(f5 f5Var) {
        return k7.a(f5Var.a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle k(f5 f5Var) {
        return JsonUtils.toBundle(f5Var.a("ah_parameters", (JSONObject) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map m(f5 f5Var) {
        try {
            return JsonUtils.toStringMap(f5Var.a("http_headers_for_postbacks", new JSONObject()));
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(f5 f5Var) {
        return JsonUtils.getString(f5Var.a("video_button_properties", (JSONObject) null), "video_button_html", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ a8 p(f5 f5Var) {
        return new a8(f5Var.a("video_button_properties", (JSONObject) null), this.sdk);
    }

    private String r0() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public void A0() {
        this.f15337k++;
    }

    public boolean B0() {
        return getBooleanFromAdObject("aocve", (Boolean) this.sdk.a(v4.f15950i6));
    }

    public boolean C0() {
        return this.f15337k > 0;
    }

    public boolean D0() {
        return getBooleanFromAdObject("bvde", (Boolean) this.sdk.a(v4.V5));
    }

    public boolean E0() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(v4.J1));
    }

    public boolean F0() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean G0() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    public boolean H0() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public boolean I0() {
        return getBooleanFromAdObject("gase", Boolean.FALSE);
    }

    public boolean J0() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public abstract boolean K0();

    public AtomicBoolean L0() {
        return this.f15331e;
    }

    public boolean M0() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(v4.W1));
    }

    public boolean N0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public abstract boolean O0();

    public boolean P0() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.valueOf(k7.j(k.o()) || k7.h(k.o()) || ((Boolean) this.sdk.a(v4.f15990n6)).booleanValue()));
    }

    public Uri Q() {
        String stringFromAdObject = getStringFromAdObject("mute_image", "https://assets.applovin.com/sound_off.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public abstract void Q0();

    public List R() {
        String stringFromAdObject = getStringFromAdObject("optional_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    public boolean R0() {
        return getBooleanFromAdObject("aarwdc", (Boolean) this.sdk.a(v4.f16042u2));
    }

    public abstract String S();

    public boolean S0() {
        return getBooleanFromAdObject("always_reward_user", (Boolean) this.sdk.a(v4.f15921f1));
    }

    public Map T() {
        HashMap map = new HashMap();
        try {
            f5 f5Var = this.synchronizedAdObject;
            map.putAll(f5Var != null ? (Map) f5Var.a(new cf.a(9)) : JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e10) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for postbacks", e10);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", Boolean.FALSE)) {
            map.put(Command.HTTP_HEADER_USER_AGENT, k8.a());
        }
        return map;
    }

    public boolean T0() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public EnumC0039b U() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0039b.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return EnumC0039b.DO_NOT_DISMISS;
            }
        }
        return EnumC0039b.UNSPECIFIED;
    }

    public boolean U0() {
        return getBooleanFromAdObject("should_apply_web_view_settings_to_web_view_button", (Boolean) this.sdk.a(v4.f16022r6));
    }

    public int V() {
        return getColorFromAdObject("postitial_progress_bar_color", -922746881);
    }

    public boolean V0() {
        f5 f5Var = this.synchronizedAdObject;
        return f5Var != null ? ((Boolean) f5Var.a(new cf.a(7))).booleanValue() : JsonUtils.getBoolean(getJsonObjectFromAdObject("video_button_properties", null), "should_cache_video_button_html_assets", Boolean.FALSE).booleanValue();
    }

    public long W() {
        return getLongFromAdObject("postitial_progress_bar_total_ms", -1L);
    }

    public boolean W0() {
        return this.f15332f.get();
    }

    public List X() {
        return getStringListFromAdObject("pbpn", this.sdk.c(v4.C6));
    }

    public boolean X0() {
        return h1() || f1() || g1();
    }

    public long Y() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public boolean Y0() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public int Z() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean Z0() {
        return getBooleanFromAdObject("serfaad", (Boolean) this.sdk.a(v4.R0));
    }

    public List a0() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.EMPTY_LIST;
    }

    public boolean a1() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public int b0() {
        return this.f15337k;
    }

    public boolean b1() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public List c0() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        ArrayList arrayList = stringFromAdObject != null ? new ArrayList(CollectionUtils.explode(stringFromAdObject)) : new ArrayList(this.sdk.c(v4.F0));
        if (k7.j(k.o())) {
            arrayList.add("https://p.applov.in/");
        }
        return arrayList;
    }

    public boolean c1() {
        return getBooleanFromAdObject("fmsstwvoar", Boolean.FALSE);
    }

    public List d(MotionEvent motionEvent, boolean z10, boolean z11) {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.EMPTY_LIST);
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        Map mapA = a(motionEvent, z10, z11);
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(StringUtils.replace(it.next(), mapA));
        }
        return arrayList;
    }

    public List d0() {
        return getStringListFromAdObject("rea", a0());
    }

    public boolean d1() {
        return getBooleanFromAdObject("sftbpn", Boolean.FALSE);
    }

    public List e() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 1));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public e.a e0() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? q() : a(intFromAdObject);
    }

    public boolean e1() {
        return getBooleanFromAdObject("fvcetwv", Boolean.FALSE);
    }

    public long f() {
        return getLongFromAdObject("ad_dismiss_delay_on_app_launch_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public List f0() {
        return getStringListFromAdObject("substrings_for_disabled_click_logic", Collections.EMPTY_LIST);
    }

    public boolean f1() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(v4.f16034t2)).contains(NotificationCompat.CATEGORY_NAVIGATION);
    }

    public long g() {
        return getLongFromAdObject("ad_reshow_delay_on_app_launch_ms", -1L);
    }

    public boolean g1() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(v4.f16034t2)).contains("none");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public abstract c4 getAdEventTracker();

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        f5 f5Var = this.synchronizedAdObject;
        return f5Var != null ? (Bundle) f5Var.a(new cf.a(10)) : JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public List getOpenMeasurementVerificationScriptResources() {
        List listA;
        com.applovin.impl.sdk.ad.e eVar = new com.applovin.impl.sdk.ad.e(this, 8);
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new af.g(eVar, 7));
        }
        synchronized (this.adObjectLock) {
            listA = a(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return listA;
    }

    public List getPrivacySandboxImpressionAttributionUrls() {
        List<String> stringListFromAdObject = getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.EMPTY_LIST);
        if (stringListFromAdObject.isEmpty()) {
            return stringListFromAdObject;
        }
        ArrayList arrayList = new ArrayList(stringListFromAdObject.size());
        String clCode = getClCode();
        Iterator<String> it = stringListFromAdObject.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replace("{CLCODE}", clCode));
        }
        return arrayList;
    }

    public Bundle h() {
        return this.f15334h;
    }

    public String h0() {
        return this.f15338l;
    }

    public boolean h1() {
        return getStringListFromAdObject("system_bars_hide_list", this.sdk.c(v4.f16034t2)).contains("status");
    }

    public Uri i0() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "https://assets.applovin.com/sound_on.png");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean i1() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public abstract boolean isOpenMeasurementEnabled();

    public List j() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 6));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public String j0() {
        f5 f5Var = this.synchronizedAdObject;
        return f5Var != null ? (String) f5Var.a(new cf.a(11)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_base_url", "/");
    }

    public boolean j1() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public String k0() {
        f5 f5Var = this.synchronizedAdObject;
        return f5Var != null ? (String) f5Var.a(new cf.a(12)) : JsonUtils.getString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", "");
    }

    public boolean k1() {
        return getBooleanFromAdObject("require_interaction_for_click", Boolean.FALSE);
    }

    public List l() {
        return this.f15330d;
    }

    public a8 l0() {
        f5 f5Var = this.synchronizedAdObject;
        return f5Var != null ? (a8) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 9)) : new a8(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean l1() {
        return getBooleanFromAdObject("sruifwvc", Boolean.FALSE);
    }

    public abstract Uri m();

    public abstract Uri m0();

    public boolean m1() {
        return g() >= 0;
    }

    public int n() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(v4.K1)).intValue());
    }

    public long n0() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public boolean n1() {
        return getBooleanFromAdObject("respect_adview_fully_watched", Boolean.FALSE);
    }

    public long o0() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public boolean o1() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public int p0() {
        return k7.c(getIntFromAdObject("video_completion_percent", -1));
    }

    public boolean p1() {
        return getBooleanFromAdObject("sudbia", (Boolean) this.sdk.a(v4.B6));
    }

    public e.a q() {
        List listO = O();
        int intFromAdObject = getIntFromAdObject("close_style", (listO == null || listO.size() <= 0) ? -1 : ((Integer) listO.get(0)).intValue());
        return intFromAdObject == -1 ? a(hasVideoUrl()) : a(intFromAdObject);
    }

    public List q0() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 10));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("video_end_urls", new JSONObject()), getClCode(), r0(), this.sdk);
        }
        return listA;
    }

    public boolean q1() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public int r() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(v4.M1)).intValue());
    }

    public long s() {
        List listP = P();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listP == null || listP.size() <= 0) ? 0L : ((Integer) listP.get(0)).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public e s0() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? e.TOP : "bottom".equals(stringFromAdObject) ? e.BOTTOM : TtmlNode.LEFT.equals(stringFromAdObject) ? e.LEFT : TtmlNode.RIGHT.equals(stringFromAdObject) ? e.RIGHT : e.RESIZE_ASPECT;
    }

    public int t() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int t0() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public boolean u0() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public abstract Uri v0();

    public int w0() {
        return getIntFromAdObject("whalt", k7.a(getSize()) ? 1 : ((Boolean) this.sdk.a(v4.O5)).booleanValue() ? 0 : -1);
    }

    public m x0() {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (m) f5Var.a(new cf.a(8));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new m(jsonObjectFromAdObject);
        }
        return null;
    }

    public List y0() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public List z0() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    private List O() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List f(f5 f5Var) {
        return k7.a(f5Var.a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List g(f5 f5Var) {
        return k7.a(f5Var.a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f1 h(f5 f5Var) {
        JSONObject jSONObjectA = f5Var.a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new f1(jSONObjectA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(f5 f5Var) {
        return k7.a(f5Var.a("imp_urls", new JSONObject()), getClCode(), null, null, T(), a1(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(f5 f5Var) {
        return JsonUtils.getString(f5Var.a("video_button_properties", (JSONObject) null), "video_button_base_url", "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m r(f5 f5Var) {
        JSONObject jSONObjectA = f5Var.a("web_view_settings", (JSONObject) null);
        if (jSONObjectA != null) {
            return new m(jSONObjectA);
        }
        return null;
    }

    public f1 A() {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (f1) f5Var.a(new cf.a(6));
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new f1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List B() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 2));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List C() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 0));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List D() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.EMPTY_LIST);
    }

    public boolean E() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public String F() {
        return this.f15335i;
    }

    public int G() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public int H() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int I() {
        return k7.a(getIntFromAdObject("graphic_completion_percent", -1), 90);
    }

    public long J() {
        return this.f15336j;
    }

    public List K() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 7));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("imp_urls", new JSONObject()), getClCode(), null, null, T(), a1(), this.sdk);
        }
        return listA;
    }

    public int L() {
        return getIntFromAdObject("mdafra", ((Integer) this.sdk.a(v4.S0)).intValue());
    }

    public boolean M() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public List N() {
        List listO = O();
        if (listO == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listO.size());
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(a(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public List P() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public void b(String str) {
        this.f15338l = str;
    }

    public void c(String str) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.a(new com.applovin.impl.sdk.ad.d(str, 1));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(getJsonObjectFromAdObject("video_button_properties", null), "video_button_html", str);
        }
    }

    public c g0() {
        c cVar = c.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", cVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? c.ACTIVITY_PORTRAIT : uQjDr.tmPf.equalsIgnoreCase(upperCase) ? c.ACTIVITY_LANDSCAPE : cVar;
    }

    public int u() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public Bundle v() {
        Map map;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            map = (Map) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 12));
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e10) {
                this.sdk.O();
                if (o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString(Command.HTTP_HEADER_USER_AGENT, k8.a());
        }
        return bundle;
    }

    public List w() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 4));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List x() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 3));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List y() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 5));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public List z() {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new com.applovin.impl.sdk.ad.e(this, 11));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listA;
    }

    public void a(String str) {
        this.f15335i = str;
    }

    public void b(boolean z10) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.a("html_resources_cached", z10);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putBoolean(this.adObject, "html_resources_cached", z10);
        }
    }

    public l4 i() {
        return (l4) this.f15333g.getAndSet(null);
    }

    public String k() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public d o() {
        if (this.f15339m == null) {
            this.f15339m = new d();
        }
        return this.f15339m;
    }

    public int p() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(v4.L1)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean s(f5 f5Var) {
        return JsonUtils.getBoolean(f5Var.a("video_button_properties", (JSONObject) null), "should_cache_video_button_html_assets", Boolean.FALSE);
    }

    public void a(long j10) {
        this.f15336j = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th2) {
                this.sdk.O();
                if (o.a()) {
                    this.sdk.O().a("DirectAd", "Failed to parse OMID verification script resource", th2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(f5 f5Var) {
        return k7.a(f5Var.a("video_end_urls", new JSONObject()), getClCode(), r0(), this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List d(f5 f5Var) {
        return k7.a(f5Var.a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List e(f5 f5Var) {
        return k7.a(f5Var.a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List j(f5 f5Var) {
        return k7.a(f5Var.a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List b(f5 f5Var) {
        return k7.a(f5Var.a("app_killed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public long c() {
        return getLongFromAdObject("batfort", TimeUnit.SECONDS.toMillis(1L));
    }

    public void d() {
        this.f15332f.set(true);
    }

    private String c(MotionEvent motionEvent, boolean z10, boolean z11) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map mapA = a(motionEvent, z10, z11);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapA);
        }
        return null;
    }

    private List b(MotionEvent motionEvent, boolean z10, boolean z11) {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            return (List) f5Var.a(new f(this, motionEvent, z10, z11));
        }
        synchronized (this.adObjectLock) {
            listA = k7.a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), T(), a1(), this.sdk);
        }
        return listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map c(f5 f5Var) {
        try {
            return JsonUtils.toStringMap(f5Var.a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e10) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a("DirectAd", "Failed to retrieve http headers for Custom Tabs", e10);
            }
            return new HashMap();
        }
    }

    public void c(Uri uri) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.b("unmute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, YsiBvdpw.tfndFp, uri.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List a(t.a aVar, f5 f5Var) {
        return (List) aVar.apply(f5Var.a("omid_verification_script_resources", (JSONArray) null));
    }

    public void a(Uri uri) {
        this.f15330d.add(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, f5 f5Var) {
        JsonUtils.putString(f5Var.a("video_button_properties", (JSONObject) null), "video_button_html", str);
    }

    public List b(MotionEvent motionEvent, boolean z10) {
        List listA;
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            listA = (List) f5Var.a(new g(z10, this, motionEvent));
        } else {
            synchronized (this.adObjectLock) {
                listA = k7.a(getJsonObjectFromAdObject("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), null, T(), a1(), this.sdk);
            }
        }
        return listA.isEmpty() ? b(motionEvent, true, z10) : listA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(f5 f5Var) {
        return k7.a(f5Var.a("ad_closed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    public List a(MotionEvent motionEvent, boolean z10) {
        return b(motionEvent, false, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, boolean z11, f5 f5Var) {
        return k7.a(f5Var.a("click_tracking_urls", new JSONObject()), a(motionEvent, z10, z11), c(motionEvent, z10, z11), T(), a1(), this.sdk);
    }

    public void b(Uri uri) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.b("mute_image", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List a(MotionEvent motionEvent, boolean z10, f5 f5Var) {
        return k7.a(f5Var.a("video_click_tracking_urls", new JSONObject()), a(motionEvent, true, z10), null, T(), a1(), this.sdk);
    }

    private Map a(MotionEvent motionEvent, boolean z10, boolean z11) {
        Point pointB = o0.b(k.o());
        HashMap map = new HashMap(7);
        map.put("{CLCODE}", getClCode());
        map.put("{CLICK_X}", String.valueOf(motionEvent != null ? motionEvent.getRawX() : -1.0f));
        map.put("{CLICK_Y}", String.valueOf(motionEvent != null ? motionEvent.getRawY() : -1.0f));
        map.put("{SCREEN_WIDTH}", String.valueOf(pointB.x));
        map.put("{SCREEN_HEIGHT}", String.valueOf(pointB.y));
        map.put("{IS_VIDEO_CLICK}", String.valueOf(z10));
        map.put("{IS_INSTALL}", String.valueOf(z11));
        return map;
    }

    public void a(l4 l4Var) {
        this.f15333g.set(l4Var);
    }

    private e.a a(boolean z10) {
        return z10 ? e.a.WHITE_ON_TRANSPARENT : e.a.WHITE_ON_BLACK;
    }

    public e.a a(int i10) {
        if (i10 == 1) {
            return e.a.WHITE_ON_TRANSPARENT;
        }
        if (i10 == 2) {
            return e.a.INVISIBLE;
        }
        if (i10 == 3) {
            return e.a.TRANSPARENT_SKIP;
        }
        return e.a.WHITE_ON_BLACK;
    }
}
