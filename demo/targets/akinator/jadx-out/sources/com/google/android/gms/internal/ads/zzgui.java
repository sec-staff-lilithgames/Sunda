package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgui extends zzguk {
    public static n1 zza(Object obj) {
        return obj == null ? zzgum.zza : new zzgum(obj);
    }

    public static n1 zzb() {
        return zzgum.zza;
    }

    public static n1 zzc(Throwable th2) {
        th2.getClass();
        return new zzgul(th2);
    }

    public static n1 zzd(Callable callable, Executor executor) {
        zzgvh zzgvhVar = new zzgvh(callable);
        executor.execute(zzgvhVar);
        return zzgvhVar;
    }

    public static n1 zze(Runnable runnable, Executor executor) {
        zzgvh zzgvhVarZze = zzgvh.zze(runnable, null);
        executor.execute(zzgvhVarZze);
        return zzgvhVarZze;
    }

    public static n1 zzf(zzgtp zzgtpVar, Executor executor) {
        zzgvh zzgvhVar = new zzgvh(zzgtpVar);
        executor.execute(zzgvhVar);
        return zzgvhVar;
    }

    public static n1 zzg(n1 n1Var, Class cls, zzglu zzgluVar, Executor executor) {
        int i10 = zzgta.zzd;
        zzgsz zzgszVar = new zzgsz(n1Var, cls, zzgluVar);
        n1Var.addListener(zzgszVar, zzguz.zzd(executor, zzgszVar));
        return zzgszVar;
    }

    public static n1 zzh(n1 n1Var, Class cls, zzgtq zzgtqVar, Executor executor) {
        int i10 = zzgta.zzd;
        zzgsy zzgsyVar = new zzgsy(n1Var, cls, zzgtqVar);
        n1Var.addListener(zzgsyVar, zzguz.zzd(executor, zzgsyVar));
        return zzgsyVar;
    }

    public static n1 zzi(n1 n1Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return n1Var.isDone() ? n1Var : zzgve.zze(n1Var, j10, timeUnit, scheduledExecutorService);
    }

    public static n1 zzj(n1 n1Var, zzgtq zzgtqVar, Executor executor) {
        int i10 = zzgth.zzc;
        zzgtf zzgtfVar = new zzgtf(n1Var, zzgtqVar);
        n1Var.addListener(zzgtfVar, zzguz.zzd(executor, zzgtfVar));
        return zzgtfVar;
    }

    public static n1 zzk(n1 n1Var, zzglu zzgluVar, Executor executor) {
        int i10 = zzgth.zzc;
        zzgtg zzgtgVar = new zzgtg(n1Var, zzgluVar);
        n1Var.addListener(zzgtgVar, zzguz.zzd(executor, zzgtgVar));
        return zzgtgVar;
    }

    @SafeVarargs
    public static n1 zzl(n1... n1VarArr) {
        return new zzgtr(zzgpe.zzr(n1VarArr), true);
    }

    public static n1 zzm(Iterable iterable) {
        return new zzgtr(zzgpe.zzp(iterable), true);
    }

    public static zzguh zzn(Iterable iterable) {
        return new zzguh(false, zzgpe.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzguh zzo(n1... n1VarArr) {
        return new zzguh(true, zzgpe.zzr(n1VarArr), null);
    }

    public static zzguh zzp(Iterable iterable) {
        return new zzguh(true, zzgpe.zzp(iterable), null);
    }

    @SafeVarargs
    public static n1 zzq(n1... n1VarArr) {
        return new zzgtr(zzgpe.zzr(n1VarArr), false);
    }

    public static void zzr(n1 n1Var, zzguf zzgufVar, Executor executor) {
        zzgufVar.getClass();
        n1Var.addListener(new zzgug(n1Var, zzgufVar), executor);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgvj.zza(future);
        }
        throw new IllegalStateException(zzgmu.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzgvj.zza(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new zzgty((Error) e10.getCause());
            }
            throw new zzgvi(e10.getCause());
        }
    }
}
