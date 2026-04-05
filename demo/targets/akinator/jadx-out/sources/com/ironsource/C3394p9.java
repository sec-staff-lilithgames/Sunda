package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C3394p9 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38158a = "IntegrationHelper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f38159b = "getNetworkSDKVersion";

    /* renamed from: c, reason: collision with root package name */
    private static final String f38160c = "getAdapterSDKVersion";

    /* renamed from: d, reason: collision with root package name */
    private static final String f38161d = "getAdapterVersion";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38162e = "getVersion";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.p9$a */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38163a;

        public a(Context context) {
            this.f38163a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C3394p9.f38158a, "--------------- Google Play Services --------------");
                if (!this.f38163a.getPackageManager().getApplicationInfo(this.f38163a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(C3394p9.f38158a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(C3394p9.f38158a, "Google Play Services - VERIFIED");
                String strB = com.ironsource.mediationsdk.r.m().b(this.f38163a);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                Log.i(C3394p9.f38158a, "GAID is: " + strB + " (use this for test devices)");
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                Log.e(C3394p9.f38158a, "Google Play Services - MISSING");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r8, java.lang.String r9) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r8 = "IntegrationHelper"
            java.lang.String r0 = "com.ironsource.adapters."
            java.lang.String r1 = "--------------- "
            r2 = 0
            java.lang.String r3 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch: java.lang.Exception -> L2b
            int r4 = r3.hashCode()     // Catch: java.lang.Exception -> L2b
            r5 = -805296079(0xffffffffd0002831, float:-8.600471E9)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L38
            r5 = 92668925(0x58603fd, float:1.2602765E-35)
            if (r4 == r5) goto L2e
            r5 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r4 == r5) goto L21
            goto L42
        L21:
            java.lang.String r4 = "facebook"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L42
            r3 = r2
            goto L43
        L2b:
            r0 = move-exception
            goto Ld1
        L2e:
            java.lang.String r4 = "admob"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L42
            r3 = r7
            goto L43
        L38:
            java.lang.String r4 = "vungle"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L42
            r3 = r6
            goto L43
        L42:
            r3 = -1
        L43:
            if (r3 == 0) goto L6a
            if (r3 == r7) goto L64
            if (r3 == r6) goto L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r3.<init>(r1)     // Catch: java.lang.Exception -> L2b
            r3.append(r9)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = " --------------"
            r3.append(r1)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L2b
            android.util.Log.i(r8, r1)     // Catch: java.lang.Exception -> L2b
            goto L6f
        L5e:
            java.lang.String r1 = "--------------- Liftoff Monetization --------------"
            android.util.Log.i(r8, r1)     // Catch: java.lang.Exception -> L2b
            goto L6f
        L64:
            java.lang.String r1 = "--------------- Google (AdMob and Ad Manager) --------------"
            android.util.Log.i(r8, r1)     // Catch: java.lang.Exception -> L2b
            goto L6f
        L6a:
            java.lang.String r1 = "--------------- Meta --------------"
            android.util.Log.i(r8, r1)     // Catch: java.lang.Exception -> L2b
        L6f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = com.ironsource.environment.StringUtils.toLowerCase(r9)     // Catch: java.lang.Exception -> L2b
            r1.append(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "."
            r1.append(r0)     // Catch: java.lang.Exception -> L2b
            r1.append(r9)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "Adapter"
            r1.append(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L2b
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5 java.lang.NoSuchMethodException -> La7
            java.lang.reflect.Constructor r1 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5 java.lang.NoSuchMethodException -> La7
            java.lang.Object[] r3 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5 java.lang.NoSuchMethodException -> La7
            java.lang.Object r0 = r1.newInstance(r3)     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5 java.lang.NoSuchMethodException -> La7
            goto Lb0
        La3:
            r0 = move-exception
            goto Lb7
        La5:
            r0 = move-exception
            goto Lc4
        La7:
            r1 = 0
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> La3 java.lang.ClassNotFoundException -> La5
        Lb0:
            b(r0)     // Catch: java.lang.Exception -> L2b
            a(r0)     // Catch: java.lang.Exception -> L2b
            return r7
        Lb7:
            com.ironsource.r4 r1 = com.ironsource.C3422r4.d()     // Catch: java.lang.Exception -> L2b
            r1.a(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "Failed to instantiate adapter"
            android.util.Log.e(r8, r0)     // Catch: java.lang.Exception -> L2b
            return r2
        Lc4:
            com.ironsource.r4 r1 = com.ironsource.C3422r4.d()     // Catch: java.lang.Exception -> L2b
            r1.a(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "Adapter - MISSING"
            android.util.Log.e(r8, r0)     // Catch: java.lang.Exception -> L2b
            return r2
        Ld1:
            com.ironsource.r4 r1 = com.ironsource.C3422r4.d()
            r1.a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "isAdapterValid "
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.e(r8, r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3394p9.a(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3394p9.b(android.content.Context):void");
    }

    private static void c(Context context) {
        Log.i(f38158a, "*** Permissions ***");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            Log.i(f38158a, "android.permission.INTERNET - VERIFIED");
        } else {
            Log.e(f38158a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            Log.i(f38158a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            Log.e(f38158a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    private static void b(Object obj) {
        String str;
        try {
            Class<?> cls = obj.getClass();
            if (obj instanceof LevelPlayBaseAdapter) {
                str = f38159b;
            } else {
                str = f38160c;
            }
            Log.i(f38158a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Log.w(f38158a, "Unable to get SDK version");
        }
    }

    private static void a(Context context) {
        new a(context).start();
    }

    private static void a(Object obj) {
        try {
            Log.i(f38158a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f38161d : "getVersion", null).invoke(obj, null)));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Log.w(f38158a, "Unable to get adapter version");
        }
    }
}
