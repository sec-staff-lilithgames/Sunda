package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfdo implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;

    private zzfdo(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
    }

    public static zzfdo zzc(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzfdo(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdm zzb() {
        Context context = (Context) this.zza.zzb();
        zzfhy zzfhyVar = (zzfhy) this.zzb.zzb();
        zzfiq zzfiqVar = (zzfiq) this.zzc.zzb();
        zzcbe zzcbeVarZzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgQ)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z10 = false;
        if (zzcbeVarZzi != null && zzcbeVarZzi.zzi()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhg)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgP)).booleanValue() || z10) {
                zzfip zzfipVarZza = zzfiqVar.zza(zzfig.zzc, context, zzfhyVar, new zzfcp(new zzfco()));
                zzfdd zzfddVar = new zzfdd(new zzfdc());
                zzfic zzficVar = zzfipVarZza.zza;
                zzgus zzgusVar = zzcbv.zza;
                return new zzfct(zzfddVar, new zzfcz(zzficVar, zzgusVar), zzfipVarZza.zzb, zzficVar.zze().zzf, zzgusVar);
            }
        }
        return new zzfdc();
    }
}
