package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeax {
    private final ScheduledExecutorService zza;
    private final zzgus zzb;
    private final zzgus zzc;
    private final zzebw zzd;
    private final zzifb zze;

    public zzeax(ScheduledExecutorService scheduledExecutorService, zzgus zzgusVar, zzgus zzgusVar2, zzebw zzebwVar, zzifb zzifbVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgusVar;
        this.zzc = zzgusVar2;
        this.zzd = zzebwVar;
        this.zze = zzifbVar;
    }

    public final n1 zza(final zzbxj zzbxjVar) {
        n1 n1VarSubmit;
        String str = zzbxjVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzG(str)) {
            n1VarSubmit = zzgui.zzc(new zzecj(1));
        } else {
            n1VarSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzia)).booleanValue() || ((Boolean) zzbhf.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbxjVar);
                }
            }) : this.zzd.zza(zzbxjVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgua) zzgui.zzh((zzgua) zzgui.zzi(zzgua.zzw(n1VarSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgi)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeaw
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzb(zzbxjVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ n1 zzb(final zzbxj zzbxjVar, int i10, Throwable th2) {
        Bundle bundle;
        if (zzbxjVar != null && (bundle = zzbxjVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgui.zzj(((zzeea) this.zze.zzb()).zzk(zzbxjVar, i10), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return zzgui.zza(new zzeck((InputStream) obj, zzbxjVar));
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzeck zzc(zzbxj zzbxjVar) {
        return (zzeck) this.zzd.zza(zzbxjVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgi)).intValue(), TimeUnit.SECONDS);
    }
}
