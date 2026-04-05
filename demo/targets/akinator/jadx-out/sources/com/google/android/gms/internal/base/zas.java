package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zas implements zaq {
    private zas() {
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zaa(ThreadFactory threadFactory, int i10) {
        return zac(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zab(int i10, int i11) {
        return zac(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zac(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public /* synthetic */ zas(zar zarVar) {
    }
}
