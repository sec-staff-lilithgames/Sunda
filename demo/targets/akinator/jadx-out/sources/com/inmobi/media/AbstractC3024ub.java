package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3024ub {

    /* renamed from: a, reason: collision with root package name */
    public static int f33453a = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f33454b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f33455c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f33456d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f33457e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f33458f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f33459g = null;

    /* renamed from: h, reason: collision with root package name */
    public static String f33460h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f33461i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public static String f33462j;

    /* renamed from: k, reason: collision with root package name */
    public static String f33463k;

    /* renamed from: l, reason: collision with root package name */
    public static String f33464l;

    /* renamed from: m, reason: collision with root package name */
    public static String f33465m;

    /* renamed from: n, reason: collision with root package name */
    public static Location f33466n;

    public static void a(boolean z10) {
        f33454b = Boolean.valueOf(z10);
        Context contextD = C2925od.d();
        if (contextD != null) {
            C2925od.a(new com.applovin.impl.k9(contextD, z10, 13));
        }
    }

    public static Location b() {
        Location location = f33466n;
        if (location != null) {
            return location;
        }
        Context contextD = C2925od.d();
        Location location2 = null;
        if (contextD == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(contextD, "user_info_store");
        kotlin.jvm.internal.e0.checkNotNullParameter("user_location", C3191e4.h.W);
        String string = i6A.f31866a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new sv.x(",").split(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f33466n = location2;
        return location2;
    }

    public static boolean c() {
        Boolean bool = f33454b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6 i6A = H6.a(contextD, "user_info_store");
            kotlin.jvm.internal.e0.checkNotNullParameter("user_age_restricted", C3191e4.h.W);
            f33454b = Boolean.valueOf(i6A.f31866a.getBoolean("user_age_restricted", false));
        }
        Boolean bool2 = f33454b;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static final void a(Context it, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6.a(H6.a(it, "user_info_store"), "user_age_restricted", z10, false, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap a() {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3024ub.a():java.util.HashMap");
    }
}
