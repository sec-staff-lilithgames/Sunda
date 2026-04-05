package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.k0;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.k;
import com.applovin.impl.b2;
import com.applovin.impl.b6;
import com.applovin.impl.b8;
import com.applovin.impl.c2;
import com.applovin.impl.c4;
import com.applovin.impl.e2;
import com.applovin.impl.e4;
import com.applovin.impl.k2;
import com.applovin.impl.k7;
import com.applovin.impl.l8;
import com.applovin.impl.m1;
import com.applovin.impl.p6;
import com.applovin.impl.q2;
import com.applovin.impl.r4;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {
    private volatile AppLovinAdLoadListener A;
    private volatile AppLovinAdDisplayListener B;
    private volatile AppLovinAdViewEventListener C;
    private volatile AppLovinAdClickListener D;

    /* renamed from: a, reason: collision with root package name */
    private Context f13459a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f13460b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f13461c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f13462d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f13463e;

    /* renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f13464f;

    /* renamed from: g, reason: collision with root package name */
    private b f13465g;

    /* renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f13467i;

    /* renamed from: j, reason: collision with root package name */
    private String f13468j;

    /* renamed from: k, reason: collision with root package name */
    private k0 f13469k;

    /* renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f13470l;

    /* renamed from: m, reason: collision with root package name */
    private e f13471m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f13472n;

    /* renamed from: o, reason: collision with root package name */
    private WebView f13473o;

    /* renamed from: p, reason: collision with root package name */
    private k f13474p;

    /* renamed from: q, reason: collision with root package name */
    private Runnable f13475q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f13476r;

    /* renamed from: h, reason: collision with root package name */
    private final Map f13466h = a.b.u();

    /* renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f13477s = null;

    /* renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f13478t = null;

    /* renamed from: u, reason: collision with root package name */
    private f f13479u = null;

    /* renamed from: v, reason: collision with root package name */
    private f f13480v = null;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f13481w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f13482x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f13483y = false;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f13484z = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0024a extends r4 {
        public C0024a() {
        }

        @Override // com.applovin.impl.r4
        public Map a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f13472n != null) {
                a.this.f13472n.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0024a c0024a) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0025a implements k.a {
            public C0025a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f13472n.addView(a.this.f13474p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void onFailure() {
                com.applovin.impl.sdk.o unused = a.this.f13463e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f13463e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f13477s != null) {
                if (a.this.f13472n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f13477s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    q2.a(a.this.C, a.this.f13477s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f13461c.g().a(c2.f13735s, a.this.f13477s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f13463e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f13463e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f13477s.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                a.b(a.this.f13472n, a.this.f13477s.getSize());
                if (a.this.f13474p != null) {
                    b8.c(a.this.f13474p);
                    a.this.f13474p = null;
                }
                b2 b2Var = new b2(a.this.f13466h, a.this.f13461c);
                if (b2Var.c()) {
                    a.this.f13474p = new k(b2Var, a.this.f13459a);
                    a.this.f13474p.a(new C0025a());
                }
                a.this.f13472n.setAdHtmlLoaded(false);
                a.this.f13472n.a(a.this.f13477s);
                if (a.this.f13477s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f13484z) {
                    return;
                }
                a.this.f13477s.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0024a c0024a) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final a f13489a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f13489a = aVar;
        }

        private a a() {
            return this.f13489a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i10);
            }
        }
    }

    private void E() {
        if (this.f13463e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "Destroying...");
        }
        l8.b(this.f13472n);
        this.f13472n = null;
        l8.b(this.f13473o);
        this.f13473o = null;
        this.f13469k = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f13484z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f13477s;
        s2 s2Var = new s2();
        s2Var.a().a(bVar).a(i());
        if (!k7.a(bVar.getSize())) {
            s2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        s2Var.a(this.f13461c);
        s2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", s2Var.toString());
        }
    }

    private void x() {
        if (this.f13477s.c1()) {
            int iC = this.f13461c.q().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f13472n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f13472n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (k7.a(this.f13467i)) {
            if (((Boolean) this.f13461c.a(v4.C1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f13461c.a(v4.D1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f13461c.a(v4.E1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f13461c.a(v4.F1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f13465g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f13477s != null && this.f13477s.B0()) {
            com.applovin.impl.g.a(this.f13472n, this.f13461c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f13483y) {
            if (this.f13477s == null || !this.f13477s.m1()) {
                q2.b(this.B, this.f13477s);
            }
            if (this.f13477s != null && this.f13477s.isOpenMeasurementEnabled() && k7.a(this.f13477s.getSize())) {
                this.f13477s.getAdEventTracker().f();
            }
            if (this.f13472n != null && this.f13479u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13463e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f13463e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f13483y || this.f13484z) {
            return;
        }
        this.f13484z = true;
    }

    public void F() {
        if (this.f13483y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f13481w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f13484z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new o(this, 4));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void w() {
        if ((this.f13459a instanceof m1) && this.f13477s != null && this.f13477s.U() == b.EnumC0039b.DISMISS) {
            ((m1) this.f13459a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f13479u != null || this.f13480v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "Ad: " + this.f13477s + " closed.");
        }
        a(this.f13476r);
        q2.b(this.B, this.f13477s);
        this.f13477s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new o(this, 2));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f13472n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f13460b == null || (bVar = this.f13472n) == null || bVar.getParent() != null) {
            return;
        }
        this.f13460b.addView(this.f13472n);
        b(this.f13472n, this.f13477s.getSize());
        if (this.f13477s.isOpenMeasurementEnabled()) {
            this.f13477s.getAdEventTracker().a((View) this.f13472n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f13472n != null && this.f13479u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f13479u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13463e.a("AppLovinAdView", QFzuMMDfrzagDN.MLEdGbVRH + this.f13479u.b());
            }
            this.f13480v = this.f13479u;
            this.f13479u = null;
            a(this.f13467i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f13480v;
        if (fVar == null && this.f13479u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f13480v.dismiss();
            this.f13480v = null;
        } else {
            aVarB = this.f13479u.b();
            this.f13479u.dismiss();
            this.f13479u = null;
        }
        q2.a(this.C, aVarB, (AppLovinAdView) this.f13460b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f13472n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f13477s;
    }

    public k0 h() {
        return this.f13469k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f13460b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f13461c;
    }

    public AppLovinAdSize k() {
        return this.f13467i;
    }

    public String l() {
        return this.f13468j;
    }

    public void u() {
        if (this.f13461c == null || this.f13471m == null || this.f13459a == null || !this.f13483y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f13462d.loadNextAd(this.f13468j, this.f13467i, this.f13471m);
        }
    }

    private void d() {
        a(new o(this, 0));
    }

    public void c(int i10) {
        String strA = b8.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b(a.b.l("javascript:al_onWindowVisibilityChanged( ", strA, " );"));
    }

    private void d(String str, Map map) {
        a(l8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f13461c = kVar;
            this.f13462d = kVar.k();
            this.f13463e = kVar.O();
            this.f13464f = AppLovinCommunicator.getInstance(context);
            this.f13467i = appLovinAdSize;
            this.f13468j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f13459a = context;
            this.f13460b = appLovinAdView;
            this.f13470l = new com.applovin.impl.adview.c(this, kVar);
            C0024a c0024a = null;
            this.f13476r = new c(this, c0024a);
            this.f13475q = new d(this, c0024a);
            this.f13471m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(l8.c(str, map));
    }

    public void b() {
        a(new o(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f13477s.getAdEventTracker().c(webView);
        k kVar = this.f13474p;
        if (kVar != null && kVar.a()) {
            c4 adEventTracker = this.f13477s.getAdEventTracker();
            k kVar2 = this.f13474p;
            adEventTracker.b(webView, Collections.singletonList(new e4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f13477s.getAdEventTracker().a((View) webView);
        }
        this.f13477s.getAdEventTracker().h();
        this.f13477s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f13470l, this.f13461c, this.f13459a);
            this.f13472n = bVar;
            bVar.setBackgroundColor(0);
            this.f13472n.setWillNotCacheDrawing(false);
            this.f13460b.setBackgroundColor(0);
            this.f13460b.addView(this.f13472n);
            b(this.f13472n, appLovinAdSize);
            if (!this.f13483y) {
                a(this.f13476r);
            }
            a(new o(this, 5));
            this.f13483y = true;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th2);
            this.f13461c.E().a("AppLovinAdView", "initAdWebView", th2);
            this.f13482x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f13479u == null && (this.f13477s instanceof com.applovin.impl.sdk.ad.a) && this.f13472n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f13477s;
            Context context = this.f13459a;
            Activity activityB = context instanceof Activity ? (Activity) context : b8.b(this.f13472n, this.f13461c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f13460b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f13472n);
                }
                f fVar = new f(aVar2, this.f13472n, activityB, this.f13461c);
                this.f13479u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.q
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f13562b.a(dialogInterface);
                    }
                });
                this.f13479u.show();
                q2.c(this.C, this.f13477s, (AppLovinAdView) this.f13460b);
                if (this.f13477s.isOpenMeasurementEnabled()) {
                    this.f13477s.getAdEventTracker().a((View) this.f13479u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriM = aVar2.m();
            if (uriM != null) {
                aVar = this;
                this.f13462d.trackAndLaunchClick(aVar2, i(), aVar, uriM, motionEvent, null);
            } else {
                aVar = this;
            }
            aVar.f13472n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.s.b(attributeSet)) {
                u();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f13484z) {
                c(appLovinAd);
            } else {
                this.f13481w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13463e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new af.n(20, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f13466h.put(str, obj);
    }

    public void a(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f13463e.a("AppLovinAdView", "onWindowFocusChanged( " + z10 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            k7.b(appLovinAd, this.f13461c);
            if (this.f13483y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = e2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f13461c.g().d(c2.f13729p, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) k7.a(appLovinAd, this.f13461c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    q2.a(this.B, "Unable to retrieve the loaded ad");
                    Map mapA2 = e2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f13461c.g().d(c2.f13735s, mapA2);
                    return;
                }
                if (bVar == this.f13477s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f13461c.a(v4.G1)).booleanValue()) {
                        if (this.B instanceof k2) {
                            q2.a(this.B, "Attempting to show ad again");
                        } else if (!k7.c(this.f13461c)) {
                            this.f13461c.g().a(c2.E0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f13461c.g().a(c2.f13735s, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13463e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                q2.b(this.B, this.f13477s);
                if (this.f13477s != null && this.f13477s.isOpenMeasurementEnabled()) {
                    this.f13477s.getAdEventTracker().f();
                }
                this.f13481w.set(null);
                this.f13478t = null;
                this.f13477s = bVar;
                if (this.f13477s.G0()) {
                    this.f13469k = this.f13461c.A().a(this);
                    this.f13461c.A().b(this.f13477s.D(), this.f13469k);
                }
                if (!this.f13484z && k7.a(this.f13467i)) {
                    this.f13461c.k().trackImpression(bVar);
                }
                if (this.f13479u != null) {
                    c();
                }
                a(this.f13475q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        if (!this.f13484z) {
            a(this.f13476r);
        }
        a(new p(this, i10, 0));
    }

    private void b(String str) {
        if (((Boolean) this.f13461c.a(v4.C1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(l8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f13477s != null && this.f13477s.I0() && this.f13473o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f13461c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13461c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f13459a);
            this.f13473o = webView;
            webView.setWebViewClient(new C0024a());
            this.f13473o.getSettings().setJavaScriptEnabled(true);
            this.f13473o.loadDataWithBaseURL((String) this.f13461c.a(v4.Z6), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", C.UTF8_NAME, null);
        }
    }

    public void a(WebView webView, String str) {
        if (this.f13477s == null) {
            return;
        }
        a(new u(webView, 2));
        if (!((Boolean) this.f13461c.a(v4.f15982m6)).booleanValue() || (str != null && str.startsWith(this.f13477s.k()))) {
            try {
                if (this.f13477s != this.f13478t) {
                    this.f13478t = this.f13477s;
                    x();
                    this.f13472n.setAdHtmlLoaded(true);
                    if (this.B != null) {
                        this.f13461c.z().d(this.f13477s);
                        if (this.f13477s.C0()) {
                            this.f13461c.g().a(c2.f13733r, this.f13477s, CollectionUtils.hashMap("details", e2.b(this.f13477s)));
                        } else {
                            this.f13461c.g().a(c2.f13731q, this.f13477s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f13477s.J())));
                            q2.a(this.B, this.f13477s);
                        }
                        if (this.f13477s.d1()) {
                            String str2 = (String) this.f13461c.q0().a(x4.S, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f13472n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f13472n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f13477s.C0()) {
                            this.f13472n.a("javascript:al_onAdRestored( '" + this.f13477s.h0() + "' );");
                        }
                    }
                    if ((this.f13477s instanceof com.applovin.impl.sdk.ad.a) && this.f13477s.isOpenMeasurementEnabled()) {
                        this.f13461c.r0().a(new p6(this.f13461c, "StartOMSDK", new af.n(19, this, webView)), b6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th2);
                com.applovin.impl.sdk.k kVar = this.f13461c;
                if (kVar != null) {
                    kVar.E().a("AppLovinAdView", "onAdHtmlLoaded", th2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        webView.setVisibility(0);
    }

    public void a(MotionEvent motionEvent) {
        a(new af.n(18, this, motionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new o(this, 1));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f13462d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent, bundle);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.o.a()) {
                aVar.f13463e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        q2.a(aVar.D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f13482x.compareAndSet(true, false)) {
            a(this.f13467i);
        }
        try {
            if (this.A != null) {
                this.A.adReceived(appLovinAd);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th2.getMessage());
            com.applovin.impl.sdk.k kVar = this.f13461c;
            if (kVar != null) {
                kVar.E().a("AppLovinAdView", "notifyAdLoadedCallback", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        try {
            if (this.A != null) {
                this.A.failedToReceiveAd(i10);
            }
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th2);
            com.applovin.impl.sdk.k kVar = this.f13461c;
            if (kVar != null) {
                kVar.E().a("AppLovinAdView", "notifyAdLoadFailedCallback", th2);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f13465g = bVar;
    }

    private void a(String str, Map map) {
        a(l8.a(str, map));
    }

    private void a(String str) {
        if (this.f13477s == null || this.f13472n == null || !k7.a(this.f13477s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f13472n.a(str);
    }

    public void a(Uri uri) {
        if (this.f13477s == null || !this.f13477s.I0()) {
            return;
        }
        if (this.f13473o == null) {
            this.f13461c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13461c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f13461c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13461c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new androidx.browser.customtabs.g(this, 6, queryParameter2, queryParameter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String strL;
        if (StringUtils.isValidString(str)) {
            strL = e3.g.l("gtag('event', '", str2, "', ", str, ");");
        } else {
            strL = a.b.l("gtag('event', '", str2, "')");
        }
        if (((Boolean) this.f13461c.a(v4.O2)).booleanValue()) {
            l8.a(this.f13473o, strL, this.f13461c);
        } else {
            l8.a(this.f13473o, strL);
        }
    }
}
