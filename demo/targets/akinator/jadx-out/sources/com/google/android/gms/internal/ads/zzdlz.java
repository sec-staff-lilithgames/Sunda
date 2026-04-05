package com.google.android.gms.internal.ads;

import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdlz {
    zzbjj zza;
    zzbjg zzb;
    zzbjw zzc;
    zzbjt zzd;
    zzbor zze;
    final t1 zzf = new t1();
    final t1 zzg = new t1();

    public final zzdlz zza(zzbjj zzbjjVar) {
        this.zza = zzbjjVar;
        return this;
    }

    public final zzdlz zzb(zzbjg zzbjgVar) {
        this.zzb = zzbjgVar;
        return this;
    }

    public final zzdlz zzc(zzbjw zzbjwVar) {
        this.zzc = zzbjwVar;
        return this;
    }

    public final zzdlz zzd(zzbjt zzbjtVar) {
        this.zzd = zzbjtVar;
        return this;
    }

    public final zzdlz zze(zzbor zzborVar) {
        this.zze = zzborVar;
        return this;
    }

    public final zzdlz zzf(String str, zzbjp zzbjpVar, zzbjm zzbjmVar) {
        this.zzf.put(str, zzbjpVar);
        if (zzbjmVar != null) {
            this.zzg.put(str, zzbjmVar);
        }
        return this;
    }

    public final zzdma zzg() {
        return new zzdma(this, null);
    }
}
