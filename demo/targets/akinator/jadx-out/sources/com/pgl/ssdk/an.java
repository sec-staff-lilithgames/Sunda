package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class an {

    /* renamed from: a, reason: collision with root package name */
    public static int f50408a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static String f50409b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f50410c = "api16-access-ttp.tiktokpangle.us";

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f50411d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* renamed from: e, reason: collision with root package name */
    private static int f50412e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public static String f50413f = "";

    public static String a() {
        return f50408a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f50413f;
    }

    public static void a(int i10) {
        f50408a = i10;
    }

    public static void b(String str) {
        f50413f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f50409b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f50409b)) {
            au.a("updateIndex");
            int i10 = f50412e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f50412e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f50412e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f50409b)) {
            return f50409b;
        }
        try {
            if (f50412e == Integer.MIN_VALUE) {
                f50412e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f50411d;
            return strArr[f50412e % strArr.length];
        } catch (Throwable unused) {
            return f50410c;
        }
    }
}
