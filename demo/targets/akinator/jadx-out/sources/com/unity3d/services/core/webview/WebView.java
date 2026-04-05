package com.unity3d.services.core.webview;

import af.g;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.ironsource.lh;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import k6.l;
import k6.v;
import k6.w;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o3.c;
import sv.d0;
import tu.a0;
import tu.o;
import tu.q;
import tu.s;
import tu.z;
import uu.b2;
import w0.i;
import x3.e3;
import x3.t3;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final o sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        e0.checkNotNullParameter(context, "context");
    }

    private final void applySafeAreaInsets() {
        z1.setOnApplyWindowInsetsListener(this, new g(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e3 applySafeAreaInsets$lambda$3(WebView this$0, View v10, e3 insets) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(v10, "v");
        e0.checkNotNullParameter(insets, "insets");
        c insets2 = insets.getInsets(t3.systemBars());
        e0.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        c insets3 = insets.getInsets(t3.displayCutout());
        e0.checkNotNullExpressionValue(insets3, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Float fValueOf = Float.valueOf(1.0f);
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = fValueOf;
        }
        float fFloatValue = ((Number) objM7131constructorimpl).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.f77432a, insets3.f77432a), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.f77433b, insets3.f77433b), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.f77434c, insets3.f77434c), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.f77435d, insets3.f77435d), fFloatValue);
        StringBuilder sbF = i.f(iApplySafeAreaInsets$lambda$3$toPx, iApplySafeAreaInsets$lambda$3$toPx3, "\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", "px');\n                    root.style.setProperty('--safe-area-inset-right', '", "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        sbF.append(iApplySafeAreaInsets$lambda$3$toPx2);
        sbF.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        sbF.append(iApplySafeAreaInsets$lambda$3$toPx4);
        sbF.append("px');\n                })();\n            ");
        this$0.evaluateJavascript(d0.trimIndent(sbF.toString()), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String script, ValueCallback<String> valueCallback) {
        e0.checkNotNullParameter(script, "script");
        Utilities.runOnUiThread(new lh(this, 15, script, valueCallback));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        e0.checkNotNullParameter(url, "url");
        DeviceLog.debug("Loading url: " + url);
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10) {
        this(context, z10, null, null, null, 28, null);
        e0.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge) {
        this(context, z10, webViewBridge, null, null, 24, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker) {
        this(context, z10, webViewBridge, callbackInvoker, null, 16, null);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(webViewBridge, "webViewBridge");
        e0.checkNotNullParameter(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i10 & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i10 & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z10, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker, IExperiments experiments) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(webViewBridge, "webViewBridge");
        e0.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        e0.checkNotNullParameter(experiments, "experiments");
        this.sdkMetricsSender$delegate = q.lazy(s.f87405e, (kv.a) new WebView$special$$inlined$inject$default$1(this, ""));
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z10);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = experiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zIsFeatureSupported = w.isFeatureSupported("WEB_MESSAGE_LISTENER");
        if (zIsFeatureSupported) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zIsFeatureSupported) {
            final int i10 = 0;
            v.addWebMessageListener(this, "handleInvocation", b2.setOf("*"), new k6.u() { // from class: com.unity3d.services.core.webview.a
                @Override // k6.u
                public final void onPostMessage(android.webkit.WebView webView, l lVar, Uri uri, boolean z11, k6.a aVar) throws Exception {
                    switch (i10) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, lVar, uri, z11, aVar);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, lVar, uri, z11, aVar);
                            break;
                    }
                }
            });
            final int i11 = 1;
            v.addWebMessageListener(this, "handleCallback", b2.setOf("*"), new k6.u() { // from class: com.unity3d.services.core.webview.a
                @Override // k6.u
                public final void onPostMessage(android.webkit.WebView webView, l lVar, Uri uri, boolean z11, k6.a aVar) throws Exception {
                    switch (i11) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, lVar, uri, z11, aVar);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, lVar, uri, z11, aVar);
                            break;
                    }
                }
            });
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}
