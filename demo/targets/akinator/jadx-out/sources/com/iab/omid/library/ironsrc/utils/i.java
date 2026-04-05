package com.iab.omid.library.ironsrc.utils;

import android.webkit.WebView;
import java.util.Set;
import k6.u;
import k6.v;

/* loaded from: classes7.dex */
public class i {
    public void a(WebView webView, String str) {
        v.removeWebMessageListener(webView, str);
    }

    public void a(WebView webView, String str, Set<String> set, u uVar) {
        v.addWebMessageListener(webView, str, set, uVar);
    }
}
