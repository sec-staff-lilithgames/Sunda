package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: e, reason: collision with root package name */
    public static g0 f29804e;

    /* renamed from: a, reason: collision with root package name */
    public String f29805a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f29806b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f29807c = null;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f29808d = new ArrayDeque();

    public static synchronized g0 a() {
        try {
            if (f29804e == null) {
                f29804e = new g0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29804e;
    }

    public static void setForTesting(g0 g0Var) {
        f29804e = g0Var;
    }

    public final boolean b(Context context) {
        if (this.f29807c == null) {
            this.f29807c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f29806b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f29807c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f29806b == null) {
            this.f29806b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f29806b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f29806b.booleanValue();
    }

    public int startMessagingService(Context context, Intent intent) {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        ComponentName componentNameStartService;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f29808d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (this) {
            try {
                str = this.f29805a;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                this.f29805a = context.getPackageName() + serviceInfo.name;
                            } else {
                                this.f29805a = serviceInfo.name;
                            }
                            str = this.f29805a;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (c(context)) {
                componentNameStartService = p0.b(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }
}
