package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzffd implements zzguf {
    final /* synthetic */ zzepi zza;
    final /* synthetic */ zzflm zzb;
    final /* synthetic */ zzflc zzc;
    final /* synthetic */ zzffg zzd;
    final /* synthetic */ zzffh zze;

    public zzffd(zzffh zzffhVar, zzepi zzepiVar, zzflm zzflmVar, zzflc zzflcVar, zzffg zzffgVar) {
        this.zza = zzepiVar;
        this.zzb = zzflmVar;
        this.zzc = zzflcVar;
        this.zzd = zzffgVar;
        Objects.requireNonNull(zzffhVar);
        this.zze = zzffhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzflm zzflmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgq)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th2);
        }
        zzffh zzffhVar = this.zze;
        zzdrn zzdrnVar = (zzdrn) zzffhVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdrnVar == null ? zzfhp.zzb(th2, null) : zzdrnVar.zza().zzg(th2);
        synchronized (zzffhVar) {
            try {
                if (zzdrnVar != null) {
                    zzdrnVar.zze().zzdN(zzeVarZzb);
                    zzffhVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffc
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze.zzg().zzdN(zzeVarZzb);
                        }
                    });
                } else {
                    zzffhVar.zzg().zzdN(zzeVarZzb);
                    zzffhVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfhk.zza(zzeVarZzb.zza, th2, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbgn.zzc.zze()).booleanValue() || (zzflmVar = this.zzb) == null) {
                    zzflp zzflpVarZzi = zzffhVar.zzi();
                    zzflc zzflcVar = this.zzc;
                    zzflcVar.zzh(zzeVarZzb);
                    zzflcVar.zzj(th2);
                    zzflcVar.zzd(false);
                    zzflpVarZzi.zzb(zzflcVar.zzm());
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
        zzffh zzffhVar = this.zze;
        zzdri zzdriVar = (zzdri) obj;
        synchronized (zzffhVar) {
            if (zzdriVar != null) {
                try {
                    zzdriVar.zzt();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzdriVar.zzq().zzd(zzffhVar.zzg());
            this.zza.zzb(zzdriVar);
            Executor executorZzf = zzffhVar.zzf();
            final zzfey zzfeyVarZzg = zzffhVar.zzg();
            Objects.requireNonNull(zzfeyVarZzg);
            executorZzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfeyVarZzg.zzg();
                }
            });
            zzffhVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbgn.zzc.zze()).booleanValue() || (zzflmVar = this.zzb) == null) {
                zzflp zzflpVarZzi = zzffhVar.zzi();
                zzflc zzflcVar = this.zzc;
                zzflcVar.zzg(zzdriVar.zzr().zzb);
                zzflcVar.zzi(zzdriVar.zzn().zze());
                zzflcVar.zzd(true);
                zzflpVarZzi.zzb(zzflcVar.zzm());
            } else {
                zzflmVar.zze(zzdriVar.zzr().zzb);
                zzflmVar.zzg(zzdriVar.zzn().zze());
                zzflc zzflcVar2 = this.zzc;
                zzflcVar2.zzd(true);
                zzflmVar.zza(zzflcVar2);
                zzflmVar.zzh();
            }
        }
    }
}
