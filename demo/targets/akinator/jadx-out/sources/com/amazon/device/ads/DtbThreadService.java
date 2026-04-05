package com.amazon.device.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbThreadService {
    public static final long SCHEDULE_INTERVAL = 10;
    public static final DtbThreadService threadServiceInstance = new DtbThreadService();
    public ScheduledExecutorService scheduler;
    public boolean shutdownInProgress = false;
    public final ExecutorService executor = Executors.newFixedThreadPool(1);

    public DtbThreadService() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.device.ads.DtbThreadService.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the fixed thread pool");
                DtbThreadService.this.executor.shutdown();
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.device.ads.DtbThreadService.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DtbThreadService.threadServiceInstance.shutdownInProgress = true;
                DtbLog.debug("App is shutting down, terminating the thread pool");
                if (DtbThreadService.this.scheduler != null) {
                    DtbThreadService.this.scheduler.shutdown();
                }
            }
        });
    }

    public static void executeOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static DtbThreadService getInstance() {
        return threadServiceInstance;
    }

    private void handleError(InternalError internalError) {
        internalError.getLocalizedMessage().contains("shutdown");
        throw internalError;
    }

    public void execute(Runnable runnable) {
        try {
            if (this.shutdownInProgress) {
                return;
            }
            this.executor.execute(runnable);
        } catch (InternalError e10) {
            handleError(e10);
        }
    }

    public void schedule(Runnable runnable) {
        try {
            if (this.shutdownInProgress) {
                return;
            }
            if (this.scheduler == null) {
                this.scheduler = Executors.newScheduledThreadPool(1);
            }
            this.scheduler.schedule(runnable, 10L, TimeUnit.SECONDS);
        } catch (InternalError e10) {
            handleError(e10);
        }
    }
}
