package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzenv extends com.google.android.gms.ads.internal.client.zzbs {
    final zzfgm zza;
    final zzdlz zzb;
    private final Context zzc;
    private final zzcjn zzd;
    private com.google.android.gms.ads.internal.client.zzbk zze;

    public zzenv(zzcjn zzcjnVar, Context context, String str) {
        zzfgm zzfgmVar = new zzfgm();
        this.zza = zzfgmVar;
        this.zzb = new zzdlz();
        this.zzd = zzcjnVar;
        zzfgmVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq zze() {
        zzdma zzdmaVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdmaVarZzg.zzh();
        zzfgm zzfgmVar = this.zza;
        zzfgmVar.zzm(arrayListZzh);
        zzfgmVar.zzn(zzdmaVarZzg.zzi());
        if (zzfgmVar.zzf() == null) {
            zzfgmVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzenw(this.zzc, this.zzd, zzfgmVar, zzdmaVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbjg zzbjgVar) {
        this.zzb.zzb(zzbjgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzbjj zzbjjVar) {
        this.zzb.zza(zzbjjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzbjp zzbjpVar, zzbjm zzbjmVar) {
        this.zzb.zzf(str, zzbjpVar, zzbjmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbhx zzbhxVar) {
        this.zza.zzo(zzbhxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbjt zzbjtVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbjtVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbjw zzbjwVar) {
        this.zzb.zzc(zzbjwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzboi zzboiVar) {
        this.zza.zzq(zzboiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbor zzborVar) {
        this.zzb.zze(zzborVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zza.zzX(zzcsVar);
    }
}
