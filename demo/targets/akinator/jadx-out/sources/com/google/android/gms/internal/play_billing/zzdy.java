package com.google.android.gms.internal.play_billing;

import a.b;
import com.ironsource.C3191e4;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import sun.misc.Unsafe;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzdy<V> extends zzfi implements zzeu<V> {
    static final boolean zza;
    static final zzet zzb;
    private static final zza zzc;
    private static final Object zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    abstract class zza {
        public /* synthetic */ zza(zzeb zzebVar) {
        }

        public abstract zzd zza(zzdy zzdyVar, zzd zzdVar);

        public abstract zzk zzb(zzdy zzdyVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzdy zzdyVar, Object obj, Object obj2);

        public abstract boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzdy.zza) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z10, Throwable th2) {
            this.zzc = z10;
            this.zzd = th2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.play_billing.zzdy.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, zzk> zzc;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzdy<?>, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzdyVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzdyVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2) {
            return zzdz.zza(this.zzd, zzdyVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzf(zzdy zzdyVar, Object obj, Object obj2) {
            return zzdz.zza(this.zze, zzdyVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2) {
            return zzdz.zza(this.zzc, zzdyVar, zzkVar, zzkVar2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzf<V> implements Runnable {
        final zzdy<V> zza;
        final zzeu<? extends V> zzb;

        public zzf(zzdy zzdyVar, zzeu zzeuVar) {
            this.zza = zzdyVar;
            this.zzb = zzeuVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdy) this.zza).value != this) {
                return;
            }
            zzeu<? extends V> zzeuVar = this.zzb;
            if (zzdy.zzc.zzf(this.zza, this, zzdy.zzr(zzeuVar))) {
                zzdy.zzw(this.zza, false);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzdyVar) {
                try {
                    zzdVar2 = zzdyVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzdyVar.listeners = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzdyVar) {
                try {
                    zzkVar2 = zzdyVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzdyVar.waiters = zzkVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdyVar) {
                try {
                    if (zzdyVar.listeners != zzdVar) {
                        return false;
                    }
                    zzdyVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzf(zzdy zzdyVar, Object obj, Object obj2) {
            synchronized (zzdyVar) {
                try {
                    if (zzdyVar.value != obj) {
                        return false;
                    }
                    zzdyVar.value = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzdyVar) {
                try {
                    if (zzdyVar.waiters != zzkVar) {
                        return false;
                    }
                    zzdyVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ zzg(zzeb zzebVar) {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    interface zzh<V> extends zzeu<V> {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    abstract class zzi<V> extends zzdy<V> implements zzh<V> {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.play_billing.zzdy.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzdy.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField(LinkHeader.Rel.Next));
                zza = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private zzj() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzd zza(zzdy zzdyVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzdyVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzdyVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final zzk zzb(zzdy zzdyVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzdyVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzdyVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zze(zzdy zzdyVar, zzd zzdVar, zzd zzdVar2) {
            return zzea.zza(zza, zzdyVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzf(zzdy zzdyVar, Object obj, Object obj2) {
            return zzea.zza(zza, zzdyVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzdy.zza
        public final boolean zzg(zzdy zzdyVar, zzk zzkVar, zzk zzkVar2) {
            return zzea.zza(zza, zzdyVar, zzc, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzj(zzeb zzebVar) {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk(boolean z10) {
        }

        public zzk() {
            zzdy.zzc.zzd(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th2;
        zza zzgVar;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zza = z10;
        zzb = new zzet(zzdy.class);
        zzeb zzebVar = null;
        try {
            zzgVar = new zzj(zzebVar);
            th2 = null;
            th3 = null;
        } catch (Error | Exception e10) {
            try {
                th2 = null;
                th3 = e10;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, LinkHeader.Rel.Next), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdy.class, Object.class, "value"));
            } catch (Error | Exception e11) {
                th2 = e11;
                zzgVar = new zzg(zzebVar);
                th3 = e10;
            }
        }
        zzc = zzgVar;
        if (th2 != null) {
            zzet zzetVar = zzb;
            Logger loggerZza = zzetVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzetVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        zzd = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzr(zzeu zzeuVar) {
        Throwable thZzh;
        if (zzeuVar instanceof zzh) {
            Object zzbVar = ((zzdy) zzeuVar).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th2 = zzbVar2.zzd;
                    zzbVar = th2 != null ? new zzb(false, th2) : zzb.zzb;
                }
            }
            Objects.requireNonNull(zzbVar);
            return zzbVar;
        }
        if ((zzeuVar instanceof zzfi) && (thZzh = ((zzfi) zzeuVar).zzh()) != null) {
            return new zzc(thZzh);
        }
        boolean zIsCancelled = zzeuVar.isCancelled();
        if ((!zza) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            Objects.requireNonNull(zzbVar3);
            return zzbVar3;
        }
        try {
            Object objZzs = zzs(zzeuVar);
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzeuVar)))) : objZzs == null ? zzd : objZzs;
        } catch (Error | Exception e10) {
            return new zzc(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzeuVar)), e11)) : new zzb(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzeuVar)), e12)) : new zzc(e12.getCause());
        }
    }

    private static Object zzs(Future future) throws ExecutionException {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzt(StringBuilder sb2) {
        try {
            Object objZzs = zzs(this);
            sb2.append("SUCCESS, result=[");
            if (objZzs == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (objZzs == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzs.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzs)));
            }
            sb2.append(C3191e4.i.f36531e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(C3191e4.i.f36531e);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.value
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.android.gms.internal.play_billing.zzdy$zzf r1 = (com.google.android.gms.internal.play_billing.zzdy.zzf) r1
            com.google.android.gms.internal.play_billing.zzeu<? extends V> r1 = r1.zzb
            r5.zzv(r6, r1)
            r6.append(r3)
            goto L48
        L21:
            java.lang.String r1 = r5.zzg()     // Catch: java.lang.StackOverflowError -> L30 java.lang.Exception -> L32
            r2 = 0
            if (r1 == 0) goto L2e
            boolean r4 = r1.isEmpty()     // Catch: java.lang.StackOverflowError -> L30 java.lang.Exception -> L32
            if (r4 == 0) goto L41
        L2e:
            r1 = r2
            goto L41
        L30:
            r1 = move-exception
            goto L33
        L32:
            r1 = move-exception
        L33:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L41:
            if (r1 == 0) goto L48
            java.lang.String r2 = ", info=["
            w0.i.h(r6, r2, r1, r3)
        L48:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L58
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.zzt(r6)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdy.zzu(java.lang.StringBuilder):void");
    }

    private final void zzv(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception e10) {
            e = e10;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzdy zzdyVar, boolean z10) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            for (zzk zzkVarZzb = zzc.zzb(zzdyVar, zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
                Thread thread = zzkVarZzb.thread;
                if (thread != null) {
                    zzkVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzdyVar.zzm();
            zzd zzdVar3 = zzdVar2;
            zzd zzdVarZza = zzc.zza(zzdyVar, zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zzdVarZza != null) {
                zzd zzdVar5 = zzdVarZza.next;
                zzdVarZza.next = zzdVar4;
                zzdVar4 = zzdVarZza;
                zzdVarZza = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzdyVar = zzfVar.zza;
                    if (zzdyVar.value == zzfVar) {
                        if (zzc.zzf(zzdyVar, zzfVar, zzr(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    Objects.requireNonNull(executor);
                    zzx(runnable2, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzx(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", b.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    private final void zzy(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzc.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzz(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th2 = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzd) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.play_billing.zzdy.zza
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.play_billing.zzdy$zzb r1 = new com.google.android.gms.internal.play_billing.zzdy$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.play_billing.zzdy$zzb r1 = com.google.android.gms.internal.play_billing.zzdy.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.play_billing.zzdy$zzb r1 = com.google.android.gms.internal.play_billing.zzdy.zzb.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.play_billing.zzdy$zza r6 = com.google.android.gms.internal.play_billing.zzdy.zzc
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzw(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            if (r4 == 0) goto L57
            com.google.android.gms.internal.play_billing.zzdy$zzf r0 = (com.google.android.gms.internal.play_billing.zzdy.zzf) r0
            com.google.android.gms.internal.play_billing.zzeu<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzh
            if (r4 == 0) goto L54
            r4 = r0
            com.google.android.gms.internal.play_billing.zzdy r4 = (com.google.android.gms.internal.play_billing.zzdy) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.zzdy.zzf
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdy.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzz(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzc;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzy(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzz(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzz(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof zzf));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.value instanceof zzb) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzt(sb2);
        } else {
            zzu(sb2);
        }
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzbe.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzx(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzg() {
        if (this instanceof ScheduledFuture) {
            return o2.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Throwable zzh() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final boolean zzn(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzc.zzf(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public final boolean zzo(Throwable th2) {
        if (!zzc.zzf(this, null, new zzc(th2))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public final boolean zzp(zzeu zzeuVar) {
        zzc zzcVar;
        Object obj = this.value;
        if (obj == null) {
            if (zzeuVar.isDone()) {
                if (!zzc.zzf(this, null, zzr(zzeuVar))) {
                    return false;
                }
                zzw(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, zzeuVar);
            if (zzc.zzf(this, null, zzfVar)) {
                try {
                    zzeuVar.zzb(zzfVar, zzed.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        zzcVar = new zzc(th2);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzc.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzeuVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzq() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public void zzm() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzz(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    do {
                        zza zzaVar = zzc;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzz(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzy(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzy(zzkVar2);
                        } else {
                            zzkVar = this.waiters;
                        }
                    } while (zzkVar != zzk.zza);
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzz(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzz(obj4);
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
