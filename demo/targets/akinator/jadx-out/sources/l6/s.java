package l6;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {
    @Deprecated
    public static int getForceDark(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess getWebViewRenderProcess(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient getWebViewRenderProcessClient(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void setForceDark(WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, k6.z zVar) {
        webView.setWebViewRenderProcessClient(executor, zVar != null ? new c1(zVar) : null);
    }

    public static boolean terminate(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }

    public static void setWebViewRenderProcessClient(WebView webView, k6.z zVar) {
        webView.setWebViewRenderProcessClient(zVar != null ? new c1(zVar) : null);
    }
}
