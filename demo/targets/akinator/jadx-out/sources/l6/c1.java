package l6;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c1 extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public final k6.z f72448a;

    public c1(k6.z zVar) {
        this.f72448a = zVar;
    }

    public k6.z getFrameworkRenderProcessClient() {
        return this.f72448a;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f72448a.onRenderProcessResponsive(webView, d1.forFrameworkObject(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f72448a.onRenderProcessUnresponsive(webView, d1.forFrameworkObject(webViewRenderProcess));
    }
}
