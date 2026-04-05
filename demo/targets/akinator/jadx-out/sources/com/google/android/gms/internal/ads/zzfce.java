package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfce implements zzguf {
    final /* synthetic */ zzflm zza;
    final /* synthetic */ zzflc zzb;
    final /* synthetic */ zzcsl zzc;
    final /* synthetic */ zzfci zzd;

    public zzfce(zzfci zzfciVar, zzflm zzflmVar, zzflc zzflcVar, zzcsl zzcslVar) {
        this.zza = zzflmVar;
        this.zzb = zzflcVar;
        this.zzc = zzcslVar;
        Objects.requireNonNull(zzfciVar);
        this.zzd = zzfciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzflm zzflmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgq)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th2);
        }
        zzfci zzfciVar = this.zzd;
        synchronized (zzfciVar) {
            try {
                zzcsl zzcslVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzeVarZzg = zzcslVar.zzc().zzg(th2);
                zzfciVar.zzs(zzeVarZzg);
                zzcslVar.zzb().zzdN(zzeVarZzg);
                zzfhk.zza(zzeVarZzg.zza, th2, "BannerAdLoader.onFailure");
                if (zzfciVar.zzr()) {
                    zzfciVar.zzn();
                    zzfciVar.zzo().zzd(zzfciVar.zzq().zzc());
                }
                if (!((Boolean) zzbgn.zzc.zze()).booleanValue() || (zzflmVar = this.zza) == null) {
                    zzflp zzflpVarZzp = zzfciVar.zzp();
                    zzflc zzflcVar = this.zzb;
                    zzflcVar.zzh(zzeVarZzg);
                    zzflcVar.zzj(th2);
                    zzflcVar.zzd(false);
                    zzflpVarZzp.zzb(zzflcVar.zzm());
                } else {
                    zzflmVar.zzf(zzeVarZzg);
                    zzflc zzflcVar2 = this.zzb;
                    zzflcVar2.zzj(th2);
                    zzflcVar2.zzd(false);
                    zzflmVar.zza(zzflcVar2);
                    zzflmVar.zzh();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflm zzflmVar;
        zzfci zzfciVar = this.zzd;
        zzcrg zzcrgVar = (zzcrg) obj;
        synchronized (zzfciVar) {
            if (zzcrgVar != null) {
                try {
                    zzcrgVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zzfciVar.zzr()) {
                zzfciVar.zzc();
            }
            if (!((Boolean) zzbgn.zzc.zze()).booleanValue() || (zzflmVar = this.zza) == null) {
                zzflp zzflpVarZzp = zzfciVar.zzp();
                zzflc zzflcVar = this.zzb;
                zzflcVar.zzg(zzcrgVar.zzr().zzb);
                zzflcVar.zzi(zzcrgVar.zzn().zze());
                zzflcVar.zzd(true);
                zzflpVarZzp.zzb(zzflcVar.zzm());
            } else {
                zzflmVar.zze(zzcrgVar.zzr().zzb);
                zzflmVar.zzg(zzcrgVar.zzn().zze());
                zzflc zzflcVar2 = this.zzb;
                zzflcVar2.zzd(true);
                zzflmVar.zza(zzflcVar2);
                zzflmVar.zzh();
            }
        }
    }
}
