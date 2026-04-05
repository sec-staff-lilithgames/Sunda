package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfba implements zzguf {
    final /* synthetic */ zzepi zza;
    final /* synthetic */ zzflm zzb;
    final /* synthetic */ zzflc zzc;
    final /* synthetic */ zzfbb zzd;
    final /* synthetic */ zzfbe zze;

    public zzfba(zzfbe zzfbeVar, zzepi zzepiVar, zzflm zzflmVar, zzflc zzflcVar, zzfbb zzfbbVar) {
        this.zza = zzepiVar;
        this.zzb = zzflmVar;
        this.zzc = zzflcVar;
        this.zzd = zzfbbVar;
        Objects.requireNonNull(zzfbeVar);
        this.zze = zzfbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzflm zzflmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgq)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th2);
        }
        zzfbe zzfbeVar = this.zze;
        zzcqq zzcqqVar = (zzcqq) zzfbeVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcqqVar == null ? zzfhp.zzb(th2, null) : zzcqqVar.zza().zzg(th2);
        synchronized (zzfbeVar) {
            try {
                zzfbeVar.zzl(null);
                if (zzcqqVar != null) {
                    zzcqqVar.zze().zzdN(zzeVarZzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzja)).booleanValue()) {
                        zzfbeVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaz
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze.zzi().zzdN(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    zzfbeVar.zzi().zzdN(zzeVarZzb);
                    ((zzcqq) zzfbeVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfhk.zza(zzeVarZzb.zza, th2, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbgn.zzc.zze()).booleanValue() || (zzflmVar = this.zzb) == null) {
                    zzflp zzflpVarZzk = zzfbeVar.zzk();
                    zzflc zzflcVar = this.zzc;
                    zzflcVar.zzh(zzeVarZzb);
                    zzflcVar.zzj(th2);
                    zzflcVar.zzd(false);
                    zzflpVarZzk.zzb(zzflcVar.zzm());
                } else {
                    zzflmVar.zzf(zzeVarZzb);
                    zzflc zzflcVar2 = this.zzc;
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
        zzfbe zzfbeVar = this.zze;
        zzcto zzctoVar = (zzcto) obj;
        synchronized (zzfbeVar) {
            if (zzctoVar != null) {
                try {
                    zzctoVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzfbeVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzja)).booleanValue()) {
                zzctoVar.zzq().zzc(zzfbeVar.zzi());
            }
            this.zza.zzb(zzctoVar);
            if (!((Boolean) zzbgn.zzc.zze()).booleanValue() || (zzflmVar = this.zzb) == null) {
                zzflp zzflpVarZzk = zzfbeVar.zzk();
                zzflc zzflcVar = this.zzc;
                zzflcVar.zzg(zzctoVar.zzr().zzb);
                zzflcVar.zzi(zzctoVar.zzn().zze());
                zzflcVar.zzd(true);
                zzflpVarZzk.zzb(zzflcVar.zzm());
            } else {
                zzflmVar.zze(zzctoVar.zzr().zzb);
                zzflmVar.zzg(zzctoVar.zzn().zze());
                zzflc zzflcVar2 = this.zzc;
                zzflcVar2.zzd(true);
                zzflmVar.zza(zzflcVar2);
                zzflmVar.zzh();
            }
        }
    }
}
