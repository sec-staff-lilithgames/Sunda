package com.bytedance.adsdk.jpo.jd.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static boolean cm(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean jd(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean jpo(char c10) {
        return c10 == ' ';
    }

    public static boolean wqx(char c10) {
        return c10 >= '0' && c10 <= '9';
    }
}
