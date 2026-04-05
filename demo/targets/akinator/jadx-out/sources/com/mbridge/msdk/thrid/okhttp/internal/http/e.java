package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.y;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.mbridge.msdk.thrid.okio.f f43376a = com.mbridge.msdk.thrid.okio.f.c("\"\\");

    /* renamed from: b, reason: collision with root package name */
    private static final com.mbridge.msdk.thrid.okio.f f43377b = com.mbridge.msdk.thrid.okio.f.c("\t ,=");

    public static long a(y yVar) {
        return a(yVar.m());
    }

    public static boolean b(y yVar) {
        if (yVar.r().e().equals("HEAD")) {
            return false;
        }
        int iK = yVar.k();
        return (((iK >= 100 && iK < 200) || iK == 204 || iK == 304) && a(yVar) == -1 && !"chunked".equalsIgnoreCase(yVar.b("Transfer-Encoding"))) ? false : true;
    }

    public static long a(p pVar) {
        return a(pVar.b("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(com.mbridge.msdk.thrid.okhttp.k kVar, q qVar, p pVar) {
        if (kVar == com.mbridge.msdk.thrid.okhttp.k.f43658a) {
            return;
        }
        List<com.mbridge.msdk.thrid.okhttp.j> listA = com.mbridge.msdk.thrid.okhttp.j.a(qVar, pVar);
        if (listA.isEmpty()) {
            return;
        }
        kVar.a(qVar, listA);
    }

    public static int b(String str, int i10) {
        char cCharAt;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\t')) {
            i10++;
        }
        return i10;
    }

    public static int a(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int a(String str, int i10) throws NumberFormatException {
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
