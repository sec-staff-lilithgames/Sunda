package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f29884b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f29885c;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f29886e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f29887f;

    /* renamed from: g, reason: collision with root package name */
    public r0 f29888g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29889h;

    public t0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f29887f = new ArrayDeque();
        this.f29889h = false;
        Context applicationContext = context.getApplicationContext();
        this.f29884b = applicationContext;
        this.f29885c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f29886e = scheduledThreadPoolExecutor;
    }

    public final synchronized void m() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f29887f.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                r0 r0Var = this.f29888g;
                if (r0Var == null || !r0Var.isBinderAlive()) {
                    o();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f29888g.a((s0) this.f29887f.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task n(Intent intent) {
        s0 s0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            s0Var = new s0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f29886e;
            s0Var.f29878b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new af.g(scheduledThreadPoolExecutor.schedule(new a2.s(s0Var, 22), 20L, TimeUnit.SECONDS), 12));
            this.f29887f.add(s0Var);
            m();
        } catch (Throwable th2) {
            throw th2;
        }
        return s0Var.f29878b.getTask();
    }

    public final void o() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f29889h);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f29889h) {
            return;
        }
        this.f29889h = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (ConnectionTracker.getInstance().bindService(this.f29884b, this.f29885c, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f29889h = false;
        while (true) {
            ArrayDeque arrayDeque = this.f29887f;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((s0) arrayDeque.poll()).f29878b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f29889h = false;
            if (iBinder instanceof r0) {
                this.f29888g = (r0) iBinder;
                m();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f29887f;
            while (!arrayDeque.isEmpty()) {
                ((s0) arrayDeque.poll()).f29878b.trySetResult(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m();
    }
}
