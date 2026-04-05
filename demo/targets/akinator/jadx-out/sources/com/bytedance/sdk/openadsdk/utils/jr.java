package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr {
    public static void jpo(Uri uri, com.bytedance.sdk.openadsdk.core.ef efVar) {
        if (efVar == null || !efVar.jpo(uri)) {
            return;
        }
        try {
            efVar.jd(uri);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static String jpo(WebView webView, int i10) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i10;
    }
}
