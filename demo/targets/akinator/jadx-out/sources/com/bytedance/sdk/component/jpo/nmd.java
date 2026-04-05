package com.bytedance.sdk.component.jpo;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import b3.h;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd extends jpo {

    /* renamed from: yd, reason: collision with root package name */
    static final /* synthetic */ boolean f18769yd = true;
    protected String xyk;
    protected WebView zz;

    public void cm() {
        this.zz.removeJavascriptInterface(this.xyk);
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    public void jd(zz zzVar) {
        this.zz = zzVar.jpo;
        this.xyk = zzVar.wqx;
        if (zzVar.f18785au) {
            return;
        }
        wqx();
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    public Context jpo(zz zzVar) {
        Context context = zzVar.my;
        if (context != null) {
            return context;
        }
        WebView webView = zzVar.jpo;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    public void wqx() {
        if (!f18769yd && this.zz == null) {
            throw new AssertionError();
        }
        this.zz.addJavascriptInterface(this, this.xyk);
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    public void jd() {
        super.jd();
        cm();
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    public String jpo() {
        return this.zz.getUrl();
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    public void jpo(String str, oya oyaVar) {
        if (oyaVar != null && !TextUtils.isEmpty(oyaVar.xyk)) {
            String str2 = oyaVar.xyk;
            jpo(str, o2.o(h.b("javascript:(function(){   const iframe = document.querySelector(atob('", Base64.encodeToString(("iframe[src=\"" + str2 + "\"").getBytes(), 2), "'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(", str, ", atob('"), Base64.encodeToString(str2.getBytes(), 2), "'));   }})()"));
            return;
        }
        super.jpo(str, oyaVar);
    }

    @Override // com.bytedance.sdk.component.jpo.jpo
    public void jpo(String str) {
        jpo(str, p0.o2.r(new StringBuilder("javascript:"), this.xyk, "._handleMessageFromToutiao(", str, ")"));
    }

    private void jpo(String str, final String str2) {
        if (this.f18765jj || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.jpo.nmd.1
            @Override // java.lang.Runnable
            public void run() {
                if (nmd.this.f18765jj) {
                    return;
                }
                try {
                    nmd.this.zz.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f18763cm.post(runnable);
        } else {
            runnable.run();
        }
    }
}
