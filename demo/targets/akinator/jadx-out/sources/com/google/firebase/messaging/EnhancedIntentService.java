package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.applovin.impl.ga;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f29716h = 0;

    /* renamed from: c, reason: collision with root package name */
    public r0 f29718c;

    /* renamed from: f, reason: collision with root package name */
    public int f29720f;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f29717b = ((ak.b) ak.c.factory()).newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), ak.d.f4432b);

    /* renamed from: e, reason: collision with root package name */
    public final Object f29719e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public int f29721g = 0;

    public final void a(Intent intent) {
        if (intent != null) {
            p0.a(intent);
        }
        synchronized (this.f29719e) {
            try {
                int i10 = this.f29721g - 1;
                this.f29721g = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f29720f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task c(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29717b.execute(new androidx.browser.customtabs.g(this, 28, intent, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f29718c == null) {
                this.f29718c = new r0(new l(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f29718c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f29717b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f29719e) {
            this.f29720f = i11;
            this.f29721g++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        Task taskC = c(intentB);
        if (taskC.isComplete()) {
            a(intent);
            return 2;
        }
        taskC.addOnCompleteListener(new ga(2), new ao.n(10, this, intent));
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
