package com.amazon.aps.ads.util.adview;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import b0.e2;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdWebViewSupportClient extends ApsAdWebViewSupportClientBase {
    public static final String AMAZON_APP_STORE_LINK = "https://www.amazon.com/gp/mas/dl/android?";
    public static final String AMAZON_SCHEME = "amzn";
    public static final Companion Companion = new Companion(null);
    public static final String GOOGLE_PLAY_STORE_LINK = "https://play.google.com/store/apps/";
    public static final String MARKET_SCHEME = "market";
    public static final String MOBILE_SHOPPING_SCHEME = "com.amazon.mobile.shopping";
    public static final String MOBILE_SHOPPING_WEB_SCHEME = "com.amazon.mobile.shopping.web";
    private final String AMAZON_APP_STORE_LINK$1;
    private final ApsAdWebViewSchemeHandler schemeHandler;
    private final ApsAdWebViewClientListener webviewClientListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public ApsAdWebViewSupportClient(ApsAdWebViewClientListener webviewClientListener) {
        e0.checkNotNullParameter(webviewClientListener, "webviewClientListener");
        this.webviewClientListener = webviewClientListener;
        this.AMAZON_APP_STORE_LINK$1 = AMAZON_APP_STORE_LINK;
        this.schemeHandler = new ApsAdWebViewSchemeHandler(webviewClientListener);
    }

    private final WebResourceResponse createImageInjectionResponse(String str) throws IOException {
        try {
            InputStream inputStreamOpen = this.webviewClientListener.getAdViewContext().getAssets().open(str);
            e0.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            return new WebResourceResponse("image/png", C.UTF8_NAME, inputStreamOpen);
        } catch (Exception e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, a.b.k("Failed to get injection response: ", str), e10);
            return null;
        }
    }

    private final boolean matchesLocalInjectionUrl(String str) {
        try {
            Locale US = Locale.US;
            e0.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Uri uri = Uri.parse(lowerCase);
            if (uri != null) {
                return e0.areEqual("local", uri.getScheme());
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String url) {
        e0.checkNotNullParameter(url, "url");
        ApsAdExtensionsKt.d(this, "Page load completed: " + url);
        this.webviewClientListener.onPageFinished(url, webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        ApsAdExtensionsKt.e(this, "WebView client received OnReceivedError");
        try {
            this.webviewClientListener.onLoadError();
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onReceivedError method", e10);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail detail) {
        e0.checkNotNullParameter(detail, "detail");
        super.onRenderProcessGone(webView, detail);
        setCrashed(true);
        ApsAdExtensionsKt.e(this, "WebView client crashed");
        StringBuilder sb2 = new StringBuilder("Fail to render ad due to webView crash.");
        if (webView != null) {
            this.webviewClientListener.onCrash(webView, sb2, webView instanceof DTBAdView ? e2.m("Webview didCrash :%s , Webview rendererPriorityAtExit : %d", "format(...)", 2, new Object[]{Boolean.valueOf(detail.didCrash()), Integer.valueOf(detail.rendererPriorityAtExit())}) : "");
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            ApsAdExtensionsKt.d(this, "Should intercept Resource url: " + str);
            if (str == null || !matchesLocalInjectionUrl(str)) {
                return super.shouldInterceptRequest(webView, str);
            }
            String strSubstring = str.substring(n0.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null) + 1);
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return createImageInjectionResponse(strSubstring);
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute shouldInterceptRequest method", e10);
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null) {
            try {
                if (this.webviewClientListener.isTwoPartExpand()) {
                    return false;
                }
                return this.schemeHandler.openUrl(str);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute shouldOverrideUrlLoading method", e10);
            }
        }
        return false;
    }
}
