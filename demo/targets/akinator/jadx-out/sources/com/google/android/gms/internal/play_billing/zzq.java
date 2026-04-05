package com.google.android.gms.internal.play_billing;

import a.b;
import com.ironsource.C3191e4;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p0.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzq implements zzeu {
    static final zzf zzb;
    public static final /* synthetic */ int zzf = 0;
    private static final Object zzh;
    volatile Object zzc;
    volatile zzj zzd;
    volatile zzo zze;
    static final boolean zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger zzg = Logger.getLogger(zzq.class.getName());

    static {
        zzf zznVar;
        try {
            zznVar = new zzl(AtomicReferenceFieldUpdater.newUpdater(zzo.class, Thread.class, "zzb"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzo.class, "zzc"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, zzo.class, "zze"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, zzj.class, "zzd"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, Object.class, "zzc"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zznVar = new zzn();
        }
        Throwable th3 = th;
        zzb = zznVar;
        if (th3 != null) {
            zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
        zzh = new Object();
    }

    public static void zzc(zzq zzqVar) {
        zzo zzoVar;
        zzj zzjVar;
        do {
            zzoVar = zzqVar.zze;
        } while (!zzb.zze(zzqVar, zzoVar, zzo.zza));
        while (zzoVar != null) {
            Thread thread = zzoVar.zzb;
            if (thread != null) {
                zzoVar.zzb = null;
                LockSupport.unpark(thread);
            }
            zzoVar = zzoVar.zzc;
        }
        do {
            zzjVar = zzqVar.zzd;
        } while (!zzb.zzc(zzqVar, zzjVar, zzj.zza));
        zzj zzjVar2 = null;
        while (zzjVar != null) {
            zzj zzjVar3 = zzjVar.zzd;
            zzjVar.zzd = zzjVar2;
            zzjVar2 = zzjVar;
            zzjVar = zzjVar3;
        }
        while (zzjVar2 != null) {
            Runnable runnable = zzjVar2.zzb;
            zzj zzjVar4 = zzjVar2.zzd;
            if (runnable instanceof zzm) {
                throw null;
            }
            zzf(runnable, zzjVar2.zzc);
            zzjVar2 = zzjVar4;
        }
    }

    private final void zze(StringBuilder sb2) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append(C3191e4.i.f36531e);
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(v10 == this ? "this future" : String.valueOf(v10));
        sb2.append(C3191e4.i.f36531e);
    }

    private static void zzf(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", b.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    private final void zzg(zzo zzoVar) {
        zzoVar.zzb = null;
        while (true) {
            zzo zzoVar2 = this.zze;
            if (zzoVar2 != zzo.zza) {
                zzo zzoVar3 = null;
                while (zzoVar2 != null) {
                    zzo zzoVar4 = zzoVar2.zzc;
                    if (zzoVar2.zzb != null) {
                        zzoVar3 = zzoVar2;
                    } else if (zzoVar3 != null) {
                        zzoVar3.zzc = zzoVar4;
                        if (zzoVar3.zzb == null) {
                            break;
                        }
                    } else if (!zzb.zze(this, zzoVar2, zzoVar4)) {
                        break;
                    }
                    zzoVar2 = zzoVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzh(Object obj) throws ExecutionException {
        if (obj instanceof zzg) {
            Throwable th2 = ((zzg) obj).zzc;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzi) {
            throw new ExecutionException(((zzi) obj).zza);
        }
        if (obj == zzh) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.zzc;
        if ((obj instanceof zzm) | (obj == null)) {
            zzg zzgVar = zza ? new zzg(z10, new CancellationException("Future.cancel() was called.")) : z10 ? zzg.zza : zzg.zzb;
            while (!zzb.zzd(this, obj, zzgVar)) {
                obj = this.zzc;
                if (!(obj instanceof zzm)) {
                }
            }
            zzc(this);
            if (obj instanceof zzm) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.zzc;
        if ((obj2 != null) && (!(obj2 instanceof zzm))) {
            return zzh(obj2);
        }
        zzo zzoVar = this.zze;
        if (zzoVar != zzo.zza) {
            zzo zzoVar2 = new zzo();
            do {
                zzf zzfVar = zzb;
                zzfVar.zza(zzoVar2, zzoVar);
                if (zzfVar.zze(this, zzoVar, zzoVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzg(zzoVar2);
                            throw new InterruptedException();
                        }
                        obj = this.zzc;
                    } while (!((obj != null) & (!(obj instanceof zzm))));
                    return zzh(obj);
                }
                zzoVar = this.zze;
            } while (zzoVar != zzo.zza);
        }
        return zzh(this.zzc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc instanceof zzg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.zzc != null) & (!(r0 instanceof zzm));
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.zzc instanceof zzg) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zze(sb2);
        } else {
            try {
                strConcat = zza();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                i.h(sb2, "PENDING, info=[", strConcat, C3191e4.i.f36531e);
            } else if (isDone()) {
                zze(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (this.zzc instanceof zzm) {
            return "setFuture=[null]";
        }
        if (this instanceof ScheduledFuture) {
            return o2.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        executor.getClass();
        zzj zzjVar = this.zzd;
        if (zzjVar != zzj.zza) {
            zzj zzjVar2 = new zzj(runnable, executor);
            do {
                zzjVar2.zzd = zzjVar;
                if (zzb.zzc(this, zzjVar, zzjVar2)) {
                    return;
                } else {
                    zzjVar = this.zzd;
                }
            } while (zzjVar != zzj.zza);
        }
        zzf(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzh;
        }
        if (!zzb.zzd(this, null, obj)) {
            return false;
        }
        zzc(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.zzc;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof zzm))) {
                return zzh(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzo zzoVar = this.zze;
                if (zzoVar != zzo.zza) {
                    zzo zzoVar2 = new zzo();
                    do {
                        zzf zzfVar = zzb;
                        zzfVar.zza(zzoVar2, zzoVar);
                        if (zzfVar.zze(this, zzoVar, zzoVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.zzc;
                                    if ((obj2 != null) & (!(obj2 instanceof zzm))) {
                                        return zzh(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzg(zzoVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzg(zzoVar2);
                        } else {
                            zzoVar = this.zze;
                        }
                    } while (zzoVar != zzo.zza);
                }
                return zzh(this.zzc);
            }
            while (nanos > 0) {
                Object obj3 = this.zzc;
                if ((obj3 != null) & (!(obj3 instanceof zzm))) {
                    return zzh(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(i.d(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
