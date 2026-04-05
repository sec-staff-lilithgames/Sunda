package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class SyncTask implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f29741b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f29742c;

    /* renamed from: e, reason: collision with root package name */
    public final FirebaseMessaging f29743e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f29744f = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public SyncTask f29745a;

        /* renamed from: b, reason: collision with root package name */
        public Context f29746b;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.f29745a = syncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.f29745a;
            if (syncTask != null && syncTask.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                SyncTask syncTask2 = this.f29745a;
                syncTask2.f29743e.getClass();
                FirebaseMessaging.b(syncTask2, 0L);
                Context context2 = this.f29746b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f29745a = null;
            }
        }

        public void registerReceiver() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            SyncTask syncTask = this.f29745a;
            if (syncTask != null) {
                Context context = syncTask.f29743e.f29727b;
                this.f29746b = context;
                context.registerReceiver(this, intentFilter);
            }
        }
    }

    public SyncTask(FirebaseMessaging firebaseMessaging, long j10) {
        this.f29743e = firebaseMessaging;
        this.f29741b = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f29727b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f29742c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29743e.f29727b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f29743e.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock = this.f29742c;
        g0 g0VarA = g0.a();
        FirebaseMessaging firebaseMessaging = this.f29743e;
        if (g0VarA.c(firebaseMessaging.f29727b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f29735j = true;
                }
                if (!firebaseMessaging.f29734i.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f29735j = false;
                    }
                    if (g0.a().c(firebaseMessaging.f29727b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (g0.a().b(firebaseMessaging.f29727b) && !a()) {
                    new ConnectivityChangeReceiver(this).registerReceiver();
                    if (g0.a().c(firebaseMessaging.f29727b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f29735j = false;
                    }
                } else {
                    firebaseMessaging.h(this.f29741b);
                }
                if (g0.a().c(firebaseMessaging.f29727b)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f29735j = false;
                    if (g0.a().c(firebaseMessaging.f29727b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th2) {
            if (g0.a().c(firebaseMessaging.f29727b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
