package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b1 {
    public static String a(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? "" : new URL(str).getHost();
        } catch (Exception e10) {
            p0.b("UriUtil", e10.getMessage());
            return "";
        }
    }

    public static String b(String str) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : new URL(str).getPath();
        } catch (Exception e10) {
            p0.b("UriUtil", e10.getMessage());
            return "";
        }
    }

    public static int c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            if (URLUtil.isValidUrl(str) || e(str)) {
                return Uri.parse(str).getQueryParameterNames().size();
            }
            return 0;
        } catch (Exception e10) {
            p0.b("UriUtil", e10.getMessage());
            return 0;
        }
    }

    public static String d(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        } catch (Exception e10) {
            p0.b("UriUtil", e10.getMessage());
            return "";
        }
    }

    public static boolean e(String str) {
        return str != null && str.length() > 5 && str.substring(0, 6).equalsIgnoreCase("tcp://");
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e10) {
            p0.b("UriUtil", e10.getMessage());
            return "";
        }
    }
}
