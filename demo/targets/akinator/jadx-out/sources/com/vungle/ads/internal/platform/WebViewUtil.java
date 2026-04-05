package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.z;
import w3.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewUtil {
    public static final WebViewUtil INSTANCE = new WebViewUtil();
    private static final String TAG = "WebViewUtil";

    private WebViewUtil() {
    }

    public final void applyWebSettings(WebView webView, AdPayload.WebViewSettings webViewSettings) {
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        e0.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        e0.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((webViewSettings == null || (allowFileAccessFromFileUrls = webViewSettings.getAllowFileAccessFromFileUrls()) == null) ? false : allowFileAccessFromFileUrls.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((webViewSettings == null || (allowUniversalAccessFromFileUrls = webViewSettings.getAllowUniversalAccessFromFileUrls()) == null) ? false : allowUniversalAccessFromFileUrls.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public final void getUserAgent(Context context, b consumer) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(consumer, "consumer");
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7137isSuccessimpl(objM7131constructorimpl)) {
            consumer.accept((String) objM7131constructorimpl);
        }
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            Logger.Companion.e(TAG, "Failed to get user agent", thM7134exceptionOrNullimpl);
            consumer.accept(null);
        }
    }
}
