package tm;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.controller.f;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f87138a;

    public v0(w0 w0Var) {
        this.f87138a = w0Var;
    }

    public final void a(String str, String str2, int i10) {
        t.d("MraidWebViewController", "onError: %s / %s / %d", str, str2, Integer.valueOf(i10));
        if (str2 == null || !str2.contains("ERR_INTERNET_DISCONNECTED")) {
            return;
        }
        this.f87138a.f87144e = true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        t.d("MraidWebViewController", "onPageFinished", new Object[0]);
        w0 w0Var = this.f87138a;
        if (w0Var.f87142c) {
            return;
        }
        w0Var.f87142c = true;
        w0Var.f87140a.onPageFinished(str);
        w0Var.getWebView().onPageFinished();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        t.d("MraidWebViewController", "onPageStarted", new Object[0]);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url = webResourceRequest.getUrl();
        a(url != null ? url.toString() : null, webResourceError.getDescription().toString(), webResourceError.getErrorCode());
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        t.d("MraidWebViewController", "onRenderProcessGone", new Object[0]);
        w0 w0Var = this.f87138a;
        w0Var.destroy();
        ((k) w0Var.f87140a).onError(qm.b.internal("WebViewClient - onRenderProcessGone"));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (!"mraid.js".equals(webResourceRequest.getUrl().getLastPathSegment())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        String strC = d0.c();
        Charset charset = StandardCharsets.UTF_8;
        return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(strC.getBytes(charset)));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Map<String, String> commandUrl;
        boolean zStartsWith = str.startsWith("mraid://");
        w0 w0Var = this.f87138a;
        if (!zStartsWith) {
            if (rm.b.isHandled(str)) {
                rm.b.handleJsCommand(w0Var.f87141b, str);
                return true;
            }
            w0Var.c(str);
            return true;
        }
        t.d("MraidWebViewController", "handleJsCommand - %s", str);
        try {
            commandUrl = d0.parseCommandUrl(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (commandUrl == null) {
            return true;
        }
        String str2 = commandUrl.get(f.b.f38561g);
        if (str2 == null) {
            t.w("MraidWebViewController", "handleJsCommand not found", new Object[0]);
            return true;
        }
        w0Var.a(str2, commandUrl);
        w0Var.b("mraid.nativeCallComplete();");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        a(str2, str, i10);
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if ("mraid.js".equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment())) {
            String strC = d0.c();
            Charset charset = StandardCharsets.UTF_8;
            return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(strC.getBytes(charset)));
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
