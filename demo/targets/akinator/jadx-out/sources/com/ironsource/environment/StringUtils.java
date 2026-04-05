package com.ironsource.environment;

import com.ironsource.C3422r4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class StringUtils {
    public static String decodeURI(String str) {
        try {
            return URLDecoder.decode(str, C.UTF8_NAME);
        } catch (UnsupportedEncodingException e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    public static String encodeURI(String str) {
        try {
            return URLEncoder.encode(str, C.UTF8_NAME).replace("+", "%20");
        } catch (UnsupportedEncodingException e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ENGLISH);
    }

    public static String toUpperCase(String str) {
        return str == null ? "" : str.toUpperCase(Locale.ENGLISH);
    }
}
