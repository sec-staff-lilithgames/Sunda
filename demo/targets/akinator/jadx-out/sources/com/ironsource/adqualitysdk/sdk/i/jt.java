package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.az;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class jt implements jm {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Map<WebView, jt> f3068 = new WeakHashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private jp f3069;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Set<jm> f3070 = new HashSet();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f3071;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jt$5, reason: invalid class name */
    public class AnonymousClass5 extends WebChromeClient {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3076 = false;

        public AnonymousClass5() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jt.this.mo589(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            if (i10 != 100 || this.f3076) {
                return;
            }
            this.f3076 = true;
            jt.this.mo588(webView);
        }
    }

    private jt(WebView webView, String str) {
        this.f3071 = str;
        jp jpVar = new jp(webView);
        this.f3069 = jpVar;
        jpVar.m3037(new AnonymousClass2());
        this.f3069.m3034(new AnonymousClass5());
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final az.e m3052() {
        return this.f3069.m3033();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3054(jm jmVar) {
        this.f3070.remove(jmVar);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m3055() {
        this.f3069.m3034(new AnonymousClass5());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3057() {
        this.f3069.m3037(new AnonymousClass2());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jt$2, reason: invalid class name */
    public class AnonymousClass2 extends WebViewClient {

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3075 = false;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f3072 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f3074 = null;

        public AnonymousClass2() {
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean m3059(WebView webView) {
            if (this.f3075 && this.f3072) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f3074 == null || webView.getOriginalUrl().equals(this.f3074)) ? false : true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            jt.this.mo588(webView);
            this.f3075 = false;
            this.f3072 = true;
            if (this.f3074 == null) {
                this.f3074 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            jt.this.mo588(webView);
            this.f3075 = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m3060(webView, str)) {
                return true;
            }
            if (this.f3074 == null) {
                this.f3074 = webView.getOriginalUrl();
            }
            jt.this.mo587(webView, str, m3059(webView));
            this.f3072 = true;
            this.f3075 = false;
            return false;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean m3060(WebView webView, String str) {
            if (!str.startsWith(jt.this.f3071)) {
                return false;
            }
            this.f3074 = webView.getOriginalUrl();
            String strSubstring = str.substring(jt.this.f3071.length());
            jt jtVar = jt.this;
            jtVar.mo586(webView, jtVar.f3071, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static jt m3050(WebView webView, String str) {
        jt jtVar = f3068.get(webView);
        if (jtVar != null) {
            return jtVar;
        }
        jt jtVar2 = new jt(webView, str);
        f3068.put(webView, jtVar2);
        return jtVar2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WebView m3053() {
        return this.f3069.m3036();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jm
    /* renamed from: ﻛ */
    public final void mo586(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f3070).iterator();
        while (it.hasNext()) {
            jm jmVar = (jm) it.next();
            if (jmVar != null) {
                jmVar.mo586(webView, str, str2);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3058(jm jmVar) {
        this.f3070.add(jmVar);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m3056() {
        return this.f3069.m3035();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jm
    /* renamed from: ﾒ */
    public final void mo588(WebView webView) {
        Iterator it = new HashSet(this.f3070).iterator();
        while (it.hasNext()) {
            jm jmVar = (jm) it.next();
            if (jmVar != null) {
                jmVar.mo588(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jm
    /* renamed from: ﻛ */
    public final void mo587(WebView webView, String str, boolean z10) {
        Iterator it = new HashSet(this.f3070).iterator();
        while (it.hasNext()) {
            jm jmVar = (jm) it.next();
            if (jmVar != null) {
                jmVar.mo587(webView, str, z10);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jm
    /* renamed from: ﾒ */
    public final void mo589(WebView webView, String str) {
        Iterator it = new HashSet(this.f3070).iterator();
        while (it.hasNext()) {
            jm jmVar = (jm) it.next();
            if (jmVar != null) {
                jmVar.mo589(webView, str);
            }
        }
    }
}
