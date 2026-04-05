package l6;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import k6.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static void close(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage createWebMessage(k6.l lVar) {
        return new WebMessage(lVar.getData(), n0.compatToPorts(lVar.getPorts()));
    }

    public static WebMessagePort[] createWebMessageChannel(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static k6.l createWebMessageCompat(WebMessage webMessage) {
        return new k6.l(webMessage.getData(), n0.portsToCompat(webMessage.getPorts()));
    }

    public static CharSequence getDescription(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int getErrorCode(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean getOffscreenPreRaster(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void postMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void postVisualStateCallback(WebView webView, long j10, k6.t tVar) {
        webView.postVisualStateCallback(j10, new m());
    }

    public static void postWebMessage(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void setOffscreenPreRaster(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, m.a aVar) {
        webMessagePort.setWebMessageCallback(new k(aVar));
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, m.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new l(aVar), handler);
    }
}
