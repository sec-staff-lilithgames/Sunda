package com.mbridge.msdk.foundation.download.core;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface ExecutorSupplier {
    ExecutorService getBackgroundTasks();

    ExecutorService getDownloadResultTasks();

    DownloadExecutor getDownloadTasks();

    ExecutorService getLruCacheThreadTasks();
}
