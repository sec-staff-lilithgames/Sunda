package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f29856h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f29857i;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f29858j;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29859b;

    /* renamed from: c, reason: collision with root package name */
    public final y f29860c;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f29861e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f29862f;

    /* renamed from: g, reason: collision with root package name */
    public final long f29863g;

    public o0(n0 n0Var, Context context, y yVar, long j10) {
        this.f29862f = n0Var;
        this.f29859b = context;
        this.f29863g = j10;
        this.f29860c = yVar;
        this.f29861e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f29856h) {
            try {
                Boolean bool = f29858j;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f29858j = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f29856h) {
            try {
                Boolean bool = f29857i;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f29857i = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f29859b     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.o0.d():boolean");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.firebase.messaging.TopicsSyncTask$ConnectivityChangeReceiver] */
    @Override // java.lang.Runnable
    public void run() {
        n0 n0Var = this.f29862f;
        Context context = this.f29859b;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f29861e;
        if (zC) {
            wakeLock.acquire(j.f29820a);
        }
        try {
            try {
                try {
                    n0Var.e(true);
                    if (!this.f29860c.d()) {
                        n0Var.e(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || d()) {
                        if (n0Var.g()) {
                            n0Var.e(false);
                        } else {
                            n0Var.h(this.f29863g);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new BroadcastReceiver(this) { // from class: com.google.firebase.messaging.TopicsSyncTask$ConnectivityChangeReceiver

                        /* renamed from: a, reason: collision with root package name */
                        public o0 f29747a;

                        {
                            this.f29747a = this;
                        }

                        @Override // android.content.BroadcastReceiver
                        public synchronized void onReceive(Context context2, Intent intent) {
                            try {
                                o0 o0Var = this.f29747a;
                                if (o0Var == null) {
                                    return;
                                }
                                if (o0Var.d()) {
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                                    }
                                    o0 o0Var2 = this.f29747a;
                                    o0Var2.f29862f.f29852f.schedule(o0Var2, 0L, TimeUnit.SECONDS);
                                    context2.unregisterReceiver(this);
                                    this.f29747a = null;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }

                        public void registerReceiver() {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Connectivity change received registered");
                            }
                            this.f29748b.f29859b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        }
                    }.registerReceiver();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    n0Var.e(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
