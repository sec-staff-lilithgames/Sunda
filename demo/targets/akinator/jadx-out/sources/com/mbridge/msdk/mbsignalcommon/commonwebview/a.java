package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<WebChromeClient> f41872a = new CopyOnWriteArrayList<>();

    public void a(WebChromeClient webChromeClient) {
        this.f41872a.add(webChromeClient);
    }

    public void b(WebChromeClient webChromeClient) {
        this.f41872a.remove(webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i10, String str2) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onConsoleMessage(str, i10, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnCreateWindow = false;
        while (it.hasNext()) {
            zOnCreateWindow = it.next().onCreateWindow(webView, z10, z11, message);
        }
        return zOnCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onExceededDatabaseQuota(str, str2, j10, j11, j12, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnJsAlert = false;
        while (it.hasNext()) {
            zOnJsAlert = it.next().onJsAlert(webView, str, str2, jsResult);
        }
        return zOnJsAlert;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnJsBeforeUnload = false;
        while (it.hasNext()) {
            zOnJsBeforeUnload = it.next().onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return zOnJsBeforeUnload;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnJsConfirm = false;
        while (it.hasNext()) {
            zOnJsConfirm = it.next().onJsConfirm(webView, str, str2, jsResult);
        }
        return zOnJsConfirm;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnJsPrompt = false;
        while (it.hasNext()) {
            zOnJsPrompt = it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return zOnJsPrompt;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnJsTimeout = false;
        while (it.hasNext()) {
            zOnJsTimeout = it.next().onJsTimeout();
        }
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f41872a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequest(permissionRequest);
            }
        } catch (Exception e10) {
            p0.b("CommonWebChromeClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f41872a.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Exception e10) {
            p0.b("CommonWebChromeClient", e10.getMessage());
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTouchIconUrl(webView, str, z10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean zOnShowFileChooser = false;
        try {
            Iterator<WebChromeClient> it = this.f41872a.iterator();
            while (it.hasNext()) {
                zOnShowFileChooser = it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            return zOnShowFileChooser;
        } catch (Exception e10) {
            p0.b("CommonWebChromeClient", e10.getMessage());
            return zOnShowFileChooser;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        boolean zOnConsoleMessage = false;
        while (it.hasNext()) {
            zOnConsoleMessage = it.next().onConsoleMessage(consoleMessage);
        }
        return zOnConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f41872a.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, i10, customViewCallback);
        }
    }
}
