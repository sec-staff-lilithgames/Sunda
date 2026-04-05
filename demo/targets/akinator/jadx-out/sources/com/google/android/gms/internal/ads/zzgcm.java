package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgcm implements zzgdg {
    private final Map zza;
    private final zzauc zzb;
    private final zzgjb zzc;
    private final long zzd;

    public zzgcm(zzauc zzaucVar, Map map, zzfxt zzfxtVar, zzgjd zzgjdVar) {
        this.zza = map;
        this.zzb = zzaucVar;
        this.zzc = zzgjdVar.zza(112);
        this.zzd = zzfxtVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    public final Void zza() throws Exception {
        zzauz zzauzVar;
        try {
            try {
                this.zzc.zza();
                n1 n1Var = (n1) this.zza.get("gs");
                if (n1Var != null && (zzauzVar = (zzauz) n1Var.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzauc zzaucVar = this.zzb;
                    synchronized (zzaucVar) {
                        zzaucVar.zzad(zzauzVar.zzh());
                        zzaucVar.zzN(zzauzVar.zzd());
                    }
                }
            } catch (Throwable th2) {
                this.zzc.zzc();
                throw th2;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e10) {
            this.zzc.zzb(e10);
        }
        this.zzc.zzc();
        return null;
    }
}
