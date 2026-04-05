package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgup extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzguo(null);
    private static final Runnable zzb = new zzguo(null);

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgun zzgunVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzgun)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgunVar = (zzgun) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(zzgunVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th2) {
                    try {
                        zzgva.zza(th2);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strO;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strO = "running=[DONE]";
        } else if (runnable instanceof zzgun) {
            strO = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strO = a.b.o(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, C3191e4.i.f36531e);
        } else {
            strO = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        return a.b.o(new StringBuilder(strO.length() + 2 + String.valueOf(strZzc).length()), strO, ", ", strZzc);
    }

    public abstract Object zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(Object obj);

    public abstract void zzg(Throwable th2);

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgun zzgunVar = new zzgun(this, null);
            zzgunVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzgunVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }
}
