package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkh implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlj zzb;

    public zzkh(zzlj zzljVar, long j10) {
        this.zza = j10;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zzljVar.zzb();
        zzic zzicVar = zzljVar.zzu;
        zzicVar.zzaV().zzj().zza("Resetting analytics data (FE)");
        zzic zzicVar2 = zzljVar.zzu;
        zzoc zzocVarZzh = zzicVar2.zzh();
        zzocVarZzh.zzg();
        zzocVarZzh.zzb.zzc();
        zzicVar2.zzv().zzi();
        boolean z10 = !zzljVar.zzu.zzB();
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzc.zzb(this.zza);
        zzic zzicVar3 = zzhhVarZzd.zzu;
        if (!TextUtils.isEmpty(zzicVar3.zzd().zzq.zza())) {
            zzhhVarZzd.zzq.zzb(null);
        }
        zzhhVarZzd.zzk.zzb(0L);
        zzhhVarZzd.zzl.zzb(0L);
        if (!zzicVar3.zzc().zzt()) {
            zzhhVarZzd.zzn(z10);
        }
        zzhhVarZzd.zzr.zzb(null);
        zzhhVarZzd.zzs.zzb(0L);
        zzhhVarZzd.zzt.zzb(null);
        zzicVar2.zzt().zzB();
        zzicVar2.zzh().zza.zza();
        zzljVar.zzc = z10;
        zzicVar2.zzt().zzC(new AtomicReference());
    }
}
