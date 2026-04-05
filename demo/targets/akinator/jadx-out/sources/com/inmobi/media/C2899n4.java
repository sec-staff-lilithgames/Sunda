package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2899n4 extends Z1 implements Sb {

    /* renamed from: b, reason: collision with root package name */
    public long f33120b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33121c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33122d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33123e;

    /* renamed from: f, reason: collision with root package name */
    public final C2730d4 f33124f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f33125g;

    /* renamed from: h, reason: collision with root package name */
    public final C2815i4 f33126h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33127i;

    /* renamed from: j, reason: collision with root package name */
    public final AdConfig.RenderingConfig f33128j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.o f33129k;

    /* renamed from: l, reason: collision with root package name */
    public X6 f33130l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33131m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33132n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2899n4(Context context, long j10, String placementType, String impressionId, String creativeId, C2730d4 onLpLifecycleEvent, F5 f52) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementType, "placementType");
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
        kotlin.jvm.internal.e0.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.f33120b = j10;
        this.f33121c = placementType;
        this.f33122d = impressionId;
        this.f33123e = creativeId;
        this.f33124f = onLpLifecycleEvent;
        this.f33125g = f52;
        this.f33127i = "n4";
        LinkedHashMap linkedHashMap = Q2.f32149a;
        this.f33128j = ((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getRendering();
        this.f33129k = tu.q.lazy(C2831j4.f32961a);
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        C2815i4 c2815i4 = new C2815i4("IN_CUSTOM_EXPAND", new C2848k4(this), new C2865l4(this), new C2882m4(this), f52);
        setWebViewClient(c2815i4);
        this.f33126h = c2815i4;
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    private final AdConfig getAdConfig() {
        return (AdConfig) this.f33129k.getValue();
    }

    @Override // com.inmobi.media.Sb
    public final boolean a() {
        String TAG = this.f33127i;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        return g();
    }

    @Override // com.inmobi.media.Sb
    public final boolean d() {
        String TAG = this.f33127i;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
        return g();
    }

    @Override // com.inmobi.media.Z1
    public final S6 f() {
        T6 t62 = new T6(true, "DEFAULT", getAdConfig().isCCTEnabled(), false);
        Context context = getContext();
        F5 f52 = this.f33125g;
        kotlin.jvm.internal.e0.checkNotNull(context);
        return new S6(context, t62, null, null, this, null, f52);
    }

    public final boolean g() {
        return !this.f33128j.getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > this.f33128j.getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == this.f33128j.getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    public final X6 getLandingPageTelemetryControlInfo() {
        return this.f33130l;
    }

    @Override // com.inmobi.media.Sb
    public long getViewTouchTimestamp() {
        return this.f33120b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        super.loadData(data, str, str2);
        C2815i4 c2815i4 = this.f33126h;
        if (c2815i4 != null) {
            c2815i4.f32630d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        C2815i4 c2815i4 = this.f33126h;
        if (c2815i4 != null) {
            c2815i4.f32630d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (!this.f33132n) {
            this.f33132n = true;
            C2730d4 c2730d4 = this.f33124f;
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            c2730d4.invoke(C2687ac.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.f33131m) {
            this.f33131m = true;
            C2730d4 c2730d4 = this.f33124f;
            GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
            c2730d4.invoke(C2687ac.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(X6 x62) {
        this.f33130l = x62;
        C2815i4 c2815i4 = this.f33126h;
        if (c2815i4 == null) {
            return;
        }
        c2815i4.f32923j = x62;
        c2815i4.f32924k = new U6(x62, c2815i4);
    }

    public void setViewTouchTimestamp(long j10) {
        this.f33120b = j10;
    }

    @Override // com.inmobi.media.Sb
    public final void a(String triggerApi) {
        kotlin.jvm.internal.e0.checkNotNullParameter(triggerApi, "triggerApi");
        HashMap map = new HashMap();
        map.put("creativeId", this.f33123e);
        map.put("trigger", triggerApi);
        map.put("impressionId", this.f33122d);
        map.put("adType", this.f33121c);
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("BlockAutoRedirection", map, EnumC2993se.f33373a);
    }
}
