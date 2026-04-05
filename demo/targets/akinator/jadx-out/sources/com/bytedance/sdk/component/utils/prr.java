package com.bytedance.sdk.component.utils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr {

    /* renamed from: jd, reason: collision with root package name */
    private static int f19006jd = 4;
    private static boolean jpo = false;
    private static String wqx = "";

    public static boolean cm() {
        return jpo;
    }

    public static void jd() {
        jpo = true;
        jpo(3);
    }

    public static void jpo(String str) {
        wqx = str;
    }

    public static void wqx() {
        jpo = false;
        jpo(7);
    }

    public static void jpo(int i10) {
        f19006jd = i10;
    }

    public static boolean jpo() {
        return f19006jd <= 3;
    }
}
