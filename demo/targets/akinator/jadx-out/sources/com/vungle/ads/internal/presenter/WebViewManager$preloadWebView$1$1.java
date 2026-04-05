package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.platform.WebViewUtil;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.a0;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewManager$preloadWebView$1$1 extends f0 implements kv.a {
    final /* synthetic */ AdPayload $adv;
    final /* synthetic */ Context $context;
    final /* synthetic */ PreloadDelegate $delegate;
    final /* synthetic */ String $key;
    final /* synthetic */ Long $loadDuration;
    final /* synthetic */ Placement $placement;
    final /* synthetic */ String $templatePath;
    final /* synthetic */ AdPayload.WebViewSettings $webSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewManager$preloadWebView$1$1(Context context, AdPayload adPayload, Placement placement, PreloadDelegate preloadDelegate, Long l9, String str, String str2, AdPayload.WebViewSettings webViewSettings) {
        super(0);
        this.$context = context;
        this.$adv = adPayload;
        this.$placement = placement;
        this.$delegate = preloadDelegate;
        this.$loadDuration = l9;
        this.$templatePath = str;
        this.$key = str2;
        this.$webSettings = webViewSettings;
    }

    /* renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
    private static final Executors m3638invoke$lambda3$lambda1(o oVar) {
        return (Executors) oVar.getValue();
    }

    /* renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
    private static final Platform m3639invoke$lambda3$lambda2(o oVar) {
        return (Platform) oVar.getValue();
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3640invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3640invoke() {
        Object objM7131constructorimpl;
        WebViewManager webViewManager = WebViewManager.INSTANCE;
        Context context = this.$context;
        AdPayload adPayload = this.$adv;
        Placement placement = this.$placement;
        PreloadDelegate preloadDelegate = this.$delegate;
        Long l9 = this.$loadDuration;
        String str = this.$templatePath;
        String str2 = this.$key;
        AdPayload.WebViewSettings webViewSettings = this.$webSettings;
        try {
            int i10 = z.f87419c;
            WebView webView = new WebView(context.getApplicationContext());
            WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            s sVar = s.f87403b;
            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement, m3638invoke$lambda3$lambda1(q.lazy(sVar, (kv.a) new WebViewManager$preloadWebView$1$1$invoke$lambda3$$inlined$inject$1(context))).getOffloadExecutor(), m3639invoke$lambda3$lambda2(q.lazy(sVar, (kv.a) new WebViewManager$preloadWebView$1$1$invoke$lambda3$$inlined$inject$2(context))), preloadDelegate, l9);
            ConfigManager configManager = ConfigManager.INSTANCE;
            vungleWebClient.setConsentStatus(configManager.getGDPRIsCountryDataProtected() && e0.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus()), configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
            webView.setWebViewClient(vungleWebClient);
            webView.loadUrl(str);
            WebViewManager.webViewCache.put(String.valueOf(str2), new WebViewManager.WebViewEntry(webView, vungleWebClient));
            objM7131constructorimpl = z.m7131constructorimpl(Integer.valueOf(Logger.Companion.d("WebViewManager", "Preload complete. Cache size: " + WebViewManager.webViewCache.size())));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        PreloadDelegate preloadDelegate2 = this.$delegate;
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            Logger.Companion.e("WebViewManager", "Preload webview failed", thM7134exceptionOrNullimpl);
            preloadDelegate2.onAdReadyToPlay();
        }
    }
}
