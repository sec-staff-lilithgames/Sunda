package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkt implements Runnable {
    final /* synthetic */ zzaz zza;
    final /* synthetic */ zzlj zzb;

    public zzkt(zzlj zzljVar, zzaz zzazVar) {
        this.zza = zzazVar;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzlj zzljVar = this.zzb;
        zzic zzicVar = zzljVar.zzu;
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        zzaz zzazVarZzj = zzhhVarZzd.zzj();
        zzaz zzazVar = this.zza;
        if (!zzjl.zzu(zzazVar.zzb(), zzazVarZzj.zzb())) {
            zzicVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzazVar.zzb()));
            return;
        }
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("dma_consent_settings", zzazVar.zze());
        editorEdit.apply();
        zzicVar.zzaV().zzk().zzb("Setting DMA consent(FE)", zzazVar);
        zzic zzicVar3 = zzljVar.zzu;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzl();
        } else {
            zzicVar3.zzt().zzj(false);
        }
    }
}
