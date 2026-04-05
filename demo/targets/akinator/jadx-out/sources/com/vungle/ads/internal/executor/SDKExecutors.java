package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SDKExecutors implements Executors {
    public static final Companion Companion = new Companion(null);
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;
    private VungleThreadPoolExecutor API_EXECUTOR;
    private VungleThreadPoolExecutor BACKGROUND_EXECUTOR;
    private VungleThreadPoolExecutor DOWNLOADER_EXECUTOR;
    private VungleThreadPoolExecutor IO_EXECUTOR;
    private VungleThreadPoolExecutor JOB_EXECUTOR;
    private VungleThreadPoolExecutor LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES;
    private VungleThreadPoolExecutor OFFLOAD_EXECUTOR;
    private VungleThreadPoolExecutor UA_EXECUTOR;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public SDKExecutors() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.NUMBER_OF_CORES = iAvailableProcessors;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new VungleThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 5L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_jr"));
        this.IO_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_io"));
        this.API_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_api"));
        this.LOGGER_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_logger"));
        this.BACKGROUND_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_background"));
        this.UA_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new VungleThreadPoolExecutor(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new NamedThreadFactory("vng_down"));
        this.OFFLOAD_EXECUTOR = new VungleThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new NamedThreadFactory("vng_ol"));
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getApiExecutor() {
        return this.API_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getBackgroundExecutor() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getDownloaderExecutor() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getIoExecutor() {
        return this.IO_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getJobExecutor() {
        return this.JOB_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getLoggerExecutor() {
        return this.LOGGER_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getOffloadExecutor() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override // com.vungle.ads.internal.executor.Executors
    public VungleThreadPoolExecutor getUaExecutor() {
        return this.UA_EXECUTOR;
    }
}
