package tm;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str;
        if (consoleMessage == null || consoleMessage.message() == null) {
            return false;
        }
        if (t.canSendDLog() && !consoleMessage.message().contains("Uncaught ReferenceError")) {
            String strMessage = consoleMessage.message();
            if (consoleMessage.sourceId() == null) {
                str = "";
            } else {
                str = " at " + consoleMessage.sourceId();
            }
            t.d("JS console", String.format("%s%s:%d", strMessage, str, Integer.valueOf(consoleMessage.lineNumber())), new Object[0]);
        }
        if (!t.canSendELog() || !consoleMessage.message().contains("AppodealAlert")) {
            return true;
        }
        t.e("Appodeal", consoleMessage.message().replace("AppodealAlert:", ""), new Object[0]);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        t.d("JS alert", str2, new Object[0]);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        t.d("JS confirm", str2, new Object[0]);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        t.d("JS prompt", str2, new Object[0]);
        jsPromptResult.confirm();
        return true;
    }
}
