package com.google.android.gms.analytics;

import a.b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzo implements ThreadFactory {
    private static final AtomicInteger zza = new AtomicInteger();

    private zzo() {
        throw null;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new zzp(runnable, b.e(zza.incrementAndGet(), "measurement-"));
    }

    public /* synthetic */ zzo(zzq zzqVar) {
    }
}
