package com.google.android.gms.common.providers;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface PooledExecutorFactory {
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        try {
            if (zza == null) {
                zza = new zza();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
