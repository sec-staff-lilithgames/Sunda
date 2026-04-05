package com.google.android.gms.internal.consent_sdk;

import a.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcr implements Executor {
    private final ThreadPoolExecutor zzb;
    private final AtomicInteger zza = new AtomicInteger(1);
    private WeakReference zzc = new WeakReference(null);

    public zzcr(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(str2) { // from class: com.google.android.gms.internal.consent_sdk.zzcq
            public final /* synthetic */ String zzb = "Google consent worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zzcr.zza(this.zza, this.zzb, runnable);
            }
        });
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ Thread zza(zzcr zzcrVar, String str, Runnable runnable) {
        Thread thread = new Thread(runnable, b.e(zzcrVar.zza.getAndIncrement(), "Google consent worker #"));
        zzcrVar.zzc = new WeakReference(thread);
        return thread;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.zzc.get()) {
            runnable.run();
        } else {
            this.zzb.execute(runnable);
        }
    }
}
