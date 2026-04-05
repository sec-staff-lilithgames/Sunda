package l6;

import android.content.Context;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class t0 {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final s0 E;
    public static final d F;

    /* renamed from: a, reason: collision with root package name */
    public static final b f72479a = new b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b, reason: collision with root package name */
    public static final f f72480b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f72481c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f72482d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f72483e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f72484f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f72485g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f72486h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f72487i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f72488j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f72489k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f72490l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f72491m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f72492n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f72493o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f72494p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f72495q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f72496r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f72497s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f72498t;

    /* renamed from: u, reason: collision with root package name */
    public static final e f72499u;

    /* renamed from: v, reason: collision with root package name */
    public static final e f72500v;

    /* renamed from: w, reason: collision with root package name */
    public static final h f72501w;

    /* renamed from: x, reason: collision with root package name */
    public static final h f72502x;

    /* renamed from: y, reason: collision with root package name */
    public static final h f72503y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f72504z;

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean isStartupFeatureSupported(String str, Context context) {
        return isStartupFeatureSupported(str, h0.values(), context);
    }

    public static boolean isSupported(String str) {
        return isSupported(str, j.values());
    }

    static {
        new b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
        new e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
        new c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
        f72480b = new f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
        new f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
        new f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
        f72481c = new f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
        f72482d = new f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
        f72483e = new f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
        new c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
        f72484f = new c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
        f72485g = new c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
        f72486h = new c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
        f72487i = new c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
        new c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
        new b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
        new b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
        new c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
        new f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
        new c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
        f72488j = new b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
        f72489k = new b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
        f72490l = new f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
        f72491m = new f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
        f72492n = new f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
        f72493o = new b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
        f72494p = new b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
        f72495q = new d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
        f72496r = new b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
        f72497s = new b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
        f72498t = new b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
        new b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
        f72499u = new e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
        f72500v = new e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
        f72501w = new h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
        f72502x = new h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
        new g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        new g0("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
        new f0("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
        f72503y = new h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
        new r0();
        new d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
        f72504z = new d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
        new h("FORCE_DARK", "FORCE_DARK");
        new d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
        A = new d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
        B = new d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
        new d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
        C = new d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
        new d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
        new d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
        D = new d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
        new d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
        E = new s0("MULTI_PROFILE", "MULTI_PROFILE");
        new d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
        new d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
        F = new d("MUTE_AUDIO", "MUTE_AUDIO");
        new d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
        new d(duhsDlGWdBkekB.fcSonoOmb, "SPECULATIVE_LOADING");
        new d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
    }

    public static boolean isStartupFeatureSupported(String str, Collection<h0> collection, Context context) {
        HashSet hashSet = new HashSet();
        for (h0 h0Var : collection) {
            if (h0Var.getPublicFeatureName().equals(str)) {
                hashSet.add(h0Var);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(a.b.k("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((h0) it.next()).isSupported(context)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends u> boolean isSupported(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.getPublicFeatureName().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(a.b.k("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((j) ((u) it.next())).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
