package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Ta, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class CallableC1555Ta implements Callable<String> {
    public final /* synthetic */ SQ A00;

    public CallableC1555Ta(SQ sq2) {
        this.A00 = sq2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String call() {
        String browserUserAgent = (String) AbstractC1556Tb.A04.get();
        if (browserUserAgent != null) {
            return browserUserAgent;
        }
        WebView webView = new WebView(this.A00.getApplicationContext());
        webView.setWebViewClient(new TZ(this));
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        if (userAgentString != null) {
            AbstractC1556Tb.A04.set(userAgentString);
        }
        return userAgentString;
    }
}
