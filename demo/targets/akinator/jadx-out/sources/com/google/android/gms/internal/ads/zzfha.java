package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfha {
    private final zzffu zza;
    private final zzffx zzb;
    private final zzfng zzc;
    private final zzfmy zzd;
    private final zzflm zze;
    private final zzcpe zzf;

    public zzfha(zzfng zzfngVar, zzfmy zzfmyVar, zzffu zzffuVar, zzffx zzffxVar, zzcpe zzcpeVar, zzflm zzflmVar) {
        this.zza = zzffuVar;
        this.zzb = zzffxVar;
        this.zzc = zzfngVar;
        this.zzd = zzfmyVar;
        this.zzf = zzcpeVar;
        this.zze = zzflmVar;
    }

    public final void zza(List list, zzdbd zzdbdVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdbdVar);
        }
    }

    public final void zzb(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgui.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlb)).booleanValue() && zzcpe.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgui.zza(str), new zzfgz(this, i10), zzcbv.zza);
        }
    }

    public final void zzc(String str, int i10, zzdbd zzdbdVar) {
        zzffu zzffuVar = this.zza;
        if (zzffuVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i10);
            return;
        }
        this.zzc.zzb(str, zzffuVar.zzax, this.zze, zzdbdVar);
    }
}
