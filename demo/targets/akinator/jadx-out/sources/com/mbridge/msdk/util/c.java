package com.mbridge.msdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f44148a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f44149b = "";

    public static void a() {
        if (c()) {
            try {
                GoogleApiAvailability.getInstance().getApkVersion(com.mbridge.msdk.foundation.controller.c.m().d());
                GoogleApiAvailability.getInstance().verifyGooglePlayServicesIsAvailable(com.mbridge.msdk.foundation.controller.c.m().d(), 11925000);
                try {
                    String strB = b();
                    boolean zIsEmpty = TextUtils.isEmpty(strB);
                    f44148a = !zIsEmpty;
                    if (zIsEmpty) {
                        return;
                    }
                    f44149b = strB;
                } catch (Throwable th2) {
                    p0.b("CronetEnvCheckUtil", th2.getMessage());
                }
            } catch (Throwable th3) {
                p0.b("CronetEnvCheckUtil", th3.getMessage());
                f44148a = false;
            }
        }
    }

    private static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb2 = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.m().d().getClassLoader();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.m().d()).getClass().getName())) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(pair.first);
                    }
                } catch (Throwable th2) {
                    p0.b("CronetEnvCheckUtil", th2.getMessage());
                }
            }
            return sb2.toString();
        } catch (Throwable th3) {
            p0.b("CronetEnvCheckUtil", th3.getMessage());
            return "";
        }
    }

    public static boolean c() {
        return r0.a().a("cronet_env_check", false);
    }
}
