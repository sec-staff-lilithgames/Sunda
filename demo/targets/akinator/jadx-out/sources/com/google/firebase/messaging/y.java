package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29901a;

    /* renamed from: b, reason: collision with root package name */
    public String f29902b;

    /* renamed from: c, reason: collision with root package name */
    public String f29903c;

    /* renamed from: d, reason: collision with root package name */
    public int f29904d;

    /* renamed from: e, reason: collision with root package name */
    public int f29905e = 0;

    public y(Context context) {
        this.f29901a = context;
    }

    public static String b(com.google.firebase.g gVar) {
        String gcmSenderId = gVar.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = gVar.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public final synchronized String a() {
        try {
            if (this.f29902b == null) {
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f29902b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f29901a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003f, B:21:0x0045, B:24:0x004a, B:26:0x005d, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:35:0x007a, B:34:0x0078), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f29905e     // Catch: java.lang.Throwable -> L25
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7d
        La:
            android.content.Context r0 = r5.f29901a     // Catch: java.lang.Throwable -> L25
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L25
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r2
            goto L7d
        L25:
            r0 = move-exception
            goto L81
        L27:
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L4a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L4a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
            if (r3 <= 0) goto L4a
            r5.f29905e = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r1
            goto L7d
        L4a:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L25
            r3 = 2
            if (r0 == 0) goto L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L68
            r5.f29905e = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r3
            goto L7d
        L68:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L25
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L78
            r5.f29905e = r3     // Catch: java.lang.Throwable -> L25
            goto L7a
        L78:
            r5.f29905e = r1     // Catch: java.lang.Throwable -> L25
        L7a:
            int r0 = r5.f29905e     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
        L7d:
            if (r0 == 0) goto L80
            return r1
        L80:
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.d():boolean");
    }

    public final synchronized void e() {
        PackageInfo packageInfoC = c(this.f29901a.getPackageName());
        if (packageInfoC != null) {
            this.f29902b = Integer.toString(packageInfoC.versionCode);
            this.f29903c = packageInfoC.versionName;
        }
    }
}
