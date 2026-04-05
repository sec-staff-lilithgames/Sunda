package io.bidmachine;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60583a = Build.MANUFACTURER + Build.MODEL;

    public static String a(Context context, String str) {
        StringBuilder sbU = p0.o2.u(str);
        sbU.append(f60583a);
        String string = sbU.toString();
        return pr.m.optString(jh.i.E(context), "hw_info_" + string, null);
    }

    public static void b(Context context, String str, String str2) {
        StringBuilder sbU = p0.o2.u(str);
        sbU.append(f60583a);
        String string = sbU.toString();
        pr.m.putString(jh.i.E(context), "hw_info_" + string, str2);
    }
}
