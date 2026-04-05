package com.bytedance.sdk.openadsdk.core.ju;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.openadsdk.core.settings.au;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    public static String jpo(String str) {
        return TextUtils.isEmpty(str) ? str : jpo(au.jrx().ree(), str);
    }

    public static String jpo(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith(DtbConstants.HTTP) || str2.startsWith(DtbConstants.HTTPS)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return i.d(str, "/static/", str2);
        }
        return i.d(str, "static/", str2);
    }
}
