package vm;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        io.bidmachine.iab.vast.e.d("JS alert", str2, new Object[0]);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        io.bidmachine.iab.vast.e.d("JS confirm", str2, new Object[0]);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        io.bidmachine.iab.vast.e.d("JS prompt", str2, new Object[0]);
        jsPromptResult.cancel();
        return true;
    }
}
