package com.ironsource;

import android.os.Build;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3445sa {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.sa$a */
    public static final class a implements InterfaceC3445sa {

        /* renamed from: a, reason: collision with root package name */
        private WebView f38374a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f38375b;

        public a() {
            this(0, 1, null);
        }

        private final void b(String str) {
            WebView webView = this.f38374a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f38374a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC3445sa
        public boolean a() {
            return this.f38374a != null;
        }

        public a(int i10) {
            this.f38375b = i10 >= 19;
        }

        @Override // com.ironsource.InterfaceC3445sa
        public void a(String script) {
            kotlin.jvm.internal.e0.checkNotNullParameter(script, "script");
            try {
                if (this.f38375b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                this.f38375b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @Override // com.ironsource.InterfaceC3445sa
        public void a(WebView webView) {
            kotlin.jvm.internal.e0.checkNotNullParameter(webView, "webView");
            this.f38374a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
