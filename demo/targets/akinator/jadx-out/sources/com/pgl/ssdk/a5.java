package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static int f50350a = 504;

    /* renamed from: b, reason: collision with root package name */
    public static String f50351b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f50352c = "";

    /* renamed from: d, reason: collision with root package name */
    static boolean f50353d;

    /* renamed from: e, reason: collision with root package name */
    private static long f50354e;

    /* renamed from: f, reason: collision with root package name */
    private static Context f50355f;

    public static void a(Context context, String str) {
        if (f50355f == null) {
            f50355f = context;
        }
        int i10 = f50350a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f50354e = System.currentTimeMillis();
        f50353d = false;
        f50351b = str;
        f50350a = 102;
        ar.b(new ao(context, Sdk.SDKError.Reason.MRAID_ERROR_VALUE, null));
    }

    public static void b() {
        Context context = f50355f;
        if (context != null) {
            ar.b(new ao(context, Sdk.SDKError.Reason.MRAID_ERROR_VALUE, null));
            f50350a = 102;
            com.pgl.ssdk.ces.b.h().a();
            z.a();
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f50352c)) {
                f50352c = (String) com.pgl.ssdk.ces.a.meta(303, f50355f, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f50352c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, f50355f, bArr);
    }
}
