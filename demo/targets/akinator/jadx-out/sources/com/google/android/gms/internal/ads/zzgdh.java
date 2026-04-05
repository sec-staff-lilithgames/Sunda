package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgdh implements zzgdg {
    private final String zza;
    private final String zzb;
    private final zzgcd zzc;
    private final zzauc zzd;
    private final zzgjb zze;

    public zzgdh(String str, String str2, zzauc zzaucVar, zzgcd zzgcdVar, zzgjb zzgjbVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzaucVar;
        this.zzc = zzgcdVar;
        this.zze = zzgjbVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th2) {
            try {
                this.zze.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                this.zze.zzc();
                throw th3;
            }
        }
    }

    public abstract void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException;
}
