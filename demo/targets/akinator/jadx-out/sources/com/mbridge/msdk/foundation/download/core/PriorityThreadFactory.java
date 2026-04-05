package com.mbridge.msdk.foundation.download.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class PriorityThreadFactory implements ThreadFactory {
    private final int threadPriority;

    public PriorityThreadFactory(int i10) {
        this.threadPriority = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.download.core.PriorityThreadFactory.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(PriorityThreadFactory.this.threadPriority);
                } catch (Throwable unused) {
                }
                try {
                    runnable.run();
                } catch (Exception unused2) {
                }
            }
        });
        thread.setName("mb_download_thread");
        return thread;
    }
}
