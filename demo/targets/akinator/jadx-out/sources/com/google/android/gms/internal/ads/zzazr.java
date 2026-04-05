package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzazr implements Callable {
    protected final zzayd zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzauc zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzazr(zzayd zzaydVar, String str, String str2, zzauc zzaucVar, int i10, int i11) {
        this.zza = zzaydVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaucVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            zzayd zzaydVar = this.zza;
            Method methodZzo = zzaydVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo == null) {
                return null;
            }
            zza();
            zzawu zzawuVarZzh = zzaydVar.zzh();
            if (zzawuVarZzh == null || (i10 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzawuVarZzh.zza(this.zzg, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
