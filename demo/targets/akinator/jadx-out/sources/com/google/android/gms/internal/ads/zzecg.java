package com.google.android.gms.internal.ads;

import java.util.Map;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzecg implements zzeci {
    private final Map zza;
    private final zzgus zzb;
    private final zzdbs zzc;

    public zzecg(Map map, zzgus zzgusVar, zzdbs zzdbsVar) {
        this.zza = map;
        this.zzb = zzgusVar;
        this.zzc = zzdbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final n1 zza(final zzbxj zzbxjVar) {
        this.zzc.zzdT(zzbxjVar);
        n1 n1VarZzc = zzgui.zzc(new zzdzv(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjc)).split(",")) {
            final zzifw zzifwVar = (zzifw) this.zza.get(str.trim());
            if (zzifwVar != null) {
                n1VarZzc = zzgui.zzh(n1VarZzc, zzdzv.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzecf
                    @Override // com.google.android.gms.internal.ads.zzgtq
                    public final /* synthetic */ n1 zza(Object obj) {
                        return ((zzeci) zzifwVar.zzb()).zza(zzbxjVar);
                    }
                }, this.zzb);
            }
        }
        zzgui.zzr(n1VarZzc, new zzece(this), zzcbv.zzg);
        return n1VarZzc;
    }

    public final /* synthetic */ zzdbs zzb() {
        return this.zzc;
    }
}
