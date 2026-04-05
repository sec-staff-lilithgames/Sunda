package com.vungle.ads.internal.ui;

import a.b;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import b0.e2;
import com.applovin.impl.k9;
import com.applovin.impl.y8;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C3191e4;
import com.ironsource.lh;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.OneShotSingleValueMetric;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.Logger;
import e3.g;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.j0;
import sv.k0;
import sv.n0;
import tu.a0;
import tu.f;
import tu.v;
import tu.z;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleWebClient extends WebViewClient implements WebViewAPI {
    private static final String COMMAND_COMPLETE = "window.vungle.mraidBridge.notifyCommandComplete()";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;
    private boolean collectConsent;
    private final PreloadDelegate delegate;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private final Handler handler;
    private Boolean isViewable;
    private final Long loadDuration;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final OneShotSingleValueMetric partialDownloadErrorMetric;
    private final OneShotSingleValueMetric partialDownloadMetric;
    private final Placement placement;
    private final Platform platform;
    private boolean ready;
    private final SingleValueMetric skippedUrlMetric;
    private WebViewObserver webViewObserver;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            e0.checkNotNullParameter(webView, "webView");
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            e0.checkNotNullParameter(webView, "webView");
            Logger.Companion companion = Logger.Companion;
            StringBuilder sb2 = new StringBuilder("onRenderProcessUnresponsive(Title = ");
            sb2.append(webView.getTitle());
            sb2.append(", URL = ");
            sb2.append(webView.getOriginalUrl());
            sb2.append(", (webViewRenderProcess != null) = ");
            sb2.append(webViewRenderProcess != null);
            companion.w(VungleWebClient.TAG, sb2.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService, Platform platform, PreloadDelegate preloadDelegate, Long l9, int i10, u uVar) {
        this(adPayload, placement, executorService, (i10 & 8) != 0 ? null : platform, (i10 & 16) != 0 ? null : preloadDelegate, (i10 & 32) != 0 ? null : l9);
    }

    private final void handleWebViewError(String str, String str2, boolean z10) {
        String str3 = str2 + ' ' + str;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(str3, z10);
        }
    }

    private final boolean isCriticalAsset(String str) {
        if (str.length() > 0) {
            return this.advertisement.isCriticalAsset(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyPropertiesChange$lambda-25, reason: not valid java name */
    public static final void m3654notifyPropertiesChange$lambda25(boolean z10, VungleWebClient this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.advertisement.templateType());
        Boolean bool = this$0.isViewable;
        if (bool != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, C3191e4.h.f36499o, bool);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "os", "android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", Boolean.valueOf(this$0.placement.isRewardedVideo()));
        Platform platform = this$0.platform;
        if (platform != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
        }
        Long l9 = this$0.loadDuration;
        if (l9 != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", l9);
        }
        if (this$0.collectConsent) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.TRUE);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.gdprTitle);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.gdprBody);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.gdprAccept);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.gdprDeny);
        } else {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.FALSE);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
        this$0.handler.post(new com.ironsource.environment.thread.a(15, this$0, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + z10 + ')'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyPropertiesChange$lambda-25$lambda-24, reason: not valid java name */
    public static final void m3655notifyPropertiesChange$lambda25$lambda24(VungleWebClient this$0, String injectJs) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(injectJs, "$injectJs");
        WebView webView = this$0.loadedWebView;
        if (webView != null) {
            this$0.runJavascriptOnWebView(webView, injectJs);
        }
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        try {
            Logger.Companion.w(TAG, "mraid Injecting JS " + str);
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        } catch (Throwable th2) {
            new EvaluateJsError("Evaluate js failed " + th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10, reason: not valid java name */
    public static final void m3656shouldOverrideUrlLoading$lambda16$lambda10(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdFailedToPlay();
        }
        this$0.handler.post(new a(this$0, webView, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-10$lambda-9, reason: not valid java name */
    public static final void m3657shouldOverrideUrlLoading$lambda16$lambda10$lambda9(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-11, reason: not valid java name */
    public static final void m3658shouldOverrideUrlLoading$lambda16$lambda11(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14, reason: not valid java name */
    public static final void m3659shouldOverrideUrlLoading$lambda16$lambda15$lambda14(WebViewAPI.MraidDelegate it, String command, JsonObject args, VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(it, "$it");
        e0.checkNotNullParameter(command, "$command");
        e0.checkNotNullParameter(args, "$args");
        e0.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            this$0.handler.post(new a(this$0, webView, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m3660shouldOverrideUrlLoading$lambda16$lambda15$lambda14$lambda13(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6, reason: not valid java name */
    public static final void m3661shouldOverrideUrlLoading$lambda16$lambda6(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.handler.post(new lh(this$0, 19, webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.advertisement.createMRAIDArgs() + ')'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3662shouldOverrideUrlLoading$lambda16$lambda6$lambda5(VungleWebClient this$0, WebView webView, String injectJs) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(injectJs, "$injectJs");
        this$0.runJavascriptOnWebView(webView, injectJs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8, reason: not valid java name */
    public static final void m3663shouldOverrideUrlLoading$lambda16$lambda8(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        PreloadDelegate preloadDelegate = this$0.delegate;
        if (preloadDelegate != null) {
            preloadDelegate.onAdReadyToPlay();
        }
        this$0.handler.post(new a(this$0, webView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldOverrideUrlLoading$lambda-16$lambda-8$lambda-7, reason: not valid java name */
    public static final void m3664shouldOverrideUrlLoading$lambda16$lambda8$lambda7(VungleWebClient this$0, WebView webView) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, COMMAND_COMPLETE);
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final WebViewAPI.WebClientErrorHandler getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final Handler getHandler$vungle_ads_release() {
        return this.handler;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final WebViewAPI.MraidDelegate getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final WebViewObserver getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j10, long j11) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder("window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(");
            sb2.append(j10);
            sb2.append('-');
            runJavascriptOnWebView(webView, g.n(sb2, j11, ')'));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean z10) {
        this.offloadExecutor.submit(new k9(z10, this, 3));
    }

    public final void notifySilentModeChange(boolean z10) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(z10));
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Logger.Companion.w(TAG, "onPageFinished.");
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    @f
    public void onReceivedError(WebView webView, int i10, String description, String failingUrl) {
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(webView, i10, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Logger.Companion.e(TAG, "Http Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            Logger.Companion companion = Logger.Companion;
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone url: ");
            sb2.append(webView != null ? webView.getUrl() : null);
            companion.w(TAG, sb2.toString());
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                return webClientErrorHandler.onWebRenderingProcessGone(webView, Boolean.TRUE);
            }
            return true;
        }
        Logger.Companion companion2 = Logger.Companion;
        StringBuilder sb3 = new StringBuilder("onRenderProcessGone url: ");
        sb3.append(webView != null ? webView.getUrl() : null);
        sb3.append(", did crash: ");
        sb3.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        companion2.w(TAG, sb3.toString());
        WebViewAPI.WebClientErrorHandler webClientErrorHandler2 = this.errorHandler;
        if (webClientErrorHandler2 != null) {
            return webClientErrorHandler2.onWebRenderingProcessGone(webView, renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public final v parseRange$vungle_ads_release(String str, long j10) {
        Object objM7131constructorimpl;
        v vVar;
        try {
            int i10 = z.f87419c;
            if (str == null || !k0.startsWith$default(str, "bytes=", false, 2, null)) {
                vVar = new v(0L, null);
            } else {
                List listSplit$default = n0.split$default((CharSequence) n0.removePrefix(str, (CharSequence) "bytes="), new String[]{"-"}, false, 0, 6, (Object) null);
                String str2 = (String) y0.getOrNull(listSplit$default, 0);
                Long longOrNull = str2 != null ? j0.toLongOrNull(str2) : null;
                String str3 = (String) y0.getOrNull(listSplit$default, 1);
                Long longOrNull2 = str3 != null ? j0.toLongOrNull(str3) : null;
                if (longOrNull == null) {
                    if (longOrNull2 == null) {
                        longOrNull = 0L;
                    } else {
                        longOrNull = Long.valueOf(j10 - longOrNull2.longValue());
                        longOrNull2 = null;
                    }
                }
                vVar = new v(longOrNull, longOrNull2);
            }
            objM7131constructorimpl = z.m7131constructorimpl(vVar);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null) {
            objM7131constructorimpl = new v(0L, null);
        }
        return (v) objM7131constructorimpl;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean z10) {
        this.isViewable = Boolean.valueOf(z10);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z10) {
        this.collectConsent = z10;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean z10, String str, String str2, String str3, String str4) {
        this.collectConsent = z10;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler errorHandler) {
        e0.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z10) {
        this.ready = z10;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Locale locale;
        String strP;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme == null || (strP = e2.p((locale = Locale.ROOT), NativeAdContent.ViewTag.ROOT, scheme, locale, "this as java.lang.String).toLowerCase(locale)")) == null) {
            return null;
        }
        if (!e0.areEqual(strP, "http") && !e0.areEqual(strP, HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        if (!this.advertisement.isPartialDownloadEnabled()) {
            Logger.Companion.w(TAG, "shouldInterceptRequest called but partial download is disabled.");
            return null;
        }
        String string = url.toString();
        e0.checkNotNullExpressionValue(string, "uri.toString()");
        AdAsset localPartialDownloadAssets = this.advertisement.getLocalPartialDownloadAssets(string);
        String localPath = localPartialDownloadAssets != null ? localPartialDownloadAssets.getLocalPath() : null;
        if (localPath == null || localPath.length() == 0) {
            return null;
        }
        File file = new File(localPath);
        if (!file.exists()) {
            return null;
        }
        long contentLength = localPartialDownloadAssets.getContentLength();
        if (contentLength <= 0) {
            return null;
        }
        long length = file.length();
        String str = webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
        this.partialDownloadMetric.setMeta(str + " cached:" + length + ' ' + string);
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        v range$vungle_ads_release = parseRange$vungle_ads_release(str, contentLength);
        localPartialDownloadAssets.setRangeStart(((Number) range$vungle_ads_release.getFirst()).longValue());
        localPartialDownloadAssets.setRangeEnd((Long) range$vungle_ads_release.getSecond());
        long jLongValue = ((Number) range$vungle_ads_release.component1()).longValue();
        Long l9 = (Long) range$vungle_ads_release.component2();
        long j10 = length - jLongValue;
        Logger.Companion companion = Logger.Companion;
        StringBuilder sb2 = new StringBuilder(">>request: ");
        sb2.append(str);
        sb2.append(" rangeStart=");
        sb2.append(jLongValue);
        sb2.append(" rangeEnd=");
        sb2.append(l9);
        sb2.append(" cachedFileLength=");
        sb2.append(length);
        e2.A(sb2, " availableBytes=", j10, " contentLength=");
        companion.i(TAG, g.n(sb2, contentLength, ' '));
        if (j10 <= 0) {
            companion.w(TAG, "Requested range exceeds cached file: " + str);
            localPartialDownloadAssets.waitForDownload();
            length = file.length();
        }
        long jLongValue2 = l9 != null ? l9.longValue() : length - 1;
        long j11 = (jLongValue2 - jLongValue) + 1;
        try {
            int i10 = z.f87419c;
            FileInputStream fileInputStream = new FileInputStream(file);
            WebResourceResponse webResourceResponse = new WebResourceResponse(MimeTypes.VIDEO_MP4, C.UTF8_NAME, 206, "Partial Content", p1.mapOf(tu.e0.to("Content-Type", MimeTypes.VIDEO_MP4), tu.e0.to("Accept-Ranges", "bytes"), tu.e0.to("Content-Length", String.valueOf(j11)), tu.e0.to("Content-Range", "bytes " + jLongValue + '-' + jLongValue2 + '/' + contentLength)), new BufferedInputStream(fileInputStream, 1024));
            StringBuilder sb3 = new StringBuilder("<<Return:");
            sb3.append(webResourceResponse.getResponseHeaders());
            companion.i(TAG, sb3.toString());
            return webResourceResponse;
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(z.m7131constructorimpl(a0.createFailure(th2)));
            if (thM7134exceptionOrNullimpl == null) {
                return null;
            }
            Logger.Companion.e(TAG, "Error serving local range video: " + thM7134exceptionOrNullimpl.getMessage(), thM7134exceptionOrNullimpl);
            OneShotSingleValueMetric oneShotSingleValueMetric = this.partialDownloadErrorMetric;
            StringBuilder sbS = b.s(string, ' ');
            sbS.append(thM7134exceptionOrNullimpl.getMessage());
            oneShotSingleValueMetric.setMeta(sbS.toString());
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.partialDownloadErrorMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    @f
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.Companion companion;
        String str2;
        try {
            companion = Logger.Companion;
            companion.d(TAG, "MRAID Command " + str);
        } catch (Throwable th2) {
            if (th2 instanceof OutOfMemoryError) {
                new OutOfMemory(b.k("mraid:", str)).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        if (str != null && str.length() != 0) {
            Uri uri = Uri.parse(str);
            e0.checkNotNullExpressionValue(uri, "parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null && scheme.length() != 0) {
                String scheme2 = uri.getScheme();
                if (!e0.areEqual(scheme2, CampaignEx.JSON_KEY_MRAID)) {
                    str2 = "url: ";
                    if (!k0.equals("http", scheme2, true)) {
                        if (k0.equals(HttpRequest.DEFAULT_SCHEME, scheme2, true)) {
                        }
                        this.skippedUrlMetric.setMeta(str2.concat(str));
                        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                        companion.w(TAG, "skipped url: ".concat(str));
                        return false;
                    }
                    companion.d(TAG, "Open URL".concat(str));
                    WebViewAPI.MraidDelegate mraidDelegate = this.mraidDelegate;
                    if (mraidDelegate != null) {
                        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                        JsonElementBuildersKt.put(jsonObjectBuilder, "url", str);
                        mraidDelegate.processCommand("openNonMraid", jsonObjectBuilder.build());
                    }
                    return true;
                }
                str2 = "url: ";
                String host = uri.getHost();
                if (host != null) {
                    int iHashCode = host.hashCode();
                    if (iHashCode != -1943542072) {
                        if (iHashCode != 88409791) {
                            if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                                this.offloadExecutor.submit(new a(this, webView, 4));
                                return true;
                            }
                        } else if (host.equals("failToLoad")) {
                            this.offloadExecutor.submit(new a(this, webView, 5));
                            return true;
                        }
                    } else if (host.equals("propertiesChangeCompleted")) {
                        if (!this.ready) {
                            this.ready = true;
                            this.offloadExecutor.submit(new a(this, webView, 3));
                            return true;
                        }
                        return true;
                    }
                    WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
                    if (mraidDelegate2 == null) {
                        this.handler.post(new a(this, webView, 6));
                        return true;
                    }
                    JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                    for (String param : uri.getQueryParameterNames()) {
                        e0.checkNotNullExpressionValue(param, "param");
                        JsonElementBuildersKt.put(jsonObjectBuilder2, param, uri.getQueryParameter(param));
                    }
                    this.offloadExecutor.submit(new y8(mraidDelegate2, host, jsonObjectBuilder2.build(), this, webView, 4));
                    return true;
                }
                this.skippedUrlMetric.setMeta(str2.concat(str));
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.skippedUrlMetric, this.advertisement.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                companion.w(TAG, "skipped url: ".concat(str));
                return false;
            }
            return false;
        }
        companion.e(TAG, "Invalid URL ");
        return false;
    }

    public VungleWebClient(AdPayload advertisement, Placement placement, ExecutorService offloadExecutor, Platform platform, PreloadDelegate preloadDelegate, Long l9) {
        e0.checkNotNullParameter(advertisement, "advertisement");
        e0.checkNotNullParameter(placement, "placement");
        e0.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.platform = platform;
        this.delegate = preloadDelegate;
        this.loadDuration = l9;
        this.handler = new Handler(Looper.getMainLooper());
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.partialDownloadMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.partialDownloadErrorMetric = new OneShotSingleValueMetric(sDKMetricType);
        this.skippedUrlMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String strValueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String strValueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z10 = false;
        boolean z11 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        Logger.Companion.e(TAG, "Error desc " + strValueOf + ' ' + z11 + " for URL " + strValueOf2);
        if (isCriticalAsset(strValueOf2) && z11) {
            z10 = true;
        }
        handleWebViewError(strValueOf, strValueOf2, z10);
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }
}
