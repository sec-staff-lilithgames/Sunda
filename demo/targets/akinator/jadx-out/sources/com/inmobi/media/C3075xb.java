package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3075xb {

    /* renamed from: a, reason: collision with root package name */
    public static String f33575a;

    /* renamed from: b, reason: collision with root package name */
    public static Ob f33576b;

    /* renamed from: c, reason: collision with root package name */
    public static final SignalsConfig f33577c;

    /* renamed from: d, reason: collision with root package name */
    public static int f33578d;

    /* renamed from: e, reason: collision with root package name */
    public static final tu.o f33579e;

    static {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        f33577c = (SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null);
        f33579e = tu.q.lazy(C3058wb.f33548a);
    }

    public static boolean a(Context context) throws PackageManager.NameNotFoundException {
        boolean zContains;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (!R3.Q()) {
            return false;
        }
        if (!((Boolean) f33579e.getValue()).booleanValue()) {
            Eb.a(new Ab((short) 2230));
            return false;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            zContains = uu.y0.contains(f33577c.getPurchases().getVersionList(), string);
            if (!zContains) {
                Eb.a(new Cb(string));
            }
        } catch (Exception unused) {
            zContains = false;
        }
        if (!zContains) {
            return false;
        }
        int i10 = f33578d;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        Eb.a(new Ab(i10 != 1 ? i10 != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }
}
