package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class DefaultExecutorSupplier implements ExecutorSupplier {
    private int DEFAULT_MAX_NUM_THREADS;
    private final ThreadPoolExecutor backgroundExecutor;
    private final ThreadPoolExecutor downloadResultExecutor;
    private final DownloadExecutor networkExecutor;

    public DefaultExecutorSupplier() {
        this.DEFAULT_MAX_NUM_THREADS = 10;
        g gVarB = h.b().b(c.m().b());
        if (gVarB != null) {
            int iM = gVarB.M();
            this.DEFAULT_MAX_NUM_THREADS = iM;
            if (iM <= 0) {
                this.DEFAULT_MAX_NUM_THREADS = 10;
            }
        }
        DownloadExecutor downloadExecutor = new DownloadExecutor(this.DEFAULT_MAX_NUM_THREADS, new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.networkExecutor = downloadExecutor;
        if (this.DEFAULT_MAX_NUM_THREADS > 0) {
            downloadExecutor.allowCoreThreadTimeOut(true);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.backgroundExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.downloadResultExecutor = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getBackgroundTasks() {
        return this.backgroundExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getDownloadResultTasks() {
        return this.downloadResultExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public DownloadExecutor getDownloadTasks() {
        return this.networkExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getLruCacheThreadTasks() {
        return this.backgroundExecutor;
    }
}
