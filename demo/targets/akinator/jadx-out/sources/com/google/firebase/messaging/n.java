package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.ga;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f29841c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static t0 f29842d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29843a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f29844b;

    public n(Context context) {
        this.f29843a = context;
        this.f29844b = new ga(2);
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        t0 t0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f29841c) {
            try {
                if (f29842d == null) {
                    f29842d = new t0(context);
                }
                t0Var = f29842d;
            } finally {
            }
        }
        if (!z10) {
            return t0Var.n(intent).continueWith(new ga(2), new com.google.android.gms.internal.ads.a(9));
        }
        if (g0.a().c(context)) {
            synchronized (p0.f29867b) {
                try {
                    if (p0.f29868c == null) {
                        WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                        p0.f29868c = wakeLock;
                        wakeLock.setReferenceCounted(true);
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        p0.f29868c.acquire(p0.f29866a);
                    }
                    t0Var.n(intent).addOnCompleteListener(new af.g(intent, 10));
                } finally {
                }
            }
        } else {
            t0Var.n(intent);
        }
        return Tasks.forResult(-1);
    }

    public static void reset() {
        synchronized (f29841c) {
            f29842d = null;
        }
    }

    public static void setServiceConnection(t0 t0Var) {
        synchronized (f29841c) {
            f29842d = t0Var;
        }
    }

    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.f29843a, intent);
    }

    public Task<Integer> startMessagingService(Context context, Intent intent) {
        boolean z10 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        m mVar = new m(0, context, intent);
        Executor executor = this.f29844b;
        return Tasks.call(executor, mVar).continueWithTask(executor, new com.applovin.impl.sdk.ad.g(z11, context, intent));
    }

    public n(Context context, ExecutorService executorService) {
        this.f29843a = context;
        this.f29844b = executorService;
    }
}
