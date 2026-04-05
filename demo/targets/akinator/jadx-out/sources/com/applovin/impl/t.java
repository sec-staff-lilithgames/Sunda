package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class t extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f15717a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f15718b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.adview.a f15719c;

    public t(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        this.f15717a = kVar;
        this.f15718b = kVar.O();
        this.f15719c = aVar;
    }

    private void a(String str, ConsoleMessage consoleMessage) {
        com.applovin.impl.sdk.ad.b bVarG = this.f15719c.g();
        if (bVarG != null) {
            String str2 = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            String strConcat = str == null ? "AdWebView" : "AdWebView:".concat(str);
            Map mapA = e2.a((AppLovinAdImpl) bVarG);
            mapA.putAll(e2.a(bVarG));
            mapA.put("source", strConcat);
            mapA.put("top_main_method", str2);
            mapA.put("error_message", consoleMessage.message());
            this.f15717a.E().d(c2.L0, mapA);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.o.a()) {
            this.f15718b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        String strMessage = consoleMessage.message();
        if (strMessage.contains("al_onPoststitialShow")) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
            a("onPoststitialShowEvaluationError", consoleMessage);
        } else if (strMessage.contains("SyntaxError")) {
            a(null, consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f15718b.k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f15718b.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f15718b.k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        com.applovin.impl.adview.a aVar;
        if (i10 != 100 || (aVar = this.f15719c) == null) {
            return;
        }
        aVar.c(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15718b.k("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }
}
