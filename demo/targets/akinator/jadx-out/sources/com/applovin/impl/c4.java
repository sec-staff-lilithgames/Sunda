package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c4 {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f13764a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f13765b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f13766c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f13767d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f13768e;

    /* renamed from: f, reason: collision with root package name */
    protected AdSession f13769f;

    /* renamed from: g, reason: collision with root package name */
    protected AdEvents f13770g;

    public c4(AppLovinAdBase appLovinAdBase) {
        this.f13764a = appLovinAdBase;
        this.f13765b = appLovinAdBase.getSdk();
        this.f13766c = appLovinAdBase.getSdk().O();
        String string = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbT = a.b.t(string, ":");
            sbT.append(appLovinAdBase.getDspName());
            string = sbT.toString();
        }
        this.f13767d = string;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new u8(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f13764a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13766c.d(this.f13767d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f13769f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13766c.k(this.f13767d, "Attempting to start session again for ad: " + this.f13764a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13766c.a(this.f13767d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f13769f = adSessionCreateAdSession;
            try {
                this.f13770g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f13769f);
                this.f13769f.start();
                this.f13768e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13766c.a(this.f13767d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13766c.a(this.f13767d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13766c.a(this.f13767d, "Failed to create session", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f13770g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new s8(3, this, webView));
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new u8(this, 0));
    }

    public void g() {
        b("track impression event", new u8(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f13770g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f13769f.registerAdView(view);
        this.f13769f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e4 e4Var = (e4) it.next();
            if (e4Var.c() != null) {
                try {
                    this.f13769f.addFriendlyObstruction(e4Var.c(), e4Var.b(), e4Var.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13766c.a(this.f13767d, "Failed to add friendly obstruction (" + e4Var + ")", th2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f13769f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f13768e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13766c.a(this.f13767d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13766c.a(this.f13767d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void b(View view, List list) {
        b("update main view: " + view, new androidx.browser.customtabs.g(this, 7, view, list));
    }

    public void b(String str) {
        b("track error", new s8(4, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f13768e = false;
        this.f13769f.finish();
        this.f13769f = null;
        this.f13770g = null;
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new androidx.browser.customtabs.g(this, 8, str, runnable));
    }
}
