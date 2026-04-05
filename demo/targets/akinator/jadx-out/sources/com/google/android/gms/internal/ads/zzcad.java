package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcad implements ThreadFactory {
    private final AtomicInteger zza;

    public zzcad(zzcaf zzcafVar) {
        Objects.requireNonNull(zzcafVar);
        this.zza = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new Thread(runnable, o2.l(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
    }
}
